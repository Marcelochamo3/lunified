package o;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QD extends AbstractC3066vi0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ TD f;
    public final /* synthetic */ int g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD(String str, TD td, int i, List list) {
        super(str, true);
        this.f = td;
        this.g = i;
        this.h = list;
    }

    private final long b() {
        C2691rp c2691rp = this.f.w;
        List list = this.h;
        c2691rp.getClass();
        AbstractC1474fG.j(list, "responseHeaders");
        try {
            this.f.J.t(this.g, 9);
            synchronized (this.f) {
                this.f.L.remove(Integer.valueOf(this.g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        switch (this.e) {
            case 0:
                return b();
            default:
                C2691rp c2691rp = this.f.w;
                List list = this.h;
                c2691rp.getClass();
                AbstractC1474fG.j(list, "requestHeaders");
                try {
                    this.f.J.t(this.g, 9);
                    synchronized (this.f) {
                        this.f.L.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD(String str, TD td, int i, List list, boolean z) {
        super(str, true);
        this.f = td;
        this.g = i;
        this.h = list;
    }
}
