package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class B4 implements H4, DialogInterface.OnClickListener {
    public DialogInterfaceC2619r2 l;
    public ListAdapter m;
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I4 f182o;

    public B4(I4 i4) {
        this.f182o = i4;
    }

    @Override // o.H4
    public final boolean b() {
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = this.l;
        if (dialogInterfaceC2619r2 != null) {
            return dialogInterfaceC2619r2.isShowing();
        }
        return false;
    }

    @Override // o.H4
    public final int c() {
        return 0;
    }

    @Override // o.H4
    public final void dismiss() {
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = this.l;
        if (dialogInterfaceC2619r2 != null) {
            dialogInterfaceC2619r2.dismiss();
            this.l = null;
        }
    }

    @Override // o.H4
    public final Drawable f() {
        return null;
    }

    @Override // o.H4
    public final void i(CharSequence charSequence) {
        this.n = charSequence;
    }

    @Override // o.H4
    public final void n(int i, int i2) {
        if (this.m == null) {
            return;
        }
        I4 i4 = this.f182o;
        C2523q2 c2523q2 = new C2523q2(i4.getPopupContext());
        CharSequence charSequence = this.n;
        if (charSequence != null) {
            c2523q2.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.m;
        int selectedItemPosition = i4.getSelectedItemPosition();
        C2135m2 c2135m2 = c2523q2.a;
        c2135m2.n = listAdapter;
        c2135m2.f907o = this;
        c2135m2.t = selectedItemPosition;
        c2135m2.s = true;
        DialogInterfaceC2619r2 dialogInterfaceC2619r2Create = c2523q2.create();
        this.l = dialogInterfaceC2619r2Create;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC2619r2Create.q.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.l.show();
    }

    @Override // o.H4
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        I4 i4 = this.f182o;
        i4.setSelection(i);
        if (i4.getOnItemClickListener() != null) {
            i4.performItemClick(null, i, this.m.getItemId(i));
        }
        dismiss();
    }

    @Override // o.H4
    public final CharSequence p() {
        return this.n;
    }

    @Override // o.H4
    public final void q(ListAdapter listAdapter) {
        this.m = listAdapter;
    }

    @Override // o.H4
    public final void j(Drawable drawable) {
    }

    @Override // o.H4
    public final void k(int i) {
    }

    @Override // o.H4
    public final void l(int i) {
    }

    @Override // o.H4
    public final void m(int i) {
    }
}
