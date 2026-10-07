package o;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q20 extends DialogInterfaceOnCancelListenerC0348Cm implements DialogInterface.OnClickListener {
    public DialogPreference B0;
    public CharSequence C0;
    public CharSequence D0;
    public CharSequence E0;
    public CharSequence F0;
    public int G0;
    public BitmapDrawable H0;
    public int I0;

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public void H(Bundle bundle) {
        super.H(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.C0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.D0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.E0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.F0);
        bundle.putInt("PreferenceDialogFragment.layout", this.G0);
        BitmapDrawable bitmapDrawable = this.H0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm
    public final Dialog X() {
        this.I0 = -2;
        C2523q2 title = new C2523q2(Q()).setTitle(this.C0);
        BitmapDrawable bitmapDrawable = this.H0;
        C2135m2 c2135m2 = title.a;
        c2135m2.c = bitmapDrawable;
        c2135m2.g = this.D0;
        c2135m2.h = this;
        c2135m2.i = this.E0;
        c2135m2.j = this;
        Q();
        int i = this.G0;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterN = this.X;
            if (layoutInflaterN == null) {
                layoutInflaterN = N();
            }
            viewInflate = layoutInflaterN.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            b0(viewInflate);
            title.setView(viewInflate);
        } else {
            title.a.f = this.F0;
        }
        d0(title);
        DialogInterfaceC2619r2 dialogInterfaceC2619r2Create = title.create();
        if (this instanceof C2885tp) {
            Window window = dialogInterfaceC2619r2Create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                P20.a(window);
            } else {
                e0();
            }
        }
        return dialogInterfaceC2619r2Create;
    }

    public final DialogPreference a0() {
        if (this.B0 == null) {
            Bundle bundle = this.q;
            if (bundle == null) {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
            this.B0 = (DialogPreference) ((S20) p(true)).W(bundle.getString("key"));
        }
        return this.B0;
    }

    public void b0(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.F0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void c0(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.I0 = i;
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c0(this.I0 == -1);
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public void z(Bundle bundle) {
        super.z(bundle);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxP = p(true);
        if (!(abstractComponentCallbacksC1247cxP instanceof S20)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        S20 s20 = (S20) abstractComponentCallbacksC1247cxP;
        Bundle bundle2 = this.q;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        String string = bundle2.getString("key");
        if (bundle != null) {
            this.C0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.D0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.E0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.F0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.G0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.H0 = new BitmapDrawable(m(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) s20.W(string);
        this.B0 = dialogPreference;
        this.C0 = dialogPreference.Y;
        this.D0 = dialogPreference.b0;
        this.E0 = dialogPreference.c0;
        this.F0 = dialogPreference.Z;
        this.G0 = dialogPreference.d0;
        Drawable drawable = dialogPreference.a0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.H0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.H0 = new BitmapDrawable(m(), bitmapCreateBitmap);
    }

    public void e0() {
    }

    public void d0(C2523q2 c2523q2) {
    }
}
