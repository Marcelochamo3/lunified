package o;

import java.util.Calendar;

/* JADX INFO: renamed from: o.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508Iq extends AbstractC0326Bq {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0508Iq(Object obj, F80 f80, int i) {
        super(f80, 0);
        this.d = i;
        this.e = obj;
    }

    @Override // o.AbstractC3347yd0
    public final String c() {
        switch (this.d) {
            case 0:
                return "UPDATE OR ABORT `episodes` SET `id` = ?,`number` = ?,`title` = ?,`poster` = ?,`tvShow` = ?,`season` = ?,`released` = ?,`isWatched` = ?,`watchedDate` = ?,`lastEngagementTimeUtcMillis` = ?,`lastPlaybackPositionMillis` = ?,`durationMillis` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `movies` SET `id` = ?,`title` = ?,`overview` = ?,`runtime` = ?,`trailer` = ?,`quality` = ?,`rating` = ?,`poster` = ?,`banner` = ?,`released` = ?,`isFavorite` = ?,`isWatched` = ?,`watchedDate` = ?,`lastEngagementTimeUtcMillis` = ?,`lastPlaybackPositionMillis` = ?,`durationMillis` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `tv_shows` SET `id` = ?,`title` = ?,`overview` = ?,`runtime` = ?,`trailer` = ?,`quality` = ?,`rating` = ?,`poster` = ?,`banner` = ?,`serieId` = ?,`released` = ?,`isFavorite` = ? WHERE `id` = ?";
        }
    }

    @Override // o.AbstractC0326Bq
    public final void e(C3485zy c3485zy, Object obj) {
        switch (this.d) {
            case 0:
                C0456Gq c0456Gq = (C0456Gq) obj;
                c3485zy.o(1, c0456Gq.a);
                c3485zy.J(2, c0456Gq.b);
                String str = c0456Gq.c;
                if (str == null) {
                    c3485zy.z(3);
                } else {
                    c3485zy.o(3, str);
                }
                String str2 = c0456Gq.d;
                if (str2 == null) {
                    c3485zy.z(4);
                } else {
                    c3485zy.o(4, str2);
                }
                C0560Kq c0560Kq = (C0560Kq) this.e;
                C0519Jb c0519Jb = (C0519Jb) c0560Kq.f370o;
                C2109lo0 c2109lo0 = c0456Gq.e;
                c0519Jb.getClass();
                String str3 = c2109lo0 != null ? c2109lo0.a : null;
                if (str3 == null) {
                    c3485zy.z(5);
                } else {
                    c3485zy.o(5, str3);
                }
                Ma0 ma0 = c0456Gq.f;
                ((C0519Jb) c0560Kq.f370o).getClass();
                String str4 = ma0 != null ? ma0.a : null;
                if (str4 == null) {
                    c3485zy.z(6);
                } else {
                    c3485zy.o(6, str4);
                }
                String strE = C0519Jb.E(c0456Gq.g);
                if (strE == null) {
                    c3485zy.z(7);
                } else {
                    c3485zy.o(7, strE);
                }
                c3485zy.J(8, c0456Gq.h ? 1L : 0L);
                String strE2 = C0519Jb.E(c0456Gq.i);
                if (strE2 == null) {
                    c3485zy.z(9);
                } else {
                    c3485zy.o(9, strE2);
                }
                C2123lv0 c2123lv0 = c0456Gq.j;
                if (c2123lv0 != null) {
                    c3485zy.J(10, c2123lv0.a);
                    c3485zy.J(11, c2123lv0.b);
                    c3485zy.J(12, c2123lv0.c);
                } else {
                    c3485zy.z(10);
                    c3485zy.z(11);
                    c3485zy.z(12);
                }
                c3485zy.o(13, c0456Gq.a);
                break;
            case 1:
                C1387eR c1387eR = (C1387eR) obj;
                c3485zy.o(1, c1387eR.a);
                c3485zy.o(2, c1387eR.b);
                String str5 = c1387eR.c;
                if (str5 == null) {
                    c3485zy.z(3);
                } else {
                    c3485zy.o(3, str5);
                }
                Integer num = c1387eR.d;
                if (num == null) {
                    c3485zy.z(4);
                } else {
                    c3485zy.J(4, num.intValue());
                }
                String str6 = c1387eR.e;
                if (str6 == null) {
                    c3485zy.z(5);
                } else {
                    c3485zy.o(5, str6);
                }
                String str7 = c1387eR.f;
                if (str7 == null) {
                    c3485zy.z(6);
                } else {
                    c3485zy.o(6, str7);
                }
                Double d = c1387eR.g;
                if (d == null) {
                    c3485zy.z(7);
                } else {
                    c3485zy.B(7, d.doubleValue());
                }
                String str8 = c1387eR.h;
                if (str8 == null) {
                    c3485zy.z(8);
                } else {
                    c3485zy.o(8, str8);
                }
                String str9 = c1387eR.i;
                if (str9 == null) {
                    c3485zy.z(9);
                } else {
                    c3485zy.o(9, str9);
                }
                C1583gR c1583gR = (C1583gR) this.e;
                C0519Jb c0519Jb2 = (C0519Jb) c1583gR.f793o;
                Calendar calendar = c1387eR.f754o;
                c0519Jb2.getClass();
                String strE3 = C0519Jb.E(calendar);
                if (strE3 == null) {
                    c3485zy.z(10);
                } else {
                    c3485zy.o(10, strE3);
                }
                c3485zy.J(11, c1387eR.p ? 1L : 0L);
                c3485zy.J(12, c1387eR.q ? 1L : 0L);
                Calendar calendar2 = c1387eR.r;
                ((C0519Jb) c1583gR.f793o).getClass();
                String strE4 = C0519Jb.E(calendar2);
                if (strE4 == null) {
                    c3485zy.z(13);
                } else {
                    c3485zy.o(13, strE4);
                }
                C2123lv0 c2123lv1 = c1387eR.s;
                if (c2123lv1 != null) {
                    c3485zy.J(14, c2123lv1.a);
                    c3485zy.J(15, c2123lv1.b);
                    c3485zy.J(16, c2123lv1.c);
                } else {
                    c3485zy.z(14);
                    c3485zy.z(15);
                    c3485zy.z(16);
                }
                c3485zy.o(17, c1387eR.a);
                break;
            default:
                C2109lo0 c2109lo1 = (C2109lo0) obj;
                c3485zy.o(1, c2109lo1.a);
                c3485zy.o(2, c2109lo1.b);
                String str10 = c2109lo1.c;
                if (str10 == null) {
                    c3485zy.z(3);
                } else {
                    c3485zy.o(3, str10);
                }
                Integer num2 = c2109lo1.d;
                if (num2 == null) {
                    c3485zy.z(4);
                } else {
                    c3485zy.J(4, num2.intValue());
                }
                String str11 = c2109lo1.e;
                if (str11 == null) {
                    c3485zy.z(5);
                } else {
                    c3485zy.o(5, str11);
                }
                String str12 = c2109lo1.f;
                if (str12 == null) {
                    c3485zy.z(6);
                } else {
                    c3485zy.o(6, str12);
                }
                Double d2 = c2109lo1.g;
                if (d2 == null) {
                    c3485zy.z(7);
                } else {
                    c3485zy.B(7, d2.doubleValue());
                }
                String str13 = c2109lo1.h;
                if (str13 == null) {
                    c3485zy.z(8);
                } else {
                    c3485zy.o(8, str13);
                }
                String str14 = c2109lo1.i;
                if (str14 == null) {
                    c3485zy.z(9);
                } else {
                    c3485zy.o(9, str14);
                }
                String str15 = c2109lo1.j;
                if (str15 == null) {
                    c3485zy.z(10);
                } else {
                    c3485zy.o(10, str15);
                }
                C0519Jb c0519Jb3 = (C0519Jb) ((C2303no0) this.e).f941o;
                Calendar calendar3 = c2109lo1.p;
                c0519Jb3.getClass();
                String strE5 = C0519Jb.E(calendar3);
                if (strE5 == null) {
                    c3485zy.z(11);
                } else {
                    c3485zy.o(11, strE5);
                }
                c3485zy.J(12, c2109lo1.q ? 1L : 0L);
                c3485zy.o(13, c2109lo1.a);
                break;
        }
    }
}
