package o;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: o.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0818Up extends UK {
    public final C0792Tp i;

    public C0818Up(TextView textView) {
        this.i = new C0792Tp(textView);
    }

    @Override // o.UK
    public final boolean D() {
        return this.i.k;
    }

    @Override // o.UK
    public final void R(boolean z) {
        if (!(C0455Gp.k != null)) {
            return;
        }
        this.i.R(z);
    }

    @Override // o.UK
    public final void S(boolean z) {
        boolean z2 = !(C0455Gp.k != null);
        C0792Tp c0792Tp = this.i;
        if (z2) {
            c0792Tp.k = z;
        } else {
            c0792Tp.S(z);
        }
    }

    @Override // o.UK
    public final TransformationMethod X(TransformationMethod transformationMethod) {
        return (C0455Gp.k != null) ^ true ? transformationMethod : this.i.X(transformationMethod);
    }

    @Override // o.UK
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return (C0455Gp.k != null) ^ true ? inputFilterArr : this.i.p(inputFilterArr);
    }
}
