package o;

import java.util.Calendar;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class FB implements Comparator {
    public final /* synthetic */ int l;
    public final /* synthetic */ IB m;

    public /* synthetic */ FB(IB ib, int i) {
        this.l = i;
        this.m = ib;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long timeInMillis;
        long timeInMillis2;
        switch (this.l) {
            case 0:
                C1387eR c1387eR = (C1387eR) obj2;
                this.m.getClass();
                C2123lv0 c2123lv0 = c1387eR.s;
                long timeInMillis3 = 0;
                if (c2123lv0 != null) {
                    timeInMillis = c2123lv0.a;
                } else {
                    Calendar calendar = c1387eR.r;
                    timeInMillis = calendar != null ? calendar.getTimeInMillis() : 0L;
                }
                Long lValueOf = Long.valueOf(timeInMillis);
                C1387eR c1387eR2 = (C1387eR) obj;
                C2123lv0 c2123lv1 = c1387eR2.s;
                if (c2123lv1 != null) {
                    timeInMillis3 = c2123lv1.a;
                } else {
                    Calendar calendar2 = c1387eR2.r;
                    if (calendar2 != null) {
                        timeInMillis3 = calendar2.getTimeInMillis();
                    }
                }
                return AbstractC1376eG.j(lValueOf, Long.valueOf(timeInMillis3));
            default:
                C0456Gq c0456Gq = (C0456Gq) obj2;
                this.m.getClass();
                C2123lv0 c2123lv2 = c0456Gq.j;
                long timeInMillis4 = 0;
                if (c2123lv2 != null) {
                    timeInMillis2 = c2123lv2.a;
                } else {
                    Calendar calendar3 = c0456Gq.i;
                    timeInMillis2 = calendar3 != null ? calendar3.getTimeInMillis() : 0L;
                }
                Long lValueOf2 = Long.valueOf(timeInMillis2);
                C0456Gq c0456Gq2 = (C0456Gq) obj;
                C2123lv0 c2123lv3 = c0456Gq2.j;
                if (c2123lv3 != null) {
                    timeInMillis4 = c2123lv3.a;
                } else {
                    Calendar calendar4 = c0456Gq2.i;
                    if (calendar4 != null) {
                        timeInMillis4 = calendar4.getTimeInMillis();
                    }
                }
                return AbstractC1376eG.j(lValueOf2, Long.valueOf(timeInMillis4));
        }
    }
}
