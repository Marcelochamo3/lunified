package o;

import java.io.File;

/* JADX INFO: renamed from: o.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823Uu extends AbstractC0901Xu {
    public boolean b;

    @Override // o.AbstractC0901Xu
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
