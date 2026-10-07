package o;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class XL extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XL(LoginActivity loginActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = loginActivity;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((XL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new XL(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        LoginActivity loginActivity = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
                WL wl = new WL(loginActivity, null);
                this.m = 1;
                obj = AbstractC1376eG.J(executorC0891Xk, wl, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            loginActivity.Y = true;
            LoginActivity.A(loginActivity, (C1101bX) obj);
            loginActivity.H();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            loginActivity.Y = false;
            ProgressBar progressBar = loginActivity.M;
            if (progressBar == null) {
                AbstractC1474fG.U("progressBar");
                throw null;
            }
            progressBar.setVisibility(8);
            TextView textView = loginActivity.N;
            if (textView == null) {
                AbstractC1474fG.U("loadingText");
                throw null;
            }
            textView.setText(R.string.login_security_init_error);
            TextView textView2 = loginActivity.N;
            if (textView2 == null) {
                AbstractC1474fG.U("loadingText");
                throw null;
            }
            textView2.setVisibility(0);
            loginActivity.S = new ML(th);
            loginActivity.K(false);
        }
        return C2985uq0.a;
    }
}
