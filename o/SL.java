package o;

import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import io.sentry.AbstractC0031b1;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class SL extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ LoginActivity m;
    public final /* synthetic */ JL n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f510o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SL(LoginActivity loginActivity, JL jl, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = loginActivity;
        this.n = jl;
        this.f510o = str;
        this.p = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        SL sl = (SL) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        sl.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new SL(this.m, this.n, this.f510o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Class cls;
        String strConcat;
        String strConcat2;
        Jp0.O(obj);
        LoginActivity loginActivity = this.m;
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
        JL jl = this.n;
        Throwable th = jl.c;
        String str = "";
        if (th != null) {
            if (th instanceof UnknownHostException) {
                strConcat = "No se pudo resolver el servidor. Prueba Google DNS desde el botón DNS.";
            } else if (th instanceof SocketTimeoutException) {
                strConcat = "La conexión tardó demasiado. Verifica tu señal e inténtalo de nuevo.";
            } else if (th instanceof SSLException) {
                strConcat = "El dispositivo tuvo un problema de compatibilidad SSL al conectarse.";
            } else {
                String message = th.getMessage();
                if (message != null && (strConcat2 = ": ".concat(message)) != null) {
                    str = strConcat2;
                }
                strConcat = "No se pudo conectar con el servidor".concat(str);
            }
            Toast.makeText(loginActivity.getApplicationContext(), strConcat, 1).show();
            AbstractC0031b1.a(jl.c);
        } else {
            String str2 = jl.a;
            if (str2 != null) {
                String str3 = this.f510o;
                String str4 = this.p;
                boolean zO = AbstractC1899jh0.O(str2);
                int i = jl.b;
                if (zO) {
                    Toast.makeText(loginActivity.getApplicationContext(), AbstractC1674hK.p("El servidor devolvió una respuesta vacía (HTTP ", i, ")"), 0).show();
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        KL klJ = LoginActivity.J(jSONObject);
                        if (!klJ.a || AbstractC1474fG.b(klJ.e, Boolean.FALSE) || klJ.f || AbstractC1474fG.b(klJ.c, "inactive")) {
                            Toast.makeText(loginActivity.getApplicationContext(), LoginActivity.G(klJ, i), 0).show();
                        } else if (AbstractC1474fG.b(loginActivity.S, NL.a)) {
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user");
                            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("vencimiento") : null;
                            if (strOptString != null) {
                                str = strOptString;
                            }
                            if (!Ec0.l(loginActivity, str3, str4, str)) {
                                throw new IllegalStateException("No se pudo guardar la sesión en el dispositivo");
                            }
                            EditText editText = loginActivity.K;
                            if (editText == null) {
                                AbstractC1474fG.U("passwordEditText");
                                throw null;
                            }
                            Editable text = editText.getText();
                            if (text != null) {
                                text.clear();
                            }
                            Toast.makeText(loginActivity.getApplicationContext(), AbstractC1899jh0.O(str) ^ true ? "Login exitoso. Vencimiento: ".concat(str) : "Login exitoso", 1).show();
                            int iOrdinal = zy0.B(loginActivity).ordinal();
                            if (iOrdinal == 0) {
                                cls = MainMobileActivity.class;
                            } else {
                                if (iOrdinal != 1) {
                                    throw new C0730Rf();
                                }
                                cls = MainTvActivity.class;
                            }
                            loginActivity.startActivity(new Intent(loginActivity, (Class<?>) cls));
                            loginActivity.finish();
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        AbstractC0031b1.a(e);
                        Toast.makeText(loginActivity.getApplicationContext(), "Respuesta inválida del servidor (HTTP " + i + ")", 0).show();
                    }
                }
            } else {
                Toast.makeText(loginActivity.getApplicationContext(), "Error al iniciar sesión", 0).show();
            }
        }
        return C2985uq0.a;
    }
}
