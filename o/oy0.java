package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class oy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SJ.values().length];
        try {
            iArr[SJ.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SJ.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SJ.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SJ.ON_CREATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SJ.ON_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SJ.ON_PAUSE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SJ.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
