package o;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class HD implements InterfaceC2695rr {
    public N9 a;
    public M9 b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public HD(OV ov, C50 c50, N9 n9, M9 m9) {
        AbstractC1474fG.j(c50, "connection");
        this.d = ov;
        this.e = c50;
        this.a = n9;
        this.b = m9;
        this.f = new C3306y6(n9);
    }

    @Override // o.InterfaceC2695rr
    public void a() {
        this.b.flush();
    }

    @Override // o.InterfaceC2695rr
    public void b() {
        this.b.flush();
    }

    @Override // o.InterfaceC2695rr
    public InterfaceC1991ke0 c(C1951k70 c1951k70, long j) {
        if (AbstractC1899jh0.N("chunked", c1951k70.c.a("Transfer-Encoding"), true)) {
            if (this.c == 1) {
                this.c = 2;
                return new CD(this);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.c == 1) {
            this.c = 2;
            return new FD(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    @Override // o.InterfaceC2695rr
    public void cancel() {
        Socket socket = ((C50) this.e).c;
        if (socket != null) {
            Mr0.e(socket);
        }
    }

    @Override // o.InterfaceC2695rr
    public void d(C1951k70 c1951k70) {
        Proxy.Type type = ((C50) this.e).b.b.type();
        AbstractC1474fG.i(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c1951k70.b);
        sb.append(' ');
        C2446pE c2446pE = c1951k70.a;
        if (c2446pE.j || type != Proxy.Type.HTTP) {
            String strB = c2446pE.b();
            String strD = c2446pE.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(c2446pE);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
        j(c1951k70.c, string);
    }

    @Override // o.InterfaceC2695rr
    public InterfaceC2091lf0 e(C1855j80 c1855j80) {
        if (!AbstractC1960kE.a(c1855j80)) {
            return i(0L);
        }
        if (AbstractC1899jh0.N("chunked", c1855j80.f("Transfer-Encoding", null), true)) {
            C2446pE c2446pE = c1855j80.l.a;
            if (this.c == 4) {
                this.c = 5;
                return new DD(this, c2446pE);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        long jK = Mr0.k(c1855j80);
        if (jK != -1) {
            return i(jK);
        }
        if (this.c == 4) {
            this.c = 5;
            ((C50) this.e).l();
            return new GD(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    @Override // o.InterfaceC2695rr
    public long f(C1855j80 c1855j80) {
        if (!AbstractC1960kE.a(c1855j80)) {
            return 0L;
        }
        if (AbstractC1899jh0.N("chunked", c1855j80.f("Transfer-Encoding", null), true)) {
            return -1L;
        }
        return Mr0.k(c1855j80);
    }

    @Override // o.InterfaceC2695rr
    public C1661h80 g(boolean z) {
        C3306y6 c3306y6 = (C3306y6) this.f;
        int i = this.c;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        try {
            String strI = ((N9) c3306y6.n).I(c3306y6.m);
            c3306y6.m -= (long) strI.length();
            C2613qy c2613qyT = Ou0.t(strI);
            int i2 = c2613qyT.m;
            C1661h80 c1661h80 = new C1661h80();
            O30 o30 = (O30) c2613qyT.n;
            AbstractC1474fG.j(o30, "protocol");
            c1661h80.b = o30;
            c1661h80.c = i2;
            String str = (String) c2613qyT.f996o;
            AbstractC1474fG.j(str, "message");
            c1661h80.d = str;
            C2112lq c2112lq = new C2112lq(1);
            while (true) {
                String strI2 = ((N9) c3306y6.n).I(c3306y6.m);
                c3306y6.m -= (long) strI2.length();
                if (strI2.length() == 0) {
                    break;
                }
                c2112lq.b(strI2);
            }
            c1661h80.c(c2112lq.f());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.c = 3;
                return c1661h80;
            }
            if (102 > i2 || i2 >= 200) {
                this.c = 4;
                return c1661h80;
            }
            this.c = 3;
            return c1661h80;
        } catch (EOFException e) {
            throw new IOException(AbstractC1701hf0.t("unexpected end of stream on ", ((C50) this.e).b.a.i.i()), e);
        }
    }

    @Override // o.InterfaceC2695rr
    public C50 h() {
        return (C50) this.e;
    }

    public ED i(long j) {
        if (this.c == 4) {
            this.c = 5;
            return new ED(this, j);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    public void j(C2152mB c2152mB, String str) {
        AbstractC1474fG.j(c2152mB, "headers");
        AbstractC1474fG.j(str, "requestLine");
        if (this.c != 0) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        M9 m9 = this.b;
        m9.N(str).N("\r\n");
        int size = c2152mB.size();
        for (int i = 0; i < size; i++) {
            m9.N(c2152mB.d(i)).N(": ").N(c2152mB.h(i)).N("\r\n");
        }
        m9.N("\r\n");
        this.c = 1;
    }

    public HD(C3454zi0 c3454zi0) {
        AbstractC1474fG.j(c3454zi0, "taskRunner");
        this.d = c3454zi0;
        this.g = KD.a;
    }
}
