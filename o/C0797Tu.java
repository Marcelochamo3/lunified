package o;

import java.io.File;

/* JADX INFO: renamed from: o.Tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797Tu extends AbstractC0771Su {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ C0875Wu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797Tu(C0875Wu c0875Wu, File file) {
        super(file);
        AbstractC1474fG.j(file, "rootDir");
        this.f = c0875Wu;
    }

    @Override // o.AbstractC0901Xu
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        C0875Wu c0875Wu = this.f;
        if (!z && this.c == null) {
            c0875Wu.f608o.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                c0875Wu.f608o.getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null) {
            int i = this.d;
            AbstractC1474fG.g(fileArr);
            if (i < fileArr.length) {
                File[] fileArr2 = this.c;
                AbstractC1474fG.g(fileArr2);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr2[i2];
            }
        }
        if (this.b) {
            c0875Wu.f608o.getClass();
            return null;
        }
        this.b = true;
        return file;
    }
}
