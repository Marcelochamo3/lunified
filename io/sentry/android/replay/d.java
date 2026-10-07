package io.sentry.android.replay;

import java.io.File;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final File a;
    public final int b;
    public final long c;

    public d(File file, int i, long j) {
        this.a = file;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC1474fG.b(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "GeneratedVideo(video=" + this.a + ", frameCount=" + this.b + ", duration=" + this.c + ')';
    }
}
