package io.sentry.android.replay;

import android.app.Application;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebChromeClient;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.favorites.FavoritesMobileFragment;
import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;
import com.skidush.clonex.fragments.history.HistoryMobileFragment;
import com.skidush.clonex.fragments.history.HistoryTvFragment;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import io.sentry.B;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import o.AH;
import o.AbstractC1016af;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1468fA;
import o.AbstractC1474fG;
import o.AbstractC1674hK;
import o.AbstractC3226xJ;
import o.AbstractC3347yd0;
import o.AbstractC3409z9;
import o.C0385Dx;
import o.C0395Eh;
import o.C0452Gm;
import o.C0567Kx;
import o.C0744Rt;
import o.C0782Tf;
import o.C1011ac0;
import o.C1403ed0;
import o.C1469fB;
import o.C1478fK;
import o.C1521fn0;
import o.C1551g20;
import o.C1649h20;
import o.C2133m1;
import o.C2182mc0;
import o.C2691rp;
import o.C2985uq0;
import o.C3194wy;
import o.C3289xx;
import o.C3291xy;
import o.C50;
import o.DT;
import o.ET;
import o.EU;
import o.G;
import o.InterfaceC0360Cy;
import o.InterfaceC1022ai;
import o.InterfaceC1047au0;
import o.InterfaceC1283dK;
import o.InterfaceC1476fI;
import o.K3;
import o.L90;
import o.M5;
import o.PT;
import o.Rh0;
import o.RunnableC2812t10;
import o.Sc0;
import o.Sr0;
import o.UK;
import o.Wc0;
import o.YT;
import o.ZT;
import o.Zb0;
import o.Zt0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj) {
        super(0);
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC0360Cy
    public final Object c() {
        AtomicInteger atomicInteger;
        Object[] objArr;
        C1478fK c1478fKF;
        int i = 4;
        int i2 = 3;
        boolean z = true;
        C2985uq0 c2985uq0 = C2985uq0.a;
        int i3 = 0;
        Object obj = this.n;
        switch (this.m) {
            case 0:
                h hVar = (h) obj;
                String cacheDirPath = hVar.l.getCacheDirPath();
                I1 i1 = hVar.l;
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    i1.getLogger().h(EnumC0094u1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = i1.getCacheDirPath();
                AbstractC1474fG.g(cacheDirPath2);
                File file = new File(cacheDirPath2, "replay_" + hVar.m);
                file.mkdirs();
                return file;
            case 1:
                io.sentry.android.replay.capture.g gVar = ((ReplayIntegration) obj).s;
                if (gVar != null && (atomicInteger = gVar.k) != null) {
                    atomicInteger.getAndIncrement();
                }
                return c2985uq0;
            case 2:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) obj;
                return scheduledExecutorService == null ? Executors.newSingleThreadScheduledExecutor(new B(4)) : scheduledExecutorService;
            case 3:
                io.sentry.android.replay.video.d dVar = (io.sentry.android.replay.video.d) obj;
                io.sentry.android.replay.video.a aVar = dVar.b;
                I1 i4 = dVar.a;
                io.sentry.android.replay.video.a aVar2 = dVar.b;
                int iIntValue = aVar.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = dVar.d.getCodecInfo().getCapabilitiesForType(aVar2.f).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        i4.getLogger().h(EnumC0094u1.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Comparable comparableClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        AbstractC1474fG.i(comparableClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        iIntValue = ((Number) comparableClamp).intValue();
                    }
                    break;
                } catch (Throwable th) {
                    i4.getLogger().v(EnumC0094u1.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(aVar2.f, aVar2.b, aVar2.c);
                AbstractC1474fG.i(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar2.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
                return mediaFormatCreateVideoFormat;
            case 4:
                return UK.H((Object[]) obj);
            case 5:
                return ((Iterable) obj).iterator();
            case 6:
                return new C0744Rt(0, (FavoritesMobileFragment) obj);
            case 7:
                return new C0744Rt(z ? 1 : 0, (FavoritesTvFragment) obj);
            case 8:
                C3291xy c3291xy = (C3291xy) obj;
                if (Build.VERSION.SDK_INT >= 23) {
                    String str = c3291xy.m;
                }
                C3194wy c3194wy = new C3194wy(c3291xy.l, c3291xy.m, new C2133m1(29), c3291xy.n);
                c3194wy.setWriteAheadLoggingEnabled(c3291xy.p);
                return c3194wy;
            case 9:
                return new C0744Rt(i, (HistoryMobileFragment) obj);
            case 10:
                return new C0744Rt(5, (HistoryTvFragment) obj);
            case 11:
                DT dt = (DT) obj;
                Context context = dt.l;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new L90(applicationContext instanceof Application ? (Application) applicationContext : null, dt, dt.b());
            case 12:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "uriPattern");
                return new PT(str2, null, null);
            case 13:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context contextJ = navHostFragment.j();
                if (contextJ == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
                }
                YT yt = new YT(contextJ);
                if (!AbstractC1474fG.b(navHostFragment, yt.n)) {
                    InterfaceC1283dK interfaceC1283dK = yt.n;
                    C0385Dx c0385Dx = yt.r;
                    if (interfaceC1283dK != null && (c1478fKF = interfaceC1283dK.f()) != null) {
                        c1478fKF.f(c0385Dx);
                    }
                    yt.n = navHostFragment;
                    navHostFragment.b0.a(c0385Dx);
                }
                Zt0 zt0E = navHostFragment.e();
                if (!AbstractC1474fG.b(yt.f636o, Sr0.m(zt0E))) {
                    if (!yt.g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
                    }
                    yt.f636o = Sr0.m(zt0E);
                }
                Context contextQ = navHostFragment.Q();
                C3289xx c3289xxI = navHostFragment.i();
                AbstractC1474fG.i(c3289xxI, "childFragmentManager");
                C0452Gm c0452Gm = new C0452Gm(contextQ, c3289xxI);
                EU eu = yt.u;
                eu.a(c0452Gm);
                Context contextQ2 = navHostFragment.Q();
                C3289xx c3289xxI2 = navHostFragment.i();
                AbstractC1474fG.i(c3289xxI2, "childFragmentManager");
                int i5 = navHostFragment.J;
                if (i5 == 0 || i5 == -1) {
                    i5 = R.id.nav_host_fragment_container;
                }
                eu.a(new C0567Kx(contextQ2, c3289xxI2, i5));
                Bundle bundleC = ((K3) navHostFragment.f0.f832o).c("android-support-nav:fragment:navControllerState");
                if (bundleC != null) {
                    bundleC.setClassLoader(contextJ.getClassLoader());
                    yt.d = bundleC.getBundle("android-support-nav:controller:navigatorState");
                    yt.e = bundleC.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = yt.m;
                    linkedHashMap.clear();
                    int[] intArray = bundleC.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < length) {
                            yt.l.put(Integer.valueOf(intArray[i6]), stringArrayList.get(i7));
                            i6++;
                            i7++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str3 : stringArrayList2) {
                            Parcelable[] parcelableArray = bundleC.getParcelableArray("android-support-nav:controller:backStackStates:" + str3);
                            if (parcelableArray != null) {
                                AbstractC1474fG.i(str3, "id");
                                int length2 = parcelableArray.length;
                                M5 m5 = new M5();
                                if (length2 == 0) {
                                    objArr = M5.f391o;
                                } else {
                                    if (length2 <= 0) {
                                        throw new IllegalArgumentException(AbstractC1674hK.n(length2, "Illegal Capacity: "));
                                    }
                                    objArr = new Object[length2];
                                }
                                m5.m = objArr;
                                G gH = UK.H(parcelableArray);
                                while (gH.hasNext()) {
                                    Parcelable parcelable = (Parcelable) gH.next();
                                    AbstractC1474fG.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    m5.f((ET) parcelable);
                                }
                                linkedHashMap.put(str3, m5);
                            }
                        }
                    }
                    yt.f = bundleC.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                ((K3) navHostFragment.f0.f832o).f("android-support-nav:fragment:navControllerState", new C0782Tf(i2, yt));
                Bundle bundleC2 = ((K3) navHostFragment.f0.f832o).c("android-support-nav:fragment:graphId");
                if (bundleC2 != null) {
                    navHostFragment.n0 = bundleC2.getInt("android-support-nav:fragment:graphId");
                }
                ((K3) navHostFragment.f0.f832o).f("android-support-nav:fragment:graphId", new C0782Tf(i, navHostFragment));
                int i8 = navHostFragment.n0;
                Rh0 rh0 = yt.B;
                if (i8 != 0) {
                    yt.z(((ZT) rh0.getValue()).b(i8), null);
                } else {
                    Bundle bundle = navHostFragment.q;
                    int i9 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i9 != 0) {
                        yt.z(((ZT) rh0.getValue()).b(i9), bundle2);
                    }
                }
                return yt;
            case 14:
                return Integer.valueOf(((C1521fn0) obj).h);
            case 15:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.post(new RunnableC2812t10(i3, recyclerView));
                return c2985uq0;
            case 16:
                C1649h20 c1649h20 = (C1649h20) obj;
                C1011ac0 c1011ac0C = AbstractC3409z9.c("o.f20", C1551g20.j, new Zb0[0], new v(17, c1649h20));
                InterfaceC1476fI interfaceC1476fI = (InterfaceC1476fI) c1649h20.b;
                AbstractC1474fG.j(interfaceC1476fI, "context");
                return new C0395Eh(c1011ac0C, interfaceC1476fI);
            case 17:
                C1469fB c1469fB = ((C50) obj).e;
                AbstractC1474fG.g(c1469fB);
                List<Certificate> listA = c1469fB.a();
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
                for (Certificate certificate : listA) {
                    AbstractC1474fG.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 18:
                return AbstractC1474fG.y((InterfaceC1047au0) obj);
            case 19:
                return obj;
            case 20:
                C1011ac0 c1011ac0 = (C1011ac0) obj;
                return Integer.valueOf(AbstractC1468fA.p(c1011ac0, c1011ac0.h));
            case 21:
                X509Certificate[] acceptedIssuers = ((C2182mc0) obj).a.getAcceptedIssuers();
                AbstractC1474fG.i(acceptedIssuers, "getAcceptedIssuers(...)");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int length3 = acceptedIssuers.length;
                while (i3 < length3) {
                    linkedHashSet.add(new TrustAnchor(acceptedIssuers[i3], null));
                    i3++;
                }
                return linkedHashSet;
            case 22:
                Wc0 wc0 = (Wc0) obj;
                AbstractC1376eG.w(AbstractC1459f50.y(wc0.q()), null, 0, new Sc0(wc0, null), 3);
                return c2985uq0;
            case 23:
                SettingsTvFragment settingsTvFragment = (SettingsTvFragment) obj;
                AbstractC1376eG.w(AbstractC1459f50.y(settingsTvFragment.q()), null, 0, new C1403ed0(settingsTvFragment, null), 3);
                return c2985uq0;
            case 24:
                return ((AbstractC3347yd0) obj).b();
            case 25:
                AH ah = (AH) ((InterfaceC1022ai) obj).q(C2691rp.v);
                return Boolean.valueOf(ah != null ? ah.a() : true);
            default:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return c2985uq0;
        }
    }
}
