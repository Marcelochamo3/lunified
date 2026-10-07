package o;

import android.R;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Shader;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Proxy;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: o.eA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1370eA {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final C2147m8 l = new C2147m8(12);
    public static final X9 m = new X9(4);
    public static final X9 n = new X9(5);

    public static boolean A(String str, String str2) {
        String lowerCase;
        String string;
        AbstractC1474fG.j(str2, "source");
        if (str == null || (string = AbstractC1119bh0.E0(str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        }
        Locale locale = Locale.ROOT;
        String lowerCase2 = str2.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        if (!AbstractC1474fG.b(lowerCase, "dash")) {
            String lowerCase3 = "application/dash+xml".toLowerCase(locale);
            AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
            if (!AbstractC1474fG.b(lowerCase, lowerCase3) && !AbstractC1119bh0.W(lowerCase2, ".mpd", false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean B(String str, String str2) {
        String lowerCase;
        String string;
        AbstractC1474fG.j(str2, "source");
        if (str == null || (string = AbstractC1119bh0.E0(str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        }
        Locale locale = Locale.ROOT;
        String lowerCase2 = str2.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        if (!AbstractC1474fG.b(lowerCase, "hls")) {
            String lowerCase3 = "application/x-mpegURL".toLowerCase(locale);
            AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
            if (!AbstractC1474fG.b(lowerCase, lowerCase3) && !AbstractC1474fG.b(lowerCase, "application/vnd.apple.mpegurl") && !AbstractC1899jh0.U(lowerCase2, "data:application/vnd.apple.mpegurl", false) && !AbstractC1899jh0.U(lowerCase2, "data:application/x-mpegurl", false) && !AbstractC1119bh0.W(lowerCase2, ".m3u8", false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean C(String str, boolean z) {
        AbstractC1474fG.j(str, "value");
        C2446pE c2446pEB = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
        }
        if (c2446pEB == null || c2446pEB.b.length() > 0 || c2446pEB.c.length() > 0) {
            return false;
        }
        if (c2446pEB.j) {
            return true;
        }
        String lowerCase = c2446pEB.d.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return !(AbstractC1474fG.b(lowerCase, "localhost") || AbstractC1899jh0.L(lowerCase, ".localhost", false) || AbstractC1899jh0.U(lowerCase, "127.", false) || AbstractC1474fG.b(lowerCase, "::1")) || (z && AbstractC2065lL.a(str));
    }

    public static boolean D(Uri uri) {
        String host;
        Object objK;
        boolean z = true;
        if (!AbstractC1899jh0.N(uri.getScheme(), "https", true) || (host = uri.getHost()) == null || AbstractC1899jh0.O(host)) {
            return false;
        }
        try {
            if (new URI(uri.toString()).getUserInfo() != null) {
                z = false;
            }
            objK = Boolean.valueOf(z);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj = Boolean.FALSE;
        if (objK instanceof C2439p80) {
            objK = obj;
        }
        return ((Boolean) objK).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E(ArrayList arrayList, InterfaceC0473Hh interfaceC0473Hh) {
        D7 d7;
        Iterator it;
        if (interfaceC0473Hh instanceof D7) {
            d7 = (D7) interfaceC0473Hh;
            int i2 = d7.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7.n = i2 - Integer.MIN_VALUE;
            } else {
                d7 = new D7(interfaceC0473Hh);
            }
        } else {
            d7 = new D7(interfaceC0473Hh);
        }
        Object obj = d7.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = d7.n;
        if (i3 == 0) {
            Jp0.O(obj);
            it = arrayList.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = d7.l;
            Jp0.O(obj);
        }
        while (it.hasNext()) {
            AH ah = (AH) it.next();
            d7.l = it;
            d7.n = 1;
            if (((JH) ah).W(d7) == enumC1706hi) {
                return enumC1706hi;
            }
        }
        return C2985uq0.a;
    }

    public static void F(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static TypedArray G(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static SharedPreferencesC3128wI H(Context context, String str, String str2) {
        byte[] bArrDoFinal;
        AbstractC1474fG.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        AbstractC1474fG.i(sharedPreferences, "getSharedPreferences(...)");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("lumix_proxy_store_rsa_v1")) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC1026ak.r();
                keyPairGenerator.initialize(AbstractC1026ak.C().setKeySize(C1672hI.a.g).setEncryptionPaddings("PKCS1Padding").build());
            } else {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 30);
                keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(applicationContext).setAlias("lumix_proxy_store_rsa_v1").setSubject(new X500Principal("CN=Lumix Proxy Store")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setKeySize(C1672hI.a.g).build());
            }
            keyPairGenerator.generateKeyPair();
        }
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("lumix_proxy_store_meta", 0);
        String string = sharedPreferences2.getString("wrapped_aes_key", null);
        if (string == null) {
            bArrDoFinal = new byte[32];
            new SecureRandom().nextBytes(bArrDoFinal);
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            keyStore2.load(null);
            KeyStore.Entry entry = keyStore2.getEntry("lumix_proxy_store_rsa_v1", null);
            AbstractC1474fG.h(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey());
            if (!sharedPreferences2.edit().putString("wrapped_aes_key", Base64.encodeToString(cipher.doFinal(bArrDoFinal), 2)).commit()) {
                throw new IllegalStateException("No se pudo proteger la clave del proxy".toString());
            }
        } else {
            KeyStore keyStore3 = KeyStore.getInstance("AndroidKeyStore");
            keyStore3.load(null);
            KeyStore.Entry entry2 = keyStore3.getEntry("lumix_proxy_store_rsa_v1", null);
            AbstractC1474fG.h(entry2, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher2.init(2, ((KeyStore.PrivateKeyEntry) entry2).getPrivateKey());
            bArrDoFinal = cipher2.doFinal(Base64.decode(string, 2));
        }
        SharedPreferencesC3128wI sharedPreferencesC3128wI = new SharedPreferencesC3128wI(sharedPreferences, new SecretKeySpec(bArrDoFinal, "AES"));
        if (!sharedPreferencesC3128wI.getBoolean("__migration_complete_v1", false)) {
            SharedPreferences sharedPreferences3 = applicationContext.getSharedPreferences(str2, 0);
            SharedPreferencesEditorC3031vI sharedPreferencesEditorC3031vI = new SharedPreferencesEditorC3031vI(sharedPreferencesC3128wI);
            Map<String, ?> all = sharedPreferences3.getAll();
            AbstractC1474fG.i(all, "getAll(...)");
            for (Map.Entry<String, ?> entry3 : all.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof String) {
                    sharedPreferencesEditorC3031vI.putString(key, (String) value);
                } else if (value instanceof Integer) {
                    sharedPreferencesEditorC3031vI.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    sharedPreferencesEditorC3031vI.putLong(key, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    sharedPreferencesEditorC3031vI.putFloat(key, ((Number) value).floatValue());
                } else if (value instanceof Boolean) {
                    sharedPreferencesEditorC3031vI.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Set) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Iterable) value) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    sharedPreferencesEditorC3031vI.putStringSet(key, AbstractC0911Ye.B0(arrayList));
                }
            }
            sharedPreferencesEditorC3031vI.putBoolean("__migration_complete_v1", true);
            if (!sharedPreferencesEditorC3031vI.commit()) {
                throw new IllegalStateException("No se pudo cifrar el almacenamiento del proxy".toString());
            }
            sharedPreferences3.edit().clear().commit();
        }
        return sharedPreferencesC3128wI;
    }

    public static CQ I(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = Lr0.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                AP.z();
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(OY.a(new C2562qX(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    AP.A("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new Vu0(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new CQ(arrayList);
    }

    public static L80 L(C2562qX c2562qX, boolean z, boolean z2) throws C2949uX {
        if (z) {
            R(3, c2562qX, false);
        }
        c2562qX.s((int) c2562qX.l(), AbstractC1402ed.c);
        long jL = c2562qX.l();
        String[] strArr = new String[(int) jL];
        for (int i2 = 0; i2 < jL; i2++) {
            strArr[i2] = c2562qX.s((int) c2562qX.l(), AbstractC1402ed.c);
        }
        if (z2 && (c2562qX.u() & 1) == 0) {
            throw C2949uX.a("framing bit expected to be set", null);
        }
        return new L80(strArr);
    }

    public static void M(String str, boolean z) throws IOException {
        AbstractC1474fG.j(str, "<this>");
        C2446pE c2446pEB = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
        }
        if (c2446pEB != null && c2446pEB.b.length() == 0 && c2446pEB.c.length() == 0) {
            if (c2446pEB.j || AbstractC2065lL.a(str)) {
                return;
            }
            if (z && C(str, false)) {
                return;
            }
        }
        throw new IOException("Transporte remoto inseguro bloqueado");
    }

    public static void N(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(AbstractC1674hK.n(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static Set O(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC1474fG.i(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static int P(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int Q(Object obj) {
        return P(obj == null ? 0 : obj.hashCode());
    }

    public static boolean R(int i2, C2562qX c2562qX, boolean z) throws C2949uX {
        if (c2562qX.a() < 7) {
            if (z) {
                return false;
            }
            throw C2949uX.a("too short header: " + c2562qX.a(), null);
        }
        if (c2562qX.u() != i2) {
            if (z) {
                return false;
            }
            throw C2949uX.a("expected header type " + Integer.toHexString(i2), null);
        }
        if (c2562qX.u() == 118 && c2562qX.u() == 111 && c2562qX.u() == 114 && c2562qX.u() == 98 && c2562qX.u() == 105 && c2562qX.u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C2949uX.a("expected characters 'vorbis'", null);
    }

    public static final JN a(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new JN(matcher, charSequence);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(ArrayList arrayList, InterfaceC0473Hh interfaceC0473Hh) {
        int iF0;
        if (arrayList.isEmpty()) {
            return C1233cq.l;
        }
        InterfaceC1323dm[] interfaceC1323dmArr = (InterfaceC1323dm[]) arrayList.toArray(new InterfaceC1323dm[0]);
        C7 c7 = new C7(interfaceC1323dmArr);
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        int length = interfaceC1323dmArr.length;
        A7[] a7Arr = new A7[length];
        for (int i2 = 0; i2 < length; i2++) {
            JH jh = (JH) interfaceC1323dmArr[i2];
            do {
                iF0 = jh.f0(jh.O());
                if (iF0 == 0) {
                    break;
                }
            } while (iF0 != 1);
            A7 a7 = new A7(c7, c1692hb);
            a7.q = jh.T(false, true, a7);
            a7Arr[i2] = a7;
        }
        B7 b7 = new B7(a7Arr);
        for (int i3 = 0; i3 < length; i3++) {
            A7 a8 = a7Arr[i3];
            a8.getClass();
            A7.s.set(a8, b7);
        }
        if (!(C1692hb.r.get(c1692hb) instanceof InterfaceC1685hV)) {
            b7.d();
        } else {
            c1692hb.A(b7);
        }
        return c1692hb.x();
    }

    public static Fc0 c(Fc0 fc0) {
        C2552qN c2552qN = fc0.l;
        c2552qN.b();
        return c2552qN.t > 0 ? fc0 : Fc0.m;
    }

    public static final Object f(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1734hw interfaceC1734hw, InterfaceC0360Cy interfaceC0360Cy, InterfaceC0827Uy interfaceC0827Uy, InterfaceC1538fw[] interfaceC1538fwArr) throws Throwable {
        C2284nf c2284nf = new C2284nf(null, interfaceC1734hw, interfaceC0360Cy, interfaceC0827Uy, interfaceC1538fwArr);
        C1830iw c1830iw = new C1830iw(interfaceC0473Hh.g(), interfaceC0473Hh, 0);
        Object objX = AP.x(c1830iw, c1830iw, c2284nf);
        return objX == EnumC1706hi.l ? objX : C2985uq0.a;
    }

    public static C3287xw g(Context context) {
        ProviderInfo providerInfo;
        C0560Kq c0560Kq;
        ApplicationInfo applicationInfo;
        C0622Nb c0476Hk = Build.VERSION.SDK_INT >= 28 ? new C0476Hk(9) : new C0622Nb(9);
        PackageManager packageManager = context.getPackageManager();
        Jp0.h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0560Kq = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrX = c0476Hk.x(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrX) {
                    arrayList.add(signature.toByteArray());
                }
                c0560Kq = new C0560Kq(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException unused) {
                c0560Kq = null;
            }
        }
        if (c0560Kq == null) {
            return null;
        }
        return new C3287xw(new C3190ww(context, c0560Kq));
    }

    public static NV h() {
        NV nvJ = j();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        nvJ.k(30L, timeUnit);
        try {
            ConcurrentHashMap concurrentHashMap = C0323Bn.a;
            C0323Bn.b(nvJ);
        } catch (Throwable unused) {
        }
        return nvJ;
    }

    public static NV i() {
        NV nv = new NV();
        nv.g(Proxy.NO_PROXY);
        nv.h(InterfaceC2339o7.a);
        X9 x9 = Sr0.a;
        ArrayList arrayList = nv.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nv.d;
        arrayList2.add(x10);
        X9 x11 = m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        return nv;
    }

    public static NV j() {
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        return nvO;
    }

    public static C1583gR k() {
        C1583gR c1583gR = new C1583gR(12);
        c1583gR.m = new OV(j());
        return c1583gR;
    }

    public static NV l() {
        Rh0 rh0 = AbstractC2011ko0.a;
        NV nvJ = j();
        nvJ.j(AbstractC2011ko0.a().b, AbstractC2011ko0.a().a);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        nvJ.k(30L, timeUnit);
        try {
            ConcurrentHashMap concurrentHashMap = C0323Bn.a;
            C0323Bn.b(nvJ);
        } catch (Throwable unused) {
        }
        return nvJ;
    }

    public static C1583gR m() {
        C1583gR c1583gR = new C1583gR(12);
        Rh0 rh0 = AbstractC2011ko0.a;
        NV nvJ = j();
        nvJ.j(AbstractC2011ko0.a().b, AbstractC2011ko0.a().a);
        c1583gR.m = new OV(nvJ);
        return c1583gR;
    }

    public static boolean n(String str, String str2) {
        AbstractC1474fG.j(str, "current");
        if (AbstractC1474fG.b(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                int i5 = i4 + 1;
                if (i4 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i3++;
                    } else if (cCharAt != ')' || (i3 = i3 - 1) != 0 || i4 == str.length() - 1) {
                    }
                    i2++;
                    i4 = i5;
                }
            }
            if (i3 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return AbstractC1474fG.b(AbstractC1119bh0.E0(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static int q(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static C2295nk0 r(Context context, C0560Kq c0560Kq) throws PackageManager.NameNotFoundException {
        Cursor cursorB;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c0560Kq.m;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC1701hf0.t("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) c0560Kq.n;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C2147m8 c2147m8 = l;
        Collections.sort(arrayList, c2147m8);
        List listX = (List) c0560Kq.p;
        if (listX == null) {
            listX = Ou0.x(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursorB = null;
            if (i2 >= listX.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listX.get(i2));
            Collections.sort(arrayList2, c2147m8);
            if (arrayList.size() == arrayList2.size()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                    i3++;
                }
            }
            i2++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C2295nk0(1, (C0488Hw[]) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        C3093vw c3093vw = Build.VERSION.SDK_INT < 24 ? new C3093vw(context, uriBuild, 0) : new C3093vw(context, uriBuild, 1);
        try {
            cursorB = c3093vw.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) c0560Kq.f370o});
            if (cursorB != null && cursorB.getCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorB.getColumnIndex("_id");
                int columnIndex3 = cursorB.getColumnIndex("file_id");
                int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorB.getColumnIndex("font_weight");
                int columnIndex6 = cursorB.getColumnIndex("font_italic");
                while (cursorB.moveToNext()) {
                    arrayList3.add(new C0488Hw(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3)), columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorB.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorB.getInt(columnIndex) : 0));
                }
            }
            return new C2295nk0(0, (C0488Hw[]) arrayList3.toArray(new C0488Hw[0]));
        } finally {
            if (cursorB != null) {
                cursorB.close();
            }
            c3093vw.a();
        }
    }

    public static C2613qy u(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        C2613qy c2613qyF;
        if (w(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C2613qy((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c2613qyF = C2613qy.f(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception unused) {
                c2613qyF = null;
            }
            if (c2613qyF != null) {
                return c2613qyF;
            }
        }
        return new C2613qy((Shader) null, (ColorStateList) null, 0);
    }

    public static String v(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i2) {
        if (w(xmlResourceParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static boolean w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int x(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static void y(Context context) {
        AbstractC1474fG.j(context, "context");
        try {
            C1813in c1813in = new C1813in();
            c1813in.n(48);
            c1813in.o(12);
            NV nvL = l();
            nvL.a = c1813in;
            nvL.c.add(new C2480pg(8));
            com.bumptech.glide.a.a(context).f34o.b().l(new RV(new OV(nvL)));
        } catch (Throwable unused) {
        }
    }

    public static boolean z(Uri uri) {
        if (!D(uri)) {
            AtomicReference atomicReference = AbstractC2065lL.a;
            String string = uri.toString();
            AbstractC1474fG.i(string, "toString(...)");
            if (!AbstractC2065lL.a(string)) {
                return false;
            }
        }
        return true;
    }

    public abstract void J(D d2, D d3);

    public abstract void K(D d2, Thread thread);

    public abstract boolean d(E e2, Object obj, Object obj2);

    public abstract boolean e(E e2, D d2, D d3);

    public abstract C3099w o(E e2);

    public abstract D p(E e2);

    public float s(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    public float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }
}
