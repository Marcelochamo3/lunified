package o;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.fK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1478fK {
    public AtomicReference a;
    public final boolean b;
    public C0563Kt c;
    public TJ d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final C2771sg0 j;

    public C1478fK(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1474fG.j(interfaceC1283dK, "provider");
        this.a = new AtomicReference(null);
        this.b = true;
        this.c = new C0563Kt();
        TJ tj = TJ.m;
        this.d = tj;
        this.i = new ArrayList();
        this.e = new WeakReference(interfaceC1283dK);
        this.j = new C2771sg0(tj);
    }

    public final void a(InterfaceC1185cK interfaceC1185cK) {
        ZJ c1712hl;
        InterfaceC1283dK interfaceC1283dK;
        ArrayList arrayList = this.i;
        int i = 1;
        AbstractC1474fG.j(interfaceC1185cK, "observer");
        c("addObserver");
        TJ tj = this.d;
        TJ tj2 = TJ.l;
        if (tj != tj2) {
            tj2 = TJ.m;
        }
        C1380eK c1380eK = new C1380eK();
        HashMap map = AbstractC1772iK.a;
        boolean z = interfaceC1185cK instanceof ZJ;
        boolean z2 = interfaceC1185cK instanceof DefaultLifecycleObserver;
        if (z && z2) {
            c1712hl = new C1712hl((DefaultLifecycleObserver) interfaceC1185cK, (ZJ) interfaceC1185cK);
        } else if (z2) {
            c1712hl = new C1712hl((DefaultLifecycleObserver) interfaceC1185cK, (ZJ) null);
        } else if (z) {
            c1712hl = (ZJ) interfaceC1185cK;
        } else {
            Class<?> cls = interfaceC1185cK.getClass();
            if (AbstractC1772iK.b(cls) == 2) {
                Object obj = AbstractC1772iK.b.get(cls);
                AbstractC1474fG.g(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC1772iK.a((Constructor) list.get(0), interfaceC1185cK);
                    throw null;
                }
                int size = list.size();
                InterfaceC1740hz[] interfaceC1740hzArr = new InterfaceC1740hz[size];
                if (size > 0) {
                    AbstractC1772iK.a((Constructor) list.get(0), interfaceC1185cK);
                    throw null;
                }
                c1712hl = new I50(i, interfaceC1740hzArr);
            } else {
                c1712hl = new C1712hl(interfaceC1185cK);
            }
        }
        c1380eK.b = c1712hl;
        c1380eK.a = tj2;
        if (((C1380eK) this.c.e(interfaceC1185cK, c1380eK)) == null && (interfaceC1283dK = (InterfaceC1283dK) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            TJ tjB = b(interfaceC1185cK);
            this.f++;
            while (c1380eK.a.compareTo(tjB) < 0 && this.c.p.containsKey(interfaceC1185cK)) {
                arrayList.add(c1380eK.a);
                QJ qj = SJ.Companion;
                TJ tj3 = c1380eK.a;
                qj.getClass();
                SJ sjB = QJ.b(tj3);
                if (sjB == null) {
                    throw new IllegalStateException("no event up from " + c1380eK.a);
                }
                c1380eK.a(interfaceC1283dK, sjB);
                arrayList.remove(arrayList.size() - 1);
                tjB = b(interfaceC1185cK);
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    public final TJ b(InterfaceC1185cK interfaceC1185cK) {
        C1380eK c1380eK;
        HashMap map = this.c.p;
        C2731s90 c2731s90 = map.containsKey(interfaceC1185cK) ? ((C2731s90) map.get(interfaceC1185cK)).f1020o : null;
        TJ tj = (c2731s90 == null || (c1380eK = (C1380eK) c2731s90.m) == null) ? null : c1380eK.a;
        ArrayList arrayList = this.i;
        TJ tj2 = arrayList.isEmpty() ^ true ? (TJ) AbstractC1701hf0.c(1, arrayList) : null;
        TJ tj3 = this.d;
        AbstractC1474fG.j(tj3, "state1");
        if (tj == null || tj.compareTo(tj3) >= 0) {
            tj = tj3;
        }
        return (tj2 == null || tj2.compareTo(tj) >= 0) ? tj : tj2;
    }

    public final void c(String str) {
        if (this.b) {
            J5.F().V.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1701hf0.u("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(SJ sj) {
        AbstractC1474fG.j(sj, "event");
        c("handleLifecycleEvent");
        e(sj.a());
    }

    public final void e(TJ tj) {
        TJ tj2 = this.d;
        if (tj2 == tj) {
            return;
        }
        TJ tj3 = TJ.m;
        TJ tj4 = TJ.l;
        if (tj2 == tj3 && tj == tj4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + tj + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = tj;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == tj4) {
            this.c = new C0563Kt();
        }
    }

    public final void f(InterfaceC1185cK interfaceC1185cK) {
        AbstractC1474fG.j(interfaceC1185cK, "observer");
        c("removeObserver");
        this.c.d(interfaceC1185cK);
    }

    public final void g(TJ tj) {
        AbstractC1474fG.j(tj, "state");
        c("setCurrentState");
        e(tj);
    }

    public final void h() {
        InterfaceC1283dK interfaceC1283dK = (InterfaceC1283dK) this.e.get();
        if (interfaceC1283dK == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0563Kt c0563Kt = this.c;
            if (c0563Kt.f1071o != 0) {
                C2731s90 c2731s90 = c0563Kt.l;
                AbstractC1474fG.g(c2731s90);
                TJ tj = ((C1380eK) c2731s90.m).a;
                C2731s90 c2731s91 = this.c.m;
                AbstractC1474fG.g(c2731s91);
                TJ tj2 = ((C1380eK) c2731s91.m).a;
                if (tj == tj2 && this.d == tj2) {
                    break;
                }
                this.h = false;
                TJ tj3 = this.d;
                C2731s90 c2731s92 = this.c.l;
                AbstractC1474fG.g(c2731s92);
                if (tj3.compareTo(((C1380eK) c2731s92.m).a) < 0) {
                    C0563Kt c0563Kt2 = this.c;
                    C2634r90 c2634r90 = new C2634r90(c0563Kt2.m, c0563Kt2.l, 1);
                    c0563Kt2.n.put(c2634r90, Boolean.FALSE);
                    while (c2634r90.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) c2634r90.next();
                        AbstractC1474fG.i(entry, "next()");
                        InterfaceC1185cK interfaceC1185cK = (InterfaceC1185cK) entry.getKey();
                        C1380eK c1380eK = (C1380eK) entry.getValue();
                        while (c1380eK.a.compareTo(this.d) > 0 && !this.h && this.c.p.containsKey(interfaceC1185cK)) {
                            QJ qj = SJ.Companion;
                            TJ tj4 = c1380eK.a;
                            qj.getClass();
                            SJ sjA = QJ.a(tj4);
                            if (sjA == null) {
                                throw new IllegalStateException("no event down from " + c1380eK.a);
                            }
                            this.i.add(sjA.a());
                            c1380eK.a(interfaceC1283dK, sjA);
                            ArrayList arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C2731s90 c2731s93 = this.c.m;
                if (!this.h && c2731s93 != null && this.d.compareTo(((C1380eK) c2731s93.m).a) > 0) {
                    C0563Kt c0563Kt3 = this.c;
                    c0563Kt3.getClass();
                    C2828t90 c2828t90 = new C2828t90(c0563Kt3);
                    c0563Kt3.n.put(c2828t90, Boolean.FALSE);
                    while (c2828t90.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) c2828t90.next();
                        InterfaceC1185cK interfaceC1185cK2 = (InterfaceC1185cK) entry2.getKey();
                        C1380eK c1380eK2 = (C1380eK) entry2.getValue();
                        while (c1380eK2.a.compareTo(this.d) < 0 && !this.h && this.c.p.containsKey(interfaceC1185cK2)) {
                            this.i.add(c1380eK2.a);
                            QJ qj2 = SJ.Companion;
                            TJ tj5 = c1380eK2.a;
                            qj2.getClass();
                            SJ sjB = QJ.b(tj5);
                            if (sjB == null) {
                                throw new IllegalStateException("no event up from " + c1380eK2.a);
                            }
                            c1380eK2.a(interfaceC1283dK, sjB);
                            ArrayList arrayList2 = this.i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.f(this.d);
    }
}
