package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.fR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1485fR implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ G80 b;
    public final /* synthetic */ C1583gR c;

    public /* synthetic */ CallableC1485fR(C1583gR c1583gR, G80 g80, int i) {
        this.a = i;
        this.c = c1583gR;
        this.b = g80;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C1583gR c1583gR = this.c;
                F80 f80 = (F80) c1583gR.m;
                C0519Jb c0519Jb = (C0519Jb) c1583gR.f793o;
                Cursor cursorW = U9.w(f80, this.b);
                try {
                    int iM = AbstractC3409z9.m(cursorW, "id");
                    int iM2 = AbstractC3409z9.m(cursorW, "title");
                    int iM3 = AbstractC3409z9.m(cursorW, "overview");
                    int iM4 = AbstractC3409z9.m(cursorW, "runtime");
                    int iM5 = AbstractC3409z9.m(cursorW, "trailer");
                    int iM6 = AbstractC3409z9.m(cursorW, "quality");
                    int iM7 = AbstractC3409z9.m(cursorW, "rating");
                    int iM8 = AbstractC3409z9.m(cursorW, "poster");
                    int iM9 = AbstractC3409z9.m(cursorW, "banner");
                    int iM10 = AbstractC3409z9.m(cursorW, "released");
                    int iM11 = AbstractC3409z9.m(cursorW, "isFavorite");
                    int iM12 = AbstractC3409z9.m(cursorW, "isWatched");
                    int iM13 = AbstractC3409z9.m(cursorW, "watchedDate");
                    int iM14 = AbstractC3409z9.m(cursorW, "lastEngagementTimeUtcMillis");
                    int iM15 = AbstractC3409z9.m(cursorW, "lastPlaybackPositionMillis");
                    int iM16 = AbstractC3409z9.m(cursorW, "durationMillis");
                    C1387eR c1387eR = null;
                    String string = null;
                    if (cursorW.moveToFirst()) {
                        C2123lv0 c2123lv0 = (cursorW.isNull(iM14) && cursorW.isNull(iM15) && cursorW.isNull(iM16)) ? null : new C2123lv0(cursorW.getLong(iM14), cursorW.getLong(iM15), cursorW.getLong(iM16));
                        C1387eR c1387eR2 = new C1387eR();
                        String string2 = cursorW.getString(iM);
                        AbstractC1474fG.j(string2, "<set-?>");
                        c1387eR2.a = string2;
                        String string3 = cursorW.getString(iM2);
                        AbstractC1474fG.j(string3, "<set-?>");
                        c1387eR2.b = string3;
                        c1387eR2.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                        c1387eR2.d = cursorW.isNull(iM4) ? null : Integer.valueOf(cursorW.getInt(iM4));
                        c1387eR2.e = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                        c1387eR2.f = cursorW.isNull(iM6) ? null : cursorW.getString(iM6);
                        c1387eR2.g = cursorW.isNull(iM7) ? null : Double.valueOf(cursorW.getDouble(iM7));
                        c1387eR2.h = cursorW.isNull(iM8) ? null : cursorW.getString(iM8);
                        c1387eR2.i = cursorW.isNull(iM9) ? null : cursorW.getString(iM9);
                        String string4 = cursorW.isNull(iM10) ? null : cursorW.getString(iM10);
                        c0519Jb.getClass();
                        c1387eR2.f754o = C0519Jb.H(string4);
                        c1387eR2.p = cursorW.getInt(iM11) != 0;
                        c1387eR2.q = cursorW.getInt(iM12) != 0;
                        if (!cursorW.isNull(iM13)) {
                            string = cursorW.getString(iM13);
                        }
                        c1387eR2.r = C0519Jb.H(string);
                        c1387eR2.s = c2123lv0;
                        c1387eR = c1387eR2;
                    }
                    return c1387eR;
                } finally {
                    cursorW.close();
                }
            case 1:
                String str = "<set-?>";
                C1583gR c1583gR2 = this.c;
                F80 f81 = (F80) c1583gR2.m;
                C0519Jb c0519Jb2 = (C0519Jb) c1583gR2.f793o;
                Cursor cursorW2 = U9.w(f81, this.b);
                try {
                    int iM17 = AbstractC3409z9.m(cursorW2, "id");
                    int iM18 = AbstractC3409z9.m(cursorW2, "title");
                    int iM19 = AbstractC3409z9.m(cursorW2, "overview");
                    int iM20 = AbstractC3409z9.m(cursorW2, "runtime");
                    int iM21 = AbstractC3409z9.m(cursorW2, "trailer");
                    int iM22 = AbstractC3409z9.m(cursorW2, "quality");
                    int iM23 = AbstractC3409z9.m(cursorW2, "rating");
                    int iM24 = AbstractC3409z9.m(cursorW2, "poster");
                    int iM25 = AbstractC3409z9.m(cursorW2, "banner");
                    int iM26 = AbstractC3409z9.m(cursorW2, "released");
                    int iM27 = AbstractC3409z9.m(cursorW2, "isFavorite");
                    int iM28 = AbstractC3409z9.m(cursorW2, "isWatched");
                    int iM29 = AbstractC3409z9.m(cursorW2, "watchedDate");
                    int iM30 = AbstractC3409z9.m(cursorW2, "lastEngagementTimeUtcMillis");
                    int i = iM28;
                    int iM31 = AbstractC3409z9.m(cursorW2, "lastPlaybackPositionMillis");
                    int i2 = iM27;
                    int iM32 = AbstractC3409z9.m(cursorW2, "durationMillis");
                    int i3 = iM26;
                    ArrayList arrayList = new ArrayList(cursorW2.getCount());
                    while (cursorW2.moveToNext()) {
                        C2123lv0 c2123lv1 = (cursorW2.isNull(iM30) && cursorW2.isNull(iM31) && cursorW2.isNull(iM32)) ? null : new C2123lv0(cursorW2.getLong(iM30), cursorW2.getLong(iM31), cursorW2.getLong(iM32));
                        C1387eR c1387eR3 = new C1387eR();
                        int i4 = iM32;
                        String string5 = cursorW2.getString(iM17);
                        AbstractC1474fG.j(string5, str);
                        c1387eR3.a = string5;
                        String string6 = cursorW2.getString(iM18);
                        AbstractC1474fG.j(string6, str);
                        c1387eR3.b = string6;
                        c1387eR3.c = cursorW2.isNull(iM19) ? null : cursorW2.getString(iM19);
                        c1387eR3.d = cursorW2.isNull(iM20) ? null : Integer.valueOf(cursorW2.getInt(iM20));
                        c1387eR3.e = cursorW2.isNull(iM21) ? null : cursorW2.getString(iM21);
                        c1387eR3.f = cursorW2.isNull(iM22) ? null : cursorW2.getString(iM22);
                        c1387eR3.g = cursorW2.isNull(iM23) ? null : Double.valueOf(cursorW2.getDouble(iM23));
                        c1387eR3.h = cursorW2.isNull(iM24) ? null : cursorW2.getString(iM24);
                        c1387eR3.i = cursorW2.isNull(iM25) ? null : cursorW2.getString(iM25);
                        int i5 = i3;
                        String string7 = cursorW2.isNull(i5) ? null : cursorW2.getString(i5);
                        c0519Jb2.getClass();
                        String str2 = str;
                        c1387eR3.f754o = C0519Jb.H(string7);
                        i2 = i2;
                        c1387eR3.p = cursorW2.getInt(i2) != 0;
                        i = i;
                        c1387eR3.q = cursorW2.getInt(i) != 0;
                        int i6 = iM29;
                        iM29 = i6;
                        c1387eR3.r = C0519Jb.H(cursorW2.isNull(i6) ? null : cursorW2.getString(i6));
                        c1387eR3.s = c2123lv1;
                        arrayList.add(c1387eR3);
                        i3 = i5;
                        iM30 = iM30;
                        iM32 = i4;
                        str = str2;
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorW2.close();
                }
            case 2:
                String str3 = "<set-?>";
                C1583gR c1583gR3 = this.c;
                F80 f82 = (F80) c1583gR3.m;
                C0519Jb c0519Jb3 = (C0519Jb) c1583gR3.f793o;
                Cursor cursorW3 = U9.w(f82, this.b);
                try {
                    int iM33 = AbstractC3409z9.m(cursorW3, "id");
                    int iM34 = AbstractC3409z9.m(cursorW3, "title");
                    int iM35 = AbstractC3409z9.m(cursorW3, "overview");
                    int iM36 = AbstractC3409z9.m(cursorW3, "runtime");
                    int iM37 = AbstractC3409z9.m(cursorW3, "trailer");
                    int iM38 = AbstractC3409z9.m(cursorW3, "quality");
                    int iM39 = AbstractC3409z9.m(cursorW3, "rating");
                    int iM40 = AbstractC3409z9.m(cursorW3, "poster");
                    int iM41 = AbstractC3409z9.m(cursorW3, "banner");
                    int iM42 = AbstractC3409z9.m(cursorW3, "released");
                    int iM43 = AbstractC3409z9.m(cursorW3, "isFavorite");
                    int iM44 = AbstractC3409z9.m(cursorW3, "isWatched");
                    int iM45 = AbstractC3409z9.m(cursorW3, "watchedDate");
                    int iM46 = AbstractC3409z9.m(cursorW3, "lastEngagementTimeUtcMillis");
                    int i7 = iM44;
                    int iM47 = AbstractC3409z9.m(cursorW3, "lastPlaybackPositionMillis");
                    int i8 = iM43;
                    int iM48 = AbstractC3409z9.m(cursorW3, "durationMillis");
                    int i9 = iM42;
                    ArrayList arrayList2 = new ArrayList(cursorW3.getCount());
                    while (cursorW3.moveToNext()) {
                        C2123lv0 c2123lv2 = (cursorW3.isNull(iM46) && cursorW3.isNull(iM47) && cursorW3.isNull(iM48)) ? null : new C2123lv0(cursorW3.getLong(iM46), cursorW3.getLong(iM47), cursorW3.getLong(iM48));
                        C1387eR c1387eR4 = new C1387eR();
                        int i10 = iM48;
                        String string8 = cursorW3.getString(iM33);
                        AbstractC1474fG.j(string8, str3);
                        c1387eR4.a = string8;
                        String string9 = cursorW3.getString(iM34);
                        AbstractC1474fG.j(string9, str3);
                        c1387eR4.b = string9;
                        c1387eR4.c = cursorW3.isNull(iM35) ? null : cursorW3.getString(iM35);
                        c1387eR4.d = cursorW3.isNull(iM36) ? null : Integer.valueOf(cursorW3.getInt(iM36));
                        c1387eR4.e = cursorW3.isNull(iM37) ? null : cursorW3.getString(iM37);
                        c1387eR4.f = cursorW3.isNull(iM38) ? null : cursorW3.getString(iM38);
                        c1387eR4.g = cursorW3.isNull(iM39) ? null : Double.valueOf(cursorW3.getDouble(iM39));
                        c1387eR4.h = cursorW3.isNull(iM40) ? null : cursorW3.getString(iM40);
                        c1387eR4.i = cursorW3.isNull(iM41) ? null : cursorW3.getString(iM41);
                        int i11 = i9;
                        String string10 = cursorW3.isNull(i11) ? null : cursorW3.getString(i11);
                        c0519Jb3.getClass();
                        String str4 = str3;
                        c1387eR4.f754o = C0519Jb.H(string10);
                        i8 = i8;
                        c1387eR4.p = cursorW3.getInt(i8) != 0;
                        i7 = i7;
                        c1387eR4.q = cursorW3.getInt(i7) != 0;
                        int i12 = iM45;
                        iM45 = i12;
                        c1387eR4.r = C0519Jb.H(cursorW3.isNull(i12) ? null : cursorW3.getString(i12));
                        c1387eR4.s = c2123lv2;
                        arrayList2.add(c1387eR4);
                        i9 = i11;
                        iM46 = iM46;
                        iM48 = i10;
                        str3 = str4;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cursorW3.close();
                }
            default:
                String str5 = "<set-?>";
                C1583gR c1583gR4 = this.c;
                F80 f83 = (F80) c1583gR4.m;
                C0519Jb c0519Jb4 = (C0519Jb) c1583gR4.f793o;
                Cursor cursorW4 = U9.w(f83, this.b);
                try {
                    int iM49 = AbstractC3409z9.m(cursorW4, "id");
                    int iM50 = AbstractC3409z9.m(cursorW4, "title");
                    int iM51 = AbstractC3409z9.m(cursorW4, "overview");
                    int iM52 = AbstractC3409z9.m(cursorW4, "runtime");
                    int iM53 = AbstractC3409z9.m(cursorW4, "trailer");
                    int iM54 = AbstractC3409z9.m(cursorW4, "quality");
                    int iM55 = AbstractC3409z9.m(cursorW4, "rating");
                    int iM56 = AbstractC3409z9.m(cursorW4, "poster");
                    int iM57 = AbstractC3409z9.m(cursorW4, "banner");
                    int iM58 = AbstractC3409z9.m(cursorW4, "released");
                    int iM59 = AbstractC3409z9.m(cursorW4, "isFavorite");
                    int iM60 = AbstractC3409z9.m(cursorW4, "isWatched");
                    int iM61 = AbstractC3409z9.m(cursorW4, "watchedDate");
                    int iM62 = AbstractC3409z9.m(cursorW4, "lastEngagementTimeUtcMillis");
                    int i13 = iM60;
                    int iM63 = AbstractC3409z9.m(cursorW4, "lastPlaybackPositionMillis");
                    int i14 = iM59;
                    int iM64 = AbstractC3409z9.m(cursorW4, "durationMillis");
                    int i15 = iM58;
                    ArrayList arrayList3 = new ArrayList(cursorW4.getCount());
                    while (cursorW4.moveToNext()) {
                        C2123lv0 c2123lv3 = (cursorW4.isNull(iM62) && cursorW4.isNull(iM63) && cursorW4.isNull(iM64)) ? null : new C2123lv0(cursorW4.getLong(iM62), cursorW4.getLong(iM63), cursorW4.getLong(iM64));
                        C1387eR c1387eR5 = new C1387eR();
                        int i16 = iM64;
                        String string11 = cursorW4.getString(iM49);
                        AbstractC1474fG.j(string11, str5);
                        c1387eR5.a = string11;
                        String string12 = cursorW4.getString(iM50);
                        AbstractC1474fG.j(string12, str5);
                        c1387eR5.b = string12;
                        c1387eR5.c = cursorW4.isNull(iM51) ? null : cursorW4.getString(iM51);
                        c1387eR5.d = cursorW4.isNull(iM52) ? null : Integer.valueOf(cursorW4.getInt(iM52));
                        c1387eR5.e = cursorW4.isNull(iM53) ? null : cursorW4.getString(iM53);
                        c1387eR5.f = cursorW4.isNull(iM54) ? null : cursorW4.getString(iM54);
                        c1387eR5.g = cursorW4.isNull(iM55) ? null : Double.valueOf(cursorW4.getDouble(iM55));
                        c1387eR5.h = cursorW4.isNull(iM56) ? null : cursorW4.getString(iM56);
                        c1387eR5.i = cursorW4.isNull(iM57) ? null : cursorW4.getString(iM57);
                        int i17 = i15;
                        String string13 = cursorW4.isNull(i17) ? null : cursorW4.getString(i17);
                        c0519Jb4.getClass();
                        String str6 = str5;
                        c1387eR5.f754o = C0519Jb.H(string13);
                        i14 = i14;
                        c1387eR5.p = cursorW4.getInt(i14) != 0;
                        i13 = i13;
                        c1387eR5.q = cursorW4.getInt(i13) != 0;
                        int i18 = iM61;
                        iM61 = i18;
                        c1387eR5.r = C0519Jb.H(cursorW4.isNull(i18) ? null : cursorW4.getString(i18));
                        c1387eR5.s = c2123lv3;
                        arrayList3.add(c1387eR5);
                        i15 = i17;
                        iM62 = iM62;
                        iM64 = i16;
                        str5 = str6;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cursorW4.close();
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.l();
                break;
            case 1:
                this.b.l();
                break;
            case 2:
                this.b.l();
                break;
            default:
                this.b.l();
                break;
        }
    }
}
