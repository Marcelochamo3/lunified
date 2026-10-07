package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class T90 extends AbstractC1074b8 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable s(int i, C2562qX c2562qX) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c2562qX.o()));
        }
        if (i == 1) {
            return Boolean.valueOf(c2562qX.u() == 1);
        }
        if (i == 2) {
            return u(c2562qX);
        }
        if (i != 3) {
            if (i == 8) {
                return t(c2562qX);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c2562qX.o()));
                c2562qX.G(2);
                return date;
            }
            int iX = c2562qX.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i2 = 0; i2 < iX; i2++) {
                Serializable serializableS = s(c2562qX.u(), c2562qX);
                if (serializableS != null) {
                    arrayList.add(serializableS);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strU = u(c2562qX);
            int iU = c2562qX.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableS2 = s(iU, c2562qX);
            if (serializableS2 != null) {
                map.put(strU, serializableS2);
            }
        }
    }

    public static HashMap t(C2562qX c2562qX) {
        int iX = c2562qX.x();
        HashMap map = new HashMap(iX);
        for (int i = 0; i < iX; i++) {
            String strU = u(c2562qX);
            Serializable serializableS = s(c2562qX.u(), c2562qX);
            if (serializableS != null) {
                map.put(strU, serializableS);
            }
        }
        return map;
    }

    public static String u(C2562qX c2562qX) {
        int iZ = c2562qX.z();
        int i = c2562qX.b;
        c2562qX.G(iZ);
        return new String(c2562qX.a, i, iZ);
    }

    public final boolean r(long j, C2562qX c2562qX) {
        if (c2562qX.u() != 2 || !"onMetaData".equals(u(c2562qX)) || c2562qX.a() == 0 || c2562qX.u() != 8) {
            return false;
        }
        HashMap mapT = t(c2562qX);
        Object obj = mapT.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapT.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
