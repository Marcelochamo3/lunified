package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0352Cq extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Serializable f204o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0352Cq(int i, String str, C0378Dq c0378Dq) {
        super(0);
        this.n = i;
        this.f204o = str;
        this.p = c0378Dq;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                int i = this.n;
                Zb0[] zb0Arr = new Zb0[i];
                for (int i2 = 0; i2 < i; i2++) {
                    zb0Arr[i2] = AbstractC3409z9.c(((String) this.f204o) + '.' + ((C0378Dq) this.p).e[i2], C2386oh0.l, new Zb0[0], X10.x);
                }
                return zb0Arr;
            default:
                return ((I60) this.f204o).b((CharSequence) this.p, this.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0352Cq(I60 i60, CharSequence charSequence, int i) {
        super(0);
        this.f204o = i60;
        this.p = charSequence;
        this.n = i;
    }
}
