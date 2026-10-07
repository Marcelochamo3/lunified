package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596Mb extends U50 {
    public final Paint a;
    public final List b;

    public C0596Mb() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // o.U50
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC2837tI abstractC2837tI : this.b) {
            abstractC2837tI.getClass();
            paint.setColor(AbstractC1894jf.b(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).Y0()) {
                float fP = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.p();
                float fK = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k();
                abstractC2837tI.getClass();
                canvas.drawLine(0.0f, fP, 0.0f, fK, paint);
            } else {
                float fM = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.m();
                float fN = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.n();
                abstractC2837tI.getClass();
                canvas.drawLine(fM, 0.0f, fN, 0.0f, paint);
            }
        }
    }
}
