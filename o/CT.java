package o;

/* JADX INFO: loaded from: classes.dex */
public final class CT {
    public final AbstractC1976kU a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public CT(AbstractC1976kU abstractC1976kU, boolean z, Object obj, boolean z2) {
        if (!abstractC1976kU.a && z) {
            throw new IllegalArgumentException(abstractC1976kU.b().concat(" does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC1976kU.b() + " has null value but is not nullable.").toString());
        }
        this.a = abstractC1976kU;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1474fG.b(CT.class, obj.getClass())) {
            return false;
        }
        CT ct = (CT) obj;
        if (this.b != ct.b || this.c != ct.c || !AbstractC1474fG.b(this.a, ct.a)) {
            return false;
        }
        Object obj2 = ct.d;
        Object obj3 = this.d;
        if (obj3 != null) {
            return AbstractC1474fG.b(obj3, obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CT.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
