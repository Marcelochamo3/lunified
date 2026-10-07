package o;

import com.skidush.clonex.database.AppDatabase_Impl;
import com.skidush.clonex.database.ArCacheDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1654h5 extends AbstractC3015v6 {
    public final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F80 f809o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654h5(ArCacheDatabase_Impl arCacheDatabase_Impl) {
        super(2, 3);
        this.f809o = arCacheDatabase_Impl;
    }

    @Override // o.AbstractC3015v6
    public final io.sentry.android.core.F A(C2903ty c2903ty) {
        switch (this.n) {
            case 0:
                HashMap map = new HashMap(12);
                map.put("id", new C1999ki0(1, 1, "id", "TEXT", null, true));
                map.put("number", new C1999ki0(0, 1, "number", "INTEGER", null, true));
                map.put("title", new C1999ki0(0, 1, "title", "TEXT", null, false));
                map.put("poster", new C1999ki0(0, 1, "poster", "TEXT", null, false));
                map.put("tvShow", new C1999ki0(0, 1, "tvShow", "TEXT", null, false));
                map.put("season", new C1999ki0(0, 1, "season", "TEXT", null, false));
                map.put("released", new C1999ki0(0, 1, "released", "TEXT", null, false));
                map.put("isWatched", new C1999ki0(0, 1, "isWatched", "INTEGER", null, true));
                map.put("watchedDate", new C1999ki0(0, 1, "watchedDate", "TEXT", null, false));
                map.put("lastEngagementTimeUtcMillis", new C1999ki0(0, 1, "lastEngagementTimeUtcMillis", "INTEGER", null, false));
                map.put("lastPlaybackPositionMillis", new C1999ki0(0, 1, "lastPlaybackPositionMillis", "INTEGER", null, false));
                map.put("durationMillis", new C1999ki0(0, 1, "durationMillis", "INTEGER", null, false));
                C2388oi0 c2388oi0 = new C2388oi0("episodes", map, new HashSet(0), new HashSet(0));
                C2388oi0 c2388oi0A = C2388oi0.a(c2903ty, "episodes");
                if (!c2388oi0.equals(c2388oi0A)) {
                    return new io.sentry.android.core.F(false, "episodes(com.skidush.clonex.models.Episode).\n Expected:\n" + c2388oi0 + "\n Found:\n" + c2388oi0A);
                }
                HashMap map2 = new HashMap(16);
                map2.put("id", new C1999ki0(1, 1, "id", "TEXT", null, true));
                map2.put("title", new C1999ki0(0, 1, "title", "TEXT", null, true));
                map2.put("overview", new C1999ki0(0, 1, "overview", "TEXT", null, false));
                map2.put("runtime", new C1999ki0(0, 1, "runtime", "INTEGER", null, false));
                map2.put("trailer", new C1999ki0(0, 1, "trailer", "TEXT", null, false));
                map2.put("quality", new C1999ki0(0, 1, "quality", "TEXT", null, false));
                map2.put("rating", new C1999ki0(0, 1, "rating", "REAL", null, false));
                map2.put("poster", new C1999ki0(0, 1, "poster", "TEXT", null, false));
                map2.put("banner", new C1999ki0(0, 1, "banner", "TEXT", null, false));
                map2.put("released", new C1999ki0(0, 1, "released", "TEXT", null, false));
                map2.put("isFavorite", new C1999ki0(0, 1, "isFavorite", "INTEGER", null, true));
                map2.put("isWatched", new C1999ki0(0, 1, "isWatched", "INTEGER", null, true));
                map2.put("watchedDate", new C1999ki0(0, 1, "watchedDate", "TEXT", null, false));
                map2.put("lastEngagementTimeUtcMillis", new C1999ki0(0, 1, "lastEngagementTimeUtcMillis", "INTEGER", null, false));
                map2.put("lastPlaybackPositionMillis", new C1999ki0(0, 1, "lastPlaybackPositionMillis", "INTEGER", null, false));
                map2.put("durationMillis", new C1999ki0(0, 1, "durationMillis", "INTEGER", null, false));
                C2388oi0 c2388oi1 = new C2388oi0("movies", map2, new HashSet(0), new HashSet(0));
                C2388oi0 c2388oi0A2 = C2388oi0.a(c2903ty, "movies");
                if (!c2388oi1.equals(c2388oi0A2)) {
                    return new io.sentry.android.core.F(false, "movies(com.skidush.clonex.models.Movie).\n Expected:\n" + c2388oi1 + "\n Found:\n" + c2388oi0A2);
                }
                HashMap map3 = new HashMap(5);
                map3.put("id", new C1999ki0(1, 1, "id", "TEXT", null, true));
                map3.put("number", new C1999ki0(0, 1, "number", "INTEGER", null, true));
                map3.put("title", new C1999ki0(0, 1, "title", "TEXT", null, false));
                map3.put("poster", new C1999ki0(0, 1, "poster", "TEXT", null, false));
                map3.put("tvShow", new C1999ki0(0, 1, "tvShow", "TEXT", null, false));
                C2388oi0 c2388oi2 = new C2388oi0("seasons", map3, new HashSet(0), new HashSet(0));
                C2388oi0 c2388oi0A3 = C2388oi0.a(c2903ty, "seasons");
                if (!c2388oi2.equals(c2388oi0A3)) {
                    return new io.sentry.android.core.F(false, "seasons(com.skidush.clonex.models.Season).\n Expected:\n" + c2388oi2 + "\n Found:\n" + c2388oi0A3);
                }
                HashMap map4 = new HashMap(12);
                map4.put("id", new C1999ki0(1, 1, "id", "TEXT", null, true));
                map4.put("title", new C1999ki0(0, 1, "title", "TEXT", null, true));
                map4.put("overview", new C1999ki0(0, 1, "overview", "TEXT", null, false));
                map4.put("runtime", new C1999ki0(0, 1, "runtime", "INTEGER", null, false));
                map4.put("trailer", new C1999ki0(0, 1, "trailer", "TEXT", null, false));
                map4.put("quality", new C1999ki0(0, 1, "quality", "TEXT", null, false));
                map4.put("rating", new C1999ki0(0, 1, "rating", "REAL", null, false));
                map4.put("poster", new C1999ki0(0, 1, "poster", "TEXT", null, false));
                map4.put("banner", new C1999ki0(0, 1, "banner", "TEXT", null, false));
                map4.put("serieId", new C1999ki0(0, 1, "serieId", "TEXT", null, false));
                map4.put("released", new C1999ki0(0, 1, "released", "TEXT", null, false));
                map4.put("isFavorite", new C1999ki0(0, 1, "isFavorite", "INTEGER", null, true));
                C2388oi0 c2388oi3 = new C2388oi0("tv_shows", map4, new HashSet(0), new HashSet(0));
                C2388oi0 c2388oi0A4 = C2388oi0.a(c2903ty, "tv_shows");
                if (c2388oi3.equals(c2388oi0A4)) {
                    return new io.sentry.android.core.F(true, (String) null);
                }
                return new io.sentry.android.core.F(false, "tv_shows(com.skidush.clonex.models.TvShow).\n Expected:\n" + c2388oi3 + "\n Found:\n" + c2388oi0A4);
            default:
                HashMap map5 = new HashMap(4);
                map5.put("channelId", new C1999ki0(1, 1, "channelId", "TEXT", null, true));
                map5.put("dashUrl", new C1999ki0(0, 1, "dashUrl", "TEXT", null, true));
                map5.put("streamType", new C1999ki0(0, 1, "streamType", "TEXT", null, true));
                map5.put("savedAt", new C1999ki0(0, 1, "savedAt", "INTEGER", null, true));
                C2388oi0 c2388oi4 = new C2388oi0("ar_dash_cache", map5, new HashSet(0), new HashSet(0));
                C2388oi0 c2388oi0A5 = C2388oi0.a(c2903ty, "ar_dash_cache");
                if (c2388oi4.equals(c2388oi0A5)) {
                    return new io.sentry.android.core.F(true, (String) null);
                }
                return new io.sentry.android.core.F(false, "ar_dash_cache(com.skidush.clonex.database.ArDashCache).\n Expected:\n" + c2388oi4 + "\n Found:\n" + c2388oi0A5);
        }
    }

    @Override // o.AbstractC3015v6
    public final void c(C2903ty c2903ty) {
        switch (this.n) {
            case 0:
                c2903ty.p("CREATE TABLE IF NOT EXISTS `episodes` (`id` TEXT NOT NULL, `number` INTEGER NOT NULL, `title` TEXT, `poster` TEXT, `tvShow` TEXT, `season` TEXT, `released` TEXT, `isWatched` INTEGER NOT NULL, `watchedDate` TEXT, `lastEngagementTimeUtcMillis` INTEGER, `lastPlaybackPositionMillis` INTEGER, `durationMillis` INTEGER, PRIMARY KEY(`id`))");
                c2903ty.p("CREATE TABLE IF NOT EXISTS `movies` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `overview` TEXT, `runtime` INTEGER, `trailer` TEXT, `quality` TEXT, `rating` REAL, `poster` TEXT, `banner` TEXT, `released` TEXT, `isFavorite` INTEGER NOT NULL, `isWatched` INTEGER NOT NULL, `watchedDate` TEXT, `lastEngagementTimeUtcMillis` INTEGER, `lastPlaybackPositionMillis` INTEGER, `durationMillis` INTEGER, PRIMARY KEY(`id`))");
                c2903ty.p("CREATE TABLE IF NOT EXISTS `seasons` (`id` TEXT NOT NULL, `number` INTEGER NOT NULL, `title` TEXT, `poster` TEXT, `tvShow` TEXT, PRIMARY KEY(`id`))");
                c2903ty.p("CREATE TABLE IF NOT EXISTS `tv_shows` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `overview` TEXT, `runtime` INTEGER, `trailer` TEXT, `quality` TEXT, `rating` REAL, `poster` TEXT, `banner` TEXT, `serieId` TEXT, `released` TEXT, `isFavorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                c2903ty.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c2903ty.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '22d32cab121674c733940f8a7d12e0ad')");
                break;
            default:
                c2903ty.p("CREATE TABLE IF NOT EXISTS `ar_dash_cache` (`channelId` TEXT NOT NULL, `dashUrl` TEXT NOT NULL, `streamType` TEXT NOT NULL, `savedAt` INTEGER NOT NULL, PRIMARY KEY(`channelId`))");
                c2903ty.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c2903ty.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '52fb9183a796bafa4b9b23599070d6ee')");
                break;
        }
    }

    @Override // o.AbstractC3015v6
    public final void d(C2903ty c2903ty) {
        F80 f80 = this.f809o;
        switch (this.n) {
            case 0:
                c2903ty.p("DROP TABLE IF EXISTS `episodes`");
                c2903ty.p("DROP TABLE IF EXISTS `movies`");
                c2903ty.p("DROP TABLE IF EXISTS `seasons`");
                c2903ty.p("DROP TABLE IF EXISTS `tv_shows`");
                int i = AppDatabase_Impl.v;
                List list = ((AppDatabase_Impl) f80).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1556g5) it.next()).getClass();
                    }
                }
                break;
            default:
                c2903ty.p("DROP TABLE IF EXISTS `ar_dash_cache`");
                List list2 = ((ArCacheDatabase_Impl) f80).g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1556g5) it2.next()).getClass();
                    }
                }
                break;
        }
    }

    @Override // o.AbstractC3015v6
    public final void x(C2903ty c2903ty) {
        F80 f80 = this.f809o;
        switch (this.n) {
            case 0:
                int i = AppDatabase_Impl.v;
                List list = ((AppDatabase_Impl) f80).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1556g5) it.next()).getClass();
                    }
                }
                break;
            default:
                List list2 = ((ArCacheDatabase_Impl) f80).g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1556g5) it2.next()).getClass();
                    }
                }
                break;
        }
    }

    @Override // o.AbstractC3015v6
    public final void y(C2903ty c2903ty) {
        switch (this.n) {
            case 0:
                AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) this.f809o;
                int i = AppDatabase_Impl.v;
                appDatabase_Impl.a = c2903ty;
                ((AppDatabase_Impl) this.f809o).k(c2903ty);
                List list = ((AppDatabase_Impl) this.f809o).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1556g5) it.next()).getClass();
                        c2903ty.p("UPDATE movies SET banner = poster WHERE id LIKE 'tv-%'");
                        c2903ty.p("UPDATE tv_shows SET banner = poster WHERE id LIKE 'tv-%'");
                    }
                }
                break;
            default:
                ((ArCacheDatabase_Impl) this.f809o).a = c2903ty;
                ((ArCacheDatabase_Impl) this.f809o).k(c2903ty);
                List list2 = ((ArCacheDatabase_Impl) this.f809o).g;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1556g5) it2.next()).getClass();
                        c2903ty.p("UPDATE movies SET banner = poster WHERE id LIKE 'tv-%'");
                        c2903ty.p("UPDATE tv_shows SET banner = poster WHERE id LIKE 'tv-%'");
                    }
                }
                break;
        }
    }

    @Override // o.AbstractC3015v6
    public final void z(C2903ty c2903ty) {
        switch (this.n) {
            case 0:
                U9.l(c2903ty);
                break;
            default:
                U9.l(c2903ty);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654h5(AppDatabase_Impl appDatabase_Impl) {
        super(3, 3);
        this.f809o = appDatabase_Impl;
    }
}
