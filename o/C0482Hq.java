package o;

import java.util.Calendar;

/* JADX INFO: renamed from: o.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482Hq extends AbstractC0326Bq {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0482Hq(Object obj, F80 f80, int i) {
        super(f80, 1);
        this.d = i;
        this.e = obj;
    }

    @Override // o.AbstractC3347yd0
    public final String c() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `episodes` (`id`,`number`,`title`,`poster`,`tvShow`,`season`,`released`,`isWatched`,`watchedDate`,`lastEngagementTimeUtcMillis`,`lastPlaybackPositionMillis`,`durationMillis`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `movies` (`id`,`title`,`overview`,`runtime`,`trailer`,`quality`,`rating`,`poster`,`banner`,`released`,`isFavorite`,`isWatched`,`watchedDate`,`lastEngagementTimeUtcMillis`,`lastPlaybackPositionMillis`,`durationMillis`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `seasons` (`id`,`number`,`title`,`poster`,`tvShow`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `tv_shows` (`id`,`title`,`overview`,`runtime`,`trailer`,`quality`,`rating`,`poster`,`banner`,`serieId`,`released`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
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
                if (c2123lv0 == null) {
                    c3485zy.z(10);
                    c3485zy.z(11);
                    c3485zy.z(12);
                } else {
                    c3485zy.J(10, c2123lv0.a);
                    c3485zy.J(11, c2123lv0.b);
                    c3485zy.J(12, c2123lv0.c);
                }
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
                if (c2123lv1 == null) {
                    c3485zy.z(14);
                    c3485zy.z(15);
                    c3485zy.z(16);
                } else {
                    c3485zy.J(14, c2123lv1.a);
                    c3485zy.J(15, c2123lv1.b);
                    c3485zy.J(16, c2123lv1.c);
                }
                break;
            case 2:
                Ma0 ma1 = (Ma0) obj;
                c3485zy.o(1, ma1.a);
                c3485zy.J(2, ma1.b);
                String str10 = ma1.c;
                if (str10 == null) {
                    c3485zy.z(3);
                } else {
                    c3485zy.o(3, str10);
                }
                String str11 = ma1.d;
                if (str11 == null) {
                    c3485zy.z(4);
                } else {
                    c3485zy.o(4, str11);
                }
                C0519Jb c0519Jb3 = (C0519Jb) ((Na0) this.e).f414o;
                C2109lo0 c2109lo1 = ma1.e;
                c0519Jb3.getClass();
                String str12 = c2109lo1 != null ? c2109lo1.a : null;
                if (str12 != null) {
                    c3485zy.o(5, str12);
                } else {
                    c3485zy.z(5);
                }
                break;
            default:
                C2109lo0 c2109lo2 = (C2109lo0) obj;
                c3485zy.o(1, c2109lo2.a);
                c3485zy.o(2, c2109lo2.b);
                String str13 = c2109lo2.c;
                if (str13 == null) {
                    c3485zy.z(3);
                } else {
                    c3485zy.o(3, str13);
                }
                Integer num2 = c2109lo2.d;
                if (num2 == null) {
                    c3485zy.z(4);
                } else {
                    c3485zy.J(4, num2.intValue());
                }
                String str14 = c2109lo2.e;
                if (str14 == null) {
                    c3485zy.z(5);
                } else {
                    c3485zy.o(5, str14);
                }
                String str15 = c2109lo2.f;
                if (str15 == null) {
                    c3485zy.z(6);
                } else {
                    c3485zy.o(6, str15);
                }
                Double d2 = c2109lo2.g;
                if (d2 == null) {
                    c3485zy.z(7);
                } else {
                    c3485zy.B(7, d2.doubleValue());
                }
                String str16 = c2109lo2.h;
                if (str16 == null) {
                    c3485zy.z(8);
                } else {
                    c3485zy.o(8, str16);
                }
                String str17 = c2109lo2.i;
                if (str17 == null) {
                    c3485zy.z(9);
                } else {
                    c3485zy.o(9, str17);
                }
                String str18 = c2109lo2.j;
                if (str18 == null) {
                    c3485zy.z(10);
                } else {
                    c3485zy.o(10, str18);
                }
                C0519Jb c0519Jb4 = (C0519Jb) ((C2303no0) this.e).f941o;
                Calendar calendar3 = c2109lo2.p;
                c0519Jb4.getClass();
                String strE5 = C0519Jb.E(calendar3);
                if (strE5 == null) {
                    c3485zy.z(11);
                } else {
                    c3485zy.o(11, strE5);
                }
                c3485zy.J(12, c2109lo2.q ? 1L : 0L);
                break;
        }
    }
}
