package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.AP;
import o.C2452pK;
import o.S5;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle l;

    static {
        S5 s5 = new S5(0);
        s5.put("android.media.metadata.TITLE", 1);
        s5.put("android.media.metadata.ARTIST", 1);
        s5.put("android.media.metadata.DURATION", 0);
        s5.put("android.media.metadata.ALBUM", 1);
        s5.put("android.media.metadata.AUTHOR", 1);
        s5.put("android.media.metadata.WRITER", 1);
        s5.put("android.media.metadata.COMPOSER", 1);
        s5.put("android.media.metadata.COMPILATION", 1);
        s5.put("android.media.metadata.DATE", 1);
        s5.put("android.media.metadata.YEAR", 0);
        s5.put("android.media.metadata.GENRE", 1);
        s5.put("android.media.metadata.TRACK_NUMBER", 0);
        s5.put("android.media.metadata.NUM_TRACKS", 0);
        s5.put("android.media.metadata.DISC_NUMBER", 0);
        s5.put("android.media.metadata.ALBUM_ARTIST", 1);
        s5.put("android.media.metadata.ART", 2);
        s5.put("android.media.metadata.ART_URI", 1);
        s5.put("android.media.metadata.ALBUM_ART", 2);
        s5.put("android.media.metadata.ALBUM_ART_URI", 1);
        s5.put("android.media.metadata.USER_RATING", 3);
        s5.put("android.media.metadata.RATING", 3);
        s5.put("android.media.metadata.DISPLAY_TITLE", 1);
        s5.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        s5.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        s5.put("android.media.metadata.DISPLAY_ICON", 2);
        s5.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        s5.put("android.media.metadata.MEDIA_ID", 1);
        s5.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        s5.put("android.media.metadata.MEDIA_URI", 1);
        s5.put("android.media.metadata.ADVERTISEMENT", 0);
        s5.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C2452pK(6);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.l = parcel.readBundle(AP.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.l);
    }
}
