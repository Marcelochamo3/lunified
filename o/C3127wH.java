package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.wH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3127wH implements InvocationHandler {
    public final List a;
    public boolean b;
    public String c;

    public C3127wH(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC1474fG.j(obj, "proxy");
        AbstractC1474fG.j(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1474fG.b(name, "supports") && AbstractC1474fG.b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1474fG.b(name, "unsupported") && AbstractC1474fG.b(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zB = AbstractC1474fG.b(name, "protocols");
        List list = this.a;
        if (zB && objArr.length == 0) {
            return list;
        }
        if ((AbstractC1474fG.b(name, "selectProtocol") || AbstractC1474fG.b(name, "select")) && AbstractC1474fG.b(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                AbstractC1474fG.h(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list2.get(i);
                        AbstractC1474fG.h(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!AbstractC1474fG.b(name, "protocolSelected") && !AbstractC1474fG.b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        AbstractC1474fG.h(obj4, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj4;
        return null;
    }
}
