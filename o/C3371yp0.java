package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: renamed from: o.yp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3371yp0 extends AbstractC3177wp0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public C3371yp0(Class cls) {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new Gp0(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC1695hc0 interfaceC1695hc0 = (InterfaceC1695hc0) field.getAnnotation(InterfaceC1695hc0.class);
                if (interfaceC1695hc0 != null) {
                    strName = interfaceC1695hc0.value();
                    for (String str : interfaceC1695hc0.alternate()) {
                        ((HashMap) this.b).put(str, r4);
                    }
                }
                ((HashMap) this.b).put(strName, r4);
                ((HashMap) this.c).put(string, r4);
                ((HashMap) this.d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        switch (this.a) {
            case 0:
                return ((AbstractC3177wp0) this.c).a(wh);
            default:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH0 = wh.h0();
                Enum r0 = (Enum) ((HashMap) this.b).get(strH0);
                return r0 == null ? (Enum) ((HashMap) this.c).get(strH0) : r0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) {
        AbstractC3177wp0 abstractC3177wp0C;
        switch (this.a) {
            case 0:
                Type type = (Type) this.d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                AbstractC3177wp0 abstractC3177wp0 = (AbstractC3177wp0) this.c;
                if (type2 != type) {
                    AbstractC3177wp0 abstractC3177wp0E = ((BA) this.b).e(new Kp0(type2));
                    if (abstractC3177wp0E instanceof C60) {
                        AbstractC3177wp0 abstractC3177wp1 = abstractC3177wp0;
                        while ((abstractC3177wp1 instanceof AbstractC1304dc0) && (abstractC3177wp0C = ((AbstractC1304dc0) abstractC3177wp1).c()) != abstractC3177wp1) {
                            abstractC3177wp1 = abstractC3177wp0C;
                        }
                        if (abstractC3177wp1 instanceof C60) {
                            abstractC3177wp0 = abstractC3177wp0E;
                        }
                    } else {
                        abstractC3177wp0 = abstractC3177wp0E;
                    }
                }
                abstractC3177wp0.b(c1183cI, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                c1183cI.b0(r6 == null ? null : (String) ((HashMap) this.d).get(r6));
                break;
        }
    }

    public C3371yp0(BA ba, AbstractC3177wp0 abstractC3177wp0, Type type) {
        this.a = 0;
        this.b = ba;
        this.c = abstractC3177wp0;
        this.d = type;
    }
}
