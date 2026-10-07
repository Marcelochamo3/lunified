package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0449Gj {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public C1566gA c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public C3257xh h;
    public FW i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public InterfaceC2450pI n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC1651h30 f285o;
    public C0789Tm p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                PQ pq = (PQ) arrayListB.get(i);
                if (!arrayList.contains(pq.a)) {
                    arrayList.add(pq.a);
                }
                int i2 = 0;
                while (true) {
                    List list = pq.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add((InterfaceC2450pI) list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listG = this.c.b().g(this.d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                PQ pqB = ((QQ) listG.get(i)).b(this.d, this.e, this.f, this.i);
                if (pqB != null) {
                    arrayList.add(pqB);
                }
            }
        }
        return arrayList;
    }

    public final C1089bL c(Class cls) {
        C1089bL c1089bL;
        L60 l60B = this.c.b();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C1186cL c1186cL = l60B.i;
        C3332yS c3332yS = (C3332yS) c1186cL.b.getAndSet(null);
        if (c3332yS == null) {
            c3332yS = new C3332yS();
        }
        c3332yS.a = cls;
        c3332yS.b = cls2;
        c3332yS.c = cls3;
        synchronized (c1186cL.a) {
            c1089bL = (C1089bL) c1186cL.a.get(c3332yS);
        }
        c1186cL.b.set(c3332yS);
        l60B.i.getClass();
        if (C1186cL.c.equals(c1089bL)) {
            return null;
        }
        if (c1089bL != null) {
            return c1089bL;
        }
        ArrayList arrayListE = l60B.e(cls, cls2, cls3);
        C1089bL c1089bL2 = arrayListE.isEmpty() ? null : new C1089bL(cls, cls2, cls3, arrayListE, l60B.j);
        l60B.i.a(cls, cls2, cls3, c1089bL2);
        return c1089bL2;
    }

    public final List d() {
        List list;
        L60 l60B = this.c.b();
        Class<?> cls = this.d.getClass();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C2994uv c2994uv = l60B.h;
        C3332yS c3332yS = (C3332yS) ((AtomicReference) c2994uv.m).getAndSet(null);
        if (c3332yS == null) {
            c3332yS = new C3332yS(cls, cls2, cls3);
        } else {
            c3332yS.a = cls;
            c3332yS.b = cls2;
            c3332yS.c = cls3;
        }
        synchronized (((S5) c2994uv.n)) {
            list = (List) ((S5) c2994uv.n).get(c3332yS);
        }
        ((AtomicReference) c2994uv.m).set(c3332yS);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = l60B.a.W(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : l60B.c.a0((Class) it.next(), cls2)) {
                    if (!l60B.f.k(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            l60B.h.h0(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    public final InterfaceC1916jq e(Object obj) {
        InterfaceC1916jq interfaceC1916jq;
        C2112lq c2112lq = this.c.b().b;
        Class<?> cls = obj.getClass();
        synchronized (c2112lq) {
            Iterator it = c2112lq.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC1916jq = null;
                    break;
                }
                C2014kq c2014kq = (C2014kq) it.next();
                if (c2014kq.a.isAssignableFrom(cls)) {
                    interfaceC1916jq = c2014kq.b;
                    break;
                }
            }
        }
        if (interfaceC1916jq != null) {
            return interfaceC1916jq;
        }
        throw new K60("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final InterfaceC2686rm0 f(Class cls) {
        InterfaceC2686rm0 interfaceC2686rm0 = (InterfaceC2686rm0) this.j.get(cls);
        if (interfaceC2686rm0 == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC2686rm0 = (InterfaceC2686rm0) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC2686rm0 != null) {
            return interfaceC2686rm0;
        }
        if (!this.j.isEmpty() || !this.q) {
            return C3373yq0.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
