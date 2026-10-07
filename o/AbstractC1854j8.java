package o;

import android.content.ContentValues;
import android.os.Build;

/* JADX INFO: renamed from: o.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1854j8 {
    public static final String[] b;
    public ContentValues a;

    static {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = {"_id", "package_name", "title", "episode_title", i >= 24 ? "season_display_number" : "season_number", i >= 24 ? "episode_display_number" : "episode_number", "short_description", "long_description", "poster_art_uri", "thumbnail_uri", "audio_language", "canonical_genre", "content_rating", "video_width", "video_height", "internal_provider_data", "series_id"};
        String[] strArr2 = {"searchable", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"season_title"};
        if (i >= 26) {
            strArr = (String[]) AbstractC0397Ej.j(strArr, strArr2, strArr3, new String[]{"review_rating", "review_rating_style"});
        } else if (i >= 24) {
            strArr = (String[]) AbstractC0397Ej.j(strArr, strArr2, strArr3);
        } else if (i >= 23) {
            strArr = (String[]) AbstractC0397Ej.j(strArr, strArr2);
        }
        b = strArr;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
