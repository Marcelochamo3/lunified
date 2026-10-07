package o;

/* JADX INFO: renamed from: o.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3110w5 extends AbstractC3347yd0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3110w5(F80 f80, int i) {
        super(f80);
        this.d = i;
    }

    @Override // o.AbstractC3347yd0
    public final String c() {
        switch (this.d) {
            case 0:
                return "DELETE FROM ar_dash_cache WHERE channelId = ?";
            default:
                return "\n        UPDATE episodes\n        SET isWatched = 0\n        WHERE id IN (\n            SELECT episode.id\n            FROM episodes episode\n            LEFT JOIN seasons season ON episode.season = season.id\n            JOIN (\n                  SELECT episode.tvShow AS tvShow, season.number AS seasonNumber, episode.number AS number\n                  FROM episodes episode\n                  LEFT JOIN seasons season ON episode.season = season.id\n                  WHERE episode.id = ?\n            ) episode2 ON (episode.tvShow = episode2.tvShow AND (season.number > episode2.seasonNumber OR (season.number = episode2.seasonNumber AND episode.number > episode2.number)))\n        )\n    ";
        }
    }
}
