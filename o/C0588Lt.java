package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588Lt extends AbstractC0973a60 {
    public final /* synthetic */ C0640Nt a;

    public C0588Lt(C0640Nt c0640Nt) {
        this.a = c0640Nt;
    }

    @Override // o.AbstractC0973a60
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0640Nt c0640Nt = this.a;
        int iComputeVerticalScrollRange = c0640Nt.s.computeVerticalScrollRange();
        int i3 = c0640Nt.r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = c0640Nt.a;
        c0640Nt.t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = c0640Nt.s.computeHorizontalScrollRange();
        int i6 = c0640Nt.q;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0640Nt.u = z;
        boolean z2 = c0640Nt.t;
        if (!z2 && !z) {
            if (c0640Nt.v != 0) {
                c0640Nt.g(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            c0640Nt.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0640Nt.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c0640Nt.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i6;
            c0640Nt.f419o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0640Nt.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = c0640Nt.v;
        if (i7 == 0 || i7 == 1) {
            c0640Nt.g(1);
        }
    }
}
