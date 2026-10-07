package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class DG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final TextView m;

    public DG(ConstraintLayout constraintLayout, TextView textView) {
        this.l = constraintLayout;
        this.m = textView;
    }

    public static DG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_genre_grid_tv, (ViewGroup) recyclerView, false);
        TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_genre_name);
        if (textView != null) {
            return new DG((ConstraintLayout) viewInflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tv_genre_name)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
