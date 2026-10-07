package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: loaded from: classes.dex */
public final class Y90 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ SearchBar m;

    public /* synthetic */ Y90(SearchBar searchBar, int i) {
        this.l = i;
        this.m = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                SearchBar searchBar = this.m;
                searchBar.setSearchQueryInternal(searchBar.l.getText().toString());
                break;
            default:
                SearchBar searchBar2 = this.m;
                searchBar2.l.requestFocusFromTouch();
                searchBar2.l.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar2.l.getWidth(), searchBar2.l.getHeight(), 0));
                searchBar2.l.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar2.l.getWidth(), searchBar2.l.getHeight(), 0));
                break;
        }
    }
}
