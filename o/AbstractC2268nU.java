package o;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.nU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2268nU extends FrameLayout implements InterfaceC2748sQ {
    public static final int[] R = {R.attr.state_checked};
    public static final C3325yL S = new C3325yL();
    public static final C2171mU T = new C2171mU();
    public final TextView A;
    public final TextView B;
    public int C;
    public int D;
    public C1386eQ E;
    public ColorStateList F;
    public Drawable G;
    public Drawable H;
    public ValueAnimator I;
    public C3325yL J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public J7 Q;
    public boolean l;
    public ColorStateList m;
    public Drawable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f936o;
    public int p;
    public int q;
    public float r;
    public float s;
    public float t;
    public int u;
    public boolean v;
    public final FrameLayout w;
    public final View x;
    public final ImageView y;
    public final ViewGroup z;

    public AbstractC2268nU(Context context) {
        super(context);
        this.l = false;
        this.C = -1;
        this.D = 0;
        this.J = S;
        this.K = 0.0f;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.P = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.w = (FrameLayout) findViewById(com.skidush.clonex.R.id.navigation_bar_item_icon_container);
        this.x = findViewById(com.skidush.clonex.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.skidush.clonex.R.id.navigation_bar_item_icon_view);
        this.y = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.skidush.clonex.R.id.navigation_bar_item_labels_group);
        this.z = viewGroup;
        TextView textView = (TextView) findViewById(com.skidush.clonex.R.id.navigation_bar_item_small_label_view);
        this.A = textView;
        TextView textView2 = (TextView) findViewById(com.skidush.clonex.R.id.navigation_bar_item_large_label_view);
        this.B = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f936o = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.p = viewGroup.getPaddingBottom();
        this.q = getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = It0.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1368e9(1, (C1466f9) this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static void f(TextView textView, int i) {
        int iRound;
        AbstractC3045vW.L(textView, i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, H40.D);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void g(TextView textView, float f, float f2, int i) {
        textView.setScaleX(f);
        textView.setScaleY(f2);
        textView.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.w;
        return frameLayout != null ? frameLayout : this.y;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC2268nU) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        J7 j7 = this.Q;
        int minimumWidth = j7 == null ? 0 : j7.getMinimumWidth() - this.Q.p.b.H.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.y.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void k(ViewGroup viewGroup, int i) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    @Override // o.InterfaceC2748sQ
    public final void a(C1386eQ c1386eQ) {
        this.E = c1386eQ;
        setCheckable(c1386eQ.isCheckable());
        setChecked(c1386eQ.isChecked());
        setEnabled(c1386eQ.isEnabled());
        setIcon(c1386eQ.getIcon());
        setTitle(c1386eQ.e);
        setId(c1386eQ.a);
        if (!TextUtils.isEmpty(c1386eQ.q)) {
            setContentDescription(c1386eQ.q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(c1386eQ.r) ? c1386eQ.r : c1386eQ.e;
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1923jt0.H(this, charSequence);
        }
        setVisibility(c1386eQ.isVisible() ? 0 : 8);
        this.l = true;
    }

    public final void b(float f, float f2) {
        this.r = f - f2;
        this.s = (f2 * 1.0f) / f;
        this.t = (f * 1.0f) / f2;
    }

    public final void c() {
        C1386eQ c1386eQ = this.E;
        if (c1386eQ != null) {
            setChecked(c1386eQ.isChecked());
        }
    }

    public final void d() {
        Drawable rippleDrawable = this.n;
        ColorStateList colorStateList = this.m;
        FrameLayout frameLayout = this.w;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.L && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(AbstractC1376eG.D(this.m), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList2 = this.m;
                int iS = AbstractC1376eG.s(colorStateList2, AbstractC1376eG.k);
                int[] iArr = AbstractC1376eG.j;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{AbstractC1376eG.l, iArr, StateSet.NOTHING}, new int[]{iS, AbstractC1376eG.s(colorStateList2, iArr), AbstractC1376eG.s(colorStateList2, AbstractC1376eG.i)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = It0.a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.w;
        if (frameLayout != null && this.L) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f, float f2) {
        View view = this.x;
        if (view != null) {
            C3325yL c3325yL = this.J;
            c3325yL.getClass();
            view.setScaleX(AbstractC1161c3.a(0.4f, 1.0f, f));
            view.setScaleY(c3325yL.t(f, f2));
            view.setAlpha(AbstractC1161c3.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.K = f;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.x;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public J7 getBadge() {
        return this.Q;
    }

    public int getItemBackgroundResId() {
        return com.skidush.clonex.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // o.InterfaceC2748sQ
    public C1386eQ getItemData() {
        return this.E;
    }

    public int getItemDefaultMarginResId() {
        return com.skidush.clonex.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.C;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.q : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(ImageView imageView) {
        if (this.Q != null) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                J7 j7 = this.Q;
                if (j7 != null) {
                    if (j7.c() != null) {
                        j7.c().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(j7);
                    }
                }
            }
            this.Q = null;
        }
    }

    public final void j(int i) {
        View view = this.x;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.M, i - (this.P * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.O && this.u == 2) ? iMin : this.N;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1386eQ c1386eQ = this.E;
        if (c1386eQ != null && c1386eQ.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        J7 j7 = this.Q;
        if (j7 != null && j7.isVisible()) {
            C1386eQ c1386eQ = this.E;
            CharSequence charSequence = c1386eQ.e;
            if (!TextUtils.isEmpty(c1386eQ.q)) {
                charSequence = this.E.q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            J7 j8 = this.Q;
            CharSequence quantityString = null;
            if (j8.isVisible()) {
                K7 k7 = j8.p.b;
                String str = k7.u;
                if (str != null) {
                    CharSequence charSequence2 = k7.z;
                    quantityString = charSequence2 != null ? charSequence2 : str;
                } else if (!j8.f()) {
                    quantityString = k7.A;
                } else if (k7.B != 0 && (context = (Context) j8.l.get()) != null) {
                    if (j8.s != -2) {
                        int iD = j8.d();
                        int i = j8.s;
                        if (iD <= i) {
                            quantityString = context.getResources().getQuantityString(k7.B, j8.d(), Integer.valueOf(j8.d()));
                        } else {
                            quantityString = context.getString(k7.C, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(k7.B, j8.d(), Integer.valueOf(j8.d()));
                    }
                }
            }
            sb.append((Object) quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) M0.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) F0.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.skidush.clonex.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC0907Ya(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.x;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.L = z;
        d();
        View view = this.x;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.N = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.q != i) {
            this.q = i;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.P = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.O = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.M = i;
        j(getWidth());
    }

    public void setBadge(J7 j7) {
        J7 j8 = this.Q;
        if (j8 == j7) {
            return;
        }
        boolean z = j8 != null;
        ImageView imageView = this.y;
        if (z && imageView != null) {
            i(imageView);
        }
        this.Q = j7;
        if (imageView == null || j7 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        J7 j9 = this.Q;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        j9.setBounds(rect);
        j9.h(imageView, null);
        if (j9.c() != null) {
            j9.c().setForeground(j9);
        } else {
            imageView.getOverlay().add(j9);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    public void setChecked(boolean z) {
        TextView textView = this.B;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.A;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.L && this.l) {
            WeakHashMap weakHashMap = It0.a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.I = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.K, f);
                this.I = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C2074lU(this, f));
                this.I.setInterpolator(AbstractC3045vW.E(getContext(), com.skidush.clonex.R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.b));
                this.I.setDuration(AbstractC3045vW.D(getContext(), com.skidush.clonex.R.attr.motionDurationLong2, getResources().getInteger(com.skidush.clonex.R.integer.material_motion_duration_long_1)));
                this.I.start();
            } else {
                e(f, f);
            }
        } else {
            e(f, f);
        }
        int i = this.u;
        ViewGroup viewGroup = this.z;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    h(getIconOrContainer(), this.f936o, 49);
                    k(viewGroup, this.p);
                    textView.setVisibility(0);
                } else {
                    h(getIconOrContainer(), this.f936o, 17);
                    k(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                k(viewGroup, this.p);
                if (z) {
                    h(getIconOrContainer(), (int) (this.f936o + this.r), 49);
                    g(textView, 1.0f, 1.0f, 0);
                    float f2 = this.s;
                    g(textView2, f2, f2, 4);
                } else {
                    h(getIconOrContainer(), this.f936o, 49);
                    float f3 = this.t;
                    g(textView, f3, f3, 4);
                    g(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                h(getIconOrContainer(), this.f936o, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.v) {
            if (z) {
                h(getIconOrContainer(), this.f936o, 49);
                k(viewGroup, this.p);
                textView.setVisibility(0);
            } else {
                h(getIconOrContainer(), this.f936o, 17);
                k(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            k(viewGroup, this.p);
            if (z) {
                h(getIconOrContainer(), (int) (this.f936o + this.r), 49);
                g(textView, 1.0f, 1.0f, 0);
                float f4 = this.s;
                g(textView2, f4, f4, 4);
            } else {
                h(getIconOrContainer(), this.f936o, 49);
                float f5 = this.t;
                g(textView, f5, f5, 4);
                g(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        C0334By c0334By;
        super.setEnabled(z);
        this.A.setEnabled(z);
        this.B.setEnabled(z);
        this.y.setEnabled(z);
        Object obj = null;
        if (!z) {
            It0.r(this, null);
            return;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c0334By = new C0334By(26, AbstractC1355e20.b(context, 1002));
        } else {
            c0334By = new C0334By(26, obj);
        }
        It0.r(this, c0334By);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.G) {
            return;
        }
        this.G = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC3045vW.R(drawable).mutate();
            this.H = drawable;
            ColorStateList colorStateList = this.F;
            if (colorStateList != null) {
                AbstractC2205mo.h(drawable, colorStateList);
            }
        }
        this.y.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.y;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.F = colorStateList;
        if (this.E == null || (drawable = this.H) == null) {
            return;
        }
        AbstractC2205mo.h(drawable, colorStateList);
        this.H.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : AbstractC3354yh.b(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.p != i) {
            this.p = i;
            c();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f936o != i) {
            this.f936o = i;
            c();
        }
    }

    public void setItemPosition(int i) {
        this.C = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.m = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.u != i) {
            this.u = i;
            if (this.O && i == 2) {
                this.J = T;
            } else {
                this.J = S;
            }
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z) {
        if (this.v != z) {
            this.v = z;
            c();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.D = i;
        TextView textView = this.B;
        f(textView, i);
        b(this.A.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.D);
        TextView textView = this.B;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.A;
        f(textView, i);
        b(textView.getTextSize(), this.B.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.A.setTextColor(colorStateList);
            this.B.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
        this.B.setText(charSequence);
        C1386eQ c1386eQ = this.E;
        if (c1386eQ == null || TextUtils.isEmpty(c1386eQ.q)) {
            setContentDescription(charSequence);
        }
        C1386eQ c1386eQ2 = this.E;
        if (c1386eQ2 != null && !TextUtils.isEmpty(c1386eQ2.r)) {
            charSequence = this.E.r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1923jt0.H(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.n = drawable;
        d();
    }
}
