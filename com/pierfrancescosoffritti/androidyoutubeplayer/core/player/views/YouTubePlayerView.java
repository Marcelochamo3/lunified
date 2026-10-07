package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import io.sentry.android.core.internal.util.a;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import o.AbstractC1474fG;
import o.AbstractC2089le0;
import o.C1583gR;
import o.C3053vc;
import o.C3124wE;
import o.I40;
import o.InterfaceC1283dK;
import o.Jp0;
import o.LU;
import o.NU;
import o.PJ;
import o.SJ;
import o.Tv0;
import o.ZJ;
import o.ny0;
import o.oy0;
import o.py0;
import o.qy0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class YouTubePlayerView extends AbstractC2089le0 implements ZJ {
    public final ArrayList l;
    public final PJ m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) throws JSONException, CertificateException {
        super(context, attributeSet, 0);
        AbstractC1474fG.j(context, "context");
        this.l = new ArrayList();
        PJ pj = new PJ(context, new py0(this));
        this.m = pj;
        addView(pj, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, I40.a, 0, 0);
        AbstractC1474fG.i(typedArrayObtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.n = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        String string = typedArrayObtainStyledAttributes.getString(3);
        typedArrayObtainStyledAttributes.recycle();
        if (z && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        qy0 qy0Var = new qy0(string, this, z);
        if (this.n) {
            C3124wE c3124wE = C3124wE.b;
            AbstractC1474fG.j(c3124wE, "playerOptions");
            if (pj.f454o) {
                throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
            }
            if (z2) {
                int i = Build.VERSION.SDK_INT;
                C1583gR c1583gR = pj.m;
                Context context2 = (Context) c1583gR.m;
                if (i >= 24) {
                    a aVar = new a(c1583gR);
                    c1583gR.p = aVar;
                    Object systemService = context2.getSystemService("connectivity");
                    AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(aVar);
                } else {
                    LU lu = new LU(new NU(c1583gR, 0), new NU(c1583gR, 1));
                    c1583gR.f793o = lu;
                    context2.registerReceiver(lu, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
            C3053vc c3053vc = new C3053vc(pj, c3124wE, qy0Var, 3);
            pj.p = c3053vc;
            if (z2) {
                return;
            }
            c3053vc.c();
        }
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        int i = oy0.a[sj.ordinal()];
        PJ pj = this.m;
        if (i == 1) {
            pj.n.a = true;
            pj.r = true;
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            b();
        } else {
            ny0 ny0Var = (ny0) pj.l.getYoutubePlayer$core_release();
            ny0Var.a(ny0Var.a, "pauseVideo", new Object[0]);
            pj.n.a = false;
            pj.r = false;
        }
    }

    public final void b() {
        int i = Build.VERSION.SDK_INT;
        PJ pj = this.m;
        C1583gR c1583gR = pj.m;
        Context context = (Context) c1583gR.m;
        if (i >= 24) {
            a aVar = (a) c1583gR.p;
            if (aVar != null) {
                Object systemService = context.getSystemService("connectivity");
                AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).unregisterNetworkCallback(aVar);
                ((ArrayList) c1583gR.n).clear();
                c1583gR.p = null;
                c1583gR.f793o = null;
            }
        } else {
            LU lu = (LU) c1583gR.f793o;
            if (lu != null) {
                try {
                    context.unregisterReceiver(lu);
                } catch (Throwable th) {
                    Jp0.k(th);
                }
                ((ArrayList) c1583gR.n).clear();
                c1583gR.p = null;
                c1583gR.f793o = null;
            }
        }
        Tv0 tv0 = pj.l;
        pj.removeView(tv0);
        tv0.removeAllViews();
        tv0.destroy();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.n;
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC1474fG.j(view, "view");
        this.m.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.n = z;
    }
}
