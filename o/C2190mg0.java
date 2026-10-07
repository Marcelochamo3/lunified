package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2190mg0 extends LinearLayout {
    public final TextInputLayout l;
    public final T4 m;
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckableImageButton f916o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public boolean u;

    public C2190mg0(TextInputLayout textInputLayout, RN rn) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.l = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f916o = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(D80.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        T4 t4 = new T4(getContext(), null);
        this.m = t4;
        if (AbstractC3021v9.s(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.t;
        checkableImageButton.setOnClickListener(null);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
        this.t = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1459f50.M(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) rn.n;
        if (typedArray.hasValue(69)) {
            this.p = AbstractC3021v9.m(getContext(), rn, 69);
        }
        if (typedArray.hasValue(70)) {
            this.q = AbstractC3409z9.y(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(rn.u(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.r) {
            this.r = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeL = AbstractC1459f50.l(typedArray.getInt(68, -1));
            this.s = scaleTypeL;
            checkableImageButton.setScaleType(scaleTypeL);
        }
        t4.setVisibility(8);
        t4.setId(R.id.textinput_prefix_text);
        t4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = It0.a;
        t4.setAccessibilityLiveRegion(1);
        AbstractC3045vW.L(t4, typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            t4.setTextColor(rn.s(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.n = TextUtils.isEmpty(text2) ? null : text2;
        t4.setText(text2);
        e();
        addView(checkableImageButton);
        addView(t4);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f916o;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = It0.a;
        return this.m.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f916o;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.p;
            PorterDuff.Mode mode = this.q;
            TextInputLayout textInputLayout = this.l;
            AbstractC1459f50.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            AbstractC1459f50.J(textInputLayout, checkableImageButton, this.p);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.t;
        checkableImageButton.setOnClickListener(null);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
        this.t = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1459f50.M(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.f916o;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.l.f45o;
        if (editText == null) {
            return;
        }
        if (this.f916o.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = It0.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = It0.a;
        this.m.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.n == null || this.u) ? 8 : 0;
        setVisibility((this.f916o.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.m.setVisibility(i);
        this.l.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
