package o;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: o.sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2780sl implements ImageDecoder$OnHeaderDecodedListener {
    public final C1567gB a = C1567gB.a();
    public final int b;
    public final int c;
    public final EnumC0423Fj d;
    public final C1718ho e;
    public final boolean f;
    public final EnumC0967a30 g;

    public C2780sl(int i, int i2, FW fw) {
        this.b = i;
        this.c = i2;
        this.d = (EnumC0423Fj) fw.c(C2010ko.f);
        this.e = (C1718ho) fw.c(C1718ho.g);
        CW cw = C2010ko.i;
        this.f = fw.c(cw) != null && ((Boolean) fw.c(cw)).booleanValue();
        this.g = (EnumC0967a30) fw.c(C2010ko.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.a.c(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == EnumC0423Fj.m) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C2683rl());
        Size size = imageInfo.getSize();
        int width = this.b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC0967a30 enumC0967a30 = this.g;
        if (enumC0967a30 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC0967a30 == EnumC0967a30.l && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
