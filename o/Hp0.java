package o;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hp0 {
    public static final InterfaceC3274xp0 A;
    public static final InterfaceC3274xp0 B;
    public static final InterfaceC3274xp0 a = new Bp0(Class.class, new Qf0(new C3411zA(13), 3));
    public static final InterfaceC3274xp0 b = new Bp0(BitSet.class, new Qf0(new C3411zA(23), 3));
    public static final C3411zA c;
    public static final InterfaceC3274xp0 d;
    public static final InterfaceC3274xp0 e;
    public static final InterfaceC3274xp0 f;
    public static final InterfaceC3274xp0 g;
    public static final InterfaceC3274xp0 h;
    public static final InterfaceC3274xp0 i;
    public static final InterfaceC3274xp0 j;
    public static final C3411zA k;
    public static final InterfaceC3274xp0 l;
    public static final C3411zA m;
    public static final C3411zA n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3411zA f310o;
    public static final InterfaceC3274xp0 p;
    public static final InterfaceC3274xp0 q;
    public static final InterfaceC3274xp0 r;
    public static final InterfaceC3274xp0 s;
    public static final InterfaceC3274xp0 t;
    public static final InterfaceC3274xp0 u;
    public static final InterfaceC3274xp0 v;
    public static final InterfaceC3274xp0 w;
    public static final InterfaceC3274xp0 x;
    public static final InterfaceC3274xp0 y;
    public static final C3411zA z;

    static {
        C3411zA c3411zA = new C3411zA(24);
        c = new C3411zA(25);
        d = new Cp0(Boolean.TYPE, Boolean.class, c3411zA);
        e = new Cp0(Byte.TYPE, Byte.class, new C3411zA(26));
        f = new Cp0(Short.TYPE, Short.class, new C3411zA(27));
        g = new Cp0(Integer.TYPE, Integer.class, new C3411zA(28));
        h = new Bp0(AtomicInteger.class, new Qf0(new Fp0(1), 3));
        i = new Bp0(AtomicBoolean.class, new Qf0(new Fp0(0), 3));
        j = new Bp0(AtomicIntegerArray.class, new Qf0(new C3411zA(3), 3));
        k = new C3411zA(4);
        l = new Cp0(Character.TYPE, Character.class, new C3411zA(7));
        C3411zA c3411zA2 = new C3411zA(8);
        m = new C3411zA(9);
        n = new C3411zA(10);
        f310o = new C3411zA(11);
        p = new Bp0(String.class, c3411zA2);
        q = new Bp0(StringBuilder.class, new C3411zA(12));
        r = new Bp0(StringBuffer.class, new C3411zA(14));
        s = new Bp0(URL.class, new C3411zA(15));
        t = new Bp0(URI.class, new C3411zA(16));
        u = new Ep0(InetAddress.class, new C3411zA(17));
        v = new Bp0(UUID.class, new C3411zA(18));
        w = new Bp0(Currency.class, new Qf0(new C3411zA(19), 3));
        x = new Dp0(new C3411zA(20));
        y = new Bp0(Locale.class, new C3411zA(21));
        C3411zA c3411zA3 = new C3411zA(22);
        z = c3411zA3;
        A = new Ep0(QH.class, c3411zA3);
        B = new C3468zp0();
    }

    public static InterfaceC3274xp0 a(Class cls, Class cls2, AbstractC3177wp0 abstractC3177wp0) {
        return new Cp0(cls, cls2, abstractC3177wp0);
    }

    public static InterfaceC3274xp0 b(Class cls, AbstractC3177wp0 abstractC3177wp0) {
        return new Bp0(cls, abstractC3177wp0);
    }

    public static InterfaceC3274xp0 c(Kp0 kp0, AbstractC3177wp0 abstractC3177wp0) {
        return new Ap0(kp0, abstractC3177wp0);
    }
}
