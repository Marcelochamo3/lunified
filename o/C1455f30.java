package o;

/* JADX INFO: renamed from: o.f30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1455f30 implements Zb0 {
    public final String a;
    public final AbstractC1357e30 b;

    public C1455f30(String str, AbstractC1357e30 abstractC1357e30) {
        this.a = str;
        this.b = abstractC1357e30;
    }

    @Override // o.Zb0
    public final String a() {
        return this.a;
    }

    @Override // o.Zb0
    public final U9 b() {
        return this.b;
    }

    @Override // o.Zb0
    public final int c() {
        return 0;
    }

    @Override // o.Zb0
    public final String d(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1455f30)) {
            return false;
        }
        C1455f30 c1455f30 = (C1455f30) obj;
        if (AbstractC1474fG.b(this.a, c1455f30.a)) {
            if (AbstractC1474fG.b(this.b, c1455f30.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.Zb0
    public final Zb0 f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o.Zb0
    public final boolean g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
