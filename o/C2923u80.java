package o;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.u80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2923u80 {
    public final InterfaceC0595Ma b;
    public final C2446pE c;
    public final List d;
    public final List e;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final boolean f = false;

    public C2923u80(InterfaceC0595Ma interfaceC0595Ma, C2446pE c2446pE, List list, List list2) {
        this.b = interfaceC0595Ma;
        this.c = c2446pE;
        this.d = list;
        this.e = list2;
    }

    public final InterfaceC0673Pa a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC0673Pa interfaceC0673PaA = ((AbstractC0647Oa) list.get(i)).a(type, annotationArr);
            if (interfaceC0673PaA != null) {
                return interfaceC0673PaA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0647Oa) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f) {
            C2743sL c2743sL = WY.b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c2743sL.u(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2826t80(this, cls));
    }

    public final AbstractC2252nE c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.a.get(method);
            if (objPutIfAbsent instanceof AbstractC2252nE) {
                return (AbstractC2252nE) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC2252nE abstractC2252nEB = AbstractC2252nE.b(this, cls, method);
                                this.a.put(method, abstractC2252nEB);
                                return abstractC2252nEB;
                            } catch (Throwable th) {
                                this.a.remove(method);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.a.get(method);
                    if (obj2 != null) {
                        return (AbstractC2252nE) obj2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final InterfaceC0602Mh d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC0602Mh interfaceC0602MhA = ((AbstractC0577Lh) list.get(i)).a(type);
            if (interfaceC0602MhA != null) {
                return interfaceC0602MhA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0577Lh) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final InterfaceC0602Mh e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC0602Mh interfaceC0602MhB = ((AbstractC0577Lh) list.get(i)).b(type, annotationArr, this);
            if (interfaceC0602MhB != null) {
                return interfaceC0602MhB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0577Lh) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0577Lh) list.get(i)).getClass();
        }
    }
}
