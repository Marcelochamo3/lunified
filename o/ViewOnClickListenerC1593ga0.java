package o;

import android.view.View;
import android.widget.EditText;
import com.skidush.clonex.fragments.search.SearchMobileFragment;

/* JADX INFO: renamed from: o.ga0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1593ga0 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ SearchMobileFragment m;

    public /* synthetic */ ViewOnClickListenerC1593ga0(SearchMobileFragment searchMobileFragment, int i) {
        this.l = i;
        this.m = searchMobileFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                SearchMobileFragment searchMobileFragment = this.m;
                AbstractC1474fG.j(searchMobileFragment, "this$0");
                C1750i4 c1750i4 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i4);
                ((EditText) c1750i4.f824o).setText("");
                searchMobileFragment.X().e("");
                break;
            default:
                SearchMobileFragment searchMobileFragment2 = this.m;
                AbstractC1474fG.j(searchMobileFragment2, "this$0");
                searchMobileFragment2.X().e(searchMobileFragment2.X().d);
                break;
        }
    }
}
