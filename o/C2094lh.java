package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2094lh implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f898o;
    public final ImageView p;
    public final ProgressBar q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public C2094lh(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, ProgressBar progressBar, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = textView;
        this.f898o = textView2;
        this.p = imageView2;
        this.q = progressBar;
        this.r = textView3;
        this.s = textView4;
        this.t = textView5;
        this.u = textView6;
        this.v = textView7;
        this.w = textView8;
        this.x = textView9;
    }

    public static C2094lh a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.content_movie_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.barrier1;
        if (((Barrier) Sr0.g(viewInflate, R.id.barrier1)) != null) {
            i = R.id.barrier2;
            if (((Barrier) Sr0.g(viewInflate, R.id.barrier2)) != null) {
                i = R.id.btn_movie_favorite;
                ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.btn_movie_favorite);
                if (imageView != null) {
                    i = R.id.btn_movie_trailer;
                    TextView textView = (TextView) Sr0.g(viewInflate, R.id.btn_movie_trailer);
                    if (textView != null) {
                        i = R.id.btn_movie_watch_now;
                        TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.btn_movie_watch_now);
                        if (textView2 != null) {
                            i = R.id.iv_movie_poster;
                            ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.iv_movie_poster);
                            if (imageView2 != null) {
                                i = R.id.iv_movie_rating_icon;
                                if (((ImageView) Sr0.g(viewInflate, R.id.iv_movie_rating_icon)) != null) {
                                    i = R.id.pb_movie_progress;
                                    ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_movie_progress);
                                    if (progressBar != null) {
                                        i = R.id.tv_movie_genres;
                                        TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_genres);
                                        if (textView3 != null) {
                                            i = R.id.tv_movie_overview;
                                            TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_overview);
                                            if (textView4 != null) {
                                                i = R.id.tv_movie_quality;
                                                TextView textView5 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_quality);
                                                if (textView5 != null) {
                                                    i = R.id.tv_movie_rating;
                                                    TextView textView6 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_rating);
                                                    if (textView6 != null) {
                                                        i = R.id.tv_movie_released;
                                                        TextView textView7 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_released);
                                                        if (textView7 != null) {
                                                            i = R.id.tv_movie_runtime;
                                                            TextView textView8 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_runtime);
                                                            if (textView8 != null) {
                                                                i = R.id.tv_movie_title;
                                                                TextView textView9 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_title);
                                                                if (textView9 != null) {
                                                                    return new C2094lh((ConstraintLayout) viewInflate, imageView, textView, textView2, imageView2, progressBar, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
