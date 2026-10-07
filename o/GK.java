package o;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class GK extends DataSetObserver {
    public final /* synthetic */ JK a;

    public GK(JK jk) {
        this.a = jk;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        JK jk = this.a;
        if (jk.K.isShowing()) {
            jk.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
