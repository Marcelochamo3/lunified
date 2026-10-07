package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.tG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2835tG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final RecyclerView m;
    public final TextView n;

    public C2835tG(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.l = constraintLayout;
        this.m = recyclerView;
        this.n = textView;
    }

    public static C2835tG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_category_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.rv_category;
        RecyclerView recyclerView2 = (RecyclerView) Sr0.g(viewInflate, R.id.rv_category);
        if (recyclerView2 != null) {
            i = R.id.tv_category_title;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_category_title);
            if (textView != null) {
                return new C2835tG((ConstraintLayout) viewInflate, recyclerView2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
