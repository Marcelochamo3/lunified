package o;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875Wu extends F {
    public final ArrayDeque n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0927Yu f608o;

    public C0875Wu(C0927Yu c0927Yu) {
        this.f608o = c0927Yu;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.n = arrayDeque;
        if (((File) c0927Yu.b).isDirectory()) {
            arrayDeque.push(b((File) c0927Yu.b));
        } else {
            if (!((File) c0927Yu.b).isFile()) {
                this.l = EnumC2481pg0.n;
                return;
            }
            File file = (File) c0927Yu.b;
            AbstractC1474fG.j(file, "rootFile");
            arrayDeque.push(new C0823Uu(file));
        }
    }

    @Override // o.F
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            AbstractC0901Xu abstractC0901Xu = (AbstractC0901Xu) arrayDeque.peek();
            if (abstractC0901Xu != null) {
                File fileA = abstractC0901Xu.a();
                if (fileA != null) {
                    if (!AbstractC1474fG.b(fileA, abstractC0901Xu.a) && fileA.isDirectory()) {
                        int size = arrayDeque.size();
                        this.f608o.getClass();
                        if (size < Integer.MAX_VALUE) {
                            arrayDeque.push(b(fileA));
                        }
                    }
                    file = fileA;
                    break;
                }
                arrayDeque.pop();
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            this.l = EnumC2481pg0.n;
        } else {
            this.m = file;
            this.l = EnumC2481pg0.l;
        }
    }

    public final AbstractC0771Su b(File file) {
        int iOrdinal = ((EnumC0953Zu) this.f608o.c).ordinal();
        if (iOrdinal == 0) {
            return new C0849Vu(this, file);
        }
        if (iOrdinal == 1) {
            return new C0797Tu(this, file);
        }
        throw new C0730Rf();
    }
}
