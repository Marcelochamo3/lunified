package com.skidush.clonex;

import android.app.UiModeManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skidush.clonex.CloudflareChallengeActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC0807Ue;
import o.AbstractC1370eA;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;
import o.AbstractC3327yN;
import o.C0729Re;
import o.C0755Se;
import o.C0781Te;
import o.C1101bX;
import o.E3;
import o.Ov0;
import o.RunnableC0677Pe;
import o.U9;

/* JADX INFO: loaded from: classes.dex */
public final class CloudflareChallengeActivity extends E3 {
    public static final /* synthetic */ int V = 0;
    public final Handler J = new Handler(Looper.getMainLooper());
    public final Object K = new Object();
    public final AtomicBoolean L = new AtomicBoolean(false);
    public String M;
    public String N;
    public WebView O;
    public FrameLayout P;
    public C0729Re Q;
    public float R;
    public float S;
    public boolean T;
    public long U;

    public final int A(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void B(IllegalStateException illegalStateException) {
        if (this.L.compareAndSet(false, true)) {
            ConcurrentHashMap concurrentHashMap = AbstractC0807Ue.a;
            String str = this.M;
            if (str == null) {
                AbstractC1474fG.U("requestId");
                throw null;
            }
            AbstractC0807Ue.a(str, illegalStateException);
            finish();
        }
    }

    public final void C(long j) {
        if (this.L.get()) {
            return;
        }
        this.J.postAtTime(new RunnableC0677Pe(this, 1), this.K, SystemClock.uptimeMillis() + j);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    @Override // o.E3, o.AbstractActivityC1018ag, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1101bX c1101bX;
        int iA;
        AbstractC1474fG.j(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111 || keyEvent.getKeyCode() == 97) {
            if (keyEvent.getAction() == 0) {
                B(new IllegalStateException("Verificación de Cloudflare cancelada"));
            }
            return true;
        }
        if (!this.T || this.Q == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                c1101bX = new C1101bX(Float.valueOf(0.0f), Float.valueOf(-1.0f));
                break;
            case 20:
                c1101bX = new C1101bX(Float.valueOf(0.0f), Float.valueOf(1.0f));
                break;
            case 21:
                c1101bX = new C1101bX(Float.valueOf(-1.0f), Float.valueOf(0.0f));
                break;
            case 22:
                c1101bX = new C1101bX(Float.valueOf(1.0f), Float.valueOf(0.0f));
                break;
            default:
                c1101bX = null;
                break;
        }
        if (c1101bX == null) {
            if (keyEvent.getKeyCode() != 23 && keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160 && keyEvent.getKeyCode() != 96 && keyEvent.getKeyCode() != 109) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && this.O != null && !this.L.get()) {
                float fA = this.R + A(3);
                WebView webView = this.O;
                if (webView == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                int width = webView.getWidth() - 1;
                if (width < 0) {
                    width = 0;
                }
                final float fG = U9.g(fA, width);
                float fA2 = this.S + A(3);
                WebView webView2 = this.O;
                if (webView2 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                int height = webView2.getHeight() - 1;
                final float fG2 = U9.g(fA2, height >= 0 ? height : 0);
                final long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fG, fG2, 0);
                motionEventObtain.setSource(4098);
                WebView webView3 = this.O;
                if (webView3 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView3.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                this.J.postDelayed(new Runnable() { // from class: o.Oe
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = CloudflareChallengeActivity.V;
                        CloudflareChallengeActivity cloudflareChallengeActivity = this.l;
                        AbstractC1474fG.j(cloudflareChallengeActivity, "this$0");
                        if (cloudflareChallengeActivity.L.get() || cloudflareChallengeActivity.O == null) {
                            return;
                        }
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, SystemClock.uptimeMillis(), 1, fG, fG2, 0);
                        motionEventObtain2.setSource(4098);
                        WebView webView4 = cloudflareChallengeActivity.O;
                        if (webView4 == null) {
                            AbstractC1474fG.U("webView");
                            throw null;
                        }
                        webView4.dispatchTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                    }
                }, 80L);
            }
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int repeatCount = keyEvent.getRepeatCount() / 4;
            float f = (repeatCount <= 3 ? repeatCount : 3) + 1.0f;
            float fFloatValue = ((Number) c1101bX.l).floatValue();
            float fFloatValue2 = ((Number) c1101bX.m).floatValue();
            FrameLayout frameLayout = this.P;
            if (frameLayout != null && frameLayout.getWidth() > 0) {
                FrameLayout frameLayout2 = this.P;
                if (frameLayout2 == null) {
                    AbstractC1474fG.U("webContainer");
                    throw null;
                }
                if (frameLayout2.getHeight() > 0) {
                    float fA3 = A(24) * f;
                    C0729Re c0729Re = this.Q;
                    if (c0729Re != null) {
                        int width2 = c0729Re.getWidth();
                        Integer numValueOf = Integer.valueOf(width2);
                        if (width2 <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iA = numValueOf.intValue();
                        } else {
                            iA = A(42);
                        }
                    } else {
                        iA = A(42);
                    }
                    float f2 = (fFloatValue * fA3) + this.R;
                    FrameLayout frameLayout3 = this.P;
                    if (frameLayout3 == null) {
                        AbstractC1474fG.U("webContainer");
                        throw null;
                    }
                    int width3 = frameLayout3.getWidth() - iA;
                    if (width3 < 0) {
                        width3 = 0;
                    }
                    this.R = U9.g(f2, width3);
                    float f3 = (fFloatValue2 * fA3) + this.S;
                    FrameLayout frameLayout4 = this.P;
                    if (frameLayout4 == null) {
                        AbstractC1474fG.U("webContainer");
                        throw null;
                    }
                    int height2 = frameLayout4.getHeight() - iA;
                    if (height2 < 0) {
                        height2 = 0;
                    }
                    this.S = U9.g(f3, height2);
                    C0729Re c0729Re2 = this.Q;
                    if (c0729Re2 != null) {
                        c0729Re2.setTranslationX(this.R);
                        c0729Re2.setTranslationY(this.S);
                        c0729Re2.setVisibility(0);
                        c0729Re2.bringToFront();
                    }
                }
            }
        }
        return true;
    }

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        String stringExtra = getIntent().getStringExtra("cloudflare_request_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.M = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("cloudflare_url");
        this.N = stringExtra2 != null ? stringExtra2 : "";
        String str = this.M;
        if (str == null) {
            AbstractC1474fG.U("requestId");
            throw null;
        }
        if (!AbstractC1899jh0.O(str)) {
            String str2 = this.N;
            if (str2 == null) {
                AbstractC1474fG.U("targetUrl");
                throw null;
            }
            if (!AbstractC1899jh0.O(str2)) {
                String str3 = this.N;
                if (str3 == null) {
                    AbstractC1474fG.U("targetUrl");
                    throw null;
                }
                Uri uri = Uri.parse(str3);
                AbstractC1474fG.i(uri, "parse(...)");
                if (!AbstractC1370eA.z(uri)) {
                    ConcurrentHashMap concurrentHashMap = AbstractC0807Ue.a;
                    String str4 = this.M;
                    if (str4 == null) {
                        AbstractC1474fG.U("requestId");
                        throw null;
                    }
                    AbstractC0807Ue.a(str4, new IOException("URL Web insegura o inválida"));
                    finish();
                    return;
                }
                this.U = SystemClock.uptimeMillis();
                Object systemService = getSystemService("uimode");
                UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
                this.T = (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) || getPackageManager().hasSystemFeature("android.software.leanback") || !getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                TextView textView = new TextView(this);
                textView.setText(this.T ? "Verificación de AnimeNinjaX\nMueve el cursor con las flechas, pulsa OK para seleccionar y ATRÁS para cancelar." : "Verificación de AnimeNinjaX\nToca la casilla de Cloudflare si aparece. Atrás cancela.");
                textView.setTextColor(-1);
                textView.setBackgroundColor(Color.rgb(24, 24, 24));
                textView.setTextSize(16.0f);
                textView.setGravity(17);
                textView.setPadding(24, 20, 24, 20);
                WebView webView = new WebView(this);
                webView.setBackgroundColor(-1);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setDatabaseEnabled(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(false);
                settings.setUserAgentString("Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36");
                settings.setMixedContentMode(1);
                settings.setCacheMode(-1);
                settings.setBlockNetworkLoads(false);
                settings.setBlockNetworkImage(false);
                settings.setLoadsImagesAutomatically(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                Ov0.b(webView);
                webView.setWebChromeClient(new WebChromeClient());
                webView.setWebViewClient(new C0755Se(this));
                this.O = webView;
                FrameLayout frameLayout = new FrameLayout(this);
                frameLayout.setBackgroundColor(-1);
                WebView webView2 = this.O;
                if (webView2 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                frameLayout.addView(webView2, new FrameLayout.LayoutParams(-1, -1));
                if (this.T) {
                    int iA = A(42);
                    C0729Re c0729Re = new C0729Re(this);
                    c0729Re.setElevation(A(20));
                    frameLayout.addView(c0729Re, new FrameLayout.LayoutParams(iA, iA));
                    this.Q = c0729Re;
                }
                this.P = frameLayout;
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                WebView webView3 = this.O;
                if (webView3 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                cookieManager.setAcceptThirdPartyCookies(webView3, true);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setBackgroundColor(-1);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
                FrameLayout frameLayout2 = this.P;
                if (frameLayout2 == null) {
                    AbstractC1474fG.U("webContainer");
                    throw null;
                }
                linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                setContentView(linearLayout);
                if (this.T) {
                    FrameLayout frameLayout3 = this.P;
                    if (frameLayout3 == null) {
                        AbstractC1474fG.U("webContainer");
                        throw null;
                    }
                    frameLayout3.post(new RunnableC0677Pe(this, i));
                }
                n().a(this, new C0781Te(i, this));
                WebView webView4 = this.O;
                if (webView4 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                String str5 = this.N;
                if (str5 == null) {
                    AbstractC1474fG.U("targetUrl");
                    throw null;
                }
                webView4.loadUrl(str5, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36"), new C1101bX("Accept-Language", "es-ES,es;q=0.9,en;q=0.7")));
                C(1000L);
                return;
            }
        }
        finish();
    }

    @Override // o.E3, o.AbstractActivityC1540fx, android.app.Activity
    public final void onDestroy() {
        this.J.removeCallbacksAndMessages(this.K);
        WebView webView = this.O;
        if (webView != null) {
            try {
                webView.stopLoading();
                WebView webView2 = this.O;
                if (webView2 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView2.setWebChromeClient(null);
                WebView webView3 = this.O;
                if (webView3 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView3.setWebViewClient(new WebViewClient());
                WebView webView4 = this.O;
                if (webView4 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView4.loadUrl("about:blank");
                WebView webView5 = this.O;
                if (webView5 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                ViewParent parent = webView5.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    WebView webView6 = this.O;
                    if (webView6 == null) {
                        AbstractC1474fG.U("webView");
                        throw null;
                    }
                    viewGroup.removeView(webView6);
                }
                WebView webView7 = this.O;
                if (webView7 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView7.removeAllViews();
                WebView webView8 = this.O;
                if (webView8 == null) {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
                webView8.destroy();
            } catch (Throwable unused) {
            }
        }
        if (!this.L.get() && this.M != null && !isChangingConfigurations()) {
            ConcurrentHashMap concurrentHashMap = AbstractC0807Ue.a;
            String str = this.M;
            if (str == null) {
                AbstractC1474fG.U("requestId");
                throw null;
            }
            AbstractC0807Ue.a(str, new IllegalStateException("La verificación de Cloudflare se cerró"));
        }
        super.onDestroy();
    }
}
