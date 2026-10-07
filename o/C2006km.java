package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2006km implements Iterator, InterfaceC1770iI {
    public int l = -1;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ZF f874o;
    public int p;
    public final /* synthetic */ C2104lm q;

    public C2006km(C2104lm c2104lm) {
        this.q = c2104lm;
        int iH = U9.h(c2104lm.b, 0, c2104lm.a.length());
        this.m = iH;
        this.n = iH;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void a() {
        C1101bX c1101bX;
        int i = this.n;
        if (i < 0) {
            this.l = 0;
            this.f874o = null;
            return;
        }
        C2104lm c2104lm = this.q;
        int i2 = c2104lm.c;
        if (i2 > 0) {
            int i3 = this.p + 1;
            this.p = i3;
            if (i3 >= i2) {
                this.f874o = new ZF(this.m, AbstractC1119bh0.a0(c2104lm.a), 1);
                this.n = -1;
            } else if (i > c2104lm.a.length() && (c1101bX = (C1101bX) c2104lm.d.i(c2104lm.a, Integer.valueOf(this.n))) != null) {
                int iIntValue = ((Number) c1101bX.l).intValue();
                int iIntValue2 = ((Number) c1101bX.m).intValue();
                this.f874o = U9.L(this.m, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.m = i4;
                this.n = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f874o = new ZF(this.m, AbstractC1119bh0.a0(c2104lm.a), 1);
                this.n = -1;
            }
        } else if (i > c2104lm.a.length()) {
            this.f874o = new ZF(this.m, AbstractC1119bh0.a0(c2104lm.a), 1);
            this.n = -1;
        } else {
            int iIntValue3 = ((Number) c1101bX.l).intValue();
            int iIntValue4 = ((Number) c1101bX.m).intValue();
            this.f874o = U9.L(this.m, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.m = i5;
            this.n = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.l = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.l == -1) {
            a();
        }
        return this.l == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.l == -1) {
            a();
        }
        if (this.l == 0) {
            throw new NoSuchElementException();
        }
        ZF zf = this.f874o;
        AbstractC1474fG.h(zf, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f874o = null;
        this.l = -1;
        return zf;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
