package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class PD extends AbstractC3066vi0 {
    public final /* synthetic */ TD e;
    public final /* synthetic */ int f;
    public final /* synthetic */ E9 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PD(String str, TD td, int i, E9 e9, int i2, boolean z) {
        super(str, true);
        this.e = td;
        this.f = i;
        this.g = e9;
        this.h = i2;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        try {
            C2691rp c2691rp = this.e.w;
            E9 e9 = this.g;
            int i = this.h;
            c2691rp.getClass();
            AbstractC1474fG.j(e9, "source");
            e9.skip(i);
            this.e.J.t(this.f, 9);
            synchronized (this.e) {
                this.e.L.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
