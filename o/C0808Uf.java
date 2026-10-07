package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0808Uf implements InterfaceC2076lW {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivityC1116bg b;

    public /* synthetic */ C0808Uf(AbstractActivityC1540fx abstractActivityC1540fx, int i) {
        this.a = i;
        this.b = abstractActivityC1540fx;
    }

    @Override // o.InterfaceC2076lW
    public final void a() {
        switch (this.a) {
            case 0:
                AbstractActivityC1116bg abstractActivityC1116bg = this.b;
                Bundle bundleC = ((K3) abstractActivityC1116bg.p.f832o).c("android:support:activity-result");
                if (bundleC != null) {
                    C0834Vf c0834Vf = abstractActivityC1116bg.v;
                    c0834Vf.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0834Vf.d = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0834Vf.g;
                        bundle2.putAll(bundle);
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            HashMap map = c0834Vf.b;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = c0834Vf.a;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            map2.put(num2, str2);
                            map.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                C1442ex c1442ex = (C1442ex) ((AbstractActivityC1540fx) this.b).D.m;
                c1442ex.r.b(c1442ex, c1442ex, null);
                break;
        }
    }
}
