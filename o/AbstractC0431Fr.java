package o;

import android.system.ErrnoException;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: o.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0431Fr {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        android.system.Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return android.system.Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i) {
        return android.system.Os.lseek(fileDescriptor, j, i);
    }
}
