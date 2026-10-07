package o;

import java.util.function.Supplier;

/* JADX INFO: renamed from: o.ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1413ei0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ C1413ei0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return C1511fi0.B(this.b);
            default:
                return C1511fi0.z(this.b);
        }
    }
}
