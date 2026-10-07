package o;

import android.text.Editable;

/* JADX INFO: renamed from: o.Lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585Lp extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C0585Lp b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new C2479pf0(cls, charSequence) : super.newEditable(charSequence);
    }
}
