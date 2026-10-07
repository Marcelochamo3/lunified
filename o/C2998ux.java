package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2998ux implements InterfaceC2901tx {
    public final String a;
    public final int b;
    public final int c = 1;
    public final /* synthetic */ C3289xx d;

    public C2998ux(C3289xx c3289xx, String str, int i) {
        this.d = c3289xx;
        this.a = str;
        this.b = i;
    }

    @Override // o.InterfaceC2901tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.d.y;
        if (abstractComponentCallbacksC1247cx != null && this.b < 0 && this.a == null && abstractComponentCallbacksC1247cx.i().S()) {
            return false;
        }
        return this.d.U(arrayList, arrayList2, this.a, this.b, this.c);
    }
}
