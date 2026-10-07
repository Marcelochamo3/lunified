package o;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ec0 {
    public static volatile C2473pc0 c;
    public static volatile C2570qc0 d;
    public static volatile long e;
    public static final Ec0 a = new Ec0();
    public static final Object b = new Object();
    public static final AtomicLong f = new AtomicLong(0);
    public static final YS g = AbstractC1923jt0.a();
    public static final YS h = AbstractC1923jt0.a();

    public static final C2666rc0 a(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("success", false);
        String strOptString = jSONObject.optString("message");
        String str = strOptString == null ? "" : strOptString;
        String strOptString2 = jSONObject.optString("session_status");
        if (strOptString2 == null) {
            strOptString2 = "";
        }
        String lowerCase = strOptString2.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String strOptString3 = jSONObject.optString("reason_code");
        String str2 = strOptString3 == null ? "" : strOptString3;
        Object objOpt = jSONObject.opt("account_active");
        Boolean boolValueOf = null;
        if (objOpt != null) {
            if (objOpt instanceof Boolean) {
                boolValueOf = (Boolean) objOpt;
            } else {
                if (objOpt instanceof String) {
                    boolValueOf = Boolean.valueOf(AbstractC1899jh0.N((String) objOpt, "true", true));
                } else if (objOpt instanceof Number) {
                    boolValueOf = Boolean.valueOf(((Number) objOpt).intValue() != 0);
                }
            }
        }
        return new C2666rc0(zOptBoolean, str, lowerCase, str2, boolValueOf, jSONObject.optBoolean("force_logout", false));
    }

    public static void b() {
        Object objK;
        char[] cArr;
        f.incrementAndGet();
        d = null;
        e = 0L;
        BlindajeCrypto.a.b();
        synchronized (b) {
            C2473pc0 c2473pc0 = c;
            if (c2473pc0 != null && (cArr = c2473pc0.b) != null) {
                Arrays.fill(cArr, 0, cArr.length, (char) 0);
            }
            c = null;
        }
        try {
            Lx0.b.y();
            objK = C2985uq0.a;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2536q80.a(objK);
    }

    public static void c(Activity activity) {
        Object objK;
        AbstractC1474fG.j(activity, "context");
        b();
        e = 0L;
        h(activity).edit().remove("email").remove("password").remove("session_cookie").remove("last_session_validation_at").apply();
        try {
            SharedPreferencesEditorC3031vI sharedPreferencesEditorC3031vI = new SharedPreferencesEditorC3031vI(AbstractC1370eA.H(activity, "session_credentials_secure_v1", "session_credentials_legacy_v1"));
            sharedPreferencesEditorC3031vI.remove("email");
            sharedPreferencesEditorC3031vI.remove("password");
            objK = Boolean.valueOf(sharedPreferencesEditorC3031vI.commit());
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2536q80.a(objK);
        new Handler(Looper.getMainLooper()).post(new L3(activity, 3));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    public static C1101bX d() {
        C1101bX c1101bX;
        synchronized (b) {
            try {
                C2473pc0 c2473pc0 = c;
                c1101bX = null;
                if (c2473pc0 != null) {
                    if (!AbstractC1899jh0.O(c2473pc0.a)) {
                        if (!(!(c2473pc0.b.length == 0))) {
                            c2473pc0 = null;
                        }
                    } else {
                        c2473pc0 = null;
                    }
                    if (c2473pc0 != null) {
                        c1101bX = new C1101bX(c2473pc0.a, new String(c2473pc0.b));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1101bX;
    }

    public static C2570qc0 e() {
        C2570qc0 c2570qc0 = d;
        if (c2570qc0 != null && SystemClock.elapsedRealtime() < c2570qc0.b - 5000) {
            return c2570qc0;
        }
        return null;
    }

    public static Object f(Context context, boolean z, boolean z2, InterfaceC0473Hh interfaceC0473Hh, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return AbstractC1376eG.J(AbstractC1910jn.b, new C3442zc0(z, z2, context, null), interfaceC0473Hh);
    }

    public static void g(AbstractActivityC1540fx abstractActivityC1540fx, String str) {
        AbstractC1474fG.j(abstractActivityC1540fx, "activity");
        Context applicationContext = abstractActivityC1540fx.getApplicationContext();
        C1101bX c1101bXD = d();
        if (c1101bXD != null) {
            AbstractC1376eG.w(zy0.c(AbstractC1910jn.b), null, 0, new Ac0(applicationContext, c1101bXD, null), 3);
        }
        abstractActivityC1540fx.runOnUiThread(new O3(abstractActivityC1540fx, 16, str));
    }

    public static SharedPreferences h(Context context) {
        Object objK;
        AbstractC1474fG.j(context, "context");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("Pypref", 0);
        if (sharedPreferences.contains("password") || sharedPreferences.contains("session_cookie")) {
            String string = sharedPreferences.getString("email", null);
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = sharedPreferences.getString("password", null);
            if (string2 == null) {
                string2 = "";
            }
            if (!AbstractC1899jh0.O(string) && string2.length() != 0) {
                try {
                    SharedPreferencesC3128wI sharedPreferencesC3128wIH = AbstractC1370eA.H(context, "session_credentials_secure_v1", "session_credentials_legacy_v1");
                    String string3 = sharedPreferencesC3128wIH.getString("email", null);
                    if (string3 == null) {
                        string3 = "";
                    }
                    String string4 = sharedPreferencesC3128wIH.getString("password", null);
                    if (string4 != null) {
                        str = string4;
                    }
                    boolean zO = AbstractC1899jh0.O(string3);
                    boolean zCommit = true;
                    if (!(!zO) || str.length() <= 0) {
                        SharedPreferencesEditorC3031vI sharedPreferencesEditorC3031vI = new SharedPreferencesEditorC3031vI(sharedPreferencesC3128wIH);
                        sharedPreferencesEditorC3031vI.putString("email", string);
                        sharedPreferencesEditorC3031vI.putString("password", string2);
                        zCommit = sharedPreferencesEditorC3031vI.commit();
                    }
                    objK = Boolean.valueOf(zCommit);
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                C2536q80.a(objK);
                Boolean bool = Boolean.FALSE;
                if (objK instanceof C2439p80) {
                    objK = bool;
                }
            }
            if (!sharedPreferences.edit().remove("password").remove("session_cookie").commit()) {
                throw new IllegalStateException("No se pudo retirar el estado de sesión heredado".toString());
            }
        }
        return sharedPreferences;
    }

    public static boolean i(long j) {
        return f.get() == j;
    }

    public static void j(Context context) {
        System.currentTimeMillis();
        AbstractC1474fG.j(context, "context");
        e = SystemClock.elapsedRealtime();
        h(context).edit().remove("last_session_validation_at").apply();
    }

    public static void k(String str, String str2) throws JSONException, NoSuchAlgorithmException {
        Rh0 rh0 = C2879tm.a;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] encoded = ((C2782sm) C2879tm.a.getValue()).b.getEncoded();
        AbstractC1474fG.i(encoded, "getEncoded(...)");
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(encoded), 11);
        AbstractC1474fG.i(strEncodeToString, "encodeToString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("usuario", str);
        jSONObject.put("contrasena", str2);
        jSONObject.put("deviceID", strEncodeToString);
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(C1263d5.b);
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json")));
        C1951k70 c1951k70C = c0560Kq.c();
        C1791ib0 c1791ib0 = C1791ib0.a;
        C1791ib0.e().c(c1951k70C).g().close();
    }

    public static boolean l(LoginActivity loginActivity, String str, String str2, String str3) {
        Object objK;
        char[] cArr;
        System.currentTimeMillis();
        AbstractC1474fG.j(str, "email");
        AbstractC1474fG.j(str2, "password");
        SharedPreferences.Editor editorRemove = h(loginActivity).edit().putString("email", str).remove("password").remove("last_session_validation_at");
        if (!AbstractC1899jh0.O(str3)) {
            editorRemove.putString("vencimiento", str3);
        } else {
            editorRemove.remove("vencimiento");
        }
        if (!editorRemove.commit()) {
            return false;
        }
        try {
            SharedPreferencesEditorC3031vI sharedPreferencesEditorC3031vI = new SharedPreferencesEditorC3031vI(AbstractC1370eA.H(loginActivity, "session_credentials_secure_v1", "session_credentials_legacy_v1"));
            sharedPreferencesEditorC3031vI.putString("email", str);
            sharedPreferencesEditorC3031vI.putString("password", str2);
            objK = Boolean.valueOf(sharedPreferencesEditorC3031vI.commit());
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2536q80.a(objK);
        Boolean bool = Boolean.FALSE;
        if (objK instanceof C2439p80) {
            objK = bool;
        }
        synchronized (b) {
            C2473pc0 c2473pc0 = c;
            if (c2473pc0 != null && (cArr = c2473pc0.b) != null) {
                Arrays.fill(cArr, 0, cArr.length, (char) 0);
            }
            char[] charArray = str2.toCharArray();
            AbstractC1474fG.i(charArray, "toCharArray(...)");
            c = new C2473pc0(str, charArray);
        }
        e = SystemClock.elapsedRealtime();
        return true;
    }

    public static void m(Context context) {
        Object objK;
        synchronized (b) {
            if (c != null) {
                return;
            }
            Object obj = null;
            try {
                SharedPreferencesC3128wI sharedPreferencesC3128wIH = AbstractC1370eA.H(context, "session_credentials_secure_v1", "session_credentials_legacy_v1");
                String string = sharedPreferencesC3128wIH.getString("email", null);
                if (string == null) {
                    string = "";
                }
                String string2 = sharedPreferencesC3128wIH.getString("password", null);
                if (string2 == null) {
                    string2 = "";
                }
                if (AbstractC1899jh0.O(string) || string2.length() == 0) {
                    objK = null;
                } else {
                    char[] charArray = string2.toCharArray();
                    AbstractC1474fG.i(charArray, "toCharArray(...)");
                    objK = new C2473pc0(string, charArray);
                }
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            C2536q80.a(objK);
            if (!(objK instanceof C2439p80)) {
                obj = objK;
            }
            c = (C2473pc0) obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(InterfaceC0412Ey interfaceC0412Ey, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Dc0 dc0;
        YS ys;
        Throwable th;
        VS vs;
        if (interfaceC0473Hh instanceof Dc0) {
            dc0 = (Dc0) interfaceC0473Hh;
            int i = dc0.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc0.p = i - Integer.MIN_VALUE;
            } else {
                dc0 = new Dc0(this, interfaceC0473Hh);
            }
        } else {
            dc0 = new Dc0(this, interfaceC0473Hh);
        }
        Object obj = dc0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = dc0.p;
        try {
            if (i2 == 0) {
                Jp0.O(obj);
                dc0.l = interfaceC0412Ey;
                ys = h;
                dc0.m = ys;
                dc0.p = 1;
                if (ys.d(null, dc0) == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs = (VS) dc0.l;
                    try {
                        Jp0.O(obj);
                        ((YS) vs).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs).e(null);
                        throw th;
                    }
                }
                YS ys2 = dc0.m;
                InterfaceC0412Ey interfaceC0412Ey2 = (InterfaceC0412Ey) dc0.l;
                Jp0.O(obj);
                ys = ys2;
                interfaceC0412Ey = interfaceC0412Ey2;
            }
            dc0.l = ys;
            dc0.m = null;
            dc0.p = 2;
            Object objB = interfaceC0412Ey.b(dc0);
            if (objB == enumC1706hi) {
                return enumC1706hi;
            }
            YS ys3 = ys;
            obj = objB;
            vs = ys3;
            ((YS) vs).e(null);
            return obj;
        } catch (Throwable th3) {
            YS ys4 = ys;
            th = th3;
            vs = ys4;
            ((YS) vs).e(null);
            throw th;
        }
    }
}
