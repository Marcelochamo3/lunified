package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2010ko {
    public static final CW f = CW.a(EnumC0423Fj.n, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final CW g = new CW("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, CW.e);
    public static final CW h;
    public static final CW i;
    public static final Set j;
    public static final C0519Jb k;
    public static final ArrayDeque l;
    public final Q8 a;
    public final DisplayMetrics b;
    public final C1813in c;
    public final List d;
    public final C1567gB e = C1567gB.a();

    static {
        C1718ho c1718ho = C1718ho.b;
        Boolean bool = Boolean.FALSE;
        h = CW.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = CW.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new C0519Jb(12);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = Kr0.a;
        l = new ArrayDeque(0);
    }

    public C2010ko(ArrayList arrayList, DisplayMetrics displayMetrics, Q8 q8, C1813in c1813in) {
        this.d = arrayList;
        AbstractC3045vW.k(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        AbstractC3045vW.k(q8, "Argument must not be null");
        this.a = q8;
        AbstractC3045vW.k(c1813in, "Argument must not be null");
        this.c = c1813in;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(o.QE r4, android.graphics.BitmapFactory.Options r5, o.InterfaceC1912jo r6, o.Q8 r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.A()
            r4.h()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = o.AbstractC2880tm0.b
            r3.lock()
            android.graphics.Bitmap r4 = r4.c(r5)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r4
        L1d:
            r4 = move-exception
            goto L40
        L1f:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L3f
            r7.d(r1)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L3e
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L3e
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L3e
            java.util.concurrent.locks.Lock r5 = o.AbstractC2880tm0.b
            r5.unlock()
            return r4
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L3f:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L40:
            java.util.concurrent.locks.Lock r5 = o.AbstractC2880tm0.b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2010ko.c(o.QE, android.graphics.BitmapFactory$Options, o.jo, o.Q8):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final R8 a(QE qe, int i2, int i3, FW fw, InterfaceC1912jo interfaceC1912jo) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.g(65536, byte[].class);
        synchronized (C2010ko.class) {
            ArrayDeque arrayDeque = l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0423Fj enumC0423Fj = (EnumC0423Fj) fw.c(f);
        EnumC0967a30 enumC0967a30 = (EnumC0967a30) fw.c(g);
        C1718ho c1718ho = (C1718ho) fw.c(C1718ho.g);
        boolean zBooleanValue = ((Boolean) fw.c(h)).booleanValue();
        CW cw = i;
        try {
            return R8.c(b(qe, options2, c1718ho, enumC0423Fj, enumC0967a30, fw.c(cw) != null && ((Boolean) fw.c(cw)).booleanValue(), i2, i3, zBooleanValue, interfaceC1912jo), this.a);
        } finally {
            f(options2);
            this.c.l(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0191  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(QE qe, BitmapFactory.Options options, C1718ho c1718ho, EnumC0423Fj enumC0423Fj, EnumC0967a30 enumC0967a30, boolean z, int i2, int i3, boolean z2, InterfaceC1912jo interfaceC1912jo) {
        char c;
        boolean z3;
        boolean zHasAlpha;
        int i4;
        Bitmap.Config config;
        int i5;
        int i6;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound;
        double dB;
        double d;
        int i7;
        int i8 = AL.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        Q8 q8 = this.a;
        c(qe, options, interfaceC1912jo, q8);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i9 = iArr[0];
        int i10 = iArr[1];
        boolean z4 = (i9 == -1 || i10 == -1) ? false : z;
        int iJ = qe.j();
        switch (iJ) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (iJ) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i11 = i2;
        if (i11 == Integer.MIN_VALUE) {
            i11 = (c == 'Z' || c == 270) ? i10 : i9;
        }
        if (i3 == -2147483648) {
            i3 = (c == 'Z' || c == 270) ? i9 : i10;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM = qe.m();
        String str = "Downsampler";
        if (i9 <= 0 || i10 <= 0) {
            int i12 = 3;
            if (Log.isLoggable(str, i12)) {
                Objects.toString(imageHeaderParser$ImageTypeM);
            }
        } else {
            iJ = iJ;
            if (c == 'Z' || c == 270) {
                i5 = i10;
                i6 = i9;
            } else {
                i6 = i10;
                i5 = i9;
            }
            float fB = c1718ho.b(i5, i6, i11, i3);
            if (fB <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + c1718ho + ", source: [" + i9 + "x" + i10 + "], target: [" + i11 + "x" + i3 + "]");
            }
            z4 = z4;
            int iA = c1718ho.a(i5, i6, i11, i3);
            if (iA == 0) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f2 = i5;
            float f3 = i6;
            i3 = i3;
            int i13 = i5 / ((int) (((double) (fB * f2)) + 0.5d));
            int i14 = i6 / ((int) (((double) (fB * f3)) + 0.5d));
            int iMax2 = iA == 1 ? Math.max(i13, i14) : Math.min(i13, i14);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 > 23 || !j.contains(options.outMimeType)) {
                iMax = Math.max(1, Integer.highestOneBit(iMax2));
                if (iA == 1 && iMax < 1.0f / fB) {
                    iMax <<= 1;
                }
            } else {
                iMax = 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeM == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f2 / fMin);
                iRound = (int) Math.ceil(f3 / fMin);
                int i16 = iMax / 8;
                if (i16 > 0) {
                    iFloor /= i16;
                    iRound /= i16;
                }
            } else {
                if (imageHeaderParser$ImageTypeM == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM == ImageHeaderParser$ImageType.PNG_A) {
                    float f4 = iMax;
                    iFloor = (int) Math.floor(f2 / f4);
                    dFloor = Math.floor(f3 / f4);
                } else if (!imageHeaderParser$ImageTypeM.isWebp()) {
                    if (i5 % iMax == 0 && i6 % iMax == 0) {
                        iFloor = i5 / iMax;
                        iRound = i6 / iMax;
                    } else {
                        options.inJustDecodeBounds = true;
                        c(qe, options, interfaceC1912jo, q8);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        iFloor = iArr2[0];
                        iRound = iArr2[1];
                    }
                    dB = c1718ho.b(iFloor, iRound, i11, i3);
                    if (dB <= 1.0d) {
                        d = dB;
                    } else {
                        d = 1.0d / dB;
                    }
                    int iRound2 = (int) Math.round(d * 2.147483647E9d);
                    int i17 = (int) ((((double) iRound2) * dB) + 0.5d);
                    options.inTargetDensity = (int) (((dB / ((double) (i17 / iRound2))) * ((double) i17)) + 0.5d);
                    if (dB > 1.0d) {
                        dB = 1.0d / dB;
                    }
                    int iRound3 = (int) Math.round(dB * 2.147483647E9d);
                    options.inDensity = iRound3;
                    i7 = options.inTargetDensity;
                    if (i7 > 0 || iRound3 <= 0 || i7 == iRound3) {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    } else {
                        options.inScaled = true;
                    }
                    str = "Downsampler";
                    Log.isLoggable(str, 2);
                    i10 = i10;
                    i9 = i9;
                } else if (i15 >= 24) {
                    float f5 = iMax;
                    iFloor = Math.round(f2 / f5);
                    iRound = Math.round(f3 / f5);
                } else {
                    float f6 = iMax;
                    iFloor = (int) Math.floor(f2 / f6);
                    dFloor = Math.floor(f3 / f6);
                }
                iRound = (int) dFloor;
            }
            dB = c1718ho.b(iFloor, iRound, i11, i3);
            if (dB <= 1.0d) {
                d = dB;
            } else {
                d = 1.0d / dB;
            }
            int iRound4 = (int) Math.round(d * 2.147483647E9d);
            int i18 = (int) ((((double) iRound4) * dB) + 0.5d);
            options.inTargetDensity = (int) (((dB / ((double) (i18 / iRound4))) * ((double) i18)) + 0.5d);
            if (dB > 1.0d) {
                dB = 1.0d / dB;
            }
            int iRound5 = (int) Math.round(dB * 2.147483647E9d);
            options.inDensity = iRound5;
            i7 = options.inTargetDensity;
            if (i7 > 0) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str = "Downsampler";
            Log.isLoggable(str, 2);
            i10 = i10;
            i9 = i9;
        }
        boolean zC = this.e.c(i11, i3, z4, z3);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zC) {
            if (enumC0423Fj != EnumC0423Fj.l) {
                try {
                    zHasAlpha = qe.m().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable(str, 3)) {
                        Objects.toString(enumC0423Fj);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i9 < 0 || i10 < 0 || !z2) {
            int i20 = options.inTargetDensity;
            float f7 = i20 > 0 && (i4 = options.inDensity) > 0 && i20 != i4 ? i20 / options.inDensity : 1.0f;
            float f8 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i9 / f8);
            int iCeil2 = (int) Math.ceil(i10 / f8);
            int iRound6 = Math.round(iCeil * f7);
            int iRound7 = Math.round(iCeil2 * f7);
            Log.isLoggable(str, 2);
            i3 = iRound7;
            i11 = iRound6;
        }
        Bitmap bitmap = null;
        if (i11 > 0 && i3 > 0) {
            if (i19 < 26) {
                config = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = q8.a(i11, i3, config);
        }
        if (enumC0967a30 != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get(enumC0967a30 == EnumC0967a30.l && options.outColorSpace != null && options.outColorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapC = c(qe, options, interfaceC1912jo, q8);
        interfaceC1912jo.r(bitmapC, q8);
        if (Log.isLoggable(str, 2)) {
            d(bitmapC);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapC != null) {
            bitmapC.setDensity(this.b.densityDpi);
            switch (iJ) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (iJ) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                    matrix.mapRect(rectF);
                    Bitmap bitmapC2 = q8.c(Math.round(rectF.width()), Math.round(rectF.height()), bitmapC.getConfig() != null ? bitmapC.getConfig() : Bitmap.Config.ARGB_8888);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapC2.setHasAlpha(bitmapC.hasAlpha());
                    AbstractC2880tm0.a(bitmapC, bitmapC2, matrix);
                    bitmap = bitmapC2;
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            if (!bitmapC.equals(bitmap)) {
                q8.d(bitmapC);
            }
        }
        return bitmap;
    }
}
