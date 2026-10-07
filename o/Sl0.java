package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Sl0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static Sl0 v;
    public static Sl0 w;
    public final View l;
    public final CharSequence m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rl0 f519o;
    public final Rl0 p;
    public int q;
    public int r;
    public Tl0 s;
    public boolean t;
    public boolean u;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.Rl0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.Rl0] */
    public Sl0(View view, CharSequence charSequence) {
        final int i = 0;
        this.f519o = new Runnable(this) { // from class: o.Rl0
            public final /* synthetic */ Sl0 m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.m.c(false);
                        break;
                    default:
                        this.m.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.p = new Runnable(this) { // from class: o.Rl0
            public final /* synthetic */ Sl0 m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.m.c(false);
                        break;
                    default:
                        this.m.a();
                        break;
                }
            }
        };
        this.l = view;
        this.m = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = Mt0.a;
        this.n = Build.VERSION.SDK_INT >= 28 ? Kt0.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.u = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(Sl0 sl0) {
        Sl0 sl1 = v;
        if (sl1 != null) {
            sl1.l.removeCallbacks(sl1.f519o);
        }
        v = sl0;
        if (sl0 != null) {
            sl0.l.postDelayed(sl0.f519o, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        Sl0 sl0 = w;
        View view = this.l;
        if (sl0 == this) {
            w = null;
            Tl0 tl0 = this.s;
            if (tl0 != null) {
                View view2 = (View) tl0.m;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) tl0.l).getSystemService("window")).removeView(view2);
                }
                this.s = null;
                this.u = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.p);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.l;
        if (view.isAttachedToWindow()) {
            b(null);
            Sl0 sl0 = w;
            if (sl0 != null) {
                sl0.a();
            }
            w = this;
            this.t = z;
            Tl0 tl0 = new Tl0(view.getContext());
            this.s = tl0;
            int width = this.q;
            int i3 = this.r;
            boolean z2 = this.t;
            View view2 = (View) tl0.m;
            ViewParent parent = view2.getParent();
            Context context = (Context) tl0.l;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) tl0.n).setText(this.m);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) tl0.f542o;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView != null) {
                Rect rect = (Rect) tl0.p;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) tl0.r;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) tl0.q;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.t) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = It0.a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            Rl0 rl0 = this.p;
            view.removeCallbacks(rl0);
            view.postDelayed(rl0, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.s != null && this.t) {
            return false;
        }
        View view2 = this.l;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.u = true;
                a();
            }
        } else if (view2.isEnabled() && this.s == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.u) {
                this.q = x;
                this.r = y;
                this.u = false;
                b(this);
            } else {
                int iAbs = Math.abs(x - this.q);
                int i = this.n;
                if (iAbs > i || Math.abs(y - this.r) > i) {
                    this.q = x;
                    this.r = y;
                    this.u = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.q = view.getWidth() / 2;
        this.r = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
