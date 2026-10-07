package o;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.skidush.clonex.LoginActivity;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class QL extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ LoginActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f473o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QL(LoginActivity loginActivity, boolean z, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = loginActivity;
        this.f473o = z;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((QL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new QL(this.n, this.f473o, interfaceC0473Hh);
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
                this.m = 1;
                obj = c2834tF.i(this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            C1767iF c1767iF = (C1767iF) obj;
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
            textView.setVisibility(8);
            if (c1767iF == null) {
                loginActivity.S = NL.a;
                loginActivity.K(true);
                if (!this.f473o || !LoginActivity.B(loginActivity)) {
                    Button button = loginActivity.L;
                    if (button == null) {
                        AbstractC1474fG.U("loginButton");
                        throw null;
                    }
                    button.requestFocus();
                }
            } else {
                loginActivity.S = new OL(c1767iF);
                loginActivity.K(false);
                loginActivity.N(c1767iF);
            }
            return C2985uq0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ProgressBar progressBar2 = loginActivity.M;
            if (progressBar2 == null) {
                AbstractC1474fG.U("progressBar");
                throw null;
            }
            progressBar2.setVisibility(8);
            TextView textView2 = loginActivity.N;
            if (textView2 == null) {
                AbstractC1474fG.U("loadingText");
                throw null;
            }
            textView2.setVisibility(8);
            loginActivity.S = new ML(e2);
            loginActivity.K(false);
            loginActivity.O();
        }
    }
}
