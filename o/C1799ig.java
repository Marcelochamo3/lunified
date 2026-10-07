package o;

import lombok.Generated;

/* JADX INFO: renamed from: o.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1799ig {

    @Generated
    private static final CL b = DL.d(C1799ig.class);
    private static final int c = 17;
    private static final int d = 16383;
    private final b[] a = new b[17];

    /* JADX INFO: renamed from: o.ig$b */
    public static class b {
        C2848tT a;
        int b;
        b c;

        private b() {
        }
    }

    public void a(int i, C2848tT c2848tT) {
        if (i > d) {
            return;
        }
        int iHashCode = (c2848tT.hashCode() & Integer.MAX_VALUE) % 17;
        b bVar = new b();
        bVar.a = c2848tT;
        bVar.b = i;
        b[] bVarArr = this.a;
        bVar.c = bVarArr[iHashCode];
        bVarArr[iHashCode] = bVar;
        b.z(c2848tT, Integer.valueOf(i), "Adding {} at {}");
    }

    public int b(C2848tT c2848tT) {
        int i = -1;
        for (b bVar = this.a[(c2848tT.hashCode() & Integer.MAX_VALUE) % 17]; bVar != null; bVar = bVar.c) {
            if (bVar.a.equals(c2848tT)) {
                i = bVar.b;
            }
        }
        b.z(c2848tT, Integer.valueOf(i), "Looking for {}, found {}");
        return i;
    }
}
