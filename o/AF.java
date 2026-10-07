package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AF implements Iterable, InterfaceC1770iI {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ AF(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.l) {
            case 0:
                return new C0739Ro((Iterator) ((InterfaceC0360Cy) this.m).c());
            case 1:
                return ((Rb0) this.m).iterator();
            default:
                return new C1109bc0((Zb0) this.m, 1);
        }
    }
}
