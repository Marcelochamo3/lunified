package o;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: o.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2149m9 implements InterfaceC3284xu0 {
    public boolean l;
    public Object m;

    public C2149m9(int i) {
        switch (i) {
            case 3:
                this.m = new Handler(Looper.getMainLooper(), new C2535q8(1));
                break;
            default:
                this.m = new SparseBooleanArray();
                break;
        }
    }

    public void a(int i) {
        AbstractC0397Ej.f(!this.l);
        ((SparseBooleanArray) this.m).append(i, true);
    }

    public C3188wv b() {
        AbstractC0397Ej.f(!this.l);
        this.l = true;
        return new C3188wv((SparseBooleanArray) this.m);
    }

    public boolean c() {
        return this.l;
    }

    public boolean d(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C2691rp c2691rp = (C2691rp) this.m;
        if (c2691rp == null) {
            return c();
        }
        int iM = c2691rp.m(charSequence, i);
        if (iM == 0) {
            return true;
        }
        if (iM != 1) {
            return c();
        }
        return false;
    }

    public synchronized void e(M70 m70, boolean z) {
        try {
            if (this.l || z) {
                ((Handler) this.m).obtainMessage(1, m70).sendToTarget();
            } else {
                this.l = true;
                m70.e();
                this.l = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // o.InterfaceC3284xu0
    public Kw0 h(View view, Kw0 kw0, YK yk) {
        boolean z;
        Hw0 hw0 = kw0.a;
        TF tfF = hw0.f(7);
        TF tfF2 = hw0.f(32);
        int i = tfF.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
        bottomSheetBehavior.w = i;
        boolean zS = AbstractC3409z9.s(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.f40o) {
            int iA = kw0.a();
            bottomSheetBehavior.v = iA;
            paddingBottom = iA + yk.d;
        }
        boolean z2 = bottomSheetBehavior.p;
        int i2 = tfF.a;
        if (z2) {
            paddingLeft = (zS ? yk.c : yk.a) + i2;
        }
        boolean z3 = bottomSheetBehavior.q;
        int i3 = tfF.c;
        if (z3) {
            paddingRight = (zS ? yk.a : yk.c) + i3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z4 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i2) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i3) {
            marginLayoutParams.rightMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = tfF.b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z4 = z;
            }
        } else {
            z4 = z;
        }
        if (z4) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z5 = this.l;
        if (z5) {
            bottomSheetBehavior.m = tfF2.d;
        }
        if (bottomSheetBehavior.f40o || z5) {
            bottomSheetBehavior.O();
        }
        return kw0;
    }

    public C2149m9(C2691rp c2691rp, boolean z) {
        this.m = c2691rp;
        this.l = z;
    }
}
