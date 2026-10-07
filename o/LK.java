package o;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class LK implements DialogInterface.OnClickListener {
    public final /* synthetic */ MK l;

    public LK(MK mk) {
        this.l = mk;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MK mk = this.l;
        mk.J0 = i;
        mk.I0 = -1;
        dialogInterface.dismiss();
    }
}
