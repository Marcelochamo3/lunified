package o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class P30 {
    public static final /* synthetic */ P30 a = new P30();
    public static final List b;
    public static final Set c;

    static {
        QW qw = QW.b;
        C1590gY c1590gY = C1590gY.b;
        QX qx = QX.b;
        C0954Zv c0954Zv = C0954Zv.b;
        C20 c20 = C20.b;
        C0650Od c0650Od = C0650Od.b;
        C2933uH c2933uH = C2933uH.b;
        C0441Gb c0441Gb = C0441Gb.b;
        C2838tJ c2838tJ = C2838tJ.INSTANCE;
        JI ji = JI.b;
        b = AbstractC0937Ze.K(C2525q3.b, C1816io0.b, Lx0.b, C2379oe.b, qw, c1590gY, qx, c0954Zv, c20, c0650Od, c2933uH, c0441Gb, c2838tJ, ZI.b, C1603gf0.b, C1424eo.b, H5.b, ji);
        c = Lc0.T(c2838tJ, c0650Od, qx, c1590gY, ji, c20, c0954Zv, c0441Gb, c0954Zv, c2933uH, qw);
    }

    public static ArrayList a() {
        LinkedHashSet linkedHashSetA = AbstractC1459f50.A();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (linkedHashSetA.contains(((Q30) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
