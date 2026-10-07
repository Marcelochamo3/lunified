package o;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: o.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2161mK {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public C2161mK(int i) {
        this.b = i;
        byte[] bArr = new byte[Yu0.b.n0];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.e, i3);
            this.e += i3;
        }
    }

    public void b() {
        this.e = this.c ? ((AbstractC0351Cp) this.f).g() : ((AbstractC0351Cp) this.f).k();
    }

    public void c(View view, int i) {
        if (this.c) {
            this.e = ((AbstractC0351Cp) this.f).m() + ((AbstractC0351Cp) this.f).b(view);
        } else {
            this.e = ((AbstractC0351Cp) this.f).e(view);
        }
        this.b = i;
    }

    public void d(View view, int i) {
        int iM = ((AbstractC0351Cp) this.f).m();
        if (iM >= 0) {
            c(view, i);
            return;
        }
        this.b = i;
        if (!this.c) {
            int iE = ((AbstractC0351Cp) this.f).e(view);
            int iK = iE - ((AbstractC0351Cp) this.f).k();
            this.e = iE;
            if (iK > 0) {
                int iG = (((AbstractC0351Cp) this.f).g() - Math.min(0, (((AbstractC0351Cp) this.f).g() - iM) - ((AbstractC0351Cp) this.f).b(view))) - (((AbstractC0351Cp) this.f).c(view) + iE);
                if (iG < 0) {
                    this.e -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((AbstractC0351Cp) this.f).g() - iM) - ((AbstractC0351Cp) this.f).b(view);
        this.e = ((AbstractC0351Cp) this.f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.e - ((AbstractC0351Cp) this.f).c(view);
            int iK2 = ((AbstractC0351Cp) this.f).k();
            int iMin = iC - (Math.min(((AbstractC0351Cp) this.f).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.e = Math.min(iG2, -iMin) + this.e;
            }
        }
    }

    public boolean e(int i) {
        if (!this.c) {
            return false;
        }
        this.e -= i;
        this.c = false;
        this.d = true;
        return true;
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.b = -1;
                this.e = Integer.MIN_VALUE;
                this.c = false;
                this.d = false;
                break;
            default:
                this.c = false;
                this.d = false;
                break;
        }
    }

    public void g(int i) {
        AbstractC0397Ej.f(!this.c);
        boolean z = i == this.b;
        this.c = z;
        if (z) {
            this.e = 3;
            this.d = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public C2161mK() {
        f();
    }
}
