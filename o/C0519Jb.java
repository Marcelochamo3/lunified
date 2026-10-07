package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaDrmException;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import androidx.cardview.widget.CardView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0519Jb implements InterfaceC3432zV, InterfaceC1958kC, InterfaceC0763Sm, InterfaceC1912jo, InterfaceC0561Kr, O20, InterfaceC0354Cs, InterfaceC0406Es, InterfaceC0693Pu, T70 {
    public static C0519Jb m;
    public final /* synthetic */ int l;

    public /* synthetic */ C0519Jb(int i) {
        this.l = i;
    }

    public static final C0676Pd B(C0519Jb c0519Jb, String str) {
        C0676Pd c0676Pd = new C0676Pd(str);
        C0676Pd.d.put(str, c0676Pd);
        return c0676Pd;
    }

    public static ByteArrayInputStream C(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public static String E(Calendar calendar) {
        if (calendar != null) {
            return AbstractC0397Ej.m(calendar, "yyyy-MM-dd'T'HH:mm'Z'");
        }
        return null;
    }

    public static boolean F(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable == null || inputConnection == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z) {
            int iMax = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z2 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z2) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z2) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z2 = true;
                        }
                        selectionStart = -1;
                        break;
                    }
                }
            }
            selectionStart = -1;
            break;
            int iMax2 = Math.max(i2, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z3) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z3) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z3 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            iMin = Math.min(selectionEnd + i2, editable.length());
        }
        Sp0[] sp0Arr = (Sp0[]) editable.getSpans(selectionStart, iMin, Sp0.class);
        if (sp0Arr == null || sp0Arr.length <= 0) {
            return false;
        }
        for (Sp0 sp0 : sp0Arr) {
            int spanStart = editable.getSpanStart(sp0);
            int spanEnd = editable.getSpanEnd(sp0);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static Calendar H(String str) {
        if (str != null) {
            return AbstractC0397Ej.K(str);
        }
        return null;
    }

    public static Ma0 I(String str) {
        if (str != null) {
            return new Ma0(str, 0, null, null, null, null, 60);
        }
        return null;
    }

    public static C2109lo0 L(String str) {
        if (str == null) {
            return null;
        }
        return new C2109lo0(str, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
    }

    public synchronized C0676Pd D(String str) {
        C0676Pd c0676Pd;
        String strConcat;
        try {
            AbstractC1474fG.j(str, "javaName");
            LinkedHashMap linkedHashMap = C0676Pd.d;
            c0676Pd = (C0676Pd) linkedHashMap.get(str);
            if (c0676Pd == null) {
                if (AbstractC1899jh0.U(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC1899jh0.U(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    AbstractC1474fG.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c0676Pd = (C0676Pd) linkedHashMap.get(strConcat);
                if (c0676Pd == null) {
                    c0676Pd = new C0676Pd(str);
                }
                linkedHashMap.put(str, c0676Pd);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0676Pd;
    }

    public void G(C2720s4 c2720s4, float f) {
        H80 h80 = (H80) ((Drawable) c2720s4.m);
        CardView cardView = (CardView) c2720s4.n;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != h80.e || h80.f != useCompatPadding || h80.g != preventCornerOverlap) {
            h80.e = f;
            h80.f = useCompatPadding;
            h80.g = preventCornerOverlap;
            h80.b(null);
            h80.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c2720s4.m0(0, 0, 0, 0);
            return;
        }
        H80 h81 = (H80) ((Drawable) c2720s4.m);
        float f2 = h81.e;
        float f3 = h81.a;
        int iCeil = (int) Math.ceil(I80.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(I80.b(f2, f3, cardView.getPreventCornerOverlap()));
        c2720s4.m0(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // o.InterfaceC1958kC
    public InterfaceC3046vX J(C1568gC c1568gC, C1177cC c1177cC) {
        return new C1860jC(c1568gC, c1177cC);
    }

    @Override // o.InterfaceC1916jq
    public boolean K(Object obj, File file, FW fw) throws Throwable {
        try {
            AbstractC2274na.d(((C0854Vz) ((C0672Oz) ((M70) obj).get()).l.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    @Override // o.InterfaceC3432zV
    public Object M() {
        switch (this.l) {
            case 2:
                return new LinkedHashSet();
            case 3:
                return new ArrayList();
            case 4:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // o.InterfaceC1958kC
    public InterfaceC3046vX P() {
        return new C1860jC(C1568gC.l, null);
    }

    @Override // o.InterfaceC0693Pu
    public Class b() {
        return ParcelFileDescriptor.class;
    }

    @Override // o.InterfaceC0561Kr
    public /* synthetic */ void d(byte[] bArr, C3436zZ c3436zZ) {
    }

    @Override // o.InterfaceC0561Kr
    public void e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0354Cs
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC0561Kr
    public Map g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0354Cs
    public void i(InterfaceC2664rb0 interfaceC2664rb0) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC0561Kr
    public byte[] j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0561Kr
    public C0535Jr k() {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0561Kr
    public void l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0763Sm
    public File m(InterfaceC2450pI interfaceC2450pI) {
        return null;
    }

    @Override // o.InterfaceC0561Kr
    public C0509Ir n(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0561Kr
    public int o() {
        return 1;
    }

    @Override // o.O20
    public CharSequence p(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.e0) ? editTextPreference.l.getString(R.string.not_set) : editTextPreference.e0;
    }

    @Override // o.InterfaceC0406Es
    public Object q() {
        return new ArrayList();
    }

    @Override // o.InterfaceC0354Cs
    public InterfaceC1324dm0 s(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC0693Pu
    public Object t(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // o.InterfaceC0561Kr
    public InterfaceC2871ti v(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC0561Kr
    public boolean w(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.T70
    public int x(FW fw) {
        return 1;
    }

    @Override // o.InterfaceC0561Kr
    public byte[] y() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // o.InterfaceC0693Pu
    public void z(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public C0519Jb(C2994uv c2994uv, C3289xx c3289xx) {
        this.l = 29;
    }

    @Override // o.InterfaceC1912jo
    public void A() {
    }

    @Override // o.InterfaceC0561Kr
    public void a() {
    }

    @Override // o.InterfaceC0763Sm
    public void clear() {
    }

    @Override // o.InterfaceC0561Kr
    public void h(byte[] bArr) {
    }

    @Override // o.InterfaceC0561Kr
    public void u(C0320Bk c0320Bk) {
    }

    @Override // o.InterfaceC0763Sm
    public void c(InterfaceC2450pI interfaceC2450pI, Na0 na0) {
    }

    @Override // o.InterfaceC1912jo
    public void r(Bitmap bitmap, Q8 q8) {
    }
}
