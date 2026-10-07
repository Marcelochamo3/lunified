package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class EnumC0177e3 {
    public static final EnumC0177e3 DISTINCT;
    public static final EnumC0177e3 ORDERED;
    public static final EnumC0177e3 SHORT_CIRCUIT;
    public static final EnumC0177e3 SIZED;
    public static final EnumC0177e3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f161o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC0177e3[] v;
    private final Map a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        EnumC0172d3 enumC0172d3 = EnumC0172d3.SPLITERATOR;
        C0167c3 c0167c3C = C(enumC0172d3);
        EnumC0172d3 enumC0172d4 = EnumC0172d3.STREAM;
        c0167c3C.a(enumC0172d4);
        EnumC0172d3 enumC0172d5 = EnumC0172d3.OP;
        c0167c3C.a.put(enumC0172d5, 3);
        EnumC0177e3 enumC0177e3 = new EnumC0177e3("DISTINCT", 0, 0, c0167c3C);
        DISTINCT = enumC0177e3;
        C0167c3 c0167c3C2 = C(enumC0172d3);
        c0167c3C2.a(enumC0172d4);
        c0167c3C2.a.put(enumC0172d5, 3);
        EnumC0177e3 enumC0177e4 = new EnumC0177e3("SORTED", 1, 1, c0167c3C2);
        SORTED = enumC0177e4;
        C0167c3 c0167c3C3 = C(enumC0172d3);
        c0167c3C3.a(enumC0172d4);
        Map map = c0167c3C3.a;
        map.put(enumC0172d5, 3);
        EnumC0172d3 enumC0172d6 = EnumC0172d3.TERMINAL_OP;
        map.put(enumC0172d6, 2);
        EnumC0172d3 enumC0172d7 = EnumC0172d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC0172d7, 2);
        EnumC0177e3 enumC0177e5 = new EnumC0177e3("ORDERED", 2, 2, c0167c3C3);
        ORDERED = enumC0177e5;
        C0167c3 c0167c3C4 = C(enumC0172d3);
        c0167c3C4.a(enumC0172d4);
        c0167c3C4.a.put(enumC0172d5, 2);
        EnumC0177e3 enumC0177e6 = new EnumC0177e3("SIZED", 3, 3, c0167c3C4);
        SIZED = enumC0177e6;
        C0167c3 c0167c3C5 = C(enumC0172d5);
        c0167c3C5.a(enumC0172d6);
        EnumC0177e3 enumC0177e7 = new EnumC0177e3("SHORT_CIRCUIT", 4, 12, c0167c3C5);
        SHORT_CIRCUIT = enumC0177e7;
        v = new EnumC0177e3[]{enumC0177e3, enumC0177e4, enumC0177e5, enumC0177e6, enumC0177e7};
        f = r(enumC0172d3);
        g = r(enumC0172d4);
        h = r(enumC0172d5);
        r(enumC0172d6);
        r(enumC0172d7);
        int i2 = 0;
        for (EnumC0177e3 enumC0177e8 : values()) {
            i2 |= enumC0177e8.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC0177e3 enumC0177e9 = DISTINCT;
        m = enumC0177e9.c;
        n = enumC0177e9.d;
        EnumC0177e3 enumC0177e10 = SORTED;
        f161o = enumC0177e10.c;
        p = enumC0177e10.d;
        EnumC0177e3 enumC0177e11 = ORDERED;
        q = enumC0177e11.c;
        r = enumC0177e11.d;
        EnumC0177e3 enumC0177e12 = SIZED;
        s = enumC0177e12.c;
        t = enumC0177e12.d;
        u = SHORT_CIRCUIT.c;
    }

    private EnumC0177e3(String str, int i2, int i3, C0167c3 c0167c3) {
        super(str, i2);
        EnumC0172d3[] enumC0172d3ArrValues = EnumC0172d3.values();
        int length = enumC0172d3ArrValues.length;
        int i4 = 0;
        while (true) {
            Map map = c0167c3.a;
            if (i4 >= length) {
                this.a = map;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            j$.util.Map.EL.putIfAbsent(map, enumC0172d3ArrValues[i4], 0);
            i4++;
        }
    }

    private static C0167c3 C(EnumC0172d3 enumC0172d3) {
        C0167c3 c0167c3 = new C0167c3(new EnumMap(EnumC0172d3.class));
        c0167c3.a(enumC0172d3);
        return c0167c3;
    }

    static int E(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    static int p(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    private static int r(EnumC0172d3 enumC0172d3) {
        int iIntValue = 0;
        for (EnumC0177e3 enumC0177e3 : values()) {
            iIntValue |= ((Integer) enumC0177e3.a.get(enumC0172d3)).intValue() << enumC0177e3.b;
        }
        return iIntValue;
    }

    static int t(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static EnumC0177e3 valueOf(String str) {
        return (EnumC0177e3) Enum.valueOf(EnumC0177e3.class, str);
    }

    public static EnumC0177e3[] values() {
        return (EnumC0177e3[]) v.clone();
    }

    final boolean u(int i2) {
        return (i2 & this.e) == this.c;
    }

    final boolean x(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }
}
