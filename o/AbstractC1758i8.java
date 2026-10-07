package o;

/* JADX INFO: renamed from: o.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1758i8 extends AbstractC1854j8 {
    public static final String[] c = (String[]) AbstractC0397Ej.j(AbstractC1854j8.b, new String[]{"internal_provider_id", "preview_video_uri", "last_playback_position_millis", "duration_millis", "intent_uri", "transient", "type", "poster_art_aspect_ratio", "poster_thumbnail_aspect_ratio", "logo_uri", "availability", "starting_price", "offer_price", "release_date", "item_count", "live", "interaction_type", "interaction_count", "author", "browsable", "content_id", "logo_content_description", "genre", "start_time_utc_millis", "end_time_utc_millis", "preview_audio_uri", "tv_series_item_type"});

    public final int a() {
        Integer asInteger = this.a.getAsInteger("duration_millis");
        if (asInteger == null) {
            return -1;
        }
        return asInteger.intValue();
    }

    public final int b() {
        Integer asInteger = this.a.getAsInteger("last_playback_position_millis");
        if (asInteger == null) {
            return -1;
        }
        return asInteger.intValue();
    }
}
