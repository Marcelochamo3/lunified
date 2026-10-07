package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444Ge extends IOException {
    public C0444Ge(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
