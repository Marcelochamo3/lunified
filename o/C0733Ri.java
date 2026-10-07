package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: o.Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0733Ri implements InterfaceC1536fv {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final C2658rX i;
    public final C1288dP j;
    public final Uri k;
    public final C3398z30 l;
    public final List m;

    public C0733Ri(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C3398z30 c3398z30, C2658rX c2658rX, C1288dP c1288dP, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = c3398z30;
        this.i = c2658rX;
        this.k = uri;
        this.j = c1288dP;
        this.m = arrayList;
    }

    @Override // o.InterfaceC1536fv
    public final Object a(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new Cg0(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((Cg0) linkedList.peek()).l != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
                j = j2;
                arrayList2 = arrayList3;
            } else {
                EY eyB = b(i);
                List list2 = eyB.c;
                Cg0 cg0 = (Cg0) linkedList.poll();
                int i2 = cg0.l;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = cg0.m;
                    V1 v1 = (V1) list2.get(i3);
                    List list3 = v1.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((AbstractC1853j70) list3.get(cg0.n));
                        cg0 = (Cg0) linkedList.poll();
                        if (cg0.l != i2) {
                            break;
                        }
                    } while (cg0.m == i3);
                    arrayList = arrayList3;
                    j = j2;
                    arrayList4.add(new V1(v1.a, v1.b, arrayList5, v1.d, v1.e, v1.f));
                    if (cg0.l != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j2 = j;
                }
                linkedList.addFirst(cg0);
                arrayList2 = arrayList;
                arrayList2.add(new EY(eyB.a, eyB.b - j, arrayList4, eyB.d));
            }
            i++;
            arrayList3 = arrayList2;
            j2 = j;
        }
        long j3 = j2;
        ArrayList arrayList6 = arrayList3;
        long j4 = this.b;
        return new C0733Ri(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
    }

    public final EY b(int i) {
        return (EY) this.m.get(i);
    }

    public final long c(int i) {
        List list = this.m;
        if (i != list.size() - 1) {
            return ((EY) list.get(i + 1)).b - ((EY) list.get(i)).b;
        }
        long j = this.b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ((EY) list.get(i)).b;
    }

    public final long d(int i) {
        return Lr0.K(c(i));
    }
}
