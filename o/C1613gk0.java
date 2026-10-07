package o;

/* JADX INFO: renamed from: o.gk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1613gk0 extends AbstractC3015v6 implements Cloneable {
    public String n;

    @Override // o.AbstractC3015v6
    public final void C() {
        this.n = null;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C1613gk0 clone() {
        try {
            return (C1613gk0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.AbstractC3015v6
    public String toString() {
        return this.n;
    }
}
