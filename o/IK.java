package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class IK implements View.OnTouchListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ IK(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2527q4 c2527q4;
        switch (this.l) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                JK jk = (JK) this.m;
                if (action == 0 && (c2527q4 = jk.K) != null && c2527q4.isShowing() && x >= 0 && x < jk.K.getWidth() && y >= 0 && y < jk.K.getHeight()) {
                    jk.G.postDelayed(jk.C, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                jk.G.removeCallbacks(jk.C);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.m).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
