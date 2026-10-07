package o;

import io.sentry.android.core.C0020q;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class O70 implements InterfaceC2450pI {
    public static final C0020q j = new C0020q(50);
    public final C1813in b;
    public final InterfaceC2450pI c;
    public final InterfaceC2450pI d;
    public final int e;
    public final int f;
    public final Class g;
    public final FW h;
    public final InterfaceC2686rm0 i;

    public O70(C1813in c1813in, InterfaceC2450pI interfaceC2450pI, InterfaceC2450pI interfaceC2450pI2, int i, int i2, InterfaceC2686rm0 interfaceC2686rm0, Class cls, FW fw) {
        this.b = c1813in;
        this.c = interfaceC2450pI;
        this.d = interfaceC2450pI2;
        this.e = i;
        this.f = i2;
        this.i = interfaceC2686rm0;
        this.g = cls;
        this.h = fw;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC2450pI
    public final void a(MessageDigest messageDigest) {
        Object objI;
        C1813in c1813in = this.b;
        synchronized (c1813in) {
            C2551qM c2551qM = (C2551qM) c1813in.d;
            InterfaceC1747i20 interfaceC1747i20R = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
            if (interfaceC1747i20R == null) {
                interfaceC1747i20R = c2551qM.r();
            }
            C2454pM c2454pM = (C2454pM) interfaceC1747i20R;
            c2454pM.b = 8;
            c2454pM.c = byte[].class;
            objI = c1813in.i(c2454pM, byte[].class);
        }
        byte[] bArr = (byte[]) objI;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC2686rm0 interfaceC2686rm0 = this.i;
        if (interfaceC2686rm0 != null) {
            interfaceC2686rm0.a(messageDigest);
        }
        this.h.a(messageDigest);
        C0020q c0020q = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) c0020q.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC2450pI.a);
            c0020q.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.l(bArr);
    }

    @Override // o.InterfaceC2450pI
    public final boolean equals(Object obj) {
        if (!(obj instanceof O70)) {
            return false;
        }
        O70 o70 = (O70) obj;
        return this.f == o70.f && this.e == o70.e && Kr0.b(this.i, o70.i) && this.g.equals(o70.g) && this.c.equals(o70.c) && this.d.equals(o70.d) && this.h.equals(o70.h);
    }

    @Override // o.InterfaceC2450pI
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        InterfaceC2686rm0 interfaceC2686rm0 = this.i;
        if (interfaceC2686rm0 != null) {
            iHashCode = (iHashCode * 31) + interfaceC2686rm0.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
