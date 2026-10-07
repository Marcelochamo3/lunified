package o;

import android.view.View;
import com.skidush.clonex.fragments.tv_shows.TvShowsTvFragment;

/* JADX INFO: renamed from: o.bp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1135bp0 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ View.OnCreateContextMenuListener m;

    public /* synthetic */ ViewOnClickListenerC1135bp0(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.l = i;
        this.m = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                TvShowsTvFragment tvShowsTvFragment = (TvShowsTvFragment) this.m;
                AbstractC1474fG.j(tvShowsTvFragment, "this$0");
                ((C2111lp0) tvShowsTvFragment.n0.getValue()).e();
                break;
            default:
                Qq0 qq0 = (Qq0) this.m;
                AbstractC1474fG.j(qq0, "this$0");
                qq0.hide();
                break;
        }
    }
}
