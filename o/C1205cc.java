package o;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import j$.util.Objects;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: renamed from: o.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1205cc extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f719o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1205cc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.m = i;
        this.n = obj;
        this.f719o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() throws CertificateException {
        switch (this.m) {
            case 0:
                C0882Xb c0882Xb = (C0882Xb) this.n;
                int i = c0882Xb.e;
                int size = c0882Xb.b.size();
                final int i2 = i < size ? size : i;
                if (i2 >= ((List) this.f719o).size()) {
                    C3300y3 c3300y3 = (C3300y3) this.p;
                    c3300y3.f = false;
                    c3300y3.l(null);
                } else {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final List list = (List) this.f719o;
                    final C1498fc c1498fc = (C1498fc) this.q;
                    final C0882Xb c0882Xb2 = (C0882Xb) this.n;
                    final C3300y3 c3300y4 = (C3300y3) this.p;
                    handler.post(new Runnable() { // from class: o.bc
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0882Xb c0882Xb3 = c0882Xb2;
                            AbstractC1474fG.j(c0882Xb3, "$boundCategory");
                            C3300y3 c3300y5 = c3300y4;
                            AbstractC1474fG.j(c3300y5, "$adapter");
                            List list2 = list;
                            AbstractC1474fG.j(list2, "$allChannels");
                            C1498fc c1498fc2 = c1498fc;
                            AbstractC1474fG.j(c1498fc2, "this$0");
                            C1816io0 c1816io0 = C1816io0.b;
                            String str = c0882Xb3.a;
                            AbstractC1474fG.j(str, "categoryName");
                            List list3 = (List) C1816io0.e.get(str);
                            List<C1387eR> listS0 = C1233cq.l;
                            if (list3 == null) {
                                list3 = listS0;
                            }
                            if (!list3.isEmpty()) {
                                int i3 = i2;
                                if (i3 < 0) {
                                    i3 = 0;
                                }
                                int i4 = i3 + 24;
                                int size2 = list3.size();
                                if (i4 > size2) {
                                    i4 = size2;
                                }
                                listS0 = AbstractC0911Ye.s0(i4, list3);
                            }
                            if (listS0.isEmpty()) {
                                c3300y5.f = false;
                                c3300y5.l(null);
                                return;
                            }
                            for (C1387eR c1387eR : listS0) {
                                EnumC3203x3 enumC3203x3 = c1498fc2.u instanceof C3029vG ? EnumC3203x3.S : EnumC3203x3.R;
                                c1387eR.getClass();
                                c1387eR.u = enumC3203x3;
                            }
                            c0882Xb3.e = listS0.size();
                            c0882Xb3.b = listS0;
                            c3300y5.m(listS0);
                            c3300y5.f = false;
                            if (c0882Xb3.e >= list2.size()) {
                                c3300y5.l(null);
                            }
                        }
                    });
                }
                return C2985uq0.a;
            case 1:
                C0529Jl c0529Jl = (C0529Jl) this.n;
                AbstractC0956Zx abstractC0956Zx = c0529Jl.f;
                ViewGroup viewGroup = (ViewGroup) this.f719o;
                Object obj = this.p;
                Object objH = abstractC0956Zx.h(viewGroup, obj);
                c0529Jl.k = objH;
                if (objH != null) {
                    ((IF) this.q).m = new C0503Il(c0529Jl, 0, viewGroup);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c0529Jl.d);
                        Objects.toString(c0529Jl.e);
                    }
                    return C2985uq0.a;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
            default:
                ((C2085lc0) this.n).c.checkServerTrusted((X509Certificate[]) this.f719o, (String) this.p, (String) this.q);
                return C2985uq0.a;
        }
    }
}
