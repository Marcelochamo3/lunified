package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ZT {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final EU b;

    public ZT(Context context, EU eu) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(eu, "navigatorProvider");
        this.a = context;
        this.b = eu;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0216  */
    /* JADX WARN: Code duplicated, block: B:126:0x0220  */
    /* JADX WARN: Code duplicated, block: B:128:0x0233  */
    /* JADX WARN: Code duplicated, block: B:129:0x0246  */
    /* JADX WARN: Code duplicated, block: B:131:0x024a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:134:0x0258  */
    /* JADX WARN: Code duplicated, block: B:135:0x0262  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x0270, please report this as an issue */
    public static CT c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        AbstractC1976kU abstractC1976kUK;
        Object objH;
        boolean z;
        Class<?> componentType;
        boolean z2 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    abstractC1976kUK = AbstractC3021v9.j("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    abstractC1976kUK = AbstractC3021v9.j(string, resourcePackageName);
                }
            } else {
                abstractC1976kUK = AbstractC3021v9.j(string, resourcePackageName);
            }
        } else {
            abstractC1976kUK = null;
        }
        boolean value = typedArray.getValue(1, typedValue);
        AbstractC1976kU c1878jU = AbstractC1976kU.f;
        C1390eU c1390eU = AbstractC1976kU.l;
        C1390eU c1390eU2 = AbstractC1976kU.f867o;
        C1390eU c1390eU3 = AbstractC1976kU.b;
        C1390eU c1390eU4 = AbstractC1976kU.i;
        if (value) {
            C1390eU c1390eU5 = AbstractC1976kU.c;
            if (abstractC1976kUK == c1390eU5) {
                int i2 = typedValue.resourceId;
                if (i2 == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC1976kUK.b() + ". Must be a reference to a resource.");
                    }
                    i2 = 0;
                }
                objH = Integer.valueOf(i2);
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (abstractC1976kUK != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC1976kUK.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objH = Integer.valueOf(i3);
                    abstractC1976kUK = c1390eU5;
                } else if (abstractC1976kUK == c1390eU2) {
                    objH = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String string2 = typedValue.string.toString();
                        if (abstractC1976kUK == null) {
                            AbstractC1474fG.j(string2, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            c1390eU3.h(string2);
                                            abstractC1976kUK = c1390eU3;
                                        } catch (IllegalArgumentException unused) {
                                            c1390eU.h(string2);
                                            abstractC1976kUK = c1390eU;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        c1878jU.h(string2);
                                        abstractC1976kUK = c1878jU;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    abstractC1976kUK = c1390eU2;
                                }
                            } catch (IllegalArgumentException unused4) {
                                c1390eU4.h(string2);
                                abstractC1976kUK = c1390eU4;
                            }
                        }
                        objH = abstractC1976kUK.h(string2);
                    } else if (i4 == 4) {
                        abstractC1976kUK = zy0.k(typedValue, abstractC1976kUK, c1390eU4, string, "float");
                        objH = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        abstractC1976kUK = zy0.k(typedValue, abstractC1976kUK, c1390eU3, string, "dimension");
                        objH = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        abstractC1976kUK = zy0.k(typedValue, abstractC1976kUK, c1390eU, string, "boolean");
                        objH = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (abstractC1976kUK == c1390eU4) {
                            abstractC1976kUK = zy0.k(typedValue, abstractC1976kUK, c1390eU4, string, "float");
                            objH = Float.valueOf(typedValue.data);
                        } else {
                            abstractC1976kUK = zy0.k(typedValue, abstractC1976kUK, c1390eU3, string, "integer");
                            objH = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        } else {
            objH = null;
        }
        if (objH != null) {
            z = true;
        } else {
            objH = null;
            z = false;
        }
        AbstractC1976kU abstractC1976kU = abstractC1976kUK != null ? abstractC1976kUK : null;
        if (abstractC1976kU == null) {
            if (objH instanceof Integer) {
                c1878jU = c1390eU3;
            } else if (objH instanceof int[]) {
                c1878jU = AbstractC1976kU.d;
            } else if (!(objH instanceof Long)) {
                if (objH instanceof long[]) {
                    c1878jU = AbstractC1976kU.g;
                } else if (objH instanceof Float) {
                    c1878jU = c1390eU4;
                } else if (objH instanceof float[]) {
                    c1878jU = AbstractC1976kU.j;
                } else if (objH instanceof Boolean) {
                    c1878jU = c1390eU;
                } else if (objH instanceof boolean[]) {
                    c1878jU = AbstractC1976kU.m;
                } else if ((objH instanceof String) || objH == null) {
                    c1878jU = c1390eU2;
                } else if ((objH instanceof Object[]) && (((Object[]) objH) instanceof String[])) {
                    c1878jU = AbstractC1976kU.p;
                } else if (objH.getClass().isArray()) {
                    Class<?> componentType2 = objH.getClass().getComponentType();
                    AbstractC1474fG.g(componentType2);
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = objH.getClass().getComponentType();
                        AbstractC1474fG.h(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        c1878jU = new C1586gU(componentType3);
                    } else if (objH.getClass().isArray()) {
                        componentType = objH.getClass().getComponentType();
                        AbstractC1474fG.g(componentType);
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = objH.getClass().getComponentType();
                            AbstractC1474fG.h(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            c1878jU = new C1782iU(componentType4);
                        } else if (objH instanceof Parcelable) {
                            c1878jU = new C1684hU(objH.getClass());
                        } else if (objH instanceof Enum) {
                            c1878jU = new C1488fU(objH.getClass());
                        } else {
                            if (objH instanceof Serializable) {
                                throw new IllegalArgumentException("Object of type " + objH.getClass().getName() + " is not supported for navigation arguments.");
                            }
                            c1878jU = new C1878jU(objH.getClass());
                        }
                    } else if (objH instanceof Parcelable) {
                        c1878jU = new C1684hU(objH.getClass());
                    } else if (objH instanceof Enum) {
                        c1878jU = new C1488fU(objH.getClass());
                    } else {
                        if (objH instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + objH.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        c1878jU = new C1878jU(objH.getClass());
                    }
                } else if (objH.getClass().isArray()) {
                    componentType = objH.getClass().getComponentType();
                    AbstractC1474fG.g(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = objH.getClass().getComponentType();
                        AbstractC1474fG.h(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        c1878jU = new C1782iU(componentType5);
                    } else if (objH instanceof Parcelable) {
                        c1878jU = new C1684hU(objH.getClass());
                    } else if (objH instanceof Enum) {
                        c1878jU = new C1488fU(objH.getClass());
                    } else {
                        if (objH instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + objH.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        c1878jU = new C1878jU(objH.getClass());
                    }
                } else if (objH instanceof Parcelable) {
                    c1878jU = new C1684hU(objH.getClass());
                } else if (objH instanceof Enum) {
                    c1878jU = new C1488fU(objH.getClass());
                } else {
                    if (objH instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + objH.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    c1878jU = new C1878jU(objH.getClass());
                }
            }
            abstractC1976kU = c1878jU;
        }
        return new CT(abstractC1976kU, z2, objH, z);
    }

    public final TT a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strR;
        String strR2;
        String strR3;
        ZT zt;
        int depth2;
        Object obj;
        ZT zt2 = this;
        int i2 = i;
        String name = xmlResourceParser.getName();
        AbstractC1474fG.i(name, "parser.name");
        TT ttA = zt2.b.b(name).a();
        Context context = zt2.a;
        ttA.h(context, attributeSet);
        int i3 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean zB = AbstractC1474fG.b("argument", name2);
                int[] iArr = S40.b;
                LinkedHashMap linkedHashMap = ttA.r;
                if (zB) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    AbstractC1474fG.i(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    linkedHashMap.put(string, c(typedArrayObtainAttributes, resources, i2));
                    typedArrayObtainAttributes.recycle();
                } else if (AbstractC1474fG.b("deepLink", name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, S40.c);
                    AbstractC1474fG.i(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(1);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    if (string2 != null) {
                        String packageName = context.getPackageName();
                        AbstractC1474fG.i(packageName, "context.packageName");
                        strR = AbstractC1899jh0.R(string2, "${applicationId}", packageName, false);
                    } else {
                        strR = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strR2 = null;
                    } else {
                        String packageName2 = context.getPackageName();
                        AbstractC1474fG.i(packageName2, "context.packageName");
                        strR2 = AbstractC1899jh0.R(string3, "${applicationId}", packageName2, false);
                        if (strR2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context.getPackageName();
                        AbstractC1474fG.i(packageName3, "context.packageName");
                        strR3 = AbstractC1899jh0.R(string4, "${applicationId}", packageName3, false);
                    } else {
                        strR3 = null;
                    }
                    PT pt = new PT(strR, strR2, strR3);
                    ArrayList arrayListU = Nr0.u(linkedHashMap, new ST(pt, 0));
                    if (!arrayListU.isEmpty()) {
                        throw new IllegalArgumentException(("Deep link " + strR + " can't be used to open destination " + ttA + ".\nFollowing required arguments are missing: " + arrayListU).toString());
                    }
                    ttA.p.add(pt);
                    typedArrayObtainAttributes2.recycle();
                } else if (AbstractC1474fG.b("action", name2)) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, S40.a, 0, 0);
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    C3430zT c3430zT = new C3430zT(typedArrayObtainStyledAttributes.getResourceId(1, 0));
                    c3430zT.b = new C1098bU(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                    Bundle bundle = new Bundle();
                    Context context2 = context;
                    int i4 = 1;
                    int depth4 = xmlResourceParser.getDepth() + 1;
                    int i5 = depth3;
                    while (true) {
                        int next2 = xmlResourceParser.next();
                        if (next2 == i4 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth4) {
                            if (AbstractC1474fG.b("argument", xmlResourceParser.getName())) {
                                TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                AbstractC1474fG.i(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                String string5 = typedArrayObtainAttributes3.getString(0);
                                if (string5 == null) {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                                CT ctC = c(typedArrayObtainAttributes3, resources, i2);
                                boolean z = ctC.c;
                                if (z && z && (obj = ctC.d) != null) {
                                    ctC.a.e(bundle, string5, obj);
                                }
                                typedArrayObtainAttributes3.recycle();
                            }
                            i4 = 1;
                            i2 = i;
                        } else {
                            i4 = 1;
                        }
                    }
                    if (!bundle.isEmpty()) {
                        c3430zT.c = bundle;
                    }
                    if (!(!(ttA instanceof D1))) {
                        throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + ttA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                    }
                    if (resourceId == 0) {
                        throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                    }
                    ttA.q.g(resourceId, c3430zT);
                    typedArrayObtainStyledAttributes.recycle();
                    i3 = 1;
                    zt2 = this;
                    i2 = i;
                    context = context2;
                    depth3 = i5;
                } else {
                    Context context3 = context;
                    int i6 = depth3;
                    if (AbstractC1474fG.b("include", name2) && (ttA instanceof WT)) {
                        TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, R40.c);
                        AbstractC1474fG.i(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        zt = this;
                        ((WT) ttA).i(zt.b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                        typedArrayObtainAttributes4.recycle();
                    } else {
                        zt = this;
                        if (ttA instanceof WT) {
                            ((WT) ttA).i(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i2 = i;
                    zt2 = zt;
                    context = context3;
                    depth3 = i6;
                }
                i3 = 1;
            }
        }
        return ttA;
    }

    public final WT b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AbstractC1474fG.i(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        AbstractC1474fG.i(attributeSetAsAttributeSet, "attrs");
        TT ttA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (ttA instanceof WT) {
            WT wt = (WT) ttA;
            xml.close();
            return wt;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
