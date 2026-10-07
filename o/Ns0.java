package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ns0 implements Q70 {
    public static final CW d = new CW("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2080la(3));
    public static final CW e = new CW("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2080la(4));
    public static final C3325yL f = new C3325yL();
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final Ls0 a;
    public final Q8 b;
    public final C3325yL c = f;

    public Ns0(Q8 q8, Ls0 ls0) {
        this.b = q8;
        this.a = ls0;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) throws IOException {
        long jLongValue = ((Long) fw.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC1674hK.o(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) fw.c(e);
        if (num == null) {
            num = 2;
        }
        C1718ho c1718ho = (C1718ho) fw.c(C1718ho.g);
        if (c1718ho == null) {
            c1718ho = C1718ho.f;
        }
        C1718ho c1718ho2 = c1718ho;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.i(mediaMetadataRetriever, obj);
            return R8.c(c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, c1718ho2), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1718ho c1718ho) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.a.m(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i9 = 0; i9 < trackCount; i9++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i9).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused) {
                        try {
                            Log.isLoggable("VideoDecoder", 3);
                            if (mediaExtractor != null) {
                            }
                            if (Build.VERSION.SDK_INT >= 27) {
                                try {
                                    i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i8 != 90) {
                                        i7 = i6;
                                        i6 = i7;
                                    } else {
                                        i7 = i6;
                                        i6 = i7;
                                    }
                                    float fB = c1718ho.b(i6, i7, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fB), Math.round(fB * i7));
                                } catch (Throwable unused2) {
                                    Log.isLoggable("VideoDecoder", 3);
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    try {
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                        i5 = Integer.parseInt(strExtractMetadata);
                                        int i10 = Integer.parseInt(strExtractMetadata2);
                                        if (i5 != 7) {
                                            Log.isLoggable("VideoDecoder", 3);
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        } else {
                                            Log.isLoggable("VideoDecoder", 3);
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                        }
                                    } catch (NumberFormatException unused3) {
                                        Log.isLoggable("VideoDecoder", 3);
                                    }
                                }
                            } else {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata3);
                                    int i11 = Integer.parseInt(strExtractMetadata4);
                                    if (i5 != 7) {
                                        Log.isLoggable("VideoDecoder", 3);
                                        Matrix matrix3 = new Matrix();
                                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                    } else {
                                        Log.isLoggable("VideoDecoder", 3);
                                        Matrix matrix4 = new Matrix();
                                        matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new Ms0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
                        } catch (Throwable th) {
                            if (mediaExtractor == null) {
                                throw th;
                            }
                            mediaExtractor.release();
                            throw th;
                        }
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && c1718ho != C1718ho.e) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float fB2 = c1718ho.b(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fB2), Math.round(fB2 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata5);
                int i12 = Integer.parseInt(strExtractMetadata6);
                if ((i5 != 7 || i5 == 6) && i12 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Log.isLoggable("VideoDecoder", 3);
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator it = g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i5 = Integer.parseInt(strExtractMetadata7);
            int i13 = Integer.parseInt(strExtractMetadata8);
            if (i5 != 7) {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new Ms0("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
