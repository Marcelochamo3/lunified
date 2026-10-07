package o;

/* JADX INFO: renamed from: o.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1560g7 extends Exception {
    public final int l;
    public final boolean m;

    public C1560g7(int i, int i2, int i3, int i4, C0643Nw c0643Nw, boolean z, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(c0643Nw);
        sb.append(z ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.l = i;
        this.m = z;
    }
}
