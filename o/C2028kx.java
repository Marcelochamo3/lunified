package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2028kx implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final C2303no0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f882o;
    public final VerticalGridView p;

    public /* synthetic */ C2028kx(ConstraintLayout constraintLayout, C2303no0 c2303no0, ImageView imageView, VerticalGridView verticalGridView, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = c2303no0;
        this.f882o = imageView;
        this.p = verticalGridView;
    }

    public static C2028kx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home_tv, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C2303no0 c2303no0A = C2303no0.a(viewG);
            i = R.id.iv_home_background;
            ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_home_background);
            if (imageView != null) {
                i = R.id.vgv_home;
                VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_home);
                if (verticalGridView != null) {
                    return new C2028kx((ConstraintLayout) viewInflate, c2303no0A, imageView, verticalGridView, 0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        switch (this.l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.m;
    }
}
