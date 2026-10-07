package o;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: o.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648Ob extends AbstractC3015v6 {
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f436o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648Ob(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.n = i;
        switch (i) {
            case 1:
                this.f436o = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f436o = carouselLayoutManager;
                break;
        }
    }

    @Override // o.AbstractC3015v6
    public final int k() {
        switch (this.n) {
            case 0:
                return this.f436o.f613o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f436o;
                return carouselLayoutManager.f613o - carouselLayoutManager.J();
        }
    }

    @Override // o.AbstractC3015v6
    public final int m() {
        switch (this.n) {
            case 0:
                return this.f436o.K();
            default:
                return 0;
        }
    }

    @Override // o.AbstractC3015v6
    public final int n() {
        switch (this.n) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f436o;
                return carouselLayoutManager.n - carouselLayoutManager.L();
            default:
                return this.f436o.n;
        }
    }

    @Override // o.AbstractC3015v6
    public final int o() {
        switch (this.n) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f436o;
                if (carouselLayoutManager.Z0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // o.AbstractC3015v6
    public final int p() {
        switch (this.n) {
            case 0:
                return 0;
            default:
                return this.f436o.M();
        }
    }
}
