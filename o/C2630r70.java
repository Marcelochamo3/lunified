package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.r70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2630r70 extends AbstractC2050l8 {
    public final Context L;
    public final ComponentCallbacks2C3406z70 M;
    public final Class N;
    public final C1566gA O;
    public C2323nz P;
    public Object Q;
    public ArrayList R;
    public C2630r70 S;
    public C2630r70 T;
    public Float U;
    public final boolean V = true;
    public boolean W;
    public boolean X;

    static {
    }

    public C2630r70(com.bumptech.glide.a aVar, ComponentCallbacks2C3406z70 componentCallbacks2C3406z70, Class cls, Context context) {
        B70 b70;
        this.M = componentCallbacks2C3406z70;
        this.N = cls;
        this.L = context;
        Map map = componentCallbacks2C3406z70.l.f34o.f;
        C2323nz c2323nz = (C2323nz) map.get(cls);
        if (c2323nz == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c2323nz = (C2323nz) entry.getValue();
                }
            }
        }
        this.P = c2323nz == null ? C1566gA.k : c2323nz;
        this.O = aVar.f34o;
        Iterator it = componentCallbacks2C3406z70.t.iterator();
        while (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            C();
        }
        synchronized (componentCallbacks2C3406z70) {
            b70 = componentCallbacks2C3406z70.u;
        }
        b(b70);
    }

    public final C2630r70 C() {
        if (this.G) {
            return clone().C();
        }
        t();
        return this;
    }

    @Override // o.AbstractC2050l8
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C2630r70 b(AbstractC2050l8 abstractC2050l8) {
        AbstractC3045vW.j(abstractC2050l8);
        return (C2630r70) super.b(abstractC2050l8);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InterfaceC2049l70 E(int i, int i2, Object obj, AbstractC2050l8 abstractC2050l8, C2323nz c2323nz, EnumC1651h30 enumC1651h30, InterfaceC2727s70 interfaceC2727s70, InterfaceC2872ti0 interfaceC2872ti0) {
        C0715Qq c0715Qq;
        InterfaceC2727s70 c0715Qq2;
        InterfaceC2049l70 interfaceC2049l70K;
        int i3;
        int i4;
        int i5;
        if (this.T != null) {
            c0715Qq2 = new C0715Qq(obj, interfaceC2727s70);
            c0715Qq = c0715Qq2;
        } else {
            c0715Qq = 0;
            c0715Qq2 = interfaceC2727s70;
        }
        C2630r70 c2630r70 = this.S;
        if (c2630r70 != null) {
            if (this.X) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C2323nz c2323nz2 = c2630r70.V ? c2323nz : c2630r70.P;
            EnumC1651h30 enumC1651h30G = AbstractC2050l8.n(c2630r70.l, 8) ? this.S.f891o : G(enumC1651h30);
            C2630r70 c2630r71 = this.S;
            int i6 = c2630r71.v;
            int i7 = c2630r71.u;
            if (Kr0.i(i, i2)) {
                C2630r70 c2630r72 = this.S;
                if (Kr0.i(c2630r72.v, c2630r72.u)) {
                    i4 = i7;
                    i5 = i6;
                } else {
                    i5 = abstractC2050l8.v;
                    i4 = abstractC2050l8.u;
                }
            } else {
                i4 = i7;
                i5 = i6;
            }
            C2099lj0 c2099lj0 = new C2099lj0(obj, c0715Qq2);
            C2099lj0 c2099lj1 = c2099lj0;
            Wd0 wd0K = K(i, i2, obj, abstractC2050l8, c2323nz, enumC1651h30, c2099lj0, interfaceC2872ti0);
            this.X = true;
            C2630r70 c2630r73 = this.S;
            InterfaceC2049l70 interfaceC2049l70E = c2630r73.E(i5, i4, obj, c2630r73, c2323nz2, enumC1651h30G, c2099lj1, interfaceC2872ti0);
            this.X = false;
            c2099lj1.c = wd0K;
            c2099lj1.d = interfaceC2049l70E;
            interfaceC2049l70K = c2099lj1;
        } else if (this.U != null) {
            C2099lj0 c2099lj2 = new C2099lj0(obj, c0715Qq2);
            Wd0 wd0K2 = K(i, i2, obj, abstractC2050l8, c2323nz, enumC1651h30, c2099lj2, interfaceC2872ti0);
            Wd0 wd0K3 = K(i, i2, obj, abstractC2050l8.clone().w(this.U.floatValue()), c2323nz, G(enumC1651h30), c2099lj2, interfaceC2872ti0);
            c2099lj2.c = wd0K2;
            c2099lj2.d = wd0K3;
            interfaceC2049l70K = c2099lj2;
        } else {
            interfaceC2049l70K = K(i, i2, obj, abstractC2050l8, c2323nz, enumC1651h30, c0715Qq2, interfaceC2872ti0);
        }
        if (c0715Qq == 0) {
            return interfaceC2049l70K;
        }
        C2630r70 c2630r74 = this.T;
        int i8 = c2630r74.v;
        int i9 = c2630r74.u;
        if (Kr0.i(i, i2)) {
            C2630r70 c2630r75 = this.T;
            if (Kr0.i(c2630r75.v, c2630r75.u)) {
                i3 = i9;
            } else {
                int i10 = abstractC2050l8.v;
                i3 = abstractC2050l8.u;
                i8 = i10;
            }
        } else {
            i3 = i9;
        }
        C2630r70 c2630r76 = this.T;
        InterfaceC2049l70 interfaceC2049l70E2 = c2630r76.E(i8, i3, obj, c2630r76, c2630r76.P, c2630r76.f891o, c0715Qq, interfaceC2872ti0);
        c0715Qq.c = interfaceC2049l70K;
        c0715Qq.d = interfaceC2049l70E2;
        return c0715Qq;
    }

    @Override // o.AbstractC2050l8
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final C2630r70 clone() {
        C2630r70 c2630r70 = (C2630r70) super.clone();
        c2630r70.P = c2630r70.P.clone();
        if (c2630r70.R != null) {
            c2630r70.R = new ArrayList(c2630r70.R);
        }
        C2630r70 c2630r71 = c2630r70.S;
        if (c2630r71 != null) {
            c2630r70.S = c2630r71.clone();
        }
        C2630r70 c2630r72 = c2630r70.T;
        if (c2630r72 != null) {
            c2630r70.T = c2630r72.clone();
        }
        return c2630r70;
    }

    public final EnumC1651h30 G(EnumC1651h30 enumC1651h30) {
        int iOrdinal = enumC1651h30.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return EnumC1651h30.l;
        }
        if (iOrdinal == 2) {
            return EnumC1651h30.m;
        }
        if (iOrdinal == 3) {
            return EnumC1651h30.n;
        }
        throw new IllegalArgumentException("unknown priority: " + this.f891o);
    }

    public final void H(ImageView imageView) {
        AbstractC2050l8 abstractC2050l8O;
        InterfaceC2872ti0 p8;
        Kr0.a();
        AbstractC3045vW.j(imageView);
        if (!AbstractC2050l8.n(this.l, C1672hI.a.g) && this.y && imageView.getScaleType() != null) {
            switch (AbstractC2437p70.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC2050l8O = clone().o(C1718ho.d, new C2762sc());
                    break;
                case 2:
                    abstractC2050l8O = clone().s(C1718ho.c, new C2859tc(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC2050l8O = clone().s(C1718ho.b, new C2122lv(), false);
                    break;
                case 6:
                    abstractC2050l8O = clone().s(C1718ho.c, new C2859tc(), false);
                    break;
                default:
                    abstractC2050l8O = this;
                    break;
            }
        } else {
            abstractC2050l8O = this;
        }
        this.O.c.getClass();
        Class cls = this.N;
        if (Bitmap.class.equals(cls)) {
            p8 = new P8(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            p8 = new P8(imageView, 1);
        }
        I(p8, abstractC2050l8O);
    }

    public final void I(InterfaceC2872ti0 interfaceC2872ti0, AbstractC2050l8 abstractC2050l8) {
        AbstractC3045vW.j(interfaceC2872ti0);
        if (!this.W) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2049l70 interfaceC2049l70E = E(abstractC2050l8.v, abstractC2050l8.u, new Object(), abstractC2050l8, this.P, abstractC2050l8.f891o, null, interfaceC2872ti0);
        InterfaceC2049l70 interfaceC2049l70E2 = interfaceC2872ti0.e();
        if (interfaceC2049l70E.g(interfaceC2049l70E2) && (abstractC2050l8.t || !interfaceC2049l70E2.k())) {
            AbstractC3045vW.k(interfaceC2049l70E2, "Argument must not be null");
            if (interfaceC2049l70E2.isRunning()) {
                return;
            }
            interfaceC2049l70E2.i();
            return;
        }
        this.M.l(interfaceC2872ti0);
        interfaceC2872ti0.c(interfaceC2049l70E);
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70 = this.M;
        synchronized (componentCallbacks2C3406z70) {
            componentCallbacks2C3406z70.q.l.add(interfaceC2872ti0);
            C1797ie0 c1797ie0 = componentCallbacks2C3406z70.f1147o;
            ((Set) c1797ie0.n).add(interfaceC2049l70E);
            if (c1797ie0.m) {
                interfaceC2049l70E.clear();
                Log.isLoggable("RequestTracker", 2);
                ((HashSet) c1797ie0.f832o).add(interfaceC2049l70E);
            } else {
                interfaceC2049l70E.i();
            }
        }
    }

    public final C2630r70 J(Object obj) {
        if (this.G) {
            return clone().J(obj);
        }
        this.Q = obj;
        this.W = true;
        t();
        return this;
    }

    public final Wd0 K(int i, int i2, Object obj, AbstractC2050l8 abstractC2050l8, C2323nz c2323nz, EnumC1651h30 enumC1651h30, InterfaceC2727s70 interfaceC2727s70, InterfaceC2872ti0 interfaceC2872ti0) {
        Object obj2 = this.Q;
        ArrayList arrayList = this.R;
        C1566gA c1566gA = this.O;
        return new Wd0(this.L, c1566gA, obj, obj2, this.N, abstractC2050l8, i, i2, enumC1651h30, interfaceC2872ti0, arrayList, interfaceC2727s70, c1566gA.g, c2323nz.l);
    }

    public final C2630r70 L() {
        if (this.G) {
            return clone().L();
        }
        this.U = Float.valueOf(0.1f);
        t();
        return this;
    }

    @Override // o.AbstractC2050l8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2630r70)) {
            return false;
        }
        C2630r70 c2630r70 = (C2630r70) obj;
        if (super.equals(c2630r70)) {
            return Objects.equals(this.N, c2630r70.N) && this.P.equals(c2630r70.P) && Objects.equals(this.Q, c2630r70.Q) && Objects.equals(this.R, c2630r70.R) && Objects.equals(this.S, c2630r70.S) && Objects.equals(this.T, c2630r70.T) && Objects.equals(this.U, c2630r70.U) && this.V == c2630r70.V && this.W == c2630r70.W;
        }
        return false;
    }

    @Override // o.AbstractC2050l8
    public final int hashCode() {
        return Kr0.g(this.W ? 1 : 0, Kr0.g(this.V ? 1 : 0, Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(Kr0.h(super.hashCode(), this.N), this.P), this.Q), this.R), this.S), this.T), this.U)));
    }
}
