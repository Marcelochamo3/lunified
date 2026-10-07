package o;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: o.Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0351Cp {
    public int a;
    public final Object b;
    public final Object c;

    public AbstractC0351Cp(X50 x50) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = x50;
    }

    public static AbstractC0351Cp a(X50 x50, int i) {
        if (i == 0) {
            return new IW(x50, 0);
        }
        if (i == 1) {
            return new IW(x50, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return l() - this.a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public AbstractC0351Cp(InterfaceC0429Fp interfaceC0429Fp) {
        this.a = 0;
        this.c = new C0605Mk();
        this.b = interfaceC0429Fp;
    }
}
