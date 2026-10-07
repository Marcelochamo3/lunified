package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2613qy implements InterfaceC0561Kr, K8 {
    public static final C0633Nm p = new C0633Nm(0);
    public final /* synthetic */ int l;
    public int m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f996o;

    public /* synthetic */ C2613qy() {
        this.l = 13;
    }

    public static C2613qy f(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        int i2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = Cif.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C2613qy((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayG = AbstractC1370eA.G(resources, theme, attributeSetAsAttributeSet, O40.d);
        float f4 = !AbstractC1370eA.w(xml, "startX") ? 0.0f : typedArrayG.getFloat(8, 0.0f);
        float f5 = !AbstractC1370eA.w(xml, "startY") ? 0.0f : typedArrayG.getFloat(9, 0.0f);
        float f6 = !AbstractC1370eA.w(xml, "endX") ? 0.0f : typedArrayG.getFloat(10, 0.0f);
        float f7 = !AbstractC1370eA.w(xml, "endY") ? 0.0f : typedArrayG.getFloat(11, 0.0f);
        float f8 = !AbstractC1370eA.w(xml, "centerX") ? 0.0f : typedArrayG.getFloat(3, 0.0f);
        float f9 = !AbstractC1370eA.w(xml, "centerY") ? 0.0f : typedArrayG.getFloat(4, 0.0f);
        int i3 = !AbstractC1370eA.w(xml, "type") ? 0 : typedArrayG.getInt(2, 0);
        int color = !AbstractC1370eA.w(xml, "startColor") ? 0 : typedArrayG.getColor(0, 0);
        boolean zW = AbstractC1370eA.w(xml, "centerColor");
        int color2 = !AbstractC1370eA.w(xml, "centerColor") ? 0 : typedArrayG.getColor(7, 0);
        int color3 = !AbstractC1370eA.w(xml, "endColor") ? 0 : typedArrayG.getColor(1, 0);
        int i4 = !AbstractC1370eA.w(xml, "tileMode") ? 0 : typedArrayG.getInt(6, 0);
        float f10 = !AbstractC1370eA.w(xml, "gradientRadius") ? 0.0f : typedArrayG.getFloat(5, 0.0f);
        typedArrayG.recycle();
        int depth = xml.getDepth() + 1;
        float f11 = f10;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f7;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f6;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayG2 = AbstractC1370eA.G(resources, theme, attributeSetAsAttributeSet, O40.e);
                boolean zHasValue = typedArrayG2.hasValue(0);
                boolean zHasValue2 = typedArrayG2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayG2.getColor(0, 0);
                float f13 = typedArrayG2.getFloat(1, 0.0f);
                typedArrayG2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f;
            f5 = f2;
        }
        C2994uv c2994uv = arrayList2.size() > 0 ? new C2994uv(arrayList2, arrayList) : null;
        if (c2994uv == null) {
            c2994uv = zW ? new C2994uv(color, color2, color3) : new C2994uv(color, color3);
        }
        if (i3 == 1) {
            float f14 = f8;
            i2 = 0;
            if (f11 <= 0.0f) {
                f3 = f9;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i4 == 1) {
                f3 = f9;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i4 != 2) {
                f3 = f9;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f3 = f9;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f14, f3, f11, (int[]) c2994uv.m, (float[]) c2994uv.n, tileMode);
        } else if (i3 != 2) {
            if (i4 != 1) {
                tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i2 = 0;
            radialGradient = new LinearGradient(f4, f2, f, f12, (int[]) c2994uv.m, (float[]) c2994uv.n, tileMode3);
        } else {
            i2 = 0;
            radialGradient = new SweepGradient(f8, f9, (int[]) c2994uv.m, (float[]) c2994uv.n);
        }
        return new C2613qy(radialGradient, (ColorStateList) null, i2);
    }

    public void A(C0991aL c0991aL, int i, int i2, C0643Nw c0643Nw, int i3, Object obj, long j, long j2) {
        B(c0991aL, new C2069lP(i, i2, c0643Nw, i3, obj, Lr0.X(j), Lr0.X(j2)));
    }

    public void B(C0991aL c0991aL, C2069lP c2069lP) {
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new EP(this, hp.b, c0991aL, c2069lP, 0));
        }
    }

    public void C(C0991aL c0991aL, int i, int i2, C0643Nw c0643Nw, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        E(c0991aL, new C2069lP(i, i2, c0643Nw, i3, obj, Lr0.X(j), Lr0.X(j2)), iOException, z);
    }

    public void D(C0991aL c0991aL, int i, IOException iOException, boolean z) {
        C(c0991aL, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void E(C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z) {
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new FP(this, hp.b, c0991aL, c2069lP, iOException, z, 0));
        }
    }

    public void F(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.n;
        Context context = imageView.getContext();
        int[] iArr = T40.f;
        RN rnY = RN.y(context, attributeSet, iArr, i, 0);
        It0.o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) rnY.n, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) rnY.n;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = Ou0.l(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3077vo.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                RE.c(imageView, rnY.s(2));
            }
            if (typedArray.hasValue(3)) {
                RE.d(imageView, AbstractC3077vo.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            rnY.A();
        }
    }

    public void G(C0991aL c0991aL, int i, int i2, C0643Nw c0643Nw, int i3, Object obj, long j, long j2) {
        H(c0991aL, new C2069lP(i, i2, c0643Nw, i3, obj, Lr0.X(j), Lr0.X(j2)));
    }

    public void H(C0991aL c0991aL, C2069lP c2069lP) {
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new EP(this, hp.b, c0991aL, c2069lP, 2));
        }
    }

    public void I(Object obj, Object obj2) {
        int i = (this.m + 1) * 2;
        Object[] objArr = (Object[]) this.n;
        if (i > objArr.length) {
            this.n = Arrays.copyOf(objArr, TE.e(objArr.length, i));
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(strValueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        Object[] objArr2 = (Object[]) this.n;
        int i2 = this.m;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.m = i2 + 1;
    }

    public List J(CharSequence charSequence) {
        charSequence.getClass();
        L80 l80 = (L80) this.f996o;
        l80.getClass();
        Jf0 jf0 = new Jf0(l80, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jf0.hasNext()) {
            arrayList.add((String) jf0.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int K(String str) {
        String str2 = (String) this.n;
        int i = this.m;
        if (str2 == null) {
            AbstractC3021v9.e(i);
            return Integer.parseInt(str, i);
        }
        String string = new StringBuilder(str).reverse().toString();
        AbstractC1474fG.i(string, "toString(...)");
        int length = string.length();
        int iDoubleValue = 0;
        int i2 = 0;
        while (i2 < length) {
            double dPow = Math.pow(i, i2);
            HashMap map = (HashMap) this.f996o;
            AbstractC1474fG.g(map);
            int i3 = i2 + 1;
            String strSubstring = string.substring(i2, i3);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            Object obj = map.get(strSubstring);
            AbstractC1474fG.g(obj);
            iDoubleValue += (int) (((Number) obj).doubleValue() * dPow);
            i2 = i3;
        }
        return iDoubleValue;
    }

    public void L(C2069lP c2069lP) {
        CP cp = (CP) this.n;
        cp.getClass();
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new GP(this, hp.b, cp, c2069lP, 0));
        }
    }

    @Override // o.InterfaceC0561Kr
    public synchronized void a() {
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            ((MediaDrm) this.f996o).release();
        }
    }

    public void b() {
        C2673rg c2673rg;
        ImageView imageView = (ImageView) this.n;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC3077vo.a(drawable);
        }
        if (drawable == null || (c2673rg = (C2673rg) this.f996o) == null) {
            return;
        }
        C1846j4.e(drawable, c2673rg, imageView.getDrawableState());
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    public R60 c() {
        short[] sArr;
        char c;
        ?? r4;
        byte[] bArr;
        boolean z;
        ?? r5;
        R60 r60;
        C1083bF c1083bF = (C1083bF) this.f996o;
        if (c1083bF != null) {
            throw c1083bF.a();
        }
        int i = this.m;
        Object[] objArrCopyOf = (Object[]) this.n;
        if (i == 0) {
            r60 = R60.r;
        } else {
            int i2 = 1;
            C1083bF c1083bF2 = null;
            ?? r6 = 0;
            C1083bF c1083bF3 = null;
            C1083bF c1083bF4 = null;
            if (i == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                r60 = new R60(null, objArrCopyOf, 1);
            } else {
                AbstractC1459f50.i(i, objArrCopyOf.length >> 1);
                int iJ = AbstractC1571gF.j(i);
                if (i == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                } else {
                    int i3 = iJ - 1;
                    byte b = -1;
                    if (iJ <= 128) {
                        bArr = new byte[iJ];
                        Arrays.fill(bArr, (byte) -1);
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i) {
                            int i6 = i4 * 2;
                            int i7 = i5 * 2;
                            Object obj = objArrCopyOf[i6];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i6 ^ i2];
                            Objects.requireNonNull(obj2);
                            int iP = AbstractC1370eA.P(obj.hashCode());
                            while (true) {
                                int i8 = iP & i3;
                                int i9 = bArr[i8] & 255;
                                if (i9 == 255) {
                                    bArr[i8] = (byte) i7;
                                    if (i5 < i4) {
                                        objArrCopyOf[i7] = obj;
                                        objArrCopyOf[i7 ^ 1] = obj2;
                                    }
                                    i5++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                                    int i10 = ~i9;
                                    Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    C1083bF c1083bF5 = new C1083bF(obj, obj2, obj3);
                                    objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                                    c1083bF3 = c1083bF5;
                                    break;
                                }
                                iP = i8 + 1;
                            }
                            i4++;
                            i2 = 1;
                        }
                        if (i5 == i) {
                            r6 = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i5), c1083bF3};
                            r6 = sArr;
                        }
                    } else {
                        if (iJ <= 32768) {
                            sArr = new short[iJ];
                            Arrays.fill(sArr, (short) -1);
                            int i11 = 0;
                            for (int i12 = 0; i12 < i; i12++) {
                                int i13 = i12 * 2;
                                int i14 = i11 * 2;
                                Object obj4 = objArrCopyOf[i13];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i13 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iP2 = AbstractC1370eA.P(obj4.hashCode());
                                while (true) {
                                    int i15 = iP2 & i3;
                                    int i16 = sArr[i15] & 65535;
                                    if (i16 == 65535) {
                                        sArr[i15] = (short) i14;
                                        if (i11 < i12) {
                                            objArrCopyOf[i14] = obj4;
                                            objArrCopyOf[i14 ^ 1] = obj5;
                                        }
                                        i11++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i16 == true ? 1 : 0])) {
                                        int i17 = ~i16;
                                        Object obj6 = objArrCopyOf[i17 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        c1083bF4 = new C1083bF(obj4, obj5, obj6);
                                        objArrCopyOf[i17 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iP2 = i15 + 1;
                                }
                            }
                            if (i11 != i) {
                                bArr = new Object[]{sArr, Integer.valueOf(i11), c1083bF4};
                                r6 = bArr;
                            }
                        } else {
                            sArr = new int[iJ];
                            Arrays.fill((int[]) sArr, -1);
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < i) {
                                int i20 = i18 * 2;
                                int i21 = i19 * 2;
                                Object obj7 = objArrCopyOf[i20];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i20 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iP3 = AbstractC1370eA.P(obj7.hashCode());
                                while (true) {
                                    int i22 = iP3 & i3;
                                    ?? r15 = sArr[i22];
                                    if (r15 == b) {
                                        sArr[i22] = i21;
                                        if (i19 < i18) {
                                            objArrCopyOf[i21] = obj7;
                                            objArrCopyOf[i21 ^ 1] = obj8;
                                        }
                                        i19++;
                                        break;
                                    }
                                    if (obj7.equals(objArrCopyOf[r15])) {
                                        int i23 = r15 ^ 1;
                                        Object obj9 = objArrCopyOf[i23 == true ? 1 : 0];
                                        Objects.requireNonNull(obj9);
                                        c1083bF2 = new C1083bF(obj7, obj8, obj9);
                                        objArrCopyOf[i23 == true ? 1 : 0] = obj8;
                                        break;
                                    }
                                    iP3 = i22 + 1;
                                    b = -1;
                                }
                                i18++;
                                b = -1;
                            }
                            if (i19 != i) {
                                c = 2;
                                r4 = new Object[]{sArr, Integer.valueOf(i19), c1083bF2};
                            }
                        }
                        r6 = sArr;
                    }
                    z = r4 instanceof Object[];
                    r5 = r4;
                    if (z) {
                        Object[] objArr = (Object[]) r4;
                        this.f996o = (C1083bF) objArr[c];
                        Object obj10 = objArr[0];
                        int iIntValue = ((Integer) objArr[1]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r5 = obj10;
                        i = iIntValue;
                    }
                    r60 = new R60(r5, objArrCopyOf, i);
                }
                c = 2;
                r4 = r6;
                z = r4 instanceof Object[];
                r5 = r4;
                if (z) {
                    Object[] objArr2 = (Object[]) r4;
                    this.f996o = (C1083bF) objArr2[c];
                    Object obj11 = objArr2[0];
                    int iIntValue2 = ((Integer) objArr2[1]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r5 = obj11;
                    i = iIntValue2;
                }
                r60 = new R60(r5, objArrCopyOf, i);
            }
        }
        C1083bF c1083bF6 = (C1083bF) this.f996o;
        if (c1083bF6 == null) {
            return r60;
        }
        throw c1083bF6.a();
    }

    @Override // o.InterfaceC0561Kr
    public void d(byte[] bArr, C3436zZ c3436zZ) {
        if (Lr0.a >= 31) {
            try {
                AbstractC2516py.b((MediaDrm) this.f996o, bArr, c3436zZ);
            } catch (UnsupportedOperationException unused) {
                AP.z();
            }
        }
    }

    @Override // o.InterfaceC0561Kr
    public void e(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.f996o).restoreKeys(bArr, bArr2);
    }

    @Override // o.InterfaceC0561Kr
    public Map g(byte[] bArr) {
        return ((MediaDrm) this.f996o).queryKeyStatus(bArr);
    }

    @Override // o.InterfaceC0561Kr
    public void h(byte[] bArr) {
        ((MediaDrm) this.f996o).closeSession(bArr);
    }

    @Override // o.K8
    public J8 i(C0554Kk c0554Kk, long j) {
        long j2 = c0554Kk.f369o;
        long jR = r(c0554Kk);
        long jA = c0554Kk.A();
        c0554Kk.b(Math.max(6, ((C3091vv) this.n).c), false);
        long jR2 = r(c0554Kk);
        long jA2 = c0554Kk.A();
        if (jR > j || jR2 <= j) {
            return jR2 <= j ? new J8(-2, jR2, jA2) : new J8(-1, jR, j2);
        }
        return new J8(0, -9223372036854775807L, jA);
    }

    @Override // o.InterfaceC0561Kr
    public byte[] j(byte[] bArr, byte[] bArr2) {
        if (AbstractC2661ra.c.equals((UUID) this.n) && Lr0.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Lr0.o(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(AbstractC1402ed.c);
            } catch (JSONException e) {
                AP.g("Failed to adjust response data: ".concat(Lr0.o(bArr2)), e);
            }
        }
        return ((MediaDrm) this.f996o).provideKeyResponse(bArr, bArr2);
    }

    @Override // o.InterfaceC0561Kr
    public C0535Jr k() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.f996o).getProvisionRequest();
        return new C0535Jr(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // o.InterfaceC0561Kr
    public void l(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.f996o).provideProvisionResponse(bArr);
    }

    public void m(int i, C0643Nw c0643Nw, int i2, Object obj, long j) {
        p(new C2069lP(1, i, c0643Nw, i2, obj, Lr0.X(j), -9223372036854775807L));
    }

    /* JADX WARN: Code duplicated, block: B:124:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    @Override // o.InterfaceC0561Kr
    public C0509Ir n(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C3174wo c3174wo;
        C2613qy c2613qyV;
        int i3;
        int i4;
        byte[] bArrW;
        UUID uuid = (UUID) this.n;
        C3174wo c3174wo2 = null;
        if (list != null) {
            if (!AbstractC2661ra.d.equals(uuid)) {
                c3174wo = (C3174wo) list.get(0);
            } else if (Lr0.a < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c3174wo = (C3174wo) list.get(0);
                        break;
                    }
                    C3174wo c3174wo3 = (C3174wo) list.get(i2);
                    byte[] bArr3 = c3174wo3.p;
                    bArr3.getClass();
                    c2613qyV = AbstractC3021v9.v(bArr3);
                    if (c2613qyV == null) {
                        i3 = -1;
                    } else {
                        i3 = c2613qyV.m;
                    }
                    i4 = Lr0.a;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        c3174wo = c3174wo3;
                        break;
                    }
                }
            } else {
                C3174wo c3174wo4 = (C3174wo) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        C3174wo c3174wo5 = (C3174wo) list.get(i5);
                        byte[] bArr4 = c3174wo5.p;
                        bArr4.getClass();
                        if (!Lr0.a(c3174wo5.f1102o, c3174wo4.f1102o) || !Lr0.a(c3174wo5.n, c3174wo4.n) || AbstractC3021v9.v(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c3174wo = (C3174wo) list.get(0);
                                    break;
                                }
                                C3174wo c3174wo6 = (C3174wo) list.get(i2);
                                byte[] bArr5 = c3174wo6.p;
                                bArr5.getClass();
                                c2613qyV = AbstractC3021v9.v(bArr5);
                                if (c2613qyV == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c2613qyV.m;
                                }
                                i4 = Lr0.a;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                c3174wo = c3174wo6;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((C3174wo) list.get(i7)).p;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        c3174wo = new C3174wo(c3174wo4.m, c3174wo4.n, c3174wo4.f1102o, bArr6);
                    }
                }
            }
            byte[] bArrD = c3174wo.p;
            bArrD.getClass();
            UUID uuid2 = AbstractC2661ra.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrW2 = AbstractC3021v9.w(bArrD, uuid);
                if (bArrW2 != null) {
                    bArrD = bArrW2;
                }
                C2562qX c2562qX = new C2562qX(bArrD);
                int i8 = c2562qX.i();
                short sK = c2562qX.k();
                short sK2 = c2562qX.k();
                if (sK == 1 && sK2 == 1) {
                    short sK3 = c2562qX.k();
                    Charset charset = AbstractC1402ed.e;
                    String strS = c2562qX.s(sK3, charset);
                    if (!strS.contains("<LA_URL>")) {
                        int iIndexOf = strS.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            AP.z();
                        }
                        String str2 = strS.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strS.substring(iIndexOf);
                        int i9 = i8 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i9);
                        byteBufferAllocate.putShort(sK);
                        byteBufferAllocate.putShort(sK2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrD = byteBufferAllocate.array();
                    }
                } else {
                    AP.j();
                }
                bArrD = AbstractC3021v9.d(uuid2, null, bArrD);
            }
            int i10 = Lr0.a;
            if (i10 < 23 && AbstractC2661ra.d.equals(uuid)) {
                bArrW = AbstractC3021v9.w(bArrD, uuid);
                if (bArrW != null) {
                    bArrD = bArrW;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Lr0.c)) {
                String str3 = Lr0.d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrW = AbstractC3021v9.w(bArrD, uuid);
                    if (bArrW != null) {
                        bArrD = bArrW;
                    }
                }
            }
            String str4 = c3174wo.f1102o;
            str = (i10 < 26 && AbstractC2661ra.c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrD;
            c3174wo2 = c3174wo;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = ((MediaDrm) this.f996o).getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (AbstractC2661ra.c.equals(uuid) && Lr0.a < 27) {
            data = Lr0.o(data).replace('+', '-').replace('/', '_').getBytes(AbstractC1402ed.c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl) || (Lr0.a == 33 && "https://default.url".equals(defaultUrl))) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c3174wo2 != null) {
            String str5 = c3174wo2.n;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (Lr0.a >= 23) {
            keyRequest.getRequestType();
        }
        return new C0509Ir(defaultUrl, data);
    }

    @Override // o.InterfaceC0561Kr
    public int o() {
        return 2;
    }

    public void p(C2069lP c2069lP) {
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new RunnableC1169c7(this, hp.b, c2069lP, 7));
        }
    }

    @Override // o.K8
    public /* synthetic */ void q() {
    }

    public long r(C0554Kk c0554Kk) {
        long j;
        C2800sv c2800sv;
        C3091vv c3091vv;
        boolean zG;
        int iE;
        while (true) {
            long jA = c0554Kk.A();
            j = c0554Kk.n;
            long j2 = j - 6;
            c2800sv = (C2800sv) this.f996o;
            c3091vv = (C3091vv) this.n;
            if (jA >= j2) {
                break;
            }
            long jA2 = c0554Kk.A();
            byte[] bArr = new byte[2];
            c0554Kk.x(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i2 = this.m;
            if (i != i2) {
                c0554Kk.q = 0;
                c0554Kk.b((int) (jA2 - c0554Kk.f369o), false);
                zG = false;
            } else {
                C2562qX c2562qX = new C2562qX(16);
                System.arraycopy(bArr, 0, c2562qX.a, 0, 2);
                byte[] bArr2 = c2562qX.a;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iE = c0554Kk.e(bArr2, i4 + i3, 14 - i3)) != -1; i4 = 2) {
                    i3 += iE;
                }
                c2562qX.E(i3);
                c0554Kk.q = 0;
                c0554Kk.b((int) (jA2 - c0554Kk.f369o), false);
                zG = AbstractC3045vW.g(c2562qX, c3091vv, i2, c2800sv);
            }
            if (zG) {
                break;
            }
            c0554Kk.b(1, false);
        }
        if (c0554Kk.A() < j - 6) {
            return c2800sv.a;
        }
        c0554Kk.b((int) (j - c0554Kk.A()), false);
        return c3091vv.j;
    }

    public Object s(int i) {
        SparseArray sparseArray;
        if (this.m == -1) {
            this.m = 0;
        }
        while (true) {
            int i2 = this.m;
            sparseArray = (SparseArray) this.n;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.m--;
        }
        while (this.m < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.m + 1)) {
            this.m++;
        }
        return sparseArray.valueAt(this.m);
    }

    public boolean t() {
        ColorStateList colorStateList;
        return ((Shader) this.n) == null && (colorStateList = (ColorStateList) this.f996o) != null && colorStateList.isStateful();
    }

    public String toString() {
        switch (this.l) {
            case 12:
                StringBuilder sb = new StringBuilder();
                if (((O30) this.n) == O30.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.m);
                sb.append(' ');
                sb.append((String) this.f996o);
                String string = sb.toString();
                AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC0561Kr
    public void u(final C0320Bk c0320Bk) {
        ((MediaDrm) this.f996o).setOnEventListener(new MediaDrm.OnEventListener() { // from class: o.oy
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C2613qy c2613qy = this.a;
                C0320Bk c0320Bk2 = c0320Bk;
                c2613qy.getClass();
                HandlerC2232n2 handlerC2232n2 = c0320Bk2.a.I;
                handlerC2232n2.getClass();
                handlerC2232n2.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // o.InterfaceC0561Kr
    public InterfaceC2871ti v(byte[] bArr) {
        int i = Lr0.a;
        UUID uuid = (UUID) this.n;
        boolean z = i < 21 && AbstractC2661ra.d.equals(uuid) && "L3".equals(((MediaDrm) this.f996o).getPropertyString("securityLevel"));
        if (i < 27 && AbstractC2661ra.c.equals(uuid)) {
            uuid = AbstractC2661ra.b;
        }
        return new C2322ny(uuid, bArr, z);
    }

    @Override // o.InterfaceC0561Kr
    public boolean w(String str, byte[] bArr) {
        if (Lr0.a >= 31) {
            return AbstractC2516py.a((MediaDrm) this.f996o, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto((UUID) this.n, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public void x(C0991aL c0991aL, int i, int i2, C0643Nw c0643Nw, int i3, Object obj, long j, long j2) {
        z(c0991aL, new C2069lP(i, i2, c0643Nw, i3, obj, Lr0.X(j), Lr0.X(j2)));
    }

    @Override // o.InterfaceC0561Kr
    public byte[] y() {
        return ((MediaDrm) this.f996o).openSession();
    }

    public void z(C0991aL c0991aL, C2069lP c2069lP) {
        for (HP hp : (CopyOnWriteArrayList) this.f996o) {
            Lr0.O(hp.a, new EP(this, hp.b, c0991aL, c2069lP, 1));
        }
    }

    public /* synthetic */ C2613qy(Object obj, int i, Serializable serializable, int i2) {
        this.l = i2;
        this.n = obj;
        this.m = i;
        this.f996o = serializable;
    }

    public C2613qy(ImageView imageView) {
        this.l = 1;
        this.m = 0;
        this.n = imageView;
    }

    public C2613qy(C0633Nm c0633Nm) {
        this.l = 10;
        this.n = new SparseArray();
        this.f996o = c0633Nm;
        this.m = -1;
    }

    public C2613qy(Shader shader, ColorStateList colorStateList, int i) {
        this.l = 2;
        this.n = shader;
        this.f996o = colorStateList;
        this.m = i;
    }

    public C2613qy(C3091vv c3091vv, int i) {
        this.l = 4;
        this.n = c3091vv;
        this.m = i;
        this.f996o = new C2800sv();
    }

    public C2613qy(L80 l80) {
        this.l = 11;
        this.f996o = l80;
        this.n = C1012ad.m;
        this.m = Integer.MAX_VALUE;
    }

    public C2613qy(UUID uuid) {
        this.l = 0;
        uuid.getClass();
        UUID uuid2 = AbstractC2661ra.b;
        AbstractC0397Ej.b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.n = uuid;
        MediaDrm mediaDrm = new MediaDrm((Lr0.a >= 27 || !AbstractC2661ra.c.equals(uuid)) ? uuid : uuid2);
        this.f996o = mediaDrm;
        this.m = 1;
        if (AbstractC2661ra.d.equals(uuid) && "ASUS_Z00AD".equals(Lr0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public C2613qy(CopyOnWriteArrayList copyOnWriteArrayList, int i, CP cp) {
        this.l = 8;
        this.f996o = copyOnWriteArrayList;
        this.m = i;
        this.n = cp;
    }

    public C2613qy(int i, int i2) {
        this.l = i2;
        switch (i2) {
            case 6:
                this.m = i;
                if (i > 36) {
                    int i3 = 0;
                    if (i < 62) {
                        String strSubstring = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, i);
                        AbstractC1474fG.i(strSubstring, "substring(...)");
                        this.n = strSubstring;
                    } else if (63 <= i && i < 95) {
                        String strSubstring2 = " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".substring(0, i);
                        AbstractC1474fG.i(strSubstring2, "substring(...)");
                        this.n = strSubstring2;
                    } else if (i == 62) {
                        this.n = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    } else if (i == 95) {
                        this.n = " !\"#$%&\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
                    }
                    this.f996o = new HashMap(95);
                    String str = (String) this.n;
                    AbstractC1474fG.g(str);
                    int length = str.length();
                    while (i3 < length) {
                        Integer numValueOf = Integer.valueOf(i3);
                        HashMap map = (HashMap) this.f996o;
                        AbstractC1474fG.g(map);
                        String str2 = (String) this.n;
                        AbstractC1474fG.g(str2);
                        int i4 = i3 + 1;
                        String strSubstring3 = str2.substring(i3, i4);
                        AbstractC1474fG.i(strSubstring3, "substring(...)");
                        map.put(strSubstring3, numValueOf);
                        i3 = i4;
                    }
                }
                break;
            default:
                this.n = new Object[i * 2];
                this.m = 0;
                break;
        }
    }

    public C2613qy(C3257xh c3257xh) {
        this.l = 3;
        this.f996o = AbstractC2506pt.H(150, new C2133m1(24, this));
        this.n = c3257xh;
    }
}
