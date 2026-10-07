package o;

import android.app.AlertDialog;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.v10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3006v10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ AlertDialog n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerTvFragment f1066o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3006v10(AlertDialog alertDialog, PlayerTvFragment playerTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = alertDialog;
        this.f1066o = playerTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3006v10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3006v10(this.n, this.f1066o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            if (AbstractC1376eG.q(50000L, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        AlertDialog alertDialog = this.n;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
            AbstractActivityC1540fx abstractActivityC1540fxH = this.f1066o.h();
            if (abstractActivityC1540fxH != null) {
                abstractActivityC1540fxH.finish();
            }
        }
        return C2985uq0.a;
    }
}
