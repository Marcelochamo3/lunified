package o;

import android.content.Context;
import com.skidush.clonex.database.AppDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class GB extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ IB m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GB(IB ib, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = ib;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((GB) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new GB(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        IB ib;
        Jp0.O(obj);
        Q30.a.getClass();
        List list = P30.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Q30) obj2) != C2525q3.b) {
                arrayList.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(((Q30) obj3).getName())) {
                arrayList2.add(obj3);
            }
        }
        ArrayList<Q30> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ib = this.m;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            O9 o9 = AppDatabase.m;
            Context context = ib.b;
            AbstractC1474fG.i(context, "access$getAppContext$p(...)");
            String name = ((Q30) next).getName();
            AbstractC1474fG.j(name, "providerName");
            Context applicationContext = context.getApplicationContext();
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            if (applicationContext.getDatabasePath(lowerCase.concat(".db")).exists()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
        for (Q30 q30 : arrayList3) {
            String name2 = q30.getName();
            O9 o10 = AppDatabase.m;
            Context context2 = ib.b;
            AbstractC1474fG.i(context2, "access$getAppContext$p(...)");
            arrayList4.add(new AB(name2, o10.x(context2, q30.getName())));
        }
        return arrayList4;
    }
}
