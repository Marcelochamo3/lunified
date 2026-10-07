package o;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ku0 extends AbstractC0446Gg {
    public boolean s;
    public boolean t;

    @Override // o.AbstractC0446Gg
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // o.AbstractC0446Gg
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, M40.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.s = true;
                } else if (index == 22) {
                    this.t = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void l(C1636gw c1636gw, int i, int i2);

    @Override // o.AbstractC0446Gg, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s || this.t) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.m; i++) {
                    View view = (View) constraintLayout.l.get(this.l[i]);
                    if (view != null) {
                        if (this.s) {
                            view.setVisibility(visibility);
                        }
                        if (this.t && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
