package o;

import android.content.Context;
import android.os.SystemClock;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.zc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3442zc0 extends Ph0 implements InterfaceC0775Sy {
    public Object m;
    public YS n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f1158o;
    public long p;
    public boolean q;
    public boolean r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3442zc0(boolean z, boolean z2, Context context, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.u = z;
        this.v = z2;
        this.w = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object w(String str, String str2, Context context, InterfaceC1608gi interfaceC1608gi, OV ov, InterfaceC0473Hh interfaceC0473Hh) {
        C3345yc0 c3345yc0;
        Object objK;
        if (interfaceC0473Hh instanceof C3345yc0) {
            c3345yc0 = (C3345yc0) interfaceC0473Hh;
            int i = c3345yc0.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3345yc0.m = i - Integer.MIN_VALUE;
            } else {
                c3345yc0 = new C3345yc0(interfaceC0473Hh);
            }
        } else {
            c3345yc0 = new C3345yc0(interfaceC0473Hh);
        }
        Object objC = c3345yc0.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3345yc0.m;
        if (i2 == 0) {
            Jp0.O(objC);
            String strN = BlindajeCrypto.a.n();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("usuario", str);
            jSONObject.put("contrasena", str2);
            jSONObject.put("kx", strN);
            jSONObject.put("check_only", false);
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
            A50 a50C = ov.c(c0560Kq.c());
            c3345yc0.getClass();
            c3345yc0.m = 1;
            objC = Jp0.c(a50C, Long.MAX_VALUE, c3345yc0);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objC);
        }
        Wg0 wg0 = (Wg0) objC;
        boolean zContains = Lc0.T(new Integer(403), new Integer(407), new Integer(408), new Integer(451)).contains(new Integer(wg0.a));
        int i3 = wg0.a;
        if (zContains || i3 >= 500) {
            throw new IOException(AbstractC1674hK.p("Transporte de sesión bloqueado (HTTP ", i3, ")"));
        }
        String str3 = wg0.b;
        JSONObject jSONObject2 = null;
        if (!(!AbstractC1899jh0.O(str3))) {
            str3 = null;
        }
        if (str3 != null) {
            try {
                objK = new JSONObject(str3);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            jSONObject2 = (JSONObject) (objK instanceof C2439p80 ? null : objK);
        }
        if (jSONObject2 == null || !(i3 == 429 || jSONObject2.has("success"))) {
            throw new IOException("El transporte no devolvió JSON de sesión válido");
        }
        return objC;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3442zc0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3442zc0 c3442zc0 = new C3442zc0(this.u, this.v, this.w, interfaceC0473Hh);
        c3442zc0.t = obj;
        return c3442zc0;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019a A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01a8 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d4 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0202 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0215 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0223 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0021, B:71:0x0190, B:72:0x0192, B:74:0x019a, B:76:0x01a8, B:78:0x01cb, B:80:0x01d4, B:82:0x01e7, B:85:0x0202, B:86:0x020c, B:87:0x020d, B:88:0x0214, B:89:0x0215, B:90:0x0222, B:91:0x0223, B:92:0x022a, B:16:0x003e, B:65:0x016a, B:19:0x0050, B:57:0x011b), top: B:97:0x000d }] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        long j;
        boolean z;
        Context context;
        C2570qc0 c2570qc0;
        YS ys;
        InterfaceC1608gi interfaceC1608gi;
        boolean z2;
        long j2;
        long j3;
        Object objW;
        VS vs;
        Context context2;
        Object objC;
        Object objW2;
        Wg0 wg0;
        String str;
        JSONObject jSONObject;
        String strOptString;
        String strOptString2;
        String strOptString3;
        int iOptInt;
        BlindajeCrypto blindajeCrypto;
        long jH;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.s;
        boolean z3 = true;
        try {
            try {
                if (i == 0) {
                    Jp0.O(obj);
                    InterfaceC1608gi interfaceC1608gi2 = (InterfaceC1608gi) this.t;
                    j = Ec0.f.get();
                    C2570qc0 c2570qc1 = Ec0.d;
                    if (!this.u && c2570qc1 != null && SystemClock.elapsedRealtime() < c2570qc1.b - 30000) {
                        return c2570qc1;
                    }
                    YS ys2 = Ec0.g;
                    z = this.u;
                    boolean z4 = this.v;
                    context = this.w;
                    this.t = interfaceC1608gi2;
                    this.m = c2570qc1;
                    this.n = ys2;
                    this.f1158o = context;
                    this.p = j;
                    this.q = z;
                    this.r = z4;
                    this.s = 1;
                    if (ys2.d(null, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2570qc0 = c2570qc1;
                    ys = ys2;
                    interfaceC1608gi = interfaceC1608gi2;
                    z2 = z4;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            long j4 = this.p;
                            context2 = (Context) this.m;
                            vs = (VS) this.t;
                            Jp0.O(obj);
                            j3 = j4;
                            objW2 = obj;
                            wg0 = (Wg0) objW2;
                            str = wg0.b;
                            if (!AbstractC1899jh0.O(str)) {
                                throw new IllegalStateException("Respuesta de login vacia");
                            }
                            jSONObject = new JSONObject(str);
                            if (jSONObject.optBoolean("success", false)) {
                                throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                            }
                            strOptString = jSONObject.optString("session_token");
                            strOptString2 = jSONObject.optString("device_token");
                            strOptString3 = jSONObject.optString("skx");
                            iOptInt = jSONObject.optInt("session_expires_in", 600);
                            AbstractC1474fG.g(strOptString);
                            if (!AbstractC1899jh0.O(strOptString)) {
                                AbstractC1474fG.g(strOptString3);
                                if (!AbstractC1899jh0.O(strOptString3)) {
                                    blindajeCrypto = BlindajeCrypto.a;
                                    AbstractC1474fG.g(strOptString2);
                                    jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                                    if (Ec0.f.get() == j3) {
                                        blindajeCrypto.b();
                                        throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                                    }
                                    C2570qc0 c2570qc2 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                                    Ec0.d = c2570qc2;
                                    Ec0.j(context2);
                                    ((YS) vs).e(null);
                                    return c2570qc2;
                                }
                            }
                            throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
                        }
                        if (i == 3) {
                            long j5 = this.p;
                            context2 = (Context) this.m;
                            vs = (VS) this.t;
                            Jp0.O(obj);
                            j3 = j5;
                            objC = obj;
                            wg0 = (Wg0) objC;
                            str = wg0.b;
                            if (!AbstractC1899jh0.O(str)) {
                                throw new IllegalStateException("Respuesta de login vacia");
                            }
                            jSONObject = new JSONObject(str);
                            if (jSONObject.optBoolean("success", false)) {
                                throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                            }
                            strOptString = jSONObject.optString("session_token");
                            strOptString2 = jSONObject.optString("device_token");
                            strOptString3 = jSONObject.optString("skx");
                            iOptInt = jSONObject.optInt("session_expires_in", 600);
                            AbstractC1474fG.g(strOptString);
                            if (!AbstractC1899jh0.O(strOptString)) {
                                AbstractC1474fG.g(strOptString3);
                                if (!AbstractC1899jh0.O(strOptString3)) {
                                    blindajeCrypto = BlindajeCrypto.a;
                                    AbstractC1474fG.g(strOptString2);
                                    jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                                    if (Ec0.f.get() == j3) {
                                        blindajeCrypto.b();
                                        throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                                    }
                                    C2570qc0 c2570qc3 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                                    Ec0.d = c2570qc3;
                                    Ec0.j(context2);
                                    ((YS) vs).e(null);
                                    return c2570qc3;
                                }
                            }
                            throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j6 = this.p;
                        context2 = (Context) this.m;
                        vs = (VS) this.t;
                        Jp0.O(obj);
                        j3 = j6;
                        objW = obj;
                        wg0 = (Wg0) objW;
                        str = wg0.b;
                        if (!AbstractC1899jh0.O(str)) {
                            throw new IllegalStateException("Respuesta de login vacia");
                        }
                        jSONObject = new JSONObject(str);
                        if (jSONObject.optBoolean("success", false)) {
                            throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                        }
                        strOptString = jSONObject.optString("session_token");
                        strOptString2 = jSONObject.optString("device_token");
                        strOptString3 = jSONObject.optString("skx");
                        iOptInt = jSONObject.optInt("session_expires_in", 600);
                        AbstractC1474fG.g(strOptString);
                        if (!AbstractC1899jh0.O(strOptString)) {
                            AbstractC1474fG.g(strOptString3);
                            if (!AbstractC1899jh0.O(strOptString3)) {
                                blindajeCrypto = BlindajeCrypto.a;
                                AbstractC1474fG.g(strOptString2);
                                jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                                if (Ec0.f.get() == j3) {
                                    blindajeCrypto.b();
                                    throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                                }
                                C2570qc0 c2570qc4 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                                Ec0.d = c2570qc4;
                                Ec0.j(context2);
                                ((YS) vs).e(null);
                                return c2570qc4;
                            }
                        }
                        throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
                    }
                    z2 = this.r;
                    boolean z5 = this.q;
                    long j7 = this.p;
                    context = this.f1158o;
                    YS ys3 = this.n;
                    C2570qc0 c2570qc5 = (C2570qc0) this.m;
                    InterfaceC1608gi interfaceC1608gi3 = (InterfaceC1608gi) this.t;
                    Jp0.O(obj);
                    interfaceC1608gi = interfaceC1608gi3;
                    c2570qc0 = c2570qc5;
                    z = z5;
                    j = j7;
                    ys = ys3;
                }
                C2570qc0 c2570qc6 = Ec0.d;
                if (!z || c2570qc6 == c2570qc0) {
                    z3 = false;
                }
                if (c2570qc6 != null) {
                    j2 = j;
                    if (SystemClock.elapsedRealtime() < c2570qc6.b - 30000 && (!z || z3)) {
                        ys.e(null);
                        return c2570qc6;
                    }
                } else {
                    j2 = j;
                }
                Ec0 ec0 = Ec0.a;
                C1101bX c1101bXD = Ec0.d();
                if (c1101bXD == null) {
                    throw new IllegalStateException("La contraseña no se conserva en el dispositivo. Inicia sesión nuevamente");
                }
                String str2 = (String) c1101bXD.l;
                String str3 = (String) c1101bXD.m;
                C3084vr0 c3084vr0 = C3084vr0.a;
                if (C3084vr0.s()) {
                    C1791ib0 c1791ib0 = C1791ib0.a;
                    OV ovE = C1791ib0.e();
                    this.t = ys;
                    this.m = context;
                    this.n = null;
                    this.f1158o = null;
                    j3 = j2;
                    this.p = j3;
                    this.s = 2;
                    objW2 = w(str2, str3, context, interfaceC1608gi, ovE, this);
                    if (objW2 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    vs = ys;
                    context2 = context;
                    wg0 = (Wg0) objW2;
                    str = wg0.b;
                    if (!AbstractC1899jh0.O(str)) {
                        throw new IllegalStateException("Respuesta de login vacia");
                    }
                    jSONObject = new JSONObject(str);
                    if (jSONObject.optBoolean("success", false)) {
                        throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                    }
                    strOptString = jSONObject.optString("session_token");
                    strOptString2 = jSONObject.optString("device_token");
                    strOptString3 = jSONObject.optString("skx");
                    iOptInt = jSONObject.optInt("session_expires_in", 600);
                    AbstractC1474fG.g(strOptString);
                    if (!AbstractC1899jh0.O(strOptString)) {
                        AbstractC1474fG.g(strOptString3);
                        if (!AbstractC1899jh0.O(strOptString3)) {
                            blindajeCrypto = BlindajeCrypto.a;
                            AbstractC1474fG.g(strOptString2);
                            jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                            if (Ec0.f.get() == j3) {
                                blindajeCrypto.b();
                                throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                            }
                            C2570qc0 c2570qc7 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                            Ec0.d = c2570qc7;
                            Ec0.j(context2);
                            ((YS) vs).e(null);
                            return c2570qc7;
                        }
                    }
                    throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
                }
                j3 = j2;
                if (!z2) {
                    C1791ib0 c1791ib1 = C1791ib0.a;
                    OV ovE2 = C1791ib0.e();
                    this.t = ys;
                    this.m = context;
                    this.n = null;
                    this.f1158o = null;
                    this.p = j3;
                    this.s = 4;
                    objW = w(str2, str3, context, interfaceC1608gi, ovE2, this);
                    if (objW == enumC1706hi) {
                        return enumC1706hi;
                    }
                    vs = ys;
                    context2 = context;
                    wg0 = (Wg0) objW;
                    str = wg0.b;
                    if (!AbstractC1899jh0.O(str)) {
                        throw new IllegalStateException("Respuesta de login vacia");
                    }
                    jSONObject = new JSONObject(str);
                    if (jSONObject.optBoolean("success", false)) {
                        throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                    }
                    strOptString = jSONObject.optString("session_token");
                    strOptString2 = jSONObject.optString("device_token");
                    strOptString3 = jSONObject.optString("skx");
                    iOptInt = jSONObject.optInt("session_expires_in", 600);
                    AbstractC1474fG.g(strOptString);
                    if (!AbstractC1899jh0.O(strOptString)) {
                        AbstractC1474fG.g(strOptString3);
                        if (!AbstractC1899jh0.O(strOptString3)) {
                            blindajeCrypto = BlindajeCrypto.a;
                            AbstractC1474fG.g(strOptString2);
                            jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                            if (Ec0.f.get() == j3) {
                                blindajeCrypto.b();
                                throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                            }
                            C2570qc0 c2570qc8 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                            Ec0.d = c2570qc8;
                            Ec0.j(context2);
                            ((YS) vs).e(null);
                            return c2570qc8;
                        }
                    }
                    throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
                }
                C0856Wb c0856Wb = C0856Wb.a;
                C3248xc0 c3248xc0 = new C3248xc0(str2, str3, context, interfaceC1608gi, null, 0);
                C3248xc0 c3248xc1 = new C3248xc0(str2, str3, context, interfaceC1608gi, null, 1);
                this.t = ys;
                this.m = context;
                this.n = null;
                this.f1158o = null;
                this.p = j3;
                this.s = 3;
                objC = c0856Wb.c("sesión de catálogo", true, c3248xc0, c3248xc1, this);
                if (objC == enumC1706hi) {
                    return enumC1706hi;
                }
                vs = ys;
                context2 = context;
                wg0 = (Wg0) objC;
                str = wg0.b;
                if (!AbstractC1899jh0.O(str)) {
                    throw new IllegalStateException("Respuesta de login vacia");
                }
                jSONObject = new JSONObject(str);
                if (jSONObject.optBoolean("success", false)) {
                    throw new IllegalStateException(jSONObject.optString("message", "Login rechazado"));
                }
                strOptString = jSONObject.optString("session_token");
                strOptString2 = jSONObject.optString("device_token");
                strOptString3 = jSONObject.optString("skx");
                iOptInt = jSONObject.optInt("session_expires_in", 600);
                AbstractC1474fG.g(strOptString);
                if (!AbstractC1899jh0.O(strOptString)) {
                    AbstractC1474fG.g(strOptString3);
                    if (!AbstractC1899jh0.O(strOptString3)) {
                        blindajeCrypto = BlindajeCrypto.a;
                        AbstractC1474fG.g(strOptString2);
                        jH = blindajeCrypto.h(strOptString3, strOptString, strOptString2);
                        if (Ec0.f.get() == j3) {
                            blindajeCrypto.b();
                            throw new IllegalStateException("La sesión fue cerrada durante la autorización");
                        }
                        C2570qc0 c2570qc9 = new C2570qc0(jH, (((long) iOptInt) * 1000) + SystemClock.elapsedRealtime());
                        Ec0.d = c2570qc9;
                        Ec0.j(context2);
                        ((YS) vs).e(null);
                        return c2570qc9;
                    }
                }
                throw new IllegalStateException("El servidor no devolvio sesion (token/skx)");
            } catch (Throwable th) {
                th = th;
                YS ys4 = ys;
                ys4.e(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
