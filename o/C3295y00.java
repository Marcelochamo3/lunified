package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.y00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3295y00 extends T00 {
    public static void a(List list) {
        AbstractC1474fG.j(list, "openSubtitles");
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3392z00((C3336yW) it.next()));
        }
        ArrayList arrayList2 = C3392z00.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
