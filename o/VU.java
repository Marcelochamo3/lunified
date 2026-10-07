package o;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
final class VU extends RU {

    @Generated
    private static final CL j = DL.d(VU.class);
    private static final Queue<b> k = new ConcurrentLinkedQueue();
    private static final Map<a, b> l = new ConcurrentHashMap();

    public static class a {
        final InetSocketAddress a;
        final InetSocketAddress b;

        @Generated
        public a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
            this.a = inetSocketAddress;
            this.b = inetSocketAddress2;
        }

        @Generated
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        @Generated
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            InetSocketAddress inetSocketAddress = this.a;
            InetSocketAddress inetSocketAddress2 = aVar.a;
            if (inetSocketAddress != null ? !inetSocketAddress.equals(inetSocketAddress2) : inetSocketAddress2 != null) {
                return false;
            }
            InetSocketAddress inetSocketAddress3 = this.b;
            InetSocketAddress inetSocketAddress4 = aVar.b;
            return inetSocketAddress3 != null ? inetSocketAddress3.equals(inetSocketAddress4) : inetSocketAddress4 == null;
        }

        @Generated
        public int hashCode() {
            InetSocketAddress inetSocketAddress = this.a;
            int iHashCode = inetSocketAddress == null ? 43 : inetSocketAddress.hashCode();
            InetSocketAddress inetSocketAddress2 = this.b;
            return ((iHashCode + 59) * 59) + (inetSocketAddress2 != null ? inetSocketAddress2.hashCode() : 43);
        }
    }

    public static class b implements RU.a {
        final SocketChannel a;
        final Queue<c> b = new ConcurrentLinkedQueue();
        ByteBuffer c = ByteBuffer.allocate(2);
        ByteBuffer d = ByteBuffer.allocate(AQ.w);
        int e = 0;

        @Generated
        public b(SocketChannel socketChannel) {
            this.a = socketChannel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(IOException iOException) {
            d(iOException);
            for (Map.Entry entry : VU.l.entrySet()) {
                if (entry.getValue() == this) {
                    VU.l.remove(entry.getKey());
                    try {
                        this.a.close();
                        return;
                    } catch (IOException e) {
                        VU.j.A("Failed to close channel l={}/r={}", ((a) entry.getKey()).a, ((a) entry.getKey()).b, e);
                        return;
                    }
                }
            }
        }

        private void e(SelectionKey selectionKey) {
            try {
                this.a.finishConnect();
                selectionKey.interestOps(4);
            } catch (IOException e) {
                c(e);
            }
        }

        private void f() {
            try {
                if (this.e == 0) {
                    if (this.a.read(this.c) < 0) {
                        c(new EOFException());
                        return;
                    } else if (this.c.position() == 2) {
                        int i = ((this.c.get(0) & 255) << 8) + (this.c.get(1) & 255);
                        this.c.flip();
                        this.d.limit(i);
                        this.e = 1;
                    }
                }
                if (this.a.read(this.d) < 0) {
                    c(new EOFException());
                    return;
                }
                if (this.d.hasRemaining()) {
                    return;
                }
                this.e = 0;
                this.d.flip();
                int iLimit = this.d.limit();
                byte[] bArr = new byte[iLimit];
                System.arraycopy(this.d.array(), this.d.arrayOffset(), bArr, 0, this.d.limit());
                if (iLimit < 2) {
                    RU.n("TCP read: response too short for a valid reply, discarding", this.a.socket().getLocalSocketAddress(), this.a.socket().getRemoteSocketAddress(), bArr);
                    return;
                }
                int i2 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                RU.n(AbstractC1674hK.n(i2, "TCP read: transaction id="), this.a.socket().getLocalSocketAddress(), this.a.socket().getRemoteSocketAddress(), bArr);
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (i2 == next.a.k().k()) {
                        next.e.complete(bArr);
                        it.remove();
                        return;
                    }
                }
                VU.j.y(Integer.valueOf(i2), "Transaction for answer to id {} not found");
            } catch (IOException e) {
                c(e);
            }
        }

        private void g(SelectionKey selectionKey) {
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                try {
                    next.d();
                } catch (IOException e) {
                    next.e.completeExceptionally(e);
                    it.remove();
                }
            }
            selectionKey.interestOps(1);
        }

        @Override // o.RU.a
        public void a(SelectionKey selectionKey) {
            if (selectionKey.isValid()) {
                if (selectionKey.isConnectable()) {
                    e(selectionKey);
                    return;
                }
                if (selectionKey.isWritable()) {
                    g(selectionKey);
                }
                if (selectionKey.isReadable()) {
                    f();
                }
            }
        }

        public void d(IOException iOException) {
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().e.completeExceptionally(iOException);
                it.remove();
            }
        }
    }

    public static class c {
        private final AQ a;
        private final byte[] b;
        private final long c;
        private final SocketChannel d;
        private final CompletableFuture<byte[]> e;
        private boolean f;

        @Generated
        public c(AQ aq, byte[] bArr, long j, SocketChannel socketChannel, CompletableFuture<byte[]> completableFuture) {
            this.a = aq;
            this.b = bArr;
            this.c = j;
            this.d = socketChannel;
            this.e = completableFuture;
        }

        public void d() throws EOFException {
            if (this.f) {
                return;
            }
            RU.n("TCP write: transaction id=" + this.a.k().k(), this.d.socket().getLocalSocketAddress(), this.d.socket().getRemoteSocketAddress(), this.b);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.b.length + 2);
            byteBufferAllocate.put((byte) (this.b.length >>> 8));
            byteBufferAllocate.put((byte) (this.b.length & 255));
            byteBufferAllocate.put(this.b);
            byteBufferAllocate.flip();
            while (byteBufferAllocate.hasRemaining()) {
                long jWrite = this.d.write(byteBufferAllocate);
                if (jWrite == 0) {
                    throw new EOFException("Insufficient room for the data in the underlying output buffer for transaction " + this.a.k().k());
                }
                if (jWrite < this.b.length) {
                    throw new EOFException("Could not write all data for transaction " + this.a.k().k());
                }
            }
            this.f = true;
        }
    }

    static {
        RU.l(new UU(0), true);
        RU.m(new UU(1), true);
        RU.j(new UU(2), true);
    }

    @Generated
    private VU() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static CompletableFuture<byte[]> A(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, AQ aq, byte[] bArr, Duration duration) {
        int i = 0;
        CompletableFuture<byte[]> completableFutureJ = AbstractC3197x0.j();
        try {
            Selector selectorI = RU.i();
            long jNanoTime = System.nanoTime() + duration.toNanos();
            b bVar = (b) j$.util.Map.EL.computeIfAbsent(l, new a(inetSocketAddress, inetSocketAddress2), new TU(inetSocketAddress, inetSocketAddress2, completableFutureJ, i));
            if (bVar != null) {
                j.u("Creating transaction for id {} ({}/{})", Integer.valueOf(aq.k().k()), aq.n().v(), C3080vp0.e(aq.n().y()));
                bVar.b.add(new c(aq, bArr, jNanoTime, bVar.a, completableFutureJ));
                k.add(bVar);
                selectorI.wakeup();
            }
        } catch (IOException e) {
            completableFutureJ.completeExceptionally(e);
        }
        return completableFutureJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v() {
        Iterator<b> it = l.values().iterator();
        while (it.hasNext()) {
            Iterator<c> it2 = it.next().b.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                if (next.c - System.nanoTime() < 0) {
                    next.e.completeExceptionally(new SocketTimeoutException("Query timed out"));
                    it2.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w() {
        k.clear();
        EOFException eOFException = new EOFException("Client is closing");
        Map<a, b> map = l;
        j$.util.Map.EL.forEach(map, new SU(0, eOFException));
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b y(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, CompletableFuture completableFuture, a aVar) {
        SocketChannel socketChannelOpen;
        j.R(inetSocketAddress, inetSocketAddress2, "Opening async channel for l={}/r={}");
        try {
            socketChannelOpen = SocketChannel.open();
            try {
                socketChannelOpen.configureBlocking(false);
                if (inetSocketAddress != null) {
                    socketChannelOpen.bind((SocketAddress) inetSocketAddress);
                }
                socketChannelOpen.connect(inetSocketAddress2);
                return new b(socketChannelOpen);
            } catch (IOException e) {
                e = e;
                if (socketChannelOpen != null) {
                    try {
                        socketChannelOpen.close();
                    } catch (IOException unused) {
                    }
                }
                completableFuture.completeExceptionally(e);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            socketChannelOpen = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z() {
        while (true) {
            Queue<b> queue = k;
            if (queue.isEmpty()) {
                return;
            }
            b bVarRemove = queue.remove();
            try {
                Selector selectorI = RU.i();
                if (bVarRemove.a.isConnected()) {
                    bVarRemove.a.keyFor(selectorI).interestOps(4);
                } else {
                    bVarRemove.a.register(selectorI, 8, bVarRemove);
                }
            } catch (IOException e) {
                bVarRemove.c(e);
            }
        }
    }
}
