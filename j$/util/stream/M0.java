package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class M0 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0182f3.values().length];
        a = iArr;
        try {
            iArr[EnumC0182f3.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0182f3.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC0182f3.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC0182f3.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
