package o;

import android.view.View;

/* JADX INFO: renamed from: o.rP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2650rP {
    public int a;
    public int b;

    public /* synthetic */ C2650rP(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(AbstractC2144m60 abstractC2144m60) {
        View view = abstractC2144m60.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
