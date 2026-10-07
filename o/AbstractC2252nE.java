package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2252nE {
    public final C3212x70 a;
    public final InterfaceC0595Ma b;
    public final InterfaceC0602Mh c;

    public AbstractC2252nE(C3212x70 c3212x70, InterfaceC0595Ma interfaceC0595Ma, InterfaceC0602Mh interfaceC0602Mh) {
        this.a = c3212x70;
        this.b = interfaceC0595Ma;
        this.c = interfaceC0602Mh;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x090d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x090f  */
    /* JADX WARN: Code duplicated, block: B:575:0x0928 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static AbstractC2252nE b(C2923u80 c2923u80, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean zG;
        boolean z2;
        Annotation[][] annotationArr;
        int i;
        int i2;
        Pu0[] pu0Arr;
        String str;
        boolean z3;
        Pu0 pu0;
        String str2;
        Pu0[] pu0Arr2;
        boolean z4;
        Pu0 c2271nX;
        Pu0 c1491fX;
        C1393eX c1393eX;
        C1393eX c1393eX2;
        int i3;
        int i4 = -1;
        boolean z5 = false;
        C3115w70 c3115w70 = new C3115w70(c2923u80, cls, method);
        Annotation[] annotationArr2 = c3115w70.d;
        int length = annotationArr2.length;
        int i5 = 0;
        while (true) {
            Method method2 = c3115w70.c;
            String str3 = "HEAD";
            if (i5 >= length) {
                if (c3115w70.f1089o == null) {
                    throw UK.K(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c3115w70.p) {
                    if (c3115w70.r) {
                        throw UK.K(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c3115w70.q) {
                        throw UK.K(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = c3115w70.e;
                int length2 = annotationArr3.length;
                c3115w70.w = new Pu0[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    Pu0[] pu0Arr3 = c3115w70.w;
                    Type type = c3115w70.f[i7];
                    Annotation[] annotationArr4 = annotationArr3[i7];
                    boolean z6 = i7 == i6;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i8 = 0;
                        pu0 = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i8 >= length3) {
                                i = length2;
                                i2 = i6;
                                pu0Arr = pu0Arr3;
                                str = str3;
                                z3 = z6;
                                break;
                            }
                            Annotation annotation = annotationArr4[i8];
                            int i9 = length2;
                            int i10 = i6;
                            int i11 = length3;
                            if (annotation instanceof InterfaceC3375yr0) {
                                c3115w70.c(i7, type);
                                if (c3115w70.n) {
                                    throw UK.M(method2, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c3115w70.j) {
                                    throw UK.M(method2, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c3115w70.k) {
                                    throw UK.M(method2, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c3115w70.l) {
                                    throw UK.M(method2, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c3115w70.m) {
                                    throw UK.M(method2, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c3115w70.s != null) {
                                    throw UK.M(method2, i7, "@Url cannot be used with @%s URL", c3115w70.f1089o);
                                }
                                c3115w70.n = true;
                                if (type != C2446pE.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw UK.M(method2, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c2271nX = new C1785iX(method2, i7, 1);
                                pu0Arr2 = pu0Arr3;
                                str2 = str3;
                            } else {
                                boolean z7 = annotation instanceof AX;
                                str2 = str3;
                                C2923u80 c2923u81 = c3115w70.a;
                                if (z7) {
                                    c3115w70.c(i7, type);
                                    if (c3115w70.k) {
                                        throw UK.M(method2, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c3115w70.l) {
                                        throw UK.M(method2, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c3115w70.m) {
                                        throw UK.M(method2, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c3115w70.n) {
                                        throw UK.M(method2, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c3115w70.s == null) {
                                        throw UK.M(method2, i7, "@Path can only be used with relative url on @%s", c3115w70.f1089o);
                                    }
                                    c3115w70.j = true;
                                    AX ax = (AX) annotation;
                                    String strValue = ax.value();
                                    if (!C3115w70.z.matcher(strValue).matches()) {
                                        throw UK.M(method2, i7, "@Path parameter name must match %s. Found: %s", C3115w70.y.pattern(), strValue);
                                    }
                                    if (!c3115w70.v.contains(strValue)) {
                                        throw UK.M(method2, i7, "URL \"%s\" does not contain \"{%s}\".", c3115w70.s, strValue);
                                    }
                                    c2923u81.f(type, annotationArr4);
                                    c2271nX = new C1979kX(method2, i7, strValue, ax.encoded());
                                    pu0Arr2 = pu0Arr3;
                                } else {
                                    if (annotation instanceof InterfaceC3206x40) {
                                        c3115w70.c(i7, type);
                                        InterfaceC3206x40 interfaceC3206x40 = (InterfaceC3206x40) annotation;
                                        String strValue2 = interfaceC3206x40.value();
                                        boolean zEncoded = interfaceC3206x40.encoded();
                                        Class clsW = UK.w(type);
                                        pu0Arr2 = pu0Arr3;
                                        c3115w70.k = true;
                                        if (Iterable.class.isAssignableFrom(clsW)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw UK.M(method2, i7, clsW.getSimpleName() + " must include generic type (e.g., " + clsW.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c2923u81.f(UK.u(0, (ParameterizedType) type), annotationArr4);
                                            c1393eX2 = new C1393eX(new C1589gX(2, strValue2, zEncoded), 0);
                                        } else if (clsW.isArray()) {
                                            c2923u81.f(C3115w70.a(clsW.getComponentType()), annotationArr4);
                                            c1393eX2 = new C1393eX(new C1589gX(2, strValue2, zEncoded), 1);
                                        } else {
                                            c2923u81.f(type, annotationArr4);
                                            c2271nX = new C1589gX(2, strValue2, zEncoded);
                                        }
                                        c2271nX = c1393eX2;
                                    } else {
                                        pu0Arr2 = pu0Arr3;
                                        if (annotation instanceof InterfaceC3400z40) {
                                            c3115w70.c(i7, type);
                                            boolean zEncoded2 = ((InterfaceC3400z40) annotation).encoded();
                                            Class clsW2 = UK.w(type);
                                            c3115w70.l = true;
                                            if (Iterable.class.isAssignableFrom(clsW2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw UK.M(method2, i7, clsW2.getSimpleName() + " must include generic type (e.g., " + clsW2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c2923u81.f(UK.u(0, (ParameterizedType) type), annotationArr4);
                                                c1393eX2 = new C1393eX(new C2077lX(zEncoded2), 0);
                                                c2271nX = c1393eX2;
                                            } else if (clsW2.isArray()) {
                                                c2923u81.f(C3115w70.a(clsW2.getComponentType()), annotationArr4);
                                                c2271nX = new C1393eX(new C2077lX(zEncoded2), 1);
                                            } else {
                                                c2923u81.f(type, annotationArr4);
                                                c2271nX = new C2077lX(zEncoded2);
                                            }
                                        } else {
                                            z4 = z6;
                                            if (annotation instanceof InterfaceC3303y40) {
                                                c3115w70.c(i7, type);
                                                Class clsW3 = UK.w(type);
                                                c3115w70.m = true;
                                                if (!Map.class.isAssignableFrom(clsW3)) {
                                                    throw UK.M(method2, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeY = UK.y(type, clsW3);
                                                if (!(typeY instanceof ParameterizedType)) {
                                                    throw UK.M(method2, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeY;
                                                Type typeU = UK.u(0, parameterizedType);
                                                if (String.class != typeU) {
                                                    throw UK.M(method2, i7, "@QueryMap keys must be of type String: " + typeU, new Object[0]);
                                                }
                                                c2923u81.f(UK.u(1, parameterizedType), annotationArr4);
                                                c2271nX = new C1687hX(method2, i7, ((InterfaceC3303y40) annotation).encoded(), 2);
                                            } else if (annotation instanceof InterfaceC1859jB) {
                                                c3115w70.c(i7, type);
                                                InterfaceC1859jB interfaceC1859jB = (InterfaceC1859jB) annotation;
                                                String strValue3 = interfaceC1859jB.value();
                                                Class clsW4 = UK.w(type);
                                                if (Iterable.class.isAssignableFrom(clsW4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw UK.M(method2, i7, clsW4.getSimpleName() + " must include generic type (e.g., " + clsW4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c2923u81.f(UK.u(0, (ParameterizedType) type), annotationArr4);
                                                    c1393eX = new C1393eX(new C1589gX(1, strValue3, interfaceC1859jB.allowUnsafeNonAsciiValues()), 0);
                                                    c2271nX = c1393eX;
                                                } else if (clsW4.isArray()) {
                                                    c2923u81.f(C3115w70.a(clsW4.getComponentType()), annotationArr4);
                                                    c2271nX = new C1393eX(new C1589gX(1, strValue3, interfaceC1859jB.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c2923u81.f(type, annotationArr4);
                                                    c2271nX = new C1589gX(1, strValue3, interfaceC1859jB.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof InterfaceC2055lB) {
                                                if (type == C2152mB.class) {
                                                    c2271nX = new C1785iX(method2, i7, 0);
                                                } else {
                                                    c3115w70.c(i7, type);
                                                    Class clsW5 = UK.w(type);
                                                    if (!Map.class.isAssignableFrom(clsW5)) {
                                                        throw UK.M(method2, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeY2 = UK.y(type, clsW5);
                                                    if (!(typeY2 instanceof ParameterizedType)) {
                                                        throw UK.M(method2, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeY2;
                                                    Type typeU2 = UK.u(0, parameterizedType2);
                                                    if (String.class != typeU2) {
                                                        throw UK.M(method2, i7, "@HeaderMap keys must be of type String: " + typeU2, new Object[0]);
                                                    }
                                                    c2923u81.f(UK.u(1, parameterizedType2), annotationArr4);
                                                    c2271nX = new C1687hX(method2, i7, ((InterfaceC2055lB) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof InterfaceC3477zu) {
                                                c3115w70.c(i7, type);
                                                if (!c3115w70.q) {
                                                    throw UK.M(method2, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC3477zu interfaceC3477zu = (InterfaceC3477zu) annotation;
                                                String strValue4 = interfaceC3477zu.value();
                                                boolean zEncoded3 = interfaceC3477zu.encoded();
                                                c3115w70.g = true;
                                                Class clsW6 = UK.w(type);
                                                if (Iterable.class.isAssignableFrom(clsW6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw UK.M(method2, i7, clsW6.getSimpleName() + " must include generic type (e.g., " + clsW6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c2923u81.f(UK.u(0, (ParameterizedType) type), annotationArr4);
                                                    c1393eX = new C1393eX(new C1589gX(0, strValue4, zEncoded3), 0);
                                                } else if (clsW6.isArray()) {
                                                    c2923u81.f(C3115w70.a(clsW6.getComponentType()), annotationArr4);
                                                    c1393eX = new C1393eX(new C1589gX(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    c2923u81.f(type, annotationArr4);
                                                    c2271nX = new C1589gX(0, strValue4, zEncoded3);
                                                }
                                                c2271nX = c1393eX;
                                            } else if (annotation instanceof InterfaceC0304Au) {
                                                c3115w70.c(i7, type);
                                                if (!c3115w70.q) {
                                                    throw UK.M(method2, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsW7 = UK.w(type);
                                                if (!Map.class.isAssignableFrom(clsW7)) {
                                                    throw UK.M(method2, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeY3 = UK.y(type, clsW7);
                                                if (!(typeY3 instanceof ParameterizedType)) {
                                                    throw UK.M(method2, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeY3;
                                                int i12 = 0;
                                                Type typeU3 = UK.u(0, parameterizedType3);
                                                if (String.class != typeU3) {
                                                    throw UK.M(method2, i7, "@FieldMap keys must be of type String: " + typeU3, new Object[0]);
                                                }
                                                c2923u81.f(UK.u(1, parameterizedType3), annotationArr4);
                                                c3115w70.g = true;
                                                c2271nX = new C1687hX(method2, i7, ((InterfaceC0304Au) annotation).encoded(), i12);
                                            } else {
                                                i8 = i8;
                                                if (annotation instanceof InterfaceC3240xX) {
                                                    c3115w70.c(i7, type);
                                                    if (!c3115w70.r) {
                                                        throw UK.M(method2, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    InterfaceC3240xX interfaceC3240xX = (InterfaceC3240xX) annotation;
                                                    c3115w70.h = true;
                                                    String strValue5 = interfaceC3240xX.value();
                                                    Class clsW8 = UK.w(type);
                                                    if (strValue5.isEmpty()) {
                                                        boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsW8);
                                                        c1491fX = C2174mX.f;
                                                        if (zIsAssignableFrom) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw UK.M(method2, i7, clsW8.getSimpleName() + " must include generic type (e.g., " + clsW8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            int i13 = 0;
                                                            if (!QS.class.isAssignableFrom(UK.w(UK.u(0, (ParameterizedType) type)))) {
                                                                throw UK.M(method2, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c2271nX = new C1393eX(c1491fX, i13);
                                                        } else if (!clsW8.isArray()) {
                                                            if (!QS.class.isAssignableFrom(clsW8)) {
                                                                throw UK.M(method2, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c2271nX = c1491fX;
                                                        } else {
                                                            if (!QS.class.isAssignableFrom(clsW8.getComponentType())) {
                                                                throw UK.M(method2, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c2271nX = new C1393eX(c1491fX, 1);
                                                        }
                                                    } else {
                                                        C2152mB c2152mBV = AbstractC1468fA.v("Content-Disposition", AbstractC1701hf0.u("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC3240xX.encoding());
                                                        if (Iterable.class.isAssignableFrom(clsW8)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw UK.M(method2, i7, clsW8.getSimpleName() + " must include generic type (e.g., " + clsW8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            int i14 = 0;
                                                            Type typeU4 = UK.u(0, (ParameterizedType) type);
                                                            if (QS.class.isAssignableFrom(UK.w(typeU4))) {
                                                                throw UK.M(method2, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c2271nX = new C1393eX(new C1881jX(method2, i7, c2152mBV, c2923u81.d(typeU4, annotationArr4, annotationArr2)), i14);
                                                        } else if (clsW8.isArray()) {
                                                            Class clsA = C3115w70.a(clsW8.getComponentType());
                                                            if (QS.class.isAssignableFrom(clsA)) {
                                                                throw UK.M(method2, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c2271nX = new C1393eX(new C1881jX(method2, i7, c2152mBV, c2923u81.d(clsA, annotationArr4, annotationArr2)), 1);
                                                        } else {
                                                            if (QS.class.isAssignableFrom(clsW8)) {
                                                                throw UK.M(method2, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c2271nX = new C1881jX(method2, i7, c2152mBV, c2923u81.d(type, annotationArr4, annotationArr2));
                                                        }
                                                    }
                                                } else if (annotation instanceof InterfaceC3337yX) {
                                                    c3115w70.c(i7, type);
                                                    if (!c3115w70.r) {
                                                        throw UK.M(method2, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    c3115w70.h = true;
                                                    Class clsW9 = UK.w(type);
                                                    if (!Map.class.isAssignableFrom(clsW9)) {
                                                        throw UK.M(method2, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeY4 = UK.y(type, clsW9);
                                                    if (!(typeY4 instanceof ParameterizedType)) {
                                                        throw UK.M(method2, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType4 = (ParameterizedType) typeY4;
                                                    Type typeU5 = UK.u(0, parameterizedType4);
                                                    if (String.class != typeU5) {
                                                        throw UK.M(method2, i7, "@PartMap keys must be of type String: " + typeU5, new Object[0]);
                                                    }
                                                    Type typeU6 = UK.u(1, parameterizedType4);
                                                    if (QS.class.isAssignableFrom(UK.w(typeU6))) {
                                                        throw UK.M(method2, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                    }
                                                    c2271nX = new C1881jX(method2, i7, c2923u81.d(typeU6, annotationArr4, annotationArr2), ((InterfaceC3337yX) annotation).encoding());
                                                } else if (annotation instanceof InterfaceC0978a9) {
                                                    c3115w70.c(i7, type);
                                                    if (c3115w70.q || c3115w70.r) {
                                                        throw UK.M(method2, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                    }
                                                    if (c3115w70.i) {
                                                        throw UK.M(method2, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                    try {
                                                        InterfaceC0602Mh interfaceC0602MhD = c2923u81.d(type, annotationArr4, annotationArr2);
                                                        c3115w70.i = true;
                                                        c1491fX = new C1491fX(method2, i7, interfaceC0602MhD);
                                                        c2271nX = c1491fX;
                                                    } catch (RuntimeException e) {
                                                        throw UK.N(method2, e, i7, "Unable to create @Body converter for %s", type);
                                                    }
                                                } else if (annotation instanceof InterfaceC2582qi0) {
                                                    c3115w70.c(i7, type);
                                                    Class clsW10 = UK.w(type);
                                                    for (int i15 = i7 - 1; i15 >= 0; i15--) {
                                                        Pu0 pu1 = c3115w70.w[i15];
                                                        if ((pu1 instanceof C2271nX) && ((C2271nX) pu1).f.equals(clsW10)) {
                                                            throw UK.M(method2, i7, "@Tag type " + clsW10.getName() + " is duplicate of " + WY.b.r(method2, i15) + " and would always overwrite its value.", new Object[0]);
                                                        }
                                                    }
                                                    c2271nX = new C2271nX(clsW10);
                                                } else {
                                                    c2271nX = null;
                                                }
                                            }
                                            i8 = i8;
                                        }
                                    }
                                    if (c2271nX != null) {
                                        if (pu0 == null) {
                                            throw UK.M(method2, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        pu0 = c2271nX;
                                    }
                                    i8++;
                                    annotationArr3 = annotationArr;
                                    length2 = i9;
                                    i6 = i10;
                                    length3 = i11;
                                    str3 = str2;
                                    pu0Arr3 = pu0Arr2;
                                    z6 = z4;
                                }
                            }
                            z4 = z6;
                            if (c2271nX != null) {
                                if (pu0 == null) {
                                    throw UK.M(method2, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                pu0 = c2271nX;
                            }
                            i8++;
                            annotationArr3 = annotationArr;
                            length2 = i9;
                            i6 = i10;
                            length3 = i11;
                            str3 = str2;
                            pu0Arr3 = pu0Arr2;
                            z6 = z4;
                        }
                    } else {
                        annotationArr = annotationArr3;
                        i = length2;
                        i2 = i6;
                        pu0Arr = pu0Arr3;
                        str = str3;
                        z3 = z6;
                        pu0 = null;
                    }
                    if (pu0 == null) {
                        if (z3) {
                            try {
                                if (UK.w(type) == InterfaceC0473Hh.class) {
                                    c3115w70.x = true;
                                    pu0 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw UK.M(method2, i7, "No Retrofit annotation found.", new Object[0]);
                    }
                    pu0Arr[i7] = pu0;
                    i7++;
                    annotationArr3 = annotationArr;
                    length2 = i;
                    i6 = i2;
                    str3 = str;
                }
                String str4 = str3;
                if (c3115w70.s == null && !c3115w70.n) {
                    throw UK.K(method2, null, "Missing either @%s URL or @Url parameter.", c3115w70.f1089o);
                }
                boolean z8 = c3115w70.q;
                if (!z8 && !c3115w70.r && !c3115w70.p && c3115w70.i) {
                    throw UK.K(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z8 && !c3115w70.g) {
                    throw UK.K(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c3115w70.r && !c3115w70.h) {
                    throw UK.K(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C3212x70 c3212x70 = new C3212x70(c3115w70);
                Type genericReturnType2 = method.getGenericReturnType();
                if (UK.z(genericReturnType2)) {
                    throw UK.K(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw UK.K(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z9 = c3212x70.l;
                if (z9) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeU7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeU7 instanceof WildcardType) {
                        typeU7 = ((WildcardType) typeU7).getLowerBounds()[0];
                    }
                    if (UK.w(typeU7) == C1759i80.class && (typeU7 instanceof ParameterizedType)) {
                        typeU7 = UK.u(0, (ParameterizedType) typeU7);
                        zG = false;
                        z2 = true;
                    } else {
                        if (UK.w(typeU7) == InterfaceC0621Na.class) {
                            throw UK.K(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", UK.u(0, (ParameterizedType) typeU7));
                        }
                        zG = UK.G(typeU7);
                        z2 = false;
                    }
                    genericReturnType = new Pr0(null, InterfaceC0621Na.class, typeU7);
                    if (!UK.A(annotations, InterfaceC2670re0.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = C2767se0.a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                    z = z2;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    zG = false;
                }
                try {
                    InterfaceC0673Pa interfaceC0673PaA = c2923u80.a(genericReturnType, annotations);
                    Type typeG = interfaceC0673PaA.G();
                    if (typeG == C1855j80.class) {
                        throw UK.K(method, null, "'" + UK.w(typeG).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeG == C1759i80.class) {
                        throw UK.K(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c3212x70.d.equals(str4) && !Void.class.equals(typeG) && !UK.G(typeG)) {
                        throw UK.K(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC0602Mh interfaceC0602MhE = c2923u80.e(typeG, method.getAnnotations());
                        InterfaceC0595Ma interfaceC0595Ma = c2923u80.b;
                        if (z9) {
                            return z ? new C2058lE(c3212x70, interfaceC0595Ma, interfaceC0602MhE, interfaceC0673PaA, 1) : new C2155mE(c3212x70, interfaceC0595Ma, interfaceC0602MhE, interfaceC0673PaA, zG);
                        }
                        return new C2058lE(c3212x70, interfaceC0595Ma, interfaceC0602MhE, interfaceC0673PaA, 0);
                    } catch (RuntimeException e2) {
                        throw UK.K(method, e2, "Unable to create converter for %s", typeG);
                    }
                } catch (RuntimeException e3) {
                    throw UK.K(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i5];
            if (annotation2 instanceof InterfaceC0370Di) {
                c3115w70.b("DELETE", ((InterfaceC0370Di) annotation2).value(), z5);
            } else if (annotation2 instanceof InterfaceC1251cz) {
                c3115w70.b("GET", ((InterfaceC1251cz) annotation2).value(), z5);
            } else if (annotation2 instanceof UA) {
                c3115w70.b("HEAD", ((UA) annotation2).value(), z5);
            } else if (annotation2 instanceof MW) {
                c3115w70.b("PATCH", ((MW) annotation2).value(), true);
            } else if (annotation2 instanceof NW) {
                c3115w70.b("POST", ((NW) annotation2).value(), true);
            } else if (annotation2 instanceof SW) {
                c3115w70.b("PUT", ((SW) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC3044vV) {
                c3115w70.b("OPTIONS", ((InterfaceC3044vV) annotation2).value(), z5);
            } else {
                if (annotation2 instanceof YA) {
                    YA ya = (YA) annotation2;
                    c3115w70.b(ya.method(), ya.path(), ya.hasBody());
                } else if (annotation2 instanceof InterfaceC2249nB) {
                    InterfaceC2249nB interfaceC2249nB = (InterfaceC2249nB) annotation2;
                    String[] strArrValue = interfaceC2249nB.value();
                    if (strArrValue.length == 0) {
                        throw UK.K(method2, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    boolean zAllowUnsafeNonAsciiValues = interfaceC2249nB.allowUnsafeNonAsciiValues();
                    C2112lq c2112lq = new C2112lq(1);
                    int length4 = strArrValue.length;
                    int i16 = 0;
                    while (i16 < length4) {
                        String str5 = strArrValue[i16];
                        int iIndexOf = str5.indexOf(58);
                        if (iIndexOf == i4 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                            throw UK.K(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                        }
                        int i17 = length;
                        String strSubstring = str5.substring(0, iIndexOf);
                        String strTrim = str5.substring(iIndexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                            try {
                                Pattern pattern = TP.e;
                                c3115w70.u = AbstractC1474fG.o(strTrim);
                            } catch (IllegalArgumentException e4) {
                                throw UK.K(method2, e4, "Malformed content type: %s", strTrim);
                            }
                        } else if (zAllowUnsafeNonAsciiValues) {
                            c2112lq.e(strSubstring, strTrim);
                        } else {
                            c2112lq.a(strSubstring, strTrim);
                        }
                        i16++;
                        length = i17;
                        i4 = -1;
                    }
                    i3 = length;
                    c3115w70.t = c2112lq.f();
                } else {
                    i3 = length;
                    if (annotation2 instanceof PS) {
                        if (c3115w70.q) {
                            throw UK.K(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        c3115w70.r = true;
                    } else if (!(annotation2 instanceof InterfaceC0591Lw)) {
                        continue;
                    } else {
                        if (c3115w70.r) {
                            throw UK.K(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        c3115w70.q = true;
                    }
                }
                i5++;
                length = i3;
                i4 = -1;
                z5 = false;
            }
            i3 = length;
            i5++;
            length = i3;
            i4 = -1;
            z5 = false;
        }
    }

    public abstract Object a(MV mv, Object[] objArr);
}
