package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class JK implements Id0 {
    public static final Method L;
    public static final Method M;
    public static final Method N;
    public AdapterView.OnItemClickListener A;
    public AdapterView.OnItemSelectedListener B;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final C2527q4 K;
    public final Context l;
    public ListAdapter m;
    public C0687Po n;
    public int q;
    public int r;
    public boolean t;
    public boolean u;
    public boolean v;
    public GK y;
    public View z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f340o = -2;
    public int p = -2;
    public final int s = 1002;
    public int w = 0;
    public final int x = Integer.MAX_VALUE;
    public final FK C = new FK(this, 1);
    public final IK D = new IK(0, this);
    public final HK E = new HK(this);
    public final FK F = new FK(this, 0);
    public final Rect H = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                M = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public JK(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.l = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T40.f528o, i, i2);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.t = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2527q4 c2527q4 = new C2527q4(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, T40.s, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC1474fG.Q(c2527q4, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2527q4.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : Ou0.l(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.K = c2527q4;
        c2527q4.setInputMethodMode(1);
    }

    public C0687Po a(Context context, boolean z) {
        return new C0687Po(context, z);
    }

    @Override // o.Id0
    public final boolean b() {
        return this.K.isShowing();
    }

    public final int c() {
        return this.q;
    }

    @Override // o.Id0
    public final void dismiss() {
        C2527q4 c2527q4 = this.K;
        c2527q4.dismiss();
        c2527q4.setContentView(null);
        this.n = null;
        this.G.removeCallbacks(this.C);
    }

    @Override // o.Id0
    public final void e() {
        int i;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        C0687Po c0687Po;
        int i2 = 1;
        C0687Po c0687Po2 = this.n;
        C2527q4 c2527q4 = this.K;
        Context context = this.l;
        if (c0687Po2 == null) {
            C0687Po c0687PoA = a(context, !this.J);
            this.n = c0687PoA;
            c0687PoA.setAdapter(this.m);
            this.n.setOnItemClickListener(this.A);
            this.n.setFocusable(true);
            this.n.setFocusableInTouchMode(true);
            this.n.setOnItemSelectedListener(new C0713Qo(i2, this));
            this.n.setOnScrollListener(this.E);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.B;
            if (onItemSelectedListener != null) {
                this.n.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2527q4.setContentView(this.n);
        }
        Drawable background = c2527q4.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.t) {
                this.r = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c2527q4.getInputMethodMode() == 2;
        View view = this.z;
        int i4 = this.r;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = M;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c2527q4, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    iA = c2527q4.getMaxAvailableHeight(view, i4);
                }
            } else {
                iA = c2527q4.getMaxAvailableHeight(view, i4);
            }
        } else {
            iA = DK.a(c2527q4, view, i4, z);
        }
        int i5 = this.f340o;
        if (i5 == -1) {
            paddingBottom = iA + i;
        } else {
            int i6 = this.p;
            if (i6 != -2) {
                iMakeMeasureSpec = i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.n.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.n.getPaddingBottom() + this.n.getPaddingTop() + i : 0);
        }
        boolean z2 = this.K.getInputMethodMode() == 2;
        AbstractC1474fG.R(c2527q4, this.s);
        if (c2527q4.isShowing()) {
            if (this.z.isAttachedToWindow()) {
                int width = this.p;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.z.getWidth();
                }
                if (i5 == -1) {
                    i5 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c2527q4.setWidth(this.p == -1 ? -1 : 0);
                        c2527q4.setHeight(0);
                    } else {
                        c2527q4.setWidth(this.p == -1 ? -1 : 0);
                        c2527q4.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c2527q4.setOutsideTouchable(true);
                c2527q4.update(this.z, this.q, this.r, width < 0 ? -1 : width, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.p;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.z.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c2527q4.setWidth(width2);
        c2527q4.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = L;
            if (method2 != null) {
                try {
                    method2.invoke(c2527q4, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            EK.b(c2527q4, true);
        }
        c2527q4.setOutsideTouchable(true);
        c2527q4.setTouchInterceptor(this.D);
        if (this.v) {
            AbstractC1474fG.Q(c2527q4, this.u);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = N;
            if (method3 != null) {
                try {
                    method3.invoke(c2527q4, this.I);
                } catch (Exception unused3) {
                }
            }
        } else {
            EK.a(c2527q4, this.I);
        }
        c2527q4.showAsDropDown(this.z, this.q, this.r, this.w);
        this.n.setSelection(-1);
        if ((!this.J || this.n.isInTouchMode()) && (c0687Po = this.n) != null) {
            c0687Po.setListSelectionHidden(true);
            c0687Po.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    public final Drawable f() {
        return this.K.getBackground();
    }

    @Override // o.Id0
    public final C0687Po h() {
        return this.n;
    }

    public final void j(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.r = i;
        this.t = true;
    }

    public final void m(int i) {
        this.q = i;
    }

    public final int o() {
        if (this.t) {
            return this.r;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        GK gk = this.y;
        if (gk == null) {
            this.y = new GK(this);
        } else {
            ListAdapter listAdapter2 = this.m;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(gk);
            }
        }
        this.m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y);
        }
        C0687Po c0687Po = this.n;
        if (c0687Po != null) {
            c0687Po.setAdapter(this.m);
        }
    }

    public final void r(int i) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.p = i;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.p = rect.left + rect.right + i;
    }
}
