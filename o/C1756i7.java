package o;

/* JADX INFO: renamed from: o.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1756i7 extends Exception {
    public final int l;
    public final boolean m;
    public final C0643Nw n;

    public C1756i7(int i, C0643Nw c0643Nw, boolean z) {
        super(AbstractC1674hK.n(i, "AudioTrack write failed: "));
        this.m = z;
        this.l = i;
        this.n = c0643Nw;
    }
}
