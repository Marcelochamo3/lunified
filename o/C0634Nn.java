package o;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0634Nn implements Cloneable {
    public Charset m;
    public int n;
    public EnumC3469zq l = EnumC3469zq.q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ThreadLocal f417o = new ThreadLocal();
    public boolean p = true;
    public final int q = 1;
    public final int r = 30;
    public int s = 1;

    public C0634Nn() {
        b(AbstractC3164wj.b);
    }

    public final void b(Charset charset) {
        int i;
        this.m = charset;
        String strName = charset.name();
        if (strName.equals("US-ASCII")) {
            i = 1;
        } else {
            i = strName.startsWith("UTF-") ? 2 : 3;
        }
        this.n = i;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0634Nn clone() {
        try {
            C0634Nn c0634Nn = (C0634Nn) super.clone();
            String strName = this.m.name();
            c0634Nn.getClass();
            c0634Nn.b(Charset.forName(strName));
            c0634Nn.l = EnumC3469zq.valueOf(this.l.name());
            return c0634Nn;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
