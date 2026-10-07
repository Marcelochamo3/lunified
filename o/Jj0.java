package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.settings.DnsConfigTvFragment;
import com.skidush.clonex.utils.RuntimeSecurityGuard;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Jj0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ Jj0(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    private final void a() {
        C3190ww c3190ww = (C3190ww) this.m;
        synchronized (c3190ww.f1104o) {
            try {
                if (c3190ww.s == null) {
                    return;
                }
                try {
                    C0488Hw c0488HwD = c3190ww.d();
                    int i = c0488HwD.e;
                    if (i == 2) {
                        synchronized (c3190ww.f1104o) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = Vl0.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C0622Nb c0622Nb = c3190ww.n;
                        Context context = c3190ww.l;
                        c0622Nb.getClass();
                        Typeface typefaceH = Lp0.a.h(context, new C0488Hw[]{c0488HwD}, 0);
                        MappedByteBuffer mappedByteBufferY = AbstractC1376eG.y(c3190ww.l, c0488HwD.a);
                        if (mappedByteBufferY == null || typefaceH == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            C1583gR c1583gR = new C1583gR(typefaceH, AP.s(mappedByteBufferY));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (c3190ww.f1104o) {
                                try {
                                    Pu0 pu0 = c3190ww.s;
                                    if (pu0 != null) {
                                        pu0.p(c1583gR);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            c3190ww.b();
                        } catch (Throwable th2) {
                            int i3 = Vl0.a;
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        int i4 = Vl0.a;
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (c3190ww.f1104o) {
                        try {
                            Pu0 pu1 = c3190ww.s;
                            if (pu1 != null) {
                                pu1.o(th4);
                            }
                            c3190ww.b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 9;
        int i2 = 1;
        boolean z = false;
        C2985uq0 c2985uq0 = null;
        switch (this.l) {
            case 0:
                Lj0.e((CompletableFuture) this.m);
                return;
            case 1:
                Activity activity = (Activity) this.m;
                if (activity.isFinishing()) {
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    Class cls = H1.a;
                    activity.recreate();
                    return;
                }
                Class cls2 = H1.a;
                boolean z2 = i3 == 26 || i3 == 27;
                Method method = H1.f;
                if ((!z2 || method != null) && (H1.e != null || H1.d != null)) {
                    try {
                        Object obj2 = H1.c.get(activity);
                        if (obj2 != null && (obj = H1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            G1 g1 = new G1(activity);
                            application.registerActivityLifecycleCallbacks(g1);
                            Handler handler = H1.g;
                            handler.post(new RunnableC1938k1(g1, obj2, i2, z));
                            try {
                                if (i3 == 26 || i3 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC1938k1(application, g1, 2, z));
                                return;
                            } catch (Throwable th) {
                                handler.post(new RunnableC1938k1(application, g1, 2, z));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                C2724s6 c2724s6 = (C2724s6) this.m;
                synchronized (c2724s6.a) {
                    try {
                        if (c2724s6.l) {
                            return;
                        }
                        long j = c2724s6.k - 1;
                        c2724s6.k = j;
                        if (j > 0) {
                            return;
                        }
                        if (j < 0) {
                            c2724s6.b(new IllegalStateException());
                            return;
                        } else {
                            c2724s6.a();
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 3:
                AbstractC1474fG.j((I7) this.m, "$this_runCatching");
                try {
                    Thread.sleep(500L);
                    break;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
                I7.a();
                throw null;
            case 4:
                ((CarouselLayoutManager) this.m).w0();
                return;
            case 5:
                ((C0314Be) this.m).t(true);
                return;
            case 6:
                ((AbstractActivityC1116bg) this.m).invalidateOptionsMenu();
                return;
            case 7:
                ExecutorC0938Zf executorC0938Zf = (ExecutorC0938Zf) this.m;
                Runnable runnable = executorC0938Zf.m;
                if (runnable != null) {
                    runnable.run();
                    executorC0938Zf.m = null;
                    return;
                }
                return;
            case 8:
                DialogC1213cg.b((DialogC1213cg) this.m);
                return;
            case 9:
                C0942Zj c0942Zj = (C0942Zj) this.m;
                C3201x2 c3201x2O = c0942Zj.O();
                c0942Zj.T(c3201x2O, 1028, new C0838Vj(c3201x2O));
                c0942Zj.q.d();
                return;
            case 10:
                C0372Dk c0372Dk = (C0372Dk) this.m;
                if (c0372Dk.n) {
                    return;
                }
                InterfaceC3465zo interfaceC3465zo = c0372Dk.m;
                if (interfaceC3465zo != null) {
                    interfaceC3465zo.d(c0372Dk.l);
                }
                c0372Dk.f220o.x.remove(c0372Dk);
                c0372Dk.n = true;
                return;
            case 11:
                ((C0294Ak) this.m).d(null);
                return;
            case 12:
                IF r2 = (IF) this.m;
                AbstractC1474fG.j(r2, "$seekCancelLambda");
                InterfaceC0360Cy interfaceC0360Cy = (InterfaceC0360Cy) r2.m;
                if (interfaceC0360Cy != null) {
                    interfaceC0360Cy.c();
                    return;
                }
                return;
            case 13:
                ArrayList arrayList = (ArrayList) this.m;
                AbstractC1474fG.j(arrayList, "$transitioningViews");
                AbstractC0800Tx.a(4, arrayList);
                return;
            case 14:
                int i4 = DefaultTimeBar.b0;
                ((DefaultTimeBar) this.m).d(false);
                return;
            case 15:
                DnsConfigTvFragment dnsConfigTvFragment = (DnsConfigTvFragment) this.m;
                AbstractC1474fG.j(dnsConfigTvFragment, "this$0");
                RecyclerView recyclerView = dnsConfigTvFragment.l0;
                if (recyclerView == null) {
                    AbstractC1474fG.U("recyclerView");
                    throw null;
                }
                recyclerView.requestFocus();
                RecyclerView recyclerView2 = dnsConfigTvFragment.l0;
                if (recyclerView2 == null) {
                    AbstractC1474fG.U("recyclerView");
                    throw null;
                }
                View childAt = recyclerView2.getChildAt(0);
                if (childAt != null) {
                    childAt.requestFocus();
                    return;
                }
                return;
            case 16:
                C0869Wo c0869Wo = (C0869Wo) this.m;
                boolean zIsPopupShowing = c0869Wo.h.isPopupShowing();
                c0869Wo.t(zIsPopupShowing);
                c0869Wo.m = zIsPopupShowing;
                return;
            case 17:
                a();
                return;
            case 18:
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) this.m;
                abstractComponentCallbacksC1247cx.c0.q.h(abstractComponentCallbacksC1247cx.f728o);
                abstractComponentCallbacksC1247cx.f728o = null;
                return;
            case 19:
                Iterator it = ((C3289xx) this.m).m.iterator();
                while (it.hasNext()) {
                    ((C0515Ix) it.next()).getClass();
                }
                return;
            case 20:
                ((C0334By) this.m).x();
                return;
            case 21:
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.m;
                AbstractC1474fG.j(playerMobileFragment, "this$0");
                C2303no0 c2303no0 = playerMobileFragment.u0;
                AbstractC1474fG.g(c2303no0);
                ((LW) c2303no0.n).m.setVisibility(8);
                C2303no0 c2303no1 = playerMobileFragment.u0;
                AbstractC1474fG.g(c2303no1);
                ((LW) c2303no1.n).m.setAlpha(1.0f);
                playerMobileFragment.N0 = false;
                return;
            case 22:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.t;
                ProcessLifecycleOwner processLifecycleOwner2 = (ProcessLifecycleOwner) this.m;
                AbstractC1474fG.j(processLifecycleOwner2, "this$0");
                int i5 = processLifecycleOwner2.m;
                C1478fK c1478fK = processLifecycleOwner2.q;
                if (i5 == 0) {
                    processLifecycleOwner2.n = true;
                    c1478fK.d(SJ.ON_PAUSE);
                }
                if (processLifecycleOwner2.l == 0 && processLifecycleOwner2.n) {
                    c1478fK.d(SJ.ON_STOP);
                    processLifecycleOwner2.f29o = true;
                    return;
                }
                return;
            case 23:
                ((AbstractC1753i50) this.m).m();
                return;
            case 24:
                U80 u80 = (U80) this.m;
                RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
                AbstractC1474fG.j(u80, "$detection");
                Application application2 = RuntimeSecurityGuard.j;
                if (application2 == null) {
                    return;
                }
                try {
                    Toast.makeText(application2, u80.a.l, 1).show();
                    break;
                } catch (Throwable unused3) {
                }
                RuntimeSecurityGuard.h.postDelayed(new UU(i), 350L);
                return;
            case 25:
                SearchMobileFragment searchMobileFragment = (SearchMobileFragment) this.m;
                AbstractC1474fG.j(searchMobileFragment, "this$0");
                if (searchMobileFragment.l0 == null || searchMobileFragment.o0.a() == 0) {
                    return;
                }
                C1750i4 c1750i4 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i4);
                X50 layoutManager = ((RecyclerView) c1750i4.q).getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null) {
                    gridLayoutManager.x = 0;
                    gridLayoutManager.y = 0;
                    C2549qK c2549qK = gridLayoutManager.z;
                    if (c2549qK != null) {
                        c2549qK.l = -1;
                    }
                    gridLayoutManager.E0();
                    c2985uq0 = C2985uq0.a;
                }
                if (c2985uq0 == null) {
                    C1750i4 c1750i5 = searchMobileFragment.l0;
                    AbstractC1474fG.g(c1750i5);
                    ((RecyclerView) c1750i5.q).g0(0);
                    return;
                }
                return;
            case 26:
                C2537q9 c2537q9 = (C2537q9) this.m;
                c2537q9.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c2537q9.e;
                Nt0 nt0 = sideSheetBehavior.i;
                if (nt0 != null && nt0.f()) {
                    c2537q9.a(c2537q9.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.w(c2537q9.b);
                        return;
                    }
                    return;
                }
            case 27:
                View view = (View) this.m;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                Af0 af0 = (Af0) this.m;
                Surface surface = af0.s;
                if (surface != null) {
                    Iterator it2 = af0.l.iterator();
                    while (it2.hasNext()) {
                        ((SurfaceHolderCallbackC0898Xr) it2.next()).l.b0(null);
                    }
                }
                SurfaceTexture surfaceTexture = af0.r;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                af0.r = null;
                af0.s = null;
                return;
        }
    }
}
