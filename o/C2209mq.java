package o;

import android.text.Editable;

/* JADX INFO: renamed from: o.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2209mq extends AbstractC1025aj0 {
    public final /* synthetic */ C2403oq l;

    public C2209mq(C2403oq c2403oq) {
        this.l = c2403oq;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.l.b().a();
    }

    @Override // o.AbstractC1025aj0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.l.b().b();
    }
}
