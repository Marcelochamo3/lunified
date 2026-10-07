package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0534Jq implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ G80 b;
    public final /* synthetic */ C0560Kq c;

    public /* synthetic */ CallableC0534Jq(C0560Kq c0560Kq, G80 g80, int i) {
        this.a = i;
        this.c = c0560Kq;
        this.b = g80;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C0560Kq c0560Kq = this.c;
                F80 f80 = (F80) c0560Kq.m;
                C0519Jb c0519Jb = (C0519Jb) c0560Kq.f370o;
                Cursor cursorW = U9.w(f80, this.b);
                try {
                    int iM = AbstractC3409z9.m(cursorW, "id");
                    int iM2 = AbstractC3409z9.m(cursorW, "number");
                    int iM3 = AbstractC3409z9.m(cursorW, "title");
                    int iM4 = AbstractC3409z9.m(cursorW, "poster");
                    int iM5 = AbstractC3409z9.m(cursorW, "tvShow");
                    int iM6 = AbstractC3409z9.m(cursorW, "season");
                    int iM7 = AbstractC3409z9.m(cursorW, "released");
                    int iM8 = AbstractC3409z9.m(cursorW, "isWatched");
                    int iM9 = AbstractC3409z9.m(cursorW, "watchedDate");
                    int iM10 = AbstractC3409z9.m(cursorW, "lastEngagementTimeUtcMillis");
                    int iM11 = AbstractC3409z9.m(cursorW, "lastPlaybackPositionMillis");
                    int iM12 = AbstractC3409z9.m(cursorW, "durationMillis");
                    ArrayList arrayList = new ArrayList(cursorW.getCount());
                    while (cursorW.moveToNext()) {
                        String string = null;
                        C2123lv0 c2123lv0 = (cursorW.isNull(iM10) && cursorW.isNull(iM11) && cursorW.isNull(iM12)) ? null : new C2123lv0(cursorW.getLong(iM10), cursorW.getLong(iM11), cursorW.getLong(iM12));
                        C0456Gq c0456Gq = new C0456Gq();
                        int i = iM11;
                        String string2 = cursorW.getString(iM);
                        int i2 = iM;
                        AbstractC1474fG.j(string2, "<set-?>");
                        c0456Gq.a = string2;
                        c0456Gq.b = cursorW.getInt(iM2);
                        c0456Gq.c = cursorW.isNull(iM3) ? null : cursorW.getString(iM3);
                        c0456Gq.d = cursorW.isNull(iM4) ? null : cursorW.getString(iM4);
                        String string3 = cursorW.isNull(iM5) ? null : cursorW.getString(iM5);
                        c0519Jb.getClass();
                        c0456Gq.e = C0519Jb.L(string3);
                        c0456Gq.f = C0519Jb.I(cursorW.isNull(iM6) ? null : cursorW.getString(iM6));
                        c0456Gq.g = C0519Jb.H(cursorW.isNull(iM7) ? null : cursorW.getString(iM7));
                        c0456Gq.h = cursorW.getInt(iM8) != 0;
                        if (!cursorW.isNull(iM9)) {
                            string = cursorW.getString(iM9);
                        }
                        c0456Gq.i = C0519Jb.H(string);
                        c0456Gq.j = c2123lv0;
                        arrayList.add(c0456Gq);
                        iM10 = iM10;
                        iM11 = i;
                        iM = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorW.close();
                }
            case 1:
                C0560Kq c0560Kq2 = this.c;
                F80 f81 = (F80) c0560Kq2.m;
                C0519Jb c0519Jb2 = (C0519Jb) c0560Kq2.f370o;
                Cursor cursorW2 = U9.w(f81, this.b);
                try {
                    int iM13 = AbstractC3409z9.m(cursorW2, "id");
                    int iM14 = AbstractC3409z9.m(cursorW2, "number");
                    int iM15 = AbstractC3409z9.m(cursorW2, "title");
                    int iM16 = AbstractC3409z9.m(cursorW2, "poster");
                    int iM17 = AbstractC3409z9.m(cursorW2, "tvShow");
                    int iM18 = AbstractC3409z9.m(cursorW2, "season");
                    int iM19 = AbstractC3409z9.m(cursorW2, "released");
                    int iM20 = AbstractC3409z9.m(cursorW2, "isWatched");
                    int iM21 = AbstractC3409z9.m(cursorW2, "watchedDate");
                    int iM22 = AbstractC3409z9.m(cursorW2, "lastEngagementTimeUtcMillis");
                    int iM23 = AbstractC3409z9.m(cursorW2, "lastPlaybackPositionMillis");
                    int iM24 = AbstractC3409z9.m(cursorW2, "durationMillis");
                    ArrayList arrayList2 = new ArrayList(cursorW2.getCount());
                    while (cursorW2.moveToNext()) {
                        String string4 = null;
                        C2123lv0 c2123lv1 = (cursorW2.isNull(iM22) && cursorW2.isNull(iM23) && cursorW2.isNull(iM24)) ? null : new C2123lv0(cursorW2.getLong(iM22), cursorW2.getLong(iM23), cursorW2.getLong(iM24));
                        C0456Gq c0456Gq2 = new C0456Gq();
                        int i3 = iM23;
                        String string5 = cursorW2.getString(iM13);
                        int i4 = iM13;
                        AbstractC1474fG.j(string5, "<set-?>");
                        c0456Gq2.a = string5;
                        c0456Gq2.b = cursorW2.getInt(iM14);
                        c0456Gq2.c = cursorW2.isNull(iM15) ? null : cursorW2.getString(iM15);
                        c0456Gq2.d = cursorW2.isNull(iM16) ? null : cursorW2.getString(iM16);
                        String string6 = cursorW2.isNull(iM17) ? null : cursorW2.getString(iM17);
                        c0519Jb2.getClass();
                        c0456Gq2.e = C0519Jb.L(string6);
                        c0456Gq2.f = C0519Jb.I(cursorW2.isNull(iM18) ? null : cursorW2.getString(iM18));
                        c0456Gq2.g = C0519Jb.H(cursorW2.isNull(iM19) ? null : cursorW2.getString(iM19));
                        c0456Gq2.h = cursorW2.getInt(iM20) != 0;
                        if (!cursorW2.isNull(iM21)) {
                            string4 = cursorW2.getString(iM21);
                        }
                        c0456Gq2.i = C0519Jb.H(string4);
                        c0456Gq2.j = c2123lv1;
                        arrayList2.add(c0456Gq2);
                        iM22 = iM22;
                        iM23 = i3;
                        iM13 = i4;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cursorW2.close();
                }
            default:
                C0560Kq c0560Kq3 = this.c;
                F80 f82 = (F80) c0560Kq3.m;
                C0519Jb c0519Jb3 = (C0519Jb) c0560Kq3.f370o;
                Cursor cursorW3 = U9.w(f82, this.b);
                try {
                    int iM25 = AbstractC3409z9.m(cursorW3, "id");
                    int iM26 = AbstractC3409z9.m(cursorW3, "number");
                    int iM27 = AbstractC3409z9.m(cursorW3, "title");
                    int iM28 = AbstractC3409z9.m(cursorW3, "poster");
                    int iM29 = AbstractC3409z9.m(cursorW3, "tvShow");
                    int iM30 = AbstractC3409z9.m(cursorW3, "season");
                    int iM31 = AbstractC3409z9.m(cursorW3, "released");
                    int iM32 = AbstractC3409z9.m(cursorW3, "isWatched");
                    int iM33 = AbstractC3409z9.m(cursorW3, "watchedDate");
                    int iM34 = AbstractC3409z9.m(cursorW3, "lastEngagementTimeUtcMillis");
                    int iM35 = AbstractC3409z9.m(cursorW3, "lastPlaybackPositionMillis");
                    int iM36 = AbstractC3409z9.m(cursorW3, "durationMillis");
                    ArrayList arrayList3 = new ArrayList(cursorW3.getCount());
                    while (cursorW3.moveToNext()) {
                        String string7 = null;
                        C2123lv0 c2123lv2 = (cursorW3.isNull(iM34) && cursorW3.isNull(iM35) && cursorW3.isNull(iM36)) ? null : new C2123lv0(cursorW3.getLong(iM34), cursorW3.getLong(iM35), cursorW3.getLong(iM36));
                        C0456Gq c0456Gq3 = new C0456Gq();
                        int i5 = iM35;
                        String string8 = cursorW3.getString(iM25);
                        int i6 = iM25;
                        AbstractC1474fG.j(string8, "<set-?>");
                        c0456Gq3.a = string8;
                        c0456Gq3.b = cursorW3.getInt(iM26);
                        c0456Gq3.c = cursorW3.isNull(iM27) ? null : cursorW3.getString(iM27);
                        c0456Gq3.d = cursorW3.isNull(iM28) ? null : cursorW3.getString(iM28);
                        String string9 = cursorW3.isNull(iM29) ? null : cursorW3.getString(iM29);
                        c0519Jb3.getClass();
                        c0456Gq3.e = C0519Jb.L(string9);
                        c0456Gq3.f = C0519Jb.I(cursorW3.isNull(iM30) ? null : cursorW3.getString(iM30));
                        c0456Gq3.g = C0519Jb.H(cursorW3.isNull(iM31) ? null : cursorW3.getString(iM31));
                        c0456Gq3.h = cursorW3.getInt(iM32) != 0;
                        if (!cursorW3.isNull(iM33)) {
                            string7 = cursorW3.getString(iM33);
                        }
                        c0456Gq3.i = C0519Jb.H(string7);
                        c0456Gq3.j = c2123lv2;
                        arrayList3.add(c0456Gq3);
                        iM34 = iM34;
                        iM35 = i5;
                        iM25 = i6;
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
