package o;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3437za extends AbstractC2051l80 {
    public final C1032an m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1155o;
    public final C3111w50 p;

    public C3437za(C1032an c1032an, String str, String str2) {
        this.m = c1032an;
        this.n = str;
        this.f1155o = str2;
        this.p = Nr0.g(new C3340ya((InterfaceC2091lf0) c1032an.n.get(1), this));
    }

    @Override // o.AbstractC2051l80
    public final long i() {
        String str = this.f1155o;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = Mr0.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // o.AbstractC2051l80
    public final TP l() {
        String str = this.n;
        if (str == null) {
            return null;
        }
        Pattern pattern = TP.e;
        return AbstractC1474fG.N(str);
    }

    @Override // o.AbstractC2051l80
    public final N9 p() {
        return this.p;
    }
}
