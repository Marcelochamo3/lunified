package o;

import java.io.File;

/* JADX INFO: renamed from: o.gN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1579gN extends AbstractC1677hN {
    public final File a;

    public C1579gN(File file) {
        AbstractC1474fG.j(file, "apk");
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1579gN) && AbstractC1474fG.b(this.a, ((C1579gN) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessDownloadingUpdate(apk=" + this.a + ")";
    }
}
