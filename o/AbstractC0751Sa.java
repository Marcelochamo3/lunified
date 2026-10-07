package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0751Sa implements InterfaceC1378eI, Serializable {
    public transient InterfaceC1378eI l;
    public final Object m;
    public final Class n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f514o;
    public final String p;
    public final boolean q;

    public AbstractC0751Sa(Object obj, Class cls, String str, String str2, boolean z) {
        this.m = obj;
        this.n = cls;
        this.f514o = str;
        this.p = str2;
        this.q = z;
    }

    public abstract InterfaceC1378eI a();

    public final InterfaceC2669re d() {
        Class cls = this.n;
        if (cls == null) {
            return null;
        }
        if (!this.q) {
            return AbstractC2822t60.a(cls);
        }
        AbstractC2822t60.a.getClass();
        return new UW(cls);
    }
}
