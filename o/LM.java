package o;

import android.content.Intent;
import android.widget.Toast;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.activities.main.MainMobileActivity;

/* JADX INFO: loaded from: classes.dex */
public final class LM extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ MainMobileActivity m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LM(MainMobileActivity mainMobileActivity, boolean z, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = mainMobileActivity;
        this.n = z;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        LM lm = (LM) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        lm.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new LM(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        String str = this.n ? "Sesión cerrada correctamente" : "Sesión cerrada localmente";
        MainMobileActivity mainMobileActivity = this.m;
        Toast.makeText(mainMobileActivity, str, 0).show();
        Ec0 ec0 = Ec0.a;
        Ec0.c(mainMobileActivity);
        Intent intent = new Intent(mainMobileActivity, (Class<?>) LoginActivity.class);
        intent.setFlags(268468224);
        mainMobileActivity.startActivity(intent);
        mainMobileActivity.finish();
        return C2985uq0.a;
    }
}
