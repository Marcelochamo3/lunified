package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1930jx implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final C1583gR n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f858o;
    public final RecyclerView p;

    public /* synthetic */ C1930jx(ConstraintLayout constraintLayout, C1583gR c1583gR, ImageView imageView, RecyclerView recyclerView, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = c1583gR;
        this.f858o = imageView;
        this.p = recyclerView;
    }

    public static C1930jx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home_mobile, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C1583gR c1583gRG = C1583gR.g(viewG);
            i = R.id.iv_provider_logo;
            ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_provider_logo);
            if (imageView != null) {
                i = R.id.rv_home;
                RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_home);
                if (recyclerView != null) {
                    return new C1930jx((ConstraintLayout) viewInflate, c1583gRG, imageView, recyclerView, 0);
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
