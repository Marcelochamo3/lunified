package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Wc0 extends S20 {
    public static void b0(PreferenceGroup preferenceGroup) {
        int size = preferenceGroup.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = preferenceGroup.B(i);
            AbstractC1474fG.i(preferenceB, "getPreference(...)");
            if (preferenceB instanceof PreferenceCategory) {
                ((PreferenceCategory) preferenceB).P = R.layout.preference_category_mobile_modern;
                b0((PreferenceGroup) preferenceB);
            } else {
                preferenceB.P = R.layout.preference_item_mobile_modern;
                if (!preferenceB.M) {
                    preferenceB.M = true;
                    preferenceB.h();
                }
                if (!(preferenceB instanceof SwitchPreference) && preferenceB.B) {
                    preferenceB.Q = R.layout.preference_widget_chevron_mobile;
                }
            }
        }
    }

    public static final void c0(ListPreference listPreference) {
        List listF = C3084vr0.f();
        if (listPreference != null) {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(listF, 10));
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(((Xq0) it.next()).b);
            }
            listPreference.C((CharSequence[]) arrayList.toArray(new String[0]));
            ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(listF, 10));
            Iterator it2 = listF.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Xq0) it2.next()).a);
            }
            listPreference.f0 = (CharSequence[]) arrayList2.toArray(new String[0]);
            C3084vr0 c3084vr0 = C3084vr0.a;
            EnumC1139br0 enumC1139br0H = C3084vr0.H();
            String strW = C3084vr0.w(enumC1139br0H, C3084vr0.L(enumC1139br0H));
            if (!listF.isEmpty()) {
                Iterator it3 = listF.iterator();
                do {
                    if (!it3.hasNext()) {
                        strW = null;
                        break;
                    }
                } while (!AbstractC1474fG.b(((Xq0) it3.next()).a, strW));
            } else {
                strW = null;
                break;
            }
            if (strW == null) {
                strW = ((Xq0) AbstractC0911Ye.b0(listF)).a;
            }
            listPreference.D(strW);
            listPreference.w(C0622Nb.q());
        }
    }

    @Override // o.S20, o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        super.K(view, bundle);
        R20 r20 = this.l0;
        r20.b = 0;
        r20.a = null;
        RecyclerView recyclerView = r20.d.n0;
        if (recyclerView.B.size() != 0) {
            X50 x50 = recyclerView.y;
            if (x50 != null) {
                x50.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView.R();
            recyclerView.requestLayout();
        }
        RecyclerView recyclerView2 = this.n0;
        recyclerView2.setClipToPadding(false);
        recyclerView2.setPadding(0, 0, 0, (int) (28 * recyclerView2.getResources().getDisplayMetrics().density));
        recyclerView2.setItemAnimator(null);
    }

    @Override // o.S20
    public final void X(String str) {
        String str2;
        Boolean boolValueOf;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        X20 x20 = this.m0;
        x20.f = "com.skidush.clonex.preferences";
        x20.c = null;
        a0(str);
        PreferenceScreen preferenceScreen = this.m0.g;
        AbstractC1474fG.i(preferenceScreen, "getPreferenceScreen(...)");
        b0(preferenceScreen);
        Ec0 ec0 = Ec0.a;
        String string = Ec0.h(Q()).getString("vencimiento", null);
        if (string == null || !(!AbstractC1899jh0.O(string))) {
            string = null;
        }
        Preference preferenceW = W("ACCOUNT_EXPIRY");
        if (preferenceW != null) {
            if (string == null) {
                string = n(R.string.settings_account_expiry_unavailable);
            }
            preferenceW.v(string);
        }
        Preference preferenceW2 = W("APP_VERSION");
        if (preferenceW2 != null) {
            preferenceW2.v(o(R.string.settings_app_version_value, "5.6.5", 150));
        }
        SwitchPreference switchPreference = (SwitchPreference) W("FORCE_EXTRA_BUFFERING");
        if (switchPreference != null) {
            SharedPreferences sharedPreferences = AbstractC1459f50.n;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
                SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
                if (sharedPreferences2 == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
            } else {
                boolValueOf = null;
            }
            switchPreference.A(boolValueOf != null ? boolValueOf.booleanValue() : true);
            switchPreference.v(n(switchPreference.Y ? R.string.settings_force_extra_buffer_enabled : R.string.settings_force_extra_buffer_disabled));
            switchPreference.p = new C0812Uj(switchPreference, 6, this);
        }
        ListPreference listPreference = (ListPreference) W("SELECTED_THEME");
        if (listPreference != null) {
            String strB = Cr0.y.b();
            if (strB == null) {
                strB = "default";
            }
            listPreference.D(strB);
            listPreference.w(C0622Nb.q());
            listPreference.p = new Qc0(this, i4);
        }
        ListPreference listPreference2 = (ListPreference) W("APP_LAYOUT_SETTING");
        if (listPreference2 != null) {
            int iOrdinal = zy0.B(Q()).ordinal();
            if (iOrdinal == 0) {
                str2 = "mobile";
            } else {
                if (iOrdinal != 1) {
                    throw new C0730Rf();
                }
                str2 = "tv";
            }
            listPreference2.D(str2);
            listPreference2.w(C0622Nb.q());
            listPreference2.p = new Qc0(this, i3);
        }
        UK.h(this);
        Preference preferenceW3 = W("OPEN_DNS_SETTINGS");
        if (preferenceW3 != null) {
            preferenceW3.q = new Qc0(this, i2);
        }
        Preference preferenceW4 = W("CLEAR_APP_CACHE");
        if (preferenceW4 != null) {
            preferenceW4.q = new Qc0(this, i);
        }
        ListPreference listPreference3 = (ListPreference) W("PROXY_COUNTRY");
        c0(listPreference3);
        if (listPreference3 != null) {
            listPreference3.p = new C0633Nm(28);
        }
        C3084vr0 c3084vr0 = C3084vr0.a;
        ArrayList arrayListD = C3084vr0.D();
        ListPreference listPreference4 = (ListPreference) W("PROXY_PROVIDER");
        if (listPreference4 != null) {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListD, 10));
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                arrayList.add(((Zq0) it.next()).b);
            }
            listPreference4.C((CharSequence[]) arrayList.toArray(new String[0]));
            ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayListD, 10));
            Iterator it2 = arrayListD.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Zq0) it2.next()).a);
            }
            listPreference4.f0 = (CharSequence[]) arrayList2.toArray(new String[0]);
            C3084vr0 c3084vr1 = C3084vr0.a;
            listPreference4.D(C3084vr0.H().l);
            listPreference4.w(C0622Nb.q());
            listPreference4.p = new Rc0(listPreference3, i4);
        }
        SwitchPreference switchPreference2 = (SwitchPreference) W("ENABLE_URBAN_PROXY");
        if (switchPreference2 != null) {
            C3084vr0 c3084vr2 = C3084vr0.a;
            switchPreference2.A(C3084vr0.s());
            switchPreference2.p = new C0633Nm(29);
        }
        AbstractC1376eG.w(AbstractC1459f50.y(this), null, 0, new Uc0(switchPreference2, null, this), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132  */
    @Override // o.S20
    public final void Z(Preference preference) {
        ListPreference listPreference;
        CharSequence[] charSequenceArr;
        String str;
        int i;
        int i2;
        String strN;
        AbstractC1474fG.j(preference, "preference");
        if (!(preference instanceof ListPreference) || (charSequenceArr = (listPreference = (ListPreference) preference).e0) == null || charSequenceArr.length == 0) {
            super.Z(preference);
            return;
        }
        CharSequence[] charSequenceArr2 = listPreference.f0;
        AbstractC1474fG.i(charSequenceArr2, "getEntryValues(...)");
        ArrayList arrayList = new ArrayList(charSequenceArr2.length);
        for (CharSequence charSequence : charSequenceArr2) {
            arrayList.add(charSequence.toString());
        }
        CharSequence[] charSequenceArr3 = listPreference.e0;
        AbstractC1474fG.i(charSequenceArr3, "getEntries(...)");
        ArrayList arrayList2 = new ArrayList(charSequenceArr3.length);
        int length = charSequenceArr3.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            str = listPreference.w;
            if (i3 >= length) {
                break;
            }
            int i5 = i4 + 1;
            String string = charSequenceArr3[i3].toString();
            Integer numValueOf = null;
            if (AbstractC1474fG.b(str, "APP_LAYOUT_SETTING")) {
                String str2 = (String) arrayList.get(i4);
                if (AbstractC1474fG.b(str2, "mobile")) {
                    strN = n(R.string.settings_layout_mobile_description);
                } else if (AbstractC1474fG.b(str2, "tv")) {
                    strN = n(R.string.settings_layout_tv_description);
                } else {
                    strN = null;
                }
            } else {
                strN = null;
            }
            if (AbstractC1474fG.b(str, "SELECTED_THEME")) {
                numValueOf = Integer.valueOf(AbstractC1459f50.F((String) arrayList.get(i4)).c);
            }
            arrayList2.add(new Pc0(string, strN, numValueOf));
            i3++;
            i4 = i5;
        }
        if (str != null) {
            switch (str) {
                case "APP_LAYOUT_SETTING":
                    i = R.string.settings_layout_dialog_subtitle;
                    break;
                case "SELECTED_THEME":
                    i = R.string.settings_theme_dialog_subtitle;
                    break;
                case "PROXY_COUNTRY":
                    i = R.string.settings_proxy_country_dialog_subtitle;
                    break;
                case "PROXY_PROVIDER":
                    i = R.string.settings_proxy_provider_dialog_subtitle;
                    break;
                default:
                    i = R.string.more_settings_subtitle;
                    break;
            }
        } else {
            i = R.string.more_settings_subtitle;
        }
        String strN2 = n(i);
        AbstractC1474fG.i(strN2, "getString(...)");
        if (str != null) {
            switch (str) {
                case "APP_LAYOUT_SETTING":
                    i2 = R.drawable.ic_settings_layout;
                    break;
                case "SELECTED_THEME":
                    i2 = R.drawable.ic_settings_theme;
                    break;
                case "PROXY_COUNTRY":
                    i2 = R.drawable.ic_settings_location;
                    break;
                case "PROXY_PROVIDER":
                    i2 = R.drawable.ic_settings_proxy;
                    break;
                default:
                    i2 = R.drawable.ic_menu_settings;
                    break;
            }
        } else {
            i2 = R.drawable.ic_menu_settings;
        }
        int iA = listPreference.A(listPreference.g0);
        C3325yL.z(Q(), String.valueOf(listPreference.s), strN2, arrayList2, AbstractC1370eA.O(Integer.valueOf(iA < 0 ? 0 : iA)), false, 0, false, i2, new Vc0(arrayList, preference, 0));
    }
}
