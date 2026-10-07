package o;

/* JADX INFO: renamed from: o.Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947Zo implements Comparable {
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n = 0;

    static {
        int i = AbstractC1036ap.a;
        l = Long.MAX_VALUE;
        m = -9223372036854775805L;
    }

    public static final long a(long j) {
        int i = ((int) j) & 1;
        long j2 = m;
        long j3 = l;
        if (i == 1) {
            if (!(j == j3 || j == j2)) {
                return j >> 1;
            }
        }
        EnumC1231cp enumC1231cp = EnumC1231cp.MILLISECONDS;
        AbstractC1474fG.j(enumC1231cp, "unit");
        if (j == j3) {
            return Long.MAX_VALUE;
        }
        if (j == j2) {
            return Long.MIN_VALUE;
        }
        long j4 = j >> 1;
        EnumC1231cp enumC1231cp2 = i == 0 ? EnumC1231cp.NANOSECONDS : enumC1231cp;
        AbstractC1474fG.j(enumC1231cp2, "sourceUnit");
        return enumC1231cp.l.convert(j4, enumC1231cp2.l);
    }
}
