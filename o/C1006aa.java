package o;

/* JADX INFO: renamed from: o.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1006aa {
    public final /* synthetic */ int a;

    public final int a(Object obj) {
        switch (this.a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    public final Object d(int i) {
        switch (this.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }
}
