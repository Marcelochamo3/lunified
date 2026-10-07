package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends L1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AbstractC3045vW c;
    public final /* synthetic */ C0834Vf d;

    public /* synthetic */ N1(C0834Vf c0834Vf, String str, AbstractC3045vW abstractC3045vW, int i) {
        this.a = i;
        this.d = c0834Vf;
        this.b = str;
        this.c = abstractC3045vW;
    }

    @Override // o.L1
    public final void a(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                C0834Vf c0834Vf = this.d;
                HashMap map = c0834Vf.b;
                String str = this.b;
                Integer num = (Integer) map.get(str);
                AbstractC3045vW abstractC3045vW = this.c;
                if (num != null) {
                    c0834Vf.d.add(str);
                    try {
                        c0834Vf.b(num.intValue(), abstractC3045vW, obj);
                        return;
                    } catch (Exception e) {
                        c0834Vf.d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC3045vW + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                C0834Vf c0834Vf2 = this.d;
                HashMap map2 = c0834Vf2.b;
                String str2 = this.b;
                Integer num2 = (Integer) map2.get(str2);
                AbstractC3045vW abstractC3045vW2 = this.c;
                if (num2 != null) {
                    c0834Vf2.d.add(str2);
                    try {
                        c0834Vf2.b(num2.intValue(), abstractC3045vW2, obj);
                        return;
                    } catch (Exception e2) {
                        c0834Vf2.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC3045vW2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.d.e(this.b);
    }
}
