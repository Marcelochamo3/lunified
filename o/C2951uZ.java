package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.skidush.clonex.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.uZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2951uZ extends FrameLayout {
    public final Formatter A;
    public final Dj0 B;
    public final Ej0 C;
    public final RunnableC2467pZ D;
    public final RunnableC2467pZ E;
    public final Drawable F;
    public final Drawable G;
    public final Drawable H;
    public final String I;
    public final String J;
    public final String K;
    public final Drawable L;
    public final Drawable M;
    public final float N;
    public final float O;
    public final String P;
    public final String Q;
    public InterfaceC2370oZ R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public long h0;
    public long[] i0;
    public boolean[] j0;
    public final long[] k0;
    public final ViewOnClickListenerC2660rZ l;
    public final boolean[] l0;
    public final CopyOnWriteArrayList m;
    public long m0;
    public final View n;
    public long n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f1055o;
    public final View p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final View v;
    public final TextView w;
    public final TextView x;
    public final InterfaceC3456zj0 y;
    public final StringBuilder z;

    static {
        AbstractC1726hs.a("goog.exo.ui");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [o.pZ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [o.pZ] */
    public C2951uZ(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.W = 5000;
        this.b0 = 0;
        this.a0 = 200;
        this.h0 = -9223372036854775807L;
        this.c0 = true;
        this.d0 = true;
        this.e0 = true;
        this.f0 = true;
        this.g0 = false;
        int resourceId = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G40.c, 0, 0);
            try {
                this.W = typedArrayObtainStyledAttributes.getInt(19, this.W);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.b0 = typedArrayObtainStyledAttributes.getInt(8, this.b0);
                this.c0 = typedArrayObtainStyledAttributes.getBoolean(17, this.c0);
                this.d0 = typedArrayObtainStyledAttributes.getBoolean(14, this.d0);
                this.e0 = typedArrayObtainStyledAttributes.getBoolean(16, this.e0);
                this.f0 = typedArrayObtainStyledAttributes.getBoolean(15, this.f0);
                this.g0 = typedArrayObtainStyledAttributes.getBoolean(18, this.g0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.a0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.m = new CopyOnWriteArrayList();
        this.B = new Dj0();
        this.C = new Ej0();
        StringBuilder sb = new StringBuilder();
        this.z = sb;
        this.A = new Formatter(sb, Locale.getDefault());
        this.i0 = new long[0];
        this.j0 = new boolean[0];
        this.k0 = new long[0];
        this.l0 = new boolean[0];
        ViewOnClickListenerC2660rZ viewOnClickListenerC2660rZ = new ViewOnClickListenerC2660rZ(this);
        this.l = viewOnClickListenerC2660rZ;
        final int i = 0;
        this.D = new Runnable(this) { // from class: o.pZ
            public final /* synthetic */ C2951uZ m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.m.h();
                        break;
                    default:
                        this.m.b();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.E = new Runnable(this) { // from class: o.pZ
            public final /* synthetic */ C2951uZ m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.m.h();
                        break;
                    default:
                        this.m.b();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC3456zj0 interfaceC3456zj0 = (InterfaceC3456zj0) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC3456zj0 != null) {
            this.y = interfaceC3456zj0;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.y = defaultTimeBar;
        } else {
            this.y = null;
        }
        this.w = (TextView) findViewById(R.id.exo_duration);
        this.x = (TextView) findViewById(R.id.exo_position);
        InterfaceC3456zj0 interfaceC3456zj1 = this.y;
        if (interfaceC3456zj1 != null) {
            ((DefaultTimeBar) interfaceC3456zj1).I.add(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.p = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.q = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.n = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f1055o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.s = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.r = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.t = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.u = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC2660rZ);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.v = viewFindViewById8;
        setShowVrButton(false);
        e(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.N = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.O = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.F = Lr0.s(context, resources, R.drawable.exo_controls_repeat_off);
        this.G = Lr0.s(context, resources, R.drawable.exo_controls_repeat_one);
        this.H = Lr0.s(context, resources, R.drawable.exo_controls_repeat_all);
        this.L = Lr0.s(context, resources, R.drawable.exo_controls_shuffle_on);
        this.M = Lr0.s(context, resources, R.drawable.exo_controls_shuffle_off);
        this.I = resources.getString(R.string.exo_controls_repeat_off_description);
        this.J = resources.getString(R.string.exo_controls_repeat_one_description);
        this.K = resources.getString(R.string.exo_controls_repeat_all_description);
        this.P = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.Q = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.n0 = -9223372036854775807L;
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2370oZ interfaceC2370oZ = this.R;
        if (interfaceC2370oZ == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((C1042as) interfaceC2370oZ).J() != 4) {
                    AbstractC1074b8 abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
                    C1042as c1042as = (C1042as) abstractC1074b8;
                    c1042as.i0();
                    abstractC1074b8.o(12, c1042as.v);
                }
            } else if (keyCode == 89) {
                AbstractC1074b8 abstractC1074b9 = (AbstractC1074b8) interfaceC2370oZ;
                C1042as c1042as2 = (C1042as) abstractC1074b9;
                c1042as2.i0();
                abstractC1074b9.o(11, -c1042as2.u);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (Lr0.T(interfaceC2370oZ)) {
                        Lr0.E(interfaceC2370oZ);
                    } else {
                        AbstractC1074b8 abstractC1074b10 = (AbstractC1074b8) interfaceC2370oZ;
                        if (abstractC1074b10.b(1)) {
                            abstractC1074b10.i();
                        }
                    }
                } else if (keyCode == 87) {
                    ((AbstractC1074b8) interfaceC2370oZ).n();
                } else if (keyCode == 88) {
                    ((AbstractC1074b8) interfaceC2370oZ).p();
                } else if (keyCode == 126) {
                    Lr0.E(interfaceC2370oZ);
                } else if (keyCode == 127) {
                    int i = Lr0.a;
                    AbstractC1074b8 abstractC1074b11 = (AbstractC1074b8) interfaceC2370oZ;
                    if (abstractC1074b11.b(1)) {
                        abstractC1074b11.i();
                    }
                }
            }
        }
        return true;
    }

    public final void b() {
        if (d()) {
            setVisibility(8);
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((InterfaceC2854tZ) it.next()).c(getVisibility());
            }
            removeCallbacks(this.D);
            removeCallbacks(this.E);
            this.h0 = -9223372036854775807L;
        }
    }

    public final void c() {
        RunnableC2467pZ runnableC2467pZ = this.E;
        removeCallbacks(runnableC2467pZ);
        if (this.W <= 0) {
            this.h0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.W;
        this.h0 = jUptimeMillis + j;
        if (this.S) {
            postDelayed(runnableC2467pZ, j);
        }
    }

    public final boolean d() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.E);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.N : this.O);
        view.setVisibility(z ? 0 : 8);
    }

    public final void f() {
        boolean zB;
        boolean zB2;
        boolean zB3;
        boolean zB4;
        boolean zB5;
        if (d() && this.S) {
            InterfaceC2370oZ interfaceC2370oZ = this.R;
            if (interfaceC2370oZ != null) {
                AbstractC1074b8 abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
                zB = abstractC1074b8.b(5);
                zB3 = abstractC1074b8.b(7);
                zB4 = abstractC1074b8.b(11);
                zB5 = abstractC1074b8.b(12);
                zB2 = abstractC1074b8.b(9);
            } else {
                zB = false;
                zB2 = false;
                zB3 = false;
                zB4 = false;
                zB5 = false;
            }
            e(this.e0, zB3, this.n);
            e(this.c0, zB4, this.s);
            e(this.d0, zB5, this.r);
            e(this.f0, zB2, this.f1055o);
            InterfaceC3456zj0 interfaceC3456zj0 = this.y;
            if (interfaceC3456zj0 != null) {
                interfaceC3456zj0.setEnabled(zB);
            }
        }
    }

    public final void g() {
        boolean z;
        boolean z2;
        if (d() && this.S) {
            boolean zT = Lr0.T(this.R);
            View view = this.p;
            boolean z3 = true;
            if (view != null) {
                z = !zT && view.isFocused();
                if (Lr0.a < 21) {
                    z2 = z;
                } else {
                    z2 = !zT && AbstractC2564qZ.a(view);
                }
                view.setVisibility(zT ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.q;
            if (view2 != null) {
                z |= zT && view2.isFocused();
                if (Lr0.a < 21) {
                    z3 = z;
                } else if (!zT || !AbstractC2564qZ.a(view2)) {
                    z3 = false;
                }
                z2 |= z3;
                view2.setVisibility(zT ? 8 : 0);
            }
            if (z) {
                boolean zT2 = Lr0.T(this.R);
                if (zT2 && view != null) {
                    view.requestFocus();
                } else if (!zT2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean zT3 = Lr0.T(this.R);
                if (zT3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (zT3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public InterfaceC2370oZ getPlayer() {
        return this.R;
    }

    public int getRepeatToggleModes() {
        return this.b0;
    }

    public boolean getShowShuffleButton() {
        return this.g0;
    }

    public int getShowTimeoutMs() {
        return this.W;
    }

    public boolean getShowVrButton() {
        View view = this.v;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        long jX;
        long jW;
        if (d() && this.S) {
            InterfaceC2370oZ interfaceC2370oZ = this.R;
            if (interfaceC2370oZ != null) {
                long j = this.m0;
                C1042as c1042as = (C1042as) interfaceC2370oZ;
                c1042as.i0();
                jX = c1042as.x(c1042as.j0) + j;
                jW = c1042as.w() + this.m0;
            } else {
                jX = 0;
                jW = 0;
            }
            boolean z = jX != this.n0;
            this.n0 = jX;
            TextView textView = this.x;
            if (textView != null && !this.V && z) {
                textView.setText(Lr0.A(this.z, this.A, jX));
            }
            InterfaceC3456zj0 interfaceC3456zj0 = this.y;
            if (interfaceC3456zj0 != null) {
                interfaceC3456zj0.setPosition(jX);
                interfaceC3456zj0.setBufferedPosition(jW);
            }
            RunnableC2467pZ runnableC2467pZ = this.D;
            removeCallbacks(runnableC2467pZ);
            int iJ = interfaceC2370oZ == null ? 1 : ((C1042as) interfaceC2370oZ).J();
            if (interfaceC2370oZ == null || !((AbstractC1074b8) interfaceC2370oZ).f()) {
                if (iJ == 4 || iJ == 1) {
                    return;
                }
                postDelayed(runnableC2467pZ, 1000L);
                return;
            }
            long jMin = Math.min(interfaceC3456zj0 != null ? interfaceC3456zj0.getPreferredUpdateDelay() : 1000L, 1000 - (jX % 1000));
            C1042as c1042as2 = (C1042as) interfaceC2370oZ;
            c1042as2.i0();
            float f = c1042as2.j0.n.l;
            postDelayed(runnableC2467pZ, Lr0.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.a0, 1000L));
        }
    }

    public final void i() {
        ImageView imageView;
        if (d() && this.S && (imageView = this.t) != null) {
            if (this.b0 == 0) {
                e(false, false, imageView);
                return;
            }
            InterfaceC2370oZ interfaceC2370oZ = this.R;
            String str = this.I;
            Drawable drawable = this.F;
            if (interfaceC2370oZ == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            c1042as.i0();
            int i = c1042as.E;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.G);
                imageView.setContentDescription(this.J);
            } else if (i == 2) {
                imageView.setImageDrawable(this.H);
                imageView.setContentDescription(this.K);
            }
            imageView.setVisibility(0);
        }
    }

    public final void j() {
        ImageView imageView;
        if (d() && this.S && (imageView = this.u) != null) {
            InterfaceC2370oZ interfaceC2370oZ = this.R;
            if (!this.g0) {
                e(false, false, imageView);
                return;
            }
            String str = this.Q;
            Drawable drawable = this.M;
            if (interfaceC2370oZ == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            c1042as.i0();
            if (c1042as.F) {
                drawable = this.L;
            }
            imageView.setImageDrawable(drawable);
            c1042as.i0();
            if (c1042as.F) {
                str = this.P;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[PHI: r4
  0x00a6: PHI (r4v15 o.Fj0) = (r4v9 o.Fj0), (r4v16 o.Fj0) binds: [B:49:0x00b7, B:44:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    public final void k() {
        boolean z;
        boolean z2;
        long j;
        int i;
        Fj0 fj0;
        Fj0 fj1;
        boolean z3;
        InterfaceC2370oZ interfaceC2370oZ = this.R;
        if (interfaceC2370oZ == null) {
            return;
        }
        boolean z4 = this.T;
        boolean z5 = false;
        boolean z6 = true;
        long j2 = -9223372036854775807L;
        Ej0 ej0 = this.C;
        if (!z4) {
            z = false;
            break;
        }
        Fj0 fj0E = ((C1042as) interfaceC2370oZ).E();
        if (fj0E.p() <= 100) {
            int iP = fj0E.p();
            int i2 = 0;
            while (true) {
                if (i2 >= iP) {
                    z = true;
                    break;
                } else {
                    if (fj0E.n(i2, ej0, 0L).y == -9223372036854775807L) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            z = false;
            break;
        }
        this.U = z;
        this.m0 = 0L;
        C1042as c1042as = (C1042as) interfaceC2370oZ;
        Fj0 fj0E2 = c1042as.E();
        if (fj0E2.q()) {
            z2 = true;
            j = 0;
            i = 0;
        } else {
            int iA = c1042as.A();
            boolean z7 = this.U;
            int i3 = z7 ? 0 : iA;
            int iP2 = z7 ? fj0E2.p() - 1 : iA;
            long j3 = 0;
            i = 0;
            while (i3 <= iP2) {
                if (i3 == iA) {
                    this.m0 = Lr0.X(j3);
                }
                fj0E2.o(i3, ej0);
                if (ej0.y == j2) {
                    AbstractC0397Ej.f(this.U ^ z6);
                    break;
                }
                int i4 = ej0.z;
                while (i4 <= ej0.A) {
                    Dj0 dj0 = this.B;
                    fj0E2.g(i4, dj0, z5);
                    U1 u1 = dj0.r;
                    int i5 = u1.p;
                    while (i5 < u1.m) {
                        long jD = dj0.d(i5);
                        int i6 = iA;
                        if (jD == Long.MIN_VALUE) {
                            fj0 = fj0E2;
                            long j4 = dj0.f219o;
                            if (j4 == j2) {
                                fj1 = fj0;
                            } else {
                                jD = j4;
                            }
                            i5++;
                            iA = i6;
                            fj0E2 = fj1;
                            j2 = -9223372036854775807L;
                        } else {
                            fj0 = fj0E2;
                        }
                        long j5 = jD + dj0.p;
                        if (j5 >= 0) {
                            long[] jArr = this.i0;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.i0 = Arrays.copyOf(jArr, length);
                                this.j0 = Arrays.copyOf(this.j0, length);
                            }
                            this.i0[i] = Lr0.X(j3 + j5);
                            boolean[] zArr = this.j0;
                            T1 t1A = dj0.r.a(i5);
                            int i7 = t1A.m;
                            if (i7 == -1) {
                                fj1 = fj0;
                            } else {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < i7) {
                                        fj1 = fj0;
                                        int i9 = t1A.p[i8];
                                        if (i9 != 0) {
                                            T1 t1 = t1A;
                                            if (i9 != 1) {
                                                i8++;
                                                fj0 = fj1;
                                                t1A = t1;
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        fj1 = fj0;
                                        z3 = false;
                                    }
                                    zArr[i] = !z3;
                                    i++;
                                }
                            }
                            z3 = true;
                            zArr[i] = !z3;
                            i++;
                        } else {
                            fj1 = fj0;
                        }
                        i5++;
                        iA = i6;
                        fj0E2 = fj1;
                        j2 = -9223372036854775807L;
                    }
                    i4++;
                    fj0E2 = fj0E2;
                    z5 = false;
                    j2 = -9223372036854775807L;
                }
                j3 += ej0.y;
                i3++;
                fj0E2 = fj0E2;
                z5 = false;
                z6 = true;
                j2 = -9223372036854775807L;
            }
            z2 = true;
            j = j3;
        }
        long jX = Lr0.X(j);
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(Lr0.A(this.z, this.A, jX));
        }
        InterfaceC3456zj0 interfaceC3456zj0 = this.y;
        if (interfaceC3456zj0 != null) {
            interfaceC3456zj0.setDuration(jX);
            long[] jArr2 = this.k0;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.i0;
            if (i10 > jArr3.length) {
                this.i0 = Arrays.copyOf(jArr3, i10);
                this.j0 = Arrays.copyOf(this.j0, i10);
            }
            System.arraycopy(jArr2, 0, this.i0, i, length2);
            System.arraycopy(this.l0, 0, this.j0, i, length2);
            long[] jArr4 = this.i0;
            boolean[] zArr2 = this.j0;
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) interfaceC3456zj0;
            if (i10 != 0 && (jArr4 == null || zArr2 == null)) {
                z2 = false;
            }
            AbstractC0397Ej.c(z2);
            defaultTimeBar.V = i10;
            defaultTimeBar.W = jArr4;
            defaultTimeBar.a0 = zArr2;
            defaultTimeBar.e();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        long j = this.h0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.E, jUptimeMillis);
            }
        } else if (d()) {
            c();
        }
        g();
        f();
        i();
        j();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        removeCallbacks(this.D);
        removeCallbacks(this.E);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public void setPlayer(InterfaceC2370oZ interfaceC2370oZ) {
        boolean z;
        AbstractC0397Ej.f(Looper.myLooper() == Looper.getMainLooper());
        if (interfaceC2370oZ != null) {
            z = ((C1042as) interfaceC2370oZ).s == Looper.getMainLooper();
        }
        AbstractC0397Ej.c(z);
        InterfaceC2370oZ interfaceC2370oZ2 = this.R;
        if (interfaceC2370oZ2 == interfaceC2370oZ) {
            return;
        }
        ViewOnClickListenerC2660rZ viewOnClickListenerC2660rZ = this.l;
        if (interfaceC2370oZ2 != null) {
            ((C1042as) interfaceC2370oZ2).S(viewOnClickListenerC2660rZ);
        }
        this.R = interfaceC2370oZ;
        if (interfaceC2370oZ != null) {
            viewOnClickListenerC2660rZ.getClass();
            ((C1042as) interfaceC2370oZ).l.a(viewOnClickListenerC2660rZ);
        }
        g();
        f();
        i();
        j();
        k();
    }

    public void setRepeatToggleModes(int i) {
        this.b0 = i;
        InterfaceC2370oZ interfaceC2370oZ = this.R;
        if (interfaceC2370oZ != null) {
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            c1042as.i0();
            int i2 = c1042as.E;
            if (i == 0 && i2 != 0) {
                ((C1042as) this.R).Z(0);
            } else if (i == 1 && i2 == 2) {
                ((C1042as) this.R).Z(1);
            } else if (i == 2 && i2 == 1) {
                ((C1042as) this.R).Z(2);
            }
        }
        i();
    }

    public void setShowFastForwardButton(boolean z) {
        this.d0 = z;
        f();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.T = z;
        k();
    }

    public void setShowNextButton(boolean z) {
        this.f0 = z;
        f();
    }

    public void setShowPreviousButton(boolean z) {
        this.e0 = z;
        f();
    }

    public void setShowRewindButton(boolean z) {
        this.c0 = z;
        f();
    }

    public void setShowShuffleButton(boolean z) {
        this.g0 = z;
        j();
    }

    public void setShowTimeoutMs(int i) {
        this.W = i;
        if (d()) {
            c();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.v;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.a0 = Lr0.j(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            e(getShowVrButton(), onClickListener != null, view);
        }
    }

    public void setProgressUpdateListener(InterfaceC2757sZ interfaceC2757sZ) {
    }
}
