package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class B80 extends Drawable.ConstantState {
    public C2068lO a;
    public boolean b;

    public B80(B80 b80) {
        this.a = (C2068lO) b80.a.l.newDrawable();
        this.b = b80.b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C80(new B80(this));
    }
}
