package o;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class Gy0 {
    static final int d = 1;
    static final int e = 2;
    Map<Integer, C0388Ea> a;
    Map<C2848tT, wy0> b;
    Map<C2848tT, C1511fi0> c;

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Gy0(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList<InetAddress> arrayList2 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        if (arrayList.isEmpty()) {
                            arrayList.add(53);
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2.add(C1062b2.e("0.0.0.0"));
                        }
                        for (InetAddress inetAddress : arrayList2) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Integer) it.next()).intValue();
                                q(inetAddress, iIntValue);
                                o(inetAddress, iIntValue);
                                PrintStream printStream = System.out;
                                r(inetAddress, iIntValue);
                                printStream.getClass();
                            }
                        }
                        System.out.getClass();
                        return;
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line);
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken = stringTokenizer.nextToken();
                        if (stringTokenizer.hasMoreTokens()) {
                            byte b = 0;
                            if (strNextToken.charAt(0) != '#') {
                                switch (strNextToken.hashCode()) {
                                    case -1147692044:
                                        if (strNextToken.equals("address")) {
                                            b = 5;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -817598092:
                                        if (strNextToken.equals("secondary")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case -314765822:
                                        if (!strNextToken.equals("primary")) {
                                            b = -1;
                                        }
                                        break;
                                    case 106079:
                                        if (strNextToken.equals("key")) {
                                            b = 3;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 3446913:
                                        if (strNextToken.equals("port")) {
                                            b = 4;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 94416770:
                                        if (strNextToken.equals("cache")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                if (b == 0) {
                                    k(stringTokenizer.nextToken(), stringTokenizer.nextToken());
                                } else if (b == 1) {
                                    n(stringTokenizer.nextToken(), stringTokenizer.nextToken());
                                } else if (b == 2) {
                                    this.a.put(1, new C0388Ea(stringTokenizer.nextToken()));
                                } else if (b == 3) {
                                    String strNextToken2 = stringTokenizer.nextToken();
                                    String strNextToken3 = stringTokenizer.nextToken();
                                    if (stringTokenizer.hasMoreTokens()) {
                                        p(strNextToken2, strNextToken3, stringTokenizer.nextToken());
                                    } else {
                                        p("hmac-md5", strNextToken2, strNextToken3);
                                    }
                                } else if (b == 4) {
                                    arrayList.add(Integer.valueOf(stringTokenizer.nextToken()));
                                } else if (b != 5) {
                                    System.out.getClass();
                                } else {
                                    arrayList2.add(C1062b2.e(stringTokenizer.nextToken()));
                                }
                            }
                        } else {
                            System.out.getClass();
                        }
                    }
                }
            } finally {
                bufferedReader.close();
            }
        } catch (Exception unused) {
            System.out.getClass();
        }
    }

    public static void D(String[] strArr) {
        if (strArr.length > 1) {
            System.out.getClass();
            System.exit(0);
        }
        try {
            new Gy0(strArr.length == 1 ? strArr[0] : "jnamed.conf");
        } catch (IOException | xy0 unused) {
            System.out.getClass();
        }
    }

    private void e(AQ aq, int i) {
        f(aq, 1, i);
        f(aq, 2, i);
    }

    private void f(AQ aq, int i, int i2) {
        Iterator<H50> it = aq.q(i).iterator();
        while (it.hasNext()) {
            C2848tT c2848tTS = it.next().s();
            if (c2848tTS != null) {
                i(aq, c2848tTS, i2);
            }
        }
    }

    private void h(AQ aq, C0388Ea c0388Ea, C2848tT c2848tT) {
        Gc0 gc0Y = c0388Ea.y(c2848tT, 2, 0);
        if (gc0Y.h()) {
            Iterator<H50> it = gc0Y.e().q().iterator();
            while (it.hasNext()) {
                aq.b(it.next(), 2);
            }
        }
    }

    private void i(AQ aq, C2848tT c2848tT, int i) {
        X40 x40W = w(c2848tT, 1, 1, true);
        if (x40W == null) {
            return;
        }
        l(c2848tT, aq, x40W, 3, i);
    }

    private void j(AQ aq, wy0 wy0Var, int i) {
        X40 x40T = wy0Var.t();
        l(x40T.o(), aq, x40T, 2, i);
    }

    private void m(AQ aq, wy0 wy0Var) {
        aq.b(wy0Var.v(), 2);
    }

    private static String r(InetAddress inetAddress, int i) {
        return inetAddress.getHostAddress() + "#" + i;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void A(InetAddress inetAddress, int i) {
        try {
            ServerSocket serverSocket = new ServerSocket(i, 128, inetAddress);
            while (true) {
                try {
                    new Thread(new O3(this, 25, serverSocket.accept())).start();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            serverSocket.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        } catch (IOException e2) {
            PrintStream printStream = System.out;
            r(inetAddress, i);
            e2.toString();
            printStream.getClass();
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void B(InetAddress inetAddress, int i) {
        byte[] bArrX;
        try {
            DatagramSocket datagramSocket = new DatagramSocket(i, inetAddress);
            try {
                byte[] bArr = new byte[512];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 512);
                DatagramPacket datagramPacket2 = null;
                while (true) {
                    datagramPacket.setLength(512);
                    try {
                        datagramSocket.receive(datagramPacket);
                        try {
                            bArrX = y(new AQ(bArr), bArr, null);
                            if (bArrX != null) {
                                if (datagramPacket2 == null) {
                                    datagramPacket2 = new DatagramPacket(bArrX, bArrX.length, datagramPacket.getAddress(), datagramPacket.getPort());
                                } else {
                                    datagramPacket2.setData(bArrX);
                                    datagramPacket2.setLength(bArrX.length);
                                    datagramPacket2.setAddress(datagramPacket.getAddress());
                                    datagramPacket2.setPort(datagramPacket.getPort());
                                }
                                datagramSocket.send(datagramPacket2);
                            }
                        } catch (IOException unused) {
                            bArrX = x(bArr);
                        }
                    } catch (InterruptedIOException unused2) {
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e2) {
            PrintStream printStream = System.out;
            r(inetAddress, i);
            e2.toString();
            printStream.getClass();
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void C(Socket socket) {
        byte[] bArrX;
        try {
            InputStream inputStream = socket.getInputStream();
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
                dataInputStream.readFully(bArr);
                try {
                    bArrX = y(new AQ(bArr), bArr, socket);
                    if (bArrX == null) {
                        if (inputStream != null) {
                            inputStream.close();
                            return;
                        }
                        return;
                    }
                } catch (IOException unused) {
                    bArrX = x(bArr);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeShort(bArrX.length);
                dataOutputStream.write(bArrX);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e2) {
            PrintStream printStream = System.out;
            r(socket.getLocalAddress(), socket.getLocalPort());
            e2.toString();
            printStream.getClass();
        }
    }

    public byte g(AQ aq, C2848tT c2848tT, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 > 6) {
            return (byte) 0;
        }
        if (i == 24 || i == 46) {
            i5 = i4 | 2;
            i6 = 255;
        } else {
            i5 = i4;
            i6 = i;
        }
        wy0 wy0VarV = v(c2848tT);
        Gc0 gc0Q = wy0VarV != null ? wy0VarV.q(c2848tT, i6) : z(i2).y(c2848tT, i6, 3);
        if (gc0Q.l()) {
            h(aq, z(i2), c2848tT);
        }
        if (gc0Q.i()) {
            aq.k().w(3);
            if (wy0VarV != null) {
                m(aq, wy0VarV);
                if (i3 == 0) {
                    aq.k().t(5);
                }
            }
            return (byte) 3;
        }
        if (gc0Q.j()) {
            if (wy0VarV == null) {
                return (byte) 0;
            }
            m(aq, wy0VarV);
            if (i3 != 0) {
                return (byte) 0;
            }
            aq.k().t(5);
            return (byte) 0;
        }
        if (gc0Q.h()) {
            X40 x40E = gc0Q.e();
            l(x40E.o(), aq, x40E, 2, i5);
            return (byte) 0;
        }
        if (gc0Q.f()) {
            C3243xa c3243xaC = gc0Q.c();
            l(c2848tT, aq, new X40(c3243xaC), 1, i5);
            if (wy0VarV != null && i3 == 0) {
                aq.k().t(5);
            }
            return g(aq, c3243xaC.W(), i6, i2, i3 + 1, i5);
        }
        if (gc0Q.g()) {
            C0448Gi c0448GiD = gc0Q.d();
            l(c2848tT, aq, new X40(c0448GiD), 1, i5);
            try {
                C2848tT c2848tTL = c2848tT.l(c0448GiD);
                l(c2848tT, aq, new X40(new C3243xa(c2848tT, i2, 0L, c2848tTL)), 1, i5);
                if (wy0VarV != null && i3 == 0) {
                    aq.k().t(5);
                }
                return g(aq, c2848tTL, i6, i2, i3 + 1, i5);
            } catch (C2945uT unused) {
                return (byte) 6;
            }
        }
        if (!gc0Q.k()) {
            return (byte) 0;
        }
        Iterator<X40> it = gc0Q.b().iterator();
        while (it.hasNext()) {
            l(c2848tT, aq, it.next(), 1, i5);
        }
        if (wy0VarV == null) {
            h(aq, z(i2), c2848tT);
            return (byte) 0;
        }
        j(aq, wy0VarV, i5);
        if (i3 != 0) {
            return (byte) 0;
        }
        aq.k().t(5);
        return (byte) 0;
    }

    public void k(String str, String str2) {
        wy0 wy0Var = new wy0(str != null ? C2848tT.n(str, C2848tT.v) : null, str2);
        this.b.put(wy0Var.u(), wy0Var);
    }

    public void l(C2848tT c2848tT, AQ aq, X40 x40, int i, int i2) {
        for (int i3 = 1; i3 <= i; i3++) {
            if (aq.e(c2848tT, x40.getType(), i3)) {
                return;
            }
        }
        if ((i2 & 2) == 0) {
            for (H50 h50T : x40.q()) {
                if (h50T.v().r() && !c2848tT.r()) {
                    h50T = h50T.T(c2848tT);
                }
                aq.b(h50T, i);
            }
        }
        if ((i2 & 3) != 0) {
            for (W40 w40T : x40.s()) {
                if (w40T.v().r() && !c2848tT.r()) {
                    w40T = w40T.T(c2848tT);
                }
                aq.b(w40T, i);
            }
        }
    }

    public void n(String str, String str2) {
        C2848tT c2848tTN = C2848tT.n(str, C2848tT.v);
        this.b.put(c2848tTN, new wy0(c2848tTN, 1, str2));
    }

    public void o(InetAddress inetAddress, int i) {
        new Thread(new Fy0(this, inetAddress, i, 0)).start();
    }

    public void p(String str, String str2, String str3) {
        this.c.put(C2848tT.n(str2, C2848tT.v), new C1511fi0(str, str2, str3));
    }

    public void q(InetAddress inetAddress, int i) {
        new Thread(new Fy0(this, inetAddress, i, 1)).start();
    }

    public byte[] s(C1763iB c1763iB, int i, H50 h50) {
        AQ aq = new AQ();
        aq.F(c1763iB);
        for (int i2 = 0; i2 < 4; i2++) {
            aq.z(i2);
        }
        if (i == 2) {
            aq.b(h50, 0);
        }
        c1763iB.w(i);
        return aq.L();
    }

    public byte[] t(C2848tT c2848tT, AQ aq, C1511fi0 c1511fi0, C1609gi0 c1609gi0, Socket socket) {
        wy0 wy0Var = this.b.get(c2848tT);
        if (wy0Var == null) {
            return u(aq, 5);
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            int iK = aq.k().k();
            Iterator<X40> itC = wy0Var.c();
            C1609gi0 c1609gi0T = c1609gi0;
            boolean z = true;
            while (itC.hasNext()) {
                X40 next = itC.next();
                AQ aq2 = new AQ(iK);
                C1763iB c1763iBK = aq2.k();
                c1763iBK.t(0);
                c1763iBK.t(5);
                l(next.o(), aq2, next, 1, 1);
                if (c1511fi0 != null) {
                    c1511fi0.n(aq2, c1609gi0T, z);
                    c1609gi0T = aq2.t();
                }
                byte[] bArrL = aq2.L();
                dataOutputStream.writeShort(bArrL.length);
                dataOutputStream.write(bArrL);
                z = false;
            }
        } catch (IOException unused) {
            System.out.getClass();
        }
        try {
            socket.close();
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    public byte[] u(AQ aq, int i) {
        return s(aq.k(), i, aq.n());
    }

    public wy0 v(C2848tT c2848tT) {
        wy0 wy0Var = this.b.get(c2848tT);
        if (wy0Var != null) {
            return wy0Var;
        }
        int iS = c2848tT.s();
        for (int i = 1; i < iS; i++) {
            wy0 wy0Var2 = this.b.get(new C2848tT(c2848tT, i));
            if (wy0Var2 != null) {
                return wy0Var2;
            }
        }
        return null;
    }

    public X40 w(C2848tT c2848tT, int i, int i2, boolean z) {
        wy0 wy0VarV = v(c2848tT);
        if (wy0VarV != null) {
            return wy0VarV.o(c2848tT, i);
        }
        C0388Ea c0388EaZ = z(i2);
        List<X40> listK = z ? c0388EaZ.k(c2848tT, i) : c0388EaZ.m(c2848tT, i);
        if (listK == null) {
            return null;
        }
        return listK.get(0);
    }

    public byte[] x(byte[] bArr) {
        try {
            return s(new C1763iB(bArr), 1, null);
        } catch (IOException unused) {
            return null;
        }
    }

    public byte[] y(AQ aq, byte[] bArr, Socket socket) {
        C1511fi0 c1511fi0;
        int iMax;
        C1763iB c1763iBK = aq.k();
        if (c1763iBK.g(0)) {
            return null;
        }
        if (c1763iBK.n() != 0) {
            return u(aq, 1);
        }
        if (c1763iBK.m() != 0) {
            return u(aq, 4);
        }
        H50 h50N = aq.n();
        C1609gi0 c1609gi0T = aq.t();
        if (c1609gi0T != null) {
            C1511fi0 c1511fi1 = this.c.get(c1609gi0T.v());
            if (c1511fi1 == null || c1511fi1.F(aq, bArr, null) != 0) {
                return x(bArr);
            }
            c1511fi0 = c1511fi1;
        } else {
            c1511fi0 = null;
        }
        C3141wV c3141wVM = aq.m();
        if (socket != null) {
            iMax = AQ.w;
        } else {
            iMax = c3141wVM != null ? Math.max(c3141wVM.Y(), 512) : 512;
        }
        int i = (c3141wVM == null || (c3141wVM.V() & 32768) == 0) ? 0 : 1;
        AQ aq2 = new AQ(aq.k().k());
        aq2.k().t(0);
        if (aq.k().g(7)) {
            aq2.k().t(7);
        }
        aq2.b(h50N, 0);
        C2848tT c2848tTV = h50N.v();
        int iY = h50N.y();
        int iT = h50N.t();
        if (iY == 252 && socket != null) {
            return t(c2848tTV, aq, c1511fi0, c1609gi0T, socket);
        }
        if (!C3080vp0.c(iY) && iY != 255) {
            return u(aq, 4);
        }
        int i2 = i;
        byte bG = g(aq2, c2848tTV, iY, iT, 0, i2);
        if (bG != 0 && bG != 3) {
            return u(aq, bG);
        }
        e(aq2, i2);
        if (c3141wVM != null) {
            aq2.b(new C3141wV(C1672hI.a.f, bG, 0, i2 == 1 ? 32768 : 0), 3);
        }
        aq2.I(c1511fi0, 0, c1609gi0T);
        return aq2.M(iMax);
    }

    public C0388Ea z(int i) {
        return (C0388Ea) j$.util.Map.EL.computeIfAbsent(this.a, Integer.valueOf(i), new C2504ps(17));
    }
}
