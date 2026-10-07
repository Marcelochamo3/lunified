package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1675hL extends IOException {
    public C1675hL(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
