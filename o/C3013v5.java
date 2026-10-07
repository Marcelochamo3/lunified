package o;

/* JADX INFO: renamed from: o.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3013v5 extends AbstractC0326Bq {
    @Override // o.AbstractC3347yd0
    public final String c() {
        return "INSERT OR REPLACE INTO `ar_dash_cache` (`channelId`,`dashUrl`,`streamType`,`savedAt`) VALUES (?,?,?,?)";
    }

    @Override // o.AbstractC0326Bq
    public final void e(C3485zy c3485zy, Object obj) {
        C2916u5 c2916u5 = (C2916u5) obj;
        c3485zy.o(1, c2916u5.a);
        c3485zy.o(2, c2916u5.b);
        c3485zy.o(3, c2916u5.c);
        c3485zy.J(4, c2916u5.d);
    }
}
