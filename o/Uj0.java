package o;

import android.os.Build;
import com.skidush.clonex.MyApplication;
import com.titan.ranger.JniHandler;
import com.titan.ranger.NativeJni;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Uj0 {
    public static final ReentrantLock a = new ReentrantLock(true);
    public static final AtomicLong b = new AtomicLong(0);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static volatile boolean d;
    public static volatile String e;

    public static String a(String str) {
        Object objK;
        int length = str.length();
        if (1 > length || length >= 2049) {
            throw new IllegalArgumentException("El motor devolvió una fuente local inválida".toString());
        }
        try {
            objK = new URI(str);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (C2536q80.a(objK) != null) {
            throw new IllegalStateException("El motor devolvió una fuente local inválida");
        }
        URI uri = (URI) objK;
        if (!AbstractC1899jh0.N(uri.getScheme(), "http", true)) {
            throw new IllegalArgumentException("El motor devolvió un transporte no permitido".toString());
        }
        if (uri.getUserInfo() != null || uri.getFragment() != null) {
            throw new IllegalArgumentException("El motor devolvió una autoridad no permitida".toString());
        }
        if (!AbstractC1474fG.b(uri.getHost(), "127.0.0.1")) {
            throw new IllegalArgumentException("El motor devolvió un destino no permitido".toString());
        }
        int port = uri.getPort();
        if (1024 <= port && port < 65536) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (AbstractC1899jh0.U(path, "/", false)) {
                AtomicReference atomicReference = AbstractC2065lL.a;
                String aSCIIString = uri.toASCIIString();
                AbstractC1474fG.i(aSCIIString, "toASCIIString(...)");
                String strB = AbstractC2065lL.b(aSCIIString);
                if (strB == null) {
                    throw new IllegalArgumentException("Endpoint local Ranger inválido");
                }
                AbstractC2065lL.a.set(strB);
                return strB;
            }
        }
        throw new IllegalArgumentException("El motor devolvió un destino local inválido".toString());
    }

    public static JSONObject b(NativeJni nativeJni, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(nativeJni.call(str, jSONObject.toString()));
        int iOptInt = jSONObject2.optInt("err", 0);
        if (iOptInt == 0) {
            return jSONObject2;
        }
        throw new IllegalStateException(AbstractC1674hK.p("El motor de reproducción falló (código ", iOptInt, ")"));
    }

    public static JSONObject c() {
        Object objK;
        Object objK2;
        String prepareEvent = JniHandler.getPrepareEvent();
        AbstractC1474fG.g(prepareEvent);
        if (AbstractC1899jh0.O(prepareEvent)) {
            return null;
        }
        try {
            objK = new JSONObject(prepareEvent);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        JSONObject jSONObject = (JSONObject) objK;
        if (jSONObject == null) {
            return null;
        }
        Object objOpt = jSONObject.opt("status");
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        if (!(objOpt instanceof String)) {
            return null;
        }
        try {
            objK2 = new JSONObject((String) objOpt);
        } catch (Throwable th2) {
            objK2 = Jp0.k(th2);
        }
        return (JSONObject) (objK2 instanceof C2439p80 ? null : objK2);
    }

    public static void d() {
        AbstractC2065lL.a.set(null);
        if (d) {
            NativeJni nativeJni = NativeJni.getInstance();
            String str = e;
            if (str != null) {
                try {
                    AbstractC1474fG.g(nativeJni);
                    JSONObject jSONObjectPut = new JSONObject().put("instance", 0).put("name", str);
                    AbstractC1474fG.i(jSONObjectPut, "put(...)");
                    b(nativeJni, "StopProgram", jSONObjectPut);
                } catch (Throwable th) {
                    Jp0.k(th);
                }
            }
            try {
                AbstractC1474fG.g(nativeJni);
                JSONObject jSONObjectPut2 = new JSONObject().put("env", "{}");
                AbstractC1474fG.i(jSONObjectPut2, "put(...)");
                b(nativeJni, "SetEnv", jSONObjectPut2);
            } catch (Throwable th2) {
                Jp0.k(th2);
            }
            try {
                AbstractC1474fG.g(nativeJni);
                JSONObject jSONObjectPut3 = new JSONObject().put("entries", "[]");
                AbstractC1474fG.i(jSONObjectPut3, "put(...)");
                b(nativeJni, "SetEntries", jSONObjectPut3);
            } catch (Throwable th3) {
                Jp0.k(th3);
            }
        }
        e = null;
        JniHandler.resetPrepareEvent();
        MyApplication myApplication = MyApplication.l;
        File[] fileArrListFiles = new File(Jp0.s().getFilesDir(), "xuper-ranger").listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file : fileArrListFiles) {
            try {
                AbstractC1474fG.g(file);
                AbstractC1438ev.B(file);
            } catch (Throwable th4) {
                Jp0.k(th4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x025d A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #4 {all -> 0x00ff, blocks: (B:40:0x00f7, B:44:0x0105, B:46:0x010f, B:48:0x014b, B:49:0x0154, B:52:0x0160, B:54:0x0190, B:60:0x019e, B:61:0x01ba, B:64:0x022e, B:69:0x023d, B:72:0x0245, B:77:0x0258, B:78:0x025d, B:88:0x0291, B:91:0x0296, B:93:0x029a, B:98:0x02ad, B:102:0x02b7, B:87:0x028d, B:103:0x02be, B:104:0x02c7, B:105:0x02c8, B:106:0x02cf, B:107:0x02d0, B:108:0x02db, B:109:0x02dc, B:110:0x02e5, B:39:0x00f3, B:111:0x02e6, B:112:0x02f3, B:113:0x02f4, B:114:0x0301, B:84:0x0286), top: B:124:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0283  */
    /* JADX WARN: Code duplicated, block: B:90:0x0295  */
    /* JADX WARN: Code duplicated, block: B:93:0x029a A[Catch: all -> 0x00ff, TryCatch #4 {all -> 0x00ff, blocks: (B:40:0x00f7, B:44:0x0105, B:46:0x010f, B:48:0x014b, B:49:0x0154, B:52:0x0160, B:54:0x0190, B:60:0x019e, B:61:0x01ba, B:64:0x022e, B:69:0x023d, B:72:0x0245, B:77:0x0258, B:78:0x025d, B:88:0x0291, B:91:0x0296, B:93:0x029a, B:98:0x02ad, B:102:0x02b7, B:87:0x028d, B:103:0x02be, B:104:0x02c7, B:105:0x02c8, B:106:0x02cf, B:107:0x02d0, B:108:0x02db, B:109:0x02dc, B:110:0x02e5, B:39:0x00f3, B:111:0x02e6, B:112:0x02f3, B:113:0x02f4, B:114:0x0301, B:84:0x0286), top: B:124:0x0042, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02aa  */
    public static String e(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3, ArrayList arrayList) throws Throwable {
        ReentrantLock reentrantLock;
        String strOptString;
        Object objK;
        JSONObject jSONObject2;
        String strOptString2;
        String strA;
        AbstractC1474fG.j(jSONObject, "environment");
        AbstractC1474fG.j(jSONArray, "entries");
        AbstractC1474fG.j(str, "channelCode");
        AbstractC1474fG.j(str2, "channelName");
        AbstractC1474fG.j(str3, "supportVideoType");
        AtomicLong atomicLong = b;
        long j = atomicLong.get();
        ReentrantLock reentrantLock2 = a;
        reentrantLock2.lock();
        try {
            AbstractC2065lL.a.set(null);
            try {
                if (j != atomicLong.get()) {
                    throw new IllegalStateException("La sesión Ranger fue invalidada".toString());
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                AbstractC1474fG.i(strArr, "SUPPORTED_ABIS");
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str4 = strArr[i];
                    String[] strArr2 = strArr;
                    if (!AbstractC1474fG.b(str4, "arm64-v8a") && !AbstractC1474fG.b(str4, "armeabi-v7a")) {
                        i++;
                        strArr = strArr2;
                    }
                    NativeJni nativeJni = NativeJni.getInstance();
                    if (!d) {
                        MyApplication myApplication = MyApplication.l;
                        File file = new File(Jp0.s().getFilesDir(), "xuper-ranger");
                        AbstractC1438ev.B(file);
                        if (!file.mkdirs() && !file.isDirectory()) {
                            throw new IllegalStateException("No se pudo preparar el motor de reproducción".toString());
                        }
                        AbstractC1474fG.g(nativeJni);
                        JSONObject jSONObjectPut = new JSONObject().put("work_path", file.getAbsolutePath());
                        AbstractC1474fG.i(jSONObjectPut, "put(...)");
                        b(nativeJni, "Init", jSONObjectPut);
                        d = true;
                    }
                    String str5 = e;
                    if (str5 != null) {
                        try {
                            AbstractC1474fG.g(nativeJni);
                            reentrantLock = reentrantLock2;
                            try {
                                JSONObject jSONObjectPut2 = new JSONObject().put("instance", 0).put("name", str5);
                                AbstractC1474fG.i(jSONObjectPut2, "put(...)");
                                b(nativeJni, "StopProgram", jSONObjectPut2);
                            } catch (Throwable th) {
                                th = th;
                                Jp0.k(th);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            reentrantLock = reentrantLock2;
                        }
                        e = null;
                        Thread.sleep(250L);
                    } else {
                        reentrantLock = reentrantLock2;
                    }
                    if (j != b.get()) {
                        throw new IllegalStateException(r14.toString());
                    }
                    JniHandler.resetPrepareEvent();
                    AbstractC1474fG.g(nativeJni);
                    JSONObject jSONObjectPut3 = new JSONObject().put("env", jSONObject.toString());
                    AbstractC1474fG.i(jSONObjectPut3, "put(...)");
                    b(nativeJni, "SetEnv", jSONObjectPut3);
                    JSONObject jSONObjectPut4 = new JSONObject().put("entries", jSONArray.toString());
                    AbstractC1474fG.i(jSONObjectPut4, "put(...)");
                    b(nativeJni, "SetEntries", jSONObjectPut4);
                    if (!(!arrayList.isEmpty())) {
                        throw new IllegalArgumentException("El canal no tiene rutas Ranger compatibles".toString());
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it.next();
                        Iterator it2 = it;
                        JSONObject jSONObjectPut5 = new JSONObject().put("name", jSONObject3.getString("playCode")).put("license", jSONObject3.getString("license")).put("lang", "");
                        String strOptString3 = jSONObject3.optString("quality");
                        AbstractC1474fG.i(strOptString3, "optString(...)");
                        Integer numJ = AbstractC1802ih0.J(strOptString3);
                        jSONArray2.put(jSONObjectPut5.put("quality", (numJ != null ? numJ.intValue() : 0) >= 2 ? "hd" : "sd").put("vcodec", str3).put("format", jSONObject3.optString("AVFormat")));
                        it = it2;
                    }
                    JSONObject jSONObjectPut6 = new JSONObject().put("instance", 0).put("name", str).put("program", new JSONObject().put("name", str).put("buss", "live").put("title", str2).put("episode", "-1").put("from", "match").put("cause", "").put("medias", jSONArray2).put("media", ((JSONObject) AbstractC0911Ye.b0(arrayList)).getString("playCode")).put("start", 0).toString()).put("extra", "live");
                    e = str;
                    AbstractC1474fG.g(jSONObjectPut6);
                    b(nativeJni, "PrepareProgram", jSONObjectPut6);
                    for (int i2 = 0; i2 < 50; i2++) {
                        if (!(j == b.get())) {
                            throw new IllegalStateException("La sesión Ranger fue invalidada".toString());
                        }
                        JSONObject jSONObjectC = c();
                        if (jSONObjectC != null) {
                            String strOptString4 = jSONObjectC.optString("play_url");
                            AbstractC1474fG.i(strOptString4, "optString(...)");
                            if (!(!AbstractC1899jh0.O(strOptString4))) {
                                strOptString4 = null;
                            }
                            if (strOptString4 != null) {
                                strA = a(strOptString4);
                            } else {
                                JSONObject jSONObjectPut7 = new JSONObject().put("instance", 0).put("name", str);
                                AbstractC1474fG.i(jSONObjectPut7, "put(...)");
                                strOptString = b(nativeJni, "GetStatus", jSONObjectPut7).optString("res");
                                if (!(!AbstractC1899jh0.O(strOptString))) {
                                    strOptString = null;
                                }
                                if (strOptString != null) {
                                    try {
                                        objK = new JSONObject(strOptString);
                                    } catch (Throwable th3) {
                                        objK = Jp0.k(th3);
                                    }
                                    if (objK instanceof C2439p80) {
                                        objK = null;
                                    }
                                    jSONObject2 = (JSONObject) objK;
                                    if (jSONObject2 != null) {
                                        strOptString2 = jSONObject2.optString("play_url");
                                        AbstractC1474fG.i(strOptString2, "optString(...)");
                                        if (!AbstractC1899jh0.O(strOptString2)) {
                                            strOptString2 = null;
                                        }
                                        if (strOptString2 != null) {
                                            strA = a(strOptString2);
                                        }
                                    }
                                }
                                Thread.sleep(400L);
                            }
                        } else {
                            JSONObject jSONObjectPut8 = new JSONObject().put("instance", 0).put("name", str);
                            AbstractC1474fG.i(jSONObjectPut8, "put(...)");
                            strOptString = b(nativeJni, "GetStatus", jSONObjectPut8).optString("res");
                            if (!(!AbstractC1899jh0.O(strOptString))) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                objK = new JSONObject(strOptString);
                                if (objK instanceof C2439p80) {
                                    objK = null;
                                }
                                jSONObject2 = (JSONObject) objK;
                                if (jSONObject2 != null) {
                                    strOptString2 = jSONObject2.optString("play_url");
                                    AbstractC1474fG.i(strOptString2, "optString(...)");
                                    if (!AbstractC1899jh0.O(strOptString2)) {
                                        strOptString2 = null;
                                    }
                                    if (strOptString2 != null) {
                                        strA = a(strOptString2);
                                    }
                                }
                            }
                            Thread.sleep(400L);
                        }
                        reentrantLock.unlock();
                        return strA;
                    }
                    throw new IllegalStateException("El motor de reproducción no devolvió una fuente válida");
                }
                throw new IllegalStateException("La reproducción no está disponible para este dispositivo".toString());
            } catch (Throwable th4) {
                th = th4;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            reentrantLock = reentrantLock2;
        }
    }
}
