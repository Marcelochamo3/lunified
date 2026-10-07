package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702Qd {
    public int a;
    public int b;
    public int c;
    public Object d;

    public void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void b() {
        int i = this.c;
        View view = (View) this.d;
        It0.k(view, i - (view.getTop() - this.a));
        It0.j(view, 0 - (view.getLeft() - this.b));
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        X50 x50 = recyclerView.y;
        if (recyclerView.x == null || x50 == null || !x50.i) {
            return;
        }
        if (z) {
            if (!recyclerView.p.j()) {
                x50.j(recyclerView.x.a(), this);
            }
        } else if (!recyclerView.N()) {
            x50.i(this.a, this.b, recyclerView.t0, this);
        }
        int i = this.c;
        if (i > x50.j) {
            x50.j = i;
            x50.k = z;
            recyclerView.n.n();
        }
    }

    public void d() {
        Object[] objArr = (Object[]) this.d;
        int length = objArr.length;
        int i = this.a;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i3];
        X5.K(0, i, length, objArr, objArr2);
        X5.K(i2, 0, this.a, (Object[]) this.d, objArr2);
        this.d = objArr2;
        this.a = 0;
        this.b = length;
        this.c = i3 - 1;
    }

    public void e(int i) {
        if (i <= 0) {
            return;
        }
        if (i > g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.b;
        int i3 = i < i2 ? i2 - i : 0;
        for (int i4 = i3; i4 < i2; i4++) {
            ((Object[]) this.d)[i4] = null;
        }
        int i5 = this.b;
        int i6 = i5 - i3;
        int i7 = i - i6;
        this.b = i5 - i6;
        if (i7 > 0) {
            int length = ((Object[]) this.d).length;
            this.b = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < length; i9++) {
                ((Object[]) this.d)[i9] = null;
            }
            this.b = i8;
        }
    }

    public void f(int i) {
        if (i <= 0) {
            return;
        }
        if (i > g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = ((Object[]) this.d).length;
        int i2 = this.a;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            ((Object[]) this.d)[i2] = null;
            i2++;
        }
        int i3 = this.a;
        int i4 = length - i3;
        int i5 = i - i4;
        this.a = this.c & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                ((Object[]) this.d)[i6] = null;
            }
            this.a = i5;
        }
    }

    public int g() {
        return (this.b - this.a) & this.c;
    }
}
