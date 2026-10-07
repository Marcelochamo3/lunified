package io.sentry.android.ndk;

import io.sentry.C0041f;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.V0;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends V0 {
    public final I1 a;
    public final a b;

    public b(I1 i1) {
        NativeScope nativeScope = new NativeScope();
        io.sentry.config.a.C(i1, "The SentryOptions object is required.");
        this.a = i1;
        this.b = nativeScope;
    }

    @Override // io.sentry.V0, io.sentry.S
    public final void d(String str, String str2) {
        try {
            ((NativeScope) this.b).getClass();
            NativeScope.nativeSetTag(str, str2);
        } catch (Throwable th) {
            this.a.getLogger().s(EnumC0094u1.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.V0, io.sentry.S
    public final void f(C0041f c0041f) {
        I1 i1 = this.a;
        try {
            EnumC0094u1 enumC0094u1 = c0041f.q;
            String strO = null;
            String lowerCase = enumC0094u1 != null ? enumC0094u1.name().toLowerCase(Locale.ROOT) : null;
            String strR = io.sentry.config.a.r(c0041f.a());
            try {
                Map map = c0041f.f111o;
                if (!map.isEmpty()) {
                    strO = i1.getSerializer().o(map);
                }
            } catch (Throwable th) {
                i1.getLogger().s(EnumC0094u1.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
            }
            String str = strO;
            a aVar = this.b;
            String str2 = c0041f.m;
            String str3 = c0041f.p;
            String str4 = c0041f.n;
            ((NativeScope) aVar).getClass();
            NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strR, str);
        } catch (Throwable th2) {
            i1.getLogger().s(EnumC0094u1.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }
}
