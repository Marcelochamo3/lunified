package o;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Im0 extends Cm0 {
    public int Q;
    public ArrayList O = new ArrayList();
    public boolean P = true;
    public boolean R = false;
    public int S = 0;

    @Override // o.Cm0
    public final void C(View view) {
        super.C(view);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).C(view);
        }
    }

    @Override // o.Cm0
    public final void D() {
        this.H = 0L;
        int i = 0;
        Hm0 hm0 = new Hm0(this, i);
        while (i < this.O.size()) {
            Cm0 cm0 = (Cm0) this.O.get(i);
            cm0.b(hm0);
            cm0.D();
            long j = cm0.H;
            if (this.P) {
                this.H = Math.max(this.H, j);
            } else {
                long j2 = this.H;
                cm0.J = j2;
                this.H = j2 + j;
            }
            i++;
        }
    }

    @Override // o.Cm0
    public final Cm0 E(Bm0 bm0) {
        super.E(bm0);
        return this;
    }

    @Override // o.Cm0
    public final void F(View view) {
        for (int i = 0; i < this.O.size(); i++) {
            ((Cm0) this.O.get(i)).F(view);
        }
        this.q.remove(view);
    }

    @Override // o.Cm0
    public final void G(ViewGroup viewGroup) {
        super.G(viewGroup);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).G(viewGroup);
        }
    }

    @Override // o.Cm0
    public final void H() {
        if (this.O.isEmpty()) {
            P();
            q();
            return;
        }
        Hm0 hm0 = new Hm0();
        hm0.b = this;
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((Cm0) it.next()).b(hm0);
        }
        this.Q = this.O.size();
        if (this.P) {
            Iterator it2 = this.O.iterator();
            while (it2.hasNext()) {
                ((Cm0) it2.next()).H();
            }
            return;
        }
        for (int i = 1; i < this.O.size(); i++) {
            ((Cm0) this.O.get(i - 1)).b(new Hm0((Cm0) this.O.get(i), 2));
        }
        Cm0 cm0 = (Cm0) this.O.get(0);
        if (cm0 != null) {
            cm0.H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // o.Cm0
    public final void I(long j, long j2) {
        boolean z;
        int i;
        long j3 = this.H;
        if (this.t != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j3 && j2 > j3) {
                return;
            }
        }
        boolean z2 = j < j2;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i2 >= 0 && j2 < 0) || (j <= j3 && j2 > j3)) {
            this.C = false;
            B(this, C1306dd0.m, z2);
        }
        if (!this.P) {
            int size = 1;
            while (true) {
                if (size >= this.O.size()) {
                    size = this.O.size();
                    break;
                } else if (((Cm0) this.O.get(size)).J > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i3 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i3 < this.O.size()) {
                        Cm0 cm0 = (Cm0) this.O.get(i3);
                        long j4 = cm0.J;
                        z = z2;
                        i = i2;
                        long j5 = j - j4;
                        if (j5 < 0) {
                            break;
                        }
                        cm0.I(j5, j2 - j4);
                        i3++;
                        z2 = z;
                        i2 = i;
                    }
                }
            } else {
                z = z2;
                i = i2;
                while (i3 >= 0) {
                    Cm0 cm1 = (Cm0) this.O.get(i3);
                    long j6 = cm1.J;
                    long j7 = j - j6;
                    cm1.I(j7, j2 - j6);
                    if (j7 >= 0) {
                        break;
                    } else {
                        i3--;
                    }
                }
            }
            if (this.t != null) {
                if ((j > j3 || j2 > j3) && (i >= 0 || j2 < 0)) {
                    return;
                }
                if (j > j3) {
                    this.C = true;
                }
                B(this, C1306dd0.n, z);
            }
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            ((Cm0) this.O.get(i4)).I(j, j2);
        }
        z = z2;
        i = i2;
        if (this.t != null) {
            if (j > j3) {
                return;
            } else {
                return;
            }
            if (j > j3) {
                this.C = true;
            }
            B(this, C1306dd0.n, z);
        }
    }

    @Override // o.Cm0
    public final void K(UK uk) {
        this.S |= 8;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).K(uk);
        }
    }

    @Override // o.Cm0
    public final void M(C3325yL c3325yL) {
        super.M(c3325yL);
        this.S |= 4;
        if (this.O != null) {
            for (int i = 0; i < this.O.size(); i++) {
                ((Cm0) this.O.get(i)).M(c3325yL);
            }
        }
    }

    @Override // o.Cm0
    public final void N() {
        this.S |= 2;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).N();
        }
    }

    @Override // o.Cm0
    public final void O(long j) {
        this.m = j;
    }

    @Override // o.Cm0
    public final String Q(String str) {
        String strQ = super.Q(str);
        for (int i = 0; i < this.O.size(); i++) {
            StringBuilder sbS = AbstractC1674hK.s(strQ, "\n");
            sbS.append(((Cm0) this.O.get(i)).Q(str + "  "));
            strQ = sbS.toString();
        }
        return strQ;
    }

    public final void R(Cm0 cm0) {
        this.O.add(cm0);
        cm0.t = this;
        long j = this.n;
        if (j >= 0) {
            cm0.J(j);
        }
        if ((this.S & 1) != 0) {
            cm0.L(this.f202o);
        }
        if ((this.S & 2) != 0) {
            cm0.N();
        }
        if ((this.S & 4) != 0) {
            cm0.M(this.G);
        }
        if ((this.S & 8) != 0) {
            cm0.K(null);
        }
    }

    public final Cm0 S(int i) {
        if (i < 0 || i >= this.O.size()) {
            return null;
        }
        return (Cm0) this.O.get(i);
    }

    @Override // o.Cm0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void J(long j) {
        ArrayList arrayList;
        this.n = j;
        if (j < 0 || (arrayList = this.O) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).J(j);
        }
    }

    @Override // o.Cm0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L(TimeInterpolator timeInterpolator) {
        this.S |= 1;
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Cm0) this.O.get(i)).L(timeInterpolator);
            }
        }
        this.f202o = timeInterpolator;
    }

    public final void V(int i) {
        if (i == 0) {
            this.P = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(AbstractC1674hK.n(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.P = false;
        }
    }

    @Override // o.Cm0
    public final void b(Bm0 bm0) {
        super.b(bm0);
    }

    @Override // o.Cm0
    public final void c(View view) {
        for (int i = 0; i < this.O.size(); i++) {
            ((Cm0) this.O.get(i)).c(view);
        }
        this.q.add(view);
    }

    @Override // o.Cm0
    public final void cancel() {
        super.cancel();
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).cancel();
        }
    }

    @Override // o.Cm0
    public final void e(Lm0 lm0) {
        if (z(lm0.b)) {
            for (Cm0 cm0 : this.O) {
                if (cm0.z(lm0.b)) {
                    cm0.e(lm0);
                    lm0.c.add(cm0);
                }
            }
        }
    }

    @Override // o.Cm0
    public final void h(Lm0 lm0) {
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            ((Cm0) this.O.get(i)).h(lm0);
        }
    }

    @Override // o.Cm0
    public final void j(Lm0 lm0) {
        if (z(lm0.b)) {
            for (Cm0 cm0 : this.O) {
                if (cm0.z(lm0.b)) {
                    cm0.j(lm0);
                    lm0.c.add(cm0);
                }
            }
        }
    }

    @Override // o.Cm0
    /* JADX INFO: renamed from: n */
    public final Cm0 clone() {
        Im0 im0 = (Im0) super.clone();
        im0.O = new ArrayList();
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Cm0 cm0Clone = ((Cm0) this.O.get(i)).clone();
            im0.O.add(cm0Clone);
            cm0Clone.t = im0;
        }
        return im0;
    }

    @Override // o.Cm0
    public final void p(ViewGroup viewGroup, C2303no0 c2303no0, C2303no0 c2303no1, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.m;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Cm0 cm0 = (Cm0) this.O.get(i);
            if (j > 0 && (this.P || i == 0)) {
                long j2 = cm0.m;
                if (j2 > 0) {
                    cm0.O(j2 + j);
                } else {
                    cm0.O(j);
                }
            }
            cm0.p(viewGroup, c2303no0, c2303no1, arrayList, arrayList2);
        }
    }

    @Override // o.Cm0
    public final boolean w() {
        for (int i = 0; i < this.O.size(); i++) {
            if (((Cm0) this.O.get(i)).w()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.Cm0
    public final boolean x() {
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            if (!((Cm0) this.O.get(i)).x()) {
                return false;
            }
        }
        return true;
    }
}
