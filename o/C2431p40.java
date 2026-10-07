package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.p40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2431p40 implements InterfaceC2967uh0 {
    public final List l;
    public final List m;

    public /* synthetic */ C2431p40(ArrayList arrayList, ArrayList arrayList2) {
        this.l = arrayList;
        this.m = arrayList2;
    }

    @Override // o.InterfaceC2967uh0
    public int G() {
        return this.m.size();
    }

    @Override // o.InterfaceC2967uh0
    public int e(long j) {
        int i;
        Long lValueOf = Long.valueOf(j);
        int i2 = Lr0.a;
        List list = this.m;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < list.size()) {
            return i;
        }
        return -1;
    }

    @Override // o.InterfaceC2967uh0
    public long h(int i) {
        AbstractC0397Ej.c(i >= 0);
        List list = this.m;
        AbstractC0397Ej.c(i < list.size());
        return ((Long) list.get(i)).longValue();
    }

    @Override // o.InterfaceC2967uh0
    public List t(long j) {
        int iC = Lr0.c(this.m, Long.valueOf(j), false);
        return iC == -1 ? Collections.emptyList() : (List) this.l.get(iC);
    }
}
