package o;

/* JADX INFO: renamed from: o.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0944Zl {
    public final int l;
    public final Zl0 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0643Nw f664o;

    public AbstractC0944Zl(int i, Zl0 zl0, int i2) {
        this.l = i;
        this.m = zl0;
        this.n = i2;
        this.f664o = zl0.f665o[i2];
    }

    public abstract int a();

    public abstract boolean b(AbstractC0944Zl abstractC0944Zl);
}
