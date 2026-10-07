package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L60 {
    public final C2994uv a;
    public final C2112lq b;
    public final C2994uv c;
    public final C2112lq d;
    public final C2292nj e;
    public final C2112lq f;
    public final C2112lq g;
    public final C2994uv h = new C2994uv(15);
    public final C1186cL i = new C1186cL();
    public final Na0 j;

    public L60() {
        Na0 na0 = new Na0(new C2136m20(20), new C0519Jb(20), new C0622Nb(20));
        this.j = na0;
        this.a = new C2994uv(na0);
        this.b = new C2112lq(0);
        this.c = new C2994uv(23);
        this.d = new C2112lq(4);
        this.e = new C2292nj(0);
        this.f = new C2112lq(5);
        this.g = new C2112lq(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C2994uv c2994uv = this.c;
        synchronized (c2994uv) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c2994uv.m);
                ((ArrayList) c2994uv.m).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c2994uv.m).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c2994uv.m).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, RQ rq) {
        C2994uv c2994uv = this.a;
        synchronized (c2994uv) {
            ((C1583gR) c2994uv.m).c(cls, cls2, rq);
            ((C2292nj) c2994uv.n).a.clear();
        }
    }

    public final void b(Class cls, InterfaceC1916jq interfaceC1916jq) {
        C2112lq c2112lq = this.b;
        synchronized (c2112lq) {
            c2112lq.m.add(new C2014kq(cls, interfaceC1916jq));
        }
    }

    public final void c(Class cls, T70 t70) {
        C2112lq c2112lq = this.d;
        synchronized (c2112lq) {
            c2112lq.m.add(new U70(cls, t70));
        }
    }

    public final void d(String str, Class cls, Class cls2, Q70 q70) {
        C2994uv c2994uv = this.c;
        synchronized (c2994uv) {
            c2994uv.Y(str).add(new R70(cls, cls2, q70));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.c.a0(cls, cls2)) {
            for (Class cls5 : this.f.k(cls4, cls3)) {
                C2994uv c2994uv = this.c;
                synchronized (c2994uv) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c2994uv.m).iterator();
                    while (it.hasNext()) {
                        List<R70> list = (List) ((HashMap) c2994uv.n).get((String) it.next());
                        if (list != null) {
                            for (R70 r70 : list) {
                                if (r70.a.isAssignableFrom(cls) && cls4.isAssignableFrom(r70.b)) {
                                    arrayList.add(r70.c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C0527Jj(cls, cls4, cls5, arrayList, this.f.j(cls4, cls5), this.j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        C2112lq c2112lq = this.g;
        synchronized (c2112lq) {
            arrayList = c2112lq.m;
        }
        if (arrayList.isEmpty()) {
            throw new K60("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        C2994uv c2994uv = this.a;
        c2994uv.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c2994uv) {
            SQ sq = (SQ) ((C2292nj) c2994uv.n).a.get(cls);
            listUnmodifiableList = sq == null ? null : sq.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C1583gR) c2994uv.m).j(cls));
                if (((SQ) ((C2292nj) c2994uv.n).a.put(cls, new SQ(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new K60("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            QQ qq = (QQ) listUnmodifiableList.get(i);
            if (qq.a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(qq);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new K60("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final InterfaceC2195mj h(Object obj) {
        InterfaceC2195mj interfaceC2195mjA;
        C2292nj c2292nj = this.e;
        synchronized (c2292nj) {
            try {
                AbstractC3045vW.j(obj);
                InterfaceC2098lj interfaceC2098lj = (InterfaceC2098lj) c2292nj.a.get(obj.getClass());
                if (interfaceC2098lj == null) {
                    for (InterfaceC2098lj interfaceC2098lj2 : c2292nj.a.values()) {
                        if (interfaceC2098lj2.b().isAssignableFrom(obj.getClass())) {
                            interfaceC2098lj = interfaceC2098lj2;
                            break;
                        }
                    }
                }
                if (interfaceC2098lj == null) {
                    interfaceC2098lj = C2292nj.b;
                }
                interfaceC2195mjA = interfaceC2098lj.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2195mjA;
    }

    public final void i(Class cls, Class cls2, Z70 z70) {
        C2112lq c2112lq = this.f;
        synchronized (c2112lq) {
            c2112lq.m.add(new C2493pm0(cls, cls2, z70));
        }
    }

    public final void j(InterfaceC2098lj interfaceC2098lj) {
        C2292nj c2292nj = this.e;
        synchronized (c2292nj) {
            c2292nj.a.put(interfaceC2098lj.b(), interfaceC2098lj);
        }
    }

    public final void k(PE pe) {
        C2112lq c2112lq = this.g;
        synchronized (c2112lq) {
            c2112lq.m.add(pe);
        }
    }

    public final void l(RV rv) {
        C2994uv c2994uv = this.a;
        synchronized (c2994uv) {
            try {
                Iterator it = ((C1583gR) c2994uv.m).E(rv).iterator();
                while (it.hasNext()) {
                    ((RQ) it.next()).getClass();
                }
                ((C2292nj) c2994uv.n).a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
