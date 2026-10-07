package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.f80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1465f80 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(C1270d80 c1270d80, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c1270d80);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c1270d80, sparseArray);
                }
                sparseArray.append(i, new C1172c80(colorStateList, c1270d80.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, AP ap, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C2841tM c2841tM = Lp0.b;
            Typeface typeface = (Typeface) c2841tM.f(Lp0.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (ap != null) {
                    new Handler(Looper.getMainLooper()).post(new O3(ap, 15, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0384Dw interfaceC0384DwS = Ou0.s(resources.getXml(i), resources);
                        if (interfaceC0384DwS != null) {
                            typefaceA = Lp0.a(context, interfaceC0384DwS, resources, i, string, typedValue.assetCookie, i2, ap, z);
                        } else if (ap != null) {
                            ap.b(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceJ = Lp0.a.j(context, resources, i, string, i2);
                        if (typefaceJ != null) {
                            c2841tM.k(Lp0.b(resources, i, string, i4, i2), typefaceJ);
                        }
                        if (ap != null) {
                            if (typefaceJ != null) {
                                new Handler(Looper.getMainLooper()).post(new O3(ap, 15, typefaceJ));
                            } else {
                                ap.b(-3);
                            }
                        }
                        typefaceA = typefaceJ;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (ap != null) {
                        ap.b(-3);
                    }
                }
            }
        } else if (ap != null) {
            ap.b(-3);
        }
        if (typefaceA != null || ap != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
