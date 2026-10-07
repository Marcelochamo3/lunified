package o;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: o.eU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1390eU extends AbstractC1976kU {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1390eU(int i, boolean z) {
        super(z);
        this.r = i;
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                return (Boolean) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
            case 1:
                Object objL = AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlin.Float");
                return (Float) objL;
            case 2:
                Object objL2 = AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                AbstractC1474fG.h(objL2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objL2;
            case 3:
                Object objL3 = AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                AbstractC1474fG.h(objL3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) objL3;
            case 4:
                Object objL4 = AbstractC1674hK.l(bundle, "bundle", str, "key", str);
                AbstractC1474fG.h(objL4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objL4;
            default:
                return (String) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
        }
    }

    @Override // o.AbstractC1976kU
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // o.AbstractC1976kU
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        boolean z;
        int i;
        String strSubstring;
        long j;
        int i2;
        switch (this.r) {
            case 0:
                AbstractC1474fG.j(str, "value");
                if (AbstractC1474fG.b(str, "true")) {
                    z = true;
                } else {
                    if (!AbstractC1474fG.b(str, "false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                AbstractC1474fG.j(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                AbstractC1474fG.j(str, "value");
                if (AbstractC1899jh0.U(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    AbstractC1474fG.i(strSubstring2, "substring(...)");
                    AbstractC3021v9.e(16);
                    i = Integer.parseInt(strSubstring2, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                AbstractC1474fG.j(str, "value");
                if (AbstractC1899jh0.L(str, "L", false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                if (AbstractC1899jh0.U(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    AbstractC1474fG.i(strSubstring3, "substring(...)");
                    AbstractC3021v9.e(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j);
            case 4:
                AbstractC1474fG.j(str, "value");
                if (AbstractC1899jh0.U(str, "0x", false)) {
                    String strSubstring4 = str.substring(2);
                    AbstractC1474fG.i(strSubstring4, "substring(...)");
                    AbstractC3021v9.e(16);
                    i2 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                AbstractC1474fG.j(str, "value");
                if (AbstractC1474fG.b(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC1474fG.j(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC1474fG.j(str, "key");
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                AbstractC1474fG.j(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                AbstractC1474fG.j(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                AbstractC1474fG.j(str, "key");
                bundle.putInt(str, iIntValue2);
                break;
            default:
                AbstractC1474fG.j(str, "key");
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // o.AbstractC1976kU
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String strEncode = Uri.encode((String) obj);
                return strEncode == null ? "null" : strEncode;
            default:
                return super.f(obj);
        }
    }
}
