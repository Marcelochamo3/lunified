package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.ld0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2087ld0 extends AbstractC2668rd0 {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public C2087ld0(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // o.AbstractC2668rd0
    public final void a(Matrix matrix, C1697hd0 c1697hd0, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AbstractC2668rd0) it.next()).a(this.d, c1697hd0, i, canvas);
        }
    }
}
