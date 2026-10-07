package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3049va extends Qi0 {
    @Override // o.Qi0, o.AbstractC1099bV
    public final void A(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        appendable.append("]]>");
    }

    @Override // o.Qi0
    /* JADX INFO: renamed from: K */
    public final Qi0 clone() {
        return (C3049va) super.clone();
    }

    @Override // o.Qi0
    public final String M() {
        return I();
    }

    @Override // o.Qi0, o.AbstractC1099bV
    public final Object clone() {
        return (C3049va) super.clone();
    }

    @Override // o.Qi0, o.AbstractC1099bV
    /* JADX INFO: renamed from: n */
    public final AbstractC1099bV clone() {
        return (C3049va) super.clone();
    }

    @Override // o.Qi0, o.AbstractC1099bV
    public final String w() {
        return "#cdata";
    }

    @Override // o.Qi0, o.AbstractC1099bV
    public final void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        appendable.append("<![CDATA[").append(I());
    }
}
