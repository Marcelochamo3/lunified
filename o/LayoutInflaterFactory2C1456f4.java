package o;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1456f4 extends R3 implements XP, LayoutInflater.Factory2 {
    public static final Nd0 t0 = new Nd0(0);
    public static final int[] u0 = {R.attr.windowBackground};
    public static final boolean v0 = !"robolectric".equals(Build.FINGERPRINT);
    public Kh0 A;
    public CharSequence B;
    public InterfaceC0734Rj C;
    public T3 D;
    public T3 E;
    public AbstractC2908u1 F;
    public ActionBarContextView G;
    public PopupWindow H;
    public S3 I;
    public boolean L;
    public ViewGroup M;
    public TextView N;
    public View O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public C1358e4[] X;
    public C1358e4 Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public Configuration d0;
    public final int e0;
    public int f0;
    public int g0;
    public boolean h0;
    public C0968a4 i0;
    public C0968a4 j0;
    public boolean k0;
    public int l0;
    public boolean n0;
    public Rect o0;
    public Rect p0;
    public C1068b5 q0;
    public OnBackInvokedDispatcher r0;
    public OnBackInvokedCallback s0;
    public final Object u;
    public final Context v;
    public Window w;
    public Z3 x;
    public final H3 y;
    public C2416ow0 z;
    public C2509pu0 J = null;
    public final boolean K = true;
    public final S3 m0 = new S3(this, 0);

    public LayoutInflaterFactory2C1456f4(Context context, Window window, H3 h3, Object obj) {
        E3 e3 = null;
        this.e0 = -100;
        this.v = context;
        this.y = h3;
        this.u = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof E3)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    e3 = (E3) context;
                    break;
                }
            }
            if (e3 != null) {
                this.e0 = ((LayoutInflaterFactory2C1456f4) e3.w()).e0;
            }
        }
        if (this.e0 == -100) {
            Nd0 nd0 = t0;
            Integer num = (Integer) nd0.get(this.u.getClass().getName());
            if (num != null) {
                this.e0 = num.intValue();
                nd0.remove(this.u.getClass().getName());
            }
        }
        if (window != null) {
            k(window);
        }
        C1846j4.d();
    }

    public static C2356oL l(Context context) {
        C2356oL c2356oL;
        C2356oL c2356oLB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c2356oL = R3.n) == null) {
            return null;
        }
        C2356oL c2356oLV = v(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        InterfaceC2550qL interfaceC2550qL = c2356oL.a;
        if (i < 24) {
            c2356oLB = interfaceC2550qL.isEmpty() ? C2356oL.b : C2356oL.b(V3.b(interfaceC2550qL.get(0)));
        } else if (interfaceC2550qL.isEmpty()) {
            c2356oLB = C2356oL.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i2 < c2356oLV.a.size() + interfaceC2550qL.size()) {
                Locale locale = i2 < interfaceC2550qL.size() ? interfaceC2550qL.get(i2) : c2356oLV.a.get(i2 - interfaceC2550qL.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c2356oLB = C2356oL.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c2356oLB.a.isEmpty() ? c2356oLV : c2356oLB;
    }

    public static Configuration p(Context context, int i, C2356oL c2356oL, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c2356oL != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                W3.d(configuration2, c2356oL);
            } else {
                InterfaceC2550qL interfaceC2550qL = c2356oL.a;
                configuration2.setLocale(interfaceC2550qL.get(0));
                configuration2.setLayoutDirection(interfaceC2550qL.get(0));
            }
        }
        return configuration2;
    }

    public static C2356oL v(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? W3.b(configuration) : C2356oL.b(V3.b(configuration.locale));
    }

    public final int A(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return u(context).e();
                }
                return -1;
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.j0 == null) {
                    this.j0 = new C0968a4(this, context);
                }
                return this.j0.e();
            }
        }
        return i;
    }

    public final boolean B() {
        InterfaceC0760Sj interfaceC0760Sj;
        Jl0 jl0;
        boolean z = this.Z;
        this.Z = false;
        C1358e4 c1358e4X = x(0);
        if (c1358e4X.m) {
            if (!z) {
                o(c1358e4X, true);
            }
            return true;
        }
        AbstractC2908u1 abstractC2908u1 = this.F;
        if (abstractC2908u1 != null) {
            abstractC2908u1.a();
            return true;
        }
        y();
        C2416ow0 c2416ow0 = this.z;
        if (c2416ow0 == null || (interfaceC0760Sj = c2416ow0.h) == null || (jl0 = ((Ol0) interfaceC0760Sj).a.W) == null || jl0.m == null) {
            return false;
        }
        Jl0 jl1 = ((Ol0) interfaceC0760Sj).a.W;
        C1386eQ c1386eQ = jl1 == null ? null : jl1.m;
        if (c1386eQ != null) {
            c1386eQ.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.q.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(o.C1358e4 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutInflaterFactory2C1456f4.C(o.e4, android.view.KeyEvent):void");
    }

    public final boolean D(C1358e4 c1358e4, int i, KeyEvent keyEvent) {
        ZP zp;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1358e4.k || E(c1358e4, keyEvent)) && (zp = c1358e4.h) != null) {
            return zp.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean E(C1358e4 c1358e4, KeyEvent keyEvent) {
        InterfaceC0734Rj interfaceC0734Rj;
        InterfaceC0734Rj interfaceC0734Rj2;
        Resources.Theme themeNewTheme;
        InterfaceC0734Rj interfaceC0734Rj3;
        InterfaceC0734Rj interfaceC0734Rj4;
        if (this.c0) {
            return false;
        }
        if (c1358e4.k) {
            return true;
        }
        C1358e4 c1358e5 = this.Y;
        if (c1358e5 != null && c1358e5 != c1358e4) {
            o(c1358e5, false);
        }
        Window.Callback callback = this.w.getCallback();
        int i = c1358e4.a;
        if (callback != null) {
            c1358e4.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0734Rj4 = this.C) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0734Rj4;
            actionBarOverlayLayout.k();
            ((Ol0) actionBarOverlayLayout.p).l = true;
        }
        if (c1358e4.g == null) {
            ZP zp = c1358e4.h;
            if (zp == null || c1358e4.f748o) {
                if (zp == null) {
                    Context context = this.v;
                    if ((i == 0 || i == 108) && this.C != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.skidush.clonex.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.skidush.clonex.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.skidush.clonex.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0447Gh c0447Gh = new C0447Gh(context, 0);
                            c0447Gh.getTheme().setTo(themeNewTheme);
                            context = c0447Gh;
                        }
                    }
                    ZP zp2 = new ZP(context);
                    zp2.e = this;
                    ZP zp3 = c1358e4.h;
                    if (zp2 != zp3) {
                        if (zp3 != null) {
                            zp3.r(c1358e4.i);
                        }
                        c1358e4.h = zp2;
                        CK ck = c1358e4.i;
                        if (ck != null) {
                            zp2.b(ck, zp2.a);
                        }
                    }
                    if (c1358e4.h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0734Rj2 = this.C) != null) {
                    if (this.D == null) {
                        this.D = new T3(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0734Rj2).l(c1358e4.h, this.D);
                }
                c1358e4.h.w();
                if (!callback.onCreatePanelMenu(i, c1358e4.h)) {
                    ZP zp4 = c1358e4.h;
                    if (zp4 != null) {
                        if (zp4 != null) {
                            zp4.r(c1358e4.i);
                        }
                        c1358e4.h = null;
                    }
                    if (z && (interfaceC0734Rj = this.C) != null) {
                        ((ActionBarOverlayLayout) interfaceC0734Rj).l(null, this.D);
                    }
                    return false;
                }
                c1358e4.f748o = false;
            }
            c1358e4.h.w();
            Bundle bundle = c1358e4.p;
            if (bundle != null) {
                c1358e4.h.s(bundle);
                c1358e4.p = null;
            }
            if (!callback.onPreparePanel(0, c1358e4.g, c1358e4.h)) {
                if (z && (interfaceC0734Rj3 = this.C) != null) {
                    ((ActionBarOverlayLayout) interfaceC0734Rj3).l(null, this.D);
                }
                c1358e4.h.v();
                return false;
            }
            c1358e4.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c1358e4.h.v();
        }
        c1358e4.k = true;
        c1358e4.l = false;
        this.Y = c1358e4;
        return true;
    }

    public final void F() {
        if (this.L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.r0 != null && (x(0).m || this.F != null)) {
                z = true;
            }
            if (z && this.s0 == null) {
                this.s0 = Y3.b(this.r0, this);
            } else {
                if (z || (onBackInvokedCallback = this.s0) == null) {
                    return;
                }
                Y3.c(this.r0, onBackInvokedCallback);
                this.s0 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // o.XP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(o.ZP r6) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutInflaterFactory2C1456f4.N(o.ZP):void");
    }

    @Override // o.R3
    public final void b() {
        String strP;
        this.a0 = true;
        j(false, true);
        t();
        Object obj = this.u;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strP = AbstractC3409z9.p(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strP = null;
            }
            if (strP != null) {
                C2416ow0 c2416ow0 = this.z;
                if (c2416ow0 == null) {
                    this.n0 = true;
                } else if (!c2416ow0.k) {
                    Ol0 ol0 = (Ol0) c2416ow0.h;
                    int i = ol0.b;
                    c2416ow0.k = true;
                    ol0.a((i & (-5)) | 4);
                }
            }
            synchronized (R3.s) {
                R3.d(this);
                R3.r.add(new WeakReference(this));
            }
        }
        this.d0 = new Configuration(this.v.getResources().getConfiguration());
        this.b0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // o.R3
    public final void c() {
        if (this.u instanceof Activity) {
            synchronized (R3.s) {
                R3.d(this);
            }
        }
        if (this.k0) {
            this.w.getDecorView().removeCallbacks(this.m0);
        }
        this.c0 = true;
        if (this.e0 != -100) {
            Object obj = this.u;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                t0.put(this.u.getClass().getName(), Integer.valueOf(this.e0));
            } else {
                t0.remove(this.u.getClass().getName());
            }
        } else {
            t0.remove(this.u.getClass().getName());
        }
        C0968a4 c0968a4 = this.i0;
        if (c0968a4 != null) {
            c0968a4.c();
        }
        C0968a4 c0968a5 = this.j0;
        if (c0968a5 != null) {
            c0968a5.c();
        }
    }

    @Override // o.R3
    public final boolean e(int i) {
        if (i == 8) {
            i = C3080vp0.v0;
        } else if (i == 9) {
            i = 109;
        }
        if (this.V && i == 108) {
            return false;
        }
        if (this.R && i == 1) {
            this.R = false;
        }
        if (i == 1) {
            F();
            this.V = true;
            return true;
        }
        if (i == 2) {
            F();
            this.P = true;
            return true;
        }
        if (i == 5) {
            F();
            this.Q = true;
            return true;
        }
        if (i == 10) {
            F();
            this.T = true;
            return true;
        }
        if (i == 108) {
            F();
            this.R = true;
            return true;
        }
        if (i != 109) {
            return this.w.requestFeature(i);
        }
        F();
        this.S = true;
        return true;
    }

    @Override // o.R3
    public final void f(int i) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.v).inflate(i, viewGroup);
        this.x.a(this.w.getCallback());
    }

    @Override // o.R3
    public final void g(View view) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.x.a(this.w.getCallback());
    }

    @Override // o.R3
    public final void h(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.x.a(this.w.getCallback());
    }

    @Override // o.R3
    public final void i(CharSequence charSequence) {
        this.B = charSequence;
        InterfaceC0734Rj interfaceC0734Rj = this.C;
        if (interfaceC0734Rj != null) {
            interfaceC0734Rj.setWindowTitle(charSequence);
            return;
        }
        C2416ow0 c2416ow0 = this.z;
        if (c2416ow0 == null) {
            TextView textView = this.N;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        Ol0 ol0 = (Ol0) c2416ow0.h;
        if (ol0.g) {
            return;
        }
        ol0.h = charSequence;
        if ((ol0.b & 8) != 0) {
            Toolbar toolbar = ol0.a;
            toolbar.setTitle(charSequence);
            if (ol0.g) {
                It0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj;
        boolean z8;
        int i2;
        if (this.c0) {
            return false;
        }
        int i3 = this.e0;
        if (i3 == -100) {
            i3 = R3.m;
        }
        Context context = this.v;
        int iA = A(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        Map map = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        Object obj3 = null;
        C2356oL c2356oLL = i4 < 33 ? l(context) : null;
        if (!z2 && c2356oLL != null) {
            c2356oLL = v(context.getResources().getConfiguration());
        }
        Configuration configurationP = p(context, iA, c2356oLL, null, false);
        boolean z9 = this.h0;
        Object obj4 = this.u;
        if (z9 || !(obj4 instanceof Activity)) {
            this.h0 = true;
            i = this.g0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i4 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i4 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i2);
                    if (activityInfo != null) {
                        this.g0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.g0 = 0;
                }
                this.h0 = true;
                i = this.g0;
            }
        }
        Configuration configuration = this.d0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationP.uiMode & 48;
        C2356oL c2356oLV = v(configuration);
        C2356oL c2356oLV2 = c2356oLL == null ? null : v(configurationP);
        int i7 = i5 != i6 ? 512 : 0;
        if (c2356oLV2 != null && !c2356oLV.equals(c2356oLV2)) {
            i7 |= 8196;
        }
        if (((~i) & i7) != 0 && z && this.a0 && ((v0 || this.b0) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & C1672hI.a.e) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationP.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Jj0(1, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z4 = z3;
        } else {
            boolean z10 = (i7 & i) == i7;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (c2356oLV2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    W3.d(configuration2, c2356oLV2);
                } else {
                    InterfaceC2550qL interfaceC2550qL = c2356oLV2.a;
                    configuration2.setLocale(interfaceC2550qL.get(0));
                    configuration2.setLayoutDirection(interfaceC2550qL.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (i9 >= 24) {
                    if (!AbstractC1459f50.m) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            AbstractC1459f50.l = declaredField;
                            z7 = true;
                            try {
                                declaredField.setAccessible(true);
                            } catch (NoSuchFieldException unused2) {
                            }
                        } catch (NoSuchFieldException unused3) {
                            z7 = true;
                        }
                        AbstractC1459f50.m = z7;
                    }
                    Field field = AbstractC1459f50.l;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException unused4) {
                            obj = null;
                        }
                        if (obj != null) {
                            if (!AbstractC1459f50.g) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    AbstractC1459f50.f = declaredField2;
                                    z8 = true;
                                    try {
                                        declaredField2.setAccessible(true);
                                    } catch (NoSuchFieldException unused5) {
                                    }
                                } catch (NoSuchFieldException unused6) {
                                    z8 = true;
                                }
                                AbstractC1459f50.g = z8;
                            }
                            Field field2 = AbstractC1459f50.f;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException unused7) {
                                }
                            }
                            if (obj2 != null) {
                                AbstractC1459f50.q(obj2);
                            }
                        }
                    }
                } else if (i9 >= 23) {
                    if (!AbstractC1459f50.g) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC1459f50.f = declaredField3;
                            z6 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException unused8) {
                            }
                        } catch (NoSuchFieldException unused9) {
                            z6 = true;
                        }
                        AbstractC1459f50.g = z6;
                    }
                    Field field3 = AbstractC1459f50.f;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException unused10) {
                        }
                    }
                    if (obj3 != null) {
                        AbstractC1459f50.q(obj3);
                    }
                } else {
                    if (!AbstractC1459f50.g) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC1459f50.f = declaredField4;
                            z5 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException unused11) {
                            }
                        } catch (NoSuchFieldException unused12) {
                            z5 = true;
                        }
                        AbstractC1459f50.g = z5;
                    }
                    Field field4 = AbstractC1459f50.f;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException unused13) {
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i10 = this.f0;
            if (i10 != 0) {
                context.setTheme(i10);
                if (Build.VERSION.SDK_INT >= 23) {
                    z4 = true;
                    context.getTheme().applyStyle(this.f0, true);
                } else {
                    z4 = true;
                }
            } else {
                z4 = true;
            }
            if (z10 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof InterfaceC1283dK) {
                    if (((InterfaceC1283dK) activity2).f().d.compareTo(TJ.n) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.b0 && !this.c0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z4 && (obj4 instanceof E3)) {
            if ((i7 & 512) != 0) {
                ((E3) obj4).getClass();
            }
            if ((i7 & 4) != 0) {
                ((E3) obj4).getClass();
            }
        }
        if (c2356oLV2 != null) {
            C2356oL c2356oLV3 = v(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                W3.c(c2356oLV3);
            } else {
                Locale.setDefault(c2356oLV3.a.get(0));
            }
        }
        if (i3 == 0) {
            u(context).l();
        } else {
            C0968a4 c0968a4 = this.i0;
            if (c0968a4 != null) {
                c0968a4.c();
            }
        }
        if (i3 == 3) {
            if (this.j0 == null) {
                this.j0 = new C0968a4(this, context);
            }
            this.j0.l();
        } else {
            C0968a4 c0968a5 = this.j0;
            if (c0968a5 != null) {
                c0968a5.c();
            }
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void k(Window window) {
        Drawable drawableG;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.w != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof Z3) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Z3 z3 = new Z3(this, callback);
        this.x = z3;
        window.setCallback(z3);
        int[] iArr = u0;
        Context context = this.v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableG = null;
        } else {
            C1846j4 c1846j4A = C1846j4.a();
            synchronized (c1846j4A) {
                drawableG = c1846j4A.a.g(context, resourceId, true);
            }
        }
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.w = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.r0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.s0) != null) {
            Y3.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.s0 = null;
        }
        Object obj = this.u;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.r0 = Y3.a(activity);
            } else {
                this.r0 = null;
            }
        } else {
            this.r0 = null;
        }
        G();
    }

    public final void m(int i, C1358e4 c1358e4, ZP zp) {
        if (zp == null) {
            if (c1358e4 == null && i >= 0) {
                C1358e4[] c1358e4Arr = this.X;
                if (i < c1358e4Arr.length) {
                    c1358e4 = c1358e4Arr[i];
                }
            }
            if (c1358e4 != null) {
                zp = c1358e4.h;
            }
        }
        if ((c1358e4 == null || c1358e4.m) && !this.c0) {
            Z3 z3 = this.x;
            Window.Callback callback = this.w.getCallback();
            z3.getClass();
            try {
                z3.f650o = true;
                callback.onPanelClosed(i, zp);
            } finally {
                z3.f650o = false;
            }
        }
    }

    public final void n(ZP zp) {
        C2424p1 c2424p1;
        if (this.W) {
            return;
        }
        this.W = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.C;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Ol0) actionBarOverlayLayout.p).a.l;
        if (actionMenuView != null && (c2424p1 = actionMenuView.E) != null) {
            c2424p1.e();
            C1744i1 c1744i1 = c2424p1.F;
            if (c1744i1 != null && c1744i1.b()) {
                c1744i1.j.dismiss();
            }
        }
        Window.Callback callback = this.w.getCallback();
        if (callback != null && !this.c0) {
            callback.onPanelClosed(C3080vp0.v0, zp);
        }
        this.W = false;
    }

    public final void o(C1358e4 c1358e4, boolean z) {
        C1261d4 c1261d4;
        InterfaceC0734Rj interfaceC0734Rj;
        C2424p1 c2424p1;
        if (z && c1358e4.a == 0 && (interfaceC0734Rj = this.C) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0734Rj;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((Ol0) actionBarOverlayLayout.p).a.l;
            if (actionMenuView != null && (c2424p1 = actionMenuView.E) != null && c2424p1.h()) {
                n(c1358e4.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.v.getSystemService("window");
        if (windowManager != null && c1358e4.m && (c1261d4 = c1358e4.e) != null) {
            windowManager.removeView(c1261d4);
            if (z) {
                m(c1358e4.a, c1358e4, null);
            }
        }
        c1358e4.k = false;
        c1358e4.l = false;
        c1358e4.m = false;
        c1358e4.f = null;
        c1358e4.n = true;
        if (this.Y == c1358e4) {
            this.Y = null;
        }
        if (c1358e4.a == 0) {
            G();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c2914u4;
        View view2 = null;
        if (this.q0 == null) {
            int[] iArr = T40.j;
            Context context2 = this.v;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.q0 = new C1068b5();
            } else {
                try {
                    this.q0 = (C1068b5) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.q0 = new C1068b5();
                }
            }
        }
        C1068b5 c1068b5 = this.q0;
        int i = AbstractC2892ts0.a;
        c1068b5.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, T40.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Context c0447Gh = (resourceId == 0 || ((context instanceof C0447Gh) && ((C0447Gh) context).a == resourceId)) ? context : new C0447Gh(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b = -1;
                } else {
                    b = C3285xv.h;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c2914u4 = new C2914u4(c0447Gh, attributeSet);
                break;
            case 1:
                c2914u4 = new J3(c0447Gh, attributeSet);
                break;
            case 2:
                c2914u4 = new C2430p4(c0447Gh, attributeSet);
                break;
            case 3:
                c2914u4 = c1068b5.e(c0447Gh, attributeSet);
                break;
            case 4:
                c2914u4 = new C2236n4(c0447Gh, attributeSet, com.skidush.clonex.R.attr.imageButtonStyle);
                break;
            case 5:
                c2914u4 = new C3108w4(c0447Gh, attributeSet);
                break;
            case 6:
                c2914u4 = new I4(c0447Gh, attributeSet);
                break;
            case 7:
                c2914u4 = c1068b5.d(c0447Gh, attributeSet);
                break;
            case 8:
                c2914u4 = new Z4(c0447Gh, attributeSet);
                break;
            case 9:
                c2914u4 = new C2333o4(c0447Gh, attributeSet, 0);
                break;
            case 10:
                c2914u4 = c1068b5.a(c0447Gh, attributeSet);
                break;
            case 11:
                c2914u4 = c1068b5.c(c0447Gh, attributeSet);
                break;
            case 12:
                c2914u4 = new C2042l4(c0447Gh, attributeSet);
                break;
            case 13:
                c2914u4 = c1068b5.b(c0447Gh, attributeSet);
                break;
            default:
                c2914u4 = null;
                break;
        }
        if (c2914u4 != null || context == c0447Gh) {
            view2 = c2914u4;
        } else {
            Object[] objArr = c1068b5.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0447Gh;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C1068b5.g;
                        if (i2 < 3) {
                            View viewF = c1068b5.f(c0447Gh, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = c1068b5.f(c0447Gh, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C1068b5.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new ViewOnClickListenerC0970a5(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c0447Gh.obtainStyledAttributes(attributeSet, C1068b5.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = It0.a;
                    new C2797st0(com.skidush.clonex.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(view2, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0447Gh.obtainStyledAttributes(attributeSet, C1068b5.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    It0.q(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c0447Gh.obtainStyledAttributes(attributeSet, C1068b5.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = It0.a;
                    new C2797st0(com.skidush.clonex.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(view2, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    public final boolean q(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        boolean zE;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        C2424p1 c2424p1;
        C2424p1 c2424p2;
        C2424p1 c2424p3;
        Object obj = this.u;
        if (((obj instanceof InterfaceC2740sI) || (obj instanceof AbstractDialogC1652h4)) && (decorView = this.w.getDecorView()) != null && AbstractC2506pt.l(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            Z3 z3 = this.x;
            Window.Callback callback = this.w.getCallback();
            z3.getClass();
            try {
                z3.n = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                z3.n = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                z3.n = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.Z = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C1358e4 c1358e4X = x(0);
                if (c1358e4X.m) {
                    return true;
                }
                E(c1358e4X, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.F != null) {
                    return true;
                }
                C1358e4 c1358e4X2 = x(0);
                InterfaceC0734Rj interfaceC0734Rj = this.C;
                Context context = this.v;
                if (interfaceC0734Rj != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0734Rj;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((Ol0) actionBarOverlayLayout.p).a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.l) == null || !actionMenuView.D || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        z = c1358e4X2.m;
                        if (!z || c1358e4X2.l) {
                            o(c1358e4X2, true);
                            z2 = z;
                        } else {
                            if (c1358e4X2.k) {
                                if (c1358e4X2.f748o) {
                                    c1358e4X2.k = false;
                                    zE = E(c1358e4X2, keyEvent);
                                } else {
                                    zE = true;
                                }
                                if (zE) {
                                    C(c1358e4X2, keyEvent);
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.C;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((Ol0) actionBarOverlayLayout2.p).a.l;
                        if (actionMenuView2 == null || (c2424p2 = actionMenuView2.E) == null || !c2424p2.h()) {
                            if (!this.c0 && E(c1358e4X2, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.C;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((Ol0) actionBarOverlayLayout3.p).a.l;
                                if (actionMenuView3 != null && (c2424p1 = actionMenuView3.E) != null && c2424p1.o()) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.C;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((Ol0) actionBarOverlayLayout4.p).a.l;
                            if (actionMenuView4 == null || (c2424p3 = actionMenuView4.E) == null || !c2424p3.e()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                } else {
                    z = c1358e4X2.m;
                    if (z) {
                    }
                    o(c1358e4X2, true);
                    z2 = z;
                }
                if (!z2 || (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) == null) {
                    return true;
                }
                audioManager.playSoundEffect(0);
                return true;
            }
        } else if (B()) {
            return true;
        }
        return false;
    }

    public final void r(int i) {
        C1358e4 c1358e4X = x(i);
        if (c1358e4X.h != null) {
            Bundle bundle = new Bundle();
            c1358e4X.h.t(bundle);
            if (bundle.size() > 0) {
                c1358e4X.p = bundle;
            }
            c1358e4X.h.w();
            c1358e4X.h.clear();
        }
        c1358e4X.f748o = true;
        c1358e4X.n = true;
        if ((i == 108 || i == 0) && this.C != null) {
            C1358e4 c1358e4X2 = x(0);
            c1358e4X2.k = false;
            E(c1358e4X2, null);
        }
    }

    public final void s() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.L) {
            return;
        }
        int[] iArr = T40.j;
        Context context = this.v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(Yu0.b.f0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            e(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(Yu0.b.f0, false)) {
            e(C3080vp0.v0);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            e(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(Yu0.b.g0, false)) {
            e(10);
        }
        this.U = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        t();
        this.w.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.V) {
            viewGroup = this.T ? (ViewGroup) layoutInflaterFrom.inflate(com.skidush.clonex.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.skidush.clonex.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.U) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.skidush.clonex.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.S = false;
            this.R = false;
        } else if (this.R) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.skidush.clonex.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0447Gh(context, typedValue.resourceId) : context).inflate(com.skidush.clonex.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0734Rj interfaceC0734Rj = (InterfaceC0734Rj) viewGroup.findViewById(com.skidush.clonex.R.id.decor_content_parent);
            this.C = interfaceC0734Rj;
            interfaceC0734Rj.setWindowCallback(this.w.getCallback());
            if (this.S) {
                ((ActionBarOverlayLayout) this.C).j(109);
            }
            if (this.P) {
                ((ActionBarOverlayLayout) this.C).j(2);
            }
            if (this.Q) {
                ((ActionBarOverlayLayout) this.C).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.R + ", windowActionBarOverlay: " + this.S + ", android:windowIsFloating: " + this.U + ", windowActionModeOverlay: " + this.T + ", windowNoTitle: " + this.V + " }");
        }
        T3 t3 = new T3(this, i2);
        WeakHashMap weakHashMap = It0.a;
        AbstractC3185wt0.u(viewGroup, t3);
        if (this.C == null) {
            this.N = (TextView) viewGroup.findViewById(com.skidush.clonex.R.id.title);
        }
        boolean z = AbstractC3478zu0.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.skidush.clonex.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.w.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.w.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new T3(this, i));
        this.M = viewGroup;
        Object obj = this.u;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0734Rj interfaceC0734Rj2 = this.C;
            if (interfaceC0734Rj2 != null) {
                interfaceC0734Rj2.setWindowTitle(title);
            } else {
                C2416ow0 c2416ow0 = this.z;
                if (c2416ow0 != null) {
                    Ol0 ol0 = (Ol0) c2416ow0.h;
                    if (!ol0.g) {
                        ol0.h = title;
                        if ((ol0.b & 8) != 0) {
                            Toolbar toolbar = ol0.a;
                            toolbar.setTitle(title);
                            if (ol0.g) {
                                It0.q(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.N;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.M.findViewById(R.id.content);
        View decorView = this.w.getDecorView();
        contentFrameLayout2.r.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(Yu0.b.j0, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(Yu0.b.i0)) {
            typedArrayObtainStyledAttributes2.getValue(Yu0.b.i0, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(Yu0.b.h0)) {
            typedArrayObtainStyledAttributes2.getValue(Yu0.b.h0, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.L = true;
        C1358e4 c1358e4X = x(0);
        if (this.c0 || c1358e4X.h != null) {
            return;
        }
        z(C3080vp0.v0);
    }

    public final void t() {
        if (this.w == null) {
            Object obj = this.u;
            if (obj instanceof Activity) {
                k(((Activity) obj).getWindow());
            }
        }
        if (this.w == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC1163c4 u(Context context) {
        if (this.i0 == null) {
            if (RN.p == null) {
                Context applicationContext = context.getApplicationContext();
                RN.p = new RN(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.i0 = new C0968a4(this, RN.p);
        }
        return this.i0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // o.XP
    public final boolean w(ZP zp, MenuItem menuItem) {
        C1358e4 c1358e4;
        Window.Callback callback = this.w.getCallback();
        if (callback != null && !this.c0) {
            ZP zpK = zp.k();
            C1358e4[] c1358e4Arr = this.X;
            int length = c1358e4Arr != null ? c1358e4Arr.length : 0;
            for (int i = 0; i < length; i++) {
                c1358e4 = c1358e4Arr[i];
                if (c1358e4 != null && c1358e4.h == zpK) {
                    if (c1358e4 != null) {
                        return callback.onMenuItemSelected(c1358e4.a, menuItem);
                    }
                }
            }
            c1358e4 = null;
            if (c1358e4 != null) {
                return callback.onMenuItemSelected(c1358e4.a, menuItem);
            }
        }
        return false;
    }

    public final C1358e4 x(int i) {
        C1358e4[] c1358e4Arr = this.X;
        if (c1358e4Arr == null || c1358e4Arr.length <= i) {
            C1358e4[] c1358e4Arr2 = new C1358e4[i + 1];
            if (c1358e4Arr != null) {
                System.arraycopy(c1358e4Arr, 0, c1358e4Arr2, 0, c1358e4Arr.length);
            }
            this.X = c1358e4Arr2;
            c1358e4Arr = c1358e4Arr2;
        }
        C1358e4 c1358e4 = c1358e4Arr[i];
        if (c1358e4 != null) {
            return c1358e4;
        }
        C1358e4 c1358e5 = new C1358e4();
        c1358e5.a = i;
        c1358e5.n = false;
        c1358e4Arr[i] = c1358e5;
        return c1358e5;
    }

    public final void y() {
        s();
        if (this.R && this.z == null) {
            Object obj = this.u;
            if (obj instanceof Activity) {
                this.z = new C2416ow0((Activity) obj, this.S);
            } else if (obj instanceof Dialog) {
                this.z = new C2416ow0((Dialog) obj);
            }
            C2416ow0 c2416ow0 = this.z;
            if (c2416ow0 != null) {
                boolean z = this.n0;
                if (c2416ow0.k) {
                    return;
                }
                int i = z ? 4 : 0;
                Ol0 ol0 = (Ol0) c2416ow0.h;
                int i2 = ol0.b;
                c2416ow0.k = true;
                ol0.a((i & 4) | (i2 & (-5)));
            }
        }
    }

    public final void z(int i) {
        this.l0 = (1 << i) | this.l0;
        if (this.k0) {
            return;
        }
        View decorView = this.w.getDecorView();
        WeakHashMap weakHashMap = It0.a;
        decorView.postOnAnimation(this.m0);
        this.k0 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
