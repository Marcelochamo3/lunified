package o;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: o.Tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788Tl extends C1617gm0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    public C0788Tl(Context context) {
        i(context);
        k(context);
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        f();
    }

    @Override // o.C1617gm0
    public final void a(int i) {
        super.a(i);
    }

    @Override // o.C1617gm0
    public final C1617gm0 d(int i, int i2) {
        super.d(i, i2);
        return this;
    }

    public final C0814Ul e() {
        return new C0814Ul(this);
    }

    public final void f() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
    }

    public final C1617gm0 g() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        return this;
    }

    public final void h(C1519fm0 c1519fm0) {
        Zl0 zl0 = c1519fm0.l;
        a(zl0.n);
        this.y.put(zl0, c1519fm0);
    }

    public final void i(Context context) {
        CaptioningManager captioningManager;
        int i = Lr0.a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = AbstractC0985aF.q(i >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
        }
    }

    public final void j(int i, boolean z) {
        if (z) {
            this.z.add(Integer.valueOf(i));
        } else {
            this.z.remove(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    public final void k(Context context) {
        Point point;
        DisplayManager displayManager;
        int i = Lr0.a;
        Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && Lr0.J(context)) {
            String strC = i < 28 ? Lr0.C("sys.display-size") : Lr0.C("vendor.display-size");
            if (!TextUtils.isEmpty(strC)) {
                try {
                    String[] strArrSplit = strC.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            point = new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AP.f();
                if (!"Sony".equals(Lr0.c) && Lr0.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    point = new Point();
                    if (i >= 23) {
                        Display.Mode mode = display.getMode();
                        point.x = mode.getPhysicalWidth();
                        point.y = mode.getPhysicalHeight();
                    } else if (i >= 17) {
                        display.getRealSize(point);
                    } else {
                        display.getSize(point);
                    }
                }
            } else if (!"Sony".equals(Lr0.c)) {
                point = new Point();
                if (i >= 23) {
                    Display.Mode mode2 = display.getMode();
                    point.x = mode2.getPhysicalWidth();
                    point.y = mode2.getPhysicalHeight();
                } else if (i >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            } else {
                point = new Point();
                if (i >= 23) {
                    Display.Mode mode3 = display.getMode();
                    point.x = mode3.getPhysicalWidth();
                    point.y = mode3.getPhysicalHeight();
                } else if (i >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            }
        } else {
            point = new Point();
            if (i >= 23) {
                Display.Mode mode4 = display.getMode();
                point.x = mode4.getPhysicalWidth();
                point.y = mode4.getPhysicalHeight();
            } else if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
        }
        d(point.x, point.y);
    }

    public C0788Tl(C0814Ul c0814Ul) {
        b(c0814Ul);
        this.A = c0814Ul.L;
        this.B = c0814Ul.M;
        this.C = c0814Ul.N;
        this.D = c0814Ul.O;
        this.E = c0814Ul.P;
        this.F = c0814Ul.Q;
        this.G = c0814Ul.R;
        this.H = c0814Ul.S;
        this.I = c0814Ul.T;
        this.J = c0814Ul.U;
        this.K = c0814Ul.V;
        this.L = c0814Ul.W;
        this.M = c0814Ul.X;
        this.N = c0814Ul.Y;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c0814Ul.Z;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.O = sparseArray;
                this.P = c0814Ul.a0.clone();
                return;
            }
        }
    }

    public C0788Tl() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        f();
    }
}
