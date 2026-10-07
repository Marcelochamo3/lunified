package o;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: renamed from: o.rU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2655rU implements InterfaceC2651rQ {
    public AbstractC2462pU l;
    public boolean m;
    public int n;

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof C2559qU) {
            AbstractC2462pU abstractC2462pU = this.l;
            C2559qU c2559qU = (C2559qU) parcelable;
            int i = c2559qU.l;
            int size = abstractC2462pU.P.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = abstractC2462pU.P.getItem(i2);
                if (i == item.getItemId()) {
                    abstractC2462pU.r = i;
                    abstractC2462pU.s = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.l.getContext();
            C2368oX c2368oX = c2559qU.m;
            SparseArray sparseArray2 = new SparseArray(c2368oX.size());
            for (int i3 = 0; i3 < c2368oX.size(); i3++) {
                int iKeyAt = c2368oX.keyAt(i3);
                K7 k7 = (K7) c2368oX.valueAt(i3);
                sparseArray2.put(iKeyAt, k7 != null ? new J7(context, k7) : null);
            }
            AbstractC2462pU abstractC2462pU2 = this.l;
            abstractC2462pU2.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = abstractC2462pU2.D;
                if (i4 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (J7) sparseArray2.get(iKeyAt2));
                }
                i4++;
            }
            AbstractC2268nU[] abstractC2268nUArr = abstractC2462pU2.q;
            if (abstractC2268nUArr != null) {
                for (AbstractC2268nU abstractC2268nU : abstractC2268nUArr) {
                    J7 j7 = (J7) sparseArray.get(abstractC2268nU.getId());
                    if (j7 != null) {
                        abstractC2268nU.setBadge(j7);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        C2629r7 c2629r7;
        if (this.m) {
            return;
        }
        if (z) {
            this.l.a();
            return;
        }
        AbstractC2462pU abstractC2462pU = this.l;
        ZP zp = abstractC2462pU.P;
        if (zp == null || abstractC2462pU.q == null) {
            return;
        }
        int size = zp.f.size();
        if (size != abstractC2462pU.q.length) {
            abstractC2462pU.a();
            return;
        }
        int i = abstractC2462pU.r;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = abstractC2462pU.P.getItem(i2);
            if (item.isChecked()) {
                abstractC2462pU.r = item.getItemId();
                abstractC2462pU.s = i2;
            }
        }
        if (i != abstractC2462pU.r && (c2629r7 = abstractC2462pU.l) != null) {
            Gm0.a(abstractC2462pU, c2629r7);
        }
        int i3 = abstractC2462pU.p;
        boolean z2 = i3 != -1 ? i3 == 0 : abstractC2462pU.P.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            abstractC2462pU.O.m = true;
            abstractC2462pU.q[i4].setLabelVisibilityMode(abstractC2462pU.p);
            abstractC2462pU.q[i4].setShifting(z2);
            abstractC2462pU.q[i4].a((C1386eQ) abstractC2462pU.P.getItem(i4));
            abstractC2462pU.O.m = false;
        }
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return this.n;
    }

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
        this.l.P = zp;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        C2559qU c2559qU = new C2559qU();
        c2559qU.l = this.l.getSelectedItemId();
        SparseArray<J7> badgeDrawables = this.l.getBadgeDrawables();
        C2368oX c2368oX = new C2368oX();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            J7 j7ValueAt = badgeDrawables.valueAt(i);
            c2368oX.put(iKeyAt, j7ValueAt != null ? j7ValueAt.p.a : null);
        }
        c2559qU.m = c2368oX;
        return c2559qU;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
    }
}
