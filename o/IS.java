package o;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class IS implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ JS a;

    public IS(JS js) {
        this.a = js;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        JS js = this.a;
        if (z) {
            js.K0 = js.J0.add(js.M0[i].toString()) | js.K0;
        } else {
            js.K0 = js.J0.remove(js.M0[i].toString()) | js.K0;
        }
    }
}
