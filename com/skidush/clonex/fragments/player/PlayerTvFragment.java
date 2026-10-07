package com.skidush.clonex.fragments.player;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.skidush.clonex.R;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;
import com.skidush.clonex.models.Video$Type;
import io.sentry.C0032c;
import io.sentry.android.replay.capture.e;
import io.sentry.android.replay.f;
import io.sentry.android.replay.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.A10;
import o.AH;
import o.AP;
import o.AbstractActivityC1540fx;
import o.AbstractC0397Ej;
import o.AbstractC0911Ye;
import o.AbstractC0937Ze;
import o.AbstractC0985aF;
import o.AbstractC1016af;
import o.AbstractC1119bh0;
import o.AbstractC1370eA;
import o.AbstractC1376eG;
import o.AbstractC1406ef;
import o.AbstractC1443ex0;
import o.AbstractC1459f50;
import o.AbstractC1464f8;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC1899jh0;
import o.AbstractC1923jt0;
import o.AbstractC2011ko0;
import o.AbstractC2208mp0;
import o.AbstractC2506pt;
import o.AbstractC2520q00;
import o.AbstractC2573qe;
import o.AbstractC2661ra;
import o.AbstractC2822t60;
import o.AbstractC3045vW;
import o.AbstractC3327yN;
import o.AbstractC3354yh;
import o.AbstractComponentCallbacksC1247cx;
import o.C0323Bn;
import o.C0398Ek;
import o.C0404Eq;
import o.C0456Gq;
import o.C0503Il;
import o.C0560Kq;
import o.C0580Lk;
import o.C0622Nb;
import o.C0633Nm;
import o.C0638Nr;
import o.C0717Qs;
import o.C0730Rf;
import o.C0754Sd;
import o.C0781Te;
import o.C0788Tl;
import o.C0806Ud;
import o.C0814Ul;
import o.C0832Vd;
import o.C0877Ww;
import o.C0995aP;
import o.C1005aZ;
import o.C1042as;
import o.C1061b10;
import o.C1093bP;
import o.C1101bX;
import o.C1128bm;
import o.C1152by0;
import o.C1158c10;
import o.C1190cP;
import o.C1215ch;
import o.C1233cq;
import o.C1330dq;
import o.C1385eP;
import o.C1387eR;
import o.C1395eZ;
import o.C1483fP;
import o.C1521fn0;
import o.C1562g8;
import o.C1581gP;
import o.C1617gm0;
import o.C1703hg0;
import o.C1717hn0;
import o.C1816io0;
import o.C1906jl;
import o.C1971kP;
import o.C2123lv0;
import o.C2166mP;
import o.C2229n00;
import o.C2231n10;
import o.C2263nP;
import o.C2278nc;
import o.C2295nk0;
import o.C2296nl;
import o.C2303no0;
import o.C2328o10;
import o.C2349oE;
import o.C2379oe;
import o.C2393ol;
import o.C2409ot;
import o.C2425p10;
import o.C2446pE;
import o.C2522q10;
import o.C2605qu;
import o.C2613qy;
import o.C2628r60;
import o.C2691rp;
import o.C2720s4;
import o.C2761sb0;
import o.C2994uv;
import o.C3084vr0;
import o.C3168wl;
import o.C3182ws;
import o.C3200x10;
import o.C3297y10;
import o.C3376ys;
import o.C3394z10;
import o.C3426zP;
import o.CJ;
import o.CZ;
import o.CountDownTimerC1254d00;
import o.Cr0;
import o.Dr0;
import o.Ds0;
import o.EnumC1103bZ;
import o.EnumC2476pe;
import o.FZ;
import o.G;
import o.GZ;
import o.H30;
import o.H5;
import o.HM;
import o.Hs0;
import o.I6;
import o.IJ;
import o.InterfaceC0428Fo;
import o.InterfaceC2220mv0;
import o.InterfaceC2339o7;
import o.InterfaceC2486pj;
import o.InterfaceC2854tZ;
import o.Is0;
import o.JZ;
import o.Js0;
import o.K1;
import o.LW;
import o.Lr0;
import o.Lx0;
import o.M60;
import o.Ma0;
import o.NV;
import o.Na0;
import o.O3;
import o.OV;
import o.Ov0;
import o.P30;
import o.PZ;
import o.Q30;
import o.QW;
import o.Qd0;
import o.RN;
import o.RZ;
import o.Rh0;
import o.Sr0;
import o.U9;
import o.UK;
import o.VZ;
import o.ViewOnClickListenerC1010ac;
import o.ViewOnFocusChangeListenerC3348ye;
import o.ViewOnKeyListenerC3075vn;
import o.W00;
import o.WindowCallbackC2134m10;
import o.X10;
import o.X9;
import o.Y00;
import o.YO;
import o.Z00;
import o.Z10;
import o.Z9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerTvFragment extends AbstractComponentCallbacksC1247cx {
    public static int h1 = 2131427696;
    public final RN A0;
    public final Rh0 B0;
    public final C0560Kq C0;
    public C1042as D0;
    public C2994uv E0;
    public List F0;
    public int G0;
    public int H0;
    public final int I0;
    public final long J0;
    public final long K0;
    public AH L0;
    public AH M0;
    public C1703hg0 N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public C1703hg0 R0;
    public boolean S0;
    public final C2295nk0 T0;
    public final LinkedHashSet U0;
    public int V0;
    public boolean W0;
    public long X0;
    public AH Y0;
    public C1703hg0 Z0;
    public boolean a1;
    public boolean b1;
    public long c1;
    public int d1;
    public long e1;
    public long f1;
    public final C0877Ww g1;
    public final CJ l0;
    public CountDownTimer m0;
    public boolean n0;
    public Ds0 o0;
    public Js0 p0;
    public boolean q0;
    public boolean r0;
    public Boolean s0;
    public WebView t0;
    public Dialog u0;
    public boolean v0;
    public long w0;
    public boolean x0;
    public Window.Callback y0;
    public C0560Kq z0;

    public PlayerTvFragment() {
        IJ ij = IJ.n;
        this.l0 = AP.m(ij, new C1061b10(this, 3));
        this.w0 = -9223372036854775807L;
        this.A0 = new RN(AbstractC2822t60.a(A10.class), 4, new C3182ws(10, this));
        this.B0 = new Rh0(new C1061b10(this, 0));
        C1061b10 c1061b10 = new C1061b10(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), ij);
        this.C0 = new C0560Kq(AbstractC2822t60.a(Z10.class), new C3376ys(cjN, 0), c1061b10, new C3376ys(cjN, 1));
        this.F0 = C1233cq.l;
        this.I0 = 3;
        this.J0 = 15000L;
        this.K0 = 10000L;
        this.T0 = new C2295nk0(9);
        this.U0 = new LinkedHashSet();
        this.c1 = -1L;
        this.g1 = O(new K1(0), new C2278nc(21, this));
    }

    public static final String W(PlayerTvFragment playerTvFragment, C0456Gq c0456Gq) {
        playerTvFragment.getClass();
        String strO = c0456Gq.c;
        if (strO == null) {
            strO = playerTvFragment.o(R.string.episode_number, Integer.valueOf(c0456Gq.b));
            AbstractC1474fG.i(strO, "getString(...)");
        }
        Ma0 ma0 = c0456Gq.f;
        String strO2 = null;
        if (ma0 != null) {
            int i = ma0.b;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                strO2 = playerTvFragment.o(R.string.player_subtitle_tv_show, Integer.valueOf(numValueOf.intValue()), Integer.valueOf(c0456Gq.b), strO);
            }
        }
        if (strO2 != null) {
            return strO2;
        }
        String strO3 = playerTvFragment.o(R.string.player_subtitle_tv_show_episode_only, Integer.valueOf(c0456Gq.b), strO);
        AbstractC1474fG.i(strO3, "getString(...)");
        return strO3;
    }

    public static final void X(PlayerTvFragment playerTvFragment, C0456Gq c0456Gq) {
        LW lw;
        playerTvFragment.f0();
        C0560Kq c0560Kq = playerTvFragment.z0;
        FrameLayout frameLayout = (c0560Kq == null || (lw = (LW) c0560Kq.f370o) == null) ? null : lw.m;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C2425p10(playerTvFragment, c0456Gq, null), 3);
    }

    public static final void Y(PlayerTvFragment playerTvFragment) {
        AH ah = playerTvFragment.Y0;
        if (ah != null) {
            ah.f(null);
        }
        playerTvFragment.Y0 = null;
        C2295nk0 c2295nk0 = playerTvFragment.T0;
        c2295nk0.m = 0;
        c2295nk0.n = null;
        playerTvFragment.W0 = false;
        playerTvFragment.X0 = 0L;
        playerTvFragment.U0.clear();
        playerTvFragment.V0 = 0;
    }

    public static final void Z(PlayerTvFragment playerTvFragment, String str) {
        if (!playerTvFragment.t0() || AbstractC1119bh0.W(str, "DRM", true) || AbstractC1119bh0.W(str, "NO_LICENSE", true)) {
            return;
        }
        AH ah = playerTvFragment.M0;
        if (ah != null) {
            ah.f(null);
        }
        playerTvFragment.M0 = null;
        if (playerTvFragment.O0) {
            return;
        }
        AH ah2 = playerTvFragment.L0;
        if (ah2 == null || !ah2.a()) {
            int i = playerTvFragment.H0;
            int i2 = playerTvFragment.I0;
            if (i >= i2) {
                playerTvFragment.O0 = true;
                C0560Kq c0560Kq = playerTvFragment.z0;
                FrameLayout frameLayout = c0560Kq != null ? (FrameLayout) c0560Kq.n : null;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                Toast.makeText(playerTvFragment.Q(), "Canal no disponible temporalmente. Intenta más tarde.", 1).show();
                return;
            }
            int i3 = i + 1;
            playerTvFragment.H0 = i3;
            long j = ((long) i3) * 3000;
            long j2 = j / ((long) 1000);
            Toast.makeText(playerTvFragment.Q(), "⟳ Reintentando canal... (" + i3 + "/" + i2 + ")", 0).show();
            playerTvFragment.L0 = AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C2522q10(j, playerTvFragment, playerTvFragment.o0, i3, null), 3);
        }
    }

    public static final boolean a0(PlayerTvFragment playerTvFragment, String str, String str2) {
        playerTvFragment.getClass();
        if (str2 == null || AbstractC1899jh0.O(str2)) {
            return true;
        }
        Uri uri = Uri.parse(str2);
        AbstractC1474fG.g(uri);
        if (!AbstractC1370eA.z(uri)) {
            return true;
        }
        List listK = AbstractC0937Ze.K("doubleclick.net", "googlesyndication.com", "adservice.google.com", "admob.com", "adsense.com", "adserver", "adclick", "adnetwork", "taboola.com", "outbrain.com", "revcontent.com", "propellerads.com", "mgid.com");
        if (!listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(str2, (String) it.next(), true)) {
                    return true;
                }
            }
        }
        return AbstractC1119bh0.W(str2, "ads", true) || AbstractC1119bh0.W(str2, "/ads/", true) || AbstractC1119bh0.W(str2, "/ad/", true) || AbstractC1119bh0.W(str2, "banner", true) || AbstractC1119bh0.W(str2, "pop.js", true) || AbstractC1119bh0.W(str2, "popup.js", true) || AbstractC1119bh0.W(str2, "banner", true) || AbstractC1119bh0.W(str2, "pop", true) || !AbstractC3045vW.u(str, str2);
    }

    public static final void b0(PlayerTvFragment playerTvFragment, int i, String str) {
        if (playerTvFragment.W0 || !playerTvFragment.v0()) {
            return;
        }
        AH ah = playerTvFragment.Y0;
        if (ah != null) {
            ah.f(null);
        }
        playerTvFragment.Y0 = null;
        Ds0 ds0 = playerTvFragment.o0;
        if (ds0 == null) {
            return;
        }
        if (playerTvFragment.u0()) {
            C1816io0 c1816io0 = C1816io0.b;
            C1816io0.C(ds0);
        }
        playerTvFragment.U0.add(ds0.l);
        List listO0 = playerTvFragment.o0(true);
        Ds0 ds1 = (Ds0) AbstractC0911Ye.d0(listO0);
        if (ds1 == null) {
            playerTvFragment.W0 = false;
            C0560Kq c0560Kq = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq);
            ((FrameLayout) c0560Kq.n).setVisibility(8);
            Toast.makeText(playerTvFragment.Q(), "No hay otra fuente estable disponible.", 1).show();
            return;
        }
        C1042as c1042as = playerTvFragment.D0;
        if (c1042as == null) {
            return;
        }
        long jF = U9.f(c1042as.C(), 0L);
        long jH = c1042as.H();
        playerTvFragment.W0 = true;
        playerTvFragment.v0 = false;
        C2295nk0 c2295nk0 = playerTvFragment.T0;
        c2295nk0.m = 0;
        c2295nk0.n = null;
        playerTvFragment.X0 = SystemClock.elapsedRealtime() + 10000;
        AbstractC0397Ej.D(i, str);
        Map map = ds0.f223o;
        if (map != null) {
        }
        Map map2 = ds1.f223o;
        if (map2 != null) {
        }
        Toast.makeText(playerTvFragment.Q(), (!playerTvFragment.u0() || listO0.size() <= 1) ? AbstractC1701hf0.h(new StringBuilder("Servidor inestable. Cambiando a "), ds1.m, "…") : "Servidor inestable. Buscando la fuente estable más rápida…", 0).show();
        if (jH > 0 && jH != -9223372036854775807L) {
            playerTvFragment.n0().k(jF, jH);
        }
        if (playerTvFragment.u0()) {
            playerTvFragment.n0().h(listO0, Long.valueOf(jF));
        } else {
            playerTvFragment.n0().g(ds1, Long.valueOf(jF));
        }
    }

    public static final void c0(PlayerTvFragment playerTvFragment, boolean z) {
        if (!z) {
            AH ah = playerTvFragment.M0;
            if (ah != null) {
                ah.f(null);
            }
            playerTvFragment.M0 = null;
            return;
        }
        if (!playerTvFragment.t0() || playerTvFragment.H0 == 0 || playerTvFragment.O0) {
            return;
        }
        AH ah2 = playerTvFragment.M0;
        if (ah2 == null || !ah2.a()) {
            playerTvFragment.M0 = AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C3394z10(playerTvFragment, null), 3);
        }
    }

    public static final void d0(PlayerTvFragment playerTvFragment, C1387eR c1387eR) {
        playerTvFragment.getClass();
        if (!AbstractC1474fG.b(c1387eR.n.get("is_adult"), Boolean.TRUE)) {
            C2379oe c2379oe = C2379oe.b;
            if (!C2379oe.u(c1387eR.b)) {
                playerTvFragment.w0(c1387eR);
                return;
            }
        }
        C0503Il c0503Il = new C0503Il(playerTvFragment, 3, c1387eR);
        EditText editText = new EditText(playerTvFragment.Q());
        editText.setHint("Ingresa el PIN");
        editText.setInputType(18);
        editText.setMaxLines(1);
        editText.setPadding(40, 20, 40, 20);
        new AlertDialog.Builder(playerTvFragment.Q()).setTitle("Contenido para adultos 🔞").setMessage("Este canal requiere PIN parental para ser visto.").setView(editText).setPositiveButton("Confirmar", new Z00(editText, c0503Il, playerTvFragment, 0)).setNegativeButton("Cancelar", (DialogInterface.OnClickListener) null).show();
    }

    public static C1215ch j0(PlayerView playerView) {
        View viewFindViewById = playerView.findViewById(R.id.cl_exo_controller);
        int i = R.id.btn_categories;
        ImageButton imageButton = (ImageButton) Sr0.g(viewFindViewById, R.id.btn_categories);
        if (imageButton != null) {
            i = R.id.btn_exo_aspect_ratio;
            ImageView imageView = (ImageView) Sr0.g(viewFindViewById, R.id.btn_exo_aspect_ratio);
            if (imageView != null) {
                i = R.id.btn_exo_external_player;
                if (((ImageView) Sr0.g(viewFindViewById, R.id.btn_exo_external_player)) != null) {
                    i = R.id.btn_exo_server_switch;
                    ImageButton imageButton2 = (ImageButton) Sr0.g(viewFindViewById, R.id.btn_exo_server_switch);
                    if (imageButton2 != null) {
                        i = R.id.btn_next_channel;
                        ImageButton imageButton3 = (ImageButton) Sr0.g(viewFindViewById, R.id.btn_next_channel);
                        if (imageButton3 != null) {
                            i = R.id.btn_prev_channel;
                            ImageButton imageButton4 = (ImageButton) Sr0.g(viewFindViewById, R.id.btn_prev_channel);
                            if (imageButton4 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                                i = R.id.exo_bottom_bar;
                                if (((ConstraintLayout) Sr0.g(viewFindViewById, R.id.exo_bottom_bar)) != null) {
                                    i = R.id.exo_controls_background;
                                    if (Sr0.g(viewFindViewById, R.id.exo_controls_background) != null) {
                                        i = R.id.exo_duration;
                                        if (((TextView) Sr0.g(viewFindViewById, R.id.exo_duration)) != null) {
                                            i = R.id.exo_play_pause;
                                            if (((ImageView) Sr0.g(viewFindViewById, R.id.exo_play_pause)) != null) {
                                                i = R.id.exo_position;
                                                if (((TextView) Sr0.g(viewFindViewById, R.id.exo_position)) != null) {
                                                    i = R.id.exo_progress;
                                                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) Sr0.g(viewFindViewById, R.id.exo_progress);
                                                    if (defaultTimeBar != null) {
                                                        i = R.id.exo_settings;
                                                        ImageView imageView2 = (ImageView) Sr0.g(viewFindViewById, R.id.exo_settings);
                                                        if (imageView2 != null) {
                                                            i = R.id.tv_btn_categories_label;
                                                            if (((TextView) Sr0.g(viewFindViewById, R.id.tv_btn_categories_label)) != null) {
                                                                i = R.id.tv_exo_subtitle;
                                                                TextView textView = (TextView) Sr0.g(viewFindViewById, R.id.tv_exo_subtitle);
                                                                if (textView != null) {
                                                                    i = R.id.tv_exo_title;
                                                                    TextView textView2 = (TextView) Sr0.g(viewFindViewById, R.id.tv_exo_title);
                                                                    if (textView2 != null) {
                                                                        i = R.id.tv_time_separator;
                                                                        if (((TextView) Sr0.g(viewFindViewById, R.id.tv_time_separator)) != null) {
                                                                            return new C1215ch(constraintLayout, imageButton, imageView, imageButton2, imageButton3, imageButton4, defaultTimeBar, imageView2, textView, textView2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }

    public static String l0(String str, Map map) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC1899jh0.N((String) ((Map.Entry) next).getKey(), str, true));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getValue();
        }
        return null;
    }

    public static void r0(PlayerTvFragment playerTvFragment) {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Boolean boolValueOf = null;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
            SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
        }
        playerTvFragment.q0(boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_player_tv, viewGroup, false);
        int i = R.id.loading_overlay;
        FrameLayout frameLayout = (FrameLayout) Sr0.g(viewInflate, R.id.loading_overlay);
        if (frameLayout != null) {
            i = R.id.next_episode_overlay;
            View viewG = Sr0.g(viewInflate, R.id.next_episode_overlay);
            if (viewG != null) {
                int i2 = R.id.btn_cancel;
                TextView textView = (TextView) Sr0.g(viewG, R.id.btn_cancel);
                if (textView != null) {
                    i2 = R.id.btn_play_now;
                    Button button = (Button) Sr0.g(viewG, R.id.btn_play_now);
                    if (button != null) {
                        i2 = R.id.countdown_container;
                        if (((FrameLayout) Sr0.g(viewG, R.id.countdown_container)) != null) {
                            i2 = R.id.countdown_progress;
                            ProgressBar progressBar = (ProgressBar) Sr0.g(viewG, R.id.countdown_progress);
                            if (progressBar != null) {
                                i2 = R.id.iv_next_episode_thumbnail;
                                ImageView imageView = (ImageView) Sr0.g(viewG, R.id.iv_next_episode_thumbnail);
                                if (imageView != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) viewG;
                                    i2 = R.id.tv_countdown;
                                    TextView textView2 = (TextView) Sr0.g(viewG, R.id.tv_countdown);
                                    if (textView2 != null) {
                                        i2 = R.id.tv_next_episode_label;
                                        if (((TextView) Sr0.g(viewG, R.id.tv_next_episode_label)) != null) {
                                            i2 = R.id.tv_next_episode_title;
                                            TextView textView3 = (TextView) Sr0.g(viewG, R.id.tv_next_episode_title);
                                            if (textView3 != null) {
                                                LW lw = new LW(frameLayout2, textView, button, progressBar, imageView, textView2, textView3, 1);
                                                if (((ProgressBar) Sr0.g(viewInflate, R.id.pb_loading)) != null) {
                                                    PlayerView playerView = (PlayerView) Sr0.g(viewInflate, R.id.pv_player);
                                                    if (playerView != null) {
                                                        PlayerSettingsTvView playerSettingsTvView = (PlayerSettingsTvView) Sr0.g(viewInflate, R.id.settings);
                                                        if (playerSettingsTvView != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            this.z0 = new C0560Kq(constraintLayout, frameLayout, lw, playerView, playerSettingsTvView, 5);
                                                            AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                                                            return constraintLayout;
                                                        }
                                                        i = R.id.settings;
                                                    } else {
                                                        i = R.id.pv_player;
                                                    }
                                                } else {
                                                    i = R.id.pb_loading;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewG.getResources().getResourceName(i2)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void A0() {
        AH ah = this.L0;
        if (ah != null) {
            ah.f(null);
        }
        this.L0 = null;
        AH ah2 = this.M0;
        if (ah2 != null) {
            ah2.f(null);
        }
        this.M0 = null;
        this.H0 = 0;
        this.O0 = false;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        A0();
        C1703hg0 c1703hg0 = this.N0;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.N0 = null;
        CountDownTimer countDownTimer = this.m0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        f0();
        this.S0 = false;
        z0();
        g0();
        y0();
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            ((Ds0) it.next()).r = null;
        }
        Ds0 ds0 = this.o0;
        if (ds0 != null) {
            ds0.r = null;
        }
        this.p0 = null;
        this.o0 = null;
        this.F0 = C1233cq.l;
        this.z0 = null;
        this.Q = true;
    }

    public final void B0() {
        C0560Kq c0560Kq = this.z0;
        if (c0560Kq == null) {
            return;
        }
        this.x0 = true;
        AbstractC1474fG.g(c0560Kq);
        ((PlayerView) c0560Kq.p).post(new W00(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [j$.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    public final void C0() {
        ?? linkedHashMap;
        int i;
        int i2;
        Dialog dialog = this.u0;
        if (dialog == null || !dialog.isShowing()) {
            Context contextQ = Q();
            if (AbstractC1899jh0.U(i0().a, "claro-", false) || AbstractC1899jh0.U(i0().a, "fctvevent-", false)) {
                C2379oe c2379oe = C2379oe.b;
                linkedHashMap = new LinkedHashMap();
                for (C1387eR c1387eR : C2379oe.j.values()) {
                    Object obj = c1387eR.n.get("category");
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        Object arrayList = linkedHashMap.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(str, arrayList);
                        }
                        ((List) arrayList).add(c1387eR);
                    }
                }
            } else {
                linkedHashMap = AbstractC1899jh0.U(i0().a, "claroar-", false) ? H5.j : C1816io0.e;
            }
            if (linkedHashMap.isEmpty()) {
                Toast.makeText(contextQ, "No hay canales disponibles", 0).show();
                return;
            }
            Dialog dialog2 = new Dialog(contextQ, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
            dialog2.setContentView(R.layout.dialog_channel_list_tv);
            Window window = dialog2.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            this.u0 = dialog2;
            dialog2.setOnDismissListener(new HM(1, this));
            dialog2.show();
            RecyclerView recyclerView = (RecyclerView) dialog2.findViewById(R.id.rv_categories);
            RecyclerView recyclerView2 = (RecyclerView) dialog2.findViewById(R.id.rv_channels);
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
            List listQ0 = AbstractC0911Ye.q0(AbstractC0911Ye.x0(linkedHashMap.keySet()));
            String str2 = i0().a;
            String str3 = (AbstractC1899jh0.U(str2, "tv-", false) || AbstractC1899jh0.U(str2, "claro-", false) || AbstractC1899jh0.U(str2, "claroar-", false)) ? str2 : null;
            C2628r60 c2628r60 = new C2628r60();
            c2628r60.l = -1;
            if (str3 == null) {
                i = 0;
                break;
            }
            Iterator it = listQ0.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                int i4 = i3 + 1;
                List list = (List) linkedHashMap.get((String) it.next());
                if (list == null) {
                    i2 = -1;
                    break;
                }
                Iterator it2 = list.iterator();
                i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (AbstractC1474fG.b(((C1387eR) it2.next()).a, str3)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    c2628r60.l = i2;
                    i = i3;
                    break;
                }
                i3 = i4;
            }
            C1233cq c1233cq = C1233cq.l;
            C1717hn0 c1717hn0 = new C1717hn0(str3, new e(dialog2, 9, this));
            recyclerView2.setAdapter(c1717hn0);
            C1521fn0 c1521fn0 = new C1521fn0(listQ0, i, new p(linkedHashMap, c1717hn0, recyclerView2, 7), new f(15, recyclerView2), recyclerView2);
            recyclerView.setAdapter(c1521fn0);
            c1717hn0.g = recyclerView;
            c1717hn0.h = new f(14, c1521fn0);
            if (true ^ listQ0.isEmpty()) {
                List list2 = (List) linkedHashMap.get((String) listQ0.get(i));
                if (list2 == null) {
                    list2 = c1233cq;
                }
                c1717hn0.d = list2;
                c1717hn0.a.b();
                recyclerView.g0(i);
                int i5 = c2628r60.l;
                if (i5 != -1) {
                    recyclerView2.g0(i5);
                    recyclerView2.post(new O3(recyclerView2, 12, c2628r60));
                }
                recyclerView2.setTag("loaded");
            }
        }
    }

    public final void D0(ImageView imageView) {
        if (imageView != null) {
            C1042as c1042as = this.D0;
            imageView.setImageDrawable(AbstractC3354yh.b(Q(), c1042as != null ? c1042as.f() : false ? R.drawable.exo_styled_controls_pause : R.drawable.exo_styled_controls_play));
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void F() {
        this.Q = true;
        C1042as c1042as = this.D0;
        if (c1042as != null) {
            n0().k(c1042as.C(), c1042as.H());
            c1042as.i();
        }
        f0();
        this.S0 = false;
        if (Build.VERSION.SDK_INT <= 23) {
            z0();
            y0();
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void G() {
        this.Q = true;
        p0();
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || this.D0 == null) {
            r0(this);
        }
        if (i <= 23) {
            s0();
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void I() {
        this.Q = true;
        if (Build.VERSION.SDK_INT > 23) {
            r0(this);
            s0();
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void J() {
        this.Q = true;
        if (Build.VERSION.SDK_INT > 23) {
            z0();
            y0();
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C2229n00 c2229n00 = AbstractC2520q00.a;
        AbstractC2520q00.b = false;
        AbstractC2520q00.c = null;
        AbstractC2520q00.d = false;
        AbstractC2520q00.e = null;
        AbstractC2520q00.f = null;
        AbstractC2520q00.g = null;
        p0();
        P().n().a(q(), new C0781Te(3, this));
        this.m0 = new CountDownTimerC1254d00(1, this).start();
        C1703hg0 c1703hg0 = this.N0;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        if (!UK.F(i0().a)) {
            this.N0 = AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C3200x10(this, null), 3);
        }
        C1703hg0 c1703hg1 = this.Z0;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        this.Z0 = AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C3297y10(this, null), 3);
        C0560Kq c0560Kq = this.z0;
        AbstractC1474fG.g(c0560Kq);
        ((FrameLayout) c0560Kq.n).setVisibility(0);
        C0560Kq c0560Kq2 = this.z0;
        AbstractC1474fG.g(c0560Kq2);
        ((FrameLayout) c0560Kq2.n).setFocusable(true);
        C0560Kq c0560Kq3 = this.z0;
        AbstractC1474fG.g(c0560Kq3);
        ((FrameLayout) c0560Kq3.n).setFocusableInTouchMode(true);
        C0560Kq c0560Kq4 = this.z0;
        AbstractC1474fG.g(c0560Kq4);
        ((FrameLayout) c0560Kq4.n).setOnKeyListener(new ViewOnKeyListenerC3075vn(1, this));
        C0560Kq c0560Kq5 = this.z0;
        AbstractC1474fG.g(c0560Kq5);
        ((FrameLayout) c0560Kq5.n).requestFocus();
        C0560Kq c0560Kq6 = this.z0;
        AbstractC1474fG.g(c0560Kq6);
        ((PlayerSettingsTvView) c0560Kq6.q).setOnExtraBufferingSelectedListener(new C0717Qs(1, this, PlayerTvFragment.class, "switchExtraBuffering", "switchExtraBuffering(Z)V", 0, 7));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2231n10(this, null), 3);
    }

    public final void e0() {
        C1042as c1042as = this.D0;
        if (c1042as == null || this.F0.isEmpty()) {
            return;
        }
        C2166mP c2166mP = new C2166mP();
        c2166mP.a = "Available servers";
        List<Ds0> list = this.F0;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (Ds0 ds0 : list) {
            arrayList.add(new C3426zP(ds0.l, ds0.m));
        }
        AbstractC0397Ej.G(c2166mP, arrayList);
        c1042as.Y(new C2263nP(c2166mP));
    }

    public final void f0() {
        C1703hg0 c1703hg0 = this.R0;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.R0 = null;
    }

    public final void g0() {
        WebView webView = this.t0;
        if (webView == null) {
            return;
        }
        this.t0 = null;
        try {
            webView.stopLoading();
            webView.onPause();
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("about:blank");
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:241:0x0561  */
    /* JADX WARN: Code duplicated, block: B:244:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:248:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:249:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:251:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:252:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05df  */
    /* JADX WARN: Code duplicated, block: B:256:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:259:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:272:0x0629  */
    /* JADX WARN: Code duplicated, block: B:275:0x0637  */
    /* JADX WARN: Code duplicated, block: B:278:0x0654 A[LOOP:2: B:276:0x064e->B:278:0x0654, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:285:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:289:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:292:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:294:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:295:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:297:0x06df  */
    /* JADX WARN: Code duplicated, block: B:300:0x070b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0716  */
    /* JADX WARN: Code duplicated, block: B:305:0x071a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0721 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x0729 A[PHI: r6 r9
  0x0729: PHI (r6v4 boolean) = (r6v12 boolean), (r6v12 boolean), (r6v17 boolean) binds: [B:310:0x0727, B:306:0x071e, B:301:0x0713] A[DONT_GENERATE, DONT_INLINE]
  0x0729: PHI (r9v7 boolean) = (r9v32 boolean), (r9v32 boolean), (r9v35 boolean) binds: [B:310:0x0727, B:306:0x071e, B:301:0x0713] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:312:0x072b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0733  */
    /* JADX WARN: Code duplicated, block: B:317:0x0736  */
    /* JADX WARN: Code duplicated, block: B:320:0x073e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0741  */
    /* JADX WARN: Code duplicated, block: B:324:0x074b  */
    /* JADX WARN: Code duplicated, block: B:326:0x0755  */
    /* JADX WARN: Code duplicated, block: B:327:0x075c  */
    /* JADX WARN: Code duplicated, block: B:330:0x0771  */
    /* JADX WARN: Code duplicated, block: B:333:0x0779 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:334:0x077b  */
    /* JADX WARN: Code duplicated, block: B:336:0x0785  */
    /* JADX WARN: Code duplicated, block: B:337:0x078c  */
    /* JADX WARN: Code duplicated, block: B:340:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:342:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:345:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:349:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:350:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:353:0x0808  */
    /* JADX WARN: Code duplicated, block: B:367:0x08a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:368:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:370:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:371:0x08c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:372:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:373:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:375:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:377:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:379:0x0904 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:380:0x0906  */
    /* JADX WARN: Code duplicated, block: B:381:0x0910 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:382:0x0912  */
    /* JADX WARN: Code duplicated, block: B:383:0x091c  */
    /* JADX WARN: Code duplicated, block: B:385:0x0927  */
    /* JADX WARN: Code duplicated, block: B:389:0x093a  */
    /* JADX WARN: Code duplicated, block: B:391:0x0961  */
    /* JADX WARN: Code duplicated, block: B:407:0x0981  */
    /* JADX WARN: Code duplicated, block: B:412:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:416:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:419:0x09be  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:462:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:467:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:469:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:470:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:472:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:475:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:478:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
    public final void h0(Js0 js0, Ds0 ds0, long j) {
        Object next;
        boolean z;
        C2446pE c2446pEB;
        String str;
        Object obj;
        OV ov;
        C2994uv c2994uv;
        boolean zA;
        boolean zB;
        String str2;
        InterfaceC2486pj c2720s4;
        C1093bP c1093bP;
        List listEmptyList;
        M60 m60;
        List list;
        AbstractC0985aF abstractC0985aFL;
        String str3;
        String str4;
        String str5;
        String lowerCase;
        boolean zB2;
        C0633Nm c0633Nm;
        String str6;
        C0398Ek c0398Ek;
        boolean z2;
        C1483fP c1483fP;
        C1971kP c1971kP;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String strL0;
        C0832Vd c0832Vd;
        JSONObject jSONObject;
        String strOptString;
        String str7;
        AbstractC1464f8 abstractC1464f8C;
        JSONObject jSONObject2;
        String strOptString2;
        String str8;
        String str9;
        boolean z7;
        long j2;
        PlayerTvFragment playerTvFragment;
        C1042as c1042as;
        C1042as c1042as2;
        C1042as c1042as3;
        C1042as c1042as4;
        C1042as c1042as5;
        InterfaceC2220mv0 interfaceC2220mv0F;
        C2123lv0 c2123lv0B;
        String str10;
        String lowerCase2;
        C1190cP c1190cP;
        InterfaceC0428Fo interfaceC0428Fo;
        C0398Ek c0398EkS;
        byte[] bArr;
        InterfaceC0428Fo c2720s5;
        C1190cP c1190cP2;
        C2446pE c2446pEB2;
        Uri uri;
        C0032c c0032c;
        Object next2;
        Q30 q30;
        String lowerCase3;
        NV nvO;
        String str11;
        String str12;
        String str13;
        String str14;
        Object next3;
        Q30 q31;
        String strL1;
        int i = 1;
        boolean zW = AbstractC1119bh0.W(js0.l, "dailymotion.com", true);
        String str15 = js0.s;
        this.q0 = zW || (str15 != null && AbstractC1119bh0.W(str15, "dailymotion.com", true));
        C0560Kq c0560Kq = this.z0;
        AbstractC1474fG.g(c0560Kq);
        C0404Eq c0404Eq = Dr0.p;
        c0404Eq.getClass();
        G g = new G(0, c0404Eq);
        while (true) {
            if (!g.hasNext()) {
                next = null;
                break;
            }
            next = g.next();
            int i2 = ((Dr0) next).m;
            Integer numA = Cr0.p.a();
            if (numA != null && i2 == numA.intValue()) {
                break;
            }
        }
        Dr0 dr0 = (Dr0) next;
        if (dr0 == null) {
            dr0 = Dr0.Fit;
        }
        ((PlayerView) c0560Kq.p).setResizeMode(dr0.m);
        String str16 = js0.l;
        AbstractC1923jt0.G(str16);
        String str17 = js0.n;
        boolean zB3 = AbstractC1474fG.b(str17, "webview");
        Map map = C1330dq.l;
        String str18 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36";
        Map map2 = js0.m;
        if (!zB3) {
            C0560Kq c0560Kq2 = this.z0;
            AbstractC1474fG.g(c0560Kq2);
            ((PlayerView) c0560Kq2.p).setVisibility(0);
            g0();
            Uri uri2 = Uri.parse(str16);
            boolean z8 = AbstractC1899jh0.N(str17, "hls", true) && AbstractC1899jh0.U(str16, "data:application/vnd.apple.mpegurl;base64,", false);
            if (AbstractC1899jh0.U(ds0.l, "xuper-ranger:", false)) {
                String strB = Cr0.m.b();
                if (AbstractC1474fG.b(strB, "PPV.TO")) {
                    q31 = QW.b;
                } else {
                    Q30.a.getClass();
                    Iterator it = P30.b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!AbstractC1474fG.b(((Q30) next3).getName(), strB));
                    Q30 q32 = (Q30) next3;
                    q31 = q32 == null ? C1816io0.b : q32;
                }
                if (q31 == C1152by0.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z8) {
                AbstractC1474fG.g(uri2);
                String string = uri2.toString();
                AbstractC1474fG.i(string, "toString(...)");
                if (!AbstractC1370eA.C(string, z)) {
                    Toast.makeText(Q(), "URL de video insegura o inválida", 1).show();
                }
            }
            AbstractC1474fG.j(str16, "<this>");
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, str16);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
                c2446pEB = null;
            }
            if (Build.VERSION.SDK_INT <= 22 && AbstractC1119bh0.W(str16, "m3u8", false)) {
                Toast.makeText(Q(), "Dispositivo con soporte limitado de códecs. Probando reproducción...", 0).show();
            }
            if (map2 == null) {
                Map mapY = str15 != null ? AbstractC3327yN.y(new C1101bX("Referer", str15)) : null;
                if (mapY != null) {
                    map = mapY;
                }
            } else {
                map = map2;
            }
            LinkedHashMap linkedHashMapD = AbstractC3327yN.D(map);
            if (l0("Accept", linkedHashMapD) == null) {
                linkedHashMapD.put("Accept", "*/*");
            }
            if (l0("User-Agent", linkedHashMapD) == null) {
                linkedHashMapD.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
            }
            boolean zW2 = AbstractC1119bh0.W(str16, "la14hd", false);
            String str19 = js0.p;
            if (zW2) {
                str = str15;
                obj = "parse(...)";
            } else {
                obj = "parse(...)";
                if (!AbstractC1119bh0.W(str16, "streamtp", false) && !AbstractC1119bh0.W(str16, "cdn-sp", false) && !AbstractC1119bh0.W(str16, "fubohd", false) && !AbstractC1119bh0.W(str16, "crackstreamslivehd", false) && (map2 == null || (str14 = (String) map2.get("Referer")) == null || !AbstractC1119bh0.W(str14, "la14hd", false))) {
                    if (map2 == null || (str13 = (String) map2.get("referer")) == null) {
                        str = str15;
                    } else {
                        str = str15;
                        if (!AbstractC1119bh0.W(str13, "la14hd", false)) {
                        }
                    }
                    if ((map2 == null || (str12 = (String) map2.get("Referer")) == null || !AbstractC1119bh0.W(str12, "streamtp", false)) && (map2 == null || (str11 = (String) map2.get("referer")) == null || !AbstractC1119bh0.W(str11, "streamtp", false))) {
                        String strB2 = Cr0.m.b();
                        if (AbstractC1474fG.b(strB2, "PPV.TO")) {
                            q30 = QW.b;
                        } else {
                            Q30.a.getClass();
                            Iterator it2 = P30.b.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!AbstractC1474fG.b(((Q30) next2).getName(), strB2));
                            Q30 q33 = (Q30) next2;
                            q30 = q33 == null ? C1816io0.b : q33;
                        }
                        boolean z9 = q30 == Lx0.b || q30 == C1152by0.b;
                        boolean z10 = q30 == QW.b;
                        boolean z11 = q30 == C2409ot.b || AbstractC1899jh0.U(i0().a, "fana-", false);
                        String host = uri2.getHost();
                        if (host != null) {
                            lowerCase3 = host.toLowerCase(Locale.ROOT);
                            AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                        } else {
                            lowerCase3 = null;
                        }
                        if (lowerCase3 == null) {
                            lowerCase3 = "";
                        }
                        boolean z12 = z10 || z11 || (AbstractC1474fG.b(lowerCase3, "kick.com") || AbstractC1899jh0.L(lowerCase3, ".kick.com", false) || AbstractC1474fG.b(lowerCase3, "playback.live-video.net") || AbstractC1899jh0.L(lowerCase3, ".playback.live-video.net", false)) || (AbstractC1899jh0.U(i0().a, "claro-", false) || AbstractC1899jh0.U(i0().a, "claroar-", false) || (str19 != null && AbstractC1899jh0.U(str19, "claro", true)));
                        boolean z13 = z9 && AbstractC1443ex0.b(str16);
                        if (z13) {
                            nvO = AbstractC1443ex0.a();
                        } else {
                            X10 x10 = X10.r;
                            X10 x11 = X10.q;
                            X9 x9 = AbstractC1370eA.m;
                            X9 x12 = Sr0.b;
                            X9 x13 = Sr0.a;
                            if (z12) {
                                nvO = new NV();
                                nvO.g(Proxy.NO_PROXY);
                                nvO.h(InterfaceC2339o7.a);
                                nvO.c.add(x13);
                                nvO.d.add(x12);
                                AbstractC1406ef.S(nvO.c, x11);
                                AbstractC1406ef.S(nvO.d, x10);
                                nvO.c.add(x9);
                                nvO.d.add(x9);
                            } else {
                                Rh0 rh0 = AbstractC2208mp0.a;
                                str19 = str19;
                                if (AbstractC1899jh0.N(lowerCase3, "cdn1.tvlin.net", true)) {
                                    C3084vr0 c3084vr0 = C3084vr0.a;
                                    nvO = AbstractC1701hf0.o();
                                    nvO.c.add(x13);
                                    nvO.d.add(x12);
                                    AbstractC1406ef.S(nvO.c, x11);
                                    AbstractC1406ef.S(nvO.d, x10);
                                    nvO.c.add(x9);
                                    nvO.d.add(x9);
                                    AbstractC2208mp0.a(nvO);
                                } else if (js0.w) {
                                    Rh0 rh1 = AbstractC2011ko0.a;
                                    C3084vr0 c3084vr1 = C3084vr0.a;
                                    nvO = AbstractC1701hf0.o();
                                    nvO.c.add(x13);
                                    nvO.d.add(x12);
                                    AbstractC1406ef.S(nvO.c, x11);
                                    AbstractC1406ef.S(nvO.d, x10);
                                    nvO.c.add(x9);
                                    nvO.d.add(x9);
                                    nvO.j(AbstractC2011ko0.a().b, AbstractC2011ko0.a().a);
                                } else {
                                    C3084vr0 c3084vr2 = C3084vr0.a;
                                    nvO = AbstractC1701hf0.o();
                                    nvO.c.add(x13);
                                    nvO.d.add(x12);
                                    AbstractC1406ef.S(nvO.c, x11);
                                    AbstractC1406ef.S(nvO.d, x10);
                                    nvO.c.add(x9);
                                    nvO.d.add(x9);
                                }
                            }
                            if (!z13 && AbstractC1899jh0.U(i0().a, "tigo-", false)) {
                                C3084vr0 c3084vr3 = C3084vr0.a;
                                if (C3084vr0.q()) {
                                    C3084vr0.b(nvO);
                                }
                            }
                            if (!z13) {
                                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                                C0323Bn.b(nvO);
                            }
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            nvO.e(15L, timeUnit);
                            nvO.i(15L, timeUnit);
                            nvO.c.add(new FZ(linkedHashMapD, 1));
                            nvO.d.add(new C1395eZ(c2446pEB, linkedHashMapD));
                            nvO.h = true;
                            nvO.i = true;
                            ov = new OV(nvO);
                        }
                        str19 = str19;
                        if (!z13) {
                            C3084vr0 c3084vr4 = C3084vr0.a;
                            if (C3084vr0.q()) {
                                C3084vr0.b(nvO);
                            }
                        }
                        if (!z13) {
                            ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                            C0323Bn.b(nvO);
                        }
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        nvO.e(15L, timeUnit2);
                        nvO.i(15L, timeUnit2);
                        nvO.c.add(new FZ(linkedHashMapD, 1));
                        nvO.d.add(new C1395eZ(c2446pEB, linkedHashMapD));
                        nvO.h = true;
                        nvO.i = true;
                        ov = new OV(nvO);
                    }
                    NV nvB = ov.b();
                    X9 x14 = AbstractC1370eA.n;
                    ArrayList arrayList = nvB.c;
                    AbstractC1406ef.S(arrayList, X10.q);
                    ArrayList arrayList2 = nvB.d;
                    AbstractC1406ef.S(arrayList2, X10.r);
                    arrayList.add(x14);
                    arrayList2.add(x14);
                    c2994uv = new C2994uv(new OV(nvB));
                    zA = AbstractC1370eA.A(str17, str16);
                    zB = AbstractC1370eA.B(str17, str16);
                    str2 = js0.t;
                    if (str2 == null && zA) {
                        c2720s4 = new C2303no0(new C2720s4(Q(), c2994uv), str2, Q(), str16, 8);
                    } else {
                        c2720s4 = new C2720s4(Q(), c2994uv);
                    }
                    AbstractC1923jt0.F(linkedHashMapD);
                    YO yo = new YO();
                    c1093bP = new C1093bP();
                    listEmptyList = Collections.emptyList();
                    m60 = M60.p;
                    C1581gP c1581gP = C1581gP.n;
                    C2166mP c2166mP = new C2166mP();
                    c2166mP.a = i0().b;
                    String str20 = ds0.l;
                    AbstractC1474fG.j(str20, "mediaServerId");
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaServerId", str20);
                    c2166mP.G = bundle;
                    C2263nP c2263nP = new C2263nP(c2166mP);
                    list = js0.u;
                    if (!list.isEmpty()) {
                        abstractC0985aFL = AbstractC0985aF.l(js0.e());
                    } else {
                        abstractC0985aFL = m60;
                    }
                    if (zB) {
                        str4 = "application/x-mpegURL";
                        str3 = "application/dash+xml";
                    } else {
                        str3 = "application/dash+xml";
                        if (zA) {
                            str4 = str3;
                        } else {
                            str4 = null;
                        }
                    }
                    str5 = js0.f352o;
                    String str21 = str4;
                    if (str5 != null) {
                        lowerCase = str5.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    zB2 = AbstractC1474fG.b(lowerCase, "widevine");
                    c0633Nm = C2613qy.p;
                    if (zB2) {
                        if ((str19 != 0 || (!AbstractC1899jh0.U(str19, "claroandina-drm://", false) && !AbstractC1899jh0.U(str19, "claroandina-v2-drm://", false) && !AbstractC1899jh0.U(str19, "claroar-v2-drm://", false))) && str19 != 0) {
                            try {
                                C2349oE c2349oE2 = new C2349oE();
                                c2349oE2.g(null, str19);
                                c2446pEB2 = c2349oE2.b();
                            } catch (IllegalArgumentException unused2) {
                                c2446pEB2 = null;
                            }
                            if (c2446pEB2 != null) {
                                uri = Uri.parse(str19);
                                AbstractC1474fG.i(uri, obj);
                                if (AbstractC1370eA.D(uri)) {
                                    LinkedHashMap linkedHashMapW = AbstractC2506pt.w(c2446pEB, c2446pEB2, linkedHashMapD);
                                    c0032c = new C0032c(str19, true, new C2994uv(ov));
                                    for (Map.Entry entry : linkedHashMapW.entrySet()) {
                                        c0032c.v((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    HashMap map3 = new HashMap();
                                    C0622Nb c0622Nb = new C0622Nb(false);
                                    UUID uuid = AbstractC2661ra.d;
                                    uuid.getClass();
                                    c0398Ek = new C0398Ek(uuid, c0633Nm, c0032c, map3, true, new int[0], false, c0622Nb, 300000L);
                                    AbstractC1923jt0.F(linkedHashMapW);
                                    str6 = str3;
                                }
                            }
                            Toast.makeText(Q(), "URL de licencia insegura o inválida", 1).show();
                            return;
                        }
                        if (c1093bP.b == null && c1093bP.a == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        AbstractC0397Ej.f(z2);
                        if (uri2 != null) {
                            if (c1093bP.a != null) {
                                c1190cP2 = new C1190cP(c1093bP);
                            } else {
                                c1190cP2 = null;
                            }
                            c1483fP = new C1483fP(uri2, str6, c1190cP2, null, listEmptyList, null, abstractC0985aFL, null);
                        } else {
                            c1483fP = null;
                        }
                        c1971kP = new C1971kP("", new C0995aP(yo), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), c2263nP, c1581gP);
                        if (str19 != 0) {
                            z3 = false;
                            z4 = true;
                            if (AbstractC1899jh0.U(str19, "claroandina-drm://", false)) {
                                if (str19 == 0 && AbstractC1899jh0.U(str19, "claroandina-v2-drm://", z3) == z4) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (str19 == 0 && AbstractC1899jh0.U(str19, "claroar-v2-drm://", z3) == z4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (str == null) {
                                    throw new Exception("Claro Andina license token not found in video metadata");
                                }
                                strL0 = AbstractC1119bh0.l0(str, "claroandina_token:");
                                if (z5) {
                                    String str22 = C0754Sd.a;
                                    ArrayList arrayList3 = AbstractC2573qe.a;
                                    jSONObject2 = C0754Sd.f;
                                    if (jSONObject2 != null) {
                                        strOptString2 = jSONObject2.optString("getlicense");
                                    } else {
                                        strOptString2 = null;
                                    }
                                    String strA = AbstractC2573qe.a(strOptString2, C0754Sd.d, EnumC2476pe.m);
                                    str8 = (String) C0754Sd.g.get("device_id");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    c0832Vd = new C0832Vd(strL0, strA, str8);
                                } else if (z6) {
                                    String str23 = C0806Ud.a;
                                    ArrayList arrayList4 = AbstractC2573qe.a;
                                    jSONObject = C0806Ud.f;
                                    if (jSONObject != null) {
                                        strOptString = jSONObject.optString("getlicense");
                                    } else {
                                        strOptString = null;
                                    }
                                    String strA2 = AbstractC2573qe.a(strOptString, C0806Ud.d, EnumC2476pe.m);
                                    str7 = (String) C0806Ud.g.get("device_id");
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    c0832Vd = new C0832Vd(strL0, strA2, str7);
                                } else {
                                    c0832Vd = new C0832Vd(strL0, null, null);
                                }
                                C0832Vd c0832Vd2 = c0832Vd;
                                HashMap map4 = new HashMap();
                                C0622Nb c0622Nb2 = new C0622Nb(false);
                                UUID uuid2 = AbstractC2661ra.d;
                                uuid2.getClass();
                                C0398Ek c0398Ek2 = new C0398Ek(uuid2, c0633Nm, c0832Vd2, map4, false, new int[0], true, c0622Nb2, 300000L);
                                DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory.c = new GZ(c0398Ek2, 1);
                                abstractC1464f8C = dashMediaSource$Factory.c(c1971kP);
                                str9 = str16;
                            }
                            if (!AbstractC1474fG.b(str17, "tv") || AbstractC1899jh0.U(i0().a, "tv-", false)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z7 || AbstractC1119bh0.W(str9, ".mpd", false) || AbstractC1474fG.b(str17, "dash")) {
                                j2 = -9223372036854775807L;
                            } else {
                                try {
                                    Video$Type video$Type = i0().d;
                                    AbstractC1474fG.h(video$Type, "null cannot be cast to non-null type com.skidush.clonex.models.Video.Type");
                                    if (video$Type instanceof Is0) {
                                        interfaceC2220mv0F = k0().p().u(((Is0) video$Type).l);
                                    } else {
                                        if (!(video$Type instanceof Hs0)) {
                                            throw new C0730Rf();
                                        }
                                        interfaceC2220mv0F = k0().o().f(((Hs0) video$Type).l);
                                    }
                                    long j3 = (interfaceC2220mv0F == null || (c2123lv0B = interfaceC2220mv0F.b()) == null) ? 0L : c2123lv0B.b - 10000;
                                    if (j > 0) {
                                        j3 = j;
                                    }
                                    if (j3 < 0) {
                                        j3 = 0;
                                    }
                                    if (j3 > 0) {
                                        j2 = j3;
                                    } else {
                                        j2 = -9223372036854775807L;
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                            if (j <= 0 || m0() == EnumC1103bZ.l || j2 == -9223372036854775807L || !AbstractC1370eA.B(str17, str9)) {
                                playerTvFragment = this;
                                if (j2 != -9223372036854775807L) {
                                    playerTvFragment.w0 = -9223372036854775807L;
                                    c1042as2 = playerTvFragment.D0;
                                    if (c1042as2 != null) {
                                        c1042as2.i0();
                                        List listSingletonList = Collections.singletonList(abstractC1464f8C);
                                        c1042as2.i0();
                                        c1042as2.W(listSingletonList, 0, j2, false);
                                    }
                                } else {
                                    playerTvFragment.w0 = -9223372036854775807L;
                                    c1042as = playerTvFragment.D0;
                                    if (c1042as != null) {
                                        c1042as.i0();
                                        List listSingletonList2 = Collections.singletonList(abstractC1464f8C);
                                        c1042as.i0();
                                        c1042as.i0();
                                        c1042as.W(listSingletonList2, -1, -9223372036854775807L, true);
                                    }
                                }
                            } else {
                                playerTvFragment = this;
                                playerTvFragment.w0 = j2;
                                C1042as c1042as6 = playerTvFragment.D0;
                                if (c1042as6 != null) {
                                    c1042as6.i0();
                                    List listSingletonList3 = Collections.singletonList(abstractC1464f8C);
                                    c1042as6.i0();
                                    c1042as6.i0();
                                    c1042as6.W(listSingletonList3, -1, -9223372036854775807L, true);
                                }
                            }
                            if (z7) {
                                c1042as5 = playerTvFragment.D0;
                                if (c1042as5 != null) {
                                    c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                                }
                            } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                                AbstractC1474fG.b(str17, "dash");
                            }
                            c1042as3 = playerTvFragment.D0;
                            if (c1042as3 != null) {
                                c1042as3.Q();
                            }
                            c1042as4 = playerTvFragment.D0;
                            if (c1042as4 != null) {
                                c1042as4.j();
                                return;
                            }
                            return;
                        }
                        z3 = false;
                        z4 = true;
                        if (!(str19 == 0 && AbstractC1899jh0.U(str19, "claroandina-v2-drm://", z3) == z4) && (str19 == 0 || AbstractC1899jh0.U(str19, "claroar-v2-drm://", z3) != z4)) {
                            str10 = js0.f352o;
                            if (str10 != null) {
                                lowerCase2 = str10.toLowerCase(Locale.ROOT);
                                AbstractC1474fG.i(lowerCase2, r14);
                            } else {
                                lowerCase2 = null;
                            }
                            if (AbstractC1474fG.b(lowerCase2, "clearkey") || (bArr = js0.q) == null) {
                                if (c0398Ek != null) {
                                    if (!list.isEmpty()) {
                                        C2393ol c2393ol = new C2393ol(c2720s4);
                                        c2393ol.e(new CZ(c0398Ek, 9));
                                        abstractC1464f8C = c2393ol.c(c1971kP);
                                    } else if (zA) {
                                        DashMediaSource$Factory dashMediaSource$Factory2 = new DashMediaSource$Factory(c2720s4);
                                        dashMediaSource$Factory2.c = new CZ(c0398Ek, 10);
                                        abstractC1464f8C = dashMediaSource$Factory2.c(c1971kP);
                                    } else {
                                        C2393ol c2393ol2 = new C2393ol(c2720s4);
                                        c2393ol2.e(new CZ(c0398Ek, 11));
                                        abstractC1464f8C = c2393ol2.c(c1971kP);
                                    }
                                    AbstractC1474fG.g(abstractC1464f8C);
                                } else {
                                    if (!list.isEmpty()) {
                                        abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                                    } else if (zA) {
                                        abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                                    } else {
                                        if (zB) {
                                            abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                        } else {
                                            str9 = str16;
                                            if (!AbstractC1899jh0.L(str9, ".mp4", false) || AbstractC1119bh0.W(str9, "mp4", false)) {
                                                C2278nc c2278nc = new C2278nc(22, new C0580Lk());
                                                Object obj2 = new Object();
                                                C0622Nb c0622Nb3 = new C0622Nb(false);
                                                c1483fP.getClass();
                                                c1971kP.m.getClass();
                                                c1190cP = c1971kP.m.n;
                                                if (c1190cP != null || Lr0.a < 18) {
                                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                                } else {
                                                    synchronized (obj2) {
                                                        try {
                                                            c0398EkS = !Lr0.a(c1190cP, null) ? Na0.s(c1190cP) : null;
                                                            c0398EkS.getClass();
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                    interfaceC0428Fo = c0398EkS;
                                                }
                                                abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc, interfaceC0428Fo, c0622Nb3, 1048576);
                                            } else {
                                                abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                                            }
                                        }
                                        AbstractC1474fG.g(abstractC1464f8C);
                                    }
                                    str9 = str16;
                                    AbstractC1474fG.g(abstractC1464f8C);
                                }
                                if (AbstractC1474fG.b(str17, "tv")) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                if (z7) {
                                    j2 = -9223372036854775807L;
                                } else {
                                    j2 = -9223372036854775807L;
                                }
                                if (j <= 0) {
                                    playerTvFragment = this;
                                    if (j2 != -9223372036854775807L) {
                                        playerTvFragment.w0 = -9223372036854775807L;
                                        c1042as2 = playerTvFragment.D0;
                                        if (c1042as2 != null) {
                                            c1042as2.i0();
                                            List listSingletonList4 = Collections.singletonList(abstractC1464f8C);
                                            c1042as2.i0();
                                            c1042as2.W(listSingletonList4, 0, j2, false);
                                        }
                                    } else {
                                        playerTvFragment.w0 = -9223372036854775807L;
                                        c1042as = playerTvFragment.D0;
                                        if (c1042as != null) {
                                            c1042as.i0();
                                            List listSingletonList5 = Collections.singletonList(abstractC1464f8C);
                                            c1042as.i0();
                                            c1042as.i0();
                                            c1042as.W(listSingletonList5, -1, -9223372036854775807L, true);
                                        }
                                    }
                                } else {
                                    playerTvFragment = this;
                                    if (j2 != -9223372036854775807L) {
                                        playerTvFragment.w0 = -9223372036854775807L;
                                        c1042as2 = playerTvFragment.D0;
                                        if (c1042as2 != null) {
                                            c1042as2.i0();
                                            List listSingletonList6 = Collections.singletonList(abstractC1464f8C);
                                            c1042as2.i0();
                                            c1042as2.W(listSingletonList6, 0, j2, false);
                                        }
                                    } else {
                                        playerTvFragment.w0 = -9223372036854775807L;
                                        c1042as = playerTvFragment.D0;
                                        if (c1042as != null) {
                                            c1042as.i0();
                                            List listSingletonList7 = Collections.singletonList(abstractC1464f8C);
                                            c1042as.i0();
                                            c1042as.i0();
                                            c1042as.W(listSingletonList7, -1, -9223372036854775807L, true);
                                        }
                                    }
                                }
                                if (z7) {
                                    c1042as5 = playerTvFragment.D0;
                                    if (c1042as5 != null) {
                                        c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                                    }
                                } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                                    AbstractC1474fG.b(str17, "dash");
                                }
                                c1042as3 = playerTvFragment.D0;
                                if (c1042as3 != null) {
                                    c1042as3.Q();
                                }
                                c1042as4 = playerTvFragment.D0;
                                if (c1042as4 != null) {
                                    c1042as4.j();
                                    return;
                                }
                                return;
                            }
                            C2605qu c2605qu = new C2605qu(1, bArr);
                            HashMap map5 = new HashMap();
                            C0622Nb c0622Nb4 = new C0622Nb(false);
                            UUID uuid3 = AbstractC2661ra.c;
                            uuid3.getClass();
                            C0398Ek c0398Ek3 = new C0398Ek(uuid3, c0633Nm, c2605qu, map5, false, new int[0], true, c0622Nb4, 300000L);
                            if (zB) {
                                c2720s5 = c0398Ek3;
                                c2720s5 = new C2720s4(c0398Ek3, js0.q);
                            }
                            if (str2 != 0 && zA) {
                                c2720s4 = new C2303no0(new C2720s4(Q(), c2994uv), str2, Q(), str16, 8);
                            }
                            if (zB) {
                                HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(c2720s4);
                                hlsMediaSource$Factory.f = new CZ(c2720s5, 6);
                                abstractC1464f8C = hlsMediaSource$Factory.c(c1971kP);
                            } else if (zA) {
                                DashMediaSource$Factory dashMediaSource$Factory3 = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory3.c = new CZ(c2720s5, 7);
                                abstractC1464f8C = dashMediaSource$Factory3.c(c1971kP);
                            } else {
                                C2393ol c2393ol3 = new C2393ol(c2720s4);
                                c2393ol3.e(new CZ(c2720s5, 8));
                                abstractC1464f8C = c2393ol3.c(c1971kP);
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                        } else {
                            if (str19 == 0) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (str19 == 0) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (str == null) {
                                throw new Exception("Claro Andina license token not found in video metadata");
                            }
                            strL0 = AbstractC1119bh0.l0(str, "claroandina_token:");
                            if (z5) {
                                String str24 = C0754Sd.a;
                                ArrayList arrayList5 = AbstractC2573qe.a;
                                jSONObject2 = C0754Sd.f;
                                if (jSONObject2 != null) {
                                    strOptString2 = jSONObject2.optString("getlicense");
                                } else {
                                    strOptString2 = null;
                                }
                                String strA3 = AbstractC2573qe.a(strOptString2, C0754Sd.d, EnumC2476pe.m);
                                str8 = (String) C0754Sd.g.get("device_id");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                c0832Vd = new C0832Vd(strL0, strA3, str8);
                            } else if (z6) {
                                String str25 = C0806Ud.a;
                                ArrayList arrayList6 = AbstractC2573qe.a;
                                jSONObject = C0806Ud.f;
                                if (jSONObject != null) {
                                    strOptString = jSONObject.optString("getlicense");
                                } else {
                                    strOptString = null;
                                }
                                String strA4 = AbstractC2573qe.a(strOptString, C0806Ud.d, EnumC2476pe.m);
                                str7 = (String) C0806Ud.g.get("device_id");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                c0832Vd = new C0832Vd(strL0, strA4, str7);
                            } else {
                                c0832Vd = new C0832Vd(strL0, null, null);
                            }
                            C0832Vd c0832Vd3 = c0832Vd;
                            HashMap map6 = new HashMap();
                            C0622Nb c0622Nb5 = new C0622Nb(false);
                            UUID uuid4 = AbstractC2661ra.d;
                            uuid4.getClass();
                            C0398Ek c0398Ek4 = new C0398Ek(uuid4, c0633Nm, c0832Vd3, map6, false, new int[0], true, c0622Nb5, 300000L);
                            DashMediaSource$Factory dashMediaSource$Factory4 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory4.c = new GZ(c0398Ek4, 1);
                            abstractC1464f8C = dashMediaSource$Factory4.c(c1971kP);
                        }
                        str9 = str16;
                        if (AbstractC1474fG.b(str17, "tv")) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            j2 = -9223372036854775807L;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        if (j <= 0) {
                            playerTvFragment = this;
                            if (j2 != -9223372036854775807L) {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as2 = playerTvFragment.D0;
                                if (c1042as2 != null) {
                                    c1042as2.i0();
                                    List listSingletonList8 = Collections.singletonList(abstractC1464f8C);
                                    c1042as2.i0();
                                    c1042as2.W(listSingletonList8, 0, j2, false);
                                }
                            } else {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as = playerTvFragment.D0;
                                if (c1042as != null) {
                                    c1042as.i0();
                                    List listSingletonList9 = Collections.singletonList(abstractC1464f8C);
                                    c1042as.i0();
                                    c1042as.i0();
                                    c1042as.W(listSingletonList9, -1, -9223372036854775807L, true);
                                }
                            }
                        } else {
                            playerTvFragment = this;
                            if (j2 != -9223372036854775807L) {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as2 = playerTvFragment.D0;
                                if (c1042as2 != null) {
                                    c1042as2.i0();
                                    List listSingletonList10 = Collections.singletonList(abstractC1464f8C);
                                    c1042as2.i0();
                                    c1042as2.W(listSingletonList10, 0, j2, false);
                                }
                            } else {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as = playerTvFragment.D0;
                                if (c1042as != null) {
                                    c1042as.i0();
                                    List listSingletonList11 = Collections.singletonList(abstractC1464f8C);
                                    c1042as.i0();
                                    c1042as.i0();
                                    c1042as.W(listSingletonList11, -1, -9223372036854775807L, true);
                                }
                            }
                        }
                        if (z7) {
                            c1042as5 = playerTvFragment.D0;
                            if (c1042as5 != null) {
                                c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                            }
                        } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                            AbstractC1474fG.b(str17, "dash");
                        }
                        c1042as3 = playerTvFragment.D0;
                        if (c1042as3 != null) {
                            c1042as3.Q();
                        }
                        c1042as4 = playerTvFragment.D0;
                        if (c1042as4 != null) {
                            c1042as4.j();
                            return;
                        }
                        return;
                    }
                    AbstractC1474fG.b(lowerCase, "clearkey");
                    str6 = str21;
                    c0398Ek = null;
                    if (c1093bP.b == null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    AbstractC0397Ej.f(z2);
                    if (uri2 != null) {
                        if (c1093bP.a != null) {
                            c1190cP2 = new C1190cP(c1093bP);
                        } else {
                            c1190cP2 = null;
                        }
                        c1483fP = new C1483fP(uri2, str6, c1190cP2, null, listEmptyList, null, abstractC0985aFL, null);
                    } else {
                        c1483fP = null;
                    }
                    c1971kP = new C1971kP("", new C0995aP(yo), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), c2263nP, c1581gP);
                    if (str19 != 0) {
                        z3 = false;
                        z4 = true;
                        if (AbstractC1899jh0.U(str19, "claroandina-drm://", false)) {
                            if (str19 == 0) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (str19 == 0) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (str == null) {
                                throw new Exception("Claro Andina license token not found in video metadata");
                            }
                            strL0 = AbstractC1119bh0.l0(str, "claroandina_token:");
                            if (z5) {
                                String str26 = C0754Sd.a;
                                ArrayList arrayList7 = AbstractC2573qe.a;
                                jSONObject2 = C0754Sd.f;
                                if (jSONObject2 != null) {
                                    strOptString2 = jSONObject2.optString("getlicense");
                                } else {
                                    strOptString2 = null;
                                }
                                String strA5 = AbstractC2573qe.a(strOptString2, C0754Sd.d, EnumC2476pe.m);
                                str8 = (String) C0754Sd.g.get("device_id");
                                if (str8 == null) {
                                    str8 = "";
                                }
                                c0832Vd = new C0832Vd(strL0, strA5, str8);
                            } else if (z6) {
                                String str27 = C0806Ud.a;
                                ArrayList arrayList8 = AbstractC2573qe.a;
                                jSONObject = C0806Ud.f;
                                if (jSONObject != null) {
                                    strOptString = jSONObject.optString("getlicense");
                                } else {
                                    strOptString = null;
                                }
                                String strA6 = AbstractC2573qe.a(strOptString, C0806Ud.d, EnumC2476pe.m);
                                str7 = (String) C0806Ud.g.get("device_id");
                                if (str7 == null) {
                                    str7 = "";
                                }
                                c0832Vd = new C0832Vd(strL0, strA6, str7);
                            } else {
                                c0832Vd = new C0832Vd(strL0, null, null);
                            }
                            C0832Vd c0832Vd4 = c0832Vd;
                            HashMap map7 = new HashMap();
                            C0622Nb c0622Nb6 = new C0622Nb(false);
                            UUID uuid5 = AbstractC2661ra.d;
                            uuid5.getClass();
                            C0398Ek c0398Ek5 = new C0398Ek(uuid5, c0633Nm, c0832Vd4, map7, false, new int[0], true, c0622Nb6, 300000L);
                            DashMediaSource$Factory dashMediaSource$Factory5 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory5.c = new GZ(c0398Ek5, 1);
                            abstractC1464f8C = dashMediaSource$Factory5.c(c1971kP);
                            str9 = str16;
                        }
                        if (AbstractC1474fG.b(str17, "tv")) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            j2 = -9223372036854775807L;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        if (j <= 0) {
                            playerTvFragment = this;
                            if (j2 != -9223372036854775807L) {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as2 = playerTvFragment.D0;
                                if (c1042as2 != null) {
                                    c1042as2.i0();
                                    List listSingletonList12 = Collections.singletonList(abstractC1464f8C);
                                    c1042as2.i0();
                                    c1042as2.W(listSingletonList12, 0, j2, false);
                                }
                            } else {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as = playerTvFragment.D0;
                                if (c1042as != null) {
                                    c1042as.i0();
                                    List listSingletonList13 = Collections.singletonList(abstractC1464f8C);
                                    c1042as.i0();
                                    c1042as.i0();
                                    c1042as.W(listSingletonList13, -1, -9223372036854775807L, true);
                                }
                            }
                        } else {
                            playerTvFragment = this;
                            if (j2 != -9223372036854775807L) {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as2 = playerTvFragment.D0;
                                if (c1042as2 != null) {
                                    c1042as2.i0();
                                    List listSingletonList14 = Collections.singletonList(abstractC1464f8C);
                                    c1042as2.i0();
                                    c1042as2.W(listSingletonList14, 0, j2, false);
                                }
                            } else {
                                playerTvFragment.w0 = -9223372036854775807L;
                                c1042as = playerTvFragment.D0;
                                if (c1042as != null) {
                                    c1042as.i0();
                                    List listSingletonList15 = Collections.singletonList(abstractC1464f8C);
                                    c1042as.i0();
                                    c1042as.i0();
                                    c1042as.W(listSingletonList15, -1, -9223372036854775807L, true);
                                }
                            }
                        }
                        if (z7) {
                            c1042as5 = playerTvFragment.D0;
                            if (c1042as5 != null) {
                                c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                            }
                        } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                            AbstractC1474fG.b(str17, "dash");
                        }
                        c1042as3 = playerTvFragment.D0;
                        if (c1042as3 != null) {
                            c1042as3.Q();
                        }
                        c1042as4 = playerTvFragment.D0;
                        if (c1042as4 != null) {
                            c1042as4.j();
                            return;
                        }
                        return;
                    }
                    z3 = false;
                    z4 = true;
                    if (str19 == 0) {
                        str10 = js0.f352o;
                        if (str10 != null) {
                            lowerCase2 = str10.toLowerCase(Locale.ROOT);
                            AbstractC1474fG.i(lowerCase2, r14);
                        } else {
                            lowerCase2 = null;
                        }
                        if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                            if (c0398Ek != null) {
                                if (!list.isEmpty()) {
                                    C2393ol c2393ol4 = new C2393ol(c2720s4);
                                    c2393ol4.e(new CZ(c0398Ek, 9));
                                    abstractC1464f8C = c2393ol4.c(c1971kP);
                                } else if (zA) {
                                    DashMediaSource$Factory dashMediaSource$Factory6 = new DashMediaSource$Factory(c2720s4);
                                    dashMediaSource$Factory6.c = new CZ(c0398Ek, 10);
                                    abstractC1464f8C = dashMediaSource$Factory6.c(c1971kP);
                                } else {
                                    C2393ol c2393ol5 = new C2393ol(c2720s4);
                                    c2393ol5.e(new CZ(c0398Ek, 11));
                                    abstractC1464f8C = c2393ol5.c(c1971kP);
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                                str9 = str16;
                            } else {
                                if (!list.isEmpty()) {
                                    abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                                } else if (zA) {
                                    abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    if (zB) {
                                        abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                    } else {
                                        str9 = str16;
                                        if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                            C2278nc c2278nc2 = new C2278nc(22, new C0580Lk());
                                            Object obj3 = new Object();
                                            C0622Nb c0622Nb7 = new C0622Nb(false);
                                            c1483fP.getClass();
                                            c1971kP.m.getClass();
                                            c1190cP = c1971kP.m.n;
                                            if (c1190cP != null) {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            } else {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            }
                                            abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc2, interfaceC0428Fo, c0622Nb7, 1048576);
                                        } else {
                                            C2278nc c2278nc3 = new C2278nc(22, new C0580Lk());
                                            Object obj4 = new Object();
                                            C0622Nb c0622Nb8 = new C0622Nb(false);
                                            c1483fP.getClass();
                                            c1971kP.m.getClass();
                                            c1190cP = c1971kP.m.n;
                                            if (c1190cP != null) {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            } else {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            }
                                            abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc3, interfaceC0428Fo, c0622Nb8, 1048576);
                                        }
                                    }
                                    AbstractC1474fG.g(abstractC1464f8C);
                                }
                                str9 = str16;
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                        } else if (c0398Ek != null) {
                            if (!list.isEmpty()) {
                                C2393ol c2393ol6 = new C2393ol(c2720s4);
                                c2393ol6.e(new CZ(c0398Ek, 9));
                                abstractC1464f8C = c2393ol6.c(c1971kP);
                            } else if (zA) {
                                DashMediaSource$Factory dashMediaSource$Factory7 = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory7.c = new CZ(c0398Ek, 10);
                                abstractC1464f8C = dashMediaSource$Factory7.c(c1971kP);
                            } else {
                                C2393ol c2393ol7 = new C2393ol(c2720s4);
                                c2393ol7.e(new CZ(c0398Ek, 11));
                                abstractC1464f8C = c2393ol7.c(c1971kP);
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                            str9 = str16;
                        } else {
                            if (!list.isEmpty()) {
                                abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                            } else if (zA) {
                                abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                if (zB) {
                                    abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    str9 = str16;
                                    if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                        C2278nc c2278nc4 = new C2278nc(22, new C0580Lk());
                                        Object obj5 = new Object();
                                        C0622Nb c0622Nb9 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc4, interfaceC0428Fo, c0622Nb9, 1048576);
                                    } else {
                                        C2278nc c2278nc5 = new C2278nc(22, new C0580Lk());
                                        Object obj6 = new Object();
                                        C0622Nb c0622Nb10 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc5, interfaceC0428Fo, c0622Nb10, 1048576);
                                    }
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                            str9 = str16;
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                    } else {
                        str10 = js0.f352o;
                        if (str10 != null) {
                            lowerCase2 = str10.toLowerCase(Locale.ROOT);
                            AbstractC1474fG.i(lowerCase2, r14);
                        } else {
                            lowerCase2 = null;
                        }
                        if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                            if (c0398Ek != null) {
                                if (!list.isEmpty()) {
                                    C2393ol c2393ol8 = new C2393ol(c2720s4);
                                    c2393ol8.e(new CZ(c0398Ek, 9));
                                    abstractC1464f8C = c2393ol8.c(c1971kP);
                                } else if (zA) {
                                    DashMediaSource$Factory dashMediaSource$Factory8 = new DashMediaSource$Factory(c2720s4);
                                    dashMediaSource$Factory8.c = new CZ(c0398Ek, 10);
                                    abstractC1464f8C = dashMediaSource$Factory8.c(c1971kP);
                                } else {
                                    C2393ol c2393ol9 = new C2393ol(c2720s4);
                                    c2393ol9.e(new CZ(c0398Ek, 11));
                                    abstractC1464f8C = c2393ol9.c(c1971kP);
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                                str9 = str16;
                            } else {
                                if (!list.isEmpty()) {
                                    abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                                } else if (zA) {
                                    abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    if (zB) {
                                        abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                    } else {
                                        str9 = str16;
                                        if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                            C2278nc c2278nc6 = new C2278nc(22, new C0580Lk());
                                            Object obj7 = new Object();
                                            C0622Nb c0622Nb11 = new C0622Nb(false);
                                            c1483fP.getClass();
                                            c1971kP.m.getClass();
                                            c1190cP = c1971kP.m.n;
                                            if (c1190cP != null) {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            } else {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            }
                                            abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc6, interfaceC0428Fo, c0622Nb11, 1048576);
                                        } else {
                                            C2278nc c2278nc7 = new C2278nc(22, new C0580Lk());
                                            Object obj8 = new Object();
                                            C0622Nb c0622Nb12 = new C0622Nb(false);
                                            c1483fP.getClass();
                                            c1971kP.m.getClass();
                                            c1190cP = c1971kP.m.n;
                                            if (c1190cP != null) {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            } else {
                                                interfaceC0428Fo = InterfaceC0428Fo.f;
                                            }
                                            abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc7, interfaceC0428Fo, c0622Nb12, 1048576);
                                        }
                                    }
                                    AbstractC1474fG.g(abstractC1464f8C);
                                }
                                str9 = str16;
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                        } else if (c0398Ek != null) {
                            if (!list.isEmpty()) {
                                C2393ol c2393ol10 = new C2393ol(c2720s4);
                                c2393ol10.e(new CZ(c0398Ek, 9));
                                abstractC1464f8C = c2393ol10.c(c1971kP);
                            } else if (zA) {
                                DashMediaSource$Factory dashMediaSource$Factory9 = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory9.c = new CZ(c0398Ek, 10);
                                abstractC1464f8C = dashMediaSource$Factory9.c(c1971kP);
                            } else {
                                C2393ol c2393ol11 = new C2393ol(c2720s4);
                                c2393ol11.e(new CZ(c0398Ek, 11));
                                abstractC1464f8C = c2393ol11.c(c1971kP);
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                            str9 = str16;
                        } else {
                            if (!list.isEmpty()) {
                                abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                            } else if (zA) {
                                abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                if (zB) {
                                    abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    str9 = str16;
                                    if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                        C2278nc c2278nc8 = new C2278nc(22, new C0580Lk());
                                        Object obj9 = new Object();
                                        C0622Nb c0622Nb13 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc8, interfaceC0428Fo, c0622Nb13, 1048576);
                                    } else {
                                        C2278nc c2278nc9 = new C2278nc(22, new C0580Lk());
                                        Object obj10 = new Object();
                                        C0622Nb c0622Nb14 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc9, interfaceC0428Fo, c0622Nb14, 1048576);
                                    }
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                            str9 = str16;
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                    }
                    if (AbstractC1474fG.b(str17, "tv")) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        j2 = -9223372036854775807L;
                    } else {
                        j2 = -9223372036854775807L;
                    }
                    if (j <= 0) {
                        playerTvFragment = this;
                        if (j2 != -9223372036854775807L) {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as2 = playerTvFragment.D0;
                            if (c1042as2 != null) {
                                c1042as2.i0();
                                List listSingletonList16 = Collections.singletonList(abstractC1464f8C);
                                c1042as2.i0();
                                c1042as2.W(listSingletonList16, 0, j2, false);
                            }
                        } else {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as = playerTvFragment.D0;
                            if (c1042as != null) {
                                c1042as.i0();
                                List listSingletonList17 = Collections.singletonList(abstractC1464f8C);
                                c1042as.i0();
                                c1042as.i0();
                                c1042as.W(listSingletonList17, -1, -9223372036854775807L, true);
                            }
                        }
                    } else {
                        playerTvFragment = this;
                        if (j2 != -9223372036854775807L) {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as2 = playerTvFragment.D0;
                            if (c1042as2 != null) {
                                c1042as2.i0();
                                List listSingletonList18 = Collections.singletonList(abstractC1464f8C);
                                c1042as2.i0();
                                c1042as2.W(listSingletonList18, 0, j2, false);
                            }
                        } else {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as = playerTvFragment.D0;
                            if (c1042as != null) {
                                c1042as.i0();
                                List listSingletonList19 = Collections.singletonList(abstractC1464f8C);
                                c1042as.i0();
                                c1042as.i0();
                                c1042as.W(listSingletonList19, -1, -9223372036854775807L, true);
                            }
                        }
                    }
                    if (z7) {
                        c1042as5 = playerTvFragment.D0;
                        if (c1042as5 != null) {
                            c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                        }
                    } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                        AbstractC1474fG.b(str17, "dash");
                    }
                    c1042as3 = playerTvFragment.D0;
                    if (c1042as3 != null) {
                        c1042as3.Q();
                    }
                    c1042as4 = playerTvFragment.D0;
                    if (c1042as4 != null) {
                        c1042as4.j();
                        return;
                    }
                    return;
                }
                str = str15;
            }
            AbstractC1923jt0.G(str16);
            NV nvB2 = Z9.a().b();
            nvB2.d.add(new C1395eZ(c2446pEB, linkedHashMapD));
            ov = new OV(nvB2);
            NV nvB3 = ov.b();
            X9 x15 = AbstractC1370eA.n;
            ArrayList arrayList9 = nvB3.c;
            AbstractC1406ef.S(arrayList9, X10.q);
            ArrayList arrayList10 = nvB3.d;
            AbstractC1406ef.S(arrayList10, X10.r);
            arrayList9.add(x15);
            arrayList10.add(x15);
            c2994uv = new C2994uv(new OV(nvB3));
            zA = AbstractC1370eA.A(str17, str16);
            zB = AbstractC1370eA.B(str17, str16);
            str2 = js0.t;
            if (str2 == null) {
                c2720s4 = new C2720s4(Q(), c2994uv);
            } else {
                c2720s4 = new C2720s4(Q(), c2994uv);
            }
            AbstractC1923jt0.F(linkedHashMapD);
            YO yo2 = new YO();
            c1093bP = new C1093bP();
            listEmptyList = Collections.emptyList();
            m60 = M60.p;
            C1581gP c1581gP2 = C1581gP.n;
            C2166mP c2166mP2 = new C2166mP();
            c2166mP2.a = i0().b;
            String str28 = ds0.l;
            AbstractC1474fG.j(str28, "mediaServerId");
            Bundle bundle2 = new Bundle();
            bundle2.putString("mediaServerId", str28);
            c2166mP2.G = bundle2;
            C2263nP c2263nP2 = new C2263nP(c2166mP2);
            list = js0.u;
            if (!list.isEmpty()) {
                abstractC0985aFL = AbstractC0985aF.l(js0.e());
            } else {
                abstractC0985aFL = m60;
            }
            if (zB) {
                str4 = "application/x-mpegURL";
                str3 = "application/dash+xml";
            } else {
                str3 = "application/dash+xml";
                if (zA) {
                    str4 = str3;
                } else {
                    str4 = null;
                }
            }
            str5 = js0.f352o;
            String str29 = str4;
            if (str5 != null) {
                lowerCase = str5.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            zB2 = AbstractC1474fG.b(lowerCase, "widevine");
            c0633Nm = C2613qy.p;
            if (zB2) {
                if (str19 != 0) {
                    C2349oE c2349oE3 = new C2349oE();
                    c2349oE3.g(null, str19);
                    c2446pEB2 = c2349oE3.b();
                    if (c2446pEB2 != null) {
                        uri = Uri.parse(str19);
                        AbstractC1474fG.i(uri, obj);
                        if (AbstractC1370eA.D(uri)) {
                            LinkedHashMap linkedHashMapW2 = AbstractC2506pt.w(c2446pEB, c2446pEB2, linkedHashMapD);
                            c0032c = new C0032c(str19, true, new C2994uv(ov));
                            while (r3.hasNext()) {
                                c0032c.v((String) entry.getKey(), (String) entry.getValue());
                            }
                            HashMap map8 = new HashMap();
                            C0622Nb c0622Nb15 = new C0622Nb(false);
                            UUID uuid6 = AbstractC2661ra.d;
                            uuid6.getClass();
                            c0398Ek = new C0398Ek(uuid6, c0633Nm, c0032c, map8, true, new int[0], false, c0622Nb15, 300000L);
                            AbstractC1923jt0.F(linkedHashMapW2);
                            str6 = str3;
                        }
                    }
                    Toast.makeText(Q(), "URL de licencia insegura o inválida", 1).show();
                    return;
                }
                C2349oE c2349oE4 = new C2349oE();
                c2349oE4.g(null, str19);
                c2446pEB2 = c2349oE4.b();
                if (c2446pEB2 != null) {
                    uri = Uri.parse(str19);
                    AbstractC1474fG.i(uri, obj);
                    if (AbstractC1370eA.D(uri)) {
                        LinkedHashMap linkedHashMapW3 = AbstractC2506pt.w(c2446pEB, c2446pEB2, linkedHashMapD);
                        c0032c = new C0032c(str19, true, new C2994uv(ov));
                        while (r3.hasNext()) {
                            c0032c.v((String) entry.getKey(), (String) entry.getValue());
                        }
                        HashMap map9 = new HashMap();
                        C0622Nb c0622Nb16 = new C0622Nb(false);
                        UUID uuid7 = AbstractC2661ra.d;
                        uuid7.getClass();
                        c0398Ek = new C0398Ek(uuid7, c0633Nm, c0032c, map9, true, new int[0], false, c0622Nb16, 300000L);
                        AbstractC1923jt0.F(linkedHashMapW3);
                        str6 = str3;
                    }
                }
                Toast.makeText(Q(), "URL de licencia insegura o inválida", 1).show();
                return;
                if (c1093bP.b == null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                AbstractC0397Ej.f(z2);
                if (uri2 != null) {
                    if (c1093bP.a != null) {
                        c1190cP2 = new C1190cP(c1093bP);
                    } else {
                        c1190cP2 = null;
                    }
                    c1483fP = new C1483fP(uri2, str6, c1190cP2, null, listEmptyList, null, abstractC0985aFL, null);
                } else {
                    c1483fP = null;
                }
                c1971kP = new C1971kP("", new C0995aP(yo2), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), c2263nP2, c1581gP2);
                if (str19 != 0) {
                    z3 = false;
                    z4 = true;
                    if (AbstractC1899jh0.U(str19, "claroandina-drm://", false)) {
                        if (str19 == 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (str19 == 0) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (str == null) {
                            throw new Exception("Claro Andina license token not found in video metadata");
                        }
                        strL0 = AbstractC1119bh0.l0(str, "claroandina_token:");
                        if (z5) {
                            String str210 = C0754Sd.a;
                            ArrayList arrayList11 = AbstractC2573qe.a;
                            jSONObject2 = C0754Sd.f;
                            if (jSONObject2 != null) {
                                strOptString2 = jSONObject2.optString("getlicense");
                            } else {
                                strOptString2 = null;
                            }
                            String strA7 = AbstractC2573qe.a(strOptString2, C0754Sd.d, EnumC2476pe.m);
                            str8 = (String) C0754Sd.g.get("device_id");
                            if (str8 == null) {
                                str8 = "";
                            }
                            c0832Vd = new C0832Vd(strL0, strA7, str8);
                        } else if (z6) {
                            String str211 = C0806Ud.a;
                            ArrayList arrayList12 = AbstractC2573qe.a;
                            jSONObject = C0806Ud.f;
                            if (jSONObject != null) {
                                strOptString = jSONObject.optString("getlicense");
                            } else {
                                strOptString = null;
                            }
                            String strA8 = AbstractC2573qe.a(strOptString, C0806Ud.d, EnumC2476pe.m);
                            str7 = (String) C0806Ud.g.get("device_id");
                            if (str7 == null) {
                                str7 = "";
                            }
                            c0832Vd = new C0832Vd(strL0, strA8, str7);
                        } else {
                            c0832Vd = new C0832Vd(strL0, null, null);
                        }
                        C0832Vd c0832Vd5 = c0832Vd;
                        HashMap map10 = new HashMap();
                        C0622Nb c0622Nb17 = new C0622Nb(false);
                        UUID uuid8 = AbstractC2661ra.d;
                        uuid8.getClass();
                        C0398Ek c0398Ek6 = new C0398Ek(uuid8, c0633Nm, c0832Vd5, map10, false, new int[0], true, c0622Nb17, 300000L);
                        DashMediaSource$Factory dashMediaSource$Factory10 = new DashMediaSource$Factory(c2720s4);
                        dashMediaSource$Factory10.c = new GZ(c0398Ek6, 1);
                        abstractC1464f8C = dashMediaSource$Factory10.c(c1971kP);
                        str9 = str16;
                    }
                    if (AbstractC1474fG.b(str17, "tv")) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        j2 = -9223372036854775807L;
                    } else {
                        j2 = -9223372036854775807L;
                    }
                    if (j <= 0) {
                        playerTvFragment = this;
                        if (j2 != -9223372036854775807L) {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as2 = playerTvFragment.D0;
                            if (c1042as2 != null) {
                                c1042as2.i0();
                                List listSingletonList110 = Collections.singletonList(abstractC1464f8C);
                                c1042as2.i0();
                                c1042as2.W(listSingletonList110, 0, j2, false);
                            }
                        } else {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as = playerTvFragment.D0;
                            if (c1042as != null) {
                                c1042as.i0();
                                List listSingletonList111 = Collections.singletonList(abstractC1464f8C);
                                c1042as.i0();
                                c1042as.i0();
                                c1042as.W(listSingletonList111, -1, -9223372036854775807L, true);
                            }
                        }
                    } else {
                        playerTvFragment = this;
                        if (j2 != -9223372036854775807L) {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as2 = playerTvFragment.D0;
                            if (c1042as2 != null) {
                                c1042as2.i0();
                                List listSingletonList112 = Collections.singletonList(abstractC1464f8C);
                                c1042as2.i0();
                                c1042as2.W(listSingletonList112, 0, j2, false);
                            }
                        } else {
                            playerTvFragment.w0 = -9223372036854775807L;
                            c1042as = playerTvFragment.D0;
                            if (c1042as != null) {
                                c1042as.i0();
                                List listSingletonList113 = Collections.singletonList(abstractC1464f8C);
                                c1042as.i0();
                                c1042as.i0();
                                c1042as.W(listSingletonList113, -1, -9223372036854775807L, true);
                            }
                        }
                    }
                    if (z7) {
                        c1042as5 = playerTvFragment.D0;
                        if (c1042as5 != null) {
                            c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                        }
                    } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                        AbstractC1474fG.b(str17, "dash");
                    }
                    c1042as3 = playerTvFragment.D0;
                    if (c1042as3 != null) {
                        c1042as3.Q();
                    }
                    c1042as4 = playerTvFragment.D0;
                    if (c1042as4 != null) {
                        c1042as4.j();
                        return;
                    }
                    return;
                }
                z3 = false;
                z4 = true;
                if (str19 == 0) {
                    str10 = js0.f352o;
                    if (str10 != null) {
                        lowerCase2 = str10.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase2, r14);
                    } else {
                        lowerCase2 = null;
                    }
                    if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                        if (c0398Ek != null) {
                            if (!list.isEmpty()) {
                                C2393ol c2393ol12 = new C2393ol(c2720s4);
                                c2393ol12.e(new CZ(c0398Ek, 9));
                                abstractC1464f8C = c2393ol12.c(c1971kP);
                            } else if (zA) {
                                DashMediaSource$Factory dashMediaSource$Factory11 = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory11.c = new CZ(c0398Ek, 10);
                                abstractC1464f8C = dashMediaSource$Factory11.c(c1971kP);
                            } else {
                                C2393ol c2393ol13 = new C2393ol(c2720s4);
                                c2393ol13.e(new CZ(c0398Ek, 11));
                                abstractC1464f8C = c2393ol13.c(c1971kP);
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                            str9 = str16;
                        } else {
                            if (!list.isEmpty()) {
                                abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                            } else if (zA) {
                                abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                if (zB) {
                                    abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    str9 = str16;
                                    if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                        C2278nc c2278nc10 = new C2278nc(22, new C0580Lk());
                                        Object obj11 = new Object();
                                        C0622Nb c0622Nb18 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc10, interfaceC0428Fo, c0622Nb18, 1048576);
                                    } else {
                                        C2278nc c2278nc11 = new C2278nc(22, new C0580Lk());
                                        Object obj12 = new Object();
                                        C0622Nb c0622Nb19 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc11, interfaceC0428Fo, c0622Nb19, 1048576);
                                    }
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                            str9 = str16;
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                    } else if (c0398Ek != null) {
                        if (!list.isEmpty()) {
                            C2393ol c2393ol14 = new C2393ol(c2720s4);
                            c2393ol14.e(new CZ(c0398Ek, 9));
                            abstractC1464f8C = c2393ol14.c(c1971kP);
                        } else if (zA) {
                            DashMediaSource$Factory dashMediaSource$Factory12 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory12.c = new CZ(c0398Ek, 10);
                            abstractC1464f8C = dashMediaSource$Factory12.c(c1971kP);
                        } else {
                            C2393ol c2393ol15 = new C2393ol(c2720s4);
                            c2393ol15.e(new CZ(c0398Ek, 11));
                            abstractC1464f8C = c2393ol15.c(c1971kP);
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                        str9 = str16;
                    } else {
                        if (!list.isEmpty()) {
                            abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                        } else if (zA) {
                            abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            if (zB) {
                                abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                str9 = str16;
                                if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                    C2278nc c2278nc12 = new C2278nc(22, new C0580Lk());
                                    Object obj13 = new Object();
                                    C0622Nb c0622Nb110 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc12, interfaceC0428Fo, c0622Nb110, 1048576);
                                } else {
                                    C2278nc c2278nc13 = new C2278nc(22, new C0580Lk());
                                    Object obj14 = new Object();
                                    C0622Nb c0622Nb111 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc13, interfaceC0428Fo, c0622Nb111, 1048576);
                                }
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                        str9 = str16;
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                } else {
                    str10 = js0.f352o;
                    if (str10 != null) {
                        lowerCase2 = str10.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase2, r14);
                    } else {
                        lowerCase2 = null;
                    }
                    if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                        if (c0398Ek != null) {
                            if (!list.isEmpty()) {
                                C2393ol c2393ol16 = new C2393ol(c2720s4);
                                c2393ol16.e(new CZ(c0398Ek, 9));
                                abstractC1464f8C = c2393ol16.c(c1971kP);
                            } else if (zA) {
                                DashMediaSource$Factory dashMediaSource$Factory13 = new DashMediaSource$Factory(c2720s4);
                                dashMediaSource$Factory13.c = new CZ(c0398Ek, 10);
                                abstractC1464f8C = dashMediaSource$Factory13.c(c1971kP);
                            } else {
                                C2393ol c2393ol17 = new C2393ol(c2720s4);
                                c2393ol17.e(new CZ(c0398Ek, 11));
                                abstractC1464f8C = c2393ol17.c(c1971kP);
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                            str9 = str16;
                        } else {
                            if (!list.isEmpty()) {
                                abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                            } else if (zA) {
                                abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                if (zB) {
                                    abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                                } else {
                                    str9 = str16;
                                    if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                        C2278nc c2278nc14 = new C2278nc(22, new C0580Lk());
                                        Object obj15 = new Object();
                                        C0622Nb c0622Nb112 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc14, interfaceC0428Fo, c0622Nb112, 1048576);
                                    } else {
                                        C2278nc c2278nc15 = new C2278nc(22, new C0580Lk());
                                        Object obj16 = new Object();
                                        C0622Nb c0622Nb113 = new C0622Nb(false);
                                        c1483fP.getClass();
                                        c1971kP.m.getClass();
                                        c1190cP = c1971kP.m.n;
                                        if (c1190cP != null) {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        } else {
                                            interfaceC0428Fo = InterfaceC0428Fo.f;
                                        }
                                        abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc15, interfaceC0428Fo, c0622Nb113, 1048576);
                                    }
                                }
                                AbstractC1474fG.g(abstractC1464f8C);
                            }
                            str9 = str16;
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                    } else if (c0398Ek != null) {
                        if (!list.isEmpty()) {
                            C2393ol c2393ol18 = new C2393ol(c2720s4);
                            c2393ol18.e(new CZ(c0398Ek, 9));
                            abstractC1464f8C = c2393ol18.c(c1971kP);
                        } else if (zA) {
                            DashMediaSource$Factory dashMediaSource$Factory14 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory14.c = new CZ(c0398Ek, 10);
                            abstractC1464f8C = dashMediaSource$Factory14.c(c1971kP);
                        } else {
                            C2393ol c2393ol19 = new C2393ol(c2720s4);
                            c2393ol19.e(new CZ(c0398Ek, 11));
                            abstractC1464f8C = c2393ol19.c(c1971kP);
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                        str9 = str16;
                    } else {
                        if (!list.isEmpty()) {
                            abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                        } else if (zA) {
                            abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            if (zB) {
                                abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                str9 = str16;
                                if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                    C2278nc c2278nc16 = new C2278nc(22, new C0580Lk());
                                    Object obj17 = new Object();
                                    C0622Nb c0622Nb114 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc16, interfaceC0428Fo, c0622Nb114, 1048576);
                                } else {
                                    C2278nc c2278nc17 = new C2278nc(22, new C0580Lk());
                                    Object obj18 = new Object();
                                    C0622Nb c0622Nb115 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc17, interfaceC0428Fo, c0622Nb115, 1048576);
                                }
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                        str9 = str16;
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                }
                if (AbstractC1474fG.b(str17, "tv")) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z7) {
                    j2 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
                if (j <= 0) {
                    playerTvFragment = this;
                    if (j2 != -9223372036854775807L) {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as2 = playerTvFragment.D0;
                        if (c1042as2 != null) {
                            c1042as2.i0();
                            List listSingletonList114 = Collections.singletonList(abstractC1464f8C);
                            c1042as2.i0();
                            c1042as2.W(listSingletonList114, 0, j2, false);
                        }
                    } else {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as = playerTvFragment.D0;
                        if (c1042as != null) {
                            c1042as.i0();
                            List listSingletonList115 = Collections.singletonList(abstractC1464f8C);
                            c1042as.i0();
                            c1042as.i0();
                            c1042as.W(listSingletonList115, -1, -9223372036854775807L, true);
                        }
                    }
                } else {
                    playerTvFragment = this;
                    if (j2 != -9223372036854775807L) {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as2 = playerTvFragment.D0;
                        if (c1042as2 != null) {
                            c1042as2.i0();
                            List listSingletonList116 = Collections.singletonList(abstractC1464f8C);
                            c1042as2.i0();
                            c1042as2.W(listSingletonList116, 0, j2, false);
                        }
                    } else {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as = playerTvFragment.D0;
                        if (c1042as != null) {
                            c1042as.i0();
                            List listSingletonList117 = Collections.singletonList(abstractC1464f8C);
                            c1042as.i0();
                            c1042as.i0();
                            c1042as.W(listSingletonList117, -1, -9223372036854775807L, true);
                        }
                    }
                }
                if (z7) {
                    c1042as5 = playerTvFragment.D0;
                    if (c1042as5 != null) {
                        c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                    }
                } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                    AbstractC1474fG.b(str17, "dash");
                }
                c1042as3 = playerTvFragment.D0;
                if (c1042as3 != null) {
                    c1042as3.Q();
                }
                c1042as4 = playerTvFragment.D0;
                if (c1042as4 != null) {
                    c1042as4.j();
                    return;
                }
                return;
            }
            AbstractC1474fG.b(lowerCase, "clearkey");
            str6 = str29;
            c0398Ek = null;
            if (c1093bP.b == null) {
                z2 = true;
            } else {
                z2 = true;
            }
            AbstractC0397Ej.f(z2);
            if (uri2 != null) {
                if (c1093bP.a != null) {
                    c1190cP2 = new C1190cP(c1093bP);
                } else {
                    c1190cP2 = null;
                }
                c1483fP = new C1483fP(uri2, str6, c1190cP2, null, listEmptyList, null, abstractC0985aFL, null);
            } else {
                c1483fP = null;
            }
            c1971kP = new C1971kP("", new C0995aP(yo2), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), c2263nP2, c1581gP2);
            if (str19 != 0) {
                z3 = false;
                z4 = true;
                if (AbstractC1899jh0.U(str19, "claroandina-drm://", false)) {
                    if (str19 == 0) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (str19 == 0) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (str == null) {
                        throw new Exception("Claro Andina license token not found in video metadata");
                    }
                    strL0 = AbstractC1119bh0.l0(str, "claroandina_token:");
                    if (z5) {
                        String str212 = C0754Sd.a;
                        ArrayList arrayList13 = AbstractC2573qe.a;
                        jSONObject2 = C0754Sd.f;
                        if (jSONObject2 != null) {
                            strOptString2 = jSONObject2.optString("getlicense");
                        } else {
                            strOptString2 = null;
                        }
                        String strA9 = AbstractC2573qe.a(strOptString2, C0754Sd.d, EnumC2476pe.m);
                        str8 = (String) C0754Sd.g.get("device_id");
                        if (str8 == null) {
                            str8 = "";
                        }
                        c0832Vd = new C0832Vd(strL0, strA9, str8);
                    } else if (z6) {
                        String str213 = C0806Ud.a;
                        ArrayList arrayList14 = AbstractC2573qe.a;
                        jSONObject = C0806Ud.f;
                        if (jSONObject != null) {
                            strOptString = jSONObject.optString("getlicense");
                        } else {
                            strOptString = null;
                        }
                        String strA10 = AbstractC2573qe.a(strOptString, C0806Ud.d, EnumC2476pe.m);
                        str7 = (String) C0806Ud.g.get("device_id");
                        if (str7 == null) {
                            str7 = "";
                        }
                        c0832Vd = new C0832Vd(strL0, strA10, str7);
                    } else {
                        c0832Vd = new C0832Vd(strL0, null, null);
                    }
                    C0832Vd c0832Vd6 = c0832Vd;
                    HashMap map11 = new HashMap();
                    C0622Nb c0622Nb116 = new C0622Nb(false);
                    UUID uuid9 = AbstractC2661ra.d;
                    uuid9.getClass();
                    C0398Ek c0398Ek7 = new C0398Ek(uuid9, c0633Nm, c0832Vd6, map11, false, new int[0], true, c0622Nb116, 300000L);
                    DashMediaSource$Factory dashMediaSource$Factory15 = new DashMediaSource$Factory(c2720s4);
                    dashMediaSource$Factory15.c = new GZ(c0398Ek7, 1);
                    abstractC1464f8C = dashMediaSource$Factory15.c(c1971kP);
                    str9 = str16;
                }
                if (AbstractC1474fG.b(str17, "tv")) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z7) {
                    j2 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
                if (j <= 0) {
                    playerTvFragment = this;
                    if (j2 != -9223372036854775807L) {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as2 = playerTvFragment.D0;
                        if (c1042as2 != null) {
                            c1042as2.i0();
                            List listSingletonList118 = Collections.singletonList(abstractC1464f8C);
                            c1042as2.i0();
                            c1042as2.W(listSingletonList118, 0, j2, false);
                        }
                    } else {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as = playerTvFragment.D0;
                        if (c1042as != null) {
                            c1042as.i0();
                            List listSingletonList119 = Collections.singletonList(abstractC1464f8C);
                            c1042as.i0();
                            c1042as.i0();
                            c1042as.W(listSingletonList119, -1, -9223372036854775807L, true);
                        }
                    }
                } else {
                    playerTvFragment = this;
                    if (j2 != -9223372036854775807L) {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as2 = playerTvFragment.D0;
                        if (c1042as2 != null) {
                            c1042as2.i0();
                            List listSingletonList1110 = Collections.singletonList(abstractC1464f8C);
                            c1042as2.i0();
                            c1042as2.W(listSingletonList1110, 0, j2, false);
                        }
                    } else {
                        playerTvFragment.w0 = -9223372036854775807L;
                        c1042as = playerTvFragment.D0;
                        if (c1042as != null) {
                            c1042as.i0();
                            List listSingletonList1111 = Collections.singletonList(abstractC1464f8C);
                            c1042as.i0();
                            c1042as.i0();
                            c1042as.W(listSingletonList1111, -1, -9223372036854775807L, true);
                        }
                    }
                }
                if (z7) {
                    c1042as5 = playerTvFragment.D0;
                    if (c1042as5 != null) {
                        c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                    }
                } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                    AbstractC1474fG.b(str17, "dash");
                }
                c1042as3 = playerTvFragment.D0;
                if (c1042as3 != null) {
                    c1042as3.Q();
                }
                c1042as4 = playerTvFragment.D0;
                if (c1042as4 != null) {
                    c1042as4.j();
                    return;
                }
                return;
            }
            z3 = false;
            z4 = true;
            if (str19 == 0) {
                str10 = js0.f352o;
                if (str10 != null) {
                    lowerCase2 = str10.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(lowerCase2, r14);
                } else {
                    lowerCase2 = null;
                }
                if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                    if (c0398Ek != null) {
                        if (!list.isEmpty()) {
                            C2393ol c2393ol110 = new C2393ol(c2720s4);
                            c2393ol110.e(new CZ(c0398Ek, 9));
                            abstractC1464f8C = c2393ol110.c(c1971kP);
                        } else if (zA) {
                            DashMediaSource$Factory dashMediaSource$Factory16 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory16.c = new CZ(c0398Ek, 10);
                            abstractC1464f8C = dashMediaSource$Factory16.c(c1971kP);
                        } else {
                            C2393ol c2393ol111 = new C2393ol(c2720s4);
                            c2393ol111.e(new CZ(c0398Ek, 11));
                            abstractC1464f8C = c2393ol111.c(c1971kP);
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                        str9 = str16;
                    } else {
                        if (!list.isEmpty()) {
                            abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                        } else if (zA) {
                            abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            if (zB) {
                                abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                str9 = str16;
                                if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                    C2278nc c2278nc18 = new C2278nc(22, new C0580Lk());
                                    Object obj19 = new Object();
                                    C0622Nb c0622Nb117 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc18, interfaceC0428Fo, c0622Nb117, 1048576);
                                } else {
                                    C2278nc c2278nc19 = new C2278nc(22, new C0580Lk());
                                    Object obj110 = new Object();
                                    C0622Nb c0622Nb118 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc19, interfaceC0428Fo, c0622Nb118, 1048576);
                                }
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                        str9 = str16;
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                } else if (c0398Ek != null) {
                    if (!list.isEmpty()) {
                        C2393ol c2393ol112 = new C2393ol(c2720s4);
                        c2393ol112.e(new CZ(c0398Ek, 9));
                        abstractC1464f8C = c2393ol112.c(c1971kP);
                    } else if (zA) {
                        DashMediaSource$Factory dashMediaSource$Factory17 = new DashMediaSource$Factory(c2720s4);
                        dashMediaSource$Factory17.c = new CZ(c0398Ek, 10);
                        abstractC1464f8C = dashMediaSource$Factory17.c(c1971kP);
                    } else {
                        C2393ol c2393ol113 = new C2393ol(c2720s4);
                        c2393ol113.e(new CZ(c0398Ek, 11));
                        abstractC1464f8C = c2393ol113.c(c1971kP);
                    }
                    AbstractC1474fG.g(abstractC1464f8C);
                    str9 = str16;
                } else {
                    if (!list.isEmpty()) {
                        abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                    } else if (zA) {
                        abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                    } else {
                        if (zB) {
                            abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            str9 = str16;
                            if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                C2278nc c2278nc110 = new C2278nc(22, new C0580Lk());
                                Object obj111 = new Object();
                                C0622Nb c0622Nb119 = new C0622Nb(false);
                                c1483fP.getClass();
                                c1971kP.m.getClass();
                                c1190cP = c1971kP.m.n;
                                if (c1190cP != null) {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                } else {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                }
                                abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc110, interfaceC0428Fo, c0622Nb119, 1048576);
                            } else {
                                C2278nc c2278nc111 = new C2278nc(22, new C0580Lk());
                                Object obj112 = new Object();
                                C0622Nb c0622Nb1110 = new C0622Nb(false);
                                c1483fP.getClass();
                                c1971kP.m.getClass();
                                c1190cP = c1971kP.m.n;
                                if (c1190cP != null) {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                } else {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                }
                                abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc111, interfaceC0428Fo, c0622Nb1110, 1048576);
                            }
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                    str9 = str16;
                    AbstractC1474fG.g(abstractC1464f8C);
                }
            } else {
                str10 = js0.f352o;
                if (str10 != null) {
                    lowerCase2 = str10.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(lowerCase2, r14);
                } else {
                    lowerCase2 = null;
                }
                if (AbstractC1474fG.b(lowerCase2, "clearkey")) {
                    if (c0398Ek != null) {
                        if (!list.isEmpty()) {
                            C2393ol c2393ol114 = new C2393ol(c2720s4);
                            c2393ol114.e(new CZ(c0398Ek, 9));
                            abstractC1464f8C = c2393ol114.c(c1971kP);
                        } else if (zA) {
                            DashMediaSource$Factory dashMediaSource$Factory18 = new DashMediaSource$Factory(c2720s4);
                            dashMediaSource$Factory18.c = new CZ(c0398Ek, 10);
                            abstractC1464f8C = dashMediaSource$Factory18.c(c1971kP);
                        } else {
                            C2393ol c2393ol115 = new C2393ol(c2720s4);
                            c2393ol115.e(new CZ(c0398Ek, 11));
                            abstractC1464f8C = c2393ol115.c(c1971kP);
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                        str9 = str16;
                    } else {
                        if (!list.isEmpty()) {
                            abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                        } else if (zA) {
                            abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            if (zB) {
                                abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                            } else {
                                str9 = str16;
                                if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                    C2278nc c2278nc112 = new C2278nc(22, new C0580Lk());
                                    Object obj113 = new Object();
                                    C0622Nb c0622Nb1111 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc112, interfaceC0428Fo, c0622Nb1111, 1048576);
                                } else {
                                    C2278nc c2278nc113 = new C2278nc(22, new C0580Lk());
                                    Object obj114 = new Object();
                                    C0622Nb c0622Nb1112 = new C0622Nb(false);
                                    c1483fP.getClass();
                                    c1971kP.m.getClass();
                                    c1190cP = c1971kP.m.n;
                                    if (c1190cP != null) {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    } else {
                                        interfaceC0428Fo = InterfaceC0428Fo.f;
                                    }
                                    abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc113, interfaceC0428Fo, c0622Nb1112, 1048576);
                                }
                            }
                            AbstractC1474fG.g(abstractC1464f8C);
                        }
                        str9 = str16;
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                } else if (c0398Ek != null) {
                    if (!list.isEmpty()) {
                        C2393ol c2393ol116 = new C2393ol(c2720s4);
                        c2393ol116.e(new CZ(c0398Ek, 9));
                        abstractC1464f8C = c2393ol116.c(c1971kP);
                    } else if (zA) {
                        DashMediaSource$Factory dashMediaSource$Factory19 = new DashMediaSource$Factory(c2720s4);
                        dashMediaSource$Factory19.c = new CZ(c0398Ek, 10);
                        abstractC1464f8C = dashMediaSource$Factory19.c(c1971kP);
                    } else {
                        C2393ol c2393ol117 = new C2393ol(c2720s4);
                        c2393ol117.e(new CZ(c0398Ek, 11));
                        abstractC1464f8C = c2393ol117.c(c1971kP);
                    }
                    AbstractC1474fG.g(abstractC1464f8C);
                    str9 = str16;
                } else {
                    if (!list.isEmpty()) {
                        abstractC1464f8C = new C2393ol(c2720s4).c(c1971kP);
                    } else if (zA) {
                        abstractC1464f8C = new DashMediaSource$Factory(c2720s4).c(c1971kP);
                    } else {
                        if (zB) {
                            abstractC1464f8C = new HlsMediaSource$Factory(c2720s4).c(c1971kP);
                        } else {
                            str9 = str16;
                            if (AbstractC1899jh0.L(str9, ".mp4", false)) {
                                C2278nc c2278nc114 = new C2278nc(22, new C0580Lk());
                                Object obj115 = new Object();
                                C0622Nb c0622Nb1113 = new C0622Nb(false);
                                c1483fP.getClass();
                                c1971kP.m.getClass();
                                c1190cP = c1971kP.m.n;
                                if (c1190cP != null) {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                } else {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                }
                                abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc114, interfaceC0428Fo, c0622Nb1113, 1048576);
                            } else {
                                C2278nc c2278nc115 = new C2278nc(22, new C0580Lk());
                                Object obj116 = new Object();
                                C0622Nb c0622Nb1114 = new C0622Nb(false);
                                c1483fP.getClass();
                                c1971kP.m.getClass();
                                c1190cP = c1971kP.m.n;
                                if (c1190cP != null) {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                } else {
                                    interfaceC0428Fo = InterfaceC0428Fo.f;
                                }
                                abstractC1464f8C = new H30(c1971kP, c2720s4, c2278nc115, interfaceC0428Fo, c0622Nb1114, 1048576);
                            }
                        }
                        AbstractC1474fG.g(abstractC1464f8C);
                    }
                    str9 = str16;
                    AbstractC1474fG.g(abstractC1464f8C);
                }
            }
            if (AbstractC1474fG.b(str17, "tv")) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z7) {
                j2 = -9223372036854775807L;
            } else {
                j2 = -9223372036854775807L;
            }
            if (j <= 0) {
                playerTvFragment = this;
                if (j2 != -9223372036854775807L) {
                    playerTvFragment.w0 = -9223372036854775807L;
                    c1042as2 = playerTvFragment.D0;
                    if (c1042as2 != null) {
                        c1042as2.i0();
                        List listSingletonList1112 = Collections.singletonList(abstractC1464f8C);
                        c1042as2.i0();
                        c1042as2.W(listSingletonList1112, 0, j2, false);
                    }
                } else {
                    playerTvFragment.w0 = -9223372036854775807L;
                    c1042as = playerTvFragment.D0;
                    if (c1042as != null) {
                        c1042as.i0();
                        List listSingletonList1113 = Collections.singletonList(abstractC1464f8C);
                        c1042as.i0();
                        c1042as.i0();
                        c1042as.W(listSingletonList1113, -1, -9223372036854775807L, true);
                    }
                }
            } else {
                playerTvFragment = this;
                if (j2 != -9223372036854775807L) {
                    playerTvFragment.w0 = -9223372036854775807L;
                    c1042as2 = playerTvFragment.D0;
                    if (c1042as2 != null) {
                        c1042as2.i0();
                        List listSingletonList1114 = Collections.singletonList(abstractC1464f8C);
                        c1042as2.i0();
                        c1042as2.W(listSingletonList1114, 0, j2, false);
                    }
                } else {
                    playerTvFragment.w0 = -9223372036854775807L;
                    c1042as = playerTvFragment.D0;
                    if (c1042as != null) {
                        c1042as.i0();
                        List listSingletonList1115 = Collections.singletonList(abstractC1464f8C);
                        c1042as.i0();
                        c1042as.i0();
                        c1042as.W(listSingletonList1115, -1, -9223372036854775807L, true);
                    }
                }
            }
            if (z7) {
                c1042as5 = playerTvFragment.D0;
                if (c1042as5 != null) {
                    c1042as5.l.a(new JZ(playerTvFragment, zB, 1));
                }
            } else if (!AbstractC1119bh0.W(str9, ".mpd", false)) {
                AbstractC1474fG.b(str17, "dash");
            }
            c1042as3 = playerTvFragment.D0;
            if (c1042as3 != null) {
                c1042as3.Q();
            }
            c1042as4 = playerTvFragment.D0;
            if (c1042as4 != null) {
                c1042as4.j();
                return;
            }
            return;
        }
        Uri uri3 = Uri.parse(str16);
        AbstractC1474fG.i(uri3, "parse(...)");
        if (AbstractC1370eA.z(uri3)) {
            g0();
            C0560Kq c0560Kq3 = this.z0;
            AbstractC1474fG.g(c0560Kq3);
            ((PlayerView) c0560Kq3.p).setVisibility(8);
            if (this.t0 == null) {
                WebView webView = new WebView(Q());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                WebSettings settings = webView.getSettings();
                if (map2 != null && (strL1 = l0("User-Agent", map2)) != null) {
                    str18 = strL1;
                }
                settings.setUserAgentString(str18);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                webView.getSettings().setBlockNetworkLoads(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setAllowContentAccess(false);
                Ov0.b(webView);
                webView.setWebViewClient(new PZ(this, js0, i));
                webView.setKeepScreenOn(true);
                this.t0 = webView;
                C0560Kq c0560Kq4 = this.z0;
                AbstractC1474fG.g(c0560Kq4);
                ((ConstraintLayout) c0560Kq4.m).addView(this.t0, new FrameLayout.LayoutParams(-1, -1));
            }
            if (map2 != null) {
                map = map2;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (!AbstractC2506pt.z((String) entry2.getKey())) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            WebView webView2 = this.t0;
            if (webView2 != null) {
                webView2.loadUrl(str16, linkedHashMap);
            }
            AbstractC1923jt0.G(str16);
            AbstractC1923jt0.F(linkedHashMap);
        } else {
            Toast.makeText(Q(), "URL Web insegura o inválida", 1).show();
        }
    }

    public final A10 i0() {
        return (A10) this.A0.getValue();
    }

    public final AppDatabase k0() {
        return (AppDatabase) this.B0.getValue();
    }

    public final EnumC1103bZ m0() {
        return (EnumC1103bZ) this.l0.getValue();
    }

    public final Z10 n0() {
        return (Z10) this.C0.getValue();
    }

    public final List o0(boolean z) {
        Object obj;
        LinkedHashSet linkedHashSet;
        Ds0 ds0 = this.o0;
        Object obj2 = null;
        String str = ds0 != null ? ds0.l : null;
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            obj = QW.b;
        } else {
            Q30.a.getClass();
            for (Object obj3 : P30.b) {
                if (AbstractC1474fG.b(((Q30) obj3).getName(), strB)) {
                    obj2 = obj3;
                    break;
                }
            }
            obj = (Q30) obj2;
            if (obj == null) {
                obj = C1816io0.b;
            }
        }
        List listF = obj == C1816io0.b ? C1816io0.F(this.F0) : this.F0;
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashSet = this.U0;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Ds0 ds1 = (Ds0) next;
            if (!AbstractC1474fG.b(ds1.l, str) && !linkedHashSet.contains(ds1.l)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (!z || this.V0 >= 1) {
            return C1233cq.l;
        }
        linkedHashSet.clear();
        if (str != null) {
            linkedHashSet.add(str);
        }
        this.V0++;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : listF) {
            if (!AbstractC1474fG.b(((Ds0) obj4).l, str)) {
                arrayList2.add(obj4);
            }
        }
        return arrayList2;
    }

    public final void p0() {
        Window window;
        if (h() == null || (window = P().getWindow()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.getDecorView().setSystemUiVisibility(5894);
            return;
        }
        window.setDecorFitsSystemWindows(false);
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    public final void q0(boolean z) {
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        X10 x12 = X10.q;
        AbstractC1406ef.S(arrayList, x12);
        X10 x13 = X10.r;
        AbstractC1406ef.S(arrayList2, x13);
        arrayList.add(x11);
        arrayList2.add(x11);
        X9 x14 = AbstractC1370eA.n;
        AbstractC1406ef.S(arrayList, x12);
        AbstractC1406ef.S(arrayList2, x13);
        arrayList.add(x14);
        arrayList2.add(x14);
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvO);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvO.e(15L, timeUnit);
        nvO.i(15L, timeUnit);
        nvO.h = true;
        nvO.i = true;
        this.E0 = new C2994uv(new OV(nvO));
        Context contextQ = Q();
        if (this.E0 == null) {
            AbstractC1474fG.U("httpDataSourceFactory");
            throw null;
        }
        contextQ.getApplicationContext();
        C3168wl c3168wl = new C3168wl(Q());
        c3168wl.e = C2691rp.w;
        c3168wl.c = 2;
        c3168wl.d = true;
        c3168wl.b.l = 2;
        C1128bm c1128bm = new C1128bm(Q());
        C0788Tl c0788TlA = c1128bm.h().a();
        c0788TlA.n = C1617gm0.c(new String[]{"es"});
        c0788TlA.s = C1617gm0.c(new String[]{"es", "spa"});
        EnumC1103bZ enumC1103bZM0 = m0();
        EnumC1103bZ enumC1103bZ = EnumC1103bZ.l;
        if ((enumC1103bZM0 != enumC1103bZ) && Cr0.v.a() == null) {
            int iOrdinal = m0().ordinal();
            if (iOrdinal == 1) {
                c0788TlA.a = Qd0.j;
                c0788TlA.b = 720;
                c0788TlA.c = 30;
                c0788TlA.d = 2500000;
            } else if (iOrdinal == 2) {
                c0788TlA.a = 854;
                c0788TlA.b = 480;
                c0788TlA.c = 30;
                c0788TlA.d = 1500000;
            }
            c0788TlA.x = false;
        } else {
            c0788TlA.g();
            c0788TlA.d = Integer.MAX_VALUE;
            c0788TlA.x = false;
        }
        c1128bm.c(new C0814Ul(c0788TlA));
        boolean z2 = m0() != enumC1103bZ;
        C1005aZ c1005aZM = U9.m(m0(), z);
        int i4 = c1005aZM.c;
        C1906jl.a(i4, 0, "bufferForPlaybackMs", "0");
        int i5 = c1005aZM.d;
        C1906jl.a(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        int i6 = c1005aZM.a;
        C1906jl.a(i6, i4, "minBufferMs", "bufferForPlaybackMs");
        C1906jl.a(i6, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        int i7 = c1005aZM.b;
        C1906jl.a(i7, i6, "maxBufferMs", "minBufferMs");
        C1906jl c1906jl = new C1906jl(new C1562g8(), i6, i7, i4, i5, true);
        if (this.D0 == null) {
            this.r0 = z;
            C0638Nr c0638Nr = new C0638Nr(Q());
            AbstractC0397Ej.f(!c0638Nr.t);
            c0638Nr.c = new C2296nl(3, c3168wl);
            AbstractC0397Ej.f(!c0638Nr.t);
            c0638Nr.e = new C2296nl(2, c1128bm);
            AbstractC0397Ej.f(!c0638Nr.t);
            c0638Nr.f = new C2296nl(1, c1906jl);
            AbstractC0397Ej.f(!c0638Nr.t);
            c0638Nr.t = true;
            C1042as c1042as = new C1042as(c0638Nr);
            c1042as.V(new I6(3, 0, 1, 1, 0));
            if (z2) {
                C2761sb0 c2761sb0 = C2761sb0.c;
                c1042as.i0();
                if (c2761sb0 == null) {
                    c2761sb0 = C2761sb0.d;
                }
                if (!c1042as.K.equals(c2761sb0)) {
                    c1042as.K = c2761sb0;
                    c1042as.k.s.a(5, c2761sb0).b();
                }
            }
            this.D0 = c1042as;
        }
        C0560Kq c0560Kq = this.z0;
        AbstractC1474fG.g(c0560Kq);
        ((PlayerView) c0560Kq.p).setPlayer(this.D0);
        C0560Kq c0560Kq2 = this.z0;
        AbstractC1474fG.g(c0560Kq2);
        ((PlayerSettingsTvView) c0560Kq2.q).setPlayer(this.D0);
        e0();
        C0560Kq c0560Kq3 = this.z0;
        AbstractC1474fG.g(c0560Kq3);
        C0560Kq c0560Kq4 = this.z0;
        AbstractC1474fG.g(c0560Kq4);
        ((PlayerSettingsTvView) c0560Kq3.q).setSubtitleView(((PlayerView) c0560Kq4.p).getSubtitleView());
        C0560Kq c0560Kq5 = this.z0;
        AbstractC1474fG.g(c0560Kq5);
        PlayerView playerView = (PlayerView) c0560Kq5.p;
        AbstractC1474fG.i(playerView, "pvPlayer");
        C1215ch c1215chJ0 = j0(playerView);
        ConstraintLayout constraintLayout = (ConstraintLayout) c1215chJ0.m;
        AbstractC1474fG.i(constraintLayout, "getRoot(...)");
        Iterator it = AbstractC0937Ze.K(Integer.valueOf(R.id.btn_categories), Integer.valueOf(R.id.btn_prev_channel), Integer.valueOf(R.id.exo_play_pause), Integer.valueOf(R.id.btn_next_channel), Integer.valueOf(((DefaultTimeBar) c1215chJ0.p).getId()), Integer.valueOf(((ImageButton) c1215chJ0.t).getId()), Integer.valueOf(c1215chJ0.f722o.getId()), Integer.valueOf(((ImageView) c1215chJ0.q).getId()), Integer.valueOf(R.id.btn_exo_external_player)).iterator();
        while (it.hasNext()) {
            View viewFindViewById = constraintLayout.findViewById(((Number) it.next()).intValue());
            if (viewFindViewById != null) {
                viewFindViewById.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3348ye(2, this));
            }
        }
        C0560Kq c0560Kq6 = this.z0;
        AbstractC1474fG.g(c0560Kq6);
        ((PlayerView) c0560Kq6.p).setControllerVisibilityListener(new InterfaceC2854tZ() { // from class: o.X00
            @Override // o.InterfaceC2854tZ
            public final void c(int i8) {
                PlayerTvFragment playerTvFragment = this.l;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                if (i8 == 0) {
                    C0560Kq c0560Kq7 = playerTvFragment.z0;
                    AbstractC1474fG.g(c0560Kq7);
                    PlayerSettingsTvView playerSettingsTvView = (PlayerSettingsTvView) c0560Kq7.q;
                    AbstractC1474fG.i(playerSettingsTvView, "settings");
                    if (playerSettingsTvView.getVisibility() == 0) {
                        return;
                    }
                    Dialog dialog = playerTvFragment.u0;
                    if (dialog == null || !dialog.isShowing()) {
                        C0560Kq c0560Kq8 = playerTvFragment.z0;
                        AbstractC1474fG.g(c0560Kq8);
                        FrameLayout frameLayout = (FrameLayout) c0560Kq8.n;
                        AbstractC1474fG.i(frameLayout, "loadingOverlay");
                        if (frameLayout.getVisibility() == 0) {
                            return;
                        }
                        playerTvFragment.B0();
                    }
                }
            }
        });
        C0560Kq c0560Kq7 = this.z0;
        AbstractC1474fG.g(c0560Kq7);
        ((PlayerView) c0560Kq7.p).setResizeMode(AbstractC1459f50.z().m);
        C0560Kq c0560Kq8 = this.z0;
        AbstractC1474fG.g(c0560Kq8);
        SubtitleView subtitleView = ((PlayerView) c0560Kq8.p).getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setFractionalTextSize(AbstractC1459f50.t() * 0.0533f);
            subtitleView.setStyle(AbstractC1459f50.s());
        }
        C0560Kq c0560Kq9 = this.z0;
        AbstractC1474fG.g(c0560Kq9);
        PlayerView playerView2 = (PlayerView) c0560Kq9.p;
        AbstractC1474fG.i(playerView2, "pvPlayer");
        j0(playerView2).s.setText(i0().b);
        C0560Kq c0560Kq10 = this.z0;
        AbstractC1474fG.g(c0560Kq10);
        PlayerView playerView3 = (PlayerView) c0560Kq10.p;
        AbstractC1474fG.i(playerView3, "pvPlayer");
        j0(playerView3).r.setText(i0().c);
        C0560Kq c0560Kq11 = this.z0;
        AbstractC1474fG.g(c0560Kq11);
        PlayerView playerView4 = (PlayerView) c0560Kq11.p;
        AbstractC1474fG.i(playerView4, "pvPlayer");
        ((DefaultTimeBar) j0(playerView4).p).setKeyTimeIncrement(10000L);
        C0560Kq c0560Kq12 = this.z0;
        AbstractC1474fG.g(c0560Kq12);
        PlayerView playerView5 = (PlayerView) c0560Kq12.p;
        AbstractC1474fG.i(playerView5, "pvPlayer");
        j0(playerView5).f722o.setOnClickListener(new Y00(this, 0));
        C0560Kq c0560Kq13 = this.z0;
        AbstractC1474fG.g(c0560Kq13);
        ImageView imageView = (ImageView) ((PlayerView) c0560Kq13.p).findViewById(R.id.exo_play_pause);
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC1010ac(this, 9, imageView));
        }
        C1042as c1042as2 = this.D0;
        if (c1042as2 != null) {
            c1042as2.l.a(new RZ(this, imageView, i2));
        }
        D0(imageView);
        if ((i0().d instanceof Is0) && (AbstractC1899jh0.U(i0().a, "tv-", false) || AbstractC1899jh0.U(i0().a, "claro-", false) || AbstractC1899jh0.U(i0().a, "claroar-", false))) {
            C0560Kq c0560Kq14 = this.z0;
            AbstractC1474fG.g(c0560Kq14);
            PlayerView playerView6 = (PlayerView) c0560Kq14.p;
            AbstractC1474fG.i(playerView6, "pvPlayer");
            ((ImageButton) j0(playerView6).v).setVisibility(0);
            C0560Kq c0560Kq15 = this.z0;
            AbstractC1474fG.g(c0560Kq15);
            PlayerView playerView7 = (PlayerView) c0560Kq15.p;
            AbstractC1474fG.i(playerView7, "pvPlayer");
            ((ImageButton) j0(playerView7).u).setVisibility(0);
            C0560Kq c0560Kq16 = this.z0;
            AbstractC1474fG.g(c0560Kq16);
            PlayerView playerView8 = (PlayerView) c0560Kq16.p;
            AbstractC1474fG.i(playerView8, "pvPlayer");
            ((ImageButton) j0(playerView8).n).setVisibility(0);
            C0560Kq c0560Kq17 = this.z0;
            AbstractC1474fG.g(c0560Kq17);
            PlayerView playerView9 = (PlayerView) c0560Kq17.p;
            AbstractC1474fG.i(playerView9, "pvPlayer");
            ((ImageButton) j0(playerView9).n).setOnClickListener(new Y00(this, i3));
            C0560Kq c0560Kq18 = this.z0;
            AbstractC1474fG.g(c0560Kq18);
            PlayerView playerView10 = (PlayerView) c0560Kq18.p;
            AbstractC1474fG.i(playerView10, "pvPlayer");
            ((ImageButton) j0(playerView10).v).setOnClickListener(new Y00(this, i2));
            C0560Kq c0560Kq19 = this.z0;
            AbstractC1474fG.g(c0560Kq19);
            PlayerView playerView11 = (PlayerView) c0560Kq19.p;
            AbstractC1474fG.i(playerView11, "pvPlayer");
            ((ImageButton) j0(playerView11).u).setOnClickListener(new Y00(this, i));
        }
        if (AbstractC1899jh0.U(i0().a, "claro-", false) || AbstractC1899jh0.U(i0().a, "tv-", false) || AbstractC1899jh0.U(i0().a, "claroar-", false)) {
            C0560Kq c0560Kq20 = this.z0;
            AbstractC1474fG.g(c0560Kq20);
            ((PlayerView) c0560Kq20.p).setControllerAutoShow(false);
        }
        C0560Kq c0560Kq21 = this.z0;
        AbstractC1474fG.g(c0560Kq21);
        PlayerView playerView12 = (PlayerView) c0560Kq21.p;
        AbstractC1474fG.i(playerView12, "pvPlayer");
        ((ImageView) j0(playerView12).q).setOnClickListener(new Y00(this, 4));
        C0560Kq c0560Kq22 = this.z0;
        AbstractC1474fG.g(c0560Kq22);
        ((PlayerSettingsTvView) c0560Kq22.q).setOnLocalSubtitlesClickedListener(new C1061b10(this, i3));
        C0560Kq c0560Kq23 = this.z0;
        AbstractC1474fG.g(c0560Kq23);
        ((PlayerSettingsTvView) c0560Kq23.q).setOnOpenSubtitleSelectedListener(new C1158c10(this, 0));
        C1042as c1042as3 = this.D0;
        if (c1042as3 != null) {
            c1042as3.l.a(new VZ(i3, this));
        }
    }

    public final void s0() {
        Window.Callback callback;
        if (this.y0 != null) {
            return;
        }
        if (AbstractC1899jh0.U(i0().a, "claro-", false) || AbstractC1899jh0.U(i0().a, "tv-", false) || AbstractC1899jh0.U(i0().a, "claroar-", false)) {
            AbstractActivityC1540fx abstractActivityC1540fxH = h();
            Window window = abstractActivityC1540fxH != null ? abstractActivityC1540fxH.getWindow() : null;
            if (window == null || (callback = window.getCallback()) == null) {
                return;
            }
            this.y0 = callback;
            window.setCallback(new WindowCallbackC2134m10(callback, this));
        }
    }

    public final boolean t0() {
        return AbstractC1899jh0.U(i0().a, "tv-", false) || AbstractC1899jh0.U(i0().a, "xuper-live:", false);
    }

    public final boolean u0() {
        Object next;
        Q30 q30;
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        return q30 == C1816io0.b && !UK.F(i0().a);
    }

    public final boolean v0() {
        if (!UK.F(i0().a) && this.F0.size() > 1) {
            Js0 js0 = this.p0;
            if (!AbstractC1474fG.b(js0 != null ? js0.n : null, "webview")) {
                return true;
            }
        }
        return false;
    }

    public final void w0(C1387eR c1387eR) {
        this.G0 = 0;
        A0();
        Z10 z10N0 = n0();
        C1703hg0 c1703hg0 = z10N0.h;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        z10N0.h = null;
        C1703hg0 c1703hg1 = z10N0.i;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        z10N0.i = null;
        g0();
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2328o10(this, c1387eR, null), 3);
    }

    public final void x0(boolean z, Js0 js0, Ds0 ds0, long j, boolean z2) {
        C1042as c1042as;
        C1042as c1042as2;
        boolean z3 = true;
        if (z2 && ((c1042as2 = this.D0) == null || !c1042as2.I())) {
            z3 = false;
        }
        y0();
        q0(z);
        e0();
        h0(js0, ds0, j);
        if (z3 || (c1042as = this.D0) == null) {
            return;
        }
        c1042as.i();
    }

    public final void y0() {
        C1042as c1042as = this.D0;
        if (c1042as != null) {
            c1042as.R();
        }
        this.D0 = null;
        C0560Kq c0560Kq = this.z0;
        PlayerView playerView = c0560Kq != null ? (PlayerView) c0560Kq.p : null;
        if (playerView == null) {
            return;
        }
        playerView.setPlayer(null);
    }

    public final void z0() {
        Window.Callback callback = this.y0;
        if (callback == null) {
            return;
        }
        this.y0 = null;
        AbstractActivityC1540fx abstractActivityC1540fxH = h();
        Window window = abstractActivityC1540fxH != null ? abstractActivityC1540fxH.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setCallback(callback);
    }
}
