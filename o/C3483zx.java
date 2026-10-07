package o;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3483zx implements Yt0 {
    public static C3483zx b;
    public final /* synthetic */ int a;

    public /* synthetic */ C3483zx(int i) {
        this.a = i;
    }

    @Override // o.Yt0
    public Ut0 a(Class cls) throws InvocationTargetException {
        switch (this.a) {
            case 0:
                return new C0307Ax(true);
            case 1:
                return new C1869jL();
            case 2:
                AbstractC1474fG.j(cls, "modelClass");
                return new LT();
            case 3:
                AbstractC1474fG.j(cls, "modelClass");
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                AbstractC1474fG.j(cls, "modelClass");
                try {
                    Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    AbstractC1474fG.i(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
                    return (Ut0) objNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                }
        }
    }

    @Override // o.Yt0
    public Ut0 b(Class cls, AbstractC2484pi abstractC2484pi) {
        switch (this.a) {
            case 0:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 1:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 2:
                return AbstractC1674hK.a(this, cls, abstractC2484pi);
            case 3:
                AbstractC1474fG.j(abstractC2484pi, "extras");
                return new H90();
            default:
                AbstractC1474fG.j(abstractC2484pi, "extras");
                return a(cls);
        }
    }

    @Override // o.Yt0
    public final Ut0 c(InterfaceC1476fI interfaceC1476fI, SS ss) {
        switch (this.a) {
            case 0:
                return AbstractC1674hK.b(this, interfaceC1476fI, ss);
            case 1:
                return AbstractC1674hK.b(this, interfaceC1476fI, ss);
            case 2:
                return AbstractC1674hK.b(this, interfaceC1476fI, ss);
            case 3:
                return AbstractC1674hK.b(this, interfaceC1476fI, ss);
            default:
                return b(AbstractC0397Ej.s(interfaceC1476fI), ss);
        }
    }
}
