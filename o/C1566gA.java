package o;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1566gA extends ContextWrapper {
    public static final C2323nz k;
    public final C1813in a;
    public final C3257xh b;
    public final C0622Nb c;
    public final C0622Nb d;
    public final List e;
    public final Map f;
    public final C2597qq g;
    public final C0334By h;
    public final int i;
    public B70 j;

    static {
        C2323nz c2323nz = new C2323nz();
        c2323nz.l = C1001aV.a;
        k = c2323nz;
    }

    public C1566gA(Context context, C1813in c1813in, C1797ie0 c1797ie0, C0622Nb c0622Nb, C0622Nb c0622Nb2, S5 s5, List list, C2597qq c2597qq, C0334By c0334By, int i) {
        super(context.getApplicationContext());
        this.a = c1813in;
        this.c = c0622Nb;
        this.d = c0622Nb2;
        this.e = list;
        this.f = s5;
        this.g = c2597qq;
        this.h = c0334By;
        this.i = i;
        this.b = new C3257xh(c1797ie0);
    }

    public final synchronized B70 a() {
        try {
            if (this.j == null) {
                this.d.getClass();
                B70 b70 = new B70();
                b70.E = true;
                this.j = b70;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final L60 b() {
        return (L60) this.b.get();
    }
}
