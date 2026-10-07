package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.uG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2932uG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final TextView m;
    public final ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f1053o;
    public final ProgressBar p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;

    public C2932uG(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, ProgressBar progressBar, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.l = constraintLayout;
        this.m = textView;
        this.n = imageView;
        this.f1053o = imageView2;
        this.p = progressBar;
        this.q = textView2;
        this.r = textView3;
        this.s = textView4;
        this.t = textView5;
        this.u = textView6;
        this.v = textView7;
    }

    public static C2932uG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_category_swiper_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.barrier1;
        if (((Barrier) Sr0.g(viewInflate, R.id.barrier1)) != null) {
            i = R.id.btn_swiper_watch_now;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.btn_swiper_watch_now);
            if (textView != null) {
                i = R.id.iv_swiper_background;
                ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_swiper_background);
                if (imageView != null) {
                    i = R.id.iv_swiper_rating_icon;
                    ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.iv_swiper_rating_icon);
                    if (imageView2 != null) {
                        i = R.id.ll_dots_indicator;
                        if (((LinearLayout) Sr0.g(viewInflate, R.id.ll_dots_indicator)) != null) {
                            i = R.id.pb_swiper_progress;
                            ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_swiper_progress);
                            if (progressBar != null) {
                                i = R.id.tv_swiper_overview;
                                TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_overview);
                                if (textView2 != null) {
                                    i = R.id.tv_swiper_quality;
                                    TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_quality);
                                    if (textView3 != null) {
                                        i = R.id.tv_swiper_rating;
                                        TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_rating);
                                        if (textView4 != null) {
                                            i = R.id.tv_swiper_released;
                                            TextView textView5 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_released);
                                            if (textView5 != null) {
                                                i = R.id.tv_swiper_title;
                                                TextView textView6 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_title);
                                                if (textView6 != null) {
                                                    i = R.id.tv_swiper_tv_show_last_episode;
                                                    TextView textView7 = (TextView) Sr0.g(viewInflate, R.id.tv_swiper_tv_show_last_episode);
                                                    if (textView7 != null) {
                                                        return new C2932uG((ConstraintLayout) viewInflate, textView, imageView, imageView2, progressBar, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
