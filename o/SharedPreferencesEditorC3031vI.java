package o;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: o.vI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC3031vI implements SharedPreferences.Editor {
    public final LinkedHashMap a = new LinkedHashMap();
    public boolean b;
    public final /* synthetic */ SharedPreferencesC3128wI c;

    public SharedPreferencesEditorC3031vI(SharedPreferencesC3128wI sharedPreferencesC3128wI) {
        this.c = sharedPreferencesC3128wI;
    }

    public final SharedPreferences.Editor a() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        SharedPreferencesC3128wI sharedPreferencesC3128wI = this.c;
        SharedPreferences.Editor editorEdit = sharedPreferencesC3128wI.a.edit();
        if (this.b) {
            editorEdit.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                editorEdit.remove(str);
            } else {
                sharedPreferencesC3128wI.getClass();
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, sharedPreferencesC3128wI.b);
                byte[] bytes = str2.getBytes(AbstractC1305dd.a);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                byte[] bArrDoFinal = cipher.doFinal(bytes);
                byte[] iv = cipher.getIV();
                AbstractC1474fG.i(iv, "getIV(...)");
                AbstractC1474fG.g(bArrDoFinal);
                String strEncodeToString = Base64.encodeToString(X5.T(iv, bArrDoFinal), 2);
                AbstractC1474fG.i(strEncodeToString, "encodeToString(...)");
                editorEdit.putString(str, strEncodeToString);
            }
        }
        AbstractC1474fG.i(editorEdit, "also(...)");
        return editorEdit;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a().apply();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.b = true;
        this.a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return a().commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, "b:" + z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, "f:" + f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, "i:" + i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, "l:" + j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, str2 != null ? "s:".concat(str2) : null);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, set != null ? AbstractC0911Ye.h0(set, ",", "x:", null, C1182cH.p, 28) : null);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        AbstractC1474fG.j(str, "key");
        this.a.put(str, null);
        return this;
    }
}
