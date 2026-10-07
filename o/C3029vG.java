package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.vG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3029vG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final HorizontalGridView m;
    public final TextView n;

    public C3029vG(ConstraintLayout constraintLayout, HorizontalGridView horizontalGridView, TextView textView) {
        this.l = constraintLayout;
        this.m = horizontalGridView;
        this.n = textView;
    }

    public static C3029vG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_category_tv, (ViewGroup) recyclerView, false);
        int i = R.id.hgv_category;
        HorizontalGridView horizontalGridView = (HorizontalGridView) Sr0.g(viewInflate, R.id.hgv_category);
        if (horizontalGridView != null) {
            i = R.id.tv_category_title;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_category_title);
            if (textView != null) {
                return new C3029vG((ConstraintLayout) viewInflate, horizontalGridView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
