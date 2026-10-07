package o;

import android.content.Intent;
import android.widget.Toast;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: loaded from: classes.dex */
public final class XM extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ MainTvActivity m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XM(MainTvActivity mainTvActivity, boolean z, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = mainTvActivity;
        this.n = z;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        XM xm = (XM) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        xm.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new XM(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        String str = this.n ? "Sesión cerrada correctamente" : "Sesión cerrada localmente";
        MainTvActivity mainTvActivity = this.m;
        Toast.makeText(mainTvActivity, str, 0).show();
        Ec0 ec0 = Ec0.a;
        Ec0.c(mainTvActivity);
        Intent intent = new Intent(mainTvActivity, (Class<?>) LoginActivity.class);
        intent.setFlags(268468224);
        mainTvActivity.startActivity(intent);
        mainTvActivity.finish();
        return C2985uq0.a;
    }
}
