package o;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: o.hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1697hd0 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g = new Path();
    public final Paint h;

    public C1697hd0() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.a = paint2;
        this.d = AbstractC1894jf.f(-16777216, 68);
        this.e = AbstractC1894jf.f(-16777216, 20);
        this.f = AbstractC1894jf.f(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
