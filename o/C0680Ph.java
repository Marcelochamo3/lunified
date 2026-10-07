package o;

import j$.util.Optional;

/* JADX INFO: renamed from: o.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0680Ph extends AbstractC2304np {
    private byte[] b;
    private byte[] c;

    public C0680Ph() {
        super(10);
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) throws Rw0 {
        int iK = c0474Hi.k();
        if (iK < 8) {
            throw new Rw0("invalid length of client cookie");
        }
        this.b = c0474Hi.f(8);
        if (iK > 8) {
            if (iK < 16 || iK > 40) {
                throw new Rw0("invalid length of server cookie");
            }
            this.c = c0474Hi.e();
        }
    }

    @Override // o.AbstractC2304np
    public String f() {
        if (this.c == null) {
            return Ay0.b(this.b);
        }
        return Ay0.b(this.b) + " " + Ay0.b(this.c);
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        c0578Li.i(this.b);
        byte[] bArr = this.c;
        if (bArr != null) {
            c0578Li.i(bArr);
        }
    }

    public byte[] j() {
        return this.b;
    }

    public Optional<byte[]> k() {
        return Optional.ofNullable(this.c);
    }

    public C0680Ph(byte[] bArr) {
        this(bArr, null);
    }

    public C0680Ph(byte[] bArr, byte[] bArr2) {
        int length;
        this();
        if (bArr != null) {
            if (bArr.length == 8) {
                this.b = bArr;
                if (bArr2 != null && ((length = bArr2.length) < 8 || length > 32)) {
                    throw new IllegalArgumentException("server cookie must consist of 8 to 32 bytes");
                }
                this.c = bArr2;
                return;
            }
            throw new IllegalArgumentException("client cookie must consist of eight bytes");
        }
        throw new IllegalArgumentException("client cookie must not be null");
    }
}
