package o;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: o.nq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2307nq0 extends S7 {
    public final int p;
    public final byte[] q;
    public final DatagramPacket r;
    public Uri s;
    public DatagramSocket t;
    public MulticastSocket u;
    public InetAddress v;
    public boolean w;
    public int x;

    public C2307nq0() {
        super(true);
        this.p = 8000;
        byte[] bArr = new byte[2000];
        this.q = bArr;
        this.r = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C2210mq0 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.x;
        DatagramPacket datagramPacket = this.r;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.t;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.x = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new C2210mq0(2002, e);
            } catch (IOException e2) {
                throw new C2210mq0(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.x;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.q, length2 - i4, bArr, i, iMin);
        this.x -= iMin;
        return iMin;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        this.s = null;
        MulticastSocket multicastSocket = this.u;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.v;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.u = null;
        }
        DatagramSocket datagramSocket = this.t;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.t = null;
        }
        this.v = null;
        this.x = 0;
        if (this.w) {
            this.w = false;
            c();
        }
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C2210mq0 {
        Uri uri = c2970uj.a;
        this.s = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.s.getPort();
        e();
        try {
            this.v = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.v, port);
            if (this.v.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.u = multicastSocket;
                multicastSocket.joinGroup(this.v);
                this.t = this.u;
            } else {
                this.t = new DatagramSocket(inetSocketAddress);
            }
            this.t.setSoTimeout(this.p);
            this.w = true;
            f(c2970uj);
            return -1L;
        } catch (IOException e) {
            throw new C2210mq0(2001, e);
        } catch (SecurityException e2) {
            throw new C2210mq0(2006, e2);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.s;
    }
}
