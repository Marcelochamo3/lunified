package o;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Ev0 extends Ph0 implements InterfaceC0775Sy {
    public Context m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f251o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ Hv0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ev0(String str, Map map, InterfaceC0473Hh interfaceC0473Hh, Hv0 hv0) {
        super(2, interfaceC0473Hh);
        this.f251o = str;
        this.p = map;
        this.q = hv0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ev0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ev0(this.f251o, this.p, interfaceC0473Hh, this.q);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Context context;
        Object objJ;
        Object objJ2;
        Js0 js0;
        Object objI;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        String str = "Tiempo de espera agotado";
        Hv0 hv0 = this.q;
        Map map = this.p;
        String str2 = this.f251o;
        try {
            if (i != 0) {
                if (i == 1) {
                    context = this.m;
                    Jp0.O(obj);
                    objJ = obj;
                } else if (i == 2) {
                    context = this.m;
                    Jp0.O(obj);
                    objJ2 = obj;
                    js0 = (Js0) objJ2;
                    if (js0 != null) {
                        System.out.getClass();
                        return js0;
                    }
                    Context context2 = Hv0.b;
                    hv0.getClass();
                    Context contextO = AbstractC1376eG.o(context);
                    System.out.getClass();
                    Dv0 dv0 = new Dv0(contextO, str2, map, null);
                    this.m = null;
                    this.n = 3;
                    objI = Nr0.I(90000L, dv0, this);
                    if (objI == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                    objI = obj;
                }
                return (Js0) objI;
            }
            Jp0.O(obj);
            Uri uri = Uri.parse(str2);
            AbstractC1474fG.i(uri, "parse(...)");
            if (!AbstractC1370eA.z(uri)) {
                throw new IOException("URL Web insegura o inválida");
            }
            System.out.getClass();
            Context context3 = Hv0.b;
            C3325yL.y(str2);
            if (!map.isEmpty()) {
                AbstractC0911Ye.h0(map.entrySet(), ",", null, null, Iu0.s, 30);
            }
            context = Hv0.b;
            if (context == null) {
                throw new Exception("WebViewExtractor not initialized. Call WebViewExtractor.init(context) first.");
            }
            this.m = context;
            this.n = 1;
            hv0.getClass();
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new Fv0(str2, map, null), this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            Js0 js1 = (Js0) objJ;
            if (js1 != null) {
                System.out.getClass();
                return js1;
            }
            this.m = context;
            this.n = 2;
            Context context4 = Hv0.b;
            hv0.getClass();
            objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new Gv0(str2, map, null, hv0), this);
            if (objJ2 == enumC1706hi) {
                return enumC1706hi;
            }
            js0 = (Js0) objJ2;
            if (js0 != null) {
                System.out.getClass();
                return js0;
            }
            Context context5 = Hv0.b;
            hv0.getClass();
            Context contextO2 = AbstractC1376eG.o(context);
            System.out.getClass();
            Dv0 dv1 = new Dv0(contextO2, str2, map, null);
            this.m = null;
            this.n = 3;
            objI = Nr0.I(90000L, dv1, this);
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
            return (Js0) objI;
        } catch (Ij0 e) {
            throw new Exception("Tiempo de espera agotado", e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            System.out.getClass();
            e3.getMessage();
            String message = e3.getMessage();
            if (message == null || !AbstractC1119bh0.W(message, "timeout", true)) {
                String message2 = e3.getMessage();
                if (message2 == null || !AbstractC1119bh0.W(message2, "not found", true)) {
                    String message3 = e3.getMessage();
                    str = (message3 == null || !AbstractC1119bh0.W(message3, "network", true)) ? "No se pudo extraer el video" : "Error de red";
                } else {
                    str = "No se encontró el video";
                }
            }
            throw new Exception(str);
        }
    }
}
