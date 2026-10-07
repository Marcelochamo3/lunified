package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2080la implements InterfaceC2195mj, InterfaceC0839Vk, BW {
    public final /* synthetic */ int l;
    public final ByteBuffer m;

    public C2080la(ByteBuffer byteBuffer, int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.m = byteBuffer;
                break;
        }
    }

    private final void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.m) {
            this.m.position(0);
            messageDigest.update(this.m.putLong(l.longValue()).array());
        }
    }

    public short b(int i) {
        ByteBuffer byteBuffer = this.m;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    @Override // o.BW
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.l) {
            case 3:
                d(bArr, obj, messageDigest);
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.m) {
                    this.m.position(0);
                    messageDigest.update(this.m.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // o.InterfaceC2195mj
    public Object f() {
        ByteBuffer byteBuffer = this.m;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // o.InterfaceC0839Vk
    public short l() throws C0813Uk {
        ByteBuffer byteBuffer = this.m;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0813Uk();
    }

    @Override // o.InterfaceC0839Vk
    public int s() {
        return (l() << 8) | l();
    }

    @Override // o.InterfaceC0839Vk
    public long skip(long j) {
        ByteBuffer byteBuffer = this.m;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // o.InterfaceC0839Vk
    public int x(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.m;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public C2080la(int i) {
        this.l = i;
        switch (i) {
            case 4:
                this.m = ByteBuffer.allocate(4);
                break;
            default:
                this.m = ByteBuffer.allocate(8);
                break;
        }
    }

    public C2080la(int i, byte[] bArr) {
        this.l = 2;
        this.m = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    @Override // o.InterfaceC2195mj
    public void a() {
    }
}
