package o;

import android.content.res.Resources;
import android.text.TextUtils;
import com.skidush.clonex.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class M8 implements Z70, InterfaceC1129bm0 {
    public final Resources l;

    public M8(Resources resources, int i) {
        switch (i) {
            case 1:
                resources.getClass();
                this.l = resources;
                break;
            default:
                this.l = resources;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    public String a(C0643Nw c0643Nw) {
        String displayName;
        String str = c0643Nw.n;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i = Lr0.a;
            Locale localeForLanguageTag = i >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = d(displayName, b(c0643Nw));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        String str2 = c0643Nw.m;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public String b(C0643Nw c0643Nw) {
        int i = c0643Nw.p & 2;
        Resources resources = this.l;
        String string = i != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i2 = c0643Nw.p;
        if ((i2 & 4) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public String c(C0643Nw c0643Nw) {
        String strA;
        String string;
        int i = IQ.i(c0643Nw.w);
        int i2 = c0643Nw.J;
        int i3 = c0643Nw.C;
        int i4 = c0643Nw.B;
        if (i == -1) {
            String str = c0643Nw.t;
            if (IQ.j(str) != null) {
                i = 2;
            } else if (IQ.b(str) != null) {
                i = 1;
            } else if (i4 != -1 || i3 != -1) {
                i = 2;
            } else if (i2 == -1 && c0643Nw.K == -1) {
                i = -1;
            } else {
                i = 1;
            }
        }
        Resources resources = this.l;
        int i5 = c0643Nw.s;
        if (i == 2) {
            strA = d(b(c0643Nw), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i5 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i5 / 1000000.0f)) : "");
        } else if (i == 1) {
            String strA2 = a(c0643Nw);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strA = d(strA2, string, i5 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i5 / 1000000.0f)) : "");
        } else {
            strA = a(c0643Nw);
        }
        return strA.length() == 0 ? resources.getString(R.string.exo_track_unknown) : strA;
    }

    public String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.l.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // o.Z70
    public M70 g(M70 m70, FW fw) {
        if (m70 == null) {
            return null;
        }
        return new R8(this.l, m70);
    }
}
