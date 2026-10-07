package o;

import android.media.MediaCodec;

/* JADX INFO: renamed from: o.ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2968ui {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final C2720s4 j;

    public C2968ui() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = Lr0.a >= 24 ? new C2720s4(cryptoInfo) : null;
    }
}
