package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class LD extends AbstractC3066vi0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ TD f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LD(String str, TD td, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = td;
        this.g = obj;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        switch (this.e) {
            case 0:
                TD td = this.f;
                td.m.a(td, (Nc0) ((IF) this.g).m);
                break;
            default:
                try {
                    this.f.m.b((C0984aE) this.g);
                } catch (IOException e) {
                    VY vy = VY.a;
                    VY vy2 = VY.a;
                    String str = "Http2Connection.Listener failure for " + this.f.f530o;
                    vy2.getClass();
                    VY.i(4, str, e);
                    try {
                        ((C0984aE) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                break;
        }
        return -1L;
    }
}
