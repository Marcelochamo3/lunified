package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.sp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2789sp0 implements InterfaceC2967uh0 {
    public static final C2789sp0 m = new C2789sp0();
    public final List l;

    public C2789sp0(C3162wi c3162wi) {
        this.l = Collections.singletonList(c3162wi);
    }

    @Override // o.InterfaceC2967uh0
    public final int G() {
        return 1;
    }

    @Override // o.InterfaceC2967uh0
    public final int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // o.InterfaceC2967uh0
    public final long h(int i) {
        AbstractC0397Ej.c(i == 0);
        return 0L;
    }

    @Override // o.InterfaceC2967uh0
    public final List t(long j) {
        return j >= 0 ? this.l : Collections.emptyList();
    }

    public C2789sp0() {
        this.l = Collections.emptyList();
    }
}
