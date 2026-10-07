package o;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0782Tf implements J90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0782Tf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.J90
    public final Bundle a() {
        AbstractActivityC1540fx abstractActivityC1540fx;
        Bundle bundle;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                AbstractActivityC1116bg abstractActivityC1116bg = (AbstractActivityC1116bg) obj;
                abstractActivityC1116bg.getClass();
                Bundle bundle2 = new Bundle();
                C0834Vf c0834Vf = abstractActivityC1116bg.v;
                c0834Vf.getClass();
                HashMap map = c0834Vf.b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0834Vf.d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0834Vf.g.clone());
                return bundle2;
            case 1:
                break;
            case 2:
                return ((C3289xx) obj).Y();
            case 3:
                YT yt = (YT) obj;
                AbstractC1474fG.j(yt, "$this_apply");
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry : AbstractC3327yN.B(yt.u.a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleH = ((DU) entry.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str);
                        bundle3.putBundle(str, bundleH);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bundle = new Bundle();
                    bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle3);
                } else {
                    bundle = null;
                }
                M5 m5 = yt.g;
                if (!m5.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[m5.n];
                    Iterator<E> it = m5.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        parcelableArr[i] = new ET((DT) it.next());
                        i++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = yt.l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i2 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i2] = iIntValue;
                        arrayList2.add(str2);
                        i2++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = yt.m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        M5 m6 = (M5) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[m6.n];
                        int i3 = 0;
                        for (Object obj2 : m6) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC0937Ze.N();
                                throw null;
                            }
                            parcelableArr2[i3] = (ET) obj2;
                            i3 = i4;
                        }
                        bundle.putParcelableArray(AbstractC1701hf0.t("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (yt.f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", yt.f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle4 = Bundle.EMPTY;
                AbstractC1474fG.i(bundle4, "EMPTY");
                return bundle4;
            case 4:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                AbstractC1474fG.j(navHostFragment, "this$0");
                int i5 = navHostFragment.n0;
                if (i5 != 0) {
                    return AbstractC1474fG.c(new C1101bX("android-support-nav:fragment:graphId", Integer.valueOf(i5)));
                }
                Bundle bundle5 = Bundle.EMPTY;
                AbstractC1474fG.i(bundle5, "{\n                    Bu…e.EMPTY\n                }");
                return bundle5;
            default:
                return E90.a((E90) obj);
        }
        do {
            abstractActivityC1540fx = (AbstractActivityC1540fx) obj;
        } while (AbstractActivityC1540fx.v(abstractActivityC1540fx.u()));
        abstractActivityC1540fx.E.d(SJ.ON_STOP);
        return new Bundle();
    }
}
