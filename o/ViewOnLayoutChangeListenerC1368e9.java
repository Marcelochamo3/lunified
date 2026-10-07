package o;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* JADX INFO: renamed from: o.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1368e9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ViewOnLayoutChangeListenerC1368e9(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        J7 j7;
        switch (this.l) {
            case 0:
                ((BottomAppBar$Behavior) this.m).getClass();
                throw null;
            default:
                AbstractC2268nU abstractC2268nU = (AbstractC2268nU) this.m;
                if (abstractC2268nU.y.getVisibility() != 0 || (j7 = abstractC2268nU.Q) == null) {
                    return;
                }
                Rect rect = new Rect();
                ImageView imageView = abstractC2268nU.y;
                imageView.getDrawingRect(rect);
                j7.setBounds(rect);
                j7.h(imageView, null);
                return;
        }
    }
}
