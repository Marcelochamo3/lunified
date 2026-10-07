package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.i50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1753i50 extends ConstraintLayout {
    public final Jj0 D;
    public int E;
    public final C2068lO F;

    public AbstractC1753i50(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2068lO c2068lO = new C2068lO();
        this.F = c2068lO;
        T60 t60 = new T60(0.5f);
        C1795id0 c1795id0E = c2068lO.l.a.e();
        c1795id0E.e = t60;
        c1795id0E.f = t60;
        c1795id0E.g = t60;
        c1795id0E.h = t60;
        c2068lO.setShapeAppearanceModel(c1795id0E.a());
        this.F.l(ColorStateList.valueOf(-1));
        C2068lO c2068lO2 = this.F;
        WeakHashMap weakHashMap = It0.a;
        setBackground(c2068lO2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.x, R.attr.materialClockStyle, 0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.D = new Jj0(23, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = It0.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Jj0 jj0 = this.D;
            handler.removeCallbacks(jj0);
            handler.post(jj0);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Jj0 jj0 = this.D;
            handler.removeCallbacks(jj0);
            handler.post(jj0);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.F.l(ColorStateList.valueOf(i));
    }
}
