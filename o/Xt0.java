package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class Xt0 extends C3483zx {
    public static Xt0 d;
    public static final C3325yL e = new C3325yL();
    public final Application c;

    public Xt0(Application application) {
        super(4);
        this.c = application;
    }

    @Override // o.C3483zx, o.Yt0
    public final Ut0 a(Class cls) {
        AbstractC1474fG.j(cls, "modelClass");
        Application application = this.c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // o.C3483zx, o.Yt0
    public final Ut0 b(Class cls, AbstractC2484pi abstractC2484pi) {
        AbstractC1474fG.j(abstractC2484pi, "extras");
        if (this.c != null) {
            return a(cls);
        }
        Application application = (Application) abstractC2484pi.a(e);
        if (application != null) {
            return d(cls, application);
        }
        if (L2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final Ut0 d(Class cls, Application application) {
        if (!L2.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            Ut0 ut0 = (Ut0) cls.getConstructor(Application.class).newInstance(application);
            AbstractC1474fG.i(ut0, "{\n                try {\n…          }\n            }");
            return ut0;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }
}
