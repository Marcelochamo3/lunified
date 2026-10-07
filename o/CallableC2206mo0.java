package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.mo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2206mo0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ G80 b;
    public final /* synthetic */ C2303no0 c;

    public /* synthetic */ CallableC2206mo0(C2303no0 c2303no0, G80 g80, int i) {
        this.a = i;
        this.c = c2303no0;
        this.b = g80;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C2303no0 c2303no0 = this.c;
                Cursor cursorW = U9.w((F80) c2303no0.m, this.b);
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
                    int iM10 = AbstractC3409z9.m(cursorW, "serieId");
                    int iM11 = AbstractC3409z9.m(cursorW, "released");
                    int iM12 = AbstractC3409z9.m(cursorW, "isFavorite");
                    C2109lo0 c2109lo0 = null;
                    String string = null;
                    if (cursorW.moveToFirst()) {
                        C2109lo0 c2109lo1 = new C2109lo0();
                        String string2 = cursorW.getString(iM);
                        AbstractC1474fG.j(string2, "<set-?>");
                        c2109lo1.a = string2;
                        String string3 = cursorW.getString(iM2);
                        AbstractC1474fG.j(string3, "<set-?>");
                        c2109lo1.b = string3;
                        c2109lo1.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                        c2109lo1.d = cursorW.isNull(iM4) ? null : Integer.valueOf(cursorW.getInt(iM4));
                        c2109lo1.e = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                        c2109lo1.f = cursorW.isNull(iM6) ? null : cursorW.getString(iM6);
                        c2109lo1.g = cursorW.isNull(iM7) ? null : Double.valueOf(cursorW.getDouble(iM7));
                        c2109lo1.h = cursorW.isNull(iM8) ? null : cursorW.getString(iM8);
                        c2109lo1.i = cursorW.isNull(iM9) ? null : cursorW.getString(iM9);
                        c2109lo1.j = cursorW.isNull(iM10) ? null : cursorW.getString(iM10);
                        if (!cursorW.isNull(iM11)) {
                            string = cursorW.getString(iM11);
                        }
                        ((C0519Jb) c2303no0.f941o).getClass();
                        c2109lo1.p = C0519Jb.H(string);
                        c2109lo1.q = cursorW.getInt(iM12) != 0;
                        c2109lo0 = c2109lo1;
                    }
                    return c2109lo0;
                } finally {
                    cursorW.close();
                }
            case 1:
                String str = "<set-?>";
                C2303no0 c2303no1 = this.c;
                Cursor cursorW2 = U9.w((F80) c2303no1.m, this.b);
                try {
                    int iM13 = AbstractC3409z9.m(cursorW2, "id");
                    int iM14 = AbstractC3409z9.m(cursorW2, "title");
                    int iM15 = AbstractC3409z9.m(cursorW2, "overview");
                    int iM16 = AbstractC3409z9.m(cursorW2, "runtime");
                    int iM17 = AbstractC3409z9.m(cursorW2, "trailer");
                    int iM18 = AbstractC3409z9.m(cursorW2, "quality");
                    int iM19 = AbstractC3409z9.m(cursorW2, "rating");
                    int iM20 = AbstractC3409z9.m(cursorW2, "poster");
                    int iM21 = AbstractC3409z9.m(cursorW2, "banner");
                    int iM22 = AbstractC3409z9.m(cursorW2, "serieId");
                    int iM23 = AbstractC3409z9.m(cursorW2, "released");
                    int iM24 = AbstractC3409z9.m(cursorW2, "isFavorite");
                    ArrayList arrayList = new ArrayList(cursorW2.getCount());
                    while (cursorW2.moveToNext()) {
                        C2109lo0 c2109lo2 = new C2109lo0();
                        ArrayList arrayList2 = arrayList;
                        String string4 = cursorW2.getString(iM13);
                        AbstractC1474fG.j(string4, str);
                        c2109lo2.a = string4;
                        String string5 = cursorW2.getString(iM14);
                        AbstractC1474fG.j(string5, str);
                        c2109lo2.b = string5;
                        String string6 = null;
                        c2109lo2.c = cursorW2.isNull(iM15) ? null : cursorW2.getString(iM15);
                        c2109lo2.d = cursorW2.isNull(iM16) ? null : Integer.valueOf(cursorW2.getInt(iM16));
                        c2109lo2.e = cursorW2.isNull(iM17) ? null : cursorW2.getString(iM17);
                        c2109lo2.f = cursorW2.isNull(iM18) ? null : cursorW2.getString(iM18);
                        c2109lo2.g = cursorW2.isNull(iM19) ? null : Double.valueOf(cursorW2.getDouble(iM19));
                        c2109lo2.h = cursorW2.isNull(iM20) ? null : cursorW2.getString(iM20);
                        c2109lo2.i = cursorW2.isNull(iM21) ? null : cursorW2.getString(iM21);
                        c2109lo2.j = cursorW2.isNull(iM22) ? null : cursorW2.getString(iM22);
                        if (!cursorW2.isNull(iM23)) {
                            string6 = cursorW2.getString(iM23);
                        }
                        ((C0519Jb) c2303no1.f941o).getClass();
                        c2109lo2.p = C0519Jb.H(string6);
                        int i = iM24;
                        c2109lo2.q = cursorW2.getInt(i) != 0;
                        arrayList2.add(c2109lo2);
                        iM24 = i;
                        arrayList = arrayList2;
                        str = str;
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorW2.close();
                }
            default:
                String str2 = "<set-?>";
                C2303no0 c2303no2 = this.c;
                Cursor cursorW3 = U9.w((F80) c2303no2.m, this.b);
                try {
                    int iM25 = AbstractC3409z9.m(cursorW3, "id");
                    int iM26 = AbstractC3409z9.m(cursorW3, "title");
                    int iM27 = AbstractC3409z9.m(cursorW3, "overview");
                    int iM28 = AbstractC3409z9.m(cursorW3, "runtime");
                    int iM29 = AbstractC3409z9.m(cursorW3, "trailer");
                    int iM30 = AbstractC3409z9.m(cursorW3, "quality");
                    int iM31 = AbstractC3409z9.m(cursorW3, "rating");
                    int iM32 = AbstractC3409z9.m(cursorW3, "poster");
                    int iM33 = AbstractC3409z9.m(cursorW3, "banner");
                    int iM34 = AbstractC3409z9.m(cursorW3, "serieId");
                    int iM35 = AbstractC3409z9.m(cursorW3, "released");
                    int iM36 = AbstractC3409z9.m(cursorW3, "isFavorite");
                    ArrayList arrayList3 = new ArrayList(cursorW3.getCount());
                    while (cursorW3.moveToNext()) {
                        C2109lo0 c2109lo3 = new C2109lo0();
                        ArrayList arrayList4 = arrayList3;
                        String string7 = cursorW3.getString(iM25);
                        AbstractC1474fG.j(string7, str2);
                        c2109lo3.a = string7;
                        String string8 = cursorW3.getString(iM26);
                        AbstractC1474fG.j(string8, str2);
                        c2109lo3.b = string8;
                        String string9 = null;
                        c2109lo3.c = cursorW3.isNull(iM27) ? null : cursorW3.getString(iM27);
                        c2109lo3.d = cursorW3.isNull(iM28) ? null : Integer.valueOf(cursorW3.getInt(iM28));
                        c2109lo3.e = cursorW3.isNull(iM29) ? null : cursorW3.getString(iM29);
                        c2109lo3.f = cursorW3.isNull(iM30) ? null : cursorW3.getString(iM30);
                        c2109lo3.g = cursorW3.isNull(iM31) ? null : Double.valueOf(cursorW3.getDouble(iM31));
                        c2109lo3.h = cursorW3.isNull(iM32) ? null : cursorW3.getString(iM32);
                        c2109lo3.i = cursorW3.isNull(iM33) ? null : cursorW3.getString(iM33);
                        c2109lo3.j = cursorW3.isNull(iM34) ? null : cursorW3.getString(iM34);
                        if (!cursorW3.isNull(iM35)) {
                            string9 = cursorW3.getString(iM35);
                        }
                        ((C0519Jb) c2303no2.f941o).getClass();
                        c2109lo3.p = C0519Jb.H(string9);
                        int i2 = iM36;
                        c2109lo3.q = cursorW3.getInt(i2) != 0;
                        arrayList4.add(c2109lo3);
                        iM36 = i2;
                        arrayList3 = arrayList4;
                        str2 = str2;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cursorW3.close();
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
            default:
                this.b.l();
                break;
        }
    }
}
