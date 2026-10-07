package o;

import java.util.List;
import lombok.Generated;

/* JADX INFO: renamed from: o.i90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1761i90 extends X40 {
    private EnumC1887jb0 p;
    private C2848tT q;

    public C1761i90() {
        this.p = EnumC1887jb0.UNCHECKED;
    }

    @Override // o.X40
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1761i90)) {
            return false;
        }
        C1761i90 c1761i90 = (C1761i90) obj;
        if (!c1761i90.h(this) || !super.equals(obj)) {
            return false;
        }
        EnumC1887jb0 enumC1887jb0U = u();
        EnumC1887jb0 enumC1887jb0U2 = c1761i90.u();
        if (enumC1887jb0U != null ? !enumC1887jb0U.equals(enumC1887jb0U2) : enumC1887jb0U2 != null) {
            return false;
        }
        C2848tT c2848tT = this.q;
        C2848tT c2848tT2 = c1761i90.q;
        return c2848tT != null ? c2848tT.equals(c2848tT2) : c2848tT2 == null;
    }

    @Override // o.X40
    @Generated
    public boolean h(Object obj) {
        return obj instanceof C1761i90;
    }

    @Override // o.X40
    @Generated
    public int hashCode() {
        int iHashCode = super.hashCode();
        EnumC1887jb0 enumC1887jb0U = u();
        int iHashCode2 = (iHashCode * 59) + (enumC1887jb0U == null ? 43 : enumC1887jb0U.hashCode());
        C2848tT c2848tT = this.q;
        return (iHashCode2 * 59) + (c2848tT != null ? c2848tT.hashCode() : 43);
    }

    @Override // o.X40
    public C2848tT o() {
        C2848tT c2848tT = this.q;
        return c2848tT == null ? super.o() : c2848tT;
    }

    public EnumC1887jb0 u() {
        return this.p;
    }

    public C2848tT v() {
        List<W40> listS = s();
        if (listS.isEmpty()) {
            return null;
        }
        return listS.get(0).a0();
    }

    public void w(C2848tT c2848tT) {
        this.q = c2848tT;
    }

    public void x(EnumC1887jb0 enumC1887jb0) {
        this.p = enumC1887jb0;
    }

    public C1761i90(H50 h50) {
        super(h50);
        this.p = EnumC1887jb0.UNCHECKED;
    }

    public C1761i90(X40 x40) {
        super(x40);
        this.p = EnumC1887jb0.UNCHECKED;
    }

    public C1761i90(C1761i90 c1761i90) {
        super(c1761i90);
        this.p = c1761i90.p;
        this.q = c1761i90.q;
    }
}
