package o;

import java.io.File;

/* JADX INFO: renamed from: o.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0901Xu {
    public final File a;

    public AbstractC0901Xu(File file) {
        AbstractC1474fG.j(file, "root");
        this.a = file;
    }

    public abstract File a();
}
