package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.NavHostFragment;
import com.skidush.clonex.R;
import com.skidush.clonex.activities.main.MainMobileActivity;
import com.skidush.clonex.activities.main.MainTvActivity;
import j$.util.Objects;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* JADX INFO: renamed from: o.Ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397Ej {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, Yu0.b.h0, Yu0.b.v0, 174, 208, Yu0.b.z0, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final Q3 g = new Q3(1);
    public static final Q3 h = new Q3(2);
    public static final byte[] i = {48, 49, 53, 0};
    public static final byte[] j = {48, 49, 48, 0};
    public static final byte[] k = {48, 48, 57, 0};
    public static final byte[] l = {48, 48, 53, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 49, 0};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f244o = {48, 48, 50, 0};

    public static final boolean A(YT yt, UT ut) {
        AbstractC1474fG.j(yt, "<this>");
        TT ttH = yt.h();
        if (ttH == null || ttH.e(ut.b()) == null) {
            return false;
        }
        try {
            yt.p(ut);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static int B(long j2, long j3, boolean z, int i2) {
        if (!z || j2 < 0 || j3 > 40000 || j2 - j3 < 500) {
            return 0;
        }
        int i3 = i2 + 1;
        if (i3 > 2) {
            return 2;
        }
        return i3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final boolean C(MenuItem menuItem, YT yt) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        AbstractC1474fG.j(menuItem, "item");
        AbstractC1474fG.j(yt, "navController");
        TT ttH = yt.h();
        AbstractC1474fG.g(ttH);
        WT wt = ttH.m;
        AbstractC1474fG.g(wt);
        if (wt.k(menuItem.getItemId(), wt, false) instanceof D1) {
            i2 = R.anim.nav_default_enter_anim;
            i3 = R.anim.nav_default_exit_anim;
            i4 = R.anim.nav_default_pop_enter_anim;
            i5 = R.anim.nav_default_pop_exit_anim;
        } else {
            i2 = R.animator.nav_default_enter_anim;
            i3 = R.animator.nav_default_exit_anim;
            i4 = R.animator.nav_default_pop_enter_anim;
            i5 = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            int i7 = WT.A;
            i6 = Ou0.j(yt.j()).s;
            z = true;
        } else {
            i6 = -1;
            z = false;
        }
        try {
            yt.n(menuItem.getItemId(), null, new C1098bU(true, true, i6, false, z, i2, i3, i4, i5));
            TT ttH2 = yt.h();
            return ttH2 != null && x(ttH2, menuItem.getItemId());
        } catch (IllegalArgumentException unused) {
            int i8 = TT.v;
            AbstractC1923jt0.m(yt.a, menuItem.getItemId());
            Objects.toString(yt.h());
            return false;
        }
    }

    public static void D(int i2, String str) {
        String str2 = "sustained_buffering";
        if (!AbstractC1474fG.b(str, "sustained_buffering")) {
            str2 = "player_error";
            if (!AbstractC1474fG.b(str, "player_error")) {
                str2 = "other";
            }
        }
        int iH = U9.h(i2, 0, 9);
        try {
            Class.forName("android.util.Log").getMethod("w", String.class, String.class).invoke(null, "PlaybackDiagnostic", "area=tvprovider_vod_failover trigger=" + str2 + " stalls=" + iH);
        } catch (Throwable th) {
            Jp0.k(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int E(Hb0 hb0, int i2) {
        int i3;
        AbstractC1474fG.j(hb0, "<this>");
        int i4 = i2 + 1;
        int length = hb0.p.length;
        int[] iArr = hb0.q;
        AbstractC1474fG.j(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (i6 <= i5) {
            i3 = (i6 + i5) >>> 1;
            int i7 = iArr[i3];
            if (i7 < i4) {
                i6 = i3 + 1;
            } else {
                if (i7 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                i5 = i3 - 1;
            }
        }
        i3 = (-i6) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d5 A[EDGE_INSN: B:106:0x01d5->B:107:0x01d6 BREAK  A[LOOP:2: B:96:0x01b5->B:102:0x01cc]] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d8 A[Catch: NoSuchFieldException -> 0x01e8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x01e8, blocks: (B:94:0x01a9, B:108:0x01d8), top: B:145:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef A[Catch: NoSuchFieldException -> 0x01e4, TRY_LEAVE, TryCatch #4 {NoSuchFieldException -> 0x01e4, blocks: (B:111:0x01df, B:116:0x01eb, B:118:0x01ef), top: B:151:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f2 A[PHI: r4
  0x01f2: PHI (r4v14 o.mI) = (r4v13 o.mI), (r4v22 o.mI), (r4v25 o.mI) binds: [B:112:0x01e4, B:117:0x01ed, B:103:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x017b A[EDGE_INSN: B:162:0x017b->B:80:0x017b BREAK  A[LOOP:1: B:74:0x016a->B:78:0x0177], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[PHI: r4
  0x0076: PHI (r4v35 o.mI) = (r4v9 o.mI), (r4v27 o.mI), (r4v27 o.mI), (r4v39 o.mI) binds: [B:27:0x00a0, B:128:0x0204, B:130:0x0216, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155 A[PHI: r1
  0x0155: PHI (r1v24 o.mI) = (r1v2 o.mI), (r1v15 o.mI) binds: [B:71:0x0153, B:131:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177 A[LOOP:1: B:74:0x016a->B:78:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0180  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c5 A[DONT_INVERT] */
    public static final InterfaceC2159mI F(InterfaceC1476fI interfaceC1476fI) throws IllegalAccessException, InvocationTargetException {
        InterfaceC2159mI[] interfaceC2159mIArr;
        Object obj;
        InterfaceC2159mI interfaceC2159mIR;
        String canonicalName;
        InterfaceC2159mI c1649h20;
        Class<?>[] declaredClasses;
        int length;
        int i2;
        Class<?> cls;
        Object obj2;
        InterfaceC2159mI interfaceC2159mI;
        InterfaceC2159mI c1649h21;
        Class<?>[] declaredClasses2;
        int length2;
        int i3;
        Class<?> cls2;
        boolean z;
        Class<?> cls3;
        Object obj3;
        Field field;
        Class<?> cls4;
        InterfaceC1206cc0 interfaceC1206cc0;
        InterfaceC2159mI interfaceC2159mIR2;
        Class clsS = s(interfaceC1476fI);
        InterfaceC2159mI[] interfaceC2159mIArr2 = (InterfaceC2159mI[]) Arrays.copyOf(new InterfaceC2159mI[0], 0);
        AbstractC1474fG.j(interfaceC2159mIArr2, "args");
        if (clsS.isEnum() && clsS.getAnnotation(InterfaceC1206cc0.class) == null && clsS.getAnnotation(InterfaceC1453f20.class) == null) {
            Object[] enumConstants = clsS.getEnumConstants();
            String canonicalName2 = clsS.getCanonicalName();
            AbstractC1474fG.i(canonicalName2, "getCanonicalName(...)");
            AbstractC1474fG.h(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            c1649h21 = new C1649h20(canonicalName2, (Enum[]) enumConstants);
        } else if (clsS.isInterface()) {
            InterfaceC1206cc0 interfaceC1206cc1 = (InterfaceC1206cc0) clsS.getAnnotation(InterfaceC1206cc0.class);
            interfaceC2159mIR = (interfaceC1206cc1 == null || AbstractC1474fG.b(AbstractC2822t60.a(interfaceC1206cc1.with()), AbstractC2822t60.a(C1649h20.class))) ? new C1649h20(AbstractC2822t60.a(clsS)) : null;
            if (interfaceC2159mIR != null) {
                c1649h21 = interfaceC2159mIR;
            } else {
                interfaceC2159mIArr = (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr2, interfaceC2159mIArr2.length);
                Field declaredField = clsS.getDeclaredField("Companion");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
                if (obj == null) {
                    interfaceC2159mIR = null;
                } else {
                    interfaceC2159mIR = AbstractC3409z9.r(obj, (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr, interfaceC2159mIArr.length));
                }
                if (interfaceC2159mIR == null) {
                    canonicalName = clsS.getCanonicalName();
                    if (canonicalName != null) {
                        c1649h20 = null;
                    } else {
                        c1649h20 = null;
                    }
                    if (c1649h20 != null) {
                        c1649h21 = c1649h20;
                    } else {
                        InterfaceC2159mI[] interfaceC2159mIArr3 = (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr2, interfaceC2159mIArr2.length);
                        declaredClasses = clsS.getDeclaredClasses();
                        AbstractC1474fG.i(declaredClasses, "getDeclaredClasses(...)");
                        length = declaredClasses.length;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                cls = null;
                                break;
                            }
                            cls = declaredClasses[i2];
                            if (cls.getAnnotation(InterfaceC3042vT.class) != null) {
                                break;
                                break;
                            }
                            i2++;
                        }
                        if (cls == null) {
                            obj2 = null;
                        } else {
                            Field declaredField2 = clsS.getDeclaredField(cls.getSimpleName());
                            declaredField2.setAccessible(true);
                            obj2 = declaredField2.get(null);
                        }
                        if (obj2 != null) {
                            declaredClasses2 = clsS.getDeclaredClasses();
                            AbstractC1474fG.i(declaredClasses2, "getDeclaredClasses(...)");
                            length2 = declaredClasses2.length;
                            i3 = 0;
                            cls2 = null;
                            z = false;
                            while (true) {
                                if (i3 >= length2) {
                                    if (!z) {
                                        break;
                                    }
                                    cls3 = cls2;
                                    break;
                                }
                                cls4 = declaredClasses2[i3];
                                if (AbstractC1474fG.b(cls4.getSimpleName(), "$serializer")) {
                                    if (!z) {
                                        cls2 = cls4;
                                        z = true;
                                    }
                                }
                                i3++;
                                cls3 = null;
                                break;
                            }
                            if (cls3 != null) {
                                interfaceC2159mIR = null;
                                obj3 = null;
                                if (obj3 instanceof InterfaceC2159mI) {
                                    interfaceC2159mI = (InterfaceC2159mI) obj3;
                                } else {
                                    interfaceC2159mI = interfaceC2159mIR;
                                }
                                c1649h21 = interfaceC2159mI;
                            } else {
                                interfaceC2159mIR = null;
                                obj3 = null;
                                if (obj3 instanceof InterfaceC2159mI) {
                                    interfaceC2159mI = (InterfaceC2159mI) obj3;
                                } else {
                                    interfaceC2159mI = interfaceC2159mIR;
                                }
                                c1649h21 = interfaceC2159mI;
                            }
                        } else {
                            declaredClasses2 = clsS.getDeclaredClasses();
                            AbstractC1474fG.i(declaredClasses2, "getDeclaredClasses(...)");
                            length2 = declaredClasses2.length;
                            i3 = 0;
                            cls2 = null;
                            z = false;
                            while (true) {
                                if (i3 >= length2) {
                                    if (!z) {
                                        cls3 = cls2;
                                        break;
                                    }
                                    break;
                                }
                                cls4 = declaredClasses2[i3];
                                if (AbstractC1474fG.b(cls4.getSimpleName(), "$serializer")) {
                                    if (!z) {
                                        cls2 = cls4;
                                        z = true;
                                    }
                                }
                                i3++;
                                cls3 = null;
                                break;
                            }
                            if (cls3 != null) {
                                interfaceC2159mIR = null;
                                obj3 = null;
                                if (obj3 instanceof InterfaceC2159mI) {
                                    interfaceC2159mI = (InterfaceC2159mI) obj3;
                                } else {
                                    interfaceC2159mI = interfaceC2159mIR;
                                }
                                c1649h21 = interfaceC2159mI;
                            } else {
                                interfaceC2159mIR = null;
                                obj3 = null;
                                if (obj3 instanceof InterfaceC2159mI) {
                                    interfaceC2159mI = (InterfaceC2159mI) obj3;
                                } else {
                                    interfaceC2159mI = interfaceC2159mIR;
                                }
                                c1649h21 = interfaceC2159mI;
                            }
                        }
                        if (c1649h21 == null) {
                            if (clsS.getAnnotation(InterfaceC1453f20.class) == null) {
                                c1649h21 = interfaceC2159mIR;
                            }
                            c1649h20 = new C1649h20(AbstractC2822t60.a(clsS));
                            c1649h21 = c1649h20;
                        }
                    }
                } else {
                    c1649h21 = interfaceC2159mIR;
                }
            }
        } else {
            interfaceC2159mIArr = (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr2, interfaceC2159mIArr2.length);
            try {
                Field declaredField3 = clsS.getDeclaredField("Companion");
                declaredField3.setAccessible(true);
                obj = declaredField3.get(null);
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                interfaceC2159mIR = null;
            } else {
                interfaceC2159mIR = AbstractC3409z9.r(obj, (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr, interfaceC2159mIArr.length));
            }
            if (interfaceC2159mIR == null) {
                canonicalName = clsS.getCanonicalName();
                if (canonicalName != null || AbstractC1899jh0.U(canonicalName, "java.", false) || AbstractC1899jh0.U(canonicalName, "kotlin.", false)) {
                    c1649h20 = null;
                } else {
                    Field[] declaredFields = clsS.getDeclaredFields();
                    AbstractC1474fG.i(declaredFields, "getDeclaredFields(...)");
                    int length3 = declaredFields.length;
                    Field field2 = null;
                    int i4 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i4 >= length3) {
                            if (!z2) {
                                break;
                            }
                            break;
                        }
                        Field field3 = declaredFields[i4];
                        if (AbstractC1474fG.b(field3.getName(), "INSTANCE") && AbstractC1474fG.b(field3.getType(), clsS) && Modifier.isStatic(field3.getModifiers())) {
                            if (!z2) {
                                field2 = field3;
                                z2 = true;
                            }
                        }
                        i4++;
                        field2 = null;
                        break;
                    }
                    if (field2 == null) {
                        c1649h20 = null;
                    } else {
                        Object obj4 = field2.get(null);
                        Method[] methods = clsS.getMethods();
                        AbstractC1474fG.i(methods, "getMethods(...)");
                        int length4 = methods.length;
                        Method method = null;
                        int i5 = 0;
                        boolean z3 = false;
                        while (true) {
                            if (i5 >= length4) {
                                if (!z3) {
                                    break;
                                }
                                break;
                            }
                            Method method2 = methods[i5];
                            if (AbstractC1474fG.b(method2.getName(), "serializer")) {
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                AbstractC1474fG.i(parameterTypes, "getParameterTypes(...)");
                                if (parameterTypes.length == 0 && AbstractC1474fG.b(method2.getReturnType(), InterfaceC2159mI.class)) {
                                    if (!z3) {
                                        method = method2;
                                        z3 = true;
                                    }
                                }
                            }
                            i5++;
                            method = null;
                            break;
                        }
                        if (method == null) {
                            c1649h20 = null;
                        } else {
                            Object objInvoke = method.invoke(obj4, null);
                            if (objInvoke instanceof InterfaceC2159mI) {
                                c1649h20 = (InterfaceC2159mI) objInvoke;
                            } else {
                                c1649h20 = null;
                            }
                        }
                    }
                }
                if (c1649h20 != null) {
                    c1649h21 = c1649h20;
                } else {
                    InterfaceC2159mI[] interfaceC2159mIArr4 = (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr2, interfaceC2159mIArr2.length);
                    declaredClasses = clsS.getDeclaredClasses();
                    AbstractC1474fG.i(declaredClasses, "getDeclaredClasses(...)");
                    length = declaredClasses.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            cls = null;
                            break;
                        }
                        cls = declaredClasses[i2];
                        if (cls.getAnnotation(InterfaceC3042vT.class) != null) {
                            break;
                        }
                        i2++;
                    }
                    if (cls == null) {
                        obj2 = null;
                    } else {
                        try {
                            Field declaredField4 = clsS.getDeclaredField(cls.getSimpleName());
                            try {
                                declaredField4.setAccessible(true);
                                obj2 = declaredField4.get(null);
                            } catch (Throwable unused2) {
                                obj2 = null;
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                    if (obj2 != null || (interfaceC2159mIR2 = AbstractC3409z9.r(obj2, (InterfaceC2159mI[]) Arrays.copyOf(interfaceC2159mIArr4, interfaceC2159mIArr4.length))) == null) {
                        try {
                            declaredClasses2 = clsS.getDeclaredClasses();
                            AbstractC1474fG.i(declaredClasses2, "getDeclaredClasses(...)");
                            length2 = declaredClasses2.length;
                            i3 = 0;
                            cls2 = null;
                            z = false;
                            while (true) {
                                if (i3 >= length2) {
                                    if (!z) {
                                        cls3 = cls2;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    cls4 = declaredClasses2[i3];
                                    if (AbstractC1474fG.b(cls4.getSimpleName(), "$serializer")) {
                                        if (!z) {
                                            cls2 = cls4;
                                            z = true;
                                        }
                                    }
                                    i3++;
                                } catch (NoSuchFieldException unused4) {
                                    interfaceC2159mIR = null;
                                }
                                cls3 = null;
                                break;
                            }
                            if (cls3 != null || (field = cls3.getField("INSTANCE")) == null) {
                                interfaceC2159mIR = null;
                                obj3 = null;
                            } else {
                                interfaceC2159mIR = null;
                                try {
                                    obj3 = field.get(null);
                                } catch (NoSuchFieldException unused5) {
                                }
                            }
                            if (obj3 instanceof InterfaceC2159mI) {
                                interfaceC2159mI = (InterfaceC2159mI) obj3;
                            } else {
                                interfaceC2159mI = interfaceC2159mIR;
                            }
                        } catch (NoSuchFieldException unused6) {
                            interfaceC2159mIR = null;
                        }
                        c1649h21 = interfaceC2159mI;
                    } else {
                        c1649h21 = interfaceC2159mIR2;
                        interfaceC2159mIR = null;
                    }
                    if (c1649h21 == null) {
                        if (clsS.getAnnotation(InterfaceC1453f20.class) == null && ((interfaceC1206cc0 = (InterfaceC1206cc0) clsS.getAnnotation(InterfaceC1206cc0.class)) == null || !AbstractC1474fG.b(AbstractC2822t60.a(interfaceC1206cc0.with()), AbstractC2822t60.a(C1649h20.class)))) {
                            c1649h21 = interfaceC2159mIR;
                        } else {
                            c1649h20 = new C1649h20(AbstractC2822t60.a(clsS));
                            c1649h21 = c1649h20;
                        }
                    }
                }
            } else {
                c1649h21 = interfaceC2159mIR;
            }
        }
        if (c1649h21 == null) {
            c1649h21 = (InterfaceC2159mI) AbstractC1553g30.a.get(interfaceC1476fI);
        }
        if (c1649h21 != null) {
            return c1649h21;
        }
        String strB = ((C2766se) interfaceC1476fI).b();
        if (strB == null) {
            strB = "<local class name not available>";
        }
        throw new C1401ec0(AbstractC1701hf0.u("Serializer for class '", strB, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void G(C2166mP c2166mP, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("mediaServers", (Parcelable[]) arrayList.toArray(new C3426zP[0]));
        c2166mP.G = bundle;
    }

    public static final long H(String str, long j2, long j3, long j4) {
        String property;
        int i2 = Vh0.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lK = AbstractC1802ih0.K(property);
        if (lK == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lK.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int I(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) H(str, i2, i3, i4);
    }

    public static final AbstractActivityC1540fx J(Context context) {
        if (context instanceof AbstractActivityC1540fx) {
            return (AbstractActivityC1540fx) context;
        }
        return null;
    }

    public static final Calendar K(String str) {
        AbstractC1474fG.j(str, "<this>");
        Locale locale = Locale.ENGLISH;
        for (SimpleDateFormat simpleDateFormat : AbstractC0937Ze.K(new SimpleDateFormat("yyyy-MM-dd", locale), new SimpleDateFormat("d MMMM yyyy ('USA')", locale), new SimpleDateFormat("yyyy", locale), new SimpleDateFormat("MMM d, yyyy", locale), new SimpleDateFormat("MMMM d, yyyy ('United' 'States')", locale))) {
            try {
                Calendar calendar = Calendar.getInstance();
                Date date = simpleDateFormat.parse(str);
                AbstractC1474fG.g(date);
                calendar.setTime(date);
                return calendar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final String L(InterfaceC0473Hh interfaceC0473Hh) {
        Object objK;
        if (interfaceC0473Hh instanceof C1520fn) {
            return interfaceC0473Hh.toString();
        }
        try {
            objK = interfaceC0473Hh + '@' + r(interfaceC0473Hh);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (C2536q80.a(objK) != null) {
            objK = interfaceC0473Hh.getClass().getName() + '@' + r(interfaceC0473Hh);
        }
        return (String) objK;
    }

    public static final String M(String str) {
        Object objK;
        AbstractC1474fG.j(str, "<this>");
        try {
            objK = Uri.parse(str).getLastPathSegment();
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        String str2 = (String) objK;
        String strA0 = str2 != null ? AbstractC1119bh0.A0(str2, '?', str2) : AbstractC1119bh0.A0(str, '?', str);
        if (AbstractC1899jh0.L(strA0, ".vtt", true) || AbstractC1899jh0.L(strA0, ".webvtt", true)) {
            return "text/vtt";
        }
        if (AbstractC1899jh0.L(strA0, ".ass", true) || AbstractC1899jh0.L(strA0, ".ssa", true)) {
            return "text/x-ssa";
        }
        if (AbstractC1899jh0.L(strA0, ".xml", true) || AbstractC1899jh0.L(strA0, ".ttml", true) || AbstractC1899jh0.L(strA0, ".dfxp", true)) {
            return "application/ttml+xml";
        }
        AbstractC1899jh0.L(strA0, ".srt", true);
        return "application/x-subrip";
    }

    public static boolean N(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static C2970uj a(AbstractC1853j70 abstractC1853j70, String str, C2433p50 c2433p50, int i2) {
        C2873tj c2873tj = new C2873tj();
        c2873tj.c = 1;
        c2873tj.e = Collections.emptyMap();
        c2873tj.g = -1L;
        c2873tj.a = AbstractC3045vW.F(str, c2433p50.c);
        c2873tj.f = c2433p50.a;
        c2873tj.g = c2433p50.b;
        String strA = abstractC1853j70.a();
        if (strA == null) {
            strA = c2433p50.b(((C2922u8) abstractC1853j70.m.get(0)).a).toString();
        }
        c2873tj.d(strA);
        c2873tj.b(i2);
        c2873tj.c();
        return c2873tj.a();
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static int i(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static Object[] j(Object[] objArr, Object[]... objArr2) {
        int length = objArr.length;
        for (Object[] objArr3 : objArr2) {
            length += objArr3.length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        int length2 = objArr.length;
        for (Object[] objArr4 : objArr2) {
            System.arraycopy(objArr4, 0, objArrCopyOf, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArrCopyOf;
    }

    public static final int k(Context context, int i2) {
        AbstractC1474fG.j(context, "context");
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static C1539fw0 l(C0731Rg c0731Rg, int i2, ArrayList arrayList, C1539fw0 c1539fw0) {
        int i3;
        int i4 = i2 == 0 ? c0731Rg.n0 : c0731Rg.o0;
        if (i4 != -1 && (c1539fw0 == null || i4 != c1539fw0.b)) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                C1539fw0 c1539fw1 = (C1539fw0) arrayList.get(i5);
                if (c1539fw1.b == i4) {
                    if (c1539fw0 != null) {
                        c1539fw0.c(i2, c1539fw1);
                        arrayList.remove(c1539fw0);
                    }
                    c1539fw0 = c1539fw1;
                    break;
                }
            }
        } else if (i4 != -1) {
            return c1539fw0;
        }
        if (c1539fw0 == null) {
            if (c0731Rg instanceof AbstractC2636rB) {
                AbstractC2636rB abstractC2636rB = (AbstractC2636rB) c0731Rg;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC2636rB.r0) {
                        i3 = -1;
                        break;
                    }
                    C0731Rg c0731Rg2 = abstractC2636rB.q0[i6];
                    if ((i2 == 0 && (i3 = c0731Rg2.n0) != -1) || (i2 == 1 && (i3 = c0731Rg2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        C1539fw0 c1539fw2 = (C1539fw0) arrayList.get(i7);
                        if (c1539fw2.b == i3) {
                            c1539fw0 = c1539fw2;
                            break;
                        }
                    }
                }
            }
            if (c1539fw0 == null) {
                c1539fw0 = new C1539fw0();
                c1539fw0.a = new ArrayList();
                c1539fw0.d = null;
                c1539fw0.e = -1;
                int i8 = C1539fw0.f;
                C1539fw0.f = i8 + 1;
                c1539fw0.b = i8;
                c1539fw0.c = i2;
            }
            arrayList.add(c1539fw0);
        }
        ArrayList arrayList2 = c1539fw0.a;
        if (!arrayList2.contains(c0731Rg)) {
            arrayList2.add(c0731Rg);
            if (c0731Rg instanceof HA) {
                HA ha = (HA) c0731Rg;
                ha.t0.c(ha.u0 == 0 ? 1 : 0, arrayList, c1539fw0);
            }
            int i9 = c1539fw0.b;
            if (i2 == 0) {
                c0731Rg.n0 = i9;
                c0731Rg.I.c(i2, arrayList, c1539fw0);
                c0731Rg.K.c(i2, arrayList, c1539fw0);
            } else {
                c0731Rg.o0 = i9;
                c0731Rg.J.c(i2, arrayList, c1539fw0);
                c0731Rg.M.c(i2, arrayList, c1539fw0);
                c0731Rg.L.c(i2, arrayList, c1539fw0);
            }
            c0731Rg.P.c(i2, arrayList, c1539fw0);
        }
        return c1539fw0;
    }

    public static final String m(Calendar calendar, String str) {
        AbstractC1474fG.j(calendar, "<this>");
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH).format(calendar.getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int n(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final AbstractComponentCallbacksC1247cx o(AbstractActivityC1540fx abstractActivityC1540fx) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx;
        Object objPrevious;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2;
        Object objPrevious2;
        Object obj = null;
        if (abstractActivityC1540fx instanceof MainMobileActivity) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = ((MainMobileActivity) abstractActivityC1540fx).u().D(R.id.nav_main_fragment);
            AbstractC1474fG.h(abstractComponentCallbacksC1247cxD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            NavHostFragment navHostFragment = (NavHostFragment) abstractComponentCallbacksC1247cxD;
            abstractComponentCallbacksC1247cx = navHostFragment.i().y;
            if (abstractComponentCallbacksC1247cx == null) {
                List listX = navHostFragment.i().c.x();
                AbstractC1474fG.i(listX, "getFragments(...)");
                ListIterator listIterator = listX.listIterator(listX.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator.previous();
                } while (((AbstractComponentCallbacksC1247cx) objPrevious2).l < 7);
                abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) objPrevious2;
                if (abstractComponentCallbacksC1247cx2 == null) {
                    List listX2 = navHostFragment.i().c.x();
                    AbstractC1474fG.i(listX2, "getFragments(...)");
                    ListIterator listIterator2 = listX2.listIterator(listX2.size());
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious3 = listIterator2.previous();
                        if (((AbstractComponentCallbacksC1247cx) objPrevious3).w()) {
                            obj = objPrevious3;
                            break;
                        }
                    }
                    return (AbstractComponentCallbacksC1247cx) obj;
                }
                return abstractComponentCallbacksC1247cx2;
            }
            return abstractComponentCallbacksC1247cx;
        }
        if (!(abstractActivityC1540fx instanceof MainTvActivity)) {
            return null;
        }
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD2 = ((MainTvActivity) abstractActivityC1540fx).u().D(R.id.nav_main_fragment);
        AbstractC1474fG.h(abstractComponentCallbacksC1247cxD2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment2 = (NavHostFragment) abstractComponentCallbacksC1247cxD2;
        abstractComponentCallbacksC1247cx = navHostFragment2.i().y;
        if (abstractComponentCallbacksC1247cx == null) {
            List listX3 = navHostFragment2.i().c.x();
            AbstractC1474fG.i(listX3, "getFragments(...)");
            ListIterator listIterator3 = listX3.listIterator(listX3.size());
            do {
                if (!listIterator3.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator3.previous();
            } while (((AbstractComponentCallbacksC1247cx) objPrevious).l < 7);
            abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) objPrevious;
            if (abstractComponentCallbacksC1247cx2 == null) {
                List listX4 = navHostFragment2.i().c.x();
                AbstractC1474fG.i(listX4, "getFragments(...)");
                ListIterator listIterator4 = listX4.listIterator(listX4.size());
                while (listIterator4.hasPrevious()) {
                    Object objPrevious4 = listIterator4.previous();
                    if (((AbstractComponentCallbacksC1247cx) objPrevious4).w()) {
                        obj = objPrevious4;
                        break;
                    }
                }
                return (AbstractComponentCallbacksC1247cx) obj;
            }
            return abstractComponentCallbacksC1247cx2;
        }
        return abstractComponentCallbacksC1247cx;
    }

    public static final String p(Context context, Uri uri) {
        Object objK;
        AbstractC1474fG.j(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme == null || scheme.hashCode() != 951530617 || !scheme.equals("content")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path).getName();
            }
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        AbstractC1474fG.i(contentResolver, "getContentResolver(...)");
        try {
            Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                    Integer numValueOf = Integer.valueOf(columnIndex);
                    if (columnIndex == -1) {
                        numValueOf = null;
                    }
                    objK = numValueOf != null ? cursorQuery.getString(numValueOf.intValue()) : null;
                    AbstractC3409z9.g(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3409z9.g(cursorQuery, th);
                        throw th2;
                    }
                }
            } else {
                objK = null;
            }
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
        return (String) (objK instanceof C2439p80 ? null : objK);
    }

    public static void q(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            throw null;
        }
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Class s(InterfaceC1476fI interfaceC1476fI) {
        AbstractC1474fG.j(interfaceC1476fI, "<this>");
        Class clsA = ((InterfaceC2669re) interfaceC1476fI).a();
        AbstractC1474fG.h(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class t(InterfaceC1476fI interfaceC1476fI) {
        AbstractC1474fG.j(interfaceC1476fI, "<this>");
        Class clsA = ((InterfaceC2669re) interfaceC1476fI).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static final ArrayList u(C2007km0 c2007km0) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c2007km0.l; i2++) {
            C0643Nw c0643Nw = c2007km0.m.f665o[i2];
            AbstractC1474fG.i(c0643Nw, "getTrackFormat(...)");
            arrayList.add(c0643Nw);
        }
        return arrayList;
    }

    public static final void v(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        AbstractActivityC1540fx abstractActivityC1540fxH;
        View view = abstractComponentCallbacksC1247cx.S;
        if (view == null || (abstractActivityC1540fxH = abstractComponentCallbacksC1247cx.h()) == null) {
            return;
        }
        Object systemService = abstractActivityC1540fxH.getSystemService("input_method");
        AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void w(ConstraintLayout constraintLayout, Integer num, Integer num2, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if (constraintLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginLayoutParams.topMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.bottomMargin = num2.intValue();
            }
        }
    }

    public static final boolean x(TT tt, int i2) {
        AbstractC1474fG.j(tt, "<this>");
        int i3 = TT.v;
        Iterator it = Vb0.K(tt, C1182cH.z).iterator();
        while (it.hasNext()) {
            if (((TT) it.next()).s == i2) {
                return true;
            }
        }
        return false;
    }

    public static final void y(ConstraintLayout constraintLayout, CardView cardView) {
        constraintLayout.post(new O3(constraintLayout, 19, cardView));
    }

    public static final boolean z(View view, UT ut) {
        Object objK;
        AbstractC1474fG.j(view, "<this>");
        try {
            objK = U9.o(view);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        YT yt = (YT) objK;
        if (yt == null) {
            return false;
        }
        return A(yt, ut);
    }
}
