package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.tf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2866tf0 implements Cloneable {
    public /* synthetic */ boolean l;
    public /* synthetic */ int[] m;
    public /* synthetic */ Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f1044o;

    public C2866tf0() {
        this(0);
    }

    public final void b(int i, Object obj) {
        int i2 = this.f1044o;
        if (i2 != 0 && i <= this.m[i2 - 1]) {
            g(i, obj);
            return;
        }
        if (this.l && i2 >= this.m.length) {
            Nr0.b(this);
        }
        int i3 = this.f1044o;
        if (i3 >= this.m.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.m, i7);
            AbstractC1474fG.i(iArrCopyOf, "copyOf(this, newSize)");
            this.m = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.n, i7);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.n = objArrCopyOf;
        }
        this.m[i3] = i;
        this.n[i3] = obj;
        this.f1044o = i3 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2866tf0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1474fG.h(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2866tf0 c2866tf0 = (C2866tf0) objClone;
        c2866tf0.m = (int[]) this.m.clone();
        c2866tf0.n = (Object[]) this.n.clone();
        return c2866tf0;
    }

    public final Object d(int i) {
        Object obj;
        int iD = Nr0.d(this.f1044o, i, this.m);
        if (iD < 0 || (obj = this.n[iD]) == Nr0.g) {
            return null;
        }
        return obj;
    }

    public final int e(int i) {
        if (this.l) {
            Nr0.b(this);
        }
        return this.m[i];
    }

    public final void g(int i, Object obj) {
        int iD = Nr0.d(this.f1044o, i, this.m);
        if (iD >= 0) {
            this.n[iD] = obj;
            return;
        }
        int i2 = ~iD;
        int i3 = this.f1044o;
        if (i2 < i3) {
            Object[] objArr = this.n;
            if (objArr[i2] == Nr0.g) {
                this.m[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.l && i3 >= this.m.length) {
            Nr0.b(this);
            i2 = ~Nr0.d(this.f1044o, i, this.m);
        }
        int i4 = this.f1044o;
        if (i4 >= this.m.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.m, i8);
            AbstractC1474fG.i(iArrCopyOf, "copyOf(this, newSize)");
            this.m = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.n, i8);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.n = objArrCopyOf;
        }
        int i9 = this.f1044o;
        if (i9 - i2 != 0) {
            int[] iArr = this.m;
            int i10 = i2 + 1;
            X5.J(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.n;
            X5.K(i10, i2, this.f1044o, objArr2, objArr2);
        }
        this.m[i2] = i;
        this.n[i2] = obj;
        this.f1044o++;
    }

    public final int h() {
        if (this.l) {
            Nr0.b(this);
        }
        return this.f1044o;
    }

    public final Object j(int i) {
        if (this.l) {
            Nr0.b(this);
        }
        return this.n[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1044o * 28);
        sb.append('{');
        int i = this.f1044o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1474fG.i(string, "buffer.toString()");
        return string;
    }

    public C2866tf0(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.m = new int[i5];
        this.n = new Object[i5];
    }
}
