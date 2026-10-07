package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.t90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2828t90 extends AbstractC2925u90 implements Iterator {
    public C2731s90 l;
    public boolean m = true;
    public final /* synthetic */ C3022v90 n;

    public C2828t90(C3022v90 c3022v90) {
        this.n = c3022v90;
    }

    @Override // o.AbstractC2925u90
    public final void a(C2731s90 c2731s90) {
        C2731s90 c2731s91 = this.l;
        if (c2731s90 == c2731s91) {
            C2731s90 c2731s92 = c2731s91.f1020o;
            this.l = c2731s92;
            this.m = c2731s92 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.m) {
            return this.n.l != null;
        }
        C2731s90 c2731s90 = this.l;
        return (c2731s90 == null || c2731s90.n == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.m) {
            this.m = false;
            this.l = this.n.l;
        } else {
            C2731s90 c2731s90 = this.l;
            this.l = c2731s90 != null ? c2731s90.n : null;
        }
        return this.l;
    }
}
