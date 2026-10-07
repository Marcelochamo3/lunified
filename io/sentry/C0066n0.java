package io.sentry;

import java.util.ArrayList;
import java.util.List;
import o.AbstractC1701hf0;

/* JADX INFO: renamed from: io.sentry.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066n0 {
    public final ArrayList a;

    public C0066n0() {
        this.a = new ArrayList();
    }

    public InterfaceC0051i0 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC0051i0) AbstractC1701hf0.c(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        InterfaceC0051i0 interfaceC0051i0A = a();
        e();
        if (!(a() instanceof C0060l0)) {
            if (!(a() instanceof C0054j0)) {
                return false;
            }
            C0054j0 c0054j0 = (C0054j0) a();
            if (interfaceC0051i0A == null || c0054j0 == null) {
                return false;
            }
            c0054j0.a.add(interfaceC0051i0A.getValue());
            return false;
        }
        C0060l0 c0060l0 = (C0060l0) a();
        e();
        C0057k0 c0057k0 = (C0057k0) a();
        if (c0060l0 == null || interfaceC0051i0A == null || c0057k0 == null) {
            return false;
        }
        c0057k0.a.put(c0060l0.a, interfaceC0051i0A.getValue());
        return false;
    }

    public boolean c(InterfaceC0048h0 interfaceC0048h0) {
        Object objE = interfaceC0048h0.e();
        if (a() == null && objE != null) {
            this.a.add(new C0063m0(objE));
            return true;
        }
        if (a() instanceof C0060l0) {
            C0060l0 c0060l0 = (C0060l0) a();
            e();
            ((C0057k0) a()).a.put(c0060l0.a, objE);
            return false;
        }
        if (!(a() instanceof C0054j0)) {
            return false;
        }
        ((C0054j0) a()).a.add(objE);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void d(final C0069o0 c0069o0) {
        boolean zB;
        int i = AbstractC0045g0.a[((io.sentry.vendor.gson.stream.a) c0069o0.m).g0().ordinal()];
        ArrayList arrayList = this.a;
        io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) c0069o0.m;
        switch (i) {
            case 1:
                aVar.a();
                arrayList.add(new C0054j0());
                zB = false;
                break;
            case 2:
                aVar.p();
                zB = b();
                break;
            case 3:
                c0069o0.f();
                arrayList.add(new C0057k0());
                zB = false;
                break;
            case 4:
                c0069o0.i();
                zB = b();
                break;
            case 5:
                arrayList.add(new C0060l0(aVar.a0()));
                zB = false;
                break;
            case 6:
                final int i2 = 0;
                zB = c(new InterfaceC0048h0() { // from class: io.sentry.d0
                    @Override // io.sentry.InterfaceC0048h0
                    public final Object e() {
                        switch (i2) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) c0069o0.m).e0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) c0069o0.m).W());
                        }
                    }
                });
                break;
            case 7:
                zB = c(new C0039e0(this, 0, c0069o0));
                break;
            case 8:
                final int i3 = 1;
                zB = c(new InterfaceC0048h0() { // from class: io.sentry.d0
                    @Override // io.sentry.InterfaceC0048h0
                    public final Object e() {
                        switch (i3) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) c0069o0.m).e0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) c0069o0.m).W());
                        }
                    }
                });
                break;
            case 9:
                aVar.c0();
                zB = c(new C0042f0(0));
                break;
            case 10:
                zB = true;
                break;
            default:
                zB = false;
                break;
        }
        if (zB) {
            return;
        }
        d(c0069o0);
    }

    public void e() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public C0066n0(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}
