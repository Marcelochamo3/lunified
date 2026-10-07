package o;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.oi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2388oi0 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public C2388oi0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        AbstractC1474fG.j(abstractSet, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final C2388oi0 a(C2903ty c2903ty, String str) {
        Map mapB;
        Fc0 fc0C;
        Fc0 fc0;
        String str2;
        int i;
        int i2;
        Throwable th;
        C2291ni0 c2291ni0;
        C2903ty c2903ty2 = c2903ty;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str3 = "`)";
        sb.append("`)");
        Cursor cursorK = c2903ty2.K(sb.toString());
        try {
            String str4 = "name";
            if (cursorK.getColumnCount() <= 0) {
                mapB = C1330dq.l;
                AbstractC3409z9.g(cursorK, null);
            } else {
                int columnIndex = cursorK.getColumnIndex("name");
                int columnIndex2 = cursorK.getColumnIndex("type");
                int columnIndex3 = cursorK.getColumnIndex("notnull");
                int columnIndex4 = cursorK.getColumnIndex("pk");
                int columnIndex5 = cursorK.getColumnIndex("dflt_value");
                C2552qN c2552qN = new C2552qN();
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(columnIndex);
                    String string2 = cursorK.getString(columnIndex2);
                    boolean z = cursorK.getInt(columnIndex3) != 0;
                    int i3 = cursorK.getInt(columnIndex4);
                    String string3 = cursorK.getString(columnIndex5);
                    AbstractC1474fG.i(string, "name");
                    AbstractC1474fG.i(string2, "type");
                    c2552qN.put(string, new C1999ki0(i3, 2, string, string2, string3, z));
                    columnIndex = columnIndex;
                }
                mapB = c2552qN.b();
                AbstractC3409z9.g(cursorK, null);
            }
            Cursor cursorK2 = c2903ty2.K("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorK2.getColumnIndex("id");
                int columnIndex7 = cursorK2.getColumnIndex("seq");
                int columnIndex8 = cursorK2.getColumnIndex("table");
                int columnIndex9 = cursorK2.getColumnIndex("on_delete");
                int columnIndex10 = cursorK2.getColumnIndex("on_update");
                int columnIndex11 = cursorK2.getColumnIndex("id");
                int columnIndex12 = cursorK2.getColumnIndex("seq");
                int columnIndex13 = cursorK2.getColumnIndex("from");
                int columnIndex14 = cursorK2.getColumnIndex("to");
                C3421zK c3421zK = new C3421zK();
                while (cursorK2.moveToNext()) {
                    String str5 = str4;
                    int i4 = cursorK2.getInt(columnIndex11);
                    int i5 = columnIndex11;
                    int i6 = cursorK2.getInt(columnIndex12);
                    int i7 = columnIndex12;
                    String string4 = cursorK2.getString(columnIndex13);
                    int i8 = columnIndex13;
                    AbstractC1474fG.i(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = cursorK2.getString(columnIndex14);
                    AbstractC1474fG.i(string5, "cursor.getString(toColumnIndex)");
                    c3421zK.add(new C2194mi0(i4, i6, string4, string5));
                    mapB = mapB;
                    str4 = str5;
                    columnIndex11 = i5;
                    columnIndex12 = i7;
                    columnIndex13 = i8;
                    columnIndex14 = columnIndex14;
                }
                Map map = mapB;
                String str6 = str4;
                List listQ0 = AbstractC0911Ye.q0(AbstractC2506pt.h(c3421zK));
                cursorK2.moveToPosition(-1);
                Fc0 fc1 = new Fc0();
                while (cursorK2.moveToNext()) {
                    if (cursorK2.getInt(columnIndex7) == 0) {
                        int i9 = cursorK2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<C2194mi0> arrayList3 = new ArrayList();
                        for (Object obj : listQ0) {
                            List list = listQ0;
                            if (((C2194mi0) obj).l == i9) {
                                arrayList3.add(obj);
                            }
                            listQ0 = list;
                        }
                        List list2 = listQ0;
                        for (C2194mi0 c2194mi0 : arrayList3) {
                            arrayList.add(c2194mi0.n);
                            arrayList2.add(c2194mi0.f918o);
                        }
                        String string6 = cursorK2.getString(columnIndex8);
                        AbstractC1474fG.i(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = cursorK2.getString(columnIndex9);
                        AbstractC1474fG.i(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = cursorK2.getString(columnIndex10);
                        AbstractC1474fG.i(string8, "cursor.getString(onUpdateColumnIndex)");
                        fc1.add(new C2097li0(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        listQ0 = list2;
                    }
                }
                Fc0 fc0C2 = AbstractC1370eA.c(fc1);
                AbstractC3409z9.g(cursorK2, null);
                Cursor cursorK3 = c2903ty2.K("PRAGMA index_list(`" + str + "`)");
                String str7 = str6;
                try {
                    int columnIndex15 = cursorK3.getColumnIndex(str7);
                    int columnIndex16 = cursorK3.getColumnIndex("origin");
                    int columnIndex17 = cursorK3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        fc0C = null;
                        AbstractC3409z9.g(cursorK3, null);
                    } else {
                        Fc0 fc2 = new Fc0();
                        while (cursorK3.moveToNext()) {
                            if (AbstractC1474fG.b("c", cursorK3.getString(columnIndex16))) {
                                String string9 = cursorK3.getString(columnIndex15);
                                boolean z2 = cursorK3.getInt(columnIndex17) == 1;
                                AbstractC1474fG.i(string9, str7);
                                Cursor cursorK4 = c2903ty2.K("PRAGMA index_xinfo(`" + string9 + str3);
                                try {
                                    int columnIndex18 = cursorK4.getColumnIndex("seqno");
                                    int columnIndex19 = cursorK4.getColumnIndex("cid");
                                    int columnIndex20 = cursorK4.getColumnIndex(str7);
                                    int columnIndex21 = cursorK4.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str2 = str3;
                                        i = columnIndex16;
                                        i2 = columnIndex17;
                                        th = null;
                                        AbstractC3409z9.g(cursorK4, null);
                                        c2291ni0 = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorK4.moveToNext()) {
                                            if (cursorK4.getInt(columnIndex19) >= 0) {
                                                int i10 = cursorK4.getInt(columnIndex18);
                                                String str9 = str3;
                                                String string10 = cursorK4.getString(columnIndex20);
                                                int i11 = columnIndex21;
                                                String str10 = cursorK4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i12 = columnIndex16;
                                                Integer numValueOf = Integer.valueOf(i10);
                                                AbstractC1474fG.i(string10, "columnName");
                                                treeMap.put(numValueOf, string10);
                                                treeMap2.put(Integer.valueOf(i10), str10);
                                                str3 = str9;
                                                columnIndex16 = i12;
                                                columnIndex21 = i11;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str2 = str3;
                                        i = columnIndex16;
                                        i2 = columnIndex17;
                                        Collection collectionValues = treeMap.values();
                                        AbstractC1474fG.i(collectionValues, "columnsMap.values");
                                        List listX0 = AbstractC0911Ye.x0(collectionValues);
                                        Collection collectionValues2 = treeMap2.values();
                                        AbstractC1474fG.i(collectionValues2, "ordersMap.values");
                                        c2291ni0 = new C2291ni0(string9, z2, listX0, AbstractC0911Ye.x0(collectionValues2));
                                        AbstractC3409z9.g(cursorK4, null);
                                        th = null;
                                    }
                                    if (c2291ni0 == null) {
                                        AbstractC3409z9.g(cursorK3, th);
                                        fc0 = null;
                                        return new C2388oi0(str, map, fc0C2, fc0);
                                    }
                                    fc2.add(c2291ni0);
                                    c2903ty2 = c2903ty;
                                    str7 = str8;
                                    columnIndex15 = columnIndex15;
                                    str3 = str2;
                                    columnIndex16 = i;
                                    columnIndex17 = i2;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        AbstractC3409z9.g(cursorK4, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        fc0C = AbstractC1370eA.c(fc2);
                        AbstractC3409z9.g(cursorK3, null);
                    }
                    fc0 = fc0C;
                    return new C2388oi0(str, map, fc0C2, fc0);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC3409z9.g(cursorK3, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    AbstractC3409z9.g(cursorK2, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC3409z9.g(cursorK, th8);
                throw th9;
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2388oi0)) {
            return false;
        }
        C2388oi0 c2388oi0 = (C2388oi0) obj;
        if (!AbstractC1474fG.b(this.a, c2388oi0.a) || !AbstractC1474fG.b(this.b, c2388oi0.b) || !AbstractC1474fG.b(this.c, c2388oi0.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = c2388oi0.d) == null) {
            return true;
        }
        return AbstractC1474fG.b(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
