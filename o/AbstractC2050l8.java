package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2050l8 implements Cloneable {
    public int A;
    public boolean E;
    public Resources.Theme F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean K;
    public int l;
    public Drawable p;
    public int q;
    public Drawable r;
    public int s;
    public boolean x;
    public Drawable z;
    public float m = 1.0f;
    public C0789Tm n = C0789Tm.f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC1651h30 f891o = EnumC1651h30.n;
    public boolean t = true;
    public int u = -1;
    public int v = -1;
    public InterfaceC2450pI w = C1819iq.b;
    public boolean y = true;
    public FW B = new FW();
    public C0492Ia C = new C0492Ia(0);
    public Class D = Object.class;
    public boolean J = true;

    public static boolean n(int i, int i2) {
        return (i & i2) != 0;
    }

    public final AbstractC2050l8 A(InterfaceC2686rm0 interfaceC2686rm0, boolean z) {
        if (this.G) {
            return clone().A(interfaceC2686rm0, z);
        }
        C2593qo c2593qo = new C2593qo(interfaceC2686rm0, z);
        y(Bitmap.class, interfaceC2686rm0, z);
        y(Drawable.class, c2593qo, z);
        y(BitmapDrawable.class, c2593qo, z);
        y(C0672Oz.class, new C0724Qz(interfaceC2686rm0), z);
        t();
        return this;
    }

    public final AbstractC2050l8 B() {
        if (this.G) {
            return clone().B();
        }
        this.K = true;
        this.l |= 1048576;
        t();
        return this;
    }

    public AbstractC2050l8 b(AbstractC2050l8 abstractC2050l8) {
        if (this.G) {
            return clone().b(abstractC2050l8);
        }
        if (n(abstractC2050l8.l, 2)) {
            this.m = abstractC2050l8.m;
        }
        if (n(abstractC2050l8.l, 262144)) {
            this.H = abstractC2050l8.H;
        }
        if (n(abstractC2050l8.l, 1048576)) {
            this.K = abstractC2050l8.K;
        }
        if (n(abstractC2050l8.l, 4)) {
            this.n = abstractC2050l8.n;
        }
        if (n(abstractC2050l8.l, 8)) {
            this.f891o = abstractC2050l8.f891o;
        }
        if (n(abstractC2050l8.l, 16)) {
            this.p = abstractC2050l8.p;
            this.q = 0;
            this.l &= -33;
        }
        if (n(abstractC2050l8.l, 32)) {
            this.q = abstractC2050l8.q;
            this.p = null;
            this.l &= -17;
        }
        if (n(abstractC2050l8.l, 64)) {
            this.r = abstractC2050l8.r;
            this.s = 0;
            this.l &= -129;
        }
        if (n(abstractC2050l8.l, 128)) {
            this.s = abstractC2050l8.s;
            this.r = null;
            this.l &= -65;
        }
        if (n(abstractC2050l8.l, 256)) {
            this.t = abstractC2050l8.t;
        }
        if (n(abstractC2050l8.l, 512)) {
            this.v = abstractC2050l8.v;
            this.u = abstractC2050l8.u;
        }
        if (n(abstractC2050l8.l, 1024)) {
            this.w = abstractC2050l8.w;
        }
        if (n(abstractC2050l8.l, C1672hI.a.f)) {
            this.D = abstractC2050l8.D;
        }
        if (n(abstractC2050l8.l, C1672hI.a.e)) {
            this.z = abstractC2050l8.z;
            this.A = 0;
            this.l &= -16385;
        }
        if (n(abstractC2050l8.l, 16384)) {
            this.A = abstractC2050l8.A;
            this.z = null;
            this.l &= -8193;
        }
        if (n(abstractC2050l8.l, 32768)) {
            this.F = abstractC2050l8.F;
        }
        if (n(abstractC2050l8.l, 65536)) {
            this.y = abstractC2050l8.y;
        }
        if (n(abstractC2050l8.l, 131072)) {
            this.x = abstractC2050l8.x;
        }
        if (n(abstractC2050l8.l, C1672hI.a.g)) {
            this.C.putAll(abstractC2050l8.C);
            this.J = abstractC2050l8.J;
        }
        if (n(abstractC2050l8.l, 524288)) {
            this.I = abstractC2050l8.I;
        }
        if (!this.y) {
            this.C.clear();
            int i = this.l;
            this.x = false;
            this.l = i & (-133121);
            this.J = true;
        }
        this.l |= abstractC2050l8.l;
        this.B.b.g(abstractC2050l8.B.b);
        t();
        return this;
    }

    public final AbstractC2050l8 c() {
        return z(C1718ho.d, new C2762sc());
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC2050l8 clone() {
        try {
            AbstractC2050l8 abstractC2050l8 = (AbstractC2050l8) super.clone();
            FW fw = new FW();
            abstractC2050l8.B = fw;
            fw.b.g(this.B.b);
            C0492Ia c0492Ia = new C0492Ia(0);
            abstractC2050l8.C = c0492Ia;
            c0492Ia.putAll(this.C);
            abstractC2050l8.E = false;
            abstractC2050l8.G = false;
            return abstractC2050l8;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final AbstractC2050l8 e(Class cls) {
        if (this.G) {
            return clone().e(cls);
        }
        this.D = cls;
        this.l |= C1672hI.a.f;
        t();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2050l8) {
            return m((AbstractC2050l8) obj);
        }
        return false;
    }

    public final AbstractC2050l8 g(C0789Tm c0789Tm) {
        if (this.G) {
            return clone().g(c0789Tm);
        }
        this.n = c0789Tm;
        this.l |= 4;
        t();
        return this;
    }

    public final AbstractC2050l8 h(int i) {
        if (this.G) {
            return clone().h(i);
        }
        this.q = i;
        int i2 = this.l | 32;
        this.p = null;
        this.l = i2 & (-17);
        t();
        return this;
    }

    public int hashCode() {
        float f = this.m;
        char[] cArr = Kr0.a;
        return Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.g(this.I ? 1 : 0, Kr0.g(this.H ? 1 : 0, Kr0.g(this.y ? 1 : 0, Kr0.g(this.x ? 1 : 0, Kr0.g(this.v, Kr0.g(this.u, Kr0.g(this.t ? 1 : 0, Kr0.h(Kr0.g(this.A, Kr0.h(Kr0.g(this.s, Kr0.h(Kr0.g(this.q, Kr0.g(Float.floatToIntBits(f), 17)), this.p)), this.r)), this.z)))))))), this.n), this.f891o), this.B), this.C), this.D), this.w), this.F);
    }

    public final AbstractC2050l8 j(int i) {
        if (this.G) {
            return clone().j(i);
        }
        this.A = i;
        int i2 = this.l | 16384;
        this.z = null;
        this.l = i2 & (-8193);
        t();
        return this;
    }

    public final AbstractC2050l8 k() {
        return s(C1718ho.b, new C2122lv(), true);
    }

    public final boolean m(AbstractC2050l8 abstractC2050l8) {
        return Float.compare(abstractC2050l8.m, this.m) == 0 && this.q == abstractC2050l8.q && Kr0.b(this.p, abstractC2050l8.p) && this.s == abstractC2050l8.s && Kr0.b(this.r, abstractC2050l8.r) && this.A == abstractC2050l8.A && Kr0.b(this.z, abstractC2050l8.z) && this.t == abstractC2050l8.t && this.u == abstractC2050l8.u && this.v == abstractC2050l8.v && this.x == abstractC2050l8.x && this.y == abstractC2050l8.y && this.H == abstractC2050l8.H && this.I == abstractC2050l8.I && this.n.equals(abstractC2050l8.n) && this.f891o == abstractC2050l8.f891o && this.B.equals(abstractC2050l8.B) && this.C.equals(abstractC2050l8.C) && this.D.equals(abstractC2050l8.D) && Kr0.b(this.w, abstractC2050l8.w) && Kr0.b(this.F, abstractC2050l8.F);
    }

    public final AbstractC2050l8 o(C1718ho c1718ho, S8 s8) {
        if (this.G) {
            return clone().o(c1718ho, s8);
        }
        u(C1718ho.g, c1718ho);
        return A(s8, false);
    }

    public final AbstractC2050l8 p(int i, int i2) {
        if (this.G) {
            return clone().p(i, i2);
        }
        this.v = i;
        this.u = i2;
        this.l |= 512;
        t();
        return this;
    }

    public final AbstractC2050l8 q(int i) {
        if (this.G) {
            return clone().q(i);
        }
        this.s = i;
        int i2 = this.l | 128;
        this.r = null;
        this.l = i2 & (-65);
        t();
        return this;
    }

    public final AbstractC2050l8 r(EnumC1651h30 enumC1651h30) {
        if (this.G) {
            return clone().r(enumC1651h30);
        }
        this.f891o = enumC1651h30;
        this.l |= 8;
        t();
        return this;
    }

    public final AbstractC2050l8 s(C1718ho c1718ho, S8 s8, boolean z) {
        AbstractC2050l8 abstractC2050l8Z = z ? z(c1718ho, s8) : o(c1718ho, s8);
        abstractC2050l8Z.J = true;
        return abstractC2050l8Z;
    }

    public final void t() {
        if (this.E) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final AbstractC2050l8 u(CW cw, Object obj) {
        if (this.G) {
            return clone().u(cw, obj);
        }
        AbstractC3045vW.j(cw);
        this.B.b.put(cw, obj);
        t();
        return this;
    }

    public final AbstractC2050l8 v(AV av) {
        if (this.G) {
            return clone().v(av);
        }
        this.w = av;
        this.l |= 1024;
        t();
        return this;
    }

    public final AbstractC2050l8 w(float f) {
        if (this.G) {
            return clone().w(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.m = f;
        this.l |= 2;
        t();
        return this;
    }

    public final AbstractC2050l8 x() {
        if (this.G) {
            return clone().x();
        }
        this.t = false;
        this.l |= 256;
        t();
        return this;
    }

    public final AbstractC2050l8 y(Class cls, InterfaceC2686rm0 interfaceC2686rm0, boolean z) {
        if (this.G) {
            return clone().y(cls, interfaceC2686rm0, z);
        }
        AbstractC3045vW.j(interfaceC2686rm0);
        this.C.put(cls, interfaceC2686rm0);
        int i = this.l;
        this.y = true;
        this.l = 67584 | i;
        this.J = false;
        if (z) {
            this.l = i | 198656;
            this.x = true;
        }
        t();
        return this;
    }

    public final AbstractC2050l8 z(C1718ho c1718ho, S8 s8) {
        if (this.G) {
            return clone().z(c1718ho, s8);
        }
        u(C1718ho.g, c1718ho);
        return A(s8, true);
    }
}
