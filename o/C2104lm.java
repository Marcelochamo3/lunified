package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2104lm implements Rb0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final InterfaceC0775Sy d;

    public C2104lm(CharSequence charSequence, int i, int i2, InterfaceC0775Sy interfaceC0775Sy) {
        AbstractC1474fG.j(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = interfaceC0775Sy;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        return new C2006km(this);
    }
}
