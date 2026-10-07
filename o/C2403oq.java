package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.skidush.clonex.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2403oq extends LinearLayout {
    public CharSequence A;
    public final T4 B;
    public boolean C;
    public EditText D;
    public final AccessibilityManager E;
    public C2278nc F;
    public final C2209mq G;
    public final TextInputLayout l;
    public final FrameLayout m;
    public final CheckableImageButton n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f954o;
    public PorterDuff.Mode p;
    public View.OnLongClickListener q;
    public final CheckableImageButton r;
    public final C0709Qk s;
    public int t;
    public final LinkedHashSet u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public int x;
    public ImageView.ScaleType y;
    public View.OnLongClickListener z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2403oq(TextInputLayout textInputLayout, RN rn) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 1;
        this.t = 0;
        this.u = new LinkedHashSet();
        this.G = new C2209mq(this);
        C2306nq c2306nq = new C2306nq(this);
        this.E = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.l = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.m = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.n = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.r = checkableImageButtonA2;
        C0709Qk c0709Qk = new C0709Qk();
        c0709Qk.n = new SparseArray();
        c0709Qk.f477o = this;
        TypedArray typedArray = (TypedArray) rn.n;
        c0709Qk.l = typedArray.getResourceId(28, 0);
        c0709Qk.m = typedArray.getResourceId(52, 0);
        this.s = c0709Qk;
        T4 t4 = new T4(getContext(), null);
        this.B = t4;
        TypedArray typedArray2 = (TypedArray) rn.n;
        if (typedArray2.hasValue(38)) {
            this.f954o = AbstractC3021v9.m(getContext(), rn, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.p = AbstractC3409z9.y(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(rn.u(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = It0.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.v = AbstractC3021v9.m(getContext(), rn, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.w = AbstractC3409z9.y(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.v = AbstractC3021v9.m(getContext(), rn, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.w = AbstractC3409z9.y(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.x) {
            this.x = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeL = AbstractC1459f50.l(typedArray2.getInt(31, -1));
            this.y = scaleTypeL;
            checkableImageButtonA2.setScaleType(scaleTypeL);
            checkableImageButtonA.setScaleType(scaleTypeL);
        }
        t4.setVisibility(8);
        t4.setId(R.id.textinput_suffix_text);
        t4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        t4.setAccessibilityLiveRegion(1);
        AbstractC3045vW.L(t4, typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            t4.setTextColor(rn.s(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.A = TextUtils.isEmpty(text3) ? null : text3;
        t4.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(t4);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.p0.add(c2306nq);
        if (textInputLayout.f45o != null) {
            c2306nq.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0674Pb(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(D80.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        if (AbstractC3021v9.s(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC2500pq b() {
        AbstractC2500pq c3356yi;
        int i = this.t;
        C0709Qk c0709Qk = this.s;
        SparseArray sparseArray = (SparseArray) c0709Qk.n;
        AbstractC2500pq c3434zX = (AbstractC2500pq) sparseArray.get(i);
        if (c3434zX == null) {
            C2403oq c2403oq = (C2403oq) c0709Qk.f477o;
            if (i == -1) {
                c3356yi = new C3356yi(c2403oq, 0);
            } else if (i != 0) {
                if (i == 1) {
                    c3434zX = new C3434zX(c2403oq, c0709Qk.m);
                } else if (i == 2) {
                    c3356yi = new C0314Be(c2403oq);
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException(AbstractC1674hK.n(i, "Invalid end icon mode: "));
                    }
                    c3356yi = new C0869Wo(c2403oq);
                }
                sparseArray.append(i, c3434zX);
            } else {
                c3356yi = new C3356yi(c2403oq, 1);
            }
            c3434zX = c3356yi;
            sparseArray.append(i, c3434zX);
        }
        return c3434zX;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.r;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = It0.a;
        return this.B.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.m.getVisibility() == 0 && this.r.getVisibility() == 0;
    }

    public final boolean e() {
        return this.n.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC2500pq abstractC2500pqB = b();
        boolean zK = abstractC2500pqB.k();
        CheckableImageButton checkableImageButton = this.r;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.f43o) == abstractC2500pqB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC2500pqB instanceof C0869Wo) || (zIsActivated = checkableImageButton.isActivated()) == abstractC2500pqB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC1459f50.J(this.l, checkableImageButton, this.v);
        }
    }

    public final void g(int i) {
        if (this.t == i) {
            return;
        }
        AbstractC2500pq abstractC2500pqB = b();
        C2278nc c2278nc = this.F;
        AccessibilityManager accessibilityManager = this.E;
        if (c2278nc != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3100w0(c2278nc));
        }
        this.F = null;
        abstractC2500pqB.s();
        this.t = i;
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            throw null;
        }
        h(i != 0);
        AbstractC2500pq abstractC2500pqB2 = b();
        int iD = this.s.l;
        if (iD == 0) {
            iD = abstractC2500pqB2.d();
        }
        Drawable drawableL = iD != 0 ? Ou0.l(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.r;
        checkableImageButton.setImageDrawable(drawableL);
        TextInputLayout textInputLayout = this.l;
        if (drawableL != null) {
            AbstractC1459f50.d(textInputLayout, checkableImageButton, this.v, this.w);
            AbstractC1459f50.J(textInputLayout, checkableImageButton, this.v);
        }
        int iC = abstractC2500pqB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC2500pqB2.k());
        if (!abstractC2500pqB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC2500pqB2.r();
        C2278nc c2278ncH = abstractC2500pqB2.h();
        this.F = c2278ncH;
        if (c2278ncH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = It0.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3100w0(this.F));
            }
        }
        View.OnClickListener onClickListenerF = abstractC2500pqB2.f();
        View.OnLongClickListener onLongClickListener = this.z;
        checkableImageButton.setOnClickListener(onClickListenerF);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
        EditText editText = this.D;
        if (editText != null) {
            abstractC2500pqB2.m(editText);
            j(abstractC2500pqB2);
        }
        AbstractC1459f50.d(textInputLayout, checkableImageButton, this.v, this.w);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.r.setVisibility(z ? 0 : 8);
            k();
            m();
            this.l.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.n;
        checkableImageButton.setImageDrawable(drawable);
        l();
        AbstractC1459f50.d(this.l, checkableImageButton, this.f954o, this.p);
    }

    public final void j(AbstractC2500pq abstractC2500pq) {
        if (this.D == null) {
            return;
        }
        if (abstractC2500pq.e() != null) {
            this.D.setOnFocusChangeListener(abstractC2500pq.e());
        }
        if (abstractC2500pq.g() != null) {
            this.r.setOnFocusChangeListener(abstractC2500pq.g());
        }
    }

    public final void k() {
        this.m.setVisibility((this.r.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.A == null || this.C) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.n;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.l;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.u.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.t != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.l;
        if (textInputLayout.f45o == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f45o;
            WeakHashMap weakHashMap = It0.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f45o.getPaddingTop();
        int paddingBottom = textInputLayout.f45o.getPaddingBottom();
        WeakHashMap weakHashMap2 = It0.a;
        this.B.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        T4 t4 = this.B;
        int visibility = t4.getVisibility();
        int i = (this.A == null || this.C) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        t4.setVisibility(i);
        this.l.q();
    }
}
