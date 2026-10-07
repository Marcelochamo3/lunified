package io.sentry.android.replay;

import java.io.File;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final File a;
    public final long b;

    public i(File file, long j) {
        this.a = file;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC1474fG.b(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ReplayFrame(screenshot=" + this.a + ", timestamp=" + this.b + ')';
    }
}
