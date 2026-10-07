package o;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class R7 implements InterfaceC0473Hh, InterfaceC1803ii, Serializable {
    private final InterfaceC0473Hh<Object> completion;

    public R7(InterfaceC0473Hh interfaceC0473Hh) {
        this.completion = interfaceC0473Hh;
    }

    @Override // o.InterfaceC1803ii
    public InterfaceC1803ii d() {
        InterfaceC0473Hh<Object> interfaceC0473Hh = this.completion;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        InterfaceC0473Hh<Object> interfaceC0473Hh = this;
        while (true) {
            R7 r7 = (R7) interfaceC0473Hh;
            InterfaceC0473Hh<Object> interfaceC0473Hh2 = r7.completion;
            AbstractC1474fG.g(interfaceC0473Hh2);
            try {
                obj = r7.r(obj);
                if (obj == EnumC1706hi.l) {
                    return;
                }
            } catch (Throwable th) {
                obj = Jp0.k(th);
            }
            r7.t();
            if (!(interfaceC0473Hh2 instanceof R7)) {
                interfaceC0473Hh2.j(obj);
                return;
            }
            interfaceC0473Hh = interfaceC0473Hh2;
        }
    }

    public InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC1474fG.j(interfaceC0473Hh, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final InterfaceC0473Hh p() {
        return this.completion;
    }

    public StackTraceElement q() {
        int iIntValue;
        String strC;
        InterfaceC0371Dj interfaceC0371Dj = (InterfaceC0371Dj) getClass().getAnnotation(InterfaceC0371Dj.class);
        String str = null;
        if (interfaceC0371Dj == null) {
            return null;
        }
        int iV = interfaceC0371Dj.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC0371Dj.l()[iIntValue] : -1;
        C0522Je c0522Je = Nr0.f;
        C0522Je c0522Je2 = Nr0.e;
        if (c0522Je == null) {
            try {
                C0522Je c0522Je3 = new C0522Je(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                Nr0.f = c0522Je3;
                c0522Je = c0522Je3;
            } catch (Exception unused2) {
                Nr0.f = c0522Je2;
                c0522Je = c0522Je2;
            }
        }
        if (c0522Je != c0522Je2) {
            Method method = c0522Je.a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = c0522Je.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = c0522Je.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = interfaceC0371Dj.c();
        } else {
            strC = str + '/' + interfaceC0371Dj.c();
        }
        return new StackTraceElement(strC, interfaceC0371Dj.m(), interfaceC0371Dj.f(), i);
    }

    public abstract Object r(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objQ = q();
        if (objQ == null) {
            objQ = getClass().getName();
        }
        sb.append(objQ);
        return sb.toString();
    }

    public void t() {
    }
}
