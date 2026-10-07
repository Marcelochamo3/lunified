package o;

import java.io.File;

/* JADX INFO: renamed from: o.ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1438ev extends AP {
    public static void B(File file) {
        C0875Wu c0875Wu = new C0875Wu(new C0927Yu(file));
        while (true) {
            boolean z = true;
            while (c0875Wu.hasNext()) {
                File file2 = (File) c0875Wu.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return;
        }
    }
}
