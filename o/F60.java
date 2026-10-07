package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F60 implements InterfaceC3274xp0 {
    public final C1797ie0 l;
    public final EnumC0512Iu m;
    public final C2986ur n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final NH f254o;
    public final List p;

    public F60(C1797ie0 c1797ie0, C0330Bu c0330Bu, C2986ur c2986ur, NH nh, List list) {
        this.l = c1797ie0;
        this.m = c0330Bu;
        this.n = c2986ur;
        this.f254o = nh;
        this.p = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC3113w60.a.a(obj, accessibleObject)) {
            throw new RH(AbstractC1701hf0.d(A60.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Class cls = kp0.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC0397Ej.q(this.p);
        return A60.a.y(cls) ? new E60(cls, c(ba, kp0, cls, true)) : new D60(this.l.e(kp0), c(ba, kp0, cls, false));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1 A[SYNTHETIC] */
    public final LinkedHashMap c(BA ba, Kp0 kp0, Class cls, boolean z) {
        boolean z2;
        Method method;
        List listSingletonList;
        List list;
        int size;
        B60 b60;
        boolean z3;
        int i;
        List list2;
        Field field;
        int i2;
        int i3;
        Field[] fieldArr;
        Class cls2;
        Kp0 kp1;
        LinkedHashMap linkedHashMap;
        B60 b61;
        boolean z4;
        Kp0 kp2;
        Class cls3;
        boolean z5;
        int modifiers;
        boolean z6;
        MH mh;
        AbstractC3177wp0 abstractC3177wp0E;
        boolean z7;
        B60 b62;
        B60 b63;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap2;
        }
        Kp0 kp3 = kp0;
        Class cls4 = cls;
        while (cls4 != Object.class) {
            Field[] declaredFields = cls4.getDeclaredFields();
            if (cls4 != cls && declaredFields.length > 0) {
                AbstractC0397Ej.q(this.p);
            }
            int length = declaredFields.length;
            boolean z8 = false;
            int i4 = 0;
            while (i4 < length) {
                Field field2 = declaredFields[i4];
                boolean zD = this.d(field2, true);
                boolean zD2 = this.d(field2, z8);
                if (zD || zD2) {
                    if (!z) {
                        z2 = zD2;
                        method = null;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        method = null;
                        z2 = false;
                    } else {
                        Method methodR = A60.a.r(cls4, field2);
                        A60.e(methodR);
                        if (methodR.getAnnotation(InterfaceC1695hc0.class) != null && field2.getAnnotation(InterfaceC1695hc0.class) == null) {
                            throw new RH(AbstractC1701hf0.u("@SerializedName on ", A60.d(methodR, z8), " is not supported"));
                        }
                        z2 = zD2;
                        method = methodR;
                    }
                    if (method == null) {
                        A60.e(field2);
                    }
                    Type typeP = UK.P(kp3.b, cls4, field2.getGenericType(), new HashMap());
                    InterfaceC1695hc0 interfaceC1695hc0 = (InterfaceC1695hc0) field2.getAnnotation(InterfaceC1695hc0.class);
                    if (interfaceC1695hc0 == null) {
                        listSingletonList = Collections.singletonList(this.m.b(field2));
                    } else {
                        String strValue = interfaceC1695hc0.value();
                        String[] strArrAlternate = interfaceC1695hc0.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                            arrayList.add(strValue);
                            Collections.addAll(arrayList, strArrAlternate);
                            list = arrayList;
                        }
                        size = list.size();
                        b60 = null;
                        z3 = zD;
                        i = 0;
                        list2 = list;
                        while (i < size) {
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            String str = (String) list2.get(i);
                            if (i != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            kp2 = new Kp0(typeP);
                            cls3 = kp2.a;
                            int i5 = i;
                            if ((cls3 instanceof Class) || !cls3.isPrimitive()) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            mh = (MH) field2.getAnnotation(MH.class);
                            if (mh != null) {
                                this.f254o.getClass();
                                abstractC3177wp0E = NH.a(this.l, ba, kp2, mh);
                            } else {
                                abstractC3177wp0E = null;
                            }
                            if (abstractC3177wp0E != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (abstractC3177wp0E == null) {
                                abstractC3177wp0E = ba.e(kp2);
                            }
                            int i6 = size;
                            List list3 = list2;
                            Field field3 = field2;
                            int i7 = i4;
                            Type type = typeP;
                            boolean z9 = z7;
                            int i8 = length;
                            Field[] fieldArr2 = declaredFields;
                            Class cls5 = cls4;
                            Kp0 kp4 = kp3;
                            b62 = (B60) linkedHashMap3.put(str, new B60(str, field2, z4, z2, false, method, z9, abstractC3177wp0E, ba, kp2, z5, z6));
                            b63 = b60;
                            if (b63 == null) {
                                b60 = b62;
                            } else {
                                b60 = b63;
                            }
                            i = i5 + 1;
                            this = this;
                            cls4 = cls5;
                            linkedHashMap2 = linkedHashMap3;
                            kp3 = kp4;
                            z3 = z4;
                            length = i8;
                            declaredFields = fieldArr2;
                            i4 = i7;
                            size = i6;
                            list2 = list3;
                            field2 = field3;
                            typeP = type;
                            ba = ba;
                        }
                        field = field2;
                        i2 = i4;
                        i3 = length;
                        fieldArr = declaredFields;
                        cls2 = cls4;
                        kp1 = kp3;
                        linkedHashMap = linkedHashMap2;
                        b61 = b60;
                        if (b61 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + b61.a + "'; conflict is caused by fields " + A60.c(b61.b) + " and " + A60.c(field));
                        }
                    }
                    list = listSingletonList;
                    size = list.size();
                    b60 = null;
                    z3 = zD;
                    i = 0;
                    list2 = list;
                    while (i < size) {
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        String str2 = (String) list2.get(i);
                        if (i != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        kp2 = new Kp0(typeP);
                        cls3 = kp2.a;
                        int i9 = i;
                        if (cls3 instanceof Class) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        mh = (MH) field2.getAnnotation(MH.class);
                        if (mh != null) {
                            this.f254o.getClass();
                            abstractC3177wp0E = NH.a(this.l, ba, kp2, mh);
                        } else {
                            abstractC3177wp0E = null;
                        }
                        if (abstractC3177wp0E != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (abstractC3177wp0E == null) {
                            abstractC3177wp0E = ba.e(kp2);
                        }
                        int i10 = size;
                        List list4 = list2;
                        Field field4 = field2;
                        int i11 = i4;
                        Type type2 = typeP;
                        boolean z10 = z7;
                        int i12 = length;
                        Field[] fieldArr3 = declaredFields;
                        Class cls6 = cls4;
                        Kp0 kp5 = kp3;
                        b62 = (B60) linkedHashMap4.put(str2, new B60(str2, field2, z4, z2, false, method, z10, abstractC3177wp0E, ba, kp2, z5, z6));
                        b63 = b60;
                        if (b63 == null) {
                            b60 = b62;
                        } else {
                            b60 = b63;
                        }
                        i = i9 + 1;
                        this = this;
                        cls4 = cls6;
                        linkedHashMap2 = linkedHashMap4;
                        kp3 = kp5;
                        z3 = z4;
                        length = i12;
                        declaredFields = fieldArr3;
                        i4 = i11;
                        size = i10;
                        list2 = list4;
                        field2 = field4;
                        typeP = type2;
                        ba = ba;
                    }
                    field = field2;
                    i2 = i4;
                    i3 = length;
                    fieldArr = declaredFields;
                    cls2 = cls4;
                    kp1 = kp3;
                    linkedHashMap = linkedHashMap2;
                    b61 = b60;
                    if (b61 == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + b61.a + "'; conflict is caused by fields " + A60.c(b61.b) + " and " + A60.c(field));
                    }
                } else {
                    i2 = i4;
                    i3 = length;
                    fieldArr = declaredFields;
                    cls2 = cls4;
                    kp1 = kp3;
                    linkedHashMap = linkedHashMap2;
                }
                i4 = i2 + 1;
                this = this;
                cls4 = cls2;
                linkedHashMap2 = linkedHashMap;
                kp3 = kp1;
                length = i3;
                declaredFields = fieldArr;
                z8 = false;
                ba = ba;
            }
            Class cls7 = cls4;
            kp3 = new Kp0(UK.P(kp3.b, cls7, cls7.getGenericSuperclass(), new HashMap()));
            cls4 = kp3.a;
            linkedHashMap2 = linkedHashMap2;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    public final boolean d(Field field, boolean z) {
        List list;
        Iterator it;
        Class<?> type;
        Class<?> type2 = field.getType();
        C2986ur c2986ur = this.n;
        if (!c2986ur.c(type2)) {
            c2986ur.d(z);
            if ((field.getModifiers() & c2986ur.m) == 0) {
                if (c2986ur.l != -1.0d) {
                    Sd0 sd0 = (Sd0) field.getAnnotation(Sd0.class);
                    Mq0 mq0 = (Mq0) field.getAnnotation(Mq0.class);
                    double d = c2986ur.l;
                    if ((sd0 == null || d >= sd0.value()) && (mq0 == null || d < mq0.value())) {
                        if (!field.isSynthetic()) {
                            if (!c2986ur.n) {
                                type = field.getType();
                                if (type.isMemberClass() || (type.getModifiers() & 8) != 0) {
                                    if (!C2986ur.e(field.getType())) {
                                        if (z) {
                                            list = c2986ur.f1063o;
                                        } else {
                                            list = c2986ur.p;
                                        }
                                        if (!list.isEmpty()) {
                                            it = list.iterator();
                                            if (it.hasNext()) {
                                                AbstractC1674hK.w(it.next());
                                                throw null;
                                            }
                                        }
                                        return true;
                                    }
                                }
                            } else if (!C2986ur.e(field.getType())) {
                                if (z) {
                                    list = c2986ur.f1063o;
                                } else {
                                    list = c2986ur.p;
                                }
                                if (!list.isEmpty()) {
                                    it = list.iterator();
                                    if (it.hasNext()) {
                                        AbstractC1674hK.w(it.next());
                                        throw null;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                } else if (!field.isSynthetic()) {
                    if (!c2986ur.n) {
                        type = field.getType();
                        if (type.isMemberClass()) {
                            if (!C2986ur.e(field.getType())) {
                                if (z) {
                                    list = c2986ur.f1063o;
                                } else {
                                    list = c2986ur.p;
                                }
                                if (!list.isEmpty()) {
                                    it = list.iterator();
                                    if (it.hasNext()) {
                                        AbstractC1674hK.w(it.next());
                                        throw null;
                                    }
                                }
                                return true;
                            }
                        } else if (!C2986ur.e(field.getType())) {
                            if (z) {
                                list = c2986ur.f1063o;
                            } else {
                                list = c2986ur.p;
                            }
                            if (!list.isEmpty()) {
                                it = list.iterator();
                                if (it.hasNext()) {
                                    AbstractC1674hK.w(it.next());
                                    throw null;
                                }
                            }
                            return true;
                        }
                    } else if (!C2986ur.e(field.getType())) {
                        if (z) {
                            list = c2986ur.f1063o;
                        } else {
                            list = c2986ur.p;
                        }
                        if (!list.isEmpty()) {
                            it = list.iterator();
                            if (it.hasNext()) {
                                AbstractC1674hK.w(it.next());
                                throw null;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
