package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.C2452pK;
import o.TO;
import o.UO;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C2452pK(5);
    public final String l;
    public final CharSequence m;
    public final CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f0o;
    public final Bitmap p;
    public final Uri q;
    public final Bundle r;
    public final Uri s;
    public MediaDescription t;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.l = str;
        this.m = charSequence;
        this.n = charSequence2;
        this.f0o = charSequence3;
        this.p = bitmap;
        this.q = uri;
        this.r = bundle;
        this.s = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.m) + ", " + ((Object) this.n) + ", " + ((Object) this.f0o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionA = this.t;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = TO.b();
            TO.n(builderB, this.l);
            TO.p(builderB, this.m);
            TO.o(builderB, this.n);
            TO.j(builderB, this.f0o);
            TO.l(builderB, this.p);
            TO.m(builderB, this.q);
            Bundle bundle2 = this.r;
            Uri uri = this.s;
            if (i2 >= 23 || uri == null) {
                TO.k(builderB, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                TO.k(builderB, bundle);
            }
            if (i2 >= 23) {
                UO.b(builderB, uri);
            }
            mediaDescriptionA = TO.a(builderB);
            this.t = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
