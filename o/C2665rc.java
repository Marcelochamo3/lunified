package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2665rc implements InterfaceC2967uh0 {
    public final /* synthetic */ int l;
    public final List m;

    public /* synthetic */ C2665rc(int i, List list) {
        this.l = i;
        this.m = list;
    }

    @Override // o.InterfaceC2967uh0
    public final int G() {
        switch (this.l) {
        }
        return 1;
    }

    @Override // o.InterfaceC2967uh0
    public final int e(long j) {
        switch (this.l) {
            case 0:
                return j < 0 ? 0 : -1;
            case 1:
                return -1;
            case 2:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    @Override // o.InterfaceC2967uh0
    public final long h(int i) {
        switch (this.l) {
            case 0:
                AbstractC0397Ej.c(i == 0);
                break;
            case 2:
                AbstractC0397Ej.c(i == 0);
                break;
        }
        return 0L;
    }

    @Override // o.InterfaceC2967uh0
    public final List t(long j) {
        switch (this.l) {
            case 0:
                return j >= 0 ? this.m : Collections.emptyList();
            case 1:
                return this.m;
            case 2:
                return j >= 0 ? this.m : Collections.emptyList();
            default:
                return this.m;
        }
    }

    public C2665rc(ArrayList arrayList) {
        this.l = 2;
        this.m = Collections.unmodifiableList(arrayList);
    }
}
