package o;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: loaded from: classes.dex */
public final class Z90 implements TextWatcher {
    public final /* synthetic */ Runnable l;
    public final /* synthetic */ SearchBar m;

    public Z90(SearchBar searchBar, Y90 y90) {
        this.m = searchBar;
        this.l = y90;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchBar searchBar = this.m;
        if (searchBar.G) {
            return;
        }
        Handler handler = searchBar.s;
        Runnable runnable = this.l;
        handler.removeCallbacks(runnable);
        searchBar.s.post(runnable);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
