package o;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes.dex */
class Wh0 implements AutoCloseable {
    private final long l = System.nanoTime();
    private final Duration m;
    private final SelectionKey n;

    public Wh0(Duration duration) throws Throwable {
        Selector selectorOpen;
        this.m = duration;
        SocketChannel socketChannelOpen = SocketChannel.open();
        try {
            selectorOpen = Selector.open();
            try {
                socketChannelOpen.configureBlocking(false);
                this.n = socketChannelOpen.register(selectorOpen, 1);
            } catch (Throwable th) {
                th = th;
                if (selectorOpen != null) {
                    selectorOpen.close();
                }
                socketChannelOpen.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            selectorOpen = null;
        }
    }

    private byte[] a(int i) {
        SocketChannel socketChannel = (SocketChannel) this.n.channel();
        byte[] bArr = new byte[i];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.n.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.n.isReadable()) {
                    long j = socketChannel.read(byteBufferWrap);
                    if (j < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) j;
                    if (i2 < i && System.nanoTime() - this.l >= this.m.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    i(this.n);
                }
            } catch (Throwable th) {
                if (this.n.isValid()) {
                    this.n.interestOps(0);
                }
                throw th;
            }
        }
        if (this.n.isValid()) {
            this.n.interestOps(0);
        }
        return bArr;
    }

    private void i(SelectionKey selectionKey) throws IOException {
        int iSelectNow;
        long millis = this.m.minus(System.nanoTime() - this.l, ChronoUnit.NANOS).toMillis();
        if (millis > 0) {
            iSelectNow = selectionKey.selector().select(millis);
        } else {
            iSelectNow = millis == 0 ? selectionKey.selector().selectNow() : 0;
        }
        if (iSelectNow == 0) {
            throw new SocketTimeoutException();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.n.selector().close();
        this.n.channel().close();
    }

    public void f(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.n.channel()).socket().bind(socketAddress);
    }

    public void l(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.n.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.n.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.n.isConnectable()) {
                    i(this.n);
                }
            } finally {
                if (this.n.isValid()) {
                    this.n.interestOps(0);
                }
            }
        }
    }

    public byte[] p() {
        byte[] bArrA = a(2);
        byte[] bArrA2 = a(((bArrA[0] & 255) << 8) + (bArrA[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.n.channel();
        RU.n("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArrA2);
        return bArrA2;
    }

    public void q(byte[] bArr) {
        SocketChannel socketChannel = (SocketChannel) this.n.channel();
        RU.n("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & 255)}), ByteBuffer.wrap(bArr)};
        this.n.interestOps(4);
        int i = 0;
        while (i < bArr.length + 2) {
            try {
                if (this.n.isWritable()) {
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < 0) {
                        throw new EOFException();
                    }
                    i += (int) jWrite;
                    if (i < bArr.length + 2 && System.nanoTime() - this.l >= this.m.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    i(this.n);
                }
            } catch (Throwable th) {
                if (this.n.isValid()) {
                    this.n.interestOps(0);
                }
                throw th;
            }
        }
        if (this.n.isValid()) {
            this.n.interestOps(0);
        }
    }
}
