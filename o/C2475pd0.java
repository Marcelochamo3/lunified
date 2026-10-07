package o;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: o.pd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2475pd0 extends AbstractC2572qd0 {
    public float b;
    public float c;

    @Override // o.AbstractC2572qd0
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
