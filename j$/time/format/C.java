package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class C {
    public static final C a = new C();

    static {
        new ConcurrentHashMap(16, 2);
    }

    final int a(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        ((C) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
