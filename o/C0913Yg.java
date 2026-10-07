package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0913Yg implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final LinearLayout m;
    public final ViewPager2 n;

    public C0913Yg(ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager2 viewPager2) {
        this.l = constraintLayout;
        this.m = linearLayout;
        this.n = viewPager2;
    }

    public static C0913Yg a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.content_category_swiper_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.ll_dots_indicator;
        LinearLayout linearLayout = (LinearLayout) Sr0.g(viewInflate, R.id.ll_dots_indicator);
        if (linearLayout != null) {
            i = R.id.vp_category_swiper;
            ViewPager2 viewPager2 = (ViewPager2) Sr0.g(viewInflate, R.id.vp_category_swiper);
            if (viewPager2 != null) {
                return new C0913Yg((ConstraintLayout) viewInflate, linearLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
