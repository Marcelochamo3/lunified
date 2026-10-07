package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.content.FileProvider;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2834tF {
    public static volatile C1669hF c;
    public static final C2834tF a = new C2834tF();
    public static final YS b = AbstractC1923jt0.a();
    public static final Rh0 d = new Rh0(C2428p3.G);
    public static final Rh0 e = new Rh0(C2428p3.F);

    public static final OV a(boolean z, boolean z2) {
        C1041ar0 c1041ar0;
        int i = 0;
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        nvO.c.add(Sr0.a);
        nvO.d.add(Sr0.b);
        X9 x9 = AbstractC1370eA.m;
        AbstractC1406ef.S(nvO.c, X10.q);
        AbstractC1406ef.S(nvO.d, X10.r);
        nvO.c.add(x9);
        nvO.d.add(x9);
        nvO.h = true;
        nvO.i = true;
        nvO.f = true;
        if (z2) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            nvO.e(10L, timeUnit);
            nvO.i(30L, timeUnit);
            nvO.k(60L, timeUnit);
            nvO.c(5L, TimeUnit.MINUTES);
        } else {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            nvO.e(5L, timeUnit2);
            nvO.i(8L, timeUnit2);
            nvO.k(8L, timeUnit2);
            nvO.c(10L, timeUnit2);
        }
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvO);
        Rh0 rh0 = C2376oc0.a;
        C2376oc0.b(nvO, false);
        if (z && (c1041ar0 = C3084vr0.t) != null) {
            if (c1041ar0.f <= System.currentTimeMillis() + 90000) {
                c1041ar0 = null;
            }
            if (c1041ar0 != null) {
                nvO.g(c1041ar0.a());
                nvO.h(new Wq0(c1041ar0, i));
            }
        }
        return new OV(nvO);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C2834tF c2834tF, OV ov, InterfaceC0473Hh interfaceC0473Hh) throws JSONException, C0778Tb {
        C2447pF c2447pF;
        c2834tF.getClass();
        if (interfaceC0473Hh instanceof C2447pF) {
            c2447pF = (C2447pF) interfaceC0473Hh;
            int i = c2447pF.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2447pF.n = i - Integer.MIN_VALUE;
            } else {
                c2447pF = new C2447pF(c2834tF, interfaceC0473Hh);
            }
        } else {
            c2447pF = new C2447pF(c2834tF, interfaceC0473Hh);
        }
        Object objC = c2447pF.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2447pF.n;
        if (i2 == 0) {
            Jp0.O(objC);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u("https://updates.neoplay.es/version.json");
            c0560Kq.j("Cache-Control", "no-cache");
            c0560Kq.d();
            A50 a50C = ov.c(c0560Kq.c());
            c2447pF.n = 1;
            objC = Jp0.c(a50C, 262144L, c2447pF);
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
        int i3 = wg0.a;
        if (200 > i3 || i3 >= 300) {
            StringBuilder sb = new StringBuilder("No se pudo comprobar la actualización (HTTP ");
            int i4 = wg0.a;
            throw new C0778Tb(i4, AbstractC1701hf0.g(sb, i4, ")"));
        }
        String str = wg0.b;
        if (AbstractC1899jh0.O(str)) {
            throw new IllegalStateException("Respuesta de actualización vacía");
        }
        JSONObject jSONObject = new JSONObject(str);
        int i5 = jSONObject.getInt("versionCode");
        String string = jSONObject.getString("versionName");
        AbstractC1474fG.i(string, "getString(...)");
        String string2 = jSONObject.getString("apkUrl");
        AbstractC1474fG.i(string2, "getString(...)");
        String string3 = jSONObject.getString("sha256");
        AbstractC1474fG.i(string3, "getString(...)");
        String lowerCase = string3.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String strOptString = jSONObject.optString("notes", "");
        AbstractC1474fG.i(strOptString, "optString(...)");
        return new C1767iF(i5, string, string2, lowerCase, strOptString, jSONObject.optBoolean("mandatory", false));
    }

    public static final String c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[C1672hI.a.e];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i < 0) {
                    byte[] bArrDigest = messageDigest.digest();
                    AbstractC1474fG.i(bArrDigest, "digest(...)");
                    String strR = X5.R(bArrDigest, E1.P);
                    AbstractC3409z9.g(fileInputStream, null);
                    return strR;
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void d(Context context, File file) {
        PackageManager packageManager = context.getPackageManager();
        AbstractC1474fG.g(packageManager);
        String absolutePath = file.getAbsolutePath();
        AbstractC1474fG.i(absolutePath, "getAbsolutePath(...)");
        PackageInfo packageInfoH = h(packageManager, absolutePath);
        if (packageInfoH == null) {
            throw new SecurityException("APK de actualización inválida");
        }
        String packageName = context.getPackageName();
        AbstractC1474fG.i(packageName, "getPackageName(...)");
        PackageInfo packageInfoH2 = h(packageManager, packageName);
        if (packageInfoH2 == null) {
            throw new SecurityException("No se pudo validar la aplicación instalada");
        }
        if (!AbstractC1474fG.b(packageInfoH.packageName, context.getPackageName())) {
            throw new SecurityException("La actualización pertenece a otra aplicación");
        }
        Set setL = l(packageInfoH);
        if (setL.isEmpty()) {
            setL = k(file);
        }
        Set setL2 = l(packageInfoH2);
        if (setL2.isEmpty()) {
            setL2 = k(new File(context.getApplicationInfo().sourceDir));
        }
        if (setL.isEmpty() || setL2.isEmpty()) {
            throw new SecurityException("No se pudo verificar la firma de la actualización (SIGNATURE_UNREADABLE)");
        }
        if (!AbstractC1474fG.b(setL, setL2)) {
            throw new SecurityException("La actualización no tiene la firma autorizada");
        }
    }

    public static PackageInfo h(PackageManager packageManager, String str) {
        int i = (Build.VERSION.SDK_INT >= 28 ? 134217728 : 0) | 64;
        return AbstractC1899jh0.L(str, ".apk", false) ? packageManager.getPackageArchiveInfo(str, i) : packageManager.getPackageInfo(str, i);
    }

    public static void j(Context context, Uri uri) {
        Object objK;
        AbstractC1474fG.j(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.addFlags(67108864);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        String path = uri.getPath();
        AbstractC1474fG.g(path);
        File file = new File(path);
        C0745Ru c0745RuC = FileProvider.c(0, context, "com.skidush.clonex.provider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c0745RuC.b.entrySet()) {
                String path2 = ((File) entry2.getValue()).getPath();
                if (C0745Ru.a(canonicalPath, path2) && (entry == null || path2.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(AbstractC1701hf0.t("Failed to find configured root that contains ", canonicalPath));
            }
            String path3 = ((File) entry.getValue()).getPath();
            intent.setData(new Uri.Builder().scheme("content").authority(c0745RuC.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path3.endsWith("/") ? canonicalPath.substring(path3.length()) : canonicalPath.substring(path3.length() + 1), "/")).build());
            long jIncrementAndGet = I7.e.incrementAndGet();
            AtomicBoolean atomicBoolean = I7.d;
            atomicBoolean.set(true);
            try {
                Thread thread = new Thread(new io.sentry.android.replay.capture.k(jIncrementAndGet, context), "installer-handoff-timeout");
                thread.setDaemon(true);
                thread.start();
                objK = thread;
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (C2536q80.a(objK) != null) {
                atomicBoolean.set(false);
            }
            try {
                context.startActivity(intent);
            } catch (Throwable th2) {
                I7 i7 = I7.a;
                I7.e.incrementAndGet();
                I7.d.set(false);
                throw th2;
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static Set k(File file) {
        Set linkedHashSet;
        String strR;
        byte[] encoded;
        C1722hq c1722hq = C1722hq.l;
        byte[] bArr = new byte[C1672hI.a.e];
        try {
            JarFile jarFile = new JarFile(file, true);
            try {
                Enumeration<JarEntry> enumerationEntries = jarFile.entries();
                Set set = null;
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    if (!jarEntryNextElement.isDirectory()) {
                        String name = jarEntryNextElement.getName();
                        AbstractC1474fG.i(name, "getName(...)");
                        if (!AbstractC1899jh0.U(name, "META-INF/", false)) {
                            InputStream inputStream = jarFile.getInputStream(jarEntryNextElement);
                            do {
                                try {
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        AbstractC3409z9.g(inputStream, th);
                                        throw th2;
                                    }
                                }
                            } while (inputStream.read(bArr) >= 0);
                            AbstractC3409z9.g(inputStream, null);
                            CodeSigner[] codeSigners = jarEntryNextElement.getCodeSigners();
                            if (codeSigners != null) {
                                linkedHashSet = new LinkedHashSet();
                                for (CodeSigner codeSigner : codeSigners) {
                                    List<? extends Certificate> certificates = codeSigner.getSignerCertPath().getCertificates();
                                    AbstractC1474fG.i(certificates, "getCertificates(...)");
                                    Certificate certificate = (Certificate) AbstractC0911Ye.d0(certificates);
                                    if (certificate == null || (encoded = certificate.getEncoded()) == null) {
                                        strR = null;
                                    } else {
                                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(encoded);
                                        AbstractC1474fG.i(bArrDigest, "digest(...)");
                                        strR = X5.R(bArrDigest, E1.O);
                                    }
                                    if (strR != null) {
                                        linkedHashSet.add(strR);
                                    }
                                }
                            } else {
                                linkedHashSet = null;
                            }
                            if (linkedHashSet == null) {
                                linkedHashSet = c1722hq;
                            }
                            if (linkedHashSet.isEmpty()) {
                                AbstractC3409z9.g(jarFile, null);
                                return c1722hq;
                            }
                            if (set == null) {
                                set = linkedHashSet;
                            } else if (!AbstractC1474fG.b(set, linkedHashSet)) {
                                AbstractC3409z9.g(jarFile, null);
                                return c1722hq;
                            }
                        }
                    }
                }
                AbstractC3409z9.g(jarFile, null);
                return set == null ? c1722hq : set;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3409z9.g(jarFile, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            return c1722hq;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        if (r0 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedHashSet l(android.content.pm.PackageInfo r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L2a
            android.content.pm.SigningInfo r0 = o.AbstractC3294y0.c(r5)
            if (r0 == 0) goto L22
            android.content.pm.Signature[] r0 = o.AbstractC3294y0.x(r0)
            if (r0 == 0) goto L22
            int r1 = r0.length
            r3 = 1
            if (r1 != 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            r1 = r1 ^ r3
            if (r1 == 0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            goto L31
        L22:
            android.content.pm.Signature[] r5 = r5.signatures
            if (r5 != 0) goto L28
            android.content.pm.Signature[] r5 = new android.content.pm.Signature[r2]
        L28:
            r0 = r5
            goto L31
        L2a:
            android.content.pm.Signature[] r5 = r5.signatures
            if (r5 != 0) goto L28
            android.content.pm.Signature[] r5 = new android.content.pm.Signature[r2]
            goto L28
        L31:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            int r1 = r0.length
        L37:
            if (r2 >= r1) goto L5a
            r3 = r0[r2]
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)
            byte[] r3 = r3.toByteArray()
            byte[] r3 = r4.digest(r3)
            java.lang.String r4 = "digest(...)"
            o.AbstractC1474fG.i(r3, r4)
            o.E1 r4 = o.E1.Q
            java.lang.String r3 = o.X5.R(r3, r4)
            r5.add(r3)
            int r2 = r2 + 1
            goto L37
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2834tF.l(android.content.pm.PackageInfo):java.util.LinkedHashSet");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Context context, InterfaceC0473Hh interfaceC0473Hh, C1767iF c1767iF, OV ov) {
        C1961kF c1961kF;
        if (interfaceC0473Hh instanceof C1961kF) {
            c1961kF = (C1961kF) interfaceC0473Hh;
            int i = c1961kF.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1961kF.n = i - Integer.MIN_VALUE;
            } else {
                c1961kF = new C1961kF(this, interfaceC0473Hh);
            }
        } else {
            c1961kF = new C1961kF(this, interfaceC0473Hh);
        }
        Object objJ = c1961kF.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1961kF.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C2059lF c2059lF = new C2059lF(context, null, c1767iF, ov);
            c1961kF.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c2059lF, c1961kF);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object f(Context context, C1767iF c1767iF, InterfaceC0473Hh interfaceC0473Hh) {
        C2156mF c2156mF;
        Exception exc;
        C2834tF c2834tF;
        Exception exc2;
        Exception exc3;
        Context context2 = context;
        C1767iF c1767iF2 = c1767iF;
        if (interfaceC0473Hh instanceof C2156mF) {
            c2156mF = (C2156mF) interfaceC0473Hh;
            int i = c2156mF.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2156mF.r = i - Integer.MIN_VALUE;
            } else {
                c2156mF = new C2156mF(this, interfaceC0473Hh);
            }
        } else {
            c2156mF = new C2156mF(this, interfaceC0473Hh);
        }
        Object objC = c2156mF.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2156mF.r;
        InterfaceC0473Hh interfaceC0473Hh2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                C1767iF c1767iF3 = c2156mF.n;
                Context context3 = c2156mF.m;
                C2834tF c2834tF2 = (C2834tF) c2156mF.l;
                try {
                    Jp0.O(objC);
                } catch (Exception e2) {
                    exc = e2;
                    c2834tF = c2834tF2;
                    c1767iF2 = c1767iF3;
                    context2 = context3;
                    if (exc instanceof CancellationException) {
                        throw exc;
                    }
                    throw exc;
                }
            }
            if (i2 == 2) {
                exc2 = c2156mF.f911o;
                C1767iF c1767iF4 = c2156mF.n;
                Context context4 = c2156mF.m;
                C2834tF c2834tF3 = (C2834tF) c2156mF.l;
                try {
                    Jp0.O(objC);
                    C1767iF c1767iF5 = (C1767iF) objC;
                    if (new C1863jF(c1767iF5.b).compareTo(new C1863jF(c1767iF4.b)) < 0) {
                        throw exc2;
                    }
                    try {
                        c2834tF3.getClass();
                        OV ov = (OV) e.getValue();
                        c2156mF.l = exc2;
                        c2156mF.m = null;
                        c2156mF.n = null;
                        c2156mF.f911o = null;
                        c2156mF.r = 3;
                        objC = c2834tF3.e(context4, c2156mF, c1767iF5, ov);
                        if (objC == enumC1706hi) {
                            return enumC1706hi;
                        }
                        exc3 = exc2;
                    } catch (Exception e3) {
                        e = e3;
                        exc3 = exc2;
                        if (e instanceof CancellationException) {
                            throw e;
                        }
                        AbstractC3409z9.a(e, exc3);
                        throw e;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc3 = (Exception) c2156mF.l;
                try {
                    Jp0.O(objC);
                } catch (Exception e5) {
                    e = e5;
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    AbstractC3409z9.a(e, exc3);
                    throw e;
                }
            }
            return (File) objC;
        }
        Jp0.O(objC);
        File[] fileArrListFiles = context.getCacheDir().listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                AbstractC1474fG.g(file);
                String name = file.getName();
                AbstractC1474fG.i(name, "getName(...)");
                if (AbstractC1474fG.b(AbstractC1119bh0.y0(name, '.', ""), "apk")) {
                    arrayList.add(file);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        try {
            C0856Wb c0856Wb = C0856Wb.a;
            boolean zU = AbstractC1899jh0.U(c1767iF2.c, "https://updates.neoplay.es/", false);
            C2253nF c2253nF = new C2253nF(context2, c1767iF2, interfaceC0473Hh2, 0);
            C2253nF c2253nF2 = new C2253nF(context2, c1767iF2, interfaceC0473Hh2, 1);
            c2156mF.l = this;
            c2156mF.m = context2;
            c2156mF.n = c1767iF2;
            c2156mF.r = 1;
            objC = c0856Wb.c("descarga de actualización", zU, c2253nF, c2253nF2, c2156mF);
            return objC == enumC1706hi ? enumC1706hi : objC;
        } catch (Exception e6) {
            exc = e6;
            c2834tF = this;
            if ((exc instanceof CancellationException) || !AbstractC1899jh0.U(c1767iF2.c, "https://updates.neoplay.es/", false)) {
                throw exc;
            }
            try {
                c2834tF.getClass();
                OV ov2 = (OV) d.getValue();
                c2156mF.l = c2834tF;
                c2156mF.m = context2;
                c2156mF.n = c1767iF2;
                c2156mF.f911o = exc;
                c2156mF.r = 2;
                c2834tF.g(ov2, c2156mF);
                return enumC1706hi;
            } catch (Exception e7) {
                e = e7;
                exc2 = exc;
            }
        }
        if (e instanceof CancellationException) {
            throw e;
        }
        AbstractC3409z9.a(e, exc2);
        throw e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void g(OV ov, InterfaceC0473Hh interfaceC0473Hh) {
        C2350oF c2350oF;
        InterfaceC0980aA interfaceC0980aAA;
        if (interfaceC0473Hh instanceof C2350oF) {
            c2350oF = (C2350oF) interfaceC0473Hh;
            int i = c2350oF.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2350oF.n = i - Integer.MIN_VALUE;
            } else {
                c2350oF = new C2350oF(this, interfaceC0473Hh);
            }
        } else {
            c2350oF = new C2350oF(this, interfaceC0473Hh);
        }
        Object objA = c2350oF.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2350oF.n;
        if (i2 == 0) {
            Jp0.O(objA);
            C1078bA c1078bA = C1078bA.INSTANCE;
            c2350oF.n = 1;
            c1078bA.getClass();
            if (ov != null) {
                InterfaceC0980aA.Companion.getClass();
                interfaceC0980aAA = C0958Zz.a(ov);
            } else {
                interfaceC0980aAA = AbstractC1175cA.a;
            }
            objA = interfaceC0980aAA.a("sudamericaplay", "digital_tv_normal", c2350oF);
            if (objA == enumC1706hi) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        AbstractC1674hK.w(objA);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(InterfaceC0473Hh interfaceC0473Hh) {
        C2544qF c2544qF;
        YS ys;
        VS vs;
        VS vs2;
        Throwable th;
        C1767iF c1767iF;
        VS vs3;
        if (interfaceC0473Hh instanceof C2544qF) {
            c2544qF = (C2544qF) interfaceC0473Hh;
            int i = c2544qF.f988o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2544qF.f988o = i - Integer.MIN_VALUE;
            } else {
                c2544qF = new C2544qF(this, interfaceC0473Hh);
            }
        } else {
            c2544qF = new C2544qF(this, interfaceC0473Hh);
        }
        Object obj = c2544qF.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2544qF.f988o;
        try {
            if (i2 == 0) {
                Jp0.O(obj);
                ys = b;
                c2544qF.l = ys;
                c2544qF.f988o = 1;
                if (ys.d(null, c2544qF) == enumC1706hi) {
                    vs = ys;
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs2 = c2544qF.l;
                    try {
                        Jp0.O(obj);
                        vs2 = vs2;
                        C1767iF c1767iF2 = (C1767iF) obj;
                        c = new C1669hF(SystemClock.elapsedRealtime(), c1767iF2);
                        VS vs4 = vs2;
                        c1767iF = c1767iF2;
                        vs3 = vs4;
                        ((YS) vs3).e(null);
                        return c1767iF;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                VS vs5 = c2544qF.l;
                Jp0.O(obj);
                vs = vs5;
            }
            vs = ys;
            C1669hF c1669hF = c;
            if (c1669hF != null) {
                if (SystemClock.elapsedRealtime() - c1669hF.a >= 300000) {
                    c1669hF = null;
                }
                if (c1669hF != null) {
                    c1767iF = c1669hF.b;
                    vs3 = vs;
                }
                ((YS) vs3).e(null);
                return c1767iF;
            }
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C2737sF c2737sF = new C2737sF(2, null);
            c2544qF.l = vs;
            c2544qF.f988o = 2;
            Object objJ = AbstractC1376eG.J(executorC0891Xk, c2737sF, c2544qF);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            vs2 = vs;
            obj = objJ;
            C1767iF c1767iF3 = (C1767iF) obj;
            c = new C1669hF(SystemClock.elapsedRealtime(), c1767iF3);
            VS vs6 = vs2;
            c1767iF = c1767iF3;
            vs3 = vs6;
            ((YS) vs3).e(null);
            return c1767iF;
        } catch (Throwable th3) {
            vs2 = vs;
            th = th3;
            ((YS) vs2).e(null);
            throw th;
        }
    }
}
