package o;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class N8 implements T70 {
    public static final CW m = CW.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final CW n = new CW("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, CW.e);
    public final C1813in l;

    public N8(C1813in c1813in) {
        this.l = c1813in;
    }

    @Override // o.InterfaceC1916jq
    public final boolean K(Object obj, File file, FW fw) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((M70) obj).get();
        CW cw = n;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) fw.c(cw);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AL.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) fw.c(m)).intValue();
        OutputStream l9 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C1813in c1813in = this.l;
                    if (c1813in != null) {
                        try {
                            l9 = new L9(fileOutputStream, c1813in);
                        } catch (IOException unused) {
                            l9 = fileOutputStream;
                            Log.isLoggable("BitmapEncoder", 3);
                            if (l9 != null) {
                                try {
                                    l9.close();
                                } catch (IOException unused2) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            l9 = fileOutputStream;
                            if (l9 != null) {
                                try {
                                    l9.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        l9 = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, l9);
                    l9.close();
                    try {
                        l9.close();
                    } catch (IOException unused4) {
                    }
                    z = true;
                } catch (IOException unused5) {
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Objects.toString(compressFormat);
                    Kr0.c(bitmap);
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(fw.c(cw));
                    bitmap.hasAlpha();
                }
                return z;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // o.T70
    public final int x(FW fw) {
        return 2;
    }
}
