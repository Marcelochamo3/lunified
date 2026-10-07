package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: o.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3409z9 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final String[] c = new String[0];
    public static final C3325yL d = new C3325yL();
    public static final String[] e = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] g = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static void A(C3065vi c3065vi) {
        c3065vi.k = -3.4028235E38f;
        c3065vi.j = Integer.MIN_VALUE;
        CharSequence charSequence = c3065vi.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c3065vi.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c3065vi.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float B(float f2, int i, int i2, int i3) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f3 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i2;
        }
        return f2 * f3;
    }

    public static void C(View view, C2068lO c2068lO) {
        C3467zp c3467zp = c2068lO.l.b;
        if (c3467zp == null || !c3467zp.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = It0.a;
            fI += AbstractC3185wt0.i((View) parent);
        }
        C1970kO c1970kO = c2068lO.l;
        if (c1970kO.m != fI) {
            c1970kO.m = fI;
            c2068lO.o();
        }
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016d A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #17 {all -> 0x0183, blocks: (B:101:0x0161, B:103:0x016d, B:114:0x0186, B:115:0x018b), top: B:252:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0186 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #17 {all -> 0x0183, blocks: (B:101:0x0161, B:103:0x016d, B:114:0x0186, B:115:0x018b), top: B:252:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0198 A[Catch: IllegalStateException -> 0x017c, IOException -> 0x017e, FileNotFoundException -> 0x0181, TRY_LEAVE, TryCatch #30 {FileNotFoundException -> 0x0181, IOException -> 0x017e, IllegalStateException -> 0x017c, blocks: (B:99:0x0159, B:104:0x0177, B:123:0x0198, B:121:0x0195, B:120:0x0192), top: B:276:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d8 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #4 {all -> 0x01e7, blocks: (B:139:0x01cc, B:141:0x01d8, B:150:0x01ea), top: B:242:0x01cc, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ea A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01e7, blocks: (B:139:0x01cc, B:141:0x01d8, B:150:0x01ea), top: B:242:0x01cc, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0208  */
    /* JADX WARN: Code duplicated, block: B:166:0x0214  */
    /* JADX WARN: Code duplicated, block: B:167:0x0218  */
    /* JADX WARN: Code duplicated, block: B:175:0x0234 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #28 {all -> 0x0257, blocks: (B:172:0x022c, B:173:0x022e, B:175:0x0234), top: B:262:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0286  */
    /* JADX WARN: Code duplicated, block: B:221:0x028f  */
    /* JADX WARN: Code duplicated, block: B:226:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:252:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0151  */
    public static void E(Context context, Executor executor, InterfaceC2719s30 interfaceC2719s30, boolean z) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStreamB;
        IOException iOException;
        int i;
        C3073vm[] c3073vmArrB;
        C3073vm[] c3073vmArr;
        InterfaceC2719s30 interfaceC2719s31;
        C3073vm[] c3073vmArr2;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i2;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        Q6 q6;
        FileInputStream fileInputStreamB2;
        boolean z3;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j == packageInfo.lastUpdateTime;
                            if (z4) {
                                interfaceC2719s30.g(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    context.getPackageName();
                    AbstractC3301y30.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            Q6 q7 = new Q6(assets, executor, interfaceC2719s30, name, file2);
            byte[] bArr5 = (byte[]) q7.d;
            if (bArr5 == null) {
                q7.c(3, Integer.valueOf(i4));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                q7.c(4, null);
                            }
                            if (z2 || !z) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            AbstractC3301y30.c(context, z3);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            q7.c(4, null);
                            z2 = false;
                        }
                        if (fileInputStreamB != null) {
                            try {
                                if (!Arrays.equals(bArr, AbstractC3021v9.y(fileInputStreamB, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c3073vmArrB = U9.B(fileInputStreamB, AbstractC3021v9.y(fileInputStreamB, 4), (String) q7.f);
                                try {
                                    fileInputStreamB.close();
                                } catch (IOException e2) {
                                    interfaceC2719s30.g(7, e2);
                                }
                                q7.g = c3073vmArrB;
                            } catch (IOException e3) {
                                i = 7;
                                interfaceC2719s30.g(7, e3);
                                try {
                                    fileInputStreamB.close();
                                } catch (IOException e4) {
                                    iOException = e4;
                                    interfaceC2719s30.g(i, iOException);
                                    c3073vmArrB = null;
                                    q7.g = c3073vmArrB;
                                    c3073vmArr = (C3073vm[]) q7.g;
                                    if (c3073vmArr != null) {
                                        if (i3 != 24) {
                                            try {
                                                fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamB2 == null) {
                                                    try {
                                                        if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                                        fileInputStreamB2.close();
                                                        q6 = q7;
                                                    } catch (Throwable th4) {
                                                        try {
                                                            fileInputStreamB2.close();
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            th4.addSuppressed(th5);
                                                            throw th4;
                                                        }
                                                    }
                                                } else {
                                                    if (fileInputStreamB2 != null) {
                                                        fileInputStreamB2.close();
                                                    }
                                                    q6 = null;
                                                }
                                            } catch (FileNotFoundException e5) {
                                                interfaceC2719s30.g(9, e5);
                                            } catch (IOException e6) {
                                                interfaceC2719s30.g(7, e6);
                                            } catch (IllegalStateException e7) {
                                                q7.g = null;
                                                interfaceC2719s30.g(8, e7);
                                            }
                                            if (q6 != null) {
                                                q7 = q6;
                                            }
                                        } else {
                                            fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                            if (fileInputStreamB2 == null) {
                                                if (fileInputStreamB2 != null) {
                                                    fileInputStreamB2.close();
                                                }
                                                q6 = null;
                                            } else {
                                                if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                                fileInputStreamB2.close();
                                                q6 = q7;
                                            }
                                            if (q6 != null) {
                                                q7 = q6;
                                            }
                                        }
                                    }
                                    interfaceC2719s31 = (InterfaceC2719s30) q7.c;
                                    c3073vmArr2 = (C3073vm[]) q7.g;
                                    if (c3073vmArr2 != null) {
                                        if (q7.a) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr);
                                                byteArrayOutputStream.write(bArr4);
                                                if (U9.K(byteArrayOutputStream, bArr4, c3073vmArr2)) {
                                                    q7.h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    q7.g = null;
                                                } else {
                                                    interfaceC2719s31.g(5, null);
                                                    q7.g = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e8) {
                                            interfaceC2719s31.g(7, e8);
                                        } catch (IllegalStateException e9) {
                                            interfaceC2719s31.g(8, e9);
                                        }
                                    }
                                    bArr2 = (byte[]) q7.h;
                                    if (bArr2 != null) {
                                        z2 = false;
                                    } else {
                                        try {
                                            if (q7.a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        fileOutputStream = new FileOutputStream((File) q7.e);
                                                        try {
                                                            try {
                                                                bArr3 = new byte[512];
                                                                while (true) {
                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                    if (i2 > 0) {
                                                                        fileOutputStream.write(bArr3, 0, i2);
                                                                    } else {
                                                                        try {
                                                                            q7.c(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            q7.h = null;
                                                                            q7.g = null;
                                                                            z2 = true;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    }
                                                                    th = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th.addSuppressed(th9);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            Throwable th12 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th12;
                                                            } catch (Throwable th13) {
                                                                th12.addSuppressed(th13);
                                                                throw th12;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (FileNotFoundException e10) {
                                                    e = e10;
                                                    q7.c(6, e);
                                                    q7.h = null;
                                                    q7.g = null;
                                                    z2 = false;
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    q7.c(7, e);
                                                    q7.h = null;
                                                    q7.g = null;
                                                    z2 = false;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                q7.c(6, e);
                                                q7.h = null;
                                                q7.g = null;
                                                z2 = false;
                                            } catch (IOException e13) {
                                                e = e13;
                                                q7.c(7, e);
                                                q7.h = null;
                                                q7.g = null;
                                                z2 = false;
                                            }
                                        } catch (Throwable th15) {
                                            q7.h = null;
                                            q7.g = null;
                                            throw th15;
                                        }
                                    }
                                    if (z2) {
                                        u(packageInfo, filesDir);
                                    }
                                    if (z2) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    AbstractC3301y30.c(context, z3);
                                }
                                c3073vmArrB = null;
                            } catch (IllegalStateException e14) {
                                try {
                                    interfaceC2719s30.g(8, e14);
                                    try {
                                        fileInputStreamB.close();
                                    } catch (IOException e15) {
                                        iOException = e15;
                                        i = 7;
                                        interfaceC2719s30.g(i, iOException);
                                        c3073vmArrB = null;
                                        q7.g = c3073vmArrB;
                                        c3073vmArr = (C3073vm[]) q7.g;
                                        if (c3073vmArr != null) {
                                            if (i3 != 24) {
                                                fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamB2 == null) {
                                                    if (fileInputStreamB2 != null) {
                                                        fileInputStreamB2.close();
                                                    }
                                                    q6 = null;
                                                } else {
                                                    if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                                    fileInputStreamB2.close();
                                                    q6 = q7;
                                                }
                                                if (q6 != null) {
                                                    q7 = q6;
                                                }
                                            } else {
                                                fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamB2 == null) {
                                                    if (fileInputStreamB2 != null) {
                                                        fileInputStreamB2.close();
                                                    }
                                                    q6 = null;
                                                } else {
                                                    if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                                    fileInputStreamB2.close();
                                                    q6 = q7;
                                                }
                                                if (q6 != null) {
                                                    q7 = q6;
                                                }
                                            }
                                        }
                                        interfaceC2719s31 = (InterfaceC2719s30) q7.c;
                                        c3073vmArr2 = (C3073vm[]) q7.g;
                                        if (c3073vmArr2 != null) {
                                            if (q7.a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (U9.K(byteArrayOutputStream, bArr4, c3073vmArr2)) {
                                                interfaceC2719s31.g(5, null);
                                                q7.g = null;
                                                byteArrayOutputStream.close();
                                            } else {
                                                q7.h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                q7.g = null;
                                            }
                                        }
                                        bArr2 = (byte[]) q7.h;
                                        if (bArr2 != null) {
                                            if (q7.a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            fileOutputStream = new FileOutputStream((File) q7.e);
                                            bArr3 = new byte[512];
                                            while (true) {
                                                i2 = byteArrayInputStream.read(bArr3);
                                                if (i2 > 0) {
                                                    fileOutputStream.write(bArr3, 0, i2);
                                                } else {
                                                    q7.c(1, null);
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    q7.h = null;
                                                    q7.g = null;
                                                    z2 = true;
                                                }
                                                th = th;
                                                fileOutputStream.close();
                                                throw th;
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                            u(packageInfo, filesDir);
                                        }
                                        if (z2) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        AbstractC3301y30.c(context, z3);
                                    }
                                    c3073vmArrB = null;
                                } catch (Throwable th16) {
                                    th = th16;
                                    Throwable th17 = th;
                                    try {
                                        fileInputStreamB.close();
                                        throw th17;
                                    } catch (IOException e16) {
                                        interfaceC2719s30.g(7, e16);
                                        throw th17;
                                    }
                                }
                            }
                        }
                        c3073vmArr = (C3073vm[]) q7.g;
                        if (c3073vmArr != null && (i3 = Build.VERSION.SDK_INT) >= 24 && i3 <= 34) {
                            if (i3 != 24 || i3 == 25) {
                                fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                if (fileInputStreamB2 == null) {
                                    if (fileInputStreamB2 != null) {
                                        fileInputStreamB2.close();
                                    }
                                    q6 = null;
                                } else {
                                    if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                    fileInputStreamB2.close();
                                    q6 = q7;
                                }
                                if (q6 != null) {
                                    q7 = q6;
                                }
                            } else {
                                switch (i3) {
                                    case 31:
                                    case 32:
                                    case 33:
                                    case C3080vp0.H /* 34 */:
                                        fileInputStreamB2 = q7.b(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamB2 == null) {
                                            if (fileInputStreamB2 != null) {
                                                fileInputStreamB2.close();
                                            }
                                            q6 = null;
                                        } else {
                                            if (Arrays.equals(U9.f, AbstractC3021v9.y(fileInputStreamB2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            q7.g = U9.y(fileInputStreamB2, AbstractC3021v9.y(fileInputStreamB2, 4), bArr5, c3073vmArr);
                                            fileInputStreamB2.close();
                                            q6 = q7;
                                        }
                                        if (q6 != null) {
                                            q7 = q6;
                                            break;
                                        }
                                    default:
                                        interfaceC2719s31 = (InterfaceC2719s30) q7.c;
                                        c3073vmArr2 = (C3073vm[]) q7.g;
                                        if (c3073vmArr2 != null && (bArr4 = (byte[]) q7.d) != null) {
                                            if (q7.a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (U9.K(byteArrayOutputStream, bArr4, c3073vmArr2)) {
                                                interfaceC2719s31.g(5, null);
                                                q7.g = null;
                                                byteArrayOutputStream.close();
                                            } else {
                                                q7.h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                q7.g = null;
                                            }
                                        }
                                        bArr2 = (byte[]) q7.h;
                                        if (bArr2 != null) {
                                            if (q7.a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            fileOutputStream = new FileOutputStream((File) q7.e);
                                            bArr3 = new byte[512];
                                            while (true) {
                                                i2 = byteArrayInputStream.read(bArr3);
                                                if (i2 > 0) {
                                                    fileOutputStream.write(bArr3, 0, i2);
                                                } else {
                                                    q7.c(1, null);
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    q7.h = null;
                                                    q7.g = null;
                                                    z2 = true;
                                                }
                                                th = th;
                                                fileOutputStream.close();
                                                throw th;
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                            u(packageInfo, filesDir);
                                        }
                                        if (z2) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        AbstractC3301y30.c(context, z3);
                                }
                            }
                        }
                        interfaceC2719s31 = (InterfaceC2719s30) q7.c;
                        c3073vmArr2 = (C3073vm[]) q7.g;
                        if (c3073vmArr2 != null) {
                            if (q7.a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr4);
                            if (U9.K(byteArrayOutputStream, bArr4, c3073vmArr2)) {
                                interfaceC2719s31.g(5, null);
                                q7.g = null;
                                byteArrayOutputStream.close();
                            } else {
                                q7.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                q7.g = null;
                            }
                        }
                        bArr2 = (byte[]) q7.h;
                        if (bArr2 != null) {
                            if (q7.a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            fileOutputStream = new FileOutputStream((File) q7.e);
                            bArr3 = new byte[512];
                            while (true) {
                                i2 = byteArrayInputStream.read(bArr3);
                                if (i2 > 0) {
                                    fileOutputStream.write(bArr3, 0, i2);
                                } else {
                                    q7.c(1, null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    q7.h = null;
                                    q7.g = null;
                                    z2 = true;
                                }
                                th = th;
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        z2 = false;
                        if (z2) {
                            u(packageInfo, filesDir);
                        }
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        AbstractC3301y30.c(context, z3);
                    } catch (Throwable th18) {
                        th = th18;
                    }
                    fileInputStreamB = q7.b(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e17) {
                    interfaceC2719s30.g(6, e17);
                    fileInputStreamB = null;
                } catch (IOException e18) {
                    interfaceC2719s30.g(7, e18);
                    fileInputStreamB = null;
                }
                q7.a = true;
                bArr = U9.e;
            }
            z2 = false;
            if (z2) {
                z3 = false;
            } else {
                z3 = false;
            }
            AbstractC3301y30.c(context, z3);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC2719s30.g(7, e19);
            AbstractC3301y30.c(context, false);
        }
    }

    public static void a(Throwable th, Throwable th2) {
        AbstractC1474fG.j(th, "<this>");
        AbstractC1474fG.j(th2, "exception");
        if (th != th2) {
            Integer num = ZG.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = YY.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(int i, int i2) throws C1273dA {
        GLES20.glBindTexture(i, i2);
        e();
        GLES20.glTexParameteri(i, 10240, 9729);
        e();
        GLES20.glTexParameteri(i, 10241, 9729);
        e();
        GLES20.glTexParameteri(i, 10242, 33071);
        e();
        GLES20.glTexParameteri(i, 10243, 33071);
        e();
    }

    public static final C1011ac0 c(String str, U9 u9, Zb0[] zb0Arr, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(str, "serialName");
        AbstractC1474fG.j(interfaceC0412Ey, "builder");
        if (!(!AbstractC1899jh0.O(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!AbstractC1474fG.b(u9, C2386oh0.j))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        C2863te c2863te = new C2863te(str);
        interfaceC0412Ey.b(c2863te);
        return new C1011ac0(str, u9, c2863te.b.size(), X5.Y(zb0Arr), c2863te);
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC3409z9.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void e() throws C1273dA {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new C1273dA(sb.toString());
        }
    }

    public static void f(String str, boolean z) throws C1273dA {
        if (!z) {
            throw new C1273dA(str);
        }
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a(th, th2);
            }
        }
    }

    public static final void h(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static Nr0 j(int i) {
        if (i != 0) {
            return i != 1 ? new J80() : new C3453zi();
        }
        return new J80();
    }

    public static void k(View view, InterfaceC3284xu0 interfaceC3284xu0) {
        WeakHashMap weakHashMap = It0.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        YK yk = new YK();
        yk.a = paddingStart;
        yk.b = paddingTop;
        yk.c = paddingEnd;
        yk.d = paddingBottom;
        AbstractC3185wt0.u(view, new Vm0(interfaceC3284xu0, 3, yk));
        if (view.isAttachedToWindow()) {
            AbstractC2991ut0.c(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3090vu0());
        }
    }

    public static final void l(InterfaceC1022ai interfaceC1022ai) {
        AH ah = (AH) interfaceC1022ai.q(C2691rp.v);
        if (ah != null && !ah.a()) {
            throw ((JH) ah).H();
        }
    }

    public static final int m(Cursor cursor, String str) {
        String strS;
        AbstractC1474fG.j(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                int i = -1;
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    AbstractC1474fG.i(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        String str3 = columnNames[i2];
                        int i4 = i3 + 1;
                        if (str3.length() >= str.length() + 2 && (AbstractC1899jh0.L(str3, strConcat, false) || (str3.charAt(0) == '`' && AbstractC1899jh0.L(str3, str2, false)))) {
                            i = i3;
                            break;
                        }
                        i2++;
                        i3 = i4;
                    }
                }
                columnIndex = i;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            AbstractC1474fG.i(columnNames2, "c.columnNames");
            strS = X5.S(columnNames2);
        } catch (Exception unused) {
            strS = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strS);
    }

    public static Intent n(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strP = p(activity, activity.getComponentName());
            if (strP == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strP);
            try {
                return p(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent o(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strP = p(context, componentName);
        if (strP == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strP);
        return p(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String p(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else {
            i = i2 >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static int q(C2084lc c2084lc) throws C2949uX {
        int i = c2084lc.i(4);
        if (i == 15) {
            if (c2084lc.b() >= 24) {
                return c2084lc.i(24);
            }
            throw C2949uX.a("AAC header insufficient data", null);
        }
        if (i < 13) {
            return a[i];
        }
        throw C2949uX.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static final InterfaceC2159mI r(Object obj, InterfaceC2159mI... interfaceC2159mIArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC2159mIArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC2159mIArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC2159mI.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC2159mIArr, interfaceC2159mIArr.length));
            if (objInvoke instanceof InterfaceC2159mI) {
                return (InterfaceC2159mI) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static boolean s(View view) {
        WeakHashMap weakHashMap = It0.a;
        return view.getLayoutDirection() == 1;
    }

    public static final int t(C1947k50 c1947k50, ZF zf) {
        if (zf.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + zf);
        }
        int i = zf.l;
        int i2 = zf.m;
        if (i2 < Integer.MAX_VALUE) {
            return AbstractC2045l50.m.c(i, i2 + 1);
        }
        if (i <= Integer.MIN_VALUE) {
            return AbstractC2045l50.m.b();
        }
        return AbstractC2045l50.m.c(i - 1, i2) + 1;
    }

    public static void u(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static FV v(C2084lc c2084lc, boolean z) throws C2949uX {
        int i = c2084lc.i(5);
        if (i == 31) {
            i = c2084lc.i(6) + 32;
        }
        int iQ = q(c2084lc);
        int i2 = c2084lc.i(4);
        String strN = AbstractC1674hK.n(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            iQ = q(c2084lc);
            int i3 = c2084lc.i(5);
            if (i3 == 31) {
                i3 = c2084lc.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = c2084lc.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C2949uX.c("Unsupported audio object type: " + i);
                }
            }
            if (c2084lc.h()) {
                AP.z();
            }
            if (c2084lc.h()) {
                c2084lc.s(14);
            }
            boolean zH = c2084lc.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                c2084lc.s(3);
            }
            if (zH) {
                if (i == 22) {
                    c2084lc.s(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c2084lc.s(3);
                }
                c2084lc.s(1);
            }
            switch (i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i4 = c2084lc.i(2);
                    if (i4 == 2 || i4 == 3) {
                        throw C2949uX.c("Unsupported epConfig: " + i4);
                    }
                    break;
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new FV(iQ, i5, strN);
        }
        throw C2949uX.a(null, null);
    }

    public static C3306y6 w(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!Sr0.r(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C2949uX.a("Couldn't find xmp metadata", null);
        }
        XE xe = AbstractC0985aF.m;
        M60 m60X = M60.p;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (Sr0.r(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = e;
                for (int i = 0; i < 4; i++) {
                    String strK = Sr0.k(xmlPullParserNewPullParser, strArr[i]);
                    if (strK != null) {
                        if (Integer.parseInt(strK) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f;
                        int i2 = 0;
                        while (true) {
                            if (i2 < 4) {
                                String strK2 = Sr0.k(xmlPullParserNewPullParser, strArr2[i2]);
                                if (strK2 != null) {
                                    j = Long.parseLong(strK2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i2++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = g;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 2) {
                                XE xe2 = AbstractC0985aF.m;
                                m60X = M60.p;
                                break;
                            }
                            String strK3 = Sr0.k(xmlPullParserNewPullParser, strArr3[i3]);
                            if (strK3 != null) {
                                Object[] objArr = {new C0997aR(0L, 0L, "image/jpeg"), new C0997aR(Long.parseLong(strK3), 0L, "video/mp4")};
                                AbstractC3045vW.i(2, objArr);
                                m60X = AbstractC0985aF.j(2, objArr);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                return null;
            }
            if (Sr0.r(xmlPullParserNewPullParser, "Container:Directory")) {
                m60X = x(xmlPullParserNewPullParser, "Container", "Item");
            } else if (Sr0.r(xmlPullParserNewPullParser, "GContainer:Directory")) {
                m60X = x(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!Sr0.p(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (m60X.isEmpty()) {
            return null;
        }
        return new C3306y6(j, m60X, 6);
    }

    public static M60 x(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        XE xe = AbstractC0985aF.m;
        U9.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i = 0;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (Sr0.r(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strK = Sr0.k(xmlPullParser, strConcat3);
                String strK2 = Sr0.k(xmlPullParser, strConcat4);
                String strK3 = Sr0.k(xmlPullParser, strConcat5);
                String strK4 = Sr0.k(xmlPullParser, strConcat6);
                if (strK == null || strK2 == null) {
                    return M60.p;
                }
                C0997aR c0997aR = new C0997aR(strK3 != null ? Long.parseLong(strK3) : 0L, strK4 != null ? Long.parseLong(strK4) : 0L, strK);
                int i2 = i + 1;
                if (objArrCopyOf.length < i2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, TE.e(objArrCopyOf.length, i2));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i] = c0997aR;
                    i++;
                }
                z = false;
                objArrCopyOf[i] = c0997aR;
                i++;
            }
        } while (!Sr0.p(xmlPullParser, strConcat2));
        return AbstractC0985aF.j(i, objArrCopyOf);
    }

    public static PorterDuff.Mode y(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static long z(C2562qX c2562qX, int i, int i2) {
        c2562qX.F(i);
        if (c2562qX.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = c2562qX.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i2 || (iG & 32) == 0 || c2562qX.u() < 7 || c2562qX.a() < 7 || (c2562qX.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c2562qX.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
