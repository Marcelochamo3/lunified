package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2766se implements InterfaceC1476fI, InterfaceC2669re {
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;
    public final Class a;

    static {
        int i = 0;
        List listK = AbstractC0937Ze.K(InterfaceC0360Cy.class, InterfaceC0412Ey.class, InterfaceC0775Sy.class, InterfaceC0827Uy.class, InterfaceC0853Vy.class, KR.class, Vo0.class, InterfaceC0879Wy.class, InterfaceC0905Xy.class, InterfaceC0931Yy.class, InterfaceC0386Dy.class, InterfaceC0438Fy.class, InterfaceC0464Gy.class, InterfaceC0490Hy.class, InterfaceC0516Iy.class, InterfaceC0542Jy.class, InterfaceC0568Ky.class, InterfaceC0593Ly.class, InterfaceC0619My.class, InterfaceC0645Ny.class, InterfaceC0697Py.class, InterfaceC0723Qy.class, InterfaceC0749Ry.class);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
        for (Object obj : listK) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            arrayList.add(new C1101bX((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = AbstractC3327yN.A(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC1474fG.i(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1474fG.g(str);
            sb.append(AbstractC1119bh0.y0(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "o.Ty" + iIntValue);
        }
        c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3327yN.x(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC1119bh0.y0(str2, '.', str2));
        }
        d = linkedHashMap;
    }

    public C2766se(Class cls) {
        AbstractC1474fG.j(cls, "jClass");
        this.a = cls;
    }

    @Override // o.InterfaceC2669re
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        Class cls = this.a;
        AbstractC1474fG.j(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1119bh0.x0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC1119bh0.w0(simpleName, '$', simpleName);
        }
        return AbstractC1119bh0.x0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean c(Object obj) {
        Class clsT = this.a;
        AbstractC1474fG.j(clsT, "jClass");
        Map map = b;
        AbstractC1474fG.h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsT);
        if (num != null) {
            return Jp0.y(num.intValue(), obj);
        }
        if (clsT.isPrimitive()) {
            clsT = AbstractC0397Ej.t(AbstractC2822t60.a(clsT));
        }
        return clsT.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2766se) && AbstractC1474fG.b(AbstractC0397Ej.t(this), AbstractC0397Ej.t((InterfaceC1476fI) obj));
    }

    public final int hashCode() {
        return AbstractC0397Ej.t(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
