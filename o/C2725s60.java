package o;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: o.s60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2725s60 extends C2743sL {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2725s60(int i) {
        super(9);
        this.n = i;
    }

    @Override // o.C2743sL
    public String r(Method method, int i) {
        switch (this.n) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.r(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.r(method, i);
        }
    }

    @Override // o.C2743sL
    public final Object s(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.n) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return AbstractC1468fA.q(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return AbstractC1468fA.q(method, cls, obj, objArr);
        }
    }

    @Override // o.C2743sL
    public final boolean u(Method method) {
        switch (this.n) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
