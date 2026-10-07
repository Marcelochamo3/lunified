package o;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o.wI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC3128wI implements SharedPreferences {
    public final SharedPreferences a;
    public final SecretKeySpec b;

    public SharedPreferencesC3128wI(SharedPreferences sharedPreferences, SecretKeySpec secretKeySpec) {
        this.a = sharedPreferences;
        this.b = secretKeySpec;
    }

    public final String a(String str) {
        Object objK;
        String string = this.a.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            objK = b(string);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return (String) (objK instanceof C2439p80 ? null : objK);
    }

    public final String b(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length <= 12) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.b, new GCMParameterSpec(128, bArrDecode, 0, 12));
        byte[] bArrDoFinal = cipher.doFinal(bArrDecode, 12, bArrDecode.length - 12);
        AbstractC1474fG.i(bArrDoFinal, "doFinal(...)");
        return new String(bArrDoFinal, AbstractC1305dd.a);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        AbstractC1474fG.j(str, "key");
        return this.a.contains(str) && a(str) != null;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC3031vI(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map<String, ?> all = this.a.getAll();
        AbstractC1474fG.i(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            AbstractC1474fG.g(key);
            String strA = a(key);
            C1101bX c1101bX = strA != null ? new C1101bX(key, AbstractC1119bh0.w0(strA, ':', strA)) : null;
            if (c1101bX != null) {
                arrayList.add(c1101bX);
            }
        }
        return AbstractC3327yN.A(arrayList);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return z;
        }
        Boolean bool = null;
        if (!AbstractC1899jh0.U(strA, "b:", false)) {
            strA = null;
        }
        if (strA == null) {
            return z;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        if (AbstractC1474fG.b(strSubstring, "true")) {
            bool = Boolean.TRUE;
        } else if (AbstractC1474fG.b(strSubstring, "false")) {
            bool = Boolean.FALSE;
        }
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return f;
        }
        Float fValueOf = null;
        if (!AbstractC1899jh0.U(strA, "f:", false)) {
            strA = null;
        }
        if (strA == null) {
            return f;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        try {
            if (S90.a.d(strSubstring)) {
                fValueOf = Float.valueOf(Float.parseFloat(strSubstring));
            }
        } catch (NumberFormatException unused) {
        }
        return fValueOf != null ? fValueOf.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return i;
        }
        if (!AbstractC1899jh0.U(strA, "i:", false)) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        Integer numJ = AbstractC1802ih0.J(strSubstring);
        return numJ != null ? numJ.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return j;
        }
        if (!AbstractC1899jh0.U(strA, "l:", false)) {
            strA = null;
        }
        if (strA == null) {
            return j;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        Long lK = AbstractC1802ih0.K(strSubstring);
        return lK != null ? lK.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return str2;
        }
        if (!AbstractC1899jh0.U(strA, "s:", false)) {
            strA = null;
        }
        if (strA == null) {
            return str2;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        AbstractC1474fG.j(str, "key");
        String strA = a(str);
        if (strA == null) {
            return set;
        }
        if (!AbstractC1899jh0.U(strA, "x:", false)) {
            strA = null;
        }
        if (strA == null) {
            return set;
        }
        String strSubstring = strA.substring(2);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        List listS0 = AbstractC1119bh0.s0(strSubstring, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrDecode = Base64.decode((String) it.next(), 2);
            AbstractC1474fG.i(bArrDecode, "decode(...)");
            arrayList2.add(new String(bArrDecode, AbstractC1305dd.a));
        }
        return AbstractC0911Ye.B0(arrayList2);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        AbstractC1474fG.j(onSharedPreferenceChangeListener, "listener");
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        AbstractC1474fG.j(onSharedPreferenceChangeListener, "listener");
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
