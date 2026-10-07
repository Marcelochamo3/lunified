package o;

import android.net.Uri;
import android.widget.Toast;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.R;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class RL extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1767iF f487o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RL(LoginActivity loginActivity, C1767iF c1767iF, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = loginActivity;
        this.f487o = c1767iF;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((RL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new RL(this.n, this.f487o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        LoginActivity loginActivity = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C2834tF c2834tF = C2834tF.a;
                C1767iF c1767iF = this.f487o;
                this.m = 1;
                obj = c2834tF.f(loginActivity, c1767iF, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            loginActivity.W = true;
            C2834tF c2834tF2 = C2834tF.a;
            Uri uriFromFile = Uri.fromFile((File) obj);
            AbstractC1474fG.i(uriFromFile, "fromFile(...)");
            C2834tF.j(loginActivity, uriFromFile);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            loginActivity.W = false;
            loginActivity.L(false);
            Toast.makeText(loginActivity, R.string.login_update_download_error, 1).show();
        }
        return C2985uq0.a;
    }
}
