package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.gC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1568gC extends AbstractC1666hC {
    public static final C1568gC l = new C1568gC("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final C0643Nw h;
    public final List i;
    public final Map j;
    public final List k;

    public C1568gC(String str, List list, List list2, List list3, List list4, List list5, List list6, C0643Nw c0643Nw, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C1470fC) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = c0643Nw;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C1372eC) list.get(i)).a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Cg0 cg0 = (Cg0) list2.get(i3);
                if (cg0.m == i && cg0.n == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC1536fv
    public final Object a(List list) {
        return new C1568gC(this.a, this.b, c(this.e, 0, list), Collections.emptyList(), c(this.f, 1, list), c(this.g, 2, list), Collections.emptyList(), this.h, this.i, this.c, this.j, this.k);
    }
}
