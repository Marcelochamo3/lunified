package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3481zw implements InterfaceC0835Vg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3481zw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.InterfaceC0835Vg
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                C0306Aw c0306Aw = (C0306Aw) obj;
                if (c0306Aw == null) {
                    c0306Aw = new C0306Aw(-3);
                }
                ((C2720s4) this.b).f0(c0306Aw);
                return;
            default:
                C0306Aw c0306Aw2 = (C0306Aw) obj;
                synchronized (AbstractC0332Bw.c) {
                    try {
                        Nd0 nd0 = AbstractC0332Bw.d;
                        ArrayList arrayList = (ArrayList) nd0.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        nd0.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0835Vg) arrayList.get(i)).accept(c0306Aw2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
