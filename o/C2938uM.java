package o;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.uM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2938uM implements InterfaceC0654Oh {
    public final /* synthetic */ int l;
    public final LinkedHashMap m;

    public C2938uM(int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = new LinkedHashMap();
                break;
            case 2:
                this.m = new LinkedHashMap();
                break;
            case 3:
                this.m = new LinkedHashMap();
                break;
            default:
                this.m = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public void a(C1458f5... c1458f5Arr) {
        AbstractC1474fG.j(c1458f5Arr, "migrations");
        for (C1458f5 c1458f5 : c1458f5Arr) {
            int i = c1458f5.a;
            LinkedHashMap linkedHashMap = this.m;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i2 = c1458f5.b;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                c1458f5.toString();
            }
            treeMap2.put(Integer.valueOf(i2), c1458f5);
        }
    }

    @Override // o.InterfaceC0654Oh
    public void c(C2446pE c2446pE, List list) {
        switch (this.l) {
            case 1:
                AbstractC1474fG.j(c2446pE, "url");
                LinkedHashMap linkedHashMap = this.m;
                String str = c2446pE.d;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                List list2 = (List) arrayList;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0628Nh c0628Nh = (C0628Nh) it.next();
                    AbstractC1406ef.S(list2, new C1280dH(c0628Nh, 1));
                    list2.add(c0628Nh);
                }
                break;
            default:
                AbstractC1474fG.j(c2446pE, "url");
                LinkedHashMap linkedHashMap2 = this.m;
                String str2 = c2446pE.d;
                Object arrayList2 = linkedHashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(str2, arrayList2);
                }
                List list3 = (List) arrayList2;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C0628Nh c0628Nh2 = (C0628Nh) it2.next();
                    AbstractC1406ef.S(list3, new C1280dH(c0628Nh2, 2));
                    list3.add(c0628Nh2);
                }
                break;
        }
    }

    @Override // o.InterfaceC0654Oh
    public List h(C2446pE c2446pE) {
        switch (this.l) {
            case 1:
                AbstractC1474fG.j(c2446pE, "url");
                List list = (List) this.m.get(c2446pE.d);
                if (list == null) {
                    return C1233cq.l;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((C0628Nh) obj).a(c2446pE)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                AbstractC1474fG.j(c2446pE, "url");
                List list2 = (List) this.m.get(c2446pE.d);
                if (list2 == null) {
                    return C1233cq.l;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((C0628Nh) obj2).a(c2446pE)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }
}
