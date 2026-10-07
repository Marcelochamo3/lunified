package o;

import java.util.Comparator;

/* JADX INFO: renamed from: o.kr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2017kr0 implements Comparator {
    public final /* synthetic */ boolean l;

    public C2017kr0(boolean z) {
        this.l = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        Integer numValueOf = Integer.valueOf((this.l && ((EnumC1139br0) ((C1101bX) obj).l) == C3084vr0.x) ? 1 : 0);
        EnumC1139br0 enumC1139br0 = (EnumC1139br0) ((C1101bX) obj2).l;
        if (this.l && enumC1139br0 == C3084vr0.x) {
            i = 1;
        }
        return AbstractC1376eG.j(numValueOf, Integer.valueOf(i));
    }
}
