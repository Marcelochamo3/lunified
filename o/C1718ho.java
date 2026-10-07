package o;

/* JADX INFO: renamed from: o.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1718ho {
    public static final C1718ho b = new C1718ho(2);
    public static final C1718ho c = new C1718ho(0);
    public static final C1718ho d;
    public static final C1718ho e;
    public static final C1718ho f;
    public static final CW g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        C1718ho c1718ho = new C1718ho(1);
        d = c1718ho;
        e = new C1718ho(3);
        f = c1718ho;
        g = CW.a(c1718ho, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ C1718ho(int i) {
        this.a = i;
    }

    public final int a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return b.a(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
