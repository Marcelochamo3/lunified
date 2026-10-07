package o;

import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.i10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1745i10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745i10(PlayerTvFragment playerTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1745i10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1745i10(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        PlayerTvFragment playerTvFragment = this.n;
        if (i == 0) {
            Jp0.O(obj);
            Z10 z10N0 = playerTvFragment.n0();
            this.m = 1;
            obj = AbstractC1376eG.J(AbstractC1910jn.b, new S10(z10N0, null), this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        C1387eR c1387eR = (C1387eR) obj;
        if (c1387eR != null) {
            playerTvFragment.w0(c1387eR);
        } else {
            Toast.makeText(playerTvFragment.Q(), "Canal anterior no encontrado", 0).show();
        }
        return C2985uq0.a;
    }
}
