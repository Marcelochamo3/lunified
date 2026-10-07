package o;

/* JADX INFO: renamed from: o.aZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005aZ {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C1005aZ(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005aZ)) {
            return false;
        }
        C1005aZ c1005aZ = (C1005aZ) obj;
        return this.a == c1005aZ.a && this.b == c1005aZ.b && this.c == c1005aZ.c && this.d == c1005aZ.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackBufferDurations(minBufferMs=");
        sb.append(this.a);
        sb.append(", maxBufferMs=");
        sb.append(this.b);
        sb.append(", bufferForPlaybackMs=");
        sb.append(this.c);
        sb.append(", bufferForPlaybackAfterRebufferMs=");
        return AbstractC1701hf0.g(sb, this.d, ")");
    }
}
