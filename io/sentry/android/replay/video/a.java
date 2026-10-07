package io.sentry.android.replay.video;

import java.io.File;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final File a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;

    public a(File file, int i, int i2, int i3, int i4) {
        AbstractC1474fG.j(file, "file");
        this.a = file;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = "video/avc";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1474fG.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && AbstractC1474fG.b(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        return "MuxerConfig(file=" + this.a + ", recordingWidth=" + this.b + ", recordingHeight=" + this.c + ", frameRate=" + this.d + ", bitRate=" + this.e + ", mimeType=" + this.f + ')';
    }
}
