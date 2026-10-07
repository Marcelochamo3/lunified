package o;

import java.util.Comparator;

/* JADX INFO: renamed from: o.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0419Ff implements Comparator {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0419Ff(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                InterfaceC0412Ey[] interfaceC0412EyArr = (InterfaceC0412Ey[]) this.m;
                AbstractC1474fG.j(interfaceC0412EyArr, "$selectors");
                for (InterfaceC0412Ey interfaceC0412Ey : interfaceC0412EyArr) {
                    int iJ = AbstractC1376eG.j((Comparable) interfaceC0412Ey.b(obj), (Comparable) interfaceC0412Ey.b(obj2));
                    if (iJ != 0) {
                        return iJ;
                    }
                }
                return 0;
            default:
                NO no = (NO) this.m;
                return no.e(obj2) - no.e(obj);
        }
    }
}
