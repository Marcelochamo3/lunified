package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skidush.clonex.R;
import java.util.WeakHashMap;
import o.AbstractC3185wt0;
import o.C2372oa0;
import o.C2469pa0;
import o.It0;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public final C2372oa0 A;
    public ValueAnimator B;
    public final C2372oa0 C;
    public View.OnClickListener l;
    public final View m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f25o;
    public Drawable p;
    public C2469pa0 q;
    public final float r;
    public final int s;
    public final int t;
    public final float u;
    public final float v;
    public ValueAnimator w;
    public boolean x;
    public boolean y;
    public final ArgbEvaluator z;

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public final void a(boolean z) {
        float f = z ? this.r : 1.0f;
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.m.animate().scaleX(f).scaleY(f);
        long j = this.t;
        viewPropertyAnimatorScaleY.setDuration(j).start();
        if (this.B == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.B = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.C);
        }
        if (z) {
            this.B.start();
        } else {
            this.B.reverse();
        }
        this.B.setDuration(j);
        this.x = z;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.w = null;
        }
        if (this.x && this.y) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.z, Integer.valueOf(this.q.a), Integer.valueOf(this.q.b), Integer.valueOf(this.q.a));
            this.w = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.w.setDuration(this.s * 2);
            this.w.addUpdateListener(this.A);
            this.w.start();
        }
    }

    public float getFocusedZoom() {
        return this.r;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.q.a;
    }

    public C2469pa0 getOrbColors() {
        return this.q;
    }

    public Drawable getOrbIcon() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.l;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.y = false;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new C2469pa0(i, i, 0));
    }

    public void setOrbColors(C2469pa0 c2469pa0) {
        this.q = c2469pa0;
        this.f25o.setColorFilter(c2469pa0.c);
        if (this.w == null) {
            setOrbViewColor(this.q.a);
        } else {
            this.x = true;
            b();
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.p = drawable;
        this.f25o.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i) {
        View view = this.n;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public void setSearchOrbZ(float f) {
        float f2 = this.v;
        float f3 = this.u;
        float f4 = ((f2 - f3) * f) + f3;
        WeakHashMap weakHashMap = It0.a;
        AbstractC3185wt0.x(this.n, f4);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new ArgbEvaluator();
        this.A = new C2372oa0(this, 0);
        this.C = new C2372oa0(this, 1);
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.m = viewInflate;
        this.n = viewInflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f25o = imageView;
        this.r = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.s = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.t = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.v = dimensionPixelSize;
        this.u = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        int[] iArr = Q40.h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new C2469pa0(color, typedArrayObtainStyledAttributes.getColor(0, color), typedArrayObtainStyledAttributes.getColor(3, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        AbstractC3185wt0.x(imageView, dimensionPixelSize);
    }
}
