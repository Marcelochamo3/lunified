package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Y5 implements Rb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ Y5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return UK.H((Object[]) this.b);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return new C2839tK(this);
            default:
                return (Iterator) this.b;
        }
    }
}
