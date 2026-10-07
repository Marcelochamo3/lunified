package o;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class E3 extends AbstractActivityC1540fx implements H3 {
    public LayoutInflaterFactory2C1456f4 I;

    public E3() {
        ((K3) this.p.f832o).f("androidx:appcompat", new C3(this));
        j(new D3(this));
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.s();
        ((ViewGroup) layoutInflaterFactory2C1456f4.M.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1456f4.x.a(layoutInflaterFactory2C1456f4.w.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01df  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x020e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        C0447Gh c0447Gh;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.a0 = true;
        int i38 = layoutInflaterFactory2C1456f4.e0;
        if (i38 == -100) {
            i38 = R3.m;
        }
        int iA = layoutInflaterFactory2C1456f4.A(context, i38);
        if (R3.a(context) && R3.a(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (R3.t) {
                    try {
                        C2356oL c2356oL = R3.n;
                        if (c2356oL == null) {
                            if (R3.f480o == null) {
                                R3.f480o = C2356oL.b(AbstractC1468fA.z(context));
                            }
                            if (!R3.f480o.a.isEmpty()) {
                                R3.n = R3.f480o;
                            }
                        } else if (!c2356oL.equals(R3.f480o)) {
                            C2356oL c2356oL2 = R3.n;
                            R3.f480o = c2356oL2;
                            AbstractC1468fA.y(context, c2356oL2.a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!R3.q) {
                R3.l.execute(new L3(context, 0));
            }
        }
        C2356oL c2356oLL = LayoutInflaterFactory2C1456f4.l(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C0447Gh) {
                    try {
                        ((C0447Gh) context).a(LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C1456f4.v0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 24) {
                                        W3.a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i6 = configuration.touchscreen;
                                    i7 = configuration2.touchscreen;
                                    if (i6 != i7) {
                                        configuration3.touchscreen = i7;
                                    }
                                    i8 = configuration.keyboard;
                                    i9 = configuration2.keyboard;
                                    if (i8 != i9) {
                                        configuration3.keyboard = i9;
                                    }
                                    i10 = configuration.keyboardHidden;
                                    i11 = configuration2.keyboardHidden;
                                    if (i10 != i11) {
                                        configuration3.keyboardHidden = i11;
                                    }
                                    i12 = configuration.navigation;
                                    i13 = configuration2.navigation;
                                    if (i12 != i13) {
                                        configuration3.navigation = i13;
                                    }
                                    i14 = configuration.navigationHidden;
                                    i15 = configuration2.navigationHidden;
                                    if (i14 != i15) {
                                        configuration3.navigationHidden = i15;
                                    }
                                    i16 = configuration.orientation;
                                    i17 = configuration2.orientation;
                                    if (i16 != i17) {
                                        configuration3.orientation = i17;
                                    }
                                    i18 = configuration.screenLayout & 15;
                                    i19 = configuration2.screenLayout & 15;
                                    if (i18 != i19) {
                                        configuration3.screenLayout |= i19;
                                    }
                                    i20 = configuration.screenLayout & 192;
                                    i21 = configuration2.screenLayout & 192;
                                    if (i20 != i21) {
                                        configuration3.screenLayout |= i21;
                                    }
                                    i22 = configuration.screenLayout & 48;
                                    i23 = configuration2.screenLayout & 48;
                                    if (i22 != i23) {
                                        configuration3.screenLayout |= i23;
                                    }
                                    i24 = configuration.screenLayout & 768;
                                    i25 = configuration2.screenLayout & 768;
                                    if (i24 != i25) {
                                        configuration3.screenLayout |= i25;
                                    }
                                    if (i5 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i26 = configuration.uiMode & 15;
                                    i27 = configuration2.uiMode & 15;
                                    if (i26 != i27) {
                                        configuration3.uiMode |= i27;
                                    }
                                    i28 = configuration.uiMode & 48;
                                    i29 = configuration2.uiMode & 48;
                                    if (i28 != i29) {
                                        configuration3.uiMode |= i29;
                                    }
                                    i30 = configuration.screenWidthDp;
                                    i31 = configuration2.screenWidthDp;
                                    if (i30 != i31) {
                                        configuration3.screenWidthDp = i31;
                                    }
                                    i32 = configuration.screenHeightDp;
                                    i33 = configuration2.screenHeightDp;
                                    if (i32 != i33) {
                                        configuration3.screenHeightDp = i33;
                                    }
                                    i34 = configuration.smallestScreenWidthDp;
                                    i35 = configuration2.smallestScreenWidthDp;
                                    if (i34 != i35) {
                                        configuration3.smallestScreenWidthDp = i35;
                                    }
                                    i36 = configuration.densityDpi;
                                    i37 = configuration2.densityDpi;
                                    if (i36 != i37) {
                                        configuration3.densityDpi = i37;
                                    }
                                }
                            }
                            Configuration configurationP = LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, configuration3, true);
                            c0447Gh = new C0447Gh(context, com.skidush.clonex.R.style.Theme_AppCompat_Empty);
                            c0447Gh.a(configurationP);
                            try {
                                if (context.getTheme() != null) {
                                    AbstractC3045vW.A(c0447Gh.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c0447Gh;
                        }
                    }
                } else if (LayoutInflaterFactory2C1456f4.v0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 24) {
                                W3.a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i6 = configuration.touchscreen;
                            i7 = configuration2.touchscreen;
                            if (i6 != i7) {
                                configuration3.touchscreen = i7;
                            }
                            i8 = configuration.keyboard;
                            i9 = configuration2.keyboard;
                            if (i8 != i9) {
                                configuration3.keyboard = i9;
                            }
                            i10 = configuration.keyboardHidden;
                            i11 = configuration2.keyboardHidden;
                            if (i10 != i11) {
                                configuration3.keyboardHidden = i11;
                            }
                            i12 = configuration.navigation;
                            i13 = configuration2.navigation;
                            if (i12 != i13) {
                                configuration3.navigation = i13;
                            }
                            i14 = configuration.navigationHidden;
                            i15 = configuration2.navigationHidden;
                            if (i14 != i15) {
                                configuration3.navigationHidden = i15;
                            }
                            i16 = configuration.orientation;
                            i17 = configuration2.orientation;
                            if (i16 != i17) {
                                configuration3.orientation = i17;
                            }
                            i18 = configuration.screenLayout & 15;
                            i19 = configuration2.screenLayout & 15;
                            if (i18 != i19) {
                                configuration3.screenLayout |= i19;
                            }
                            i20 = configuration.screenLayout & 192;
                            i21 = configuration2.screenLayout & 192;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 48;
                            i23 = configuration2.screenLayout & 48;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 768;
                            i25 = configuration2.screenLayout & 768;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            if (i5 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i26 = configuration.uiMode & 15;
                            i27 = configuration2.uiMode & 15;
                            if (i26 != i27) {
                                configuration3.uiMode |= i27;
                            }
                            i28 = configuration.uiMode & 48;
                            i29 = configuration2.uiMode & 48;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.screenWidthDp;
                            i31 = configuration2.screenWidthDp;
                            if (i30 != i31) {
                                configuration3.screenWidthDp = i31;
                            }
                            i32 = configuration.screenHeightDp;
                            i33 = configuration2.screenHeightDp;
                            if (i32 != i33) {
                                configuration3.screenHeightDp = i33;
                            }
                            i34 = configuration.smallestScreenWidthDp;
                            i35 = configuration2.smallestScreenWidthDp;
                            if (i34 != i35) {
                                configuration3.smallestScreenWidthDp = i35;
                            }
                            i36 = configuration.densityDpi;
                            i37 = configuration2.densityDpi;
                            if (i36 != i37) {
                                configuration3.densityDpi = i37;
                            }
                        }
                    }
                    Configuration configurationP2 = LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, configuration3, true);
                    c0447Gh = new C0447Gh(context, com.skidush.clonex.R.style.Theme_AppCompat_Empty);
                    c0447Gh.a(configurationP2);
                    if (context.getTheme() != null) {
                        AbstractC3045vW.A(c0447Gh.getTheme());
                    }
                    context = c0447Gh;
                }
            }
        } else if (context instanceof C0447Gh) {
            ((C0447Gh) context).a(LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, null, false));
        } else if (LayoutInflaterFactory2C1456f4.v0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 24) {
                        W3.a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i6 = configuration.touchscreen;
                    i7 = configuration2.touchscreen;
                    if (i6 != i7) {
                        configuration3.touchscreen = i7;
                    }
                    i8 = configuration.keyboard;
                    i9 = configuration2.keyboard;
                    if (i8 != i9) {
                        configuration3.keyboard = i9;
                    }
                    i10 = configuration.keyboardHidden;
                    i11 = configuration2.keyboardHidden;
                    if (i10 != i11) {
                        configuration3.keyboardHidden = i11;
                    }
                    i12 = configuration.navigation;
                    i13 = configuration2.navigation;
                    if (i12 != i13) {
                        configuration3.navigation = i13;
                    }
                    i14 = configuration.navigationHidden;
                    i15 = configuration2.navigationHidden;
                    if (i14 != i15) {
                        configuration3.navigationHidden = i15;
                    }
                    i16 = configuration.orientation;
                    i17 = configuration2.orientation;
                    if (i16 != i17) {
                        configuration3.orientation = i17;
                    }
                    i18 = configuration.screenLayout & 15;
                    i19 = configuration2.screenLayout & 15;
                    if (i18 != i19) {
                        configuration3.screenLayout |= i19;
                    }
                    i20 = configuration.screenLayout & 192;
                    i21 = configuration2.screenLayout & 192;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 48;
                    i23 = configuration2.screenLayout & 48;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 768;
                    i25 = configuration2.screenLayout & 768;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    if (i5 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i26 = configuration.uiMode & 15;
                    i27 = configuration2.uiMode & 15;
                    if (i26 != i27) {
                        configuration3.uiMode |= i27;
                    }
                    i28 = configuration.uiMode & 48;
                    i29 = configuration2.uiMode & 48;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.screenWidthDp;
                    i31 = configuration2.screenWidthDp;
                    if (i30 != i31) {
                        configuration3.screenWidthDp = i31;
                    }
                    i32 = configuration.screenHeightDp;
                    i33 = configuration2.screenHeightDp;
                    if (i32 != i33) {
                        configuration3.screenHeightDp = i33;
                    }
                    i34 = configuration.smallestScreenWidthDp;
                    i35 = configuration2.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration3.smallestScreenWidthDp = i35;
                    }
                    i36 = configuration.densityDpi;
                    i37 = configuration2.densityDpi;
                    if (i36 != i37) {
                        configuration3.densityDpi = i37;
                    }
                }
            }
            Configuration configurationP3 = LayoutInflaterFactory2C1456f4.p(context, iA, c2356oLL, configuration3, true);
            c0447Gh = new C0447Gh(context, com.skidush.clonex.R.style.Theme_AppCompat_Empty);
            c0447Gh.a(configurationP3);
            if (context.getTheme() != null) {
                AbstractC3045vW.A(c0447Gh.getTheme());
            }
            context = c0447Gh;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        x();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // o.AbstractActivityC1018ag, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        x();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.s();
        return layoutInflaterFactory2C1456f4.w.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        if (layoutInflaterFactory2C1456f4.A == null) {
            layoutInflaterFactory2C1456f4.y();
            C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
            layoutInflaterFactory2C1456f4.A = new Kh0(c2416ow0 != null ? c2416ow0.C() : layoutInflaterFactory2C1456f4.v);
        }
        return layoutInflaterFactory2C1456f4.A;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC2892ts0.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        if (layoutInflaterFactory2C1456f4.z != null) {
            layoutInflaterFactory2C1456f4.y();
            layoutInflaterFactory2C1456f4.z.getClass();
            layoutInflaterFactory2C1456f4.z(0);
        }
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        if (layoutInflaterFactory2C1456f4.R && layoutInflaterFactory2C1456f4.L) {
            layoutInflaterFactory2C1456f4.y();
            C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
            if (c2416ow0 != null) {
                c2416ow0.E(c2416ow0.d.getResources().getBoolean(com.skidush.clonex.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1846j4 c1846j4A = C1846j4.a();
        Context context = layoutInflaterFactory2C1456f4.v;
        synchronized (c1846j4A) {
            c1846j4A.a.k(context);
        }
        layoutInflaterFactory2C1456f4.d0 = new Configuration(layoutInflaterFactory2C1456f4.v.getResources().getConfiguration());
        layoutInflaterFactory2C1456f4.j(false, false);
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w().c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C2416ow0 c2416ow0X = x();
        if (menuItem.getItemId() != 16908332 || c2416ow0X == null || (((Ol0) c2416ow0X.h).b & 4) == 0) {
            return false;
        }
        return z();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1456f4) w()).s();
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 != null) {
            c2416ow0.w = true;
        }
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C1456f4) w()).j(true, false);
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.y();
        C2416ow0 c2416ow0 = layoutInflaterFactory2C1456f4.z;
        if (c2416ow0 != null) {
            c2416ow0.w = false;
            C2606qu0 c2606qu0 = c2416ow0.v;
            if (c2606qu0 != null) {
                c2606qu0.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        w().i(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        x();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void setContentView(int i) {
        y();
        w().f(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1456f4) w()).f0 = i;
    }

    public final R3 w() {
        if (this.I == null) {
            P3 p3 = R3.l;
            this.I = new LayoutInflaterFactory2C1456f4(this, null, this, this);
        }
        return this.I;
    }

    public final C2416ow0 x() {
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) w();
        layoutInflaterFactory2C1456f4.y();
        return layoutInflaterFactory2C1456f4.z;
    }

    public final void y() {
        zy0.C(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC1474fG.j(decorView, "<this>");
        decorView.setTag(com.skidush.clonex.R.id.view_tree_view_model_store_owner, this);
        AbstractC3021v9.B(getWindow().getDecorView(), this);
        UK.Q(getWindow().getDecorView(), this);
    }

    public boolean z() {
        Intent intentN = AbstractC3409z9.n(this);
        if (intentN == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentN)) {
            navigateUpTo(intentN);
            return true;
        }
        Ai0 ai0 = new Ai0(this);
        Intent intentN2 = AbstractC3409z9.n(this);
        if (intentN2 == null) {
            intentN2 = AbstractC3409z9.n(this);
        }
        if (intentN2 != null) {
            ComponentName component = intentN2.getComponent();
            if (component == null) {
                component = intentN2.resolveActivity(ai0.m.getPackageManager());
            }
            ai0.a(component);
            ai0.l.add(intentN2);
        }
        ai0.d();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public void setContentView(View view) {
        y();
        w().g(view);
    }

    @Override // o.AbstractActivityC1116bg, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        w().h(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
