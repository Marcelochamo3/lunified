package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class R20 extends U50 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ S20 d;

    public R20(S20 s20) {
        this.d = s20;
    }

    @Override // o.U50
    public final void a(Rect rect, View view, RecyclerView recyclerView, C1755i60 c1755i60) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // o.U50
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (d(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        AbstractC2144m60 abstractC2144m60K = recyclerView.K(view);
        boolean z = false;
        if (!(abstractC2144m60K instanceof Z20) || !((Z20) abstractC2144m60K).y) {
            return false;
        }
        boolean z2 = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z2;
        }
        AbstractC2144m60 abstractC2144m60K2 = recyclerView.K(recyclerView.getChildAt(iIndexOfChild + 1));
        if ((abstractC2144m60K2 instanceof Z20) && ((Z20) abstractC2144m60K2).x) {
            z = true;
        }
        return z;
    }
}
