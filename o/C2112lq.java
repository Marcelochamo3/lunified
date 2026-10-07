package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2112lq implements InterfaceC0654Oh {
    public final /* synthetic */ int l;
    public final ArrayList m;

    public C2112lq(int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = new ArrayList(20);
                break;
            case 2:
                this.m = new ArrayList();
                break;
            case 3:
                this.m = new ArrayList();
                break;
            case 4:
                this.m = new ArrayList();
                break;
            case 5:
                this.m = new ArrayList();
                break;
            case 6:
                this.m = new ArrayList();
                break;
            case 7:
                this.m = new ArrayList();
                break;
            default:
                this.m = new ArrayList();
                break;
        }
    }

    private final List l(C2446pE c2446pE) {
        ArrayList arrayList;
        AbstractC1474fG.j(c2446pE, "url");
        synchronized (this.m) {
            AbstractC1406ef.S(this.m, C1182cH.n);
            ArrayList arrayList2 = this.m;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((C0628Nh) obj).a(c2446pE)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    private final List m(C2446pE c2446pE) {
        ArrayList arrayList;
        AbstractC1474fG.j(c2446pE, "url");
        synchronized (this.m) {
            AbstractC1406ef.S(this.m, Iu0.f333o);
            ArrayList arrayList2 = this.m;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((C0628Nh) obj).a(c2446pE)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    private final void o(C2446pE c2446pE, List list) {
        AbstractC1474fG.j(c2446pE, "url");
        synchronized (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0628Nh c0628Nh = (C0628Nh) it.next();
                AbstractC1406ef.S(this.m, new C1280dH(c0628Nh, 0));
                if (c0628Nh.c > System.currentTimeMillis()) {
                    this.m.add(c0628Nh);
                }
            }
        }
    }

    private final void p(C2446pE c2446pE, List list) {
        AbstractC1474fG.j(c2446pE, "url");
        synchronized (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0628Nh c0628Nh = (C0628Nh) it.next();
                AbstractC1406ef.S(this.m, new C1280dH(c0628Nh, 3));
                if (c0628Nh.c > System.currentTimeMillis()) {
                    this.m.add(c0628Nh);
                }
            }
        }
    }

    public void a(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        AbstractC1468fA.c(str);
        AbstractC1468fA.e(str2, str);
        d(str, str2);
    }

    public void b(String str) {
        int iD0 = AbstractC1119bh0.d0(str, ':', 1, false, 4);
        if (iD0 != -1) {
            String strSubstring = str.substring(0, iD0);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iD0 + 1);
            AbstractC1474fG.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            d(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            d("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        AbstractC1474fG.i(strSubstring3, "this as java.lang.String).substring(startIndex)");
        d("", strSubstring3);
    }

    @Override // o.InterfaceC0654Oh
    public void c(C2446pE c2446pE, List list) {
        switch (this.l) {
            case 3:
                o(c2446pE, list);
                return;
            case 6:
                p(c2446pE, list);
                return;
            default:
                AbstractC1474fG.j(c2446pE, "url");
                synchronized (this.m) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C0628Nh c0628Nh = (C0628Nh) it.next();
                        AbstractC1406ef.S(this.m, new C1280dH(c0628Nh, 4));
                        if (c0628Nh.c > System.currentTimeMillis()) {
                            this.m.add(c0628Nh);
                        }
                    }
                }
                return;
        }
    }

    public void d(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        ArrayList arrayList = this.m;
        arrayList.add(str);
        arrayList.add(AbstractC1119bh0.E0(str2).toString());
    }

    public void e(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(Mr0.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
        d(str, str2);
    }

    public C2152mB f() {
        return new C2152mB((String[]) this.m.toArray(new String[0]));
    }

    public String g(String str) {
        AbstractC1474fG.j(str, "name");
        ArrayList arrayList = this.m;
        int size = arrayList.size() - 2;
        int iN = Sr0.n(size, 0, -2);
        if (iN > size) {
            return null;
        }
        while (!AbstractC1899jh0.N(str, (String) arrayList.get(size), true)) {
            if (size == iN) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    @Override // o.InterfaceC0654Oh
    public List h(C2446pE c2446pE) {
        ArrayList arrayList;
        switch (this.l) {
            case 3:
                return l(c2446pE);
            case 6:
                return m(c2446pE);
            default:
                AbstractC1474fG.j(c2446pE, "url");
                synchronized (this.m) {
                    AbstractC1406ef.S(this.m, new C3092vv0(System.currentTimeMillis()));
                    ArrayList arrayList2 = this.m;
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((C0628Nh) obj).a(c2446pE)) {
                            arrayList.add(obj);
                        }
                    }
                }
                return arrayList;
        }
    }

    public synchronized T70 i(Class cls) {
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            U70 u70 = (U70) this.m.get(i);
            if (u70.a.isAssignableFrom(cls)) {
                return u70.b;
            }
        }
        return null;
    }

    public synchronized Z70 j(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C2691rp.F;
        }
        for (C2493pm0 c2493pm0 : this.m) {
            if (c2493pm0.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2493pm0.b)) {
                return c2493pm0.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList k(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C2493pm0 c2493pm0 : this.m) {
            if (c2493pm0.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2493pm0.b) && !arrayList.contains(c2493pm0.b)) {
                arrayList.add(c2493pm0.b);
            }
        }
        return arrayList;
    }

    public void n(String str) {
        AbstractC1474fG.j(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            if (AbstractC1899jh0.N(str, (String) arrayList.get(i), true)) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void q(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        AbstractC1468fA.c(str);
        AbstractC1468fA.e(str2, str);
        n(str);
        d(str, str2);
    }
}
