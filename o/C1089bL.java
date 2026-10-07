package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1089bL {
    public final InterfaceC1941k20 a;
    public final List b;
    public final String c;

    public C1089bL(Class cls, Class cls2, Class cls3, List list, Na0 na0) {
        this.a = na0;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final M70 a(int i, int i2, InterfaceC2195mj interfaceC2195mj, FW fw, C2295nk0 c2295nk0) {
        InterfaceC1941k20 interfaceC1941k20 = this.a;
        List list = (List) interfaceC1941k20.n();
        AbstractC3045vW.k(list, "Argument must not be null");
        try {
            List list2 = this.b;
            int size = list2.size();
            M70 m70A = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    m70A = ((C0527Jj) list2.get(i3)).a(i, i2, interfaceC2195mj, fw, c2295nk0);
                } catch (C1762iA e) {
                    list.add(e);
                }
                if (m70A != null) {
                    break;
                }
            }
            if (m70A != null) {
                interfaceC1941k20.e(list);
                return m70A;
            }
            throw new C1762iA(this.c, new ArrayList(list));
        } catch (Throwable th) {
            interfaceC1941k20.e(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
