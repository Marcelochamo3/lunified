package o;

import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.SearchEditText;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: renamed from: o.qa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2566qa0 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ SearchTvFragment m;

    public /* synthetic */ ViewOnClickListenerC2566qa0(SearchTvFragment searchTvFragment, int i) {
        this.l = i;
        this.m = searchTvFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                SearchTvFragment searchTvFragment = this.m;
                AbstractC1474fG.j(searchTvFragment, "this$0");
                searchTvFragment.p0 = !searchTvFragment.p0;
                Tl0 tl0 = searchTvFragment.l0;
                AbstractC1474fG.g(tl0);
                ((ImageView) tl0.p).setImageResource(searchTvFragment.p0 ? R.drawable.ic_switch_on : R.drawable.ic_switch_off);
                searchTvFragment.o0.l(null);
                break;
            case 1:
                SearchTvFragment searchTvFragment2 = this.m;
                AbstractC1474fG.j(searchTvFragment2, "this$0");
                Tl0 tl1 = searchTvFragment2.l0;
                AbstractC1474fG.g(tl1);
                ((SearchEditText) tl1.n).setText("");
                searchTvFragment2.X().e("");
                break;
            default:
                SearchTvFragment searchTvFragment3 = this.m;
                AbstractC1474fG.j(searchTvFragment3, "this$0");
                searchTvFragment3.X().e(searchTvFragment3.X().d);
                break;
        }
    }
}
