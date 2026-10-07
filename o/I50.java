package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class I50 implements ZJ {
    public static int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Field f319o;
    public static Field p;
    public static Field q;
    public final /* synthetic */ int l;
    public Object m;

    public /* synthetic */ I50() {
        this.l = 4;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        int iNextIndex;
        View view;
        switch (this.l) {
            case 0:
                if (sj != SJ.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC1283dK.f().f(this);
                K90 k90 = (K90) this.m;
                Bundle bundleC = k90.a().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, I50.class.getClassLoader()).asSubclass(I90.class);
                        AbstractC1474fG.i(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC1474fG.i(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(k90 instanceof InterfaceC1047au0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                                Zt0 zt0E = ((InterfaceC1047au0) k90).e();
                                K3 k3A = k90.a();
                                zt0E.getClass();
                                LinkedHashMap linkedHashMap = zt0E.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    AbstractC1474fG.j(str2, "key");
                                    Ut0 ut0 = (Ut0) linkedHashMap.get(str2);
                                    AbstractC1474fG.g(ut0);
                                    AbstractC3045vW.e(ut0, k3A, k90.f());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    k3A.g();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC1701hf0.t("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC1701hf0.u("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC1740hz[] interfaceC1740hzArr = (InterfaceC1740hz[]) this.m;
                if (interfaceC1740hzArr.length > 0) {
                    InterfaceC1740hz interfaceC1740hz = interfaceC1740hzArr[0];
                    throw null;
                }
                if (interfaceC1740hzArr.length <= 0) {
                    return;
                }
                InterfaceC1740hz interfaceC1740hz2 = interfaceC1740hzArr[0];
                throw null;
            case 2:
                int i = AbstractC0426Fm.a[sj.ordinal()];
                C0452Gm c0452Gm = (C0452Gm) this.m;
                if (i == 1) {
                    DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = (DialogInterfaceOnCancelListenerC0348Cm) interfaceC1283dK;
                    Iterable iterable = (Iterable) c0452Gm.b().e.l.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1474fG.b(((DT) it.next()).q, dialogInterfaceOnCancelListenerC0348Cm.L)) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC0348Cm.W(false, false);
                    return;
                }
                Object obj = null;
                if (i == 2) {
                    DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm2 = (DialogInterfaceOnCancelListenerC0348Cm) interfaceC1283dK;
                    for (Object obj2 : (Iterable) c0452Gm.b().f.l.getValue()) {
                        if (AbstractC1474fG.b(((DT) obj2).q, dialogInterfaceOnCancelListenerC0348Cm2.L)) {
                            obj = obj2;
                        }
                    }
                    DT dt = (DT) obj;
                    if (dt != null) {
                        c0452Gm.b().b(dt);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm3 = (DialogInterfaceOnCancelListenerC0348Cm) interfaceC1283dK;
                    for (Object obj3 : (Iterable) c0452Gm.b().f.l.getValue()) {
                        if (AbstractC1474fG.b(((DT) obj3).q, dialogInterfaceOnCancelListenerC0348Cm3.L)) {
                            obj = obj3;
                        }
                    }
                    DT dt2 = (DT) obj;
                    if (dt2 != null) {
                        c0452Gm.b().b(dt2);
                    }
                    dialogInterfaceOnCancelListenerC0348Cm3.b0.f(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm4 = (DialogInterfaceOnCancelListenerC0348Cm) interfaceC1283dK;
                if (dialogInterfaceOnCancelListenerC0348Cm4.Y().isShowing()) {
                    return;
                }
                List list = (List) c0452Gm.b().e.l.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (AbstractC1474fG.b(((DT) listIterator.previous()).q, dialogInterfaceOnCancelListenerC0348Cm4.L)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                DT dt3 = (DT) AbstractC0911Ye.e0(iNextIndex, list);
                if (!AbstractC1474fG.b(AbstractC0911Ye.j0(list), dt3)) {
                    dialogInterfaceOnCancelListenerC0348Cm4.toString();
                }
                if (dt3 != null) {
                    c0452Gm.l(iNextIndex, dt3, false);
                    return;
                }
                return;
            case 3:
                if (sj != SJ.ON_STOP || (view = ((AbstractComponentCallbacksC1247cx) this.m).S) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 4:
                if (sj != SJ.ON_DESTROY) {
                    return;
                }
                if (n == 0) {
                    try {
                        n = 2;
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        p = declaredField;
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                        q = declaredField2;
                        declaredField2.setAccessible(true);
                        Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                        f319o = declaredField3;
                        declaredField3.setAccessible(true);
                        n = 1;
                        break;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (n == 1) {
                    InputMethodManager inputMethodManager = (InputMethodManager) ((Activity) this.m).getSystemService("input_method");
                    try {
                        Object obj4 = f319o.get(inputMethodManager);
                        if (obj4 == null) {
                            return;
                        }
                        synchronized (obj4) {
                            try {
                                try {
                                    View view2 = (View) p.get(inputMethodManager);
                                    if (view2 != null) {
                                        if (!view2.isAttachedToWindow()) {
                                            try {
                                                q.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException unused2) {
                                            }
                                        }
                                    }
                                } catch (ClassCastException unused3) {
                                } catch (IllegalAccessException unused4) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    } catch (IllegalAccessException unused5) {
                        return;
                    }
                }
                return;
            default:
                if (sj != SJ.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + sj).toString());
                }
                interfaceC1283dK.f().f(this);
                ((G90) this.m).b();
                return;
        }
    }

    public /* synthetic */ I50(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    public I50(K90 k90) {
        this.l = 0;
        AbstractC1474fG.j(k90, "owner");
        this.m = k90;
    }
}
