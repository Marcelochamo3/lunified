package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459Gt extends IOException {
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459Gt(int i, String str) {
        super(str);
        AbstractC1474fG.j(str, "message");
        this.l = i;
    }
}
