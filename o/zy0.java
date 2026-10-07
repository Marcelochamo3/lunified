package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContentRating;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zy0 {
    public static final C2496po l = new C2496po(25);
    public static final boolean[] m = new boolean[3];
    public static final TvContentRating[] n = new TvContentRating[0];

    public static TypedValue A(int i, Context context, String str) {
        TypedValue typedValueY = y(context, i);
        if (typedValueY != null) {
            return typedValueY;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static Br0 B(Context context) {
        AbstractC1474fG.j(context, "context");
        Integer numA = Cr0.l.a();
        Br0 br0 = null;
        Object obj = null;
        if (numA != null) {
            int iIntValue = numA.intValue();
            C0404Eq c0404Eq = Br0.p;
            c0404Eq.getClass();
            G g = new G(0, c0404Eq);
            while (g.hasNext()) {
                Object next = g.next();
                if (((Br0) next).l == iIntValue) {
                    obj = next;
                    break;
                }
            }
            br0 = (Br0) obj;
        }
        if (br0 != null) {
            return br0;
        }
        return (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? Br0.TV : Br0.MOBILE;
    }

    public static final void C(View view, InterfaceC1283dK interfaceC1283dK) {
        AbstractC1474fG.j(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1283dK);
    }

    public static final Object D(InterfaceC1022ai interfaceC1022ai, Object obj, Object obj2, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        Object objI = Ou0.I(interfaceC1022ai, obj2);
        try {
            Yf0 yf0 = new Yf0(interfaceC0473Hh, interfaceC1022ai);
            Jp0.d(2, interfaceC0775Sy);
            Object objI2 = interfaceC0775Sy.i(obj, yf0);
            Ou0.y(interfaceC1022ai, objI);
            if (objI2 == EnumC1706hi.l) {
                AbstractC1474fG.j(interfaceC0473Hh, "frame");
            }
            return objI2;
        } catch (Throwable th) {
            Ou0.y(interfaceC1022ai, objI);
            throw th;
        }
    }

    public static final C0421Fh c(InterfaceC1022ai interfaceC1022ai) {
        if (interfaceC1022ai.q(C2691rp.v) == null) {
            interfaceC1022ai = interfaceC1022ai.Q(new DH(null));
        }
        return new C0421Fh(interfaceC1022ai);
    }

    public static final void d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static void g(Context context, Br0 br0) {
        Class cls;
        Br0 br0B = B(context);
        Cr0.l.e(Integer.valueOf(br0.l));
        Cr0.f205o.d(Boolean.TRUE);
        if (br0B == br0) {
            return;
        }
        int iOrdinal = br0.ordinal();
        if (iOrdinal == 0) {
            cls = MainMobileActivity.class;
        } else {
            if (iOrdinal != 1) {
                throw new C0730Rf();
            }
            cls = MainTvActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.addFlags(268468224);
        context.startActivity(intent);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }

    public static boolean h(CX[] cxArr, CX[] cxArr2) {
        if (cxArr == null || cxArr2 == null || cxArr.length != cxArr2.length) {
            return false;
        }
        for (int i = 0; i < cxArr.length; i++) {
            CX cx = cxArr[i];
            char c = cx.a;
            CX cx2 = cxArr2[i];
            if (c != cx2.a || cx.b.length != cx2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static void i(InterfaceC1608gi interfaceC1608gi) {
        AH ah = (AH) interfaceC1608gi.t().q(C2691rp.v);
        if (ah != null) {
            ah.f(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC1608gi).toString());
        }
    }

    public static void j(C0757Sg c0757Sg, C2742sK c2742sK, C0731Rg c0731Rg) {
        c0731Rg.f492o = -1;
        c0731Rg.p = -1;
        int i = c0757Sg.p0[0];
        int[] iArr = c0731Rg.p0;
        if (i != 2 && iArr[0] == 4) {
            C0394Eg c0394Eg = c0731Rg.I;
            int i2 = c0394Eg.g;
            int iQ = c0757Sg.q();
            C0394Eg c0394Eg2 = c0731Rg.K;
            int i3 = iQ - c0394Eg2.g;
            c0394Eg.i = c2742sK.k(c0394Eg);
            c0394Eg2.i = c2742sK.k(c0394Eg2);
            c2742sK.d(c0394Eg.i, i2);
            c2742sK.d(c0394Eg2.i, i3);
            c0731Rg.f492o = 2;
            c0731Rg.Y = i2;
            int i4 = i3 - i2;
            c0731Rg.U = i4;
            int i5 = c0731Rg.b0;
            if (i4 < i5) {
                c0731Rg.U = i5;
            }
        }
        if (c0757Sg.p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0394Eg c0394Eg3 = c0731Rg.J;
        int i6 = c0394Eg3.g;
        int iK = c0757Sg.k();
        C0394Eg c0394Eg4 = c0731Rg.L;
        int i7 = iK - c0394Eg4.g;
        c0394Eg3.i = c2742sK.k(c0394Eg3);
        c0394Eg4.i = c2742sK.k(c0394Eg4);
        c2742sK.d(c0394Eg3.i, i6);
        c2742sK.d(c0394Eg4.i, i7);
        if (c0731Rg.a0 > 0 || c0731Rg.g0 == 8) {
            C0394Eg c0394Eg5 = c0731Rg.M;
            C1798if0 c1798if0K = c2742sK.k(c0394Eg5);
            c0394Eg5.i = c1798if0K;
            c2742sK.d(c1798if0K, c0731Rg.a0 + i6);
        }
        c0731Rg.p = 2;
        c0731Rg.Z = i6;
        int i8 = i7 - i6;
        c0731Rg.V = i8;
        int i9 = c0731Rg.c0;
        if (i8 < i9) {
            c0731Rg.V = i9;
        }
    }

    public static AbstractC1976kU k(TypedValue typedValue, AbstractC1976kU abstractC1976kU, AbstractC1976kU abstractC1976kU2, String str, String str2) throws XmlPullParserException {
        if (abstractC1976kU == null || abstractC1976kU == abstractC1976kU2) {
            return abstractC1976kU == null ? abstractC1976kU2 : abstractC1976kU;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static R8 l(Q8 q8, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC2880tm0.b;
                    lock.lock();
                    Bitmap bitmapC = q8.c(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapC);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapC;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            q8 = l;
        }
        return R8.c(bitmap, q8);
    }

    public static float[] m(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final Object n(InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        R90 r90 = new R90(interfaceC0473Hh, interfaceC0473Hh.g());
        return AP.x(r90, r90, interfaceC0775Sy);
    }

    public static YK o(InterfaceC1920js interfaceC1920js) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC1920js.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC1920js.c(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new YK(1, 0, length, i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[SYNTHETIC] */
    public static CX[] p(String str) {
        int i;
        String strTrim;
        float[] fArrM;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i4, i3).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrM = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = 1;
                                    int i6 = 0;
                                    while (i5 < length) {
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        for (int i7 = i5; i7 < strTrim.length(); i7++) {
                                            char cCharAt2 = strTrim.charAt(i7);
                                            if (cCharAt2 == ' ') {
                                                z = false;
                                                z3 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z = false;
                                                        z3 = true;
                                                        break;
                                                    case '-':
                                                        if (i7 == i5 || z) {
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                            z3 = true;
                                                            z4 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z2) {
                                                            z = false;
                                                            z3 = true;
                                                            z4 = true;
                                                        } else {
                                                            z = false;
                                                            z2 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z = false;
                                                        break;
                                                }
                                            } else {
                                                z = true;
                                            }
                                            if (z3) {
                                                if (i5 < i7) {
                                                    fArr[i6] = Float.parseFloat(strTrim.substring(i5, i7));
                                                    i6++;
                                                }
                                                if (z4) {
                                                    i5 = i7;
                                                } else {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                        if (i5 < i7) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i5, i7));
                                            i6++;
                                        }
                                        if (z4) {
                                            i5 = i7;
                                        } else {
                                            i5 = i7 + 1;
                                        }
                                    }
                                    fArrM = m(fArr, i6);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(AbstractC1701hf0.u("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new CX(strTrim.charAt(i2), fArrM));
                        }
                        i4 = i3;
                        i3++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i3++;
            }
            strTrim = str.substring(i4, i3).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrM = new float[i2];
                } else {
                    fArrM = new float[i2];
                }
                arrayList.add(new CX(strTrim.charAt(i2), fArrM));
            }
            i4 = i3;
            i3++;
            i2 = 0;
        }
        if (i3 - i4 != 1 || i4 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new CX(str.charAt(i4), new float[0]));
        }
        return (CX[]) arrayList.toArray(new CX[i]);
    }

    public static Path q(String str) {
        Path path = new Path();
        try {
            CX.b(p(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static CX[] r(CX[] cxArr) {
        CX[] cxArr2 = new CX[cxArr.length];
        for (int i = 0; i < cxArr.length; i++) {
            cxArr2[i] = new CX(cxArr[i]);
        }
        return cxArr2;
    }

    public static final boolean s(int i, int i2) {
        return (i & i2) == i2;
    }

    public static Set t() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static String u(String str, String str2) {
        AbstractC1474fG.j(str, "tableName");
        AbstractC1474fG.j(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static void x(Context context, String str, String str2) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(str2, "reason");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        try {
            context.getApplicationContext().getSharedPreferences("security_termination", 0).edit().putString("reason", AbstractC1701hf0.h(sb, ":", str2)).putLong("timestamp_ms", System.currentTimeMillis()).putBoolean("reported", false).putString("app_version", "5.6.5").putString("device", AbstractC1119bh0.E0(Build.MANUFACTURER + " " + Build.MODEL).toString()).putInt("sdk", Build.VERSION.SDK_INT).commit();
        } catch (Throwable unused) {
        }
    }

    public static TypedValue y(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean z(Context context, int i, boolean z) {
        TypedValue typedValueY = y(context, i);
        if (typedValueY == null || typedValueY.type != 18) {
            return z;
        }
        return typedValueY.data != 0;
    }

    public abstract View v(int i);

    public abstract boolean w();
}
