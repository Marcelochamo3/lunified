package o;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3192wx implements InterfaceC2901tx {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ C3289xx c;

    public /* synthetic */ C3192wx(C3289xx c3289xx, String str, int i) {
        this.a = i;
        this.c = c3289xx;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    @Override // o.InterfaceC2901tx
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Iterator it;
        int i;
        switch (this.a) {
            case 0:
                C3289xx c3289xx = this.c;
                H7 h7 = (H7) c3289xx.k.remove(this.b);
                boolean z = false;
                if (h7 != null) {
                    HashMap map = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        F7 f7 = (F7) it2.next();
                        if (f7.u) {
                            Iterator it3 = f7.a.iterator();
                            while (it3.hasNext()) {
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C0774Sx) it3.next()).b;
                                if (abstractComponentCallbacksC1247cx != null) {
                                    map.put(abstractComponentCallbacksC1247cx.p, abstractComponentCallbacksC1247cx);
                                }
                            }
                        }
                    }
                    List<String> list = h7.l;
                    HashMap map2 = new HashMap(list.size());
                    for (String str : list) {
                        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) map.get(str);
                        if (abstractComponentCallbacksC1247cx2 != null) {
                            map2.put(abstractComponentCallbacksC1247cx2.p, abstractComponentCallbacksC1247cx2);
                        } else {
                            Bundle bundleH = c3289xx.c.H(str, null);
                            if (bundleH != null) {
                                ClassLoader classLoader = c3289xx.v.p.getClassLoader();
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = ((C0644Nx) bundleH.getParcelable("state")).a(c3289xx.I());
                                abstractComponentCallbacksC1247cxA.m = bundleH;
                                if (bundleH.getBundle("savedInstanceState") == null) {
                                    abstractComponentCallbacksC1247cxA.m.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleH.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                abstractComponentCallbacksC1247cxA.U(bundle);
                                map2.put(abstractComponentCallbacksC1247cxA.p, abstractComponentCallbacksC1247cxA);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (G7 g7 : h7.m) {
                        g7.getClass();
                        F7 f8 = new F7(c3289xx);
                        g7.a(f8);
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = g7.m;
                            if (i2 < arrayList4.size()) {
                                String str2 = (String) arrayList4.get(i2);
                                if (str2 != null) {
                                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = (AbstractComponentCallbacksC1247cx) map2.get(str2);
                                    if (abstractComponentCallbacksC1247cx3 == null) {
                                        throw new IllegalStateException("Restoring FragmentTransaction " + g7.q + " failed due to missing saved state for Fragment (" + str2 + ")");
                                    }
                                    ((C0774Sx) f8.a.get(i2)).b = abstractComponentCallbacksC1247cx3;
                                }
                                i2++;
                            }
                        }
                        arrayList3.add(f8);
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        ((F7) it4.next()).a(arrayList, arrayList2);
                        z = true;
                    }
                }
                return z;
            default:
                C3289xx c3289xx2 = this.c;
                String str3 = this.b;
                int iC = c3289xx2.C(-1, str3, true);
                if (iC < 0) {
                    return false;
                }
                for (int i3 = iC; i3 < c3289xx2.d.size(); i3++) {
                    F7 f9 = (F7) c3289xx2.d.get(i3);
                    if (!f9.p) {
                        c3289xx2.f0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + f9 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i4 = iC; i4 < c3289xx2.d.size(); i4++) {
                    F7 f10 = (F7) c3289xx2.d.get(i4);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator it5 = f10.a.iterator();
                    while (it5.hasNext()) {
                        C0774Sx c0774Sx = (C0774Sx) it5.next();
                        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx4 = c0774Sx.b;
                        if (abstractComponentCallbacksC1247cx4 != null) {
                            if (c0774Sx.c) {
                                int i5 = c0774Sx.a;
                                it = it5;
                                if (i5 == 1 || i5 == 2 || i5 == 8) {
                                }
                                i = c0774Sx.a;
                                if (i != 1 || i == 2) {
                                    hashSet3.add(abstractComponentCallbacksC1247cx4);
                                }
                                it5 = it;
                            } else {
                                it = it5;
                            }
                            hashSet.add(abstractComponentCallbacksC1247cx4);
                            hashSet2.add(abstractComponentCallbacksC1247cx4);
                            i = c0774Sx.a;
                            if (i != 1) {
                                hashSet3.add(abstractComponentCallbacksC1247cx4);
                            } else {
                                hashSet3.add(abstractComponentCallbacksC1247cx4);
                            }
                            it5 = it;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbL = AbstractC1701hf0.l("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbL.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbL.append(" in ");
                        sbL.append(f10);
                        sbL.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        c3289xx2.f0(new IllegalArgumentException(sbL.toString()));
                        throw null;
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx5 = (AbstractComponentCallbacksC1247cx) arrayDeque.removeFirst();
                    if (abstractComponentCallbacksC1247cx5.O) {
                        StringBuilder sbL2 = AbstractC1701hf0.l("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                        sbL2.append(hashSet.contains(abstractComponentCallbacksC1247cx5) ? "direct reference to retained " : "retained child ");
                        sbL2.append("fragment ");
                        sbL2.append(abstractComponentCallbacksC1247cx5);
                        c3289xx2.f0(new IllegalArgumentException(sbL2.toString()));
                        throw null;
                    }
                    for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx6 : abstractComponentCallbacksC1247cx5.H.c.t()) {
                        if (abstractComponentCallbacksC1247cx6 != null) {
                            arrayDeque.addLast(abstractComponentCallbacksC1247cx6);
                        }
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(((AbstractComponentCallbacksC1247cx) it6.next()).p);
                }
                ArrayList arrayList6 = new ArrayList(c3289xx2.d.size() - iC);
                for (int i6 = iC; i6 < c3289xx2.d.size(); i6++) {
                    arrayList6.add(null);
                }
                H7 h8 = new H7(arrayList5, arrayList6);
                int i7 = 1;
                for (int size = c3289xx2.d.size() - 1; size >= iC; size--) {
                    F7 f11 = (F7) c3289xx2.d.remove(size);
                    F7 f12 = new F7(f11);
                    ArrayList arrayList7 = f12.a;
                    int size2 = arrayList7.size() - i7;
                    while (size2 >= 0) {
                        C0774Sx c0774Sx2 = (C0774Sx) arrayList7.get(size2);
                        if (c0774Sx2.c) {
                            if (c0774Sx2.a == 8) {
                                c0774Sx2.c = false;
                                arrayList7.remove(size2 - 1);
                                size2--;
                            } else {
                                int i8 = c0774Sx2.b.K;
                                c0774Sx2.a = 2;
                                c0774Sx2.c = false;
                                for (int i9 = size2 - 1; i9 >= 0; i9--) {
                                    C0774Sx c0774Sx3 = (C0774Sx) arrayList7.get(i9);
                                    if (c0774Sx3.c && c0774Sx3.b.K == i8) {
                                        arrayList7.remove(i9);
                                        size2--;
                                    }
                                }
                            }
                        }
                        size2--;
                    }
                    arrayList6.set(size - iC, new G7(f12));
                    i7 = 1;
                    f11.u = true;
                    arrayList.add(f11);
                    arrayList2.add(Boolean.TRUE);
                }
                c3289xx2.k.put(str3, h8);
                return true;
        }
    }
}
