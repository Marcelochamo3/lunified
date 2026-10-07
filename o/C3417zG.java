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

/* JADX INFO: renamed from: o.zG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3417zG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ProgressBar n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f1149o;
    public final TextView p;
    public final TextView q;

    public C3417zG(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = progressBar;
        this.f1149o = textView;
        this.p = textView2;
        this.q = textView3;
    }

    public static C3417zG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_episode_tv, (ViewGroup) recyclerView, false);
        int i = R.id.iv_episode_poster;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_episode_poster);
        if (imageView != null) {
            i = R.id.pb_episode_progress;
            ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_episode_progress);
            if (progressBar != null) {
                i = R.id.tv_episode_info;
                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_episode_info);
                if (textView != null) {
                    i = R.id.tv_episode_released;
                    TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_episode_released);
                    if (textView2 != null) {
                        i = R.id.tv_episode_title;
                        TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_episode_title);
                        if (textView3 != null) {
                            return new C3417zG((ConstraintLayout) viewInflate, imageView, progressBar, textView, textView2, textView3);
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
