package o;

import android.app.Dialog;
import android.util.Log;
import com.google.android.exoplayer2.ui.PlayerView;
import com.skidush.clonex.CloudflareChallengeActivity;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import com.skidush.clonex.fragments.player.settings.PlayerSettingsTvView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: o.Te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781Te extends WV {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0781Te(int i, Object obj) {
        super(true);
        this.d = i;
        this.e = obj;
    }

    @Override // o.WV
    public void a() {
        switch (this.d) {
            case 1:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                C3289xx c3289xx = (C3289xx) this.e;
                if (zIsLoggable) {
                    Objects.toString(c3289xx);
                }
                F7 f7 = c3289xx.h;
                if (f7 != null) {
                    f7.s = false;
                    Jj0 jj0 = new Jj0(19, c3289xx);
                    if (f7.q == null) {
                        f7.q = new ArrayList();
                    }
                    f7.q.add(jj0);
                    c3289xx.h.e(false);
                    c3289xx.z(true);
                    c3289xx.F();
                }
                c3289xx.h = null;
                break;
        }
    }

    @Override // o.WV
    public final void b() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                IllegalStateException illegalStateException = new IllegalStateException("Verificación de Cloudflare cancelada");
                int i = CloudflareChallengeActivity.V;
                ((CloudflareChallengeActivity) obj).B(illegalStateException);
                return;
            case 1:
                C3289xx c3289xx = (C3289xx) obj;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(c3289xx);
                }
                c3289xx.z(true);
                F7 f7 = c3289xx.h;
                C0781Te c0781Te = c3289xx.i;
                if (f7 == null) {
                    if (c0781Te.a) {
                        Log.isLoggable("FragmentManager", 3);
                        c3289xx.S();
                        return;
                    } else {
                        Log.isLoggable("FragmentManager", 3);
                        c3289xx.g.b();
                        return;
                    }
                }
                ArrayList<C0515Ix> arrayList = c3289xx.m;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C3289xx.G(c3289xx.h));
                    for (C0515Ix c0515Ix : arrayList) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            c0515Ix.a((AbstractComponentCallbacksC1247cx) it.next(), true);
                        }
                    }
                }
                Iterator it2 = c3289xx.h.a.iterator();
                while (it2.hasNext()) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C0774Sx) it2.next()).b;
                    if (abstractComponentCallbacksC1247cx != null) {
                        abstractComponentCallbacksC1247cx.x = false;
                    }
                }
                for (C0581Ll c0581Ll : c3289xx.f(new ArrayList(Collections.singletonList(c3289xx.h)), 0, 1)) {
                    c0581Ll.getClass();
                    Log.isLoggable("FragmentManager", 3);
                    ArrayList arrayList2 = c0581Ll.c;
                    c0581Ll.k(arrayList2);
                    c0581Ll.c(arrayList2);
                }
                Iterator it3 = c3289xx.h.a.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C0774Sx) it3.next()).b;
                    if (abstractComponentCallbacksC1247cx2 != null && abstractComponentCallbacksC1247cx2.R == null) {
                        c3289xx.g(abstractComponentCallbacksC1247cx2).k();
                    }
                }
                c3289xx.h = null;
                c3289xx.g0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    boolean z = c0781Te.a;
                    c3289xx.toString();
                    return;
                }
                return;
            case 2:
                ((YT) obj).r();
                return;
            default:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj;
                C0560Kq c0560Kq = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq);
                PlayerSettingsTvView playerSettingsTvView = (PlayerSettingsTvView) c0560Kq.q;
                AbstractC1474fG.i(playerSettingsTvView, "settings");
                playerSettingsTvView.getVisibility();
                Dialog dialog = playerTvFragment.u0;
                if (dialog != null && dialog.isShowing()) {
                    Dialog dialog2 = playerTvFragment.u0;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        return;
                    }
                    return;
                }
                C0560Kq c0560Kq2 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq2);
                PlayerSettingsTvView playerSettingsTvView2 = (PlayerSettingsTvView) c0560Kq2.q;
                AbstractC1474fG.i(playerSettingsTvView2, "settings");
                if (playerSettingsTvView2.getVisibility() != 0) {
                    C0560Kq c0560Kq3 = playerTvFragment.z0;
                    AbstractC1474fG.g(c0560Kq3);
                    if (!((PlayerView) c0560Kq3.p).b()) {
                        this.a = false;
                        InterfaceC0360Cy interfaceC0360Cy = this.c;
                        if (interfaceC0360Cy != null) {
                            interfaceC0360Cy.c();
                        }
                        playerTvFragment.P().onBackPressed();
                        return;
                    }
                    C0560Kq c0560Kq4 = playerTvFragment.z0;
                    AbstractC1474fG.g(c0560Kq4);
                    C2951uZ c2951uZ = ((PlayerView) c0560Kq4.p).u;
                    if (c2951uZ != null) {
                        c2951uZ.b();
                        return;
                    }
                    return;
                }
                C0560Kq c0560Kq5 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq5);
                PlayerSettingsTvView playerSettingsTvView3 = (PlayerSettingsTvView) c0560Kq5.q;
                int iOrdinal = playerSettingsTvView3.getCurrentSettings().ordinal();
                EnumC2035l00 enumC2035l00 = EnumC2035l00.f884o;
                switch (iOrdinal) {
                    case 0:
                        playerSettingsTvView3.p();
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 14:
                    case 15:
                    case 16:
                        playerSettingsTvView3.o(EnumC2035l00.l);
                        break;
                    case 4:
                        playerSettingsTvView3.o(enumC2035l00);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        playerSettingsTvView3.o(EnumC2035l00.p);
                        break;
                    case 13:
                        playerSettingsTvView3.o(enumC2035l00);
                        break;
                    default:
                        throw new C0730Rf();
                }
                C0560Kq c0560Kq6 = playerTvFragment.z0;
                AbstractC1474fG.g(c0560Kq6);
                PlayerSettingsTvView playerSettingsTvView4 = (PlayerSettingsTvView) c0560Kq6.q;
                AbstractC1474fG.i(playerSettingsTvView4, "settings");
                if (playerSettingsTvView4.getVisibility() == 0) {
                    return;
                }
                playerTvFragment.B0();
                return;
        }
    }

    @Override // o.WV
    public void c(E7 e7) {
        switch (this.d) {
            case 1:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
                C3289xx c3289xx = (C3289xx) this.e;
                if (zIsLoggable) {
                    Objects.toString(c3289xx);
                }
                if (c3289xx.h != null) {
                    for (C0581Ll c0581Ll : c3289xx.f(new ArrayList(Collections.singletonList(c3289xx.h)), 0, 1)) {
                        c0581Ll.getClass();
                        AbstractC1474fG.j(e7, "backEvent");
                        Log.isLoggable("FragmentManager", 2);
                        ArrayList arrayList = c0581Ll.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractC1406ef.Q(arrayList2, ((C3157wf0) it.next()).k);
                        }
                        List listX0 = AbstractC0911Ye.x0(AbstractC0911Ye.B0(arrayList2));
                        int size = listX0.size();
                        for (int i = 0; i < size; i++) {
                            ((AbstractC3060vf0) listX0.get(i)).d(e7, c0581Ll.a);
                        }
                    }
                    Iterator it2 = c3289xx.m.iterator();
                    while (it2.hasNext()) {
                        ((C0515Ix) it2.next()).getClass();
                    }
                }
                break;
            default:
                super.c(e7);
                break;
        }
    }

    @Override // o.WV
    public void d(E7 e7) {
        switch (this.d) {
            case 1:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                C3289xx c3289xx = (C3289xx) this.e;
                if (zIsLoggable) {
                    Objects.toString(c3289xx);
                }
                c3289xx.w();
                c3289xx.getClass();
                c3289xx.x(new C3095vx(c3289xx), false);
                break;
            default:
                super.d(e7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0781Te(int i, Object obj, boolean z) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
