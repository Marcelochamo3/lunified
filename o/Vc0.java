package o;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Vc0 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Preference f576o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Vc0(ArrayList arrayList, Preference preference, int i) {
        super(1);
        this.m = i;
        this.n = arrayList;
        this.f576o = preference;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                Set set = (Set) obj;
                AbstractC1474fG.j(set, "indices");
                String str = (String) this.n.get(((Number) AbstractC0911Ye.a0(set)).intValue());
                Preference preference = this.f576o;
                if (preference.a(str)) {
                    ((ListPreference) preference).D(str);
                }
                break;
            default:
                Set set2 = (Set) obj;
                AbstractC1474fG.j(set2, "indices");
                String str2 = (String) this.n.get(((Number) AbstractC0911Ye.a0(set2)).intValue());
                Preference preference2 = this.f576o;
                if (preference2.a(str2)) {
                    ((ListPreference) preference2).D(str2);
                }
                break;
        }
        return C2985uq0.a;
    }
}
