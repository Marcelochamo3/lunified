package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.yG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3320yG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ProgressBar n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f1131o;
    public final TextView p;
    public final TextView q;

    public C3320yG(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = progressBar;
        this.f1131o = textView;
        this.p = textView2;
        this.q = textView3;
    }

    public static C3320yG a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_episode_mobile, (ViewGroup) recyclerView, false);
        int i = R.id.guideline1;
        if (((Guideline) Sr0.g(viewInflate, R.id.guideline1)) != null) {
            i = R.id.iv_episode_poster;
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
                                return new C3320yG((ConstraintLayout) viewInflate, imageView, progressBar, textView, textView2, textView3);
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
