package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778Tb extends IOException {
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0778Tb(int i, String str) {
        super(str);
        AbstractC1474fG.j(str, "message");
        this.l = i;
    }
}
