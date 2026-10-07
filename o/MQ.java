package o;

import j$.util.Collection$EL;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
class MQ {
    static final int h = 1;
    static final int i = 2;
    static final int j = 3;
    private final String c;
    private final int d;
    private String e;
    private boolean g;
    private final HashMap<String, Integer> a = new HashMap<>();
    private final HashMap<Integer, String> b = new HashMap<>();
    private int f = Integer.MAX_VALUE;

    public MQ(String str, int i2) {
        this.c = str;
        this.d = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(int i2, Map.Entry entry) {
        return ((Integer) entry.getValue()).intValue() == i2;
    }

    private int i(String str) {
        try {
            int i2 = Integer.parseInt(str);
            if (i2 < 0 || i2 > this.f) {
                return -1;
            }
            return i2;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private String l(String str) {
        int i2 = this.d;
        if (i2 == 2) {
            return str.toUpperCase();
        }
        return i2 == 3 ? str.toLowerCase() : str;
    }

    public void b(int i2, String str) {
        e(i2);
        String strL = l(str);
        this.a.put(strL, Integer.valueOf(i2));
        this.b.put(Integer.valueOf(i2), strL);
    }

    public void c(int i2, String str) {
        e(i2);
        this.a.put(l(str), Integer.valueOf(i2));
    }

    public void d(MQ mq) {
        if (this.d != mq.d) {
            throw new IllegalArgumentException(AbstractC1701hf0.h(new StringBuilder(), mq.c, ": wordcases do not match"));
        }
        this.a.putAll(mq.a);
        this.b.putAll(mq.b);
    }

    public void e(int i2) {
        if (i2 < 0 || i2 > this.f) {
            throw new IllegalArgumentException(this.c + " " + i2 + " is out of range");
        }
    }

    public String f(int i2) {
        e(i2);
        String str = this.b.get(Integer.valueOf(i2));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i2);
        return this.e != null ? AbstractC1701hf0.h(new StringBuilder(), this.e, string) : string;
    }

    public int g(String str) {
        int i2;
        String strL = l(str);
        Integer num = this.a.get(strL);
        if (num != null) {
            return num.intValue();
        }
        String str2 = this.e;
        if (str2 != null && strL.startsWith(str2) && (i2 = i(strL.substring(this.e.length()))) >= 0) {
            return i2;
        }
        if (this.g) {
            return i(strL);
        }
        return -1;
    }

    public void j(final int i2) {
        this.b.remove(Integer.valueOf(i2));
        Collection$EL.removeIf(this.a.entrySet(), new Predicate() { // from class: o.LQ
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return MQ.h(i2, (Map.Entry) obj);
            }
        });
    }

    public void k(String str) {
        this.a.remove(l(str));
    }

    public void m(int i2) {
        this.f = i2;
    }

    public void n(boolean z) {
        this.g = z;
    }

    public void o(String str) {
        this.e = l(str);
    }
}
