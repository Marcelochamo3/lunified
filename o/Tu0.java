package o;

import android.util.Base64;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Tu0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Uu0 m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tu0(Uu0 uu0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = uu0;
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Tu0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Tu0(this.m, this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0395  */
    @Override // o.R7
    public final Object r(Object obj) throws IOException {
        String str;
        String str2;
        Uu0 uu0;
        String str3;
        String str4;
        String str5;
        String strH;
        C2446pE c2446pEB;
        QH qhI;
        String str6;
        Object objK;
        int length;
        int length2;
        AtomicInteger atomicInteger;
        CountDownLatch countDownLatch;
        Object objK2;
        C1101bX c1101bX;
        int i = 4;
        Jp0.O(obj);
        Uu0 uu1 = this.m;
        String str7 = this.n;
        Uu0.f(uu1, str7);
        String str8 = "";
        int i2 = 0;
        String str9 = null;
        while (true) {
            if (i2 >= i) {
                str9 = str7;
                break;
            }
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str7);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            if (str9 != null && str9.length() != 0) {
                c0560Kq.j("Referer", str9);
            }
            c0560Kq.d();
            C1101bX c1101bXG = uu1.g(c0560Kq.c(), 1500000L);
            str9 = (String) c1101bXG.l;
            str8 = (String) c1101bXG.m;
            C3074vm0 c3074vm0M = Vb0.M(I60.c(Uu0.c, str8), Iu0.p);
            Iterator it = c3074vm0M.a.iterator();
            Object obj2 = null;
            while (it.hasNext()) {
                Object objB = c3074vm0M.b.b(it.next());
                if (AbstractC1899jh0.U((String) objB, "https://", true)) {
                    obj2 = objB;
                }
            }
            str7 = (String) obj2;
            if (str7 == null || AbstractC1474fG.b(str7, str9)) {
                break;
            }
            Uu0.f(uu1, str7);
            i2++;
            i = 4;
        }
        Su0 su0B = AbstractC2506pt.B(str8, str9);
        if (su0B != null) {
            C0560Kq c0560Kq2 = new C0560Kq();
            C2446pE c2446pE = su0B.a;
            AbstractC1474fG.j(c2446pE, "url");
            c0560Kq2.m = c2446pE;
            c0560Kq2.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            c0560Kq2.j("Referer", str9);
            c0560Kq2.d();
            String str10 = (String) uu1.g(c0560Kq2.c(), 32768L).m;
            final io.sentry.android.replay.f fVar = new io.sentry.android.replay.f(25, g());
            AbstractC1474fG.j(str10, "challengeJson");
            try {
                objK = new JSONObject(str10);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (C2536q80.a(objK) != null) {
                throw new IOException("El desafío VOE no es JSON válido");
            }
            JSONObject jSONObject = (JSONObject) objK;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("parameters");
            if (jSONObjectOptJSONObject == null) {
                throw new IOException("El desafío VOE no contiene parámetros");
            }
            String strOptString = jSONObjectOptJSONObject.optString("algorithm");
            int iOptInt = jSONObjectOptJSONObject.optInt("cost", -1);
            final int iOptInt2 = jSONObjectOptJSONObject.optInt("keyLength", -1);
            String strOptString2 = jSONObjectOptJSONObject.optString("nonce");
            AbstractC1474fG.i(strOptString2, "optString(...)");
            final byte[] bArrN = AbstractC1459f50.n(strOptString2, "nonce");
            String strOptString3 = jSONObjectOptJSONObject.optString("salt");
            AbstractC1474fG.i(strOptString3, "optString(...)");
            final byte[] bArrN2 = AbstractC1459f50.n(strOptString3, "salt");
            String strOptString4 = jSONObjectOptJSONObject.optString("keyPrefix");
            AbstractC1474fG.i(strOptString4, "optString(...)");
            final byte[] bArrN3 = AbstractC1459f50.n(strOptString4, "prefix");
            String str11 = str9;
            long jOptLong = jSONObjectOptJSONObject.optLong("expiresAt", 0L);
            if (!AbstractC1474fG.b(strOptString, "PBKDF2/SHA-256") || 1 > iOptInt || iOptInt >= 20001) {
                throw new IOException("El algoritmo ALTCHA de VOE no está permitido");
            }
            if (16 > iOptInt2 || iOptInt2 >= 65 || 8 > (length = bArrN.length) || length >= 65 || 8 > (length2 = bArrN2.length) || length2 >= 65) {
                throw new IOException("Los parámetros ALTCHA de VOE no son válidos");
            }
            if (bArrN3.length == 0 || bArrN3.length > 2) {
                throw new IOException("La dificultad ALTCHA de VOE excede el límite permitido");
            }
            if (jOptLong > 0 && jOptLong <= System.currentTimeMillis() / 1000) {
                throw new IOException("El desafío ALTCHA de VOE expiró");
            }
            final long jNanoTime = System.nanoTime();
            final long jI = (U9.i(20000L, 250L, 20000L) * 1000000) + jNanoTime;
            AtomicInteger atomicInteger2 = new AtomicInteger(0);
            final AtomicReference atomicReference = new AtomicReference(null);
            final AtomicReference atomicReference2 = new AtomicReference(null);
            int iH = iOptInt < 1000 ? 1 : U9.h(Runtime.getRuntime().availableProcessors(), 1, 4);
            CountDownLatch countDownLatch2 = new CountDownLatch(iH);
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(iH);
            try {
                atomicInteger = atomicInteger2;
                countDownLatch = countDownLatch2;
                try {
                    objK2 = BlindajeCrypto.a.m(bArrN, bArrN2, iOptInt, iOptInt2, bArrN3, (int) U9.i(20000L, 250L, 20000L));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        objK2 = Jp0.k(th);
                    } catch (Throwable th3) {
                        executorServiceNewFixedThreadPool.shutdownNow();
                        Arrays.fill(bArrN, (byte) 0);
                        Arrays.fill(bArrN2, (byte) 0);
                        Arrays.fill(bArrN3, (byte) 0);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                atomicInteger = atomicInteger2;
                countDownLatch = countDownLatch2;
            }
            if (!(objK2 instanceof C2439p80)) {
                if (objK2 instanceof C2439p80) {
                    objK2 = null;
                }
                byte[] bArr = (byte[]) objK2;
                if (bArr != null && bArr.length == 0) {
                    throw new IOException("La prueba ALTCHA de VOE excedió el tiempo permitido");
                }
                if (bArr != null && bArr.length == iOptInt2 + 4) {
                    int i3 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    byte[] bArrM = X5.M(bArr, 4, bArr.length);
                    String strO = AbstractC1459f50.o(bArrM);
                    Arrays.fill(bArrM, (byte) 0);
                    Arrays.fill(bArr, (byte) 0);
                    c1101bX = new C1101bX(jSONObject, new C3007v2(i3, strO, (System.nanoTime() - jNanoTime) / 1000000));
                } else if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                Arrays.fill(bArrN, (byte) 0);
                Arrays.fill(bArrN2, (byte) 0);
                Arrays.fill(bArrN3, (byte) 0);
                JSONObject jSONObject2 = (JSONObject) c1101bX.l;
                C3007v2 c3007v2 = (C3007v2) c1101bX.m;
                AbstractC1474fG.j(jSONObject2, "challenge");
                AbstractC1474fG.j(c3007v2, "solution");
                String string = new JSONObject().put("challenge", jSONObject2).put("solution", new JSONObject().put("counter", c3007v2.a).put("derivedKey", c3007v2.b).put("time", c3007v2.c)).toString();
                AbstractC1474fG.i(string, "toString(...)");
                byte[] bytes = string.getBytes(AbstractC1305dd.a);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                Na0 na0 = new Na0(22);
                na0.o("_token", su0B.c);
                na0.o("access", su0B.d);
                AbstractC1474fG.g(strEncodeToString);
                na0.o("altcha", strEncodeToString);
                C0540Jw c0540Jw = new C0540Jw((ArrayList) na0.n, (ArrayList) na0.f414o);
                C0560Kq c0560Kq3 = new C0560Kq();
                C2446pE c2446pE2 = su0B.b;
                AbstractC1474fG.j(c2446pE2, "url");
                c0560Kq3.m = c2446pE2;
                str = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
                str3 = "User-Agent";
                c0560Kq3.j(str3, str);
                str5 = "Referer";
                c0560Kq3.j(str5, str11);
                C2349oE c2349oEF = c2446pE2.f();
                str2 = "/";
                c2349oEF.d(str2);
                c2349oEF.i = null;
                c2349oEF.h = null;
                str4 = "Origin";
                c0560Kq3.j(str4, AbstractC1119bh0.m0(c2349oEF.b().i, str2));
                c0560Kq3.m("POST", c0540Jw);
                C1951k70 c1951k70C = c0560Kq3.c();
                uu0 = uu1;
                C1101bX c1101bXG2 = uu0.g(c1951k70C, 1500000L);
                str9 = (String) c1101bXG2.l;
                str8 = (String) c1101bXG2.m;
                if (AbstractC2506pt.B(str8, str9) != null) {
                    throw new IOException("VOE rechazó la prueba de acceso");
                }
            } else {
                iOptInt = iOptInt;
            }
            for (int i4 = 0; i4 < iH; i4++) {
                final AtomicInteger atomicInteger3 = atomicInteger;
                final int i5 = iOptInt;
                final CountDownLatch countDownLatch3 = countDownLatch;
                executorServiceNewFixedThreadPool.execute(new Runnable() { // from class: o.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object objK3;
                        byte[] bArr2;
                        int i6;
                        int i7;
                        RunnableC2910u2 runnableC2910u2 = this;
                        int i8 = i5;
                        int i9 = iOptInt2;
                        long j = jNanoTime;
                        byte[] bArr3 = bArrN;
                        AbstractC1474fG.j(bArr3, "$nonce");
                        AtomicReference atomicReference3 = atomicReference;
                        AbstractC1474fG.j(atomicReference3, "$solution");
                        AtomicReference atomicReference4 = atomicReference2;
                        AbstractC1474fG.j(atomicReference4, "$failure");
                        InterfaceC0360Cy interfaceC0360Cy = fVar;
                        AbstractC1474fG.j(interfaceC0360Cy, "$shouldContinue");
                        AtomicInteger atomicInteger4 = atomicInteger3;
                        AbstractC1474fG.j(atomicInteger4, "$nextCounter");
                        byte[] bArr4 = bArrN2;
                        AbstractC1474fG.j(bArr4, "$salt");
                        byte[] bArr5 = bArrN3;
                        AbstractC1474fG.j(bArr5, "$prefix");
                        CountDownLatch countDownLatch4 = countDownLatch3;
                        AbstractC1474fG.j(countDownLatch4, "$completed");
                        byte[] bArr6 = new byte[bArr3.length + 4];
                        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
                        try {
                            objK3 = Mac.getInstance("HmacSHA256");
                        } catch (Throwable th5) {
                            objK3 = Jp0.k(th5);
                        }
                        Throwable thA = C2536q80.a(objK3);
                        if (thA != null) {
                            while (!atomicReference4.compareAndSet(null, thA) && atomicReference4.get() == null) {
                            }
                            countDownLatch4.countDown();
                            return;
                        }
                        Mac mac = (Mac) objK3;
                        while (true) {
                            try {
                                if (atomicReference3.get() == null && atomicReference4.get() == null && !Thread.currentThread().isInterrupted() && ((Boolean) interfaceC0360Cy.c()).booleanValue()) {
                                    byte[] bArr7 = bArr6;
                                    if (System.nanoTime() < jI) {
                                        try {
                                            int andIncrement = atomicInteger4.getAndIncrement();
                                            if (andIncrement <= 100000) {
                                                bArr2 = bArr7;
                                                try {
                                                    AbstractC1459f50.R(bArr2, bArr3.length, andIncrement);
                                                    AbstractC1474fG.g(mac);
                                                    byte[] bArrH = AbstractC1459f50.H(mac, bArr2, bArr4, i8, i9);
                                                    Mac mac2 = mac;
                                                    int length3 = bArr5.length;
                                                    int i10 = 0;
                                                    for (int i11 = 0; i11 < length3; i11++) {
                                                        i10 |= bArrH[i11] ^ bArr5[i11];
                                                    }
                                                    if (i10 == 0) {
                                                        i6 = i8;
                                                        i7 = i9;
                                                        C3007v2 c3007v3 = new C3007v2(andIncrement, AbstractC1459f50.o(bArrH), (System.nanoTime() - j) / 1000000);
                                                        while (!atomicReference3.compareAndSet(null, c3007v3) && atomicReference3.get() == null) {
                                                        }
                                                    } else {
                                                        i6 = i8;
                                                        i7 = i9;
                                                    }
                                                    Arrays.fill(bArrH, (byte) 0);
                                                    runnableC2910u2 = this;
                                                    bArr6 = bArr2;
                                                    mac = mac2;
                                                    i8 = i6;
                                                    i9 = i7;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bArr2 = bArr7;
                                        }
                                        while (!atomicReference4.compareAndSet(null, th) && atomicReference4.get() == null) {
                                            try {
                                            } finally {
                                                Arrays.fill(bArr2, (byte) 0);
                                                countDownLatch4.countDown();
                                            }
                                        }
                                    }
                                    bArr2 = bArr7;
                                } else {
                                    bArr2 = bArr6;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bArr2 = bArr6;
                            }
                            byte b = 0;
                            return;
                        }
                    }
                });
            }
            countDownLatch.await();
            C3007v2 c3007v3 = (C3007v2) atomicReference.get();
            if (c3007v3 == null) {
                Throwable th5 = (Throwable) atomicReference2.get();
                if (th5 != null) {
                    throw new IOException("No se pudo calcular la prueba ALTCHA de VOE", th5);
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                Arrays.fill(bArrN, (byte) 0);
                Arrays.fill(bArrN2, (byte) 0);
                Arrays.fill(bArrN3, (byte) 0);
                throw new IOException("No se pudo resolver la prueba ALTCHA de VOE");
            }
            c1101bX = new C1101bX(jSONObject, c3007v3);
            executorServiceNewFixedThreadPool.shutdownNow();
            Arrays.fill(bArrN, (byte) 0);
            Arrays.fill(bArrN2, (byte) 0);
            Arrays.fill(bArrN3, (byte) 0);
            JSONObject jSONObject3 = (JSONObject) c1101bX.l;
            C3007v2 c3007v4 = (C3007v2) c1101bX.m;
            AbstractC1474fG.j(jSONObject3, "challenge");
            AbstractC1474fG.j(c3007v4, "solution");
            String string2 = new JSONObject().put("challenge", jSONObject3).put("solution", new JSONObject().put("counter", c3007v4.a).put("derivedKey", c3007v4.b).put("time", c3007v4.c)).toString();
            AbstractC1474fG.i(string2, "toString(...)");
            byte[] bytes2 = string2.getBytes(AbstractC1305dd.a);
            AbstractC1474fG.i(bytes2, "getBytes(...)");
            String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
            Na0 na1 = new Na0(22);
            na1.o("_token", su0B.c);
            na1.o("access", su0B.d);
            AbstractC1474fG.g(strEncodeToString2);
            na1.o("altcha", strEncodeToString2);
            C0540Jw c0540Jw2 = new C0540Jw((ArrayList) na1.n, (ArrayList) na1.f414o);
            C0560Kq c0560Kq4 = new C0560Kq();
            C2446pE c2446pE3 = su0B.b;
            AbstractC1474fG.j(c2446pE3, "url");
            c0560Kq4.m = c2446pE3;
            str = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
            str3 = "User-Agent";
            c0560Kq4.j(str3, str);
            str5 = "Referer";
            c0560Kq4.j(str5, str11);
            C2349oE c2349oEF2 = c2446pE3.f();
            str2 = "/";
            c2349oEF2.d(str2);
            c2349oEF2.i = null;
            c2349oEF2.h = null;
            str4 = "Origin";
            c0560Kq4.j(str4, AbstractC1119bh0.m0(c2349oEF2.b().i, str2));
            c0560Kq4.m("POST", c0540Jw2);
            C1951k70 c1951k70C2 = c0560Kq4.c();
            uu0 = uu1;
            C1101bX c1101bXG3 = uu0.g(c1951k70C2, 1500000L);
            str9 = (String) c1101bXG3.l;
            str8 = (String) c1101bXG3.m;
            if (AbstractC2506pt.B(str8, str9) != null) {
                throw new IOException("VOE rechazó la prueba de acceso");
            }
        } else {
            str = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
            str2 = "/";
            uu0 = uu1;
            str3 = "User-Agent";
            str4 = "Origin";
            str5 = "Referer";
        }
        Iterator it2 = Lc0.T(J60.IGNORE_CASE, J60.DOT_MATCHES_ALL).iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            i6 |= ((J60) it2.next()).l;
        }
        Pattern patternCompile = Pattern.compile("<script[^>]*type\\s*=\\s*[\\\"']application/json[\\\"'][^>]*>(.*?)</script>", C3325yL.p(i6));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str8);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, str8);
        String string3 = (jnA == null || (str6 = (String) ((HN) jnA.a()).get(1)) == null) ? null : AbstractC1119bh0.E0(str6).toString();
        String str12 = string3 == null ? "" : string3;
        JN jnB = AbstractC0786Tj.a.b(str8, 0);
        String str13 = jnB != null ? (String) AbstractC0911Ye.e0(1, jnB.a()) : null;
        TH thA = str13 != null ? AbstractC0786Tj.a(str13) : str12.length() > 0 ? AbstractC0786Tj.a(str12) : null;
        if (thA == null || (qhI = thA.i("source")) == null || (strH = qhI.h()) == null) {
            JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']", "compile(...)", str8, "matcher(...)"), 0, str8);
            strH = jnA2 != null ? (String) AbstractC0911Ye.e0(1, jnA2.a()) : null;
            if (strH == null) {
                throw new IOException("El extractor VOE no encontró el HLS");
            }
        }
        Uu0.f(uu0, strH);
        C1233cq c1233cq = C1233cq.l;
        C1101bX c1101bX2 = new C1101bX(str3, str);
        C1101bX c1101bX3 = new C1101bX(str5, str9);
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str9);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null) {
            throw new IOException("La URL final VOE no es válida");
        }
        C2349oE c2349oEF3 = c2446pEB.f();
        c2349oEF3.d(str2);
        c2349oEF3.i = null;
        c2349oEF3.h = null;
        return new Js0(strH, AbstractC3327yN.z(c1101bX2, c1101bX3, new C1101bX(str4, AbstractC1119bh0.m0(c2349oEF3.b().i, str2))), "hls", (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) c1233cq, false, 3576);
    }
}
