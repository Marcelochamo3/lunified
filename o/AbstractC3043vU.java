package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.vU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3043vU extends FrameLayout {
    public final C2365oU l;
    public final C1564g9 m;
    public final C2655rU n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Kh0 f1073o;
    public InterfaceC2849tU p;

    public AbstractC3043vU(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC1459f50.Q(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView), attributeSet, i);
        C2655rU c2655rU = new C2655rU();
        c2655rU.m = false;
        this.n = c2655rU;
        Context context2 = getContext();
        RN rnV = AbstractC1923jt0.v(context2, attributeSet, H40.w, i, R.style.Widget_Design_BottomNavigationView, 12, 10);
        C2365oU c2365oU = new C2365oU(context2, getClass(), getMaxItemCount());
        this.l = c2365oU;
        C1564g9 c1564g9 = new C1564g9(context2);
        this.m = c1564g9;
        c2655rU.l = c1564g9;
        c2655rU.n = 1;
        c1564g9.setPresenter(c2655rU);
        c2365oU.b(c2655rU, c2365oU.a);
        getContext();
        c2655rU.l.P = c2365oU;
        TypedArray typedArray = (TypedArray) rnV.n;
        if (typedArray.hasValue(6)) {
            c1564g9.setIconTintList(rnV.s(6));
        } else {
            c1564g9.setIconTintList(c1564g9.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(rnV.s(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListR = Jp0.r(background);
        if (background == null || colorStateListR != null) {
            C2068lO c2068lO = new C2068lO(C1891jd0.b(context2, attributeSet, i, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListR != null) {
                c2068lO.l(colorStateListR);
            }
            c2068lO.j(context2);
            WeakHashMap weakHashMap = It0.a;
            setBackground(c2068lO);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        AbstractC2205mo.h(getBackground().mutate(), AbstractC3021v9.m(context2, rnV, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            c1564g9.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(AbstractC3021v9.m(context2, rnV, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, H40.v);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(AbstractC3021v9.l(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(C1891jd0.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new C2421p(0)).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            c2655rU.m = true;
            getMenuInflater().inflate(resourceId3, c2365oU);
            c2655rU.m = false;
            c2655rU.d(true);
        }
        rnV.A();
        addView(c1564g9);
        c2365oU.e = new C0334By(19, (AbstractC1856j9) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f1073o == null) {
            this.f1073o = new Kh0(getContext());
        }
        return this.f1073o;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.m.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.m.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.m.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.m.getItemActiveIndicatorMarginHorizontal();
    }

    public C1891jd0 getItemActiveIndicatorShapeAppearance() {
        return this.m.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.m.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.m.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.m.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.m.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.m.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.m.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.m.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.m.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.m.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.m.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.m.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.m.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.l;
    }

    public InterfaceC2845tQ getMenuView() {
        return this.m;
    }

    public C2655rU getPresenter() {
        return this.n;
    }

    public int getSelectedItemId() {
        return this.m.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2068lO) {
            AbstractC3409z9.C(this, (C2068lO) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2946uU)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2946uU c2946uU = (C2946uU) parcelable;
        super.onRestoreInstanceState(c2946uU.l);
        Bundle bundle = c2946uU.n;
        C2365oU c2365oU = this.l;
        c2365oU.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = c2365oU.u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
                if (interfaceC2651rQ == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int i = interfaceC2651rQ.i();
                    if (i > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(i)) != null) {
                        interfaceC2651rQ.c(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        C2946uU c2946uU = new C2946uU(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c2946uU.n = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.l.u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC2651rQ interfaceC2651rQ = (InterfaceC2651rQ) weakReference.get();
                if (interfaceC2651rQ == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int i = interfaceC2651rQ.i();
                    if (i > 0 && (parcelableL = interfaceC2651rQ.l()) != null) {
                        sparseArray.put(i, parcelableL);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return c2946uU;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.m.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2068lO) {
            ((C2068lO) background).k(f);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.m.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.m.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.m.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.m.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C1891jd0 c1891jd0) {
        this.m.setItemActiveIndicatorShapeAppearance(c1891jd0);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.m.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.m.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.m.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.m.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.m.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.m.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.m.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.m.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.m.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.m.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.m.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.m.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C1564g9 c1564g9 = this.m;
        if (c1564g9.getLabelVisibilityMode() != i) {
            c1564g9.setLabelVisibilityMode(i);
            this.n.d(false);
        }
    }

    public void setOnItemSelectedListener(InterfaceC2849tU interfaceC2849tU) {
        this.p = interfaceC2849tU;
    }

    public void setSelectedItemId(int i) {
        C2365oU c2365oU = this.l;
        MenuItem menuItemFindItem = c2365oU.findItem(i);
        if (menuItemFindItem == null || c2365oU.q(menuItemFindItem, this.n, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(InterfaceC2752sU interfaceC2752sU) {
    }
}
