package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Nr0 {
    public static Ir0 a = null;
    public static boolean b = false;
    public static C0522Je f;
    public static final int[] c = new int[0];
    public static final Object[] d = new Object[0];
    public static final C0522Je e = new C0522Je(null, null, null);
    public static final Object g = new Object();

    public static final Object B(Mj0 mj0, InterfaceC0775Sy interfaceC0775Sy) throws Throwable {
        Object c0678Pf;
        Object objY;
        mj0.T(false, true, new C2397on(0, AbstractC1376eG.t(mj0.f482o.g()).R(mj0.p, mj0, mj0.n)));
        try {
            Jp0.d(2, interfaceC0775Sy);
            c0678Pf = interfaceC0775Sy.i(mj0, mj0);
        } catch (Throwable th) {
            c0678Pf = new C0678Pf(th, false);
        }
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (c0678Pf == enumC1706hi || (objY = mj0.Y(c0678Pf)) == AbstractC1376eG.c) {
            return enumC1706hi;
        }
        if (objY instanceof C0678Pf) {
            Throwable th2 = ((C0678Pf) objY).a;
            if (!(th2 instanceof Ij0) || ((Ij0) th2).l != mj0) {
                throw th2;
            }
            if (c0678Pf instanceof C0678Pf) {
                throw ((C0678Pf) c0678Pf).a;
            }
        } else {
            c0678Pf = AbstractC1376eG.I(objY);
        }
        return c0678Pf;
    }

    public static final C1948k6 D(Socket socket) throws IOException {
        Logger logger = SV.a;
        He0 he0 = new He0(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1474fG.i(outputStream, "getOutputStream(...)");
        return new C1948k6(he0, 0, new C1948k6(outputStream, 1, he0));
    }

    public static final C2046l6 E(Socket socket) throws IOException {
        Logger logger = SV.a;
        He0 he0 = new He0(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1474fG.i(inputStream, "getInputStream(...)");
        return new C2046l6(he0, 0, new C2046l6(inputStream, 1, he0));
    }

    public static void F(InterfaceC0775Sy interfaceC0775Sy, AbstractC2518q abstractC2518q, AbstractC2518q abstractC2518q2) {
        try {
            Pu0.r(Ou0.p(Ou0.e(abstractC2518q, abstractC2518q2, interfaceC0775Sy)), C2985uq0.a, null);
        } catch (Throwable th) {
            abstractC2518q2.j(Jp0.k(th));
            throw th;
        }
    }

    public static final long G(int i, EnumC1231cp enumC1231cp) {
        AbstractC1474fG.j(enumC1231cp, "unit");
        if (enumC1231cp.compareTo(EnumC1231cp.SECONDS) <= 0) {
            long jE = Sr0.e(i, enumC1231cp, EnumC1231cp.NANOSECONDS) << 1;
            int i2 = AbstractC0947Zo.n;
            int i3 = AbstractC1036ap.a;
            return jE;
        }
        long j = i;
        EnumC1231cp enumC1231cp2 = EnumC1231cp.NANOSECONDS;
        long jE2 = Sr0.e(4611686018426999999L, enumC1231cp2, enumC1231cp);
        long j2 = -jE2;
        C1285dM c1285dM = new C1285dM(j2, jE2);
        if (j2 <= j && j <= c1285dM.m) {
            long jE3 = Sr0.e(j, enumC1231cp, enumC1231cp2) << 1;
            int i4 = AbstractC0947Zo.n;
            int i5 = AbstractC1036ap.a;
            return jE3;
        }
        EnumC1231cp enumC1231cp3 = EnumC1231cp.MILLISECONDS;
        AbstractC1474fG.j(enumC1231cp3, "targetUnit");
        long jI = (U9.i(enumC1231cp3.l.convert(j, enumC1231cp.l), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        int i6 = AbstractC0947Zo.n;
        int i7 = AbstractC1036ap.a;
        return jI;
    }

    public static final C0675Pc H(InterfaceC0827Uy interfaceC0827Uy, C2771sg0 c2771sg0) {
        int i = AbstractC2609qw.a;
        return new C0675Pc(interfaceC0827Uy, c2771sg0);
    }

    public static final Object I(long j, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        if (j > 0) {
            return B(new Mj0(j, interfaceC0473Hh), interfaceC0775Sy);
        }
        throw new Ij0("Timed out immediately", null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J(long j, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Nj0 nj0;
        IF r7;
        if (interfaceC0473Hh instanceof Nj0) {
            nj0 = (Nj0) interfaceC0473Hh;
            int i = nj0.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj0.n = i - Integer.MIN_VALUE;
            } else {
                nj0 = new Nj0(interfaceC0473Hh);
            }
        } else {
            nj0 = new Nj0(interfaceC0473Hh);
        }
        Object objB = nj0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = nj0.n;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7 = nj0.l;
            try {
                Jp0.O(objB);
            } catch (Ij0 e2) {
                e = e2;
                if (e.l == r7.m) {
                    return null;
                }
                throw e;
            }
        }
        Jp0.O(objB);
        if (j <= 0) {
            return null;
        }
        IF r10 = new IF();
        try {
            nj0.getClass();
            nj0.l = r10;
            nj0.n = 1;
            Mj0 mj0 = new Mj0(j, nj0);
            r10.m = mj0;
            objB = B(mj0, interfaceC0775Sy);
            return objB == enumC1706hi ? enumC1706hi : objB;
        } catch (Ij0 e3) {
            e = e3;
            r7 = r10;
            if (e.l == r7.m) {
                return null;
            }
            throw e;
        }
    }

    public static Class K(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    public static final KF a(String str, InterfaceC2159mI interfaceC2159mI) {
        return new KF(str, new LF(interfaceC2159mI));
    }

    public static final void b(C2866tf0 c2866tf0) {
        int i = c2866tf0.f1044o;
        int[] iArr = c2866tf0.m;
        Object[] objArr = c2866tf0.n;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != g) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c2866tf0.l = false;
        c2866tf0.f1044o = i2;
    }

    public static void c(StringBuilder sb, String str) {
        sb.append(str.length());
        sb.append(':');
        sb.append(str);
    }

    public static final int d(int i, int i2, int[] iArr) {
        AbstractC1474fG.j(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int e(long[] jArr, int i, long j) {
        AbstractC1474fG.j(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final C3014v50 f(InterfaceC1991ke0 interfaceC1991ke0) {
        AbstractC1474fG.j(interfaceC1991ke0, "<this>");
        return new C3014v50(interfaceC1991ke0);
    }

    public static final C3111w50 g(InterfaceC2091lf0 interfaceC2091lf0) {
        AbstractC1474fG.j(interfaceC2091lf0, "<this>");
        return new C3111w50(interfaceC2091lf0);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable h(InterfaceC1538fw interfaceC1538fw, InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2318nw c2318nw;
        Throwable th;
        IF r5;
        Throwable th2;
        AH ah;
        Object objO;
        if (interfaceC0473Hh instanceof C2318nw) {
            c2318nw = (C2318nw) interfaceC0473Hh;
            int i = c2318nw.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2318nw.n = i - Integer.MIN_VALUE;
            } else {
                c2318nw = new C2318nw(interfaceC0473Hh);
            }
        } else {
            c2318nw = new C2318nw(interfaceC0473Hh);
        }
        Object obj = c2318nw.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2318nw.n;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r5 = c2318nw.l;
            try {
                Jp0.O(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th2 = (Throwable) r5.m;
                if (th2 == null && AbstractC1474fG.b(th2, th)) {
                    throw th;
                }
                ah = (AH) c2318nw.g().q(C2691rp.v);
                if (ah != null) {
                    JH jh = (JH) ah;
                    objO = jh.O();
                    if (((objO instanceof C0678Pf) || ((objO instanceof HH) && ((HH) objO).d())) && AbstractC1474fG.b(jh.H(), th)) {
                        throw th;
                    }
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    AbstractC3409z9.a(th2, th);
                    throw th2;
                }
                AbstractC3409z9.a(th, th2);
                throw th;
            }
        }
        Jp0.O(obj);
        IF r7 = new IF();
        try {
            InterfaceC1734hw c2512pw = new C2512pw(interfaceC1734hw, 0, r7);
            c2318nw.l = r7;
            c2318nw.n = 1;
            if (interfaceC1538fw.a(c2512pw, c2318nw) == enumC1706hi) {
                return enumC1706hi;
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            r5 = r7;
            th2 = (Throwable) r5.m;
            if (th2 == null) {
            }
            ah = (AH) c2318nw.g().q(C2691rp.v);
            if (ah != null) {
                JH jh2 = (JH) ah;
                objO = jh2.O();
                if (objO instanceof C0678Pf) {
                    throw th;
                }
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                AbstractC3409z9.a(th2, th);
                throw th2;
            }
            AbstractC3409z9.a(th, th2);
            throw th;
        }
    }

    public static Animator i(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolderN;
        int size;
        int i2;
        int i3;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        Animator animatorT = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z = false;
            int i4 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i5 = 1;
            if (next == 1) {
                break;
            }
            int i6 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    t(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorT = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorT = t(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayG = AbstractC1370eA.G(resources2, theme2, attributeSet, AbstractC1370eA.h);
                    i(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !AbstractC1370eA.w(xmlResourceParser2, "ordering") ? 0 : typedArrayG.getInt(0, 0));
                    typedArrayG.recycle();
                    animatorT = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i4 || eventType == i5) {
                            break;
                        }
                        if (eventType != i6) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str2)) {
                                TypedArray typedArrayG2 = AbstractC1370eA.G(resources2, theme2, attributeSetAsAttributeSet, AbstractC1370eA.i);
                                String strV = AbstractC1370eA.v(typedArrayG2, xmlResourceParser2, "propertyName", i4);
                                int i7 = !AbstractC1370eA.w(xmlResourceParser2, "valueType") ? 4 : typedArrayG2.getInt(i6, 4);
                                int i8 = i7;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    if (next2 == i4 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = AbstractC1370eA.j;
                                        i3 = i8;
                                        if (i3 == 4) {
                                            TypedArray typedArrayG3 = AbstractC1370eA.G(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue typedValuePeekValue = !AbstractC1370eA.w(xmlResourceParser2, "value") ? null : typedArrayG3.peekValue(0);
                                            int i9 = (typedValuePeekValue == null || !r(typedValuePeekValue.type)) ? 0 : 3;
                                            typedArrayG3.recycle();
                                            i3 = i9;
                                        }
                                        TypedArray typedArrayG4 = AbstractC1370eA.G(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f2 = AbstractC1370eA.w(xmlResourceParser2, "fraction") ? typedArrayG4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !AbstractC1370eA.w(xmlResourceParser2, "value") ? null : typedArrayG4.peekValue(0);
                                        boolean z2 = typedValuePeekValue2 != null;
                                        int i10 = i3 == 4 ? (z2 && r(typedValuePeekValue2.type)) ? 3 : 0 : i3;
                                        if (!z2) {
                                            keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i10 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f2, !AbstractC1370eA.w(xmlResourceParser2, "value") ? 0.0f : typedArrayG4.getFloat(0, 0.0f));
                                        } else if (i10 == 1 || i10 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f2, !AbstractC1370eA.w(xmlResourceParser2, "value") ? 0 : typedArrayG4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !AbstractC1370eA.w(xmlResourceParser2, "interpolator") ? 0 : typedArrayG4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayG4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i3 = i8;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str2 = str2;
                                    attributeSetAsAttributeSet = attributeSet2;
                                    i8 = i3;
                                    i4 = 3;
                                }
                                int i11 = i8;
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    propertyValuesHolderN = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Keyframe keyframe3 = keyframeArr[i12];
                                        if (keyframe3.getFraction() >= 0.0f) {
                                            i2 = size;
                                        } else {
                                            if (i12 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i13 = size - 1;
                                                if (i12 == i13) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i14 = i12;
                                                    for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                                                        i14 = i15;
                                                    }
                                                    float fraction3 = (keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction()) / ((i14 - i12) + 2);
                                                    int i16 = i12;
                                                    while (i16 <= i14) {
                                                        keyframeArr[i16].setFraction(keyframeArr[i16 - 1].getFraction() + fraction3);
                                                        i16++;
                                                        size = size;
                                                    }
                                                    i2 = size;
                                                }
                                            }
                                            i2 = size;
                                        }
                                        i12++;
                                        size = i2;
                                    }
                                    propertyValuesHolderN = PropertyValuesHolder.ofKeyframe(strV, keyframeArr);
                                    if (i11 == 3) {
                                        propertyValuesHolderN.setEvaluator(K5.a);
                                    }
                                }
                                if (propertyValuesHolderN == null) {
                                    propertyValuesHolderN = n(typedArrayG2, i7, 0, 1, strV);
                                }
                                if (propertyValuesHolderN != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderN);
                                }
                                typedArrayG2.recycle();
                            } else {
                                attributeSet2 = attributeSetAsAttributeSet;
                                str = str2;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            str2 = str;
                            attributeSetAsAttributeSet = attributeSet2;
                            i4 = 3;
                            i5 = 1;
                            i6 = 2;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i17 = 0; i17 < size2; i17++) {
                            propertyValuesHolderArr[i17] = (PropertyValuesHolder) arrayList2.get(i17);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (animatorT instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorT).setValues(propertyValuesHolderArr);
                    }
                    z = true;
                }
                if (animatorSet != null && !z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorT);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                animatorArr[i18] = (Animator) it.next();
                i18++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorT;
    }

    public static final E80 j(Context context, Class cls, String str) {
        if (true ^ (str == null || AbstractC1899jh0.O(str))) {
            return new E80(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static String k(String str, String str2, boolean z) {
        AbstractC1474fG.j(str, "label");
        Pattern patternCompile = Pattern.compile("^[^\\p{L}\\p{N}+]+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        String string = AbstractC1119bh0.E0(strReplaceAll).toString();
        if (AbstractC1899jh0.O(string)) {
            string = AbstractC1119bh0.E0(str).toString();
        }
        if (!z || str2 == null || AbstractC1899jh0.O(str2)) {
            return string;
        }
        return string + " [" + str2 + "]";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(InterfaceC1538fw interfaceC1538fw, InterfaceC0473Hh interfaceC0473Hh) {
        C2705rw c2705rw;
        IF r0;
        C1935k e2;
        C1632gu c1632gu;
        if (interfaceC0473Hh instanceof C2705rw) {
            c2705rw = (C2705rw) interfaceC0473Hh;
            int i = c2705rw.f1014o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2705rw.f1014o = i - Integer.MIN_VALUE;
            } else {
                c2705rw = new C2705rw(interfaceC0473Hh);
            }
        } else {
            c2705rw = new C2705rw(interfaceC0473Hh);
        }
        Object obj = c2705rw.n;
        Object obj2 = EnumC1706hi.l;
        int i2 = c2705rw.f1014o;
        Object obj3 = Pu0.c;
        if (i2 == 0) {
            Jp0.O(obj);
            IF r7 = new IF();
            r7.m = obj3;
            C1632gu c1632gu2 = new C1632gu(2, r7);
            try {
                c2705rw.l = r7;
                c2705rw.m = c1632gu2;
                c2705rw.f1014o = 1;
                if (interfaceC1538fw.a(c1632gu2, c2705rw) != obj2) {
                    r0 = r7;
                    obj2 = r0.m;
                    if (obj2 == obj3) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (C1935k e3) {
                r0 = r7;
                e2 = e3;
                c1632gu = c1632gu2;
                if (e2.l != c1632gu) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1632gu = c2705rw.m;
            r0 = c2705rw.l;
            try {
                Jp0.O(obj);
            } catch (C1935k e4) {
                e2 = e4;
                if (e2.l != c1632gu) {
                    throw e2;
                }
            }
            obj2 = r0.m;
            if (obj2 == obj3) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    public static PropertyValuesHolder n(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && r(i4)) || (z2 && r(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            CX[] cxArrP = zy0.p(string);
            CX[] cxArrP2 = zy0.p(string2);
            if (cxArrP == null && cxArrP2 == null) {
                return null;
            }
            if (cxArrP == null) {
                if (cxArrP2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C1259d3(), cxArrP2);
                }
                return null;
            }
            C1259d3 c1259d3 = new C1259d3();
            if (cxArrP2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c1259d3, cxArrP);
            } else {
                if (!zy0.h(cxArrP, cxArrP2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c1259d3, cxArrP, cxArrP2);
            }
            return propertyValuesHolderOfObject;
        }
        K5 k5 = i == 3 ? K5.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = r(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = r(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else {
                color = r(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || k5 == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(k5);
        return propertyValuesHolderOfInt;
    }

    public static final boolean p(AssertionError assertionError) {
        Logger logger = SV.a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC1119bh0.W(message, "getsockname failed", false) : false;
    }

    public static boolean r(int i) {
        return i >= 28 && i <= 31;
    }

    public static boolean s(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    public static ValueAnimator t(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        int i = 1;
        TypedArray typedArrayG = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.g);
        TypedArray typedArrayG2 = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = AbstractC1370eA.w(xmlResourceParser, "duration") ? typedArrayG.getInt(1, 300) : 300;
        long j2 = !AbstractC1370eA.w(xmlResourceParser, "startOffset") ? 0 : typedArrayG.getInt(2, 0);
        int i2 = !AbstractC1370eA.w(xmlResourceParser, "valueType") ? 4 : typedArrayG.getInt(7, 4);
        if (AbstractC1370eA.w(xmlResourceParser, "valueFrom") && AbstractC1370eA.w(xmlResourceParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayG.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i3 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayG.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i2 = ((z && r(i3)) || (z2 && r(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderN = n(typedArrayG, i2, 5, 6, "");
            if (propertyValuesHolderN != null) {
                valueAnimator3.setValues(propertyValuesHolderN);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(!AbstractC1370eA.w(xmlResourceParser, "repeatCount") ? 0 : typedArrayG.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC1370eA.w(xmlResourceParser, "repeatMode") ? 1 : typedArrayG.getInt(4, 1));
        if (typedArrayG2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strV = AbstractC1370eA.v(typedArrayG2, xmlResourceParser, "pathData", 1);
            if (strV != null) {
                String strV2 = AbstractC1370eA.v(typedArrayG2, xmlResourceParser, "propertyXName", 2);
                String strV3 = AbstractC1370eA.v(typedArrayG2, xmlResourceParser, "propertyYName", 3);
                if (strV2 == null && strV3 == null) {
                    throw new InflateException(typedArrayG2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathQ = zy0.q(strV);
                PathMeasure pathMeasure = new PathMeasure(pathQ, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                    i = 1;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathQ, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + i);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f2 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayG;
                int i4 = 0;
                int i5 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    f3 += f2;
                    int i7 = i4 + 1;
                    if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i7;
                    }
                    i5++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strV2 != null ? PropertyValuesHolder.ofFloat(strV2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strV3 != null ? PropertyValuesHolder.ofFloat(strV3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayG;
                objectAnimator2.setPropertyName(AbstractC1370eA.v(typedArrayG2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayG;
        }
        if (AbstractC1370eA.w(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayG2 != null) {
            typedArrayG2.recycle();
        }
        return valueAnimator2;
    }

    public static final ArrayList u(Map map, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            CT ct = (CT) entry.getValue();
            Boolean boolValueOf = ct != null ? Boolean.valueOf(ct.b) : null;
            AbstractC1474fG.g(boolValueOf);
            if (!boolValueOf.booleanValue() && !ct.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) interfaceC0412Ey.b((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList v(Object... objArr) {
        int length = objArr.length;
        U9.d(length, "arraySize");
        ArrayList arrayList = new ArrayList(Pu0.s(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static final void w() {
        System.err.getClass();
    }

    public static final void x(Throwable th) {
        System.err.getClass();
    }

    public abstract void A();

    public abstract void C(int i);

    public abstract void m(C2765sd0 c2765sd0, float f2, float f3);

    public abstract void o();

    public boolean q() {
        return false;
    }

    public void y(boolean z) {
    }

    public void z(boolean z) {
    }
}
