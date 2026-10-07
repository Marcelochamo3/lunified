package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: o.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3021v9 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String[] b = {"standard", "accelerate", "decelerate", "linear"};
    public static final InterfaceC2159mI[] c = new InterfaceC2159mI[0];
    public static final C3325yL d = new C3325yL();

    public static long A(InputStream inputStream, int i) throws IOException {
        byte[] bArrY = y(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrY[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final void B(View view, K90 k90) {
        AbstractC1474fG.j(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, k90);
    }

    public static String C(char c2) {
        String strValueOf = String.valueOf(c2);
        AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static String D(char c2, Locale locale) {
        String strValueOf = String.valueOf(c2);
        AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c2);
            AbstractC1474fG.h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase2, "toUpperCase(...)");
            return !AbstractC1474fG.b(upperCase, upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static void E(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void F(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        E(byteArrayOutputStream, i, 2);
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void b(StringBuilder sb, Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        if (interfaceC0412Ey != null) {
            sb.append((CharSequence) interfaceC0412Ey.b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static String c(String str, String str2) {
        Charset charset = StandardCharsets.ISO_8859_1;
        AbstractC1474fG.i(charset, "ISO_8859_1");
        AbstractC1474fG.j(str, "username");
        AbstractC1474fG.j(str2, "password");
        String str3 = str + ':' + str2;
        C2468pa c2468pa = C2468pa.f972o;
        AbstractC1474fG.j(str3, "<this>");
        byte[] bytes = str3.getBytes(charset);
        AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
        return "Basic ".concat(new C2468pa(bytes).a());
    }

    public static byte[] d(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static void e(int i) {
        ZF zf = new ZF(2, 36, 1);
        if (2 > i || i > zf.m) {
            StringBuilder sbR = AbstractC1674hK.r("radix ", i, " was not in valid range ");
            sbR.append(new ZF(2, 36, 1));
            throw new IllegalArgumentException(sbR.toString());
        }
    }

    public static byte[] f(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static ObjectAnimator g(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, DecelerateInterpolator decelerateInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transitionPosition);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        int iRound = Math.round(f - translationX) + i;
        int iRound2 = Math.round(f2 - translationY) + i2;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        Mm0 mm0 = new Mm0(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(mm0);
        objectAnimatorOfFloat.addListener(mm0);
        objectAnimatorOfFloat.addPauseListener(mm0);
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        return objectAnimatorOfFloat;
    }

    public static int h(char c2) {
        e(16);
        int iDigit = Character.digit((int) c2, 16);
        Integer numValueOf = Integer.valueOf(iDigit);
        if (iDigit < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=16");
    }

    public static final boolean i(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static AbstractC1976kU j(String str, String str2) {
        if (AbstractC1474fG.b("integer", str)) {
            return AbstractC1976kU.b;
        }
        if (AbstractC1474fG.b("integer[]", str)) {
            return AbstractC1976kU.d;
        }
        if (AbstractC1474fG.b("List<Int>", str)) {
            return AbstractC1976kU.e;
        }
        if (AbstractC1474fG.b("long", str)) {
            return AbstractC1976kU.f;
        }
        if (AbstractC1474fG.b("long[]", str)) {
            return AbstractC1976kU.g;
        }
        if (AbstractC1474fG.b("List<Long>", str)) {
            return AbstractC1976kU.h;
        }
        if (AbstractC1474fG.b("boolean", str)) {
            return AbstractC1976kU.l;
        }
        if (AbstractC1474fG.b("boolean[]", str)) {
            return AbstractC1976kU.m;
        }
        if (AbstractC1474fG.b("List<Boolean>", str)) {
            return AbstractC1976kU.n;
        }
        boolean zB = AbstractC1474fG.b("string", str);
        C1390eU c1390eU = AbstractC1976kU.f867o;
        if (zB) {
            return c1390eU;
        }
        if (AbstractC1474fG.b("string[]", str)) {
            return AbstractC1976kU.p;
        }
        if (AbstractC1474fG.b("List<String>", str)) {
            return AbstractC1976kU.q;
        }
        if (AbstractC1474fG.b("float", str)) {
            return AbstractC1976kU.i;
        }
        if (AbstractC1474fG.b("float[]", str)) {
            return AbstractC1976kU.j;
        }
        if (AbstractC1474fG.b("List<Float>", str)) {
            return AbstractC1976kU.k;
        }
        if (AbstractC1474fG.b("reference", str)) {
            return AbstractC1976kU.c;
        }
        if (str == null || str.length() == 0) {
            return c1390eU;
        }
        try {
            String strConcat = (!AbstractC1899jh0.U(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean zL = AbstractC1899jh0.L(str, "[]", false);
            if (zL) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
                AbstractC1474fG.i(strConcat, "substring(...)");
            }
            AbstractC1976kU abstractC1976kUX = x(Class.forName(strConcat), zL);
            if (abstractC1976kUX != null) {
                return abstractC1976kUX;
            }
            throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Calendar k(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static ColorStateList l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListV;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListV = AbstractC1459f50.v(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListV;
    }

    public static ColorStateList m(Context context, RN rn, int i) {
        int resourceId;
        ColorStateList colorStateListV;
        TypedArray typedArray = (TypedArray) rn.n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListV = AbstractC1459f50.v(context, resourceId)) == null) ? rn.s(i) : colorStateListV;
    }

    public static Drawable n(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableL;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableL = Ou0.l(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableL;
    }

    public static final C0548Ke o(Ut0 ut0) {
        C0548Ke c0548Ke;
        AbstractC1474fG.j(ut0, "<this>");
        synchronized (d) {
            c0548Ke = (C0548Ke) ut0.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0548Ke == null) {
                InterfaceC1022ai interfaceC1022ai = C1038aq.l;
                try {
                    C3362yl c3362yl = AbstractC1910jn.a;
                    interfaceC1022ai = ((C1079bB) FM.a).q;
                } catch (IllegalStateException | C1783iV unused) {
                }
                C0548Ke c0548Ke2 = new C0548Ke(interfaceC1022ai.Q(U9.a()));
                ut0.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0548Ke2);
                c0548Ke = c0548Ke2;
            }
        }
        return c0548Ke;
    }

    public static C2903ty p(C2133m1 c2133m1, SQLiteDatabase sQLiteDatabase) {
        AbstractC1474fG.j(c2133m1, "refHolder");
        AbstractC1474fG.j(sQLiteDatabase, "sqLiteDatabase");
        C2903ty c2903ty = (C2903ty) c2133m1.m;
        if (c2903ty != null && AbstractC1474fG.b(c2903ty.l, sQLiteDatabase)) {
            return c2903ty;
        }
        C2903ty c2903ty2 = new C2903ty(sQLiteDatabase);
        c2133m1.m = c2903ty2;
        return c2903ty2;
    }

    public static final int q(U5 u5, Object obj, int i) {
        AbstractC1474fG.j(u5, "<this>");
        int i2 = u5.n;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iD = Nr0.d(u5.n, i, u5.l);
            if (iD < 0 || AbstractC1474fG.b(obj, u5.m[iD])) {
                return iD;
            }
            int i3 = iD + 1;
            while (i3 < i2 && u5.l[i3] == i) {
                if (AbstractC1474fG.b(obj, u5.m[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iD - 1; i4 >= 0 && u5.l[i4] == i; i4--) {
                if (AbstractC1474fG.b(obj, u5.m[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static /* synthetic */ InterfaceC2300nn r(AH ah, boolean z, EH eh, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ((JH) ah).T(z, (i & 2) != 0, eh);
    }

    public static boolean s(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean t() {
        return C3118w9.d;
    }

    public static boolean u(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static C2613qy v(byte[] bArr) {
        C2562qX c2562qX = new C2562qX(bArr);
        if (c2562qX.c < 32) {
            return null;
        }
        c2562qX.F(0);
        if (c2562qX.g() != c2562qX.a() + 4 || c2562qX.g() != 1886614376) {
            return null;
        }
        int iB = AbstractC3015v6.B(c2562qX.g());
        if (iB > 1) {
            AP.z();
            return null;
        }
        UUID uuid = new UUID(c2562qX.o(), c2562qX.o());
        if (iB == 1) {
            c2562qX.G(c2562qX.x() * 16);
        }
        int iX = c2562qX.x();
        if (iX != c2562qX.a()) {
            return null;
        }
        ?? r2 = new byte[iX];
        c2562qX.e(r2, 0, iX);
        return new C2613qy(uuid, iB, r2, 9);
    }

    public static byte[] w(byte[] bArr, UUID uuid) {
        C2613qy c2613qyV = v(bArr);
        if (c2613qyV == null) {
            return null;
        }
        UUID uuid2 = (UUID) c2613qyV.n;
        if (uuid.equals(uuid2)) {
            return (byte[]) c2613qyV.f996o;
        }
        uuid.toString();
        Objects.toString(uuid2);
        AP.z();
        return null;
    }

    public static AbstractC1976kU x(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new C1586gU(cls) : new C1684hU(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new C1488fU(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new C1782iU(cls) : new C1878jU(cls);
        }
        return null;
    }

    public static byte[] y(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC1674hK.n(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] z(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[C1672hI.a.g];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }
}
