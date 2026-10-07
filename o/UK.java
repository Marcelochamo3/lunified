package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class UK {
    public static final String[] a = {"tv-", "xuper-live:", "claro-", "fctvevent-", "claroandina-", "tigo-", "ppv-", "claroar-", "ak47-", "eventoshd-", "fanatiz_", "fana-content|", "fana-event|", "fana-episode|", "disney-", "events_disney"};
    public static final Type[] b = new Type[0];
    public static final int[] c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] e = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, Qd0.j, 1536, 1920, C1672hI.a.g, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, C1672hI.a.f, 6144, 7680};
    public static final Zb0[] f = new Zb0[0];
    public static final Type[] g = new Type[0];
    public static boolean h = true;

    public static boolean A(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(Object obj) {
        return obj == Jp0.a;
    }

    public static boolean C(int i) {
        return i != 0 && AbstractC1894jf.c(i) > 0.5d;
    }

    public static final boolean E(C1387eR c1387eR) {
        AbstractC1474fG.j(c1387eR, "<this>");
        boolean zB = AbstractC1474fG.b(c1387eR.t, "FANATIZ");
        Map map = c1387eR.n;
        if (zB && map.containsKey("is_tv_channel")) {
            Object obj = map.get("is_tv_channel");
            Boolean bool = Boolean.TRUE;
            return AbstractC1474fG.b(obj, bool) || AbstractC1474fG.b(map.get("is_live_channel"), bool);
        }
        if (F(c1387eR.a)) {
            return true;
        }
        Object obj2 = map.get("is_tv_channel");
        Boolean bool2 = Boolean.TRUE;
        return AbstractC1474fG.b(obj2, bool2) || AbstractC1474fG.b(map.get("is_live_channel"), bool2);
    }

    public static final boolean F(String str) {
        AbstractC1474fG.j(str, "<this>");
        Locale locale = Locale.ROOT;
        String strI = AbstractC1701hf0.i(locale, "ROOT", str, locale, "toLowerCase(...)");
        String[] strArr = a;
        for (int i = 0; i < 16; i++) {
            if (AbstractC1899jh0.U(strI, strArr[i], false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean G(Type type) {
        return h && type == C2985uq0.class;
    }

    public static final G H(Object[] objArr) {
        AbstractC1474fG.j(objArr, "array");
        return new G(objArr);
    }

    public static int I(int i, float f2, int i2) {
        return AbstractC1894jf.d(AbstractC1894jf.f(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static String J(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("o.UK");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static IllegalArgumentException K(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbS = AbstractC1674hK.s(String.format(str, objArr), "\n    for method ");
        sbS.append(method.getDeclaringClass().getSimpleName());
        sbS.append(".");
        sbS.append(method.getName());
        return new IllegalArgumentException(sbS.toString(), exc);
    }

    public static final C1098bU L(InterfaceC0412Ey interfaceC0412Ey) {
        C1195cU c1195cU = new C1195cU();
        interfaceC0412Ey.b(c1195cU);
        boolean z = c1195cU.b;
        C1000aU c1000aU = c1195cU.a;
        c1000aU.a = z;
        c1000aU.b = c1195cU.c;
        int i = c1195cU.d;
        boolean z2 = c1195cU.e;
        c1000aU.c = i;
        c1000aU.d = null;
        c1000aU.e = false;
        c1000aU.f = z2;
        return c1000aU.a();
    }

    public static IllegalArgumentException M(Method method, int i, String str, Object... objArr) {
        return K(method, null, str + " (" + WY.b.r(method, i) + ")", objArr);
    }

    public static IllegalArgumentException N(Method method, Exception exc, int i, String str, Object... objArr) {
        return K(method, exc, str + " (" + WY.b.r(method, i) + ")", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    public static Type O(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type type4;
        Type type5 = type2;
        while (type5 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type4 = typeVariable;
            } else {
                Type typeS = s(type, cls, cls2);
                if (typeS instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int i = 0;
                    while (true) {
                        if (i >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeS).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
        if (type5 instanceof Class) {
            Class cls3 = (Class) type5;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeO = O(type, cls, componentType);
                return componentType == typeO ? cls3 : new Or0(typeO);
            }
        }
        if (type5 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type5;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeO2 = O(type, cls, genericComponentType);
            return genericComponentType == typeO2 ? genericArrayType : new Or0(typeO2);
        }
        if (type5 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type5;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeO3 = O(type, cls, ownerType);
            boolean z = typeO3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeO4 = O(type, cls, actualTypeArguments[i2]);
                if (typeO4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeO4;
                }
            }
            return z ? new Pr0(typeO3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type5 instanceof WildcardType) {
            wildcardType = (WildcardType) type5;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeO5 = O(type, cls, lowerBounds[0]);
                if (typeO5 != lowerBounds[0]) {
                    type3 = type5;
                    type3 = wildcardType;
                    return new Qr0(new Type[]{Object.class}, new Type[]{typeO5});
                }
            } else if (upperBounds.length == 1) {
                type3 = type5;
                type3 = wildcardType;
                Type typeO6 = O(type, cls, upperBounds[0]);
                type3 = wildcardType;
                if (typeO6 != upperBounds[0]) {
                    return new Qr0(new Type[]{typeO6}, g);
                }
            }
        }
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        type3 = wildcardType;
        type3 = type5;
        return type3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [o.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static Type P(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeP;
        Type[] upperBounds2;
        Type typeP2;
        Type[] lowerBounds2;
        Type typeP3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type c1057b;
        Type typeP4;
        Type genericComponentType;
        Type typeP5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeP = P(type, cls, upperBounds[0], map);
                                if (typeP != upperBounds[0]) {
                                    break;
                                }
                                if (typeP instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeP).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeP};
                                }
                                type2 = new C1154c(upperBounds2, b);
                                break;
                            }
                            typeP2 = P(type, cls, lowerBounds[0], map);
                            if (typeP2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeP2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeP2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeP2};
                            }
                            type2 = new C1154c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeP3 = P(type, cls, ownerType, map);
                        z = !Objects.equals(typeP3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            typeP4 = P(type, cls, actualTypeArguments[i], map);
                            if (Objects.equals(typeP4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeP4;
                            }
                        }
                        if (z) {
                            break;
                        }
                        c1057b = new C1057b(typeP3, type2.getRawType(), actualTypeArguments);
                        type2 = c1057b;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeP5 = P(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeP5)) {
                        c1057b = new C0959a(typeP5);
                        type2 = c1057b;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeP = P(type, cls, upperBounds[0], map);
                                if (typeP != upperBounds[0]) {
                                    break;
                                }
                                if (typeP instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeP).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeP};
                                }
                                type2 = new C1154c(upperBounds2, b);
                                break;
                            }
                            typeP2 = P(type, cls, lowerBounds[0], map);
                            if (typeP2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeP2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeP2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeP2};
                            }
                            type2 = new C1154c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeP3 = P(type, cls, ownerType2, map);
                        z = !Objects.equals(typeP3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeP4 = P(type, cls, actualTypeArguments[i], map);
                            if (Objects.equals(typeP4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeP4;
                            }
                        }
                        if (z) {
                            break;
                        }
                        c1057b = new C1057b(typeP3, type2.getRawType(), actualTypeArguments);
                        type2 = c1057b;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeP5 = P(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeP5)) {
                        break;
                    }
                    c1057b = new C0959a(typeP5);
                    type2 = c1057b;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeP6 = P(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeP6)) {
                    c1057b = new C0959a(typeP6);
                    type2 = c1057b;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            if (type3 != null) {
                return type3 == Void.TYPE ? type2 : type3;
            }
            map.put(typeVariable, Void.TYPE);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeR = r(type, cls, cls3);
                if (typeR instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    int length2 = typeParameters.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type2 = ((ParameterizedType) typeR).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static final void Q(View view, InterfaceC1588gW interfaceC1588gW) {
        AbstractC1474fG.j(view, "<this>");
        AbstractC1474fG.j(interfaceC1588gW, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC1588gW);
    }

    public static void T(List list, I20 i20, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (i20.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static void U(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String V(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static String W(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static I9 a(int i, int i2, int i3) {
        I9 c2383og;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i != -2) {
            if (i == -1) {
                if (i2 == 1) {
                    return new C2383og(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    return i2 == 1 ? new I9(i, null) : new C2383og(i, i2, null);
                }
                return new I9(Integer.MAX_VALUE, null);
            }
            c2383og = i2 == 1 ? new I9(0, null) : new C2383og(1, i2, null);
        } else if (i2 == 1) {
            InterfaceC0416Fc.b.getClass();
            c2383og = new I9(C0390Ec.b, null);
        } else {
            c2383og = new C2383og(1, i2, null);
        }
        return c2383og;
    }

    public static final Set b(Zb0 zb0) {
        AbstractC1474fG.j(zb0, "<this>");
        if (zb0 instanceof InterfaceC0518Ja) {
            return ((InterfaceC0518Ja) zb0).e();
        }
        HashSet hashSet = new HashSet(zb0.c());
        int iC = zb0.c();
        for (int i = 0; i < iC; i++) {
            hashSet.add(zb0.d(i));
        }
        return hashSet;
    }

    public static Type c(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0959a(c(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1057b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0959a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C1154c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void d(Type type) {
        U9.c(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static void e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    public static int f(Context context, String str) {
        int iA;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        String strD = i >= 23 ? AbstractC2722s5.d(str) : null;
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            int iC = 1;
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                if (i >= 29) {
                    AppOpsManager appOpsManagerC = AbstractC2819t5.c(context);
                    iA = AbstractC2819t5.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iA == 0) {
                        iA = AbstractC2819t5.a(appOpsManagerC, strD, iMyUid, AbstractC2819t5.b(context));
                    }
                } else if (i >= 23) {
                    iC = AbstractC2722s5.c((AppOpsManager) AbstractC2722s5.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iA != 0) {
                    return -2;
                }
            } else if (i >= 23) {
                iC = AbstractC2722s5.c((AppOpsManager) AbstractC2722s5.a(context, AppOpsManager.class), strD, packageName);
            }
            iA = iC;
            if (iA != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final Zb0[] g(List list) {
        Zb0[] zb0Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (zb0Arr = (Zb0[]) list.toArray(new Zb0[0])) == null) ? f : zb0Arr;
    }

    public static void h(final S20 s20) {
        AbstractC1474fG.j(s20, "fragment");
        Q30.a.getClass();
        final List list = P30.b;
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Q30) it.next()).getName());
        }
        final Preference preferenceW = s20.W("VISIBLE_PROVIDERS");
        if (preferenceW != null) {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Q30) it2.next()).getName());
            }
            final String[] strArr = (String[]) arrayList.toArray(new String[0]);
            preferenceW.C = false;
            i(preferenceW, list, s20);
            preferenceW.q = new M20() { // from class: o.a40
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.Object, java.lang.String[]] */
                @Override // o.M20
                public final void a(Preference preference) {
                    S20 s21 = s20;
                    AbstractC1474fG.j(s21, "$fragment");
                    ?? r2 = strArr;
                    AbstractC1474fG.j(r2, "$providerNames");
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    AbstractC1474fG.j(linkedHashSet2, "$allNames");
                    List list2 = list;
                    AbstractC1474fG.j(list2, "$allProviders");
                    AbstractC1474fG.j(preference, "it");
                    LinkedHashSet linkedHashSetA = AbstractC1459f50.A();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    for (Object obj : linkedHashSetA) {
                        if (linkedHashSet2.contains((String) obj)) {
                            linkedHashSet3.add(obj);
                        }
                    }
                    Context contextQ = s21.Q();
                    String strN = s21.n(R.string.settings_visible_providers_dialog_title);
                    AbstractC1474fG.i(strN, "getString(...)");
                    String strN2 = s21.n(R.string.settings_visible_providers_dialog_subtitle);
                    AbstractC1474fG.i(strN2, "getString(...)");
                    ArrayList arrayList2 = new ArrayList(r2.length);
                    for (String str : r2) {
                        arrayList2.add(new Pc0(str, null, null));
                    }
                    ZF zf = new ZF(0, r2.length - 1, 1);
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                    YF it3 = zf.iterator();
                    while (it3.n) {
                        Object next = it3.next();
                        if (linkedHashSet3.contains(r2[((Number) next).intValue()])) {
                            linkedHashSet4.add(next);
                        }
                    }
                    C3325yL.z(contextQ, strN, strN2, arrayList2, linkedHashSet4, true, 1, s21 instanceof SettingsTvFragment, R.drawable.ic_settings_providers, new KT(r2, preferenceW, s21, list2, 1));
                }
            };
        }
        Preference preferenceW2 = s20.W("RESET_VISIBLE_PROVIDERS");
        if (preferenceW2 != null) {
            preferenceW2.q = new C1054ay(s20, preferenceW, list, 2);
        }
    }

    public static final void i(Preference preference, List list, S20 s20) {
        LinkedHashSet linkedHashSetA = AbstractC1459f50.A();
        if (preference == null) {
            return;
        }
        preference.v(s20.o(R.string.settings_visible_providers_summary, Integer.valueOf(linkedHashSetA.size()), Integer.valueOf(list.size())));
    }

    public static final C2538q90 j(F80 f80, String[] strArr, Callable callable) {
        return new C2538q90(new C2193mi(false, f80, strArr, callable, null));
    }

    public static boolean k(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return k(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static boolean l(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return l(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final YT m(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "<this>");
        return Pu0.j(abstractComponentCallbacksC1247cx);
    }

    public static int n(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueY = zy0.y(context, i);
        if (typedValueY != null) {
            int i3 = typedValueY.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? AbstractC1459f50.u(context, i3) : typedValueY.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int o(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueA = zy0.A(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueA.resourceId;
        return i2 != 0 ? AbstractC1459f50.u(context, i2) : typedValueA.data;
    }

    public static Object q(String str, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Type r(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return r(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return r(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type s(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return s(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return s(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Object t(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Type u(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbR = AbstractC1674hK.r("Index ", i, " not in range [0,");
        sbR.append(actualTypeArguments.length);
        sbR.append(") for ");
        sbR.append(parameterizedType);
        throw new IllegalArgumentException(sbR.toString());
    }

    public static Class v(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            U9.c(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) v(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return v(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Class w(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) w(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return w(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static final AbstractC3440zb0 x(Object obj) {
        if (obj != Jp0.a) {
            return (AbstractC3440zb0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static Type y(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return O(type, cls, s(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean z(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (z(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return z(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public abstract boolean D();

    public abstract void R(boolean z);

    public abstract void S(boolean z);

    public abstract TransformationMethod X(TransformationMethod transformationMethod);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);
}
