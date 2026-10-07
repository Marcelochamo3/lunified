package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class GG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ProgressBar n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f275o;
    public final TextView p;
    public final TextView q;

    public GG(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = progressBar;
        this.f275o = textView;
        this.p = textView2;
        this.q = textView3;
    }

    public static GG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_movie_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.iv_movie_poster;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_movie_poster);
        if (imageView != null) {
            i = R.id.pb_movie_progress;
            ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_movie_progress);
            if (progressBar != null) {
                i = R.id.tv_movie_quality;
                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_movie_quality);
                if (textView != null) {
                    i = R.id.tv_movie_released_year;
                    TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_released_year);
                    if (textView2 != null) {
                        i = R.id.tv_movie_title;
                        TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_movie_title);
                        if (textView3 != null) {
                            return new GG((ConstraintLayout) viewInflate, imageView, progressBar, textView, textView2, textView3);
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
