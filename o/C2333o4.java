package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: o.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2333o4 extends ImageView {
    public final Y1 l;
    public final C2613qy m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2333o4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Qj0.a(context);
        this.n = false;
        AbstractC1220cj0.a(this, getContext());
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, i);
        C2613qy c2613qy = new C2613qy(this);
        this.m = c2613qy;
        c2613qy.F(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.a();
        }
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            c2613qy.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2673rg c2673rg;
        C2613qy c2613qy = this.m;
        if (c2613qy == null || (c2673rg = (C2673rg) c2613qy.f996o) == null) {
            return null;
        }
        return (ColorStateList) c2673rg.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2673rg c2673rg;
        C2613qy c2613qy = this.m;
        if (c2613qy == null || (c2673rg = (C2673rg) c2613qy.f996o) == null) {
            return null;
        }
        return (PorterDuff.Mode) c2673rg.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.m.n).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            c2613qy.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2613qy c2613qy = this.m;
        if (c2613qy != null && drawable != null && !this.n) {
            c2613qy.m = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c2613qy != null) {
            c2613qy.b();
            if (this.n) {
                return;
            }
            ImageView imageView = (ImageView) c2613qy.n;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c2613qy.m);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.n = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            ImageView imageView = (ImageView) c2613qy.n;
            if (i != 0) {
                Drawable drawableL = Ou0.l(imageView.getContext(), i);
                if (drawableL != null) {
                    AbstractC3077vo.a(drawableL);
                }
                imageView.setImageDrawable(drawableL);
            } else {
                imageView.setImageDrawable(null);
            }
            c2613qy.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            c2613qy.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            if (((C2673rg) c2613qy.f996o) == null) {
                c2613qy.f996o = new C2673rg();
            }
            C2673rg c2673rg = (C2673rg) c2613qy.f996o;
            c2673rg.c = colorStateList;
            c2673rg.b = true;
            c2613qy.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2613qy c2613qy = this.m;
        if (c2613qy != null) {
            if (((C2673rg) c2613qy.f996o) == null) {
                c2613qy.f996o = new C2673rg();
            }
            C2673rg c2673rg = (C2673rg) c2613qy.f996o;
            c2673rg.d = mode;
            c2673rg.a = true;
            c2613qy.b();
        }
    }
}
