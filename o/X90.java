package o;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: loaded from: classes.dex */
public final class X90 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchBar b;

    public /* synthetic */ X90(SearchBar searchBar, int i) {
        this.a = i;
        this.b = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                SearchBar searchBar = this.b;
                if (z) {
                    searchBar.s.post(new Y90(searchBar, 1));
                } else {
                    searchBar.t.hideSoftInputFromWindow(searchBar.l.getWindowToken(), 0);
                }
                searchBar.d(z);
                break;
            default:
                SearchBar searchBar2 = this.b;
                if (z) {
                    searchBar2.t.hideSoftInputFromWindow(searchBar2.l.getWindowToken(), 0);
                    if (searchBar2.u) {
                        searchBar2.a();
                        searchBar2.u = false;
                    }
                } else {
                    searchBar2.b();
                }
                searchBar2.d(z);
                break;
        }
    }
}
