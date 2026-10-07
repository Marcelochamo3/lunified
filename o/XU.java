package o;

import j$.lang.Iterable$EL;
import j$.time.Duration;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
final class XU extends RU {
    private static final int k;
    private static final int l;
    private static final SecureRandom m;

    @Generated
    private static final CL j = DL.d(XU.class);
    private static final Queue<a> n = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Queue<a> f616o = new ConcurrentLinkedQueue();

    public static class a implements RU.a {
        private final int a;
        private final byte[] b;
        private final int c;
        private final long d;
        private final DatagramChannel e;
        private final CompletableFuture<byte[]> f;

        @Generated
        public a(int i, byte[] bArr, int i2, long j, DatagramChannel datagramChannel, CompletableFuture<byte[]> completableFuture) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = j;
            this.e = datagramChannel;
            this.f = completableFuture;
        }

        public static /* synthetic */ void d(a aVar, Exception exc) {
            aVar.f(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Exception exc) {
            h();
            this.f.completeExceptionally(exc);
        }

        private void h() {
            try {
                this.e.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    this.e.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                this.e.close();
            } catch (IOException unused3) {
            }
        }

        @Override // o.RU.a
        public void a(SelectionKey selectionKey) {
            if (!selectionKey.isReadable()) {
                f(new EOFException(AbstractC1701hf0.g(new StringBuilder("Key for transaction "), this.a, " is not readable")));
                XU.f616o.remove(this);
                return;
            }
            DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.c);
            try {
                int i = datagramChannel.read(byteBufferAllocate);
                if (i <= 0) {
                    throw new EOFException();
                }
                byteBufferAllocate.flip();
                byte[] bArr = new byte[i];
                System.arraycopy(byteBufferAllocate.array(), 0, bArr, 0, i);
                RU.n("UDP read: transaction id=" + this.a, datagramChannel.socket().getLocalSocketAddress(), datagramChannel.socket().getRemoteSocketAddress(), bArr);
                h();
                this.f.complete(bArr);
                XU.f616o.remove(this);
            } catch (IOException e) {
                f(e);
                XU.f616o.remove(this);
            }
        }

        public void g() throws IOException {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.b);
            RU.n("UDP write: transaction id=" + this.a, this.e.socket().getLocalSocketAddress(), this.e.socket().getRemoteSocketAddress(), this.b);
            DatagramChannel datagramChannel = this.e;
            int iSend = datagramChannel.send(byteBufferWrap, datagramChannel.socket().getRemoteSocketAddress());
            if (iSend == 0) {
                throw new EOFException("Insufficient room for the datagram in the underlying output buffer for transaction " + this.a);
            }
            if (iSend >= this.b.length) {
                return;
            }
            throw new EOFException("Could not send all data for transaction " + this.a);
        }
    }

    static {
        int i;
        int i2;
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            i = 32768;
            i2 = 60999;
        } else {
            i = 49152;
            i2 = AQ.w;
        }
        int iIntValue = Integer.getInteger("dnsjava.udp.ephemeral.start", i).intValue();
        k = iIntValue;
        l = Integer.getInteger("dnsjava.udp.ephemeral.end", i2).intValue() - iIntValue;
        if (Boolean.getBoolean("dnsjava.udp.ephemeral.use_ephemeral_port")) {
            m = null;
        } else {
            m = new SecureRandom();
        }
        RU.l(new UU(3), false);
        RU.m(new UU(4), false);
        RU.j(new UU(5), false);
    }

    @Generated
    private XU() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t() {
        Iterator<a> it = f616o.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d - System.nanoTime() < 0) {
                next.f(new SocketTimeoutException("Query timed out"));
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u() {
        n.clear();
        EOFException eOFException = new EOFException("Client is closing");
        Queue<a> queue = f616o;
        Iterable$EL.forEach(queue, new WU(0, eOFException));
        queue.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w() {
        while (true) {
            Queue<a> queue = n;
            if (queue.isEmpty()) {
                return;
            }
            a aVarRemove = queue.remove();
            try {
                j.s(Integer.valueOf(aVarRemove.a), "Registering OP_READ for transaction with id {}");
                aVarRemove.e.register(RU.i(), 1, aVarRemove);
                aVarRemove.g();
            } catch (IOException e) {
                aVarRemove.f(e);
            }
        }
    }

    public static CompletableFuture<byte[]> x(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, AQ aq, byte[] bArr, int i, Duration duration) {
        InetSocketAddress inetSocketAddress3;
        SecureRandom secureRandom;
        long nanos = duration.toNanos() + System.nanoTime();
        CompletableFuture<byte[]> completableFutureJ = AbstractC3197x0.j();
        DatagramChannel datagramChannel = null;
        try {
            Selector selectorI = RU.i();
            DatagramChannel datagramChannelOpen = DatagramChannel.open();
            int i2 = 0;
            try {
                datagramChannelOpen.configureBlocking(false);
                a aVar = new a(aq.k().k(), bArr, i, nanos, datagramChannelOpen, completableFutureJ);
                if (inetSocketAddress == null || inetSocketAddress.getPort() == 0) {
                    while (true) {
                        if (i2 >= 1024) {
                            aVar.f(new IOException("No available source port found"));
                            return completableFutureJ;
                        }
                        try {
                            if (inetSocketAddress == null) {
                                SecureRandom secureRandom2 = m;
                                inetSocketAddress3 = secureRandom2 != null ? new InetSocketAddress(secureRandom2.nextInt(l) + k) : null;
                            } else {
                                int port = inetSocketAddress.getPort();
                                if (port == 0 && (secureRandom = m) != null) {
                                    port = secureRandom.nextInt(l) + k;
                                }
                                inetSocketAddress3 = new InetSocketAddress(inetSocketAddress.getAddress(), port);
                            }
                            datagramChannelOpen.bind((SocketAddress) inetSocketAddress3);
                            break;
                        } catch (SocketException unused) {
                            i2++;
                        }
                    }
                }
                datagramChannelOpen.connect(inetSocketAddress2);
                f616o.add(aVar);
                n.add(aVar);
                selectorI.wakeup();
            } catch (IOException e) {
                e = e;
                datagramChannel = datagramChannelOpen;
                if (datagramChannel != null) {
                    try {
                        datagramChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                completableFutureJ.completeExceptionally(e);
            }
        } catch (IOException e2) {
            e = e2;
        }
        return completableFutureJ;
    }
}
