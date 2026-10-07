package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.R;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O3 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ O3(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    private final void a() {
        BZ bz = (BZ) this.n;
        ((C1628gs) this.m).getClass();
        try {
            synchronized (bz) {
            }
            try {
                bz.a.c(bz.d, bz.e);
            } finally {
                bz.b(true);
            }
        } catch (Lr e) {
            AP.g("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        View view;
        View view2;
        long j2 = -9223372036854775807L;
        int i = 25;
        boolean zRequestFocus = false;
        int i2 = 1;
        switch (this.l) {
            case 0:
                Runnable runnable = (Runnable) this.n;
                P3 p3 = (P3) this.m;
                p3.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    p3.b();
                }
            case 1:
                C1364e7 c1364e7 = (C1364e7) this.m;
                c1364e7.getClass();
                int i3 = Lr0.a;
                C0942Zj c0942Zj = c1364e7.c.l.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1012, new S1(c3201x2S, (String) this.n, 26));
                return;
            case 2:
                ViewPager2 viewPager2 = (ViewPager2) this.m;
                AbstractC1474fG.j(viewPager2, "$this_apply");
                List list = (List) this.n;
                AbstractC1474fG.j(list, "$items");
                O50 adapter = viewPager2.getAdapter();
                AbstractC1474fG.h(adapter, "null cannot be cast to non-null type com.skidush.clonex.adapters.AppAdapter");
                ((C3300y3) adapter).m(list);
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.m;
                io.sentry.X1 x1 = (io.sentry.X1) this.n;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    x1.b();
                    synchronized (C1904jk.g0) {
                        try {
                            int i4 = C1904jk.i0 - 1;
                            C1904jk.i0 = i4;
                            if (i4 == 0) {
                                C1904jk.h0.shutdown();
                                C1904jk.h0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    x1.b();
                    synchronized (C1904jk.g0) {
                        try {
                            int i5 = C1904jk.i0 - 1;
                            C1904jk.i0 = i5;
                            if (i5 == 0) {
                                C1904jk.h0.shutdown();
                                C1904jk.h0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 4:
                C0372Dk c0372Dk = (C0372Dk) this.m;
                C0398Ek c0398Ek = c0372Dk.f220o;
                if (c0398Ek.z == 0 || c0372Dk.n) {
                    return;
                }
                Looper looper = c0398Ek.D;
                looper.getClass();
                c0372Dk.m = c0398Ek.b(looper, c0372Dk.l, (C0643Nw) this.n, false);
                c0398Ek.x.add(c0372Dk);
                return;
            case 5:
                C0657Ok c0657Ok = (C0657Ok) this.m;
                c0657Ok.t = false;
                c0657Ok.b((Uri) this.n);
                return;
            case 6:
                C0529Jl c0529Jl = (C0529Jl) this.m;
                AbstractC1474fG.j(c0529Jl, "this$0");
                ViewGroup viewGroup = (ViewGroup) this.n;
                AbstractC1474fG.j(viewGroup, "$container");
                Iterator it = c0529Jl.c.iterator();
                while (it.hasNext()) {
                    C3157wf0 c3157wf0 = (C3157wf0) ((C0555Kl) it.next()).a;
                    View view3 = c3157wf0.c.S;
                    if (view3 != null) {
                        AbstractC1674hK.d(c3157wf0.a, view3, viewGroup);
                    }
                }
                return;
            case 7:
                C1042as c1042as = (C1042as) this.m;
                C1334ds c1334ds = (C1334ds) this.n;
                int i6 = c1042as.G - c1334ds.c;
                c1042as.G = i6;
                if (c1334ds.d) {
                    c1042as.H = c1334ds.e;
                    c1042as.I = true;
                }
                if (c1334ds.f) {
                    c1042as.J = c1334ds.g;
                }
                if (i6 == 0) {
                    Fj0 fj0 = c1334ds.b.a;
                    if (!c1042as.j0.a.q() && fj0.q()) {
                        c1042as.k0 = -1;
                        c1042as.l0 = 0L;
                    }
                    if (!fj0.q()) {
                        List listAsList = Arrays.asList(((C1063b20) fj0).s);
                        AbstractC0397Ej.f(listAsList.size() == c1042as.f682o.size());
                        for (int i7 = 0; i7 < listAsList.size(); i7++) {
                            ((C0950Zr) c1042as.f682o.get(i7)).b = (Fj0) listAsList.get(i7);
                        }
                    }
                    if (c1042as.I) {
                        if (c1334ds.b.b.equals(c1042as.j0.b) && c1334ds.b.d == c1042as.j0.r) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            if (fj0.q() || c1334ds.b.b.a()) {
                                j2 = c1334ds.b.d;
                            } else {
                                C1493fZ c1493fZ = c1334ds.b;
                                CP cp = c1493fZ.b;
                                long j3 = c1493fZ.d;
                                Object obj = cp.a;
                                Dj0 dj0 = c1042as.n;
                                fj0.h(obj, dj0);
                                j2 = j3 + dj0.p;
                            }
                        }
                        j = j2;
                        z = i2;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    c1042as.I = false;
                    c1042as.g0(c1334ds.b, 1, c1042as.J, z, c1042as.H, j, -1, false);
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                C3025vC c3025vC = (C3025vC) this.m;
                AbstractC1474fG.j(c3025vC, "this$0");
                RB rb = (RB) this.n;
                AbstractC1474fG.j(rb, "$candidate");
                if (c3025vC.h) {
                    c3025vC.c.b(rb);
                    return;
                }
                return;
            case 10:
                Context context = (Context) this.m;
                AbstractC1474fG.j(context, "$context");
                String str = (String) this.n;
                AbstractC1474fG.j(str, "$message");
                Toast.makeText(context, str, 0).show();
                return;
            case 11:
                ((C2002kk) this.n).a(((QU) this.m).d());
                return;
            case 12:
                C2628r60 c2628r60 = (C2628r60) this.n;
                AbstractC1474fG.j(c2628r60, "$initialChannelIndex");
                AbstractC2144m60 abstractC2144m60G = ((RecyclerView) this.m).G(c2628r60.l);
                if (abstractC2144m60G == null || (view = abstractC2144m60G.a) == null) {
                    return;
                }
                view.requestFocus();
                return;
            case 13:
                ((ProfileInstallerInitializer) this.m).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC3010v30.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new L3((Context) this.n, i2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 14:
                E30 e30 = (E30) this.m;
                JE je = e30.C;
                InterfaceC2664rb0 interfaceC2664rb0 = (InterfaceC2664rb0) this.n;
                e30.J = je == null ? interfaceC2664rb0 : new C3114w7(-9223372036854775807L);
                e30.K = interfaceC2664rb0.j();
                if (!e30.Q && interfaceC2664rb0.j() == -9223372036854775807L) {
                    zRequestFocus = true;
                }
                e30.L = zRequestFocus;
                e30.M = zRequestFocus ? 7 : 1;
                e30.r.t(e30.K, interfaceC2664rb0.g(), e30.L);
                if (e30.G) {
                    return;
                }
                e30.n();
                return;
            case 15:
                ((AP) this.m).r((Typeface) this.n);
                return;
            case 16:
                Activity activity = (Activity) this.m;
                AbstractC1474fG.j(activity, "$activity");
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                Ec0 ec0 = Ec0.a;
                Ec0.c(activity);
                String str2 = (String) this.n;
                if (str2 != null && !AbstractC1899jh0.O(str2)) {
                    Toast.makeText(activity, str2, 1).show();
                }
                Intent intent = new Intent(activity, (Class<?>) LoginActivity.class);
                intent.setFlags(268468224);
                activity.startActivity(intent);
                activity.finish();
                return;
            case 17:
                Af0 af0 = (Af0) this.m;
                SurfaceTexture surfaceTexture = af0.r;
                Surface surface = af0.s;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.n;
                Surface surface2 = new Surface(surfaceTexture2);
                af0.r = surfaceTexture2;
                af0.s = surface2;
                Iterator it2 = af0.l.iterator();
                while (it2.hasNext()) {
                    ((SurfaceHolderCallbackC0898Xr) it2.next()).l.b0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 18:
                Runnable runnable2 = (Runnable) this.n;
                AbstractC1474fG.j(runnable2, "$command");
                P3 p4 = (P3) this.m;
                AbstractC1474fG.j(p4, "this$0");
                try {
                    runnable2.run();
                    return;
                } finally {
                    p4.b();
                }
            case 19:
                View view4 = (View) this.m;
                AbstractC1474fG.j(view4, "$root");
                View view5 = (View) this.n;
                AbstractC1474fG.j(view5, "$poster");
                ViewParent parent = view4.getParent();
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null && view4.isAttachedToWindow() && recyclerView.getWidth() > 0) {
                    int dimensionPixelSize = view4.getResources().getDimensionPixelSize(R.dimen.movies_spacing);
                    int width = ((recyclerView.getWidth() - (dimensionPixelSize * 2)) - (dimensionPixelSize * 5)) / 6;
                    i2 = width >= 1 ? width : 1;
                    int i8 = (i2 * 3) / 2;
                    int dimensionPixelSize2 = view4.getResources().getDimensionPixelSize(R.dimen.catalog_tv_card_info_height) + i8;
                    ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = dimensionPixelSize2;
                    view4.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                    layoutParams2.height = i8;
                    view5.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            case 20:
                C1717hn0 c1717hn0 = (C1717hn0) this.m;
                AbstractC1474fG.j(c1717hn0, "this$0");
                RecyclerView recyclerView2 = (RecyclerView) this.n;
                AbstractC1474fG.j(recyclerView2, "$rv");
                InterfaceC0360Cy interfaceC0360Cy = c1717hn0.h;
                AbstractC2144m60 abstractC2144m60G2 = recyclerView2.G(interfaceC0360Cy != null ? ((Number) interfaceC0360Cy.c()).intValue() : 0);
                if (abstractC2144m60G2 != null && (view2 = abstractC2144m60G2.a) != null) {
                    zRequestFocus = view2.requestFocus();
                }
                if (zRequestFocus) {
                    return;
                }
                recyclerView2.requestFocus();
                return;
            case 21:
                C1364e7 c1364e8 = (C1364e7) this.m;
                c1364e8.getClass();
                int i9 = Lr0.a;
                C1042as c1042as2 = c1364e8.c.l;
                C1045at0 c1045at0 = (C1045at0) this.n;
                c1042as2.h0 = c1045at0;
                c1042as2.l.e(25, new C0890Xj(c1045at0));
                return;
            case 22:
                C1364e7 c1364e9 = (C1364e7) this.m;
                c1364e9.getClass();
                int i10 = Lr0.a;
                C0942Zj c0942Zj2 = c1364e9.c.l.r;
                C3201x2 c3201x2S2 = c0942Zj2.S();
                c0942Zj2.T(c3201x2S2, 1019, new C0838Vj(c3201x2S2, (String) this.n, 15));
                return;
            case 23:
                C1364e7 c1364e10 = (C1364e7) this.m;
                c1364e10.getClass();
                int i11 = Lr0.a;
                C0942Zj c0942Zj3 = c1364e10.c.l.r;
                C3201x2 c3201x2S3 = c0942Zj3.S();
                c0942Zj3.T(c3201x2S3, 1030, new C0838Vj(c3201x2S3, (Exception) this.n, i));
                return;
            case 24:
                my0 my0Var = (my0) this.m;
                AbstractC1474fG.j(my0Var, "this$0");
                String str3 = (String) this.n;
                AbstractC1474fG.j(str3, "$videoId");
                Tv0 tv0 = (Tv0) my0Var.a;
                Iterator<T> it3 = tv0.getListeners().iterator();
                while (it3.hasNext()) {
                    ((AbstractC2325o0) it3.next()).e(tv0.getInstance(), str3);
                }
                return;
            default:
                ((Gy0) this.m).C((Socket) this.n);
                return;
        }
    }

    public /* synthetic */ O3(Runnable runnable, P3 p3) {
        this.l = 18;
        this.n = runnable;
        this.m = p3;
    }
}
