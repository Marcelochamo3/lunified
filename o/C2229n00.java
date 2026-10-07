package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.n00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2229n00 implements InterfaceC1937k00 {
    public final /* synthetic */ int a;

    public /* synthetic */ C2229n00(int i) {
        this.a = i;
    }

    public static boolean a() {
        if (AbstractC2520q00.b) {
            return true;
        }
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Boolean boolValueOf = null;
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
        }
        return boolValueOf != null ? boolValueOf.booleanValue() : true;
    }

    public static AbstractC2810t00 b() {
        Object next;
        Iterator it = AbstractC2810t00.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((AbstractC2810t00) next).a());
        AbstractC2810t00 abstractC2810t00 = (AbstractC2810t00) next;
        return abstractC2810t00 == null ? C2616r00.c : abstractC2810t00;
    }

    public static C3004v00 c() {
        Object obj;
        Object next;
        Iterator it = C3004v00.f.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C3004v00) next).c);
        C3004v00 c3004v00 = (C3004v00) next;
        if (c3004v00 != null) {
            return c3004v00;
        }
        for (Object obj2 : C3004v00.f) {
            if (((C3004v00) obj2).b == 1.0f) {
                obj = obj2;
                break;
            }
        }
        C3004v00 c3004v01 = (C3004v00) obj;
        return c3004v01 == null ? C3004v00.e : c3004v01;
    }

    public static T00 d() {
        Object next;
        boolean zA;
        Iterator it = T00.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            T00 t00 = (T00) next;
            if (t00 instanceof C3198x00) {
                zA = ((C3198x00) t00).a();
            } else if (t00 instanceof S00) {
                S00 s00 = (S00) t00;
                zA = s00.f.p[s00.g];
            } else {
                zA = false;
            }
        } while (!zA);
        T00 t01 = (T00) next;
        return t01 == null ? C3198x00.c : t01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static void e(InterfaceC0664Or interfaceC0664Or) {
        ?? arrayList;
        Parcelable[] parcelableArray;
        AbstractC1474fG.j(interfaceC0664Or, "player");
        ArrayList arrayList2 = C2907u00.e;
        arrayList2.clear();
        C1042as c1042as = (C1042as) interfaceC0664Or;
        c1042as.i0();
        C2263nP c2263nP = c1042as.O;
        AbstractC1474fG.i(c2263nP, "getPlaylistMetadata(...)");
        Bundle bundle = c2263nP.S;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mediaServers")) == null) {
            arrayList = C1233cq.l;
        } else {
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                AbstractC1474fG.h(parcelable, "null cannot be cast to non-null type com.skidush.clonex.utils.MediaServer");
                arrayList.add((C3426zP) parcelable);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        for (C3426zP c3426zP : arrayList) {
            arrayList3.add(new C2907u00(c3426zP.l, c3426zP.m));
        }
        arrayList2.addAll(arrayList3);
        C2907u00 c2907u00 = (C2907u00) AbstractC0911Ye.d0(C2907u00.e);
        if (c2907u00 == null) {
            return;
        }
        c2907u00.c = true;
    }

    public static boolean g() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Boolean boolValueOf = null;
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
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
        boolean z = AbstractC2520q00.b;
        Boolean bool = AbstractC2520q00.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return z || zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    public static String i(Context context) {
        String string;
        String string2 = context.getString((g() ? C2423p00.i : C2326o00.i).a());
        AbstractC1474fG.i(string2, "getString(...)");
        C1005aZ c1005aZ = g() ? AbstractC2520q00.e : AbstractC2520q00.f;
        if (c1005aZ != null) {
            Long l = AbstractC2520q00.g;
            int i = c1005aZ.b;
            int i2 = c1005aZ.a;
            if (l != null) {
                string = context.getString(R.string.player_settings_extra_buffer_profile_live, string2, Integer.valueOf(i2 / 1000), Integer.valueOf(i / 1000), Long.valueOf((l.longValue() + 500) / 1000));
                if (string == null) {
                    string = context.getString(R.string.player_settings_extra_buffer_profile, string2, Integer.valueOf(i2 / 1000), Integer.valueOf(i / 1000));
                }
            } else {
                string = context.getString(R.string.player_settings_extra_buffer_profile, string2, Integer.valueOf(i2 / 1000), Integer.valueOf(i / 1000));
            }
        } else {
            string = null;
        }
        return string == null ? string2 : string;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0425 A[PHI: r3
  0x0425: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v23 java.lang.String) binds: [B:169:0x0405, B:176:0x0422] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x0452  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v35 */
    public void f(InterfaceC0664Or interfaceC0664Or, Resources resources) {
        String str;
        Iterator it;
        String string;
        boolean z;
        String string2;
        Object obj;
        String strE;
        int i;
        int i2;
        String str2;
        String str3 = "und";
        int i3 = 10;
        int i4 = 0;
        ?? r11 = 1;
        int i5 = this.a;
        AbstractC1474fG.j(interfaceC0664Or, "player");
        switch (i5) {
            case 0:
                ArrayList arrayList = C2132m00.f;
                arrayList.clear();
                AbstractC0985aF abstractC0985aF = ((C1042as) interfaceC0664Or).F().l;
                AbstractC1474fG.i(abstractC0985aF, "getGroups(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : abstractC0985aF) {
                    if (((C2007km0) obj2).m.n == 1) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C2007km0 c2007km0 = (C2007km0) it2.next();
                    AbstractC1474fG.g(c2007km0);
                    ArrayList arrayListU = AbstractC0397Ej.u(c2007km0);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayListU) {
                        if ((((C0643Nw) obj3).f421o & 2) == 0) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(arrayList4, i3));
                    int i6 = 0;
                    for (Object obj4 : arrayList4) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            AbstractC0937Ze.N();
                            throw null;
                        }
                        C0643Nw c0643Nw = (C0643Nw) obj4;
                        C2229n00 c2229n00 = C2132m00.e;
                        String str4 = c0643Nw.n;
                        if (str4 == null) {
                            str = str3;
                            it = it2;
                            string = null;
                        } else {
                            if (AbstractC1899jh0.N(str4, str3, true)) {
                                str4 = null;
                            }
                            if (str4 == null || (string2 = AbstractC1119bh0.E0(AbstractC1899jh0.S(str4, '_', '-')).toString()) == null) {
                                str = str3;
                                it = it2;
                                string = null;
                            } else {
                                if (string2.length() <= 0) {
                                    string2 = null;
                                }
                                if (string2 != null) {
                                    Locale localeForLanguageTag = Locale.forLanguageTag(string2);
                                    str = str3;
                                    String displayLanguage = localeForLanguageTag.getDisplayLanguage(new Locale("es"));
                                    AbstractC1474fG.g(displayLanguage);
                                    it = it2;
                                    if (!(!AbstractC1899jh0.O(displayLanguage)) || AbstractC1899jh0.N(displayLanguage, string2, true)) {
                                        displayLanguage = null;
                                    }
                                    if (displayLanguage == null) {
                                        displayLanguage = localeForLanguageTag.getDisplayLanguage(Locale.getDefault());
                                        AbstractC1474fG.g(displayLanguage);
                                        if (!(!AbstractC1899jh0.O(displayLanguage)) || AbstractC1899jh0.N(displayLanguage, string2, true)) {
                                            displayLanguage = null;
                                        }
                                        if (displayLanguage != null) {
                                            string2 = displayLanguage;
                                        }
                                    } else {
                                        string2 = displayLanguage;
                                    }
                                    if (string2.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append((Object) AbstractC3021v9.C(string2.charAt(0)));
                                        String strSubstring = string2.substring(1);
                                        AbstractC1474fG.i(strSubstring, "substring(...)");
                                        sb.append(strSubstring);
                                        string = sb.toString();
                                    } else {
                                        string = string2;
                                    }
                                } else {
                                    str = str3;
                                    it = it2;
                                    string = null;
                                }
                            }
                        }
                        String strC = new M8(resources, 1).c(c0643Nw);
                        AbstractC1474fG.i(strC, "getTrackName(...)");
                        String str5 = c0643Nw.m;
                        String string3 = str5 != null ? AbstractC1119bh0.E0(str5).toString() : null;
                        if (string3 == null) {
                            string3 = "";
                        }
                        String string4 = AbstractC1119bh0.E0(strC).toString();
                        if (string3.length() <= 0 || string == null || AbstractC1119bh0.W(string3, string, true)) {
                            if (string3.length() <= 0) {
                                if (string != null) {
                                    z = true;
                                    if (AbstractC1899jh0.N(string4, resources.getString(R.string.player_settings_audio_label), true)) {
                                        string3 = string;
                                    }
                                } else {
                                    z = true;
                                }
                                if (string == null || !(string4.length() == 0 || AbstractC1899jh0.N(string4, "unknown", z))) {
                                    if (string4.length() == 0) {
                                        string4 = string == null ? "Audio" : string;
                                    }
                                    string3 = string4;
                                } else {
                                    string3 = string;
                                }
                            }
                            arrayList5.add(new C2132m00(string3, string, c2007km0, i6));
                            i6 = i7;
                            str3 = str;
                            it2 = it;
                        } else {
                            string3 = AbstractC1701hf0.e(string, " - ", string3);
                        }
                        arrayList5.add(new C2132m00(string3, string, c2007km0, i6));
                        i6 = i7;
                        str3 = str;
                        it2 = it;
                    }
                    AbstractC1406ef.Q(arrayList3, arrayList5);
                    str3 = str3;
                    it2 = it2;
                    i3 = 10;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    C2132m00 c2132m00 = (C2132m00) obj5;
                    if (hashSet.add(c2132m00.a + "-" + c2132m00.c.m.m + "-" + c2132m00.d)) {
                        arrayList6.add(obj5);
                    }
                }
                arrayList.addAll(AbstractC0911Ye.r0(arrayList6, new N2(25)));
                return;
            case 1:
            default:
                ArrayList arrayList7 = T00.b;
                arrayList7.clear();
                arrayList7.add(R00.a);
                arrayList7.add(C3198x00.c);
                AbstractC0985aF abstractC0985aF2 = ((C1042as) interfaceC0664Or).F().l;
                AbstractC1474fG.i(abstractC0985aF2, "getGroups(...)");
                ArrayList<C2007km0> arrayList8 = new ArrayList();
                for (Object obj6 : abstractC0985aF2) {
                    if (((C2007km0) obj6).m.n == 3) {
                        arrayList8.add(obj6);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (C2007km0 c2007km1 : arrayList8) {
                    ZF zfL = U9.L(i4, c2007km1.l);
                    ArrayList arrayList10 = new ArrayList();
                    YF it3 = zfL.iterator();
                    while (it3.n) {
                        Object next = it3.next();
                        if (c2007km1.f875o[((Number) next).intValue()] == 4) {
                            arrayList10.add(next);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(AbstractC1016af.O(arrayList10, 10));
                    Iterator it4 = arrayList10.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(new Ah0(c2007km1, ((Number) it4.next()).intValue()));
                    }
                    AbstractC1406ef.Q(arrayList9, arrayList11);
                    i4 = 0;
                }
                ArrayList arrayList12 = new ArrayList(AbstractC1016af.O(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                int i8 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        AbstractC0937Ze.N();
                        throw null;
                    }
                    Ah0 ah0 = (Ah0) next2;
                    C2007km0 c2007km2 = ah0.a;
                    C0643Nw[] c0643NwArr = c2007km2.m.f665o;
                    int i10 = ah0.b;
                    C0643Nw c0643Nw2 = c0643NwArr[i10];
                    AbstractC1474fG.i(c0643Nw2, "getTrackFormat(...)");
                    String strC2 = new M8(resources, r11).c(c0643Nw2);
                    AbstractC1474fG.i(strC2, "getTrackName(...)");
                    String str6 = c0643Nw2.n;
                    if (str6 == null || AbstractC1899jh0.N(str6, "und", r11)) {
                        str6 = null;
                    }
                    String str7 = c0643Nw2.m;
                    String strA = AbstractC3355yh0.a(str6 == null ? str7 : str6);
                    if (strA != null) {
                        str6 = strA;
                    } else if (str6 == null) {
                        str6 = str7;
                    }
                    String strB = AbstractC3355yh0.b(str6);
                    if (str7 == null || (strE = AbstractC1119bh0.E0(str7).toString()) == null || strE.length() <= 0) {
                        strE = null;
                    }
                    String strA2 = AbstractC3355yh0.a(strE);
                    if (strB != null) {
                        i = i9;
                        if (strE == null || AbstractC1474fG.b(strA2, strA)) {
                            strE = strB;
                        } else {
                            i2 = 1;
                            i2 = 1;
                            if (!AbstractC1119bh0.W(strE, strB, true)) {
                                strE = AbstractC1701hf0.e(strB, " - ", strE);
                            }
                        }
                        if ((c0643Nw2.f421o & 2) != 0) {
                            Object[] objArr = new Object[i2];
                            objArr[0] = strE;
                            strE = resources.getString(R.string.player_settings_subtitles_forced, objArr);
                        }
                        AbstractC1474fG.g(strE);
                        if (strB != null || AbstractC1899jh0.N(strE, strB, i2)) {
                            str2 = null;
                        } else {
                            str2 = strB;
                        }
                        arrayList12.add(new S00(strC2, strE, str2, strA, c2007km2, i10));
                        it5 = it5;
                        i8 = i;
                        r11 = 1;
                    } else if (strE == null) {
                        i = i9;
                        strE = resources.getString(R.string.player_settings_subtitles_track, Integer.valueOf(i9));
                        AbstractC1474fG.i(strE, "getString(...)");
                    } else {
                        i = i9;
                    }
                    i2 = 1;
                    if ((c0643Nw2.f421o & 2) != 0) {
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = strE;
                        strE = resources.getString(R.string.player_settings_subtitles_forced, objArr2);
                    }
                    AbstractC1474fG.g(strE);
                    if (strB != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    arrayList12.add(new S00(strC2, strE, str2, strA, c2007km2, i10));
                    it5 = it5;
                    i8 = i;
                    r11 = 1;
                }
                arrayList7.addAll(AbstractC0911Ye.r0(arrayList12, new N2(27)));
                ArrayList arrayList13 = T00.b;
                arrayList13.add(C3101w00.c);
                arrayList13.add(C3392z00.b);
                return;
            case 2:
                ArrayList arrayList14 = AbstractC2810t00.b;
                arrayList14.clear();
                arrayList14.add(C2616r00.c);
                C1042as c1042as = (C1042as) interfaceC0664Or;
                AbstractC0985aF abstractC0985aF3 = c1042as.F().l;
                AbstractC1474fG.i(abstractC0985aF3, "getGroups(...)");
                ArrayList<C2007km0> arrayList15 = new ArrayList();
                for (Object obj7 : abstractC0985aF3) {
                    if (((C2007km0) obj7).m.n == 2) {
                        arrayList15.add(obj7);
                    }
                }
                ArrayList arrayList16 = new ArrayList();
                for (C2007km0 c2007km3 : arrayList15) {
                    AbstractC1474fG.g(c2007km3);
                    ArrayList arrayListU2 = AbstractC0397Ej.u(c2007km3);
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj8 : arrayListU2) {
                        if ((((C0643Nw) obj8).f421o & 2) == 0) {
                            arrayList17.add(obj8);
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList<C0643Nw> arrayList18 = new ArrayList();
                    for (Object obj9 : arrayList17) {
                        C0643Nw c0643Nw3 = (C0643Nw) obj9;
                        if (hashSet2.add(new C1101bX(Integer.valueOf(c0643Nw3.B), Integer.valueOf(c0643Nw3.C)))) {
                            arrayList18.add(obj9);
                        }
                    }
                    ArrayList arrayList19 = new ArrayList(AbstractC1016af.O(arrayList18, 10));
                    for (C0643Nw c0643Nw4 : arrayList18) {
                        String strC3 = new M8(resources, 1).c(c0643Nw4);
                        AbstractC1474fG.i(strC3, "getTrackName(...)");
                        arrayList19.add(new C2713s00(strC3, c0643Nw4.C, c0643Nw4.s, interfaceC0664Or));
                    }
                    AbstractC1406ef.Q(arrayList16, arrayList19);
                }
                arrayList14.addAll(AbstractC0911Ye.r0(arrayList16, new N2(26)));
                ArrayList arrayList20 = AbstractC2810t00.b;
                ArrayList arrayList21 = new ArrayList();
                for (Object obj10 : arrayList20) {
                    if (obj10 instanceof C2713s00) {
                        arrayList21.add(obj10);
                    }
                }
                Iterator it6 = arrayList21.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next3 = it6.next();
                        int i11 = ((C2713s00) next3).c;
                        Integer numA = Cr0.v.a();
                        if (numA != null && i11 == numA.intValue()) {
                            obj = next3;
                        }
                    } else {
                        obj = null;
                    }
                }
                C2713s00 c2713s00 = (C2713s00) obj;
                if (c2713s00 != null) {
                    C0814Ul c0814UlL = c1042as.L();
                    c0814UlL.getClass();
                    C0788Tl c0788Tl = new C0788Tl(c0814UlL);
                    c0788Tl.d = c2713s00.d;
                    c0788Tl.x = true;
                    c1042as.a0(new C0814Ul(c0788Tl));
                    return;
                }
                return;
        }
    }

    public void h(InterfaceC0664Or interfaceC0664Or) {
        Object obj;
        AbstractC1474fG.j(interfaceC0664Or, "player");
        Iterator it = C3004v00.f.iterator();
        while (it.hasNext()) {
            ((C3004v00) it.next()).c = false;
        }
        List list = C3004v00.f;
        C1042as c1042as = (C1042as) interfaceC0664Or;
        c1042as.i0();
        float f = c1042as.j0.n.l;
        AbstractC1474fG.j(list, "<this>");
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                C3004v00 c3004v00 = (C3004v00) next;
                AbstractC1474fG.j(c3004v00, "it");
                float fAbs = Math.abs(f - c3004v00.b);
                do {
                    Object next2 = it2.next();
                    C3004v00 c3004v01 = (C3004v00) next2;
                    AbstractC1474fG.j(c3004v01, "it");
                    float fAbs2 = Math.abs(f - c3004v01.b);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        C3004v00 c3004v02 = (C3004v00) obj;
        if (c3004v02 != null) {
            c3004v02.c = true;
        }
    }
}
