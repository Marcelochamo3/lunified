package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");

    public static synchronized String a(Context context) {
        try {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String string = UUID.randomUUID().toString();
                            fileOutputStream.write(string.getBytes(b));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = string;
                            return string;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, b);
                        randomAccessFile.close();
                        a = str;
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    throw new RuntimeException(th5);
                }
            }
            return a;
        } catch (Throwable th6) {
            throw th6;
        }
    }
}
