package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.skidush.clonex.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cif {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int iE;
        float f;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = O40.a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(i, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i, -65281);
                }
                float f2 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i4);
                boolean z = f3 >= 0.0f && f3 <= 100.0f;
                if (f2 != 1.0f || z) {
                    int i7 = AbstractC0397Ej.i((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                    if (z) {
                        C0933Za c0933ZaA = C0933Za.a(color);
                        Hu0 hu0 = Hu0.k;
                        float f4 = c0933ZaA.b;
                        if (f4 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
                            float f5 = c0933ZaA.a;
                            float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                            float f6 = f4;
                            C0933Za c0933Za = null;
                            boolean z2 = true;
                            float f7 = 0.0f;
                            while (true) {
                                if (Math.abs(f7 - f4) < 0.4f) {
                                    depth2 = depth2;
                                    if (c0933Za != null) {
                                        iE = c0933Za.c(hu0);
                                        break;
                                    }
                                    iE = AbstractC1474fG.E(f3);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = 1000.0f;
                                float f10 = 0.0f;
                                float f11 = 100.0f;
                                C0933Za c0933Za2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        break;
                                    }
                                    float f12 = ((f11 - f10) / 2.0f) + f10;
                                    int iC = C0933Za.b(f12, f6, fMin).c(Hu0.k);
                                    float fJ = AbstractC1474fG.J(Color.red(iC));
                                    float fJ2 = AbstractC1474fG.J(Color.green(iC));
                                    float fJ3 = AbstractC1474fG.J(Color.blue(iC));
                                    float[] fArr = AbstractC1474fG.d[1];
                                    float f13 = ((fJ3 * fArr[2]) + ((fJ2 * fArr[1]) + (fJ * fArr[0]))) / 100.0f;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f3 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C0933Za c0933ZaA2 = C0933Za.a(iC);
                                        C0933Za c0933ZaB = C0933Za.b(c0933ZaA2.c, c0933ZaA2.b, fMin);
                                        f = f12;
                                        float f14 = c0933ZaA2.d - c0933ZaB.d;
                                        fMin = fMin;
                                        float f15 = c0933ZaA2.e - c0933ZaB.e;
                                        float f16 = c0933ZaA2.f - c0933ZaB.f;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            c0933Za2 = c0933ZaA2;
                                            f9 = fPow;
                                            f8 = fAbs;
                                        }
                                    } else {
                                        f = f12;
                                        fMin = fMin;
                                    }
                                    if (f8 == 0.0f && f9 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f3) {
                                        f10 = f;
                                    } else {
                                        f11 = f;
                                    }
                                    depth2 = depth2;
                                    fMin = fMin;
                                }
                                C0933Za c0933Za3 = c0933Za2;
                                if (!z2) {
                                    if (c0933Za3 == null) {
                                        f4 = f6;
                                    } else {
                                        c0933Za = c0933Za3;
                                        f7 = f6;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                } else {
                                    if (c0933Za3 != null) {
                                        iE = c0933Za3.c(hu0);
                                        break;
                                    }
                                    f6 = ((f4 - f7) / 2.0f) + f7;
                                    z2 = false;
                                }
                            }
                        } else {
                            depth2 = depth2;
                            iE = AbstractC1474fG.E(f3);
                        }
                        color = iE;
                    } else {
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i7 << 24);
                } else {
                    depth2 = depth2;
                }
                int i8 = i2 + 1;
                if (i8 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i8 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i8;
                depth2 = depth2;
                r4 = 1;
                i = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
