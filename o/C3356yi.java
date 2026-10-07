package o;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: o.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3356yi extends AbstractC2500pq {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3356yi(C2403oq c2403oq, int i) {
        super(c2403oq);
        this.e = i;
    }

    @Override // o.AbstractC2500pq
    public void r() {
        switch (this.e) {
            case 0:
                C2403oq c2403oq = this.b;
                c2403oq.z = null;
                CheckableImageButton checkableImageButton = c2403oq.r;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC1459f50.M(checkableImageButton, null);
                break;
        }
    }
}
