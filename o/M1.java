package o;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M1 implements ZJ {
    public final /* synthetic */ String l;
    public final /* synthetic */ J1 m;
    public final /* synthetic */ AbstractC3045vW n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0834Vf f390o;

    public M1(C0834Vf c0834Vf, String str, J1 j1, AbstractC3045vW abstractC3045vW) {
        this.f390o = c0834Vf;
        this.l = str;
        this.m = j1;
        this.n = abstractC3045vW;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        boolean zEquals = SJ.ON_START.equals(sj);
        String str = this.l;
        C0834Vf c0834Vf = this.f390o;
        if (!zEquals) {
            if (SJ.ON_STOP.equals(sj)) {
                c0834Vf.e.remove(str);
                return;
            } else {
                if (SJ.ON_DESTROY.equals(sj)) {
                    c0834Vf.e(str);
                    return;
                }
                return;
            }
        }
        HashMap map = c0834Vf.e;
        J1 j1 = this.m;
        AbstractC3045vW abstractC3045vW = this.n;
        map.put(str, new O1(j1, abstractC3045vW));
        HashMap map2 = c0834Vf.f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            j1.c(obj);
        }
        Bundle bundle = c0834Vf.g;
        I1 i1 = (I1) bundle.getParcelable(str);
        if (i1 != null) {
            bundle.remove(str);
            j1.c(abstractC3045vW.x(i1.m, i1.l));
        }
    }
}
