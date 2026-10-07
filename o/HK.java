package o;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class HK implements AbsListView.OnScrollListener {
    public final /* synthetic */ JK a;

    public HK(JK jk) {
        this.a = jk;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            JK jk = this.a;
            if (jk.K.getInputMethodMode() == 2 || jk.K.getContentView() == null) {
                return;
            }
            Handler handler = jk.G;
            FK fk = jk.C;
            handler.removeCallbacks(fk);
            fk.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
