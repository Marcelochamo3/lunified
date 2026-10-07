package o;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class L90 implements Yt0 {
    public final Application a;
    public final Xt0 b;
    public final Bundle c;
    public final C1478fK d;
    public final K3 e;

    public L90(Application application, K90 k90, Bundle bundle) {
        Xt0 xt0;
        AbstractC1474fG.j(k90, "owner");
        this.e = k90.a();
        this.d = k90.f();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (Xt0.d == null) {
                Xt0.d = new Xt0(application);
            }
            xt0 = Xt0.d;
            AbstractC1474fG.g(xt0);
        } else {
            xt0 = new Xt0(null);
        }
        this.b = xt0;
    }

    @Override // o.Yt0
    public final Ut0 a(Class cls) {
        AbstractC1474fG.j(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // o.Yt0
    public final Ut0 b(Class cls, AbstractC2484pi abstractC2484pi) {
        AbstractC1474fG.j(abstractC2484pi, "extras");
        String str = (String) abstractC2484pi.a(O9.G);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (abstractC2484pi.a(AbstractC1474fG.f) == null || abstractC2484pi.a(AbstractC1474fG.g) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) abstractC2484pi.a(Xt0.e);
        boolean zIsAssignableFrom = L2.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? M90.a(cls, M90.b) : M90.a(cls, M90.a);
        if (constructorA == null) {
            return this.b.b(cls, abstractC2484pi);
        }
        return (!zIsAssignableFrom || application == null) ? M90.b(cls, constructorA, AbstractC1474fG.l(abstractC2484pi)) : M90.b(cls, constructorA, application, AbstractC1474fG.l(abstractC2484pi));
    }

    @Override // o.Yt0
    public final /* synthetic */ Ut0 c(InterfaceC1476fI interfaceC1476fI, SS ss) {
        return AbstractC1674hK.b(this, interfaceC1476fI, ss);
    }

    public final Ut0 d(String str, Class cls) {
        AbstractC1474fG.j(cls, "modelClass");
        C1478fK c1478fK = this.d;
        if (c1478fK == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = L2.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? M90.a(cls, M90.b) : M90.a(cls, M90.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (C3483zx.b == null) {
                C3483zx.b = new C3483zx(4);
            }
            C3483zx c3483zx = C3483zx.b;
            AbstractC1474fG.g(c3483zx);
            return c3483zx.a(cls);
        }
        K3 k3 = this.e;
        AbstractC1474fG.g(k3);
        F90 f90M = AbstractC3045vW.m(k3, c1478fK, str, this.c);
        E90 e90 = f90M.m;
        Ut0 ut0B = (!zIsAssignableFrom || application == null) ? M90.b(cls, constructorA, e90) : M90.b(cls, constructorA, application, e90);
        ut0B.a("androidx.lifecycle.savedstate.vm.tag", f90M);
        return ut0B;
    }

    public final void e(Ut0 ut0) {
        C1478fK c1478fK = this.d;
        if (c1478fK != null) {
            K3 k3 = this.e;
            AbstractC1474fG.g(k3);
            AbstractC3045vW.e(ut0, k3, c1478fK);
        }
    }
}
