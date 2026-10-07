package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0340Ce extends AbstractC2304np {
    private int b;
    private int c;
    private int d;
    private InetAddress e;

    public C0340Ce() {
        super(8);
    }

    private static int j(String str, int i, int i2) {
        int iB = C1062b2.b(i) * 8;
        if (i2 >= 0 && i2 <= iB) {
            return i2;
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(str);
        sb.append("\" ");
        sb.append(i2);
        sb.append(" must be in the range [0..");
        throw new IllegalArgumentException(AbstractC1701hf0.g(sb, iB, "]"));
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) throws Rw0 {
        int iH = c0474Hi.h();
        this.b = iH;
        if (iH != 1 && iH != 2) {
            throw new Rw0("unknown address family");
        }
        int iJ = c0474Hi.j();
        this.c = iJ;
        if (iJ > C1062b2.b(this.b) * 8) {
            throw new Rw0("invalid source netmask");
        }
        int iJ2 = c0474Hi.j();
        this.d = iJ2;
        if (iJ2 > C1062b2.b(this.b) * 8) {
            throw new Rw0("invalid scope netmask");
        }
        byte[] bArrE = c0474Hi.e();
        if (bArrE.length != (this.c + 7) / 8) {
            throw new Rw0("invalid address");
        }
        byte[] bArr = new byte[C1062b2.b(this.b)];
        System.arraycopy(bArrE, 0, bArr, 0, bArrE.length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.e = byAddress;
            if (!C1062b2.r(byAddress, this.c).equals(this.e)) {
                throw new Rw0("invalid padding");
            }
        } catch (UnknownHostException e) {
            throw new Rw0("invalid address", e);
        }
    }

    @Override // o.AbstractC2304np
    public String f() {
        return this.e.getHostAddress() + "/" + this.c + ", scope netmask " + this.d;
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        c0578Li.l(this.b);
        c0578Li.o(this.c);
        c0578Li.o(this.d);
        c0578Li.j(this.e.getAddress(), 0, (this.c + 7) / 8);
    }

    public InetAddress k() {
        return this.e;
    }

    public int l() {
        return this.b;
    }

    public int m() {
        return this.d;
    }

    public int n() {
        return this.c;
    }

    public C0340Ce(int i, int i2, InetAddress inetAddress) {
        super(8);
        int iC = C1062b2.c(inetAddress);
        this.b = iC;
        this.c = j("source netmask", iC, i);
        this.d = j("scope netmask", this.b, i2);
        InetAddress inetAddressR = C1062b2.r(inetAddress, i);
        this.e = inetAddressR;
        if (!inetAddress.equals(inetAddressR)) {
            throw new IllegalArgumentException("source netmask is not valid for address");
        }
    }

    public C0340Ce(int i, InetAddress inetAddress) {
        this(i, 0, inetAddress);
    }
}
