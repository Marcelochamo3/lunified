package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.tv.TvContentRating;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Iu0 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public static final Iu0 n = new Iu0(1, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Iu0 f333o = new Iu0(1, 1);
    public static final Iu0 p = new Iu0(1, 2);
    public static final Iu0 q = new Iu0(1, 3);
    public static final Iu0 r = new Iu0(1, 4);
    public static final Iu0 s = new Iu0(1, 5);
    public static final Iu0 t = new Iu0(1, 6);
    public static final Iu0 u = new Iu0(1, 7);
    public static final Iu0 v = new Iu0(1, 8);
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Iu0(int i, int i2) {
        super(i);
        this.m = i2;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02a9  */
    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        int columnIndex;
        String string;
        String[] strArr;
        String string2;
        String string3;
        switch (this.m) {
            case 0:
                JN jn = (JN) obj;
                AbstractC1474fG.j(jn, "it");
                return jn.c();
            case 1:
                C0628Nh c0628Nh = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh, "it");
                return Boolean.valueOf(c0628Nh.c <= System.currentTimeMillis());
            case 2:
                JN jn2 = (JN) obj;
                AbstractC1474fG.j(jn2, "it");
                return (String) jn2.a().get(1);
            case 3:
                Cursor cursor = (Cursor) obj;
                AbstractC1474fG.j(cursor, "it");
                String[] strArr2 = C2414ov0.d;
                C2317nv0 c2317nv0 = new C2317nv0();
                ContentValues contentValues = new ContentValues();
                c2317nv0.a = contentValues;
                int columnIndex2 = cursor.getColumnIndex("_id");
                if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
                    contentValues.put("_id", Long.valueOf(cursor.getLong(columnIndex2)));
                }
                int columnIndex3 = cursor.getColumnIndex("package_name");
                if (columnIndex3 >= 0 && !cursor.isNull(columnIndex3)) {
                    contentValues.put("package_name", cursor.getString(columnIndex3));
                }
                int columnIndex4 = cursor.getColumnIndex("title");
                if (columnIndex4 >= 0 && !cursor.isNull(columnIndex4)) {
                    contentValues.put("title", cursor.getString(columnIndex4));
                }
                int columnIndex5 = cursor.getColumnIndex("episode_title");
                if (columnIndex5 >= 0 && !cursor.isNull(columnIndex5)) {
                    contentValues.put("episode_title", cursor.getString(columnIndex5));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    int columnIndex6 = cursor.getColumnIndex("season_display_number");
                    if (columnIndex6 >= 0 && !cursor.isNull(columnIndex6)) {
                        String string4 = cursor.getString(columnIndex6);
                        ContentValues contentValues2 = (ContentValues) c2317nv0.a;
                        if (i >= 24) {
                            contentValues2.put("season_display_number", string4);
                        } else {
                            contentValues2.put("season_number", (Integer) (-1));
                        }
                    }
                } else {
                    int columnIndex7 = cursor.getColumnIndex("season_number");
                    if (columnIndex7 >= 0 && !cursor.isNull(columnIndex7)) {
                        int i2 = cursor.getInt(columnIndex7);
                        String strValueOf = String.valueOf(i2);
                        ContentValues contentValues3 = (ContentValues) c2317nv0.a;
                        if (i >= 24) {
                            contentValues3.put("season_display_number", strValueOf);
                        } else {
                            contentValues3.put("season_number", Integer.valueOf(i2));
                        }
                    }
                }
                if (i >= 24) {
                    int columnIndex8 = cursor.getColumnIndex("episode_display_number");
                    if (columnIndex8 >= 0 && !cursor.isNull(columnIndex8)) {
                        String string5 = cursor.getString(columnIndex8);
                        ContentValues contentValues4 = (ContentValues) c2317nv0.a;
                        if (i >= 24) {
                            contentValues4.put("episode_display_number", string5);
                        } else {
                            contentValues4.put("episode_number", (Integer) (-1));
                        }
                    }
                } else {
                    int columnIndex9 = cursor.getColumnIndex("episode_number");
                    if (columnIndex9 >= 0 && !cursor.isNull(columnIndex9)) {
                        int i3 = cursor.getInt(columnIndex9);
                        String strValueOf2 = String.valueOf(i3);
                        ContentValues contentValues5 = (ContentValues) c2317nv0.a;
                        if (i >= 24) {
                            contentValues5.put("episode_display_number", strValueOf2);
                        } else {
                            contentValues5.put("episode_number", Integer.valueOf(i3));
                        }
                    }
                }
                int columnIndex10 = cursor.getColumnIndex("short_description");
                if (columnIndex10 >= 0 && !cursor.isNull(columnIndex10)) {
                    contentValues.put("short_description", cursor.getString(columnIndex10));
                }
                int columnIndex11 = cursor.getColumnIndex("long_description");
                if (columnIndex11 >= 0 && !cursor.isNull(columnIndex11)) {
                    contentValues.put("long_description", cursor.getString(columnIndex11));
                }
                int columnIndex12 = cursor.getColumnIndex("poster_art_uri");
                if (columnIndex12 >= 0 && !cursor.isNull(columnIndex12)) {
                    Uri uri = Uri.parse(cursor.getString(columnIndex12));
                    contentValues.put("poster_art_uri", uri == null ? null : uri.toString());
                }
                int columnIndex13 = cursor.getColumnIndex("thumbnail_uri");
                if (columnIndex13 >= 0 && !cursor.isNull(columnIndex13)) {
                    Uri uri2 = Uri.parse(cursor.getString(columnIndex13));
                    contentValues.put("thumbnail_uri", uri2 == null ? null : uri2.toString());
                }
                int columnIndex14 = cursor.getColumnIndex("audio_language");
                if (columnIndex14 >= 0 && !cursor.isNull(columnIndex14)) {
                    String string6 = cursor.getString(columnIndex14);
                    String[] strArrSplit = TextUtils.isEmpty(string6) ? null : string6.split("\\s*,\\s*");
                    if (strArrSplit == null || strArrSplit.length == 0) {
                        string3 = null;
                    } else {
                        StringBuilder sb = new StringBuilder(strArrSplit[0]);
                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                            sb.append(",");
                            sb.append(strArrSplit[i4]);
                        }
                        string3 = sb.toString();
                    }
                    ((ContentValues) c2317nv0.a).put("audio_language", string3);
                }
                int columnIndex15 = cursor.getColumnIndex("canonical_genre");
                if (columnIndex15 >= 0 && !cursor.isNull(columnIndex15)) {
                    String string7 = cursor.getString(columnIndex15);
                    String[] strArr3 = AbstractC2204mn0.a;
                    char c = '\"';
                    if (TextUtils.isEmpty(string7)) {
                        strArr = AbstractC2204mn0.a;
                    } else if (string7.indexOf(44) == -1 && string7.indexOf(34) == -1) {
                        strArr = new String[]{string7.trim()};
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        int length = string7.length();
                        boolean z = false;
                        for (int i5 = 0; i5 < length; i5++) {
                            char cCharAt = string7.charAt(i5);
                            if (cCharAt != '\"') {
                                if (cCharAt == ',' && !z) {
                                    String strTrim = sb2.toString().trim();
                                    if (strTrim.length() > 0) {
                                        arrayList.add(strTrim);
                                    }
                                    sb2 = new StringBuilder();
                                } else {
                                    sb2.append(cCharAt);
                                    z = false;
                                }
                            } else if (z) {
                                sb2.append(cCharAt);
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        String strTrim2 = sb2.toString().trim();
                        if (strTrim2.length() > 0) {
                            arrayList.add(strTrim2);
                        }
                        strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    }
                    String[] strArr4 = AbstractC2204mn0.a;
                    if (strArr == null) {
                        string2 = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        int length2 = strArr.length;
                        String str = "";
                        int i6 = 0;
                        while (i6 < length2) {
                            String str2 = strArr[i6];
                            sb3.append(str);
                            StringBuilder sb4 = new StringBuilder();
                            int length3 = str2.length();
                            for (int i7 = 0; i7 < length3; i7++) {
                                char cCharAt2 = str2.charAt(i7);
                                if (cCharAt2 == c) {
                                    sb4.append(c);
                                } else if (cCharAt2 != ',') {
                                    c = '\"';
                                } else {
                                    c = '\"';
                                    sb4.append('\"');
                                }
                                sb4.append(cCharAt2);
                            }
                            sb3.append(sb4.toString());
                            i6++;
                            str = ",";
                        }
                        string2 = sb3.toString();
                    }
                    ((ContentValues) c2317nv0.a).put("canonical_genre", string2);
                }
                int columnIndex16 = cursor.getColumnIndex("content_rating");
                if (columnIndex16 >= 0 && !cursor.isNull(columnIndex16)) {
                    String string8 = cursor.getString(columnIndex16);
                    boolean zIsEmpty = TextUtils.isEmpty(string8);
                    TvContentRating[] tvContentRatingArr = zy0.n;
                    if (!zIsEmpty) {
                        String[] strArrSplit2 = string8.split("\\s*,\\s*", -1);
                        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
                        for (String str3 : strArrSplit2) {
                            try {
                                arrayList2.add(TvContentRating.unflattenFromString(str3));
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        if (arrayList2.size() != 0) {
                            tvContentRatingArr = (TvContentRating[]) arrayList2.toArray(new TvContentRating[arrayList2.size()]);
                        }
                    }
                    if (tvContentRatingArr == null || tvContentRatingArr.length == 0) {
                        string = null;
                    } else {
                        StringBuilder sb5 = new StringBuilder(tvContentRatingArr[0].flattenToString());
                        for (int i8 = 1; i8 < tvContentRatingArr.length; i8++) {
                            sb5.append(",");
                            sb5.append(tvContentRatingArr[i8].flattenToString());
                        }
                        string = sb5.toString();
                    }
                    ((ContentValues) c2317nv0.a).put("content_rating", string);
                }
                int columnIndex17 = cursor.getColumnIndex("video_width");
                if (columnIndex17 >= 0 && !cursor.isNull(columnIndex17)) {
                    ((ContentValues) c2317nv0.a).put("video_width", Integer.valueOf((int) cursor.getLong(columnIndex17)));
                }
                int columnIndex18 = cursor.getColumnIndex("video_height");
                if (columnIndex18 >= 0 && !cursor.isNull(columnIndex18)) {
                    ((ContentValues) c2317nv0.a).put("video_height", Integer.valueOf((int) cursor.getLong(columnIndex18)));
                }
                int columnIndex19 = cursor.getColumnIndex("internal_provider_data");
                if (columnIndex19 >= 0 && !cursor.isNull(columnIndex19)) {
                    ((ContentValues) c2317nv0.a).put("internal_provider_data", cursor.getBlob(columnIndex19));
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23) {
                    int columnIndex20 = cursor.getColumnIndex("searchable");
                    if (columnIndex20 >= 0 && !cursor.isNull(columnIndex20)) {
                        ((ContentValues) c2317nv0.a).put("searchable", Integer.valueOf(cursor.getInt(columnIndex20) == 1 ? 1 : 0));
                    }
                    int columnIndex21 = cursor.getColumnIndex("internal_provider_flag1");
                    if (columnIndex21 >= 0 && !cursor.isNull(columnIndex21)) {
                        ((ContentValues) c2317nv0.a).put("internal_provider_flag1", Long.valueOf(cursor.getLong(columnIndex21)));
                    }
                    int columnIndex22 = cursor.getColumnIndex("internal_provider_flag2");
                    if (columnIndex22 >= 0 && !cursor.isNull(columnIndex22)) {
                        ((ContentValues) c2317nv0.a).put("internal_provider_flag2", Long.valueOf(cursor.getLong(columnIndex22)));
                    }
                    int columnIndex23 = cursor.getColumnIndex("internal_provider_flag3");
                    if (columnIndex23 >= 0 && !cursor.isNull(columnIndex23)) {
                        ((ContentValues) c2317nv0.a).put("internal_provider_flag3", Long.valueOf(cursor.getLong(columnIndex23)));
                    }
                    int columnIndex24 = cursor.getColumnIndex("internal_provider_flag4");
                    if (columnIndex24 >= 0 && !cursor.isNull(columnIndex24)) {
                        ((ContentValues) c2317nv0.a).put("internal_provider_flag4", Long.valueOf(cursor.getLong(columnIndex24)));
                    }
                }
                if (i9 >= 24 && (columnIndex = cursor.getColumnIndex("season_title")) >= 0 && !cursor.isNull(columnIndex)) {
                    ((ContentValues) c2317nv0.a).put("season_title", cursor.getString(columnIndex));
                }
                if (i9 >= 26) {
                    int columnIndex25 = cursor.getColumnIndex("review_rating_style");
                    if (columnIndex25 >= 0 && !cursor.isNull(columnIndex25)) {
                        ((ContentValues) c2317nv0.a).put("review_rating_style", Integer.valueOf(cursor.getInt(columnIndex25)));
                    }
                    int columnIndex26 = cursor.getColumnIndex("review_rating");
                    if (columnIndex26 >= 0 && !cursor.isNull(columnIndex26)) {
                        ((ContentValues) c2317nv0.a).put("review_rating", cursor.getString(columnIndex26));
                    }
                }
                int columnIndex27 = cursor.getColumnIndex("series_id");
                if (columnIndex27 >= 0 && !cursor.isNull(columnIndex27)) {
                    ((ContentValues) c2317nv0.a).put("series_id", cursor.getString(columnIndex27));
                }
                if (i9 >= 26) {
                    int columnIndex28 = cursor.getColumnIndex("internal_provider_id");
                    if (columnIndex28 >= 0 && !cursor.isNull(columnIndex28)) {
                        ((ContentValues) c2317nv0.a).put("internal_provider_id", cursor.getString(columnIndex28));
                    }
                    int columnIndex29 = cursor.getColumnIndex("preview_video_uri");
                    if (columnIndex29 >= 0 && !cursor.isNull(columnIndex29)) {
                        Uri uri3 = Uri.parse(cursor.getString(columnIndex29));
                        ((ContentValues) c2317nv0.a).put("preview_video_uri", uri3 == null ? null : uri3.toString());
                    }
                    int columnIndex30 = cursor.getColumnIndex("last_playback_position_millis");
                    if (columnIndex30 >= 0 && !cursor.isNull(columnIndex30)) {
                        ((ContentValues) c2317nv0.a).put("last_playback_position_millis", Integer.valueOf(cursor.getInt(columnIndex30)));
                    }
                    int columnIndex31 = cursor.getColumnIndex("duration_millis");
                    if (columnIndex31 >= 0 && !cursor.isNull(columnIndex31)) {
                        ((ContentValues) c2317nv0.a).put("duration_millis", Integer.valueOf(cursor.getInt(columnIndex31)));
                    }
                    int columnIndex32 = cursor.getColumnIndex("intent_uri");
                    if (columnIndex32 >= 0 && !cursor.isNull(columnIndex32)) {
                        Uri uri4 = Uri.parse(cursor.getString(columnIndex32));
                        ((ContentValues) c2317nv0.a).put("intent_uri", uri4 == null ? null : uri4.toString());
                    }
                    int columnIndex33 = cursor.getColumnIndex("transient");
                    if (columnIndex33 >= 0 && !cursor.isNull(columnIndex33)) {
                        ((ContentValues) c2317nv0.a).put("transient", Integer.valueOf(cursor.getInt(columnIndex33) == 1 ? 1 : 0));
                    }
                    int columnIndex34 = cursor.getColumnIndex("type");
                    if (columnIndex34 >= 0 && !cursor.isNull(columnIndex34)) {
                        ((ContentValues) c2317nv0.a).put("type", Integer.valueOf(cursor.getInt(columnIndex34)));
                    }
                    int columnIndex35 = cursor.getColumnIndex("poster_art_aspect_ratio");
                    if (columnIndex35 >= 0 && !cursor.isNull(columnIndex35)) {
                        ((ContentValues) c2317nv0.a).put("poster_art_aspect_ratio", Integer.valueOf(cursor.getInt(columnIndex35)));
                    }
                    int columnIndex36 = cursor.getColumnIndex("poster_thumbnail_aspect_ratio");
                    if (columnIndex36 >= 0 && !cursor.isNull(columnIndex36)) {
                        ((ContentValues) c2317nv0.a).put("poster_thumbnail_aspect_ratio", Integer.valueOf(cursor.getInt(columnIndex36)));
                    }
                    int columnIndex37 = cursor.getColumnIndex("logo_uri");
                    if (columnIndex37 >= 0 && !cursor.isNull(columnIndex37)) {
                        Uri uri5 = Uri.parse(cursor.getString(columnIndex37));
                        ((ContentValues) c2317nv0.a).put("logo_uri", uri5 == null ? null : uri5.toString());
                    }
                    int columnIndex38 = cursor.getColumnIndex("availability");
                    if (columnIndex38 >= 0 && !cursor.isNull(columnIndex38)) {
                        ((ContentValues) c2317nv0.a).put("availability", Integer.valueOf(cursor.getInt(columnIndex38)));
                    }
                    int columnIndex39 = cursor.getColumnIndex("starting_price");
                    if (columnIndex39 >= 0 && !cursor.isNull(columnIndex39)) {
                        ((ContentValues) c2317nv0.a).put("starting_price", cursor.getString(columnIndex39));
                    }
                    int columnIndex40 = cursor.getColumnIndex("offer_price");
                    if (columnIndex40 >= 0 && !cursor.isNull(columnIndex40)) {
                        ((ContentValues) c2317nv0.a).put("offer_price", cursor.getString(columnIndex40));
                    }
                    int columnIndex41 = cursor.getColumnIndex("release_date");
                    if (columnIndex41 >= 0 && !cursor.isNull(columnIndex41)) {
                        ((ContentValues) c2317nv0.a).put("release_date", cursor.getString(columnIndex41));
                    }
                    int columnIndex42 = cursor.getColumnIndex("item_count");
                    if (columnIndex42 >= 0 && !cursor.isNull(columnIndex42)) {
                        ((ContentValues) c2317nv0.a).put("item_count", Integer.valueOf(cursor.getInt(columnIndex42)));
                    }
                    int columnIndex43 = cursor.getColumnIndex("live");
                    if (columnIndex43 >= 0 && !cursor.isNull(columnIndex43)) {
                        ((ContentValues) c2317nv0.a).put("live", Integer.valueOf(cursor.getInt(columnIndex43) == 1 ? 1 : 0));
                    }
                    int columnIndex44 = cursor.getColumnIndex("interaction_type");
                    if (columnIndex44 >= 0 && !cursor.isNull(columnIndex44)) {
                        ((ContentValues) c2317nv0.a).put("interaction_type", Integer.valueOf(cursor.getInt(columnIndex44)));
                    }
                    int columnIndex45 = cursor.getColumnIndex("interaction_count");
                    if (columnIndex45 >= 0 && !cursor.isNull(columnIndex45)) {
                        ((ContentValues) c2317nv0.a).put("interaction_count", Long.valueOf(cursor.getInt(columnIndex45)));
                    }
                    int columnIndex46 = cursor.getColumnIndex("author");
                    if (columnIndex46 >= 0 && !cursor.isNull(columnIndex46)) {
                        ((ContentValues) c2317nv0.a).put("author", cursor.getString(columnIndex46));
                    }
                    int columnIndex47 = cursor.getColumnIndex("browsable");
                    if (columnIndex47 >= 0 && !cursor.isNull(columnIndex47)) {
                        ((ContentValues) c2317nv0.a).put("browsable", Integer.valueOf(cursor.getInt(columnIndex47) == 1 ? 1 : 0));
                    }
                    int columnIndex48 = cursor.getColumnIndex("content_id");
                    if (columnIndex48 >= 0 && !cursor.isNull(columnIndex48)) {
                        ((ContentValues) c2317nv0.a).put("content_id", cursor.getString(columnIndex48));
                    }
                    int columnIndex49 = cursor.getColumnIndex("logo_content_description");
                    if (columnIndex49 >= 0 && !cursor.isNull(columnIndex49)) {
                        ((ContentValues) c2317nv0.a).put("logo_content_description", cursor.getString(columnIndex49));
                    }
                    int columnIndex50 = cursor.getColumnIndex("genre");
                    if (columnIndex50 >= 0 && !cursor.isNull(columnIndex50)) {
                        ((ContentValues) c2317nv0.a).put("genre", cursor.getString(columnIndex50));
                    }
                    int columnIndex51 = cursor.getColumnIndex("start_time_utc_millis");
                    if (columnIndex51 >= 0 && !cursor.isNull(columnIndex51)) {
                        ((ContentValues) c2317nv0.a).put("start_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex51)));
                    }
                    int columnIndex52 = cursor.getColumnIndex("end_time_utc_millis");
                    if (columnIndex52 >= 0 && !cursor.isNull(columnIndex52)) {
                        ((ContentValues) c2317nv0.a).put("end_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex52)));
                    }
                    int columnIndex53 = cursor.getColumnIndex("preview_audio_uri");
                    if (columnIndex53 >= 0 && !cursor.isNull(columnIndex53)) {
                        Uri uri6 = Uri.parse(cursor.getString(columnIndex53));
                        ((ContentValues) c2317nv0.a).put("preview_audio_uri", uri6 == null ? null : uri6.toString());
                    }
                    int columnIndex54 = cursor.getColumnIndex("tv_series_item_type");
                    if (columnIndex54 >= 0 && !cursor.isNull(columnIndex54)) {
                        ((ContentValues) c2317nv0.a).put("tv_series_item_type", Integer.valueOf(cursor.getInt(columnIndex54)));
                    }
                }
                int columnIndex55 = cursor.getColumnIndex("watch_next_type");
                if (columnIndex55 >= 0 && !cursor.isNull(columnIndex55)) {
                    ((ContentValues) c2317nv0.a).put("watch_next_type", Integer.valueOf(cursor.getInt(columnIndex55)));
                }
                int columnIndex56 = cursor.getColumnIndex("last_engagement_time_utc_millis");
                if (columnIndex56 >= 0 && !cursor.isNull(columnIndex56)) {
                    ((ContentValues) c2317nv0.a).put("last_engagement_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex56)));
                }
                C2414ov0 c2414ov0 = new C2414ov0();
                c2414ov0.a = (ContentValues) c2317nv0.a;
                return c2414ov0;
            case 4:
                String str4 = (String) obj;
                AbstractC1474fG.j(str4, "it");
                return str4.concat("=<redacted>");
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1474fG.j(entry, "<name for destructuring parameter 0>");
                String str5 = (String) entry.getKey();
                String str6 = (String) entry.getValue();
                Context context = Hv0.b;
                return AbstractC1701hf0.e(str5, "=", C3325yL.r(str5, str6));
            case 6:
                C0628Nh c0628Nh2 = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh2, "cookie");
                return c0628Nh2.a + "=" + c0628Nh2.b;
            case 7:
                Ox0 ox0 = (Ox0) obj;
                AbstractC1474fG.j(ox0, "it");
                return C1152by0.r(ox0);
            default:
                String strM = ((C3176wp) obj).M();
                AbstractC1474fG.i(strM, "data(...)");
                return strM;
        }
    }
}
