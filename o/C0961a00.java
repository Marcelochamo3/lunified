package o;

import android.app.AlertDialog;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: renamed from: o.a00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0961a00 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ AlertDialog n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerMobileFragment f668o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0961a00(AlertDialog alertDialog, PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = alertDialog;
        this.f668o = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0961a00) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0961a00(this.n, this.f668o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        int i;
        int i2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        int i4 = 1;
        if (i3 == 0) {
            Jp0.O(obj);
            int i5 = AbstractC0947Zo.n;
            long jG = Nr0.G(50000, EnumC1231cp.MILLISECONDS);
            this.m = 1;
            if (jG < 0 || (i2 = ((int) jG) & 1) == 0) {
                if (jG < 0) {
                    i4 = -1;
                } else if (jG == 0) {
                    i4 = 0;
                }
                i = i4;
            } else {
                i = i2 - (1 & ((int) 0));
                if (jG < 0) {
                    i = -i;
                }
            }
            Object objQ = AbstractC1376eG.q(i > 0 ? U9.f(AbstractC0947Zo.a(jG), 1L) : 0L, this);
            if (objQ != enumC1706hi) {
                objQ = c2985uq0;
            }
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        AlertDialog alertDialog = this.n;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
            AbstractActivityC1540fx abstractActivityC1540fxH = this.f668o.h();
            if (abstractActivityC1540fxH != null) {
                abstractActivityC1540fxH.finish();
            }
        }
        return c2985uq0;
    }
}
