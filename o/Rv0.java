package o;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Rv0 extends FrameLayout implements Bh0 {
    public final C0467Hb l;
    public final Pv0 m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0493Ib f498o;
    public float p;
    public int q;
    public float r;

    public Rv0(Context context) {
        super(context, null);
        this.n = Collections.emptyList();
        this.f498o = C0493Ib.g;
        this.p = 0.0533f;
        this.q = 0;
        this.r = 0.08f;
        C0467Hb c0467Hb = new C0467Hb(context);
        this.l = c0467Hb;
        Pv0 pv0 = new Pv0(context, null);
        this.m = pv0;
        pv0.setBackgroundColor(0);
        addView(c0467Hb);
        addView(pv0);
    }

    @Override // o.Bh0
    public final void a(List list, C0493Ib c0493Ib, float f, int i, float f2) {
        this.f498o = c0493Ib;
        this.p = f;
        this.q = i;
        this.r = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3162wi c3162wi = (C3162wi) list.get(i2);
            if (c3162wi.f1099o != null) {
                arrayList.add(c3162wi);
            } else {
                arrayList2.add(c3162wi);
            }
        }
        if (!this.n.isEmpty() || !arrayList2.isEmpty()) {
            this.n = arrayList2;
            c();
        }
        this.l.a(arrayList, c0493Ib, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fB = AbstractC3409z9.B(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i2 = Lr0.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:101:0x0275  */
    /* JADX WARN: Code duplicated, block: B:103:0x0290 A[LOOP:2: B:102:0x028e->B:103:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b3 A[LOOP:3: B:105:0x02ad->B:107:0x02b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0317  */
    /* JADX WARN: Code duplicated, block: B:112:0x0321  */
    /* JADX WARN: Code duplicated, block: B:113:0x0333  */
    /* JADX WARN: Code duplicated, block: B:115:0x0339  */
    /* JADX WARN: Code duplicated, block: B:116:0x0358  */
    /* JADX WARN: Code duplicated, block: B:118:0x035e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0379  */
    /* JADX WARN: Code duplicated, block: B:122:0x037f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0382  */
    /* JADX WARN: Code duplicated, block: B:125:0x0386  */
    /* JADX WARN: Code duplicated, block: B:127:0x038f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0395  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x03df  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:141:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x0400  */
    /* JADX WARN: Code duplicated, block: B:147:0x0403  */
    /* JADX WARN: Code duplicated, block: B:148:0x040b  */
    /* JADX WARN: Code duplicated, block: B:149:0x040f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0413  */
    /* JADX WARN: Code duplicated, block: B:151:0x0417  */
    /* JADX WARN: Code duplicated, block: B:153:0x041b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0423  */
    /* JADX WARN: Code duplicated, block: B:157:0x0426  */
    /* JADX WARN: Code duplicated, block: B:160:0x042a  */
    /* JADX WARN: Code duplicated, block: B:161:0x042e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0432  */
    /* JADX WARN: Code duplicated, block: B:163:0x0436  */
    /* JADX WARN: Code duplicated, block: B:165:0x043a  */
    /* JADX WARN: Code duplicated, block: B:166:0x043e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0442  */
    /* JADX WARN: Code duplicated, block: B:170:0x0455  */
    /* JADX WARN: Code duplicated, block: B:173:0x0459  */
    /* JADX WARN: Code duplicated, block: B:174:0x045f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0467  */
    /* JADX WARN: Code duplicated, block: B:178:0x046a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x046c  */
    /* JADX WARN: Code duplicated, block: B:181:0x046f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0473  */
    /* JADX WARN: Code duplicated, block: B:183:0x0479  */
    /* JADX WARN: Code duplicated, block: B:184:0x047f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0485  */
    /* JADX WARN: Code duplicated, block: B:188:0x0493  */
    /* JADX WARN: Code duplicated, block: B:189:0x0496  */
    /* JADX WARN: Code duplicated, block: B:229:0x051d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0529  */
    /* JADX WARN: Code duplicated, block: B:234:0x0539  */
    /* JADX WARN: Code duplicated, block: B:237:0x054e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0582  */
    /* JADX WARN: Code duplicated, block: B:246:0x05aa A[LOOP:6: B:244:0x05a4->B:246:0x05aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x05c7 A[LOOP:7: B:248:0x05c1->B:250:0x05c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0600  */
    /* JADX WARN: Code duplicated, block: B:258:0x0614  */
    /* JADX WARN: Code duplicated, block: B:262:0x0621  */
    /* JADX WARN: Code duplicated, block: B:266:0x063c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x0646  */
    /* JADX WARN: Code duplicated, block: B:273:0x065e  */
    /* JADX WARN: Code duplicated, block: B:276:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:278:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:280:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:281:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:282:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:284:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:302:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x017d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0192  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0206  */
    /* JADX WARN: Code duplicated, block: B:86:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0215  */
    /* JADX WARN: Code duplicated, block: B:96:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:107:0x02b3, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        boolean z;
        float f;
        String str2;
        Layout.Alignment alignment;
        int i;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        StringBuilder sb;
        int i3;
        String str7;
        String str8;
        String str9;
        float f2;
        String str10;
        CharSequence charSequence;
        String str11;
        String str12;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i4;
        HashMap map;
        Iterator it;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i5;
        String str13;
        String str14;
        String str15;
        StringBuilder sb2;
        int i6;
        int i7;
        J2 j2;
        Iterator it2;
        Iterator it3;
        Object obj;
        boolean z2;
        int i8;
        String str16;
        String str17;
        Ki0 ki0;
        int i9;
        StringBuilder sb3;
        int i10;
        int i11;
        String str18;
        String strU;
        int i12;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str19;
        int spanStart;
        int spanEnd;
        C2672rf0 c2672rf0;
        C2672rf0 c2672rf1;
        float f3;
        String str20;
        String str21;
        Layout.Alignment alignment2;
        int i13;
        String str22;
        String str23;
        String str24;
        boolean z3;
        Rv0 rv0 = this;
        int i14 = 2;
        char c = 0;
        int i15 = 1;
        StringBuilder sb4 = new StringBuilder();
        String strV = AbstractC1474fG.V(rv0.f498o.a);
        String strB = rv0.b(rv0.q, rv0.p);
        Float fValueOf = Float.valueOf(1.2f);
        C0493Ib c0493Ib = rv0.f498o;
        int i16 = c0493Ib.d;
        int i17 = c0493Ib.e;
        if (i16 == 1) {
            Object[] objArr = {AbstractC1474fG.V(i17)};
            int i18 = Lr0.a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i16 == 2) {
            String strV2 = AbstractC1474fG.V(i17);
            int i19 = Lr0.a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strV2);
        } else if (i16 == 3) {
            String strV3 = AbstractC1474fG.V(i17);
            int i20 = Lr0.a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strV3);
        } else if (i16 != 4) {
            strConcat = "unset";
        } else {
            String strV4 = AbstractC1474fG.V(i17);
            int i21 = Lr0.a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strV4);
        }
        Object[] objArr2 = {strV, strB, fValueOf, strConcat};
        int i22 = Lr0.a;
        sb4.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strV5 = AbstractC1474fG.V(rv0.f498o.b);
        String str25 = "background-color:";
        StringBuilder sb5 = new StringBuilder("background-color:");
        sb5.append(strV5);
        String str26 = ";";
        sb5.append(";");
        map2.put(".default_bg,.default_bg *", sb5.toString());
        int i23 = 0;
        while (i23 < rv0.n.size()) {
            C3162wi c3162wi = (C3162wi) rv0.n.get(i23);
            float f4 = c3162wi.s;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            int i24 = -100;
            int i25 = c3162wi.t;
            int i26 = i25 != i15 ? i25 != i14 ? 0 : -100 : -50;
            int i27 = c3162wi.A;
            float f6 = c3162wi.p;
            if (f6 != -3.4028235E38f) {
                if (c3162wi.q != i15) {
                    Float fValueOf2 = Float.valueOf(f6 * 100.0f);
                    Object[] objArr3 = new Object[i15];
                    objArr3[c] = fValueOf2;
                    str = String.format(Locale.US, "%.2f%%", objArr3);
                    int i28 = c3162wi.r;
                    if (i27 == i15) {
                        i24 = -(i28 != i15 ? i28 != 2 ? 0 : -100 : -50);
                    } else {
                        i24 = i28 != i15 ? i28 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f6 >= 0.0f) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[0] = Float.valueOf(f6 * 1.2f);
                        str = String.format(Locale.US, "%.2fem", objArr4);
                        z = false;
                    } else {
                        Float fValueOf3 = Float.valueOf(((-f6) - 1.0f) * 1.2f);
                        Object[] objArr5 = new Object[i15];
                        objArr5[0] = fValueOf3;
                        str = String.format(Locale.US, "%.2fem", objArr5);
                        z = true;
                    }
                    i24 = 0;
                }
                f = c3162wi.u;
                if (f != -3.4028235E38f) {
                    Object[] objArr6 = new Object[i15];
                    objArr6[0] = Float.valueOf(f * 100.0f);
                    str2 = String.format(Locale.US, "%.2f%%", objArr6);
                } else {
                    str2 = "fit-content";
                }
                alignment = c3162wi.m;
                if (alignment == null) {
                    str3 = "start";
                    str4 = "end";
                    str5 = "center";
                    i2 = 2;
                } else {
                    i = Qv0.a[alignment.ordinal()];
                    str3 = "start";
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            str4 = "end";
                            str5 = "center";
                        } else {
                            str5 = "end";
                            str4 = str5;
                        }
                    } else {
                        i2 = 2;
                        str4 = "end";
                        str5 = str3;
                    }
                }
                if (i27 != 1) {
                    str6 = "vertical-rl";
                } else if (i27 != i2) {
                    str6 = "horizontal-tb";
                } else {
                    str6 = "vertical-lr";
                }
                sb = sb4;
                String strB2 = rv0.b(c3162wi.y, c3162wi.z);
                if (c3162wi.w) {
                    i3 = c3162wi.x;
                } else {
                    i3 = rv0.f498o.c;
                }
                String strV6 = AbstractC1474fG.V(i3);
                str7 = "right";
                str8 = "top";
                if (i27 != 1) {
                    if (i27 != 2) {
                        str7 = z ? "bottom" : "top";
                        str8 = "left";
                    } else if (!z) {
                        str7 = "left";
                    }
                } else if (z) {
                    str7 = "left";
                }
                if (i27 != 2 || i27 == 1) {
                    str9 = "height";
                    int i29 = i24;
                    i24 = i26;
                    i26 = i29;
                } else {
                    str9 = "width";
                }
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC2769sf0.a;
                str10 = ";'>";
                String str27 = str6;
                charSequence = c3162wi.l;
                if (charSequence == null) {
                    str11 = str5;
                    j2 = new J2(9, "", false);
                    str12 = "";
                } else {
                    str11 = str5;
                    str12 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        str2 = str2;
                        str9 = str9;
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i4 = 0;
                        while (i4 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i4].getBackgroundColor()));
                            i4++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strN = AbstractC1674hK.n(iIntValue, "bg_");
                            String str28 = str;
                            String strV7 = AbstractC1474fG.V(iIntValue);
                            int i30 = Lr0.a;
                            Locale locale4 = Locale.US;
                            map.put("." + strN + ",." + strN + " *", str25 + strV7 + str26);
                            it = it;
                            str = str28;
                        }
                        str = str;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i5 = 0;
                        while (i5 < length2) {
                            obj = spans[i5];
                            Object[] objArr7 = spans;
                            z2 = obj instanceof StrikethroughSpan;
                            String str29 = null;
                            if (z2) {
                                str16 = str26;
                                str17 = str25;
                                i8 = length2;
                                strU = "<span style='text-decoration:line-through;'>";
                            } else {
                                i8 = length2;
                                if (obj instanceof ForegroundColorSpan) {
                                    String strV8 = AbstractC1474fG.V(((ForegroundColorSpan) obj).getForegroundColor());
                                    int i31 = Lr0.a;
                                    Locale locale5 = Locale.US;
                                    str16 = str26;
                                    strU = AbstractC1701hf0.u("<span style='color:", strV8, str10);
                                    str17 = str25;
                                } else {
                                    str16 = str26;
                                    if (obj instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj).getBackgroundColor();
                                        int i32 = Lr0.a;
                                        Locale locale6 = Locale.US;
                                        str17 = str25;
                                        strU = AbstractC1674hK.p("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        str17 = str25;
                                        if (obj instanceof SC) {
                                            strU = "<span style='text-combine-upright:all;'>";
                                        } else if (obj instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr8 = {Float.valueOf(size)};
                                            int i33 = Lr0.a;
                                            strU = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                        } else if (obj instanceof RelativeSizeSpan) {
                                            Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f)};
                                            int i34 = Lr0.a;
                                            strU = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                        } else if (obj instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj).getFamily();
                                            if (family != null) {
                                                int i35 = Lr0.a;
                                                Locale locale7 = Locale.US;
                                                strU = AbstractC1701hf0.u("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strU = null;
                                            }
                                        } else if (obj instanceof StyleSpan) {
                                            style = ((StyleSpan) obj).getStyle();
                                            if (style != 1) {
                                                strU = "<b>";
                                            } else if (style != 2) {
                                                strU = "<i>";
                                            } else if (style != 3) {
                                                strU = null;
                                            } else {
                                                strU = "<b><i>";
                                            }
                                        } else if (obj instanceof R80) {
                                            i12 = ((R80) obj).b;
                                            if (i12 != -1) {
                                                strU = "<ruby style='ruby-position:unset;'>";
                                            } else if (i12 != 1) {
                                                strU = "<ruby style='ruby-position:over;'>";
                                            } else if (i12 != 2) {
                                                strU = null;
                                            } else {
                                                strU = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj instanceof UnderlineSpan) {
                                            strU = "<u>";
                                        } else if (obj instanceof Ki0) {
                                            ki0 = (Ki0) obj;
                                            i9 = ki0.a;
                                            sb3 = new StringBuilder();
                                            i10 = ki0.b;
                                            if (i10 != 1) {
                                                i11 = 2;
                                                if (i10 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i11 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i9 != 0) {
                                                sb3.append("none");
                                            } else if (i9 != 1) {
                                                sb3.append("circle");
                                            } else if (i9 != i11) {
                                                sb3.append("dot");
                                            } else if (i9 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (ki0.c != 2) {
                                                str18 = "over right";
                                            } else {
                                                str18 = "under left";
                                            }
                                            Object[] objArr10 = {string, str18};
                                            int i36 = Lr0.a;
                                            strU = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                        } else {
                                            strU = null;
                                        }
                                    }
                                }
                            }
                            if (!z2 || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof SC) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof Ki0)) {
                                str19 = "</span>";
                            } else {
                                if (obj instanceof TypefaceSpan) {
                                    if (((TypefaceSpan) obj).getFamily() != null) {
                                        str29 = "</span>";
                                    }
                                } else if (obj instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj).getStyle();
                                    if (style2 == 1) {
                                        str29 = "</b>";
                                    } else if (style2 == 2) {
                                        str29 = "</i>";
                                    } else if (style2 == 3) {
                                        str29 = "</i></b>";
                                    }
                                } else if (obj instanceof R80) {
                                    str29 = "<rt>" + AbstractC2769sf0.a(((R80) obj).a) + "</rt></ruby>";
                                } else if (obj instanceof UnderlineSpan) {
                                    str29 = "</u>";
                                }
                                str19 = str29;
                            }
                            spanStart = spanned.getSpanStart(obj);
                            spanEnd = spanned.getSpanEnd(obj);
                            if (strU != null) {
                                str19.getClass();
                                C2576qf0 c2576qf0 = new C2576qf0(spanStart, spanEnd, strU, str19);
                                c2672rf0 = (C2672rf0) sparseArray.get(spanStart);
                                if (c2672rf0 == null) {
                                    c2672rf0 = new C2672rf0();
                                    sparseArray.put(spanStart, c2672rf0);
                                }
                                c2672rf0.a.add(c2576qf0);
                                c2672rf1 = (C2672rf0) sparseArray.get(spanEnd);
                                if (c2672rf1 == null) {
                                    c2672rf1 = new C2672rf0();
                                    sparseArray.put(spanEnd, c2672rf1);
                                }
                                c2672rf1.b.add(c2576qf0);
                            }
                            i5++;
                            spans = objArr7;
                            length2 = i8;
                            str26 = str16;
                            str25 = str17;
                            f2 = f2;
                            str10 = str10;
                        }
                        str13 = str26;
                        str14 = str10;
                        str15 = str25;
                        sb2 = new StringBuilder(spanned.length());
                        i6 = 0;
                        i7 = 0;
                        while (i6 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i6);
                            sb2.append(AbstractC2769sf0.a(spanned.subSequence(i7, iKeyAt)));
                            C2672rf0 c2672rf2 = (C2672rf0) sparseArray.get(iKeyAt);
                            Collections.sort(c2672rf2.b, C2576qf0.f);
                            it2 = c2672rf2.b.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((C2576qf0) it2.next()).d);
                            }
                            ArrayList arrayList = c2672rf2.a;
                            Collections.sort(arrayList, C2576qf0.e);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((C2576qf0) it3.next()).c);
                            }
                            i6++;
                            i7 = iKeyAt;
                        }
                        sb2.append(AbstractC2769sf0.a(spanned.subSequence(i7, spanned.length())));
                        j2 = new J2(9, sb2.toString(), false);
                    } else {
                        j2 = new J2(9, AbstractC2769sf0.a(charSequence), false);
                    }
                    for (String str30 : map2.keySet()) {
                        str24 = (String) map2.put(str30, (String) map2.get(str30));
                        if (str24 != null || str24.equals(map2.get(str30))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC0397Ej.f(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i23);
                    Float fValueOf4 = Float.valueOf(f5);
                    Integer numValueOf2 = Integer.valueOf(i26);
                    Integer numValueOf3 = Integer.valueOf(i24);
                    f3 = c3162wi.B;
                    if (f3 != 0.0f) {
                        if (i27 != 2 || i27 == 1) {
                            str23 = "skewY";
                        } else {
                            str23 = "skewX";
                        }
                        Object[] objArr11 = {str23, Float.valueOf(f3)};
                        int i37 = Lr0.a;
                        str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                    } else {
                        str20 = str12;
                    }
                    sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, str8, fValueOf4, str7, str, str9, str2, str11, str27, strB2, strV6, numValueOf2, numValueOf3, str20));
                    sb.append("<span class='default_bg'>");
                    str21 = j2.m;
                    alignment2 = c3162wi.n;
                    if (alignment2 != null) {
                        i13 = Qv0.a[alignment2.ordinal()];
                        if (i13 != 1) {
                            str22 = str3;
                        } else if (i13 != 2) {
                            str22 = "center";
                        } else {
                            str22 = str4;
                        }
                        sb.append("<span style='display:inline-block; text-align:" + str22 + str14);
                        sb.append(str21);
                        sb.append("</span>");
                    } else {
                        sb.append(str21);
                    }
                    sb.append("</span></div>");
                    i23++;
                    c = 0;
                    i15 = 1;
                    rv0 = this;
                    sb4 = sb;
                    str26 = str13;
                    str25 = str15;
                    i14 = 2;
                }
                str13 = str26;
                str14 = ";'>";
                str15 = str25;
                while (r0.hasNext()) {
                    str24 = (String) map2.put(str30, (String) map2.get(str30));
                    if (str24 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    AbstractC0397Ej.f(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i23);
                Float fValueOf5 = Float.valueOf(f5);
                Integer numValueOf5 = Integer.valueOf(i26);
                Integer numValueOf6 = Integer.valueOf(i24);
                f3 = c3162wi.B;
                if (f3 != 0.0f) {
                    if (i27 != 2) {
                        str23 = "skewY";
                    } else {
                        str23 = "skewY";
                    }
                    Object[] objArr12 = {str23, Float.valueOf(f3)};
                    int i38 = Lr0.a;
                    str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str20 = str12;
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, str8, fValueOf5, str7, str, str9, str2, str11, str27, strB2, strV6, numValueOf5, numValueOf6, str20));
                sb.append("<span class='default_bg'>");
                str21 = j2.m;
                alignment2 = c3162wi.n;
                if (alignment2 != null) {
                    i13 = Qv0.a[alignment2.ordinal()];
                    if (i13 != 1) {
                        str22 = str3;
                    } else if (i13 != 2) {
                        str22 = "center";
                    } else {
                        str22 = str4;
                    }
                    sb.append("<span style='display:inline-block; text-align:" + str22 + str14);
                    sb.append(str21);
                    sb.append("</span>");
                } else {
                    sb.append(str21);
                }
                sb.append("</span></div>");
                i23++;
                c = 0;
                i15 = 1;
                rv0 = this;
                sb4 = sb;
                str26 = str13;
                str25 = str15;
                i14 = 2;
            } else {
                Object[] objArr13 = new Object[i15];
                objArr13[0] = Float.valueOf((1.0f - rv0.r) * 100.0f);
                str = String.format(Locale.US, "%.2f%%", objArr13);
            }
            z = false;
            f = c3162wi.u;
            if (f != -3.4028235E38f) {
                Object[] objArr14 = new Object[i15];
                objArr14[0] = Float.valueOf(f * 100.0f);
                str2 = String.format(Locale.US, "%.2f%%", objArr14);
            } else {
                str2 = "fit-content";
            }
            alignment = c3162wi.m;
            if (alignment == null) {
                str3 = "start";
                str4 = "end";
                str5 = "center";
                i2 = 2;
            } else {
                i = Qv0.a[alignment.ordinal()];
                str3 = "start";
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        str4 = "end";
                        str5 = "center";
                    } else {
                        str5 = "end";
                        str4 = str5;
                    }
                } else {
                    i2 = 2;
                    str4 = "end";
                    str5 = str3;
                }
            }
            if (i27 != 1) {
                str6 = "vertical-rl";
            } else if (i27 != i2) {
                str6 = "horizontal-tb";
            } else {
                str6 = "vertical-lr";
            }
            sb = sb4;
            String strB3 = rv0.b(c3162wi.y, c3162wi.z);
            if (c3162wi.w) {
                i3 = c3162wi.x;
            } else {
                i3 = rv0.f498o.c;
            }
            String strV9 = AbstractC1474fG.V(i3);
            str7 = "right";
            str8 = "top";
            if (i27 != 1) {
                if (i27 != 2) {
                    str7 = z ? "bottom" : "top";
                    str8 = "left";
                } else if (!z) {
                    str7 = "left";
                }
            } else if (z) {
                str7 = "left";
            }
            if (i27 != 2) {
                str9 = "height";
                int i210 = i24;
                i24 = i26;
                i26 = i210;
            } else {
                str9 = "height";
                int i211 = i24;
                i24 = i26;
                i26 = i211;
            }
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC2769sf0.a;
            str10 = ";'>";
            String str210 = str6;
            charSequence = c3162wi.l;
            if (charSequence == null) {
                str11 = str5;
                j2 = new J2(9, "", false);
                str12 = "";
            } else {
                str11 = str5;
                str12 = "";
                if (charSequence instanceof Spanned) {
                    j2 = new J2(9, AbstractC2769sf0.a(charSequence), false);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    str2 = str2;
                    str9 = str9;
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i4 = 0;
                    while (i4 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i4].getBackgroundColor()));
                        i4++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strN2 = AbstractC1674hK.n(iIntValue2, "bg_");
                        String str211 = str;
                        String strV10 = AbstractC1474fG.V(iIntValue2);
                        int i39 = Lr0.a;
                        Locale locale8 = Locale.US;
                        map.put("." + strN2 + ",." + strN2 + " *", str25 + strV10 + str26);
                        it = it;
                        str = str211;
                    }
                    str = str;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i5 = 0;
                    while (i5 < length2) {
                        obj = spans[i5];
                        Object[] objArr15 = spans;
                        z2 = obj instanceof StrikethroughSpan;
                        String str212 = null;
                        if (z2) {
                            str16 = str26;
                            str17 = str25;
                            i8 = length2;
                            strU = "<span style='text-decoration:line-through;'>";
                        } else {
                            i8 = length2;
                            if (obj instanceof ForegroundColorSpan) {
                                String strV11 = AbstractC1474fG.V(((ForegroundColorSpan) obj).getForegroundColor());
                                int i310 = Lr0.a;
                                Locale locale9 = Locale.US;
                                str16 = str26;
                                strU = AbstractC1701hf0.u("<span style='color:", strV11, str10);
                                str17 = str25;
                            } else {
                                str16 = str26;
                                if (obj instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj).getBackgroundColor();
                                    int i311 = Lr0.a;
                                    Locale locale10 = Locale.US;
                                    str17 = str25;
                                    strU = AbstractC1674hK.p("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    str17 = str25;
                                    if (obj instanceof SC) {
                                        strU = "<span style='text-combine-upright:all;'>";
                                    } else if (obj instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr16 = {Float.valueOf(size)};
                                        int i312 = Lr0.a;
                                        strU = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr16);
                                    } else if (obj instanceof RelativeSizeSpan) {
                                        Object[] objArr17 = {Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f)};
                                        int i313 = Lr0.a;
                                        strU = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr17);
                                    } else if (obj instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj).getFamily();
                                        if (family != null) {
                                            int i314 = Lr0.a;
                                            Locale locale11 = Locale.US;
                                            strU = AbstractC1701hf0.u("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strU = null;
                                        }
                                    } else if (obj instanceof StyleSpan) {
                                        style = ((StyleSpan) obj).getStyle();
                                        if (style != 1) {
                                            strU = "<b>";
                                        } else if (style != 2) {
                                            strU = "<i>";
                                        } else if (style != 3) {
                                            strU = null;
                                        } else {
                                            strU = "<b><i>";
                                        }
                                    } else if (obj instanceof R80) {
                                        i12 = ((R80) obj).b;
                                        if (i12 != -1) {
                                            strU = "<ruby style='ruby-position:unset;'>";
                                        } else if (i12 != 1) {
                                            strU = "<ruby style='ruby-position:over;'>";
                                        } else if (i12 != 2) {
                                            strU = null;
                                        } else {
                                            strU = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj instanceof UnderlineSpan) {
                                        strU = "<u>";
                                    } else if (obj instanceof Ki0) {
                                        ki0 = (Ki0) obj;
                                        i9 = ki0.a;
                                        sb3 = new StringBuilder();
                                        i10 = ki0.b;
                                        if (i10 != 1) {
                                            i11 = 2;
                                            if (i10 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i11 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i9 != 0) {
                                            sb3.append("none");
                                        } else if (i9 != 1) {
                                            sb3.append("circle");
                                        } else if (i9 != i11) {
                                            sb3.append("dot");
                                        } else if (i9 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (ki0.c != 2) {
                                            str18 = "over right";
                                        } else {
                                            str18 = "under left";
                                        }
                                        Object[] objArr18 = {string2, str18};
                                        int i315 = Lr0.a;
                                        strU = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr18);
                                    } else {
                                        strU = null;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            str19 = "</span>";
                        } else {
                            str19 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj);
                        spanEnd = spanned.getSpanEnd(obj);
                        if (strU != null) {
                            str19.getClass();
                            C2576qf0 c2576qf1 = new C2576qf0(spanStart, spanEnd, strU, str19);
                            c2672rf0 = (C2672rf0) sparseArray.get(spanStart);
                            if (c2672rf0 == null) {
                                c2672rf0 = new C2672rf0();
                                sparseArray.put(spanStart, c2672rf0);
                            }
                            c2672rf0.a.add(c2576qf1);
                            c2672rf1 = (C2672rf0) sparseArray.get(spanEnd);
                            if (c2672rf1 == null) {
                                c2672rf1 = new C2672rf0();
                                sparseArray.put(spanEnd, c2672rf1);
                            }
                            c2672rf1.b.add(c2576qf1);
                        }
                        i5++;
                        spans = objArr15;
                        length2 = i8;
                        str26 = str16;
                        str25 = str17;
                        f2 = f2;
                        str10 = str10;
                    }
                    str13 = str26;
                    str14 = str10;
                    str15 = str25;
                    sb2 = new StringBuilder(spanned.length());
                    i6 = 0;
                    i7 = 0;
                    while (i6 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i6);
                        sb2.append(AbstractC2769sf0.a(spanned.subSequence(i7, iKeyAt2)));
                        C2672rf0 c2672rf3 = (C2672rf0) sparseArray.get(iKeyAt2);
                        Collections.sort(c2672rf3.b, C2576qf0.f);
                        it2 = c2672rf3.b.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((C2576qf0) it2.next()).d);
                        }
                        ArrayList arrayList2 = c2672rf3.a;
                        Collections.sort(arrayList2, C2576qf0.e);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((C2576qf0) it3.next()).c);
                        }
                        i6++;
                        i7 = iKeyAt2;
                    }
                    sb2.append(AbstractC2769sf0.a(spanned.subSequence(i7, spanned.length())));
                    j2 = new J2(9, sb2.toString(), false);
                }
                while (r0.hasNext()) {
                    str24 = (String) map2.put(str30, (String) map2.get(str30));
                    if (str24 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    AbstractC0397Ej.f(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i23);
                Float fValueOf6 = Float.valueOf(f5);
                Integer numValueOf8 = Integer.valueOf(i26);
                Integer numValueOf9 = Integer.valueOf(i24);
                f3 = c3162wi.B;
                if (f3 != 0.0f) {
                    if (i27 != 2) {
                        str23 = "skewY";
                    } else {
                        str23 = "skewY";
                    }
                    Object[] objArr19 = {str23, Float.valueOf(f3)};
                    int i316 = Lr0.a;
                    str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr19);
                } else {
                    str20 = str12;
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, str8, fValueOf6, str7, str, str9, str2, str11, str210, strB3, strV9, numValueOf8, numValueOf9, str20));
                sb.append("<span class='default_bg'>");
                str21 = j2.m;
                alignment2 = c3162wi.n;
                if (alignment2 != null) {
                    i13 = Qv0.a[alignment2.ordinal()];
                    if (i13 != 1) {
                        str22 = str3;
                    } else if (i13 != 2) {
                        str22 = "center";
                    } else {
                        str22 = str4;
                    }
                    sb.append("<span style='display:inline-block; text-align:" + str22 + str14);
                    sb.append(str21);
                    sb.append("</span>");
                } else {
                    sb.append(str21);
                }
                sb.append("</span></div>");
                i23++;
                c = 0;
                i15 = 1;
                rv0 = this;
                sb4 = sb;
                str26 = str13;
                str25 = str15;
                i14 = 2;
            }
            str13 = str26;
            str14 = ";'>";
            str15 = str25;
            while (r0.hasNext()) {
                str24 = (String) map2.put(str30, (String) map2.get(str30));
                if (str24 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                AbstractC0397Ej.f(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i23);
            Float fValueOf7 = Float.valueOf(f5);
            Integer numValueOf11 = Integer.valueOf(i26);
            Integer numValueOf12 = Integer.valueOf(i24);
            f3 = c3162wi.B;
            if (f3 != 0.0f) {
                if (i27 != 2) {
                    str23 = "skewY";
                } else {
                    str23 = "skewY";
                }
                Object[] objArr110 = {str23, Float.valueOf(f3)};
                int i317 = Lr0.a;
                str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr110);
            } else {
                str20 = str12;
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, str8, fValueOf7, str7, str, str9, str2, str11, str210, strB3, strV9, numValueOf11, numValueOf12, str20));
            sb.append("<span class='default_bg'>");
            str21 = j2.m;
            alignment2 = c3162wi.n;
            if (alignment2 != null) {
                i13 = Qv0.a[alignment2.ordinal()];
                if (i13 != 1) {
                    str22 = str3;
                } else if (i13 != 2) {
                    str22 = "center";
                } else {
                    str22 = str4;
                }
                sb.append("<span style='display:inline-block; text-align:" + str22 + str14);
                sb.append(str21);
                sb.append("</span>");
            } else {
                sb.append(str21);
            }
            sb.append("</span></div>");
            i23++;
            c = 0;
            i15 = 1;
            rv0 = this;
            sb4 = sb;
            str26 = str13;
            str25 = str15;
            i14 = 2;
        }
        StringBuilder sb6 = sb4;
        sb6.append("</div></body></html>");
        StringBuilder sb7 = new StringBuilder("<html><head><style>");
        for (String str31 : map2.keySet()) {
            sb7.append(str31);
            sb7.append("{");
            sb7.append((String) map2.get(str31));
            sb7.append("}");
        }
        sb7.append("</style></head>");
        sb6.insert(0, sb7.toString());
        this.m.loadData(Base64.encodeToString(sb6.toString().getBytes(AbstractC1402ed.c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.n.isEmpty()) {
            return;
        }
        c();
    }
}
