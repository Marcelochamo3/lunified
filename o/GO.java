package o;

/* JADX INFO: loaded from: classes.dex */
public final class GO extends Exception {
    public final String l;
    public final boolean m;
    public final EO n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f276o;

    public GO(C0643Nw c0643Nw, LO lo, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c0643Nw, lo, c0643Nw.w, z, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public GO(String str, Throwable th, String str2, boolean z, EO eo, String str3) {
        super(str, th);
        this.l = str2;
        this.m = z;
        this.n = eo;
        this.f276o = str3;
    }
}
