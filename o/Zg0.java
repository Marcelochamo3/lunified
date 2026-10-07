package o;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Zg0 extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Supplier b;

    public /* synthetic */ Zg0(Supplier supplier, int i) {
        this.a = i;
        this.b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.get();
    }
}
