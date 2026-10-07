package o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.zX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3434zX extends AbstractC2500pq {
    public final int e;
    public EditText f;
    public final ViewOnClickListenerC3251xe g;

    public C3434zX(C2403oq c2403oq, int i) {
        super(c2403oq);
        this.e = R.drawable.design_password_eye;
        this.g = new ViewOnClickListenerC3251xe(15, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // o.AbstractC2500pq
    public final void b() {
        q();
    }

    @Override // o.AbstractC2500pq
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // o.AbstractC2500pq
    public final int d() {
        return this.e;
    }

    @Override // o.AbstractC2500pq
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // o.AbstractC2500pq
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC2500pq
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // o.AbstractC2500pq
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // o.AbstractC2500pq
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // o.AbstractC2500pq
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
