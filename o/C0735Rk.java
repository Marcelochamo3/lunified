package o;

import java.util.Map;

/* JADX INFO: renamed from: o.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0735Rk implements I20 {
    public final /* synthetic */ int l;

    @Override // o.I20
    public final boolean apply(Object obj) {
        switch (this.l) {
            case 0:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
