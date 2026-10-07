package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: o.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2809t0 extends ClickableSpan {
    public final int a;
    public final N0 b;
    public final int c;

    public C2809t0(int i, N0 n0, int i2) {
        this.a = i;
        this.b = n0;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
