package o;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: renamed from: o.aa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1007aa0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchBar a;

    public C1007aa0(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        SearchBar searchBar = this.a;
        if (3 == i || i == 0) {
            searchBar.getClass();
        }
        if (1 == i) {
            searchBar.getClass();
        }
        if (2 != i) {
            return false;
        }
        searchBar.t.hideSoftInputFromWindow(searchBar.l.getWindowToken(), 0);
        searchBar.s.postDelayed(new RunnableC3102w1(20, this), 500L);
        return true;
    }
}
