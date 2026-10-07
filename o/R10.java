package o;

import android.database.Cursor;
import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.models.Video$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R10 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Z10 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R10(Z10 z10, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = z10;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((R10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new R10(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        String str;
        Object next;
        String str2;
        Object next2;
        Object next3;
        Object next4;
        Jp0.O(obj);
        Z10 z10 = this.m;
        Video$Type video$Type = z10.b;
        if (!(video$Type instanceof Hs0)) {
            return null;
        }
        AppDatabase appDatabase = z10.d;
        Hs0 hs0 = (Hs0) video$Type;
        C0456Gq c0456GqF = appDatabase.o().f(hs0.l);
        if (c0456GqF == null) {
            return null;
        }
        Ma0 ma0 = c0456GqF.f;
        if (ma0 == null || (str = ma0.a) == null) {
            return null;
        }
        C2303no0 c2303no0R = appDatabase.r();
        Gs0 gs0 = hs0.p;
        C2109lo0 c2109lo0F = c2303no0R.f(gs0.l);
        if (c2109lo0F == null) {
            c2109lo0F = new C2109lo0(gs0.l, gs0.m, null, null, null, null, null, null, gs0.n, gs0.f288o, null, null, null, null, null, null, 64764);
        }
        C2109lo0 c2109lo0 = c2109lo0F;
        Ma0 ma0X = appDatabase.q().x(str);
        if (ma0X == null) {
            Fs0 fs0 = hs0.q;
            ma0X = new Ma0(str, fs0.l, fs0.m, null, c2109lo0, null, 40);
        }
        Iterator it = appDatabase.o().i(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0456Gq) next).b != c0456GqF.b + 1);
        C0456Gq c0456Gq = (C0456Gq) next;
        if (c0456Gq != null) {
            c0456Gq.e = c2109lo0;
            c0456Gq.f = ma0X;
            return c0456Gq;
        }
        C2109lo0 c2109lo1 = c0456GqF.e;
        if (c2109lo1 == null || (str2 = c2109lo1.a) == null) {
            return null;
        }
        Na0 na0Q = appDatabase.q();
        na0Q.getClass();
        G80 g80A = G80.a(1, "SELECT * FROM seasons WHERE tvShow = ? ORDER BY number");
        g80A.o(1, str2);
        F80 f80 = (F80) na0Q.m;
        f80.b();
        Cursor cursorW = U9.w(f80, g80A);
        try {
            int iM = AbstractC3409z9.m(cursorW, "id");
            int iM2 = AbstractC3409z9.m(cursorW, "number");
            int iM3 = AbstractC3409z9.m(cursorW, "title");
            int iM4 = AbstractC3409z9.m(cursorW, "poster");
            int iM5 = AbstractC3409z9.m(cursorW, "tvShow");
            ArrayList arrayList = new ArrayList(cursorW.getCount());
            while (cursorW.moveToNext()) {
                Ma0 ma1 = new Ma0();
                String string = cursorW.getString(iM);
                AbstractC1474fG.j(string, "<set-?>");
                ma1.a = string;
                ma1.b = cursorW.getInt(iM2);
                ma1.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                ma1.d = cursorW.isNull(iM4) ? null : cursorW.getString(iM4);
                String string2 = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                ((C0519Jb) na0Q.f414o).getClass();
                ma1.e = C0519Jb.L(string2);
                arrayList.add(ma1);
            }
            cursorW.close();
            g80A.l();
            List listR0 = AbstractC0911Ye.r0(arrayList, new N2(28));
            Iterator it2 = listR0.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!AbstractC1474fG.b(((Ma0) next2).a, str));
            Ma0 ma2 = (Ma0) next2;
            if (ma2 == null) {
                return null;
            }
            Iterator it3 = listR0.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (((Ma0) next3).b != ma2.b + 1);
            Ma0 ma3 = (Ma0) next3;
            if (ma3 == null) {
                return null;
            }
            Iterator it4 = appDatabase.o().i(ma3.a).iterator();
            if (it4.hasNext()) {
                next4 = it4.next();
                if (it4.hasNext()) {
                    int i = ((C0456Gq) next4).b;
                    do {
                        Object next5 = it4.next();
                        int i2 = ((C0456Gq) next5).b;
                        if (i > i2) {
                            next4 = next5;
                            i = i2;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next4 = null;
            }
            C0456Gq c0456Gq2 = (C0456Gq) next4;
            if (c0456Gq2 == null) {
                return null;
            }
            c0456Gq2.e = c2109lo0;
            c0456Gq2.f = ma3;
            return c0456Gq2;
        } catch (Throwable th) {
            cursorW.close();
            g80A.l();
            throw th;
        }
    }
}
