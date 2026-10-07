package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.fragments.search.SearchTvFragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0976a8 extends RecyclerView {
    public final C3217xA U0;
    public boolean V0;
    public boolean W0;
    public T50 X0;
    public V7 Y0;
    public int Z0;
    public int a1;

    public AbstractC0976a8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.V0 = true;
        this.W0 = true;
        this.Z0 = 4;
        C3217xA c3217xA = new C3217xA(this);
        this.U0 = c3217xA;
        setLayoutManager(c3217xA);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C1418el) getItemAnimator()).g = false;
        this.A.add(new T7(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        V7 v7 = this.Y0;
        if (v7 != null) {
            SearchTvFragment searchTvFragment = (SearchTvFragment) ((C2278nc) v7).m;
            AbstractC1474fG.j(searchTvFragment, "this$0");
            if (keyEvent.getAction() == 0 && searchTvFragment.r0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    searchTvFragment.Z(-1);
                } else if (keyCode == 20) {
                    searchTvFragment.Z(1);
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            C3217xA c3217xA = this.U0;
            View viewS = c3217xA.s(c3217xA.D);
            if (viewS != null) {
                return focusSearch(viewS, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0(int i) {
        C3217xA c3217xA = this.U0;
        if ((c3217xA.B & 64) != 0) {
            c3217xA.A1(i, false);
        } else {
            super.g0(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        C3217xA c3217xA = this.U0;
        View viewS = c3217xA.s(c3217xA.D);
        if (viewS != null && i2 >= (iIndexOfChild = indexOfChild(viewS))) {
            return i2 < i + (-1) ? ((iIndexOfChild + i) - 1) - i2 : iIndexOfChild;
        }
        return i2;
    }

    public int getExtraLayoutSpace() {
        return this.U0.b0;
    }

    public int getFocusScrollStrategy() {
        return this.U0.X;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.U0.P;
    }

    public int getHorizontalSpacing() {
        return this.U0.P;
    }

    public int getInitialPrefetchItemCount() {
        return this.Z0;
    }

    public int getItemAlignmentOffset() {
        return ((C2641rG) this.U0.Z.f414o).b;
    }

    public float getItemAlignmentOffsetPercent() {
        return ((C2641rG) this.U0.Z.f414o).c;
    }

    public int getItemAlignmentViewId() {
        return ((C2641rG) this.U0.Z.f414o).a;
    }

    public Y7 getOnUnhandledKeyListener() {
        return null;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.U0.d0.m;
    }

    public final int getSaveChildrenPolicy() {
        return this.U0.d0.l;
    }

    public int getSelectedPosition() {
        return this.U0.D;
    }

    public int getSelectedSubPosition() {
        return this.U0.E;
    }

    public Z7 getSmoothScrollByBehavior() {
        return null;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.U0.q;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.U0.p;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.U0.Q;
    }

    public int getVerticalSpacing() {
        return this.U0.Q;
    }

    public int getWindowAlignment() {
        return ((C1735hw0) this.U0.Y.f941o).f;
    }

    public int getWindowAlignmentOffset() {
        return ((C1735hw0) this.U0.Y.f941o).g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return ((C1735hw0) this.U0.Y.f941o).h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.W0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void i0(int i, int i2) {
        k0(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i, int i2) {
        k0(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        C3217xA c3217xA = this.U0;
        if ((c3217xA.B & 64) != 0) {
            c3217xA.A1(i, false);
        } else {
            super.l0(i);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C3217xA c3217xA = this.U0;
        if (!z) {
            c3217xA.getClass();
            return;
        }
        int i2 = c3217xA.D;
        while (true) {
            View viewS = c3217xA.s(i2);
            if (viewS == null) {
                return;
            }
            if (viewS.getVisibility() == 0 && viewS.hasFocusable()) {
                viewS.requestFocus();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if ((this.a1 & 1) == 1) {
            return false;
        }
        C3217xA c3217xA = this.U0;
        int i5 = c3217xA.X;
        if (i5 != 1 && i5 != 2) {
            View viewS = c3217xA.s(c3217xA.D);
            if (viewS != null) {
                return viewS.requestFocus(i, rect);
            }
            return false;
        }
        int iX = c3217xA.x();
        if ((i & 2) != 0) {
            i3 = iX;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = iX - 1;
            i3 = -1;
            i4 = -1;
        }
        C1735hw0 c1735hw0 = (C1735hw0) c3217xA.Y.f941o;
        int i6 = c1735hw0.j;
        int i7 = ((c1735hw0.i - i6) - c1735hw0.k) + i6;
        while (i2 != i3) {
            View viewW = c3217xA.w(i2);
            if (viewW.getVisibility() == 0 && c3217xA.t.e(viewW) >= i6 && c3217xA.t.b(viewW) <= i7 && viewW.requestFocus(i, rect)) {
                return z;
            }
            i2 += i4;
        }
        z = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        C3217xA c3217xA = this.U0;
        if (c3217xA.s == 0) {
            if (i == 1) {
                i2 = 262144;
            } else {
                i2 = 0;
            }
        } else if (i == 1) {
            i2 = 524288;
        } else {
            i2 = 0;
        }
        int i3 = c3217xA.B;
        if ((786432 & i3) == i2) {
            return;
        }
        c3217xA.B = i2 | (i3 & (-786433)) | 256;
        ((C1735hw0) c3217xA.Y.n).l = i == 1;
    }

    public final void q0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q40.c);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        C3217xA c3217xA = this.U0;
        c3217xA.B = (z ? C1672hI.a.g : 0) | (c3217xA.B & (-6145)) | (z2 ? C1672hI.a.f : 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        c3217xA.B = (z3 ? C1672hI.a.e : 0) | (c3217xA.B & (-24577)) | (z4 ? 16384 : 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (c3217xA.s == 1) {
            c3217xA.Q = dimensionPixelSize;
            c3217xA.R = dimensionPixelSize;
        } else {
            c3217xA.Q = dimensionPixelSize;
            c3217xA.S = dimensionPixelSize;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (c3217xA.s == 0) {
            c3217xA.P = dimensionPixelSize2;
            c3217xA.R = dimensionPixelSize2;
        } else {
            c3217xA.P = dimensionPixelSize2;
            c3217xA.S = dimensionPixelSize2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(0, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r0(int i, Rt0 rt0) {
        AbstractC2144m60 abstractC2144m60H = H(i, false);
        if (abstractC2144m60H == null || N()) {
            U7 u7 = new U7(this, i, rt0);
            C3217xA c3217xA = this.U0;
            if (c3217xA.C == null) {
                c3217xA.C = new ArrayList();
            }
            c3217xA.C.add(u7);
        } else {
            rt0.d(abstractC2144m60H);
        }
        setSelectedPosition(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z = view.hasFocus() && isFocusable();
        if (z) {
            this.a1 = 1 | this.a1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.a1 ^= -2;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        boolean zHasFocus = getChildAt(i).hasFocus();
        if (zHasFocus) {
            this.a1 |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (zHasFocus) {
            this.a1 ^= -2;
        }
    }

    public void setAnimateChildLayout(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            if (z) {
                super.setItemAnimator(this.X0);
            } else {
                this.X0 = getItemAnimator();
                super.setItemAnimator(null);
            }
        }
    }

    public void setChildrenVisibility(int i) {
        C3217xA c3217xA = this.U0;
        c3217xA.J = i;
        if (i != -1) {
            int iX = c3217xA.x();
            for (int i2 = 0; i2 < iX; i2++) {
                c3217xA.w(i2).setVisibility(c3217xA.J);
            }
        }
    }

    public void setExtraLayoutSpace(int i) {
        C3217xA c3217xA = this.U0;
        int i2 = c3217xA.b0;
        if (i2 == i) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        c3217xA.b0 = i;
        c3217xA.E0();
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.U0.X = i;
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : 262144);
        C3217xA c3217xA = this.U0;
        c3217xA.B = (z ? 32768 : 0) | (c3217xA.B & (-32769));
    }

    public void setGravity(int i) {
        this.U0.T = i;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.W0 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        C3217xA c3217xA = this.U0;
        if (c3217xA.s == 0) {
            c3217xA.P = i;
            c3217xA.R = i;
        } else {
            c3217xA.P = i;
            c3217xA.S = i;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.Z0 = i;
    }

    public void setItemAlignmentOffset(int i) {
        C3217xA c3217xA = this.U0;
        ((C2641rG) c3217xA.Z.f414o).b = i;
        c3217xA.B1();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        C3217xA c3217xA = this.U0;
        C2641rG c2641rG = (C2641rG) c3217xA.Z.f414o;
        c2641rG.getClass();
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        c2641rG.c = f;
        c3217xA.B1();
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        C3217xA c3217xA = this.U0;
        ((C2641rG) c3217xA.Z.f414o).d = z;
        c3217xA.B1();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        C3217xA c3217xA = this.U0;
        ((C2641rG) c3217xA.Z.f414o).a = i;
        c3217xA.B1();
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        C3217xA c3217xA = this.U0;
        c3217xA.P = i;
        c3217xA.Q = i;
        c3217xA.S = i;
        c3217xA.R = i;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        C3217xA c3217xA = this.U0;
        int i = c3217xA.B;
        if (((i & 512) != 0) != z) {
            c3217xA.B = (i & (-513)) | (z ? 512 : 0);
            c3217xA.E0();
        }
    }

    public void setOnChildLaidOutListener(InterfaceC1686hW interfaceC1686hW) {
        this.U0.getClass();
    }

    @SuppressLint({"ReferencesDeprecated"})
    public void setOnChildSelectedListener(InterfaceC1784iW interfaceC1784iW) {
        this.U0.getClass();
    }

    public void setOnChildViewHolderSelectedListener(AbstractC1880jW abstractC1880jW) {
        C3217xA c3217xA = this.U0;
        if (abstractC1880jW == null) {
            c3217xA.C = null;
            return;
        }
        ArrayList arrayList = c3217xA.C;
        if (arrayList == null) {
            c3217xA.C = new ArrayList();
        } else {
            arrayList.clear();
        }
        c3217xA.C.add(abstractC1880jW);
    }

    public void setOnKeyInterceptListener(V7 v7) {
        this.Y0 = v7;
    }

    public void setPruneChild(boolean z) {
        C3217xA c3217xA = this.U0;
        int i = c3217xA.B;
        if (((i & 65536) != 0) != z) {
            c3217xA.B = (i & (-65537)) | (z ? 65536 : 0);
            if (z) {
                c3217xA.E0();
            }
        }
    }

    public final void setSaveChildrenLimitNumber(int i) {
        FV fv = this.U0.d0;
        fv.m = i;
        fv.e();
    }

    public final void setSaveChildrenPolicy(int i) {
        FV fv = this.U0.d0;
        fv.l = i;
        fv.e();
    }

    public void setScrollEnabled(boolean z) {
        int i;
        C3217xA c3217xA = this.U0;
        int i2 = c3217xA.B;
        if (((i2 & 131072) != 0) != z) {
            int i3 = (i2 & (-131073)) | (z ? 131072 : 0);
            c3217xA.B = i3;
            if ((i3 & 131072) == 0 || c3217xA.X != 0 || (i = c3217xA.D) == -1) {
                return;
            }
            c3217xA.v1(i, c3217xA.E, c3217xA.I, true);
        }
    }

    public void setSelectedPosition(int i) {
        this.U0.A1(i, false);
    }

    public void setSelectedPositionSmooth(int i) {
        this.U0.A1(i, true);
    }

    public final void setSmoothScrollMaxPendingMoves(int i) {
        this.U0.q = i;
    }

    public final void setSmoothScrollSpeedFactor(float f) {
        this.U0.p = f;
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        C3217xA c3217xA = this.U0;
        if (c3217xA.s == 1) {
            c3217xA.Q = i;
            c3217xA.R = i;
        } else {
            c3217xA.Q = i;
            c3217xA.S = i;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        ((C1735hw0) this.U0.Y.f941o).f = i;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        ((C1735hw0) this.U0.Y.f941o).g = i;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        C1735hw0 c1735hw0 = (C1735hw0) this.U0.Y.f941o;
        c1735hw0.getClass();
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        c1735hw0.h = f;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        C1735hw0 c1735hw0 = (C1735hw0) this.U0.Y.f941o;
        c1735hw0.e = z ? c1735hw0.e | 2 : c1735hw0.e & (-3);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        C1735hw0 c1735hw0 = (C1735hw0) this.U0.Y.f941o;
        c1735hw0.e = z ? c1735hw0.e | 1 : c1735hw0.e & (-2);
        requestLayout();
    }

    public void setOnMotionInterceptListener(W7 w7) {
    }

    public void setOnTouchInterceptListener(X7 x7) {
    }

    public void setOnUnhandledKeyListener(Y7 y7) {
    }

    public final void setSmoothScrollByBehavior(Z7 z7) {
    }
}
