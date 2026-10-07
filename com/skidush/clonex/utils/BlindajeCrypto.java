package com.skidush.clonex.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import o.AbstractC0911Ye;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC1889jc0;
import o.C1233cq;
import o.C2591qn;
import o.E1;
import o.Vb0;
import o.X10;
import o.X8;

/* JADX INFO: loaded from: classes.dex */
public final class BlindajeCrypto {
    public static final BlindajeCrypto a;

    static {
        BlindajeCrypto blindajeCrypto = new BlindajeCrypto();
        a = blindajeCrypto;
        System.loadLibrary("blindaje");
        if (!blindajeCrypto.nativeContentCryptoSelfTest()) {
            throw new IllegalStateException("Fallo de integridad criptográfica".toString());
        }
    }

    public static LinkedHashMap l(String str, byte[] bArr, long j) {
        BlindajeCrypto blindajeCrypto = a;
        AbstractC1474fG.j(str, "requestUri");
        AbstractC1474fG.j(bArr, "body");
        String upperCase = "POST".toUpperCase(Locale.ROOT);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        if (!AbstractC1474fG.b(upperCase, "GET") && !AbstractC1474fG.b(upperCase, "POST")) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String strNativeSignHeaders = blindajeCrypto.nativeSignHeaders(j, upperCase, str, bArr, AbstractC1889jc0.c());
        if (strNativeSignHeaders == null) {
            throw new IllegalStateException("Sesión inválida al firmar");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : AbstractC1119bh0.s0(strNativeSignHeaders, new char[]{'\n'}, 0, 6)) {
            int iD0 = AbstractC1119bh0.d0(str2, '\t', 0, false, 6);
            if (iD0 > 0) {
                String strSubstring = str2.substring(0, iD0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iD0 + 1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                linkedHashMap.put(strSubstring, strSubstring2);
            }
        }
        return linkedHashMap;
    }

    private final native String nativeClaroStreamType(boolean z);

    private final native void nativeClearSession();

    private final native boolean nativeContentCryptoSelfTest();

    private final native boolean nativeContentKeyReady();

    private final native String nativeDecryptContentGcm(String str, String str2, String str3);

    private final native String nativeDecryptResponse(long j, String str);

    private final native String nativeFlowRequestProfile();

    private final native boolean nativeIsFlowUrl(String str);

    private final native long nativeOpenSession(String str, String str2, String str3);

    private final native String nativeProxyAttemptPlan(String str, boolean z);

    private final native boolean nativeProxyCredentialUsable(long j, long j2, String str, String str2);

    private final native String nativeResolveFlowRedirect(String str, String str2);

    private final native String nativeSignHeaders(long j, String str, String str2, byte[] bArr, long j2);

    private final native byte[] nativeSolveAltchaPbkdf2(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3, int i4);

    private final native String nativeStartKeyExchange();

    private final native int nativeTigoErrorAction(String str, boolean z, boolean z2, boolean z3);

    public final String a() {
        String strNativeClaroStreamType = nativeClaroStreamType(false);
        if (strNativeClaroStreamType != null) {
            return strNativeClaroStreamType;
        }
        throw new IllegalStateException("Formato de reproducción no disponible");
    }

    public final void b() {
        nativeClearSession();
    }

    public final boolean c() {
        return nativeContentKeyReady();
    }

    public final String d(String str, String str2, String str3) {
        AbstractC1474fG.j(str, "iv");
        AbstractC1474fG.j(str2, "tag");
        AbstractC1474fG.j(str3, "data");
        String strNativeDecryptContentGcm = nativeDecryptContentGcm(str, str2, str3);
        if (strNativeDecryptContentGcm != null) {
            return strNativeDecryptContentGcm;
        }
        throw new IllegalStateException("No se pudo validar el contenido protegido");
    }

    public final String e(long j, String str) {
        AbstractC1474fG.j(str, "base64Body");
        String strNativeDecryptResponse = nativeDecryptResponse(j, str);
        if (strNativeDecryptResponse != null) {
            return strNativeDecryptResponse;
        }
        throw new IllegalStateException("No se pudo descifrar la respuesta");
    }

    public final X8 f() {
        String strNativeFlowRequestProfile = nativeFlowRequestProfile();
        List listQ = strNativeFlowRequestProfile != null ? Vb0.Q(AbstractC1119bh0.i0(strNativeFlowRequestProfile)) : null;
        if (listQ == null) {
            listQ = C1233cq.l;
        }
        if (!(!listQ.isEmpty())) {
            throw new IllegalArgumentException("Perfil de red no disponible".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : AbstractC0911Ye.Y(1, listQ)) {
            int iD0 = AbstractC1119bh0.d0(str, '\t', 0, false, 6);
            if (iD0 > 0) {
                String strSubstring = str.substring(0, iD0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(iD0 + 1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                linkedHashMap.put(strSubstring, strSubstring2);
            }
        }
        return new X8((String) AbstractC0911Ye.b0(listQ), linkedHashMap);
    }

    public final boolean g(String str) {
        AbstractC1474fG.j(str, "url");
        return nativeIsFlowUrl(str);
    }

    public final long h(String str, String str2, String str3) {
        long jNativeOpenSession = nativeOpenSession(str, str2, str3);
        if (jNativeOpenSession > 0) {
            return jNativeOpenSession;
        }
        throw new IllegalArgumentException("No se pudo abrir la sesión (skx inválido)".toString());
    }

    public final List i(String str, boolean z) {
        AbstractC1474fG.j(str, "preferredProvider");
        return Vb0.Q(new C2591qn(Vb0.N(AbstractC1119bh0.i0(nativeProxyAttemptPlan(str, z)), E1.p), X10.v, 0));
    }

    public final boolean j(long j, String str, String str2) {
        AbstractC1474fG.j(str, "selection");
        return nativeProxyCredentialUsable(j, System.currentTimeMillis(), str, str2);
    }

    public final String k(String str, String str2) {
        AbstractC1474fG.j(str, "selectedUrl");
        String strNativeResolveFlowRedirect = nativeResolveFlowRedirect(str, str2);
        if (strNativeResolveFlowRedirect != null) {
            return strNativeResolveFlowRedirect;
        }
        throw new IllegalArgumentException("Respuesta de red no válida");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3) {
        return nativeSolveAltchaPbkdf2(bArr, bArr2, i, i2, bArr3, 100000, i3);
    }

    public final String n() {
        return nativeStartKeyExchange();
    }

    public final int o(String str, boolean z, boolean z2, boolean z3) {
        return nativeTigoErrorAction(str, z, z2, z3);
    }
}
