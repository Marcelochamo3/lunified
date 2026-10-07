package io.sentry.android.replay;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import com.skidush.clonex.fragments.settings.DnsConfigTvFragment;
import io.sentry.C0104y;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.regex.Pattern;
import o.A50;
import o.AbstractC0531Jn;
import o.AbstractC1119bh0;
import o.AbstractC1258d20;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;
import o.AbstractC2325o0;
import o.AbstractC3226xJ;
import o.AbstractC3409z9;
import o.AbstractComponentCallbacksC1247cx;
import o.C0323Bn;
import o.C0567Kx;
import o.C1011ac0;
import o.C1101bX;
import o.C1227cn;
import o.C1551g20;
import o.C1649h20;
import o.C2766se;
import o.C2863te;
import o.C2985uq0;
import o.C3269xn;
import o.C3289xx;
import o.C3325yL;
import o.DT;
import o.Ds0;
import o.HN;
import o.I60;
import o.IF;
import o.IN;
import o.InterfaceC0412Ey;
import o.InterfaceC1476fI;
import o.InterfaceC1739hy0;
import o.JN;
import o.LF;
import o.Mb0;
import o.Mr0;
import o.Na0;
import o.PM;
import o.SY;
import o.VQ;
import o.Vp0;
import o.X10;
import o.Yg0;
import o.ZF;
import o.ZJ;
import o.Zb0;
import o.ny0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Object obj) {
        super(1);
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        byte b = 0;
        int i = 1;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Object obj2 = this.n;
        switch (this.m) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                AbstractC1474fG.j(weakReference, "it");
                return Boolean.valueOf(AbstractC1474fG.b(weakReference.get(), (View) obj2));
            case 1:
                io.sentry.android.replay.capture.d dVar = (io.sentry.android.replay.capture.d) obj;
                AbstractC1474fG.j(dVar, "segment");
                if (dVar instanceof io.sentry.android.replay.capture.b) {
                    io.sentry.android.replay.capture.p pVar = (io.sentry.android.replay.capture.p) obj2;
                    ((io.sentry.android.replay.capture.b) dVar).a(pVar.s, new C0104y());
                    pVar.k.getAndIncrement();
                }
                return c2985uq0;
            case 2:
                return obj == ((Vp0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 3:
                AbstractC1474fG.j((IOException) obj, "it");
                byte[] bArr = Mr0.a;
                ((C1227cn) obj2).v = true;
                return c2985uq0;
            case 4:
                AbstractC0531Jn abstractC0531Jn = (AbstractC0531Jn) obj;
                AbstractC1474fG.j(abstractC0531Jn, "provider");
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.j(abstractC0531Jn);
                DnsConfigTvFragment dnsConfigTvFragment = (DnsConfigTvFragment) obj2;
                Toast.makeText(dnsConfigTvFragment.Q(), "DNS configurado: " + abstractC0531Jn.b, 1).show();
                C3269xn c3269xn = dnsConfigTvFragment.m0;
                if (c3269xn != null) {
                    c3269xn.a.b();
                    return c2985uq0;
                }
                AbstractC1474fG.U("adapter");
                throw null;
            case 5:
                final DT dt = (DT) obj;
                AbstractC1474fG.j(dt, "entry");
                final C0567Kx c0567Kx = (C0567Kx) obj2;
                return new ZJ() { // from class: o.Hx
                    @Override // o.ZJ
                    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
                        C0567Kx c0567Kx2 = c0567Kx;
                        AbstractC1474fG.j(c0567Kx2, "this$0");
                        DT dt2 = dt;
                        AbstractC1474fG.j(dt2, "$entry");
                        if (sj == SJ.ON_RESUME && ((List) c0567Kx2.b().e.l.getValue()).contains(dt2)) {
                            if (C0567Kx.n()) {
                                dt2.toString();
                                interfaceC1283dK.toString();
                            }
                            c0567Kx2.b().b(dt2);
                        }
                        if (sj == SJ.ON_DESTROY) {
                            if (C0567Kx.n()) {
                                dt2.toString();
                                interfaceC1283dK.toString();
                            }
                            c0567Kx2.b().b(dt2);
                        }
                    }
                };
            case 6:
                InterfaceC1739hy0 interfaceC1739hy0 = (InterfaceC1739hy0) obj;
                AbstractC1474fG.j(interfaceC1739hy0, "it");
                AbstractC2325o0 abstractC2325o0 = (AbstractC2325o0) obj2;
                AbstractC1474fG.j(abstractC2325o0, "listener");
                ((ny0) interfaceC1739hy0).c.add(abstractC2325o0);
                return c2985uq0;
            case 7:
                String str = (String) obj;
                AbstractC1474fG.j(str, "pin");
                MainMobileActivity mainMobileActivity = (MainMobileActivity) obj2;
                if (AbstractC1474fG.b(str, "6969")) {
                    mainMobileActivity.P = 0;
                    C3289xx c3289xxU = mainMobileActivity.u();
                    Na0 na0 = mainMobileActivity.I;
                    AbstractC1474fG.g(na0);
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = c3289xxU.D(((FragmentContainerView) na0.f414o).getId());
                    AbstractC1474fG.h(abstractComponentCallbacksC1247cxD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                    ((NavHostFragment) abstractComponentCallbacksC1247cxD).W().n(R.id.home, null, null);
                } else {
                    mainMobileActivity.P++;
                    Toast.makeText(mainMobileActivity, "PIN incorrecto. Intenta de nuevo.", 0).show();
                    if (mainMobileActivity.P >= 3) {
                        Toast.makeText(mainMobileActivity, "Demasiados intentos. Salida.", 0).show();
                        mainMobileActivity.P = 0;
                        mainMobileActivity.finish();
                        System.exit(0);
                        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                    new SY(new PM(new v(7, mainMobileActivity), b == true ? 1 : 0)).Z(mainMobileActivity.u(), "PinInputDialog");
                }
                return c2985uq0;
            case 8:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "pin");
                MainTvActivity mainTvActivity = (MainTvActivity) obj2;
                if (AbstractC1474fG.b(str2, "6969")) {
                    mainTvActivity.P = 0;
                    C3289xx c3289xxU2 = mainTvActivity.u();
                    Na0 na1 = mainTvActivity.I;
                    AbstractC1474fG.g(na1);
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD2 = c3289xxU2.D(((FragmentContainerView) na1.f414o).getId());
                    AbstractC1474fG.h(abstractComponentCallbacksC1247cxD2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                    ((NavHostFragment) abstractComponentCallbacksC1247cxD2).W().n(R.id.home, null, null);
                } else {
                    mainTvActivity.P++;
                    Toast.makeText(mainTvActivity, "PIN incorrecto. Intenta de nuevo.", 0).show();
                    if (mainTvActivity.P < 3) {
                        new SY(new PM(new v(8, mainTvActivity), i)).Z(mainTvActivity.u(), "PinInputDialog");
                    } else {
                        Toast.makeText(mainTvActivity, "Demasiados intentos. Salida.", 0).show();
                        mainTvActivity.P = 0;
                        mainTvActivity.finish();
                    }
                }
                return c2985uq0;
            case 9:
                return ((IN) obj2).d(((Number) obj).intValue());
            case 10:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "key");
                Object obj3 = ((IF) obj2).m;
                return Boolean.valueOf(obj3 == null || !((Bundle) obj3).containsKey(str3));
            case 11:
                AbstractC1474fG.j((C2863te) obj, "$this$buildSerialDescriptor");
                ((LF) obj2).getClass();
                return c2985uq0;
            case 12:
                ((A50) obj2).cancel();
                return c2985uq0;
            case 13:
                JN jn = (JN) obj;
                AbstractC1474fG.j(jn, "match");
                String str4 = (String) ((HN) jn.a()).get(1);
                ((VQ) obj2).getClass();
                switch (str4.hashCode()) {
                    case -1096862286:
                        if (str4.equals("lowest")) {
                            str4 = "240p";
                        }
                        break;
                    case -1068855134:
                        if (str4.equals("mobile")) {
                            str4 = "144p";
                        }
                        break;
                    case 3324:
                        if (str4.equals("hd")) {
                            str4 = "720p";
                        }
                        break;
                    case 3665:
                        if (str4.equals("sd")) {
                            str4 = "480p";
                        }
                        break;
                    case 107348:
                        if (str4.equals("low")) {
                            str4 = "360p";
                        }
                        break;
                    case 3154575:
                        if (str4.equals("full")) {
                            str4 = "1080p";
                        }
                        break;
                    case 3481927:
                        if (str4.equals("quad")) {
                            str4 = "1440p";
                        }
                        break;
                    case 111384492:
                        if (str4.equals("ultra")) {
                            str4 = "2160p";
                        }
                        break;
                }
                String strR = AbstractC1899jh0.R((String) ((HN) jn.a()).get(2), "\\/", "/", false);
                Pattern patternCompile = Pattern.compile("\\\\+u0026", C3325yL.p(2));
                AbstractC1474fG.i(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(strR).replaceAll("&");
                AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                if (!AbstractC1899jh0.U(strReplaceAll, "https://", false)) {
                    strReplaceAll = null;
                }
                if (strReplaceAll != null) {
                    return new C1101bX(str4, strReplaceAll);
                }
                return null;
            case 14:
                String str5 = (String) obj;
                AbstractC1474fG.g(str5);
                JN jnB = ((I60) obj2).b(str5, 0);
                if (jnB != null) {
                    return jnB.c();
                }
                return null;
            case 15:
                return ((ConstraintLayout) obj2).findViewById(((Number) obj).intValue());
            case 16:
                int iIntValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                AbstractC1258d20 abstractC1258d20 = (AbstractC1258d20) obj2;
                sb.append(abstractC1258d20.e[iIntValue]);
                sb.append(": ");
                sb.append(abstractC1258d20.f(iIntValue).a());
                return sb.toString();
            case 17:
                C2863te c2863te = (C2863te) obj;
                AbstractC1474fG.j(c2863te, "$this$buildSerialDescriptor");
                C2863te.a(c2863te, "type", Yg0.b);
                C2863te.a(c2863te, "value", AbstractC3409z9.c("kotlinx.serialization.Polymorphic<" + ((C2766se) ((InterfaceC1476fI) ((C1649h20) obj2).b)).b() + '>', C1551g20.k, new Zb0[0], X10.x));
                return c2985uq0;
            case 18:
                ((Mb0) obj2).c();
                return c2985uq0;
            case 19:
                int iIntValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C1011ac0 c1011ac0 = (C1011ac0) obj2;
                sb2.append(c1011ac0.e[iIntValue2]);
                sb2.append(": ");
                sb2.append(c1011ac0.f[iIntValue2].a());
                return sb2.toString();
            case 20:
                ZF zf = (ZF) obj;
                AbstractC1474fG.j(zf, "it");
                return AbstractC1119bh0.v0((CharSequence) obj2, zf);
            default:
                Ds0 ds0 = (Ds0) obj;
                AbstractC1474fG.j(ds0, "it");
                return Boolean.valueOf(!AbstractC1474fG.b(ds0.l, ((Ds0) obj2).l));
        }
    }
}
