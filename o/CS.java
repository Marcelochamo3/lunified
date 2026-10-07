package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class CS implements Closeable {
    public final File l;
    public final long m;
    public final File n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RandomAccessFile f198o;
    public final FileChannel p;
    public final FileLock q;

    public CS(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.l = file;
        this.n = file2;
        this.m = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f198o = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.p = channel;
                try {
                    file3.getPath();
                    this.q = channel.lock();
                    file3.getPath();
                } catch (IOException e) {
                    e = e;
                    try {
                        this.p.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    this.p.close();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    this.p.close();
                    throw e;
                }
            } catch (Error e4) {
                e = e4;
                try {
                    this.f198o.close();
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                this.f198o.close();
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            this.f198o.close();
            throw e;
        }
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, BS bs, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(AbstractC1701hf0.t("tmp-", str), ".zip", bs.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + bs.getAbsolutePath() + "\")");
                }
                bs.getPath();
                if (fileCreateTempFile.renameTo(bs)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + bs.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long f(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            uy0 uy0VarH = Ou0.h(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = uy0VarH.b;
            randomAccessFile.seek(uy0VarH.a);
            byte[] bArr = new byte[16384];
            int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (i != -1) {
                crc32.update(bArr, 0, i);
                j -= (long) i;
                if (j == 0) {
                    break;
                }
                i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void q(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            BS bs = (BS) it.next();
            editorEdit.putLong(AbstractC1674hK.n(i, "dex.crc."), bs.l);
            editorEdit.putLong("dex.time." + i, bs.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.q.release();
        this.p.close();
        this.f198o.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    public final ArrayList i(Context context, boolean z) {
        ArrayList arrayListP;
        long jLastModified;
        ArrayList arrayListL;
        File file = this.l;
        file.getPath();
        if (!this.q.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            arrayListP = p();
            jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            q(context, jLastModified, this.m, arrayListP);
            arrayListL = arrayListP;
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            long j = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if (j == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.m) {
                try {
                    arrayListL = l(context);
                } catch (IOException unused) {
                    arrayListP = p();
                    long jLastModified3 = file.lastModified();
                    if (jLastModified3 == -1) {
                        jLastModified3--;
                    }
                    q(context, jLastModified3, this.m, arrayListP);
                    arrayListL = arrayListP;
                }
            } else {
                arrayListP = p();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
                q(context, jLastModified, this.m, arrayListP);
            }
            arrayListL = arrayListP;
        }
        arrayListL.size();
        return arrayListL;
    }

    public final ArrayList l(Context context) throws IOException {
        String str = this.l.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            BS bs = new BS(this.n, str + i2 + ".zip");
            if (!bs.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bs.getPath() + "'");
            }
            bs.l = f(bs);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = bs.lastModified();
            if (j2 != jLastModified || j != bs.l) {
                throw new IOException("Invalid extracted dex: " + bs + " (key \"\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + bs.l);
            }
            arrayList.add(bs);
        }
        return arrayList;
    }

    public final ArrayList p() {
        StringBuilder sb = new StringBuilder();
        File file = this.l;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        AS as = new AS();
        File file2 = this.n;
        File[] fileArrListFiles = file2.listFiles(as);
        if (fileArrListFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            int i = 2;
            sb2.append(2);
            sb2.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                BS bs = new BS(file2, string + i + ".zip");
                arrayList.add(bs);
                bs.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    a(zipFile, entry, bs, string);
                    try {
                        bs.l = f(bs);
                        z = true;
                    } catch (IOException unused) {
                        bs.getAbsolutePath();
                        z = false;
                    }
                    bs.getAbsolutePath();
                    bs.length();
                    if (!z) {
                        bs.delete();
                        if (bs.exists()) {
                            bs.getPath();
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + bs.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
