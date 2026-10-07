package o;

import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Cc0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f199o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc0(Context context, boolean z, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f199o = context;
        this.p = z;
    }

    public static final C2763sc0 w(String str, String str2, Context context, OV ov) throws Exception {
        C2763sc0 c2763sc0;
        Object objK;
        Ec0 ec0 = Ec0.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("usuario", str);
        jSONObject.put("contrasena", str2);
        jSONObject.put("check_only", true);
        Rh0 rh0 = C2879tm.a;
        for (Map.Entry entry : C2879tm.c().entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("device_label", AbstractC1474fG.q(context));
        jSONObject.put("install_id", AbstractC1474fG.D(context));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(C1263d5.a);
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json")));
        JSONObject jSONObject2 = null;
        jSONObject2 = null;
        try {
            C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
            try {
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                c2763sc0 = new C2763sc0(abstractC2051l80 != null ? abstractC2051l80.q() : null, c1855j80G.f840o, null, c1855j80G.f("Set-Cookie", null), 4);
                AbstractC3409z9.g(c1855j80G, null);
                Throwable th = c2763sc0.c;
                if (th != null) {
                    Exception exc = th instanceof Exception ? (Exception) th : null;
                    if (exc != null) {
                        throw exc;
                    }
                    throw new IOException("Fallo de transporte al validar sesión", th);
                }
                Set setT = Lc0.T(403, 407, 408, 451);
                int i = c2763sc0.b;
                if (setT.contains(Integer.valueOf(i)) || i >= 500) {
                    throw new IOException(AbstractC1674hK.p("Transporte de validación bloqueado (HTTP ", i, ")"));
                }
                String str3 = c2763sc0.a;
                if (str3 != null) {
                    if (!(true ^ AbstractC1899jh0.O(str3))) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        try {
                            objK = new JSONObject(str3);
                        } catch (Throwable th2) {
                            objK = Jp0.k(th2);
                        }
                        jSONObject2 = (JSONObject) (objK instanceof C2439p80 ? null : objK);
                    }
                }
                if (jSONObject2 == null || !(i == 429 || jSONObject2.has("success"))) {
                    throw new IOException("El transporte no devolvió JSON de validación válido");
                }
                return c2763sc0;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3409z9.g(c1855j80G, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            e.getMessage();
            c2763sc0 = new C2763sc0(null, -1, e, null, 8);
        }
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Cc0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Cc0 cc0 = new Cc0(this.f199o, this.p, interfaceC0473Hh);
        cc0.n = obj;
        return cc0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String strConcat;
        String strConcat2;
        Object objC;
        C2763sc0 c2763sc0W;
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2860tc0 c2860tc0 = C2860tc0.a;
        try {
            if (i == 0) {
                Jp0.O(obj);
                InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
                Ec0 ec0 = Ec0.a;
                Ec0.h(this.f199o);
                Ec0.m(this.f199o);
                C1101bX c1101bXD = Ec0.d();
                if (c1101bXD == null) {
                    return new C3054vc0("Tu sesion ya no esta disponible. Inicia sesion nuevamente.");
                }
                if (!this.p) {
                    Context context = this.f199o;
                    AbstractC1474fG.j(context, "context");
                    Ec0.h(context).edit().remove("last_session_validation_at").apply();
                    long j = Ec0.e;
                    if (j > 0 && SystemClock.elapsedRealtime() - j < 600000) {
                        return c2860tc0;
                    }
                }
                String str2 = (String) c1101bXD.l;
                String str3 = (String) c1101bXD.m;
                C3084vr0 c3084vr0 = C3084vr0.a;
                if (C3084vr0.s()) {
                    Context context2 = this.f199o;
                    C1791ib0 c1791ib0 = C1791ib0.a;
                    c2763sc0W = w(str2, str3, context2, C1791ib0.e());
                } else {
                    C0856Wb c0856Wb = C0856Wb.a;
                    Bc0 bc0 = new Bc0(str2, str3, this.f199o, interfaceC1608gi, null, 0);
                    Bc0 bc1 = new Bc0(str2, str3, this.f199o, interfaceC1608gi, null, 1);
                    this.m = 1;
                    objC = c0856Wb.c("validación de sesión", true, bc0, bc1, this);
                    if (objC == enumC1706hi) {
                        return enumC1706hi;
                    }
                }
                str = c2763sc0W.a;
                if (str != null || AbstractC1899jh0.O(str)) {
                    return new C2957uc0(AbstractC1674hK.p("El servidor devolvio una respuesta vacia (HTTP ", c2763sc0W.b, ")"), null);
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Ec0 ec1 = Ec0.a;
                    C2666rc0 c2666rc0A = Ec0.a(jSONObject);
                    if (c2666rc0A.a && !AbstractC1474fG.b(c2666rc0A.e, Boolean.FALSE) && !c2666rc0A.f && !AbstractC1474fG.b(c2666rc0A.c, "inactive")) {
                        if (c2763sc0W.d != null) {
                            Context context3 = this.f199o;
                            AbstractC1474fG.j(context3, "context");
                            Ec0.h(context3).edit().remove("session_cookie").apply();
                        }
                        Ec0.j(this.f199o);
                        return c2860tc0;
                    }
                    if (!c2666rc0A.f && !AbstractC1474fG.b(c2666rc0A.e, Boolean.FALSE) && !Lc0.T("inactive", "expired", "blocked").contains(c2666rc0A.c) && !Lc0.T("ACCOUNT_EXPIRED", "DEVICE_LIMIT_REACHED", "DEVICE_NOT_AUTHORIZED").contains(c2666rc0A.d)) {
                        String str4 = c2666rc0A.b;
                        if (AbstractC1899jh0.O(str4)) {
                            str4 = "No se pudo validar la sesion (HTTP " + c2763sc0W.b + ")";
                        }
                        return new C2957uc0(str4, null);
                    }
                    String str5 = c2666rc0A.b;
                    if (AbstractC1899jh0.O(str5)) {
                        str5 = "Tu cuenta ya no esta activa. Se cerro la sesion.";
                    }
                    return new C3054vc0(str5);
                } catch (Exception e) {
                    return new C2957uc0(AbstractC1674hK.p("Respuesta invalida del servidor (HTTP ", c2763sc0W.b, ")"), e);
                }
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            objC = obj;
            c2763sc0W = (C2763sc0) objC;
            str = c2763sc0W.a;
            if (str != null) {
            }
            return new C2957uc0(AbstractC1674hK.p("El servidor devolvio una respuesta vacia (HTTP ", c2763sc0W.b, ")"), null);
        } catch (Exception e2) {
            Ec0 ec2 = Ec0.a;
            if (e2 instanceof UnknownHostException) {
                strConcat2 = "No se pudo resolver el servidor para validar la sesion.";
            } else if (e2 instanceof SocketTimeoutException) {
                strConcat2 = "La validacion de sesion demoro demasiado.";
            } else if (e2 instanceof SSLException) {
                strConcat2 = "El dispositivo tuvo un problema SSL al validar la sesion.";
            } else {
                String message = e2.getMessage();
                if (message == null || (strConcat = ": ".concat(message)) == null) {
                    strConcat = "";
                }
                strConcat2 = "No se pudo validar la sesion".concat(strConcat);
            }
            return new C2957uc0(strConcat2, e2);
        }
    }
}
