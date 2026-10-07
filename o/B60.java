package o;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class B60 {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ AbstractC3177wp0 i;
    public final /* synthetic */ BA j;
    public final /* synthetic */ Kp0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    public B60(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, AbstractC3177wp0 abstractC3177wp0, BA ba, Kp0 kp0, boolean z5, boolean z6) {
        this.f = z3;
        this.g = method;
        this.h = z4;
        this.i = abstractC3177wp0;
        this.j = ba;
        this.k = kp0;
        this.l = z5;
        this.m = z6;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(C1183cI c1183cI, Object obj) {
        Object objInvoke;
        if (this.d) {
            boolean z = this.f;
            Field field = this.b;
            Method method = this.g;
            if (z) {
                if (method == null) {
                    F60.a(obj, field);
                } else {
                    F60.a(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new RH(AbstractC1701hf0.u("Accessor ", A60.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c1183cI.t(this.a);
            boolean z2 = this.h;
            AbstractC3177wp0 c3371yp0 = this.i;
            if (!z2) {
                c3371yp0 = new C3371yp0(this.j, c3371yp0, this.k.b);
            }
            c3371yp0.b(c1183cI, objInvoke);
        }
    }
}
