package o;

/* JADX INFO: renamed from: o.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1458f5 {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public C1458f5(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    public final void a(C2903ty c2903ty) {
        switch (this.c) {
            case 0:
                c2903ty.p("ALTER TABLE episodes ADD COLUMN watchedDate TEXT");
                c2903ty.p("ALTER TABLE episodes ADD COLUMN lastEngagementTimeUtcMillis INTEGER");
                c2903ty.p("ALTER TABLE episodes ADD COLUMN lastPlaybackPositionMillis INTEGER");
                c2903ty.p("ALTER TABLE episodes ADD COLUMN durationMillis INTEGER");
                c2903ty.p("ALTER TABLE movies ADD COLUMN watchedDate TEXT");
                c2903ty.p("ALTER TABLE movies ADD COLUMN lastEngagementTimeUtcMillis INTEGER");
                c2903ty.p("ALTER TABLE movies ADD COLUMN lastPlaybackPositionMillis INTEGER");
                c2903ty.p("ALTER TABLE movies ADD COLUMN durationMillis INTEGER");
                break;
            case 1:
                c2903ty.p("CREATE TABLE `episodes_temp` (`id` TEXT NOT NULL, `number` INTEGER NOT NULL, `title` TEXT, `poster` TEXT, `tvShow` TEXT, `season` TEXT, `released` TEXT, `isWatched` INTEGER NOT NULL, `watchedDate` TEXT, `lastEngagementTimeUtcMillis` INTEGER, `lastPlaybackPositionMillis` INTEGER, `durationMillis` INTEGER, PRIMARY KEY(`id`))");
                c2903ty.p("INSERT INTO episodes_temp SELECT * FROM episodes");
                c2903ty.p("DROP TABLE episodes");
                c2903ty.p("ALTER TABLE episodes_temp RENAME TO episodes");
                c2903ty.p("CREATE TABLE `movies_temp` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `overview` TEXT, `runtime` INTEGER, `trailer` TEXT, `quality` TEXT, `rating` REAL, `poster` TEXT, `banner` TEXT, `released` TEXT, `isFavorite` INTEGER NOT NULL, `isWatched` INTEGER NOT NULL, `watchedDate` TEXT, `lastEngagementTimeUtcMillis` INTEGER, `lastPlaybackPositionMillis` INTEGER, `durationMillis` INTEGER, PRIMARY KEY(`id`))");
                c2903ty.p("INSERT INTO movies_temp SELECT * FROM movies");
                c2903ty.p("DROP TABLE movies");
                c2903ty.p("ALTER TABLE movies_temp RENAME TO movies");
                c2903ty.p("CREATE TABLE `seasons_temp` (`id` TEXT NOT NULL, `number` INTEGER NOT NULL, `title` TEXT, `poster` TEXT, `tvShow` TEXT, PRIMARY KEY(`id`))");
                c2903ty.p("INSERT INTO seasons_temp SELECT * FROM seasons");
                c2903ty.p("DROP TABLE seasons");
                c2903ty.p("ALTER TABLE seasons_temp RENAME TO seasons");
                c2903ty.p("CREATE TABLE `tv_shows_temp` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `overview` TEXT, `runtime` INTEGER, `trailer` TEXT, `quality` TEXT, `rating` REAL, `poster` TEXT, `banner` TEXT, `released` TEXT, `isFavorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                c2903ty.p("INSERT INTO tv_shows_temp SELECT * FROM tv_shows");
                c2903ty.p("DROP TABLE tv_shows");
                c2903ty.p("ALTER TABLE tv_shows_temp RENAME TO tv_shows");
                break;
            default:
                c2903ty.p("ALTER TABLE ar_dash_cache ADD COLUMN streamType TEXT NOT NULL DEFAULT 'dash'");
                break;
        }
    }
}
