package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.pU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2462pU extends ViewGroup implements InterfaceC2845tQ {
    public static final int[] Q = {R.attr.state_checked};
    public static final int[] R = {-16842910};
    public Drawable A;
    public ColorStateList B;
    public int C;
    public final SparseArray D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public C1891jd0 L;
    public boolean M;
    public ColorStateList N;
    public C2655rU O;
    public ZP P;
    public final C2629r7 l;
    public final Z0 m;
    public final C2136m20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f971o;
    public int p;
    public AbstractC2268nU[] q;
    public int r;
    public int s;
    public ColorStateList t;
    public int u;
    public ColorStateList v;
    public final ColorStateList w;
    public int x;
    public int y;
    public boolean z;

    public AbstractC2462pU(Context context) {
        super(context);
        this.n = new C2136m20(5);
        this.f971o = new SparseArray(5);
        this.r = 0;
        this.s = 0;
        this.D = new SparseArray(5);
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.M = false;
        this.w = c();
        if (isInEditMode()) {
            this.l = null;
        } else {
            C2629r7 c2629r7 = new C2629r7();
            this.l = c2629r7;
            c2629r7.V(0);
            c2629r7.J(AbstractC3045vW.D(getContext(), com.skidush.clonex.R.attr.motionDurationMedium4, getResources().getInteger(com.skidush.clonex.R.integer.material_motion_duration_long_1)));
            c2629r7.L(AbstractC3045vW.E(getContext(), com.skidush.clonex.R.attr.motionEasingStandard, AbstractC1161c3.b));
            c2629r7.R(new Ti0());
        }
        this.m = new Z0(4, (C1564g9) this);
        WeakHashMap weakHashMap = It0.a;
        setImportantForAccessibility(1);
    }

    private AbstractC2268nU getNewItem() {
        AbstractC2268nU abstractC2268nU = (AbstractC2268nU) this.n.n();
        return abstractC2268nU == null ? new C1466f9(getContext()) : abstractC2268nU;
    }

    private void setBadgeIfNeeded(AbstractC2268nU abstractC2268nU) {
        J7 j7;
        int id = abstractC2268nU.getId();
        if (id == -1 || (j7 = (J7) this.D.get(id)) == null) {
            return;
        }
        abstractC2268nU.setBadge(j7);
    }

    public final void a() {
        removeAllViews();
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                if (abstractC2268nU != null) {
                    this.n.e(abstractC2268nU);
                    abstractC2268nU.i(abstractC2268nU.y);
                    abstractC2268nU.E = null;
                    abstractC2268nU.K = 0.0f;
                    abstractC2268nU.l = false;
                }
            }
        }
        if (this.P.f.size() == 0) {
            this.r = 0;
            this.s = 0;
            this.q = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.P.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.P.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.D;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.q = new AbstractC2268nU[this.P.f.size()];
        int i3 = this.p;
        boolean z = i3 != -1 ? i3 == 0 : this.P.l().size() > 3;
        for (int i4 = 0; i4 < this.P.f.size(); i4++) {
            this.O.m = true;
            this.P.getItem(i4).setCheckable(true);
            this.O.m = false;
            AbstractC2268nU newItem = getNewItem();
            this.q[i4] = newItem;
            newItem.setIconTintList(this.t);
            newItem.setIconSize(this.u);
            newItem.setTextColor(this.w);
            newItem.setTextAppearanceInactive(this.x);
            newItem.setTextAppearanceActive(this.y);
            newItem.setTextAppearanceActiveBoldEnabled(this.z);
            newItem.setTextColor(this.v);
            int i5 = this.E;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.F;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            int i7 = this.G;
            if (i7 != -1) {
                newItem.setActiveIndicatorLabelPadding(i7);
            }
            newItem.setActiveIndicatorWidth(this.I);
            newItem.setActiveIndicatorHeight(this.J);
            newItem.setActiveIndicatorMarginHorizontal(this.K);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.M);
            newItem.setActiveIndicatorEnabled(this.H);
            Drawable drawable = this.A;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.C);
            }
            newItem.setItemRippleColor(this.B);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.p);
            C1386eQ c1386eQ = (C1386eQ) this.P.getItem(i4);
            newItem.a(c1386eQ);
            newItem.setItemPosition(i4);
            SparseArray sparseArray2 = this.f971o;
            int i8 = c1386eQ.a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i8));
            newItem.setOnClickListener(this.m);
            int i9 = this.r;
            if (i9 != 0 && i8 == i9) {
                this.s = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.P.f.size() - 1, this.s);
        this.s = iMin;
        this.P.getItem(iMin).setChecked(true);
    }

    @Override // o.InterfaceC2845tQ
    public final void b(ZP zp) {
        this.P = zp;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListV = AbstractC1459f50.v(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.skidush.clonex.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListV.getDefaultColor();
        int[] iArr = R;
        return new ColorStateList(new int[][]{iArr, Q, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListV.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final C2068lO d() {
        if (this.L == null || this.N == null) {
            return null;
        }
        C2068lO c2068lO = new C2068lO(this.L);
        c2068lO.l(this.N);
        return c2068lO;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.G;
    }

    public SparseArray<J7> getBadgeDrawables() {
        return this.D;
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.N;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.H;
    }

    public int getItemActiveIndicatorHeight() {
        return this.J;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.K;
    }

    public C1891jd0 getItemActiveIndicatorShapeAppearance() {
        return this.L;
    }

    public int getItemActiveIndicatorWidth() {
        return this.I;
    }

    public Drawable getItemBackground() {
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        return (abstractC2268nUArr == null || abstractC2268nUArr.length <= 0) ? this.A : abstractC2268nUArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.C;
    }

    public int getItemIconSize() {
        return this.u;
    }

    public int getItemPaddingBottom() {
        return this.F;
    }

    public int getItemPaddingTop() {
        return this.E;
    }

    public ColorStateList getItemRippleColor() {
        return this.B;
    }

    public int getItemTextAppearanceActive() {
        return this.y;
    }

    public int getItemTextAppearanceInactive() {
        return this.x;
    }

    public ColorStateList getItemTextColor() {
        return this.v;
    }

    public int getLabelVisibilityMode() {
        return this.p;
    }

    public ZP getMenu() {
        return this.P;
    }

    public int getSelectedItemId() {
        return this.r;
    }

    public int getSelectedItemPosition() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) L0.d(1, this.P.l().size(), 1).l);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.G = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.H = z;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.J = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.K = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.M = z;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C1891jd0 c1891jd0) {
        this.L = c1891jd0;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.I = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.A = drawable;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.C = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.u = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.F = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.E = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.y = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    abstractC2268nU.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.z = z;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.x = i;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    abstractC2268nU.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.v = colorStateList;
        AbstractC2268nU[] abstractC2268nUArr = this.q;
        if (abstractC2268nUArr != null) {
            for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                abstractC2268nU.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.p = i;
    }

    public void setPresenter(C2655rU c2655rU) {
        this.O = c2655rU;
    }
}
