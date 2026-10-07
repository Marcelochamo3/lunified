package o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import o.AbstractC1674hK;
import o.C2452pK;

/* JADX INFO: renamed from: o.pK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2452pK implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C2452pK(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        DE de = null;
        switch (this.a) {
            case 0:
                C2549qK c2549qK = new C2549qK();
                c2549qK.l = parcel.readInt();
                c2549qK.m = parcel.readInt();
                c2549qK.n = parcel.readInt() == 1;
                return c2549qK;
            case 1:
                return new KK(parcel);
            case 2:
                C1482fO c1482fO = new C1482fO(parcel);
                c1482fO.l = ((Integer) parcel.readValue(C1482fO.class.getClassLoader())).intValue();
                return c1482fO;
            case 3:
                return new C2746sO(parcel);
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C2452pK(4);
                    public final int l;
                    public final MediaDescriptionCompat m;

                    {
                        this.l = parcel.readInt();
                        this.m = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.l + ", mDescription=" + this.m + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.l);
                        this.m.writeToParcel(parcel2, i);
                    }
                };
            case 5:
                int i = Build.VERSION.SDK_INT;
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = TO.g(mediaDescription);
                CharSequence charSequenceI = TO.i(mediaDescription);
                CharSequence charSequenceH = TO.h(mediaDescription);
                CharSequence charSequenceC = TO.c(mediaDescription);
                Bitmap bitmapE = TO.e(mediaDescription);
                Uri uriF = TO.f(mediaDescription);
                Bundle bundleD = TO.d(mediaDescription);
                if (bundleD != null) {
                    bundleD.setClassLoader(AP.class.getClassLoader());
                    try {
                        bundleD.isEmpty();
                    } catch (BadParcelableException unused) {
                        bundleD = null;
                    }
                    break;
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = i >= 23 ? UO.a(mediaDescription) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.t = mediaDescription;
                return mediaDescriptionCompat;
            case 6:
                return new MediaMetadataCompat(parcel);
            case 7:
                AbstractC1474fG.j(parcel, "parcel");
                return new C3426zP(parcel.readString(), parcel.readString());
            case 8:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C2452pK(8);
                    public final MediaDescriptionCompat l;
                    public final long m;

                    {
                        this.l = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.m = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.l);
                        sb.append(", Id=");
                        return AbstractC1674hK.q(sb, this.m, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        this.l.writeToParcel(parcel2, i2);
                        parcel2.writeLong(this.m);
                    }
                };
            case 9:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C2452pK(9);
                    public final Object l;
                    public final Object m;

                    {
                        this.m = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.m;
                        if (obj2 == null) {
                            return mediaSessionCompat$Token.m == null;
                        }
                        Object obj3 = mediaSessionCompat$Token.m;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.m;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeParcelable((Parcelable) this.m, i2);
                    }
                };
            case 10:
                return new CQ(parcel);
            case 11:
                return new JQ(parcel);
            case 12:
                return WQ.a(parcel.readInt(), parcel.readInt());
            case 13:
                return new C1095bR(parcel);
            case 14:
                return new C2944uS(parcel);
            case 15:
                return new HS(parcel);
            case 16:
                AbstractC1474fG.j(parcel, "inParcel");
                return new ET(parcel);
            case 17:
                C2559qU c2559qU = new C2559qU();
                c2559qU.l = parcel.readInt();
                c2559qU.m = (C2368oX) parcel.readParcelable(C2559qU.class.getClassLoader());
                return c2559qU;
            case 18:
                HU hu = new HU(parcel);
                hu.l = parcel.readInt();
                return hu;
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.l = parcel.readInt();
                parcelableVolumeInfo.n = parcel.readInt();
                parcelableVolumeInfo.f1o = parcel.readInt();
                parcelableVolumeInfo.p = parcel.readInt();
                parcelableVolumeInfo.m = parcel.readInt();
                return parcelableVolumeInfo;
            case 21:
                return new OY(parcel);
            case 22:
                return new PlaybackStateCompat(parcel);
            case 23:
                return new K20(parcel);
            case 24:
                return new T20(parcel);
            case 25:
                return new C1943k30(parcel);
            case 26:
                return new C2041l30(parcel);
            case 27:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 28:
                C2729s80 c2729s80 = new C2729s80();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = BinderC2632r80.e;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(DE.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof DE)) {
                        CE ce = new CE();
                        ce.d = strongBinder;
                        de = ce;
                    } else {
                        de = (DE) iInterfaceQueryLocalInterface;
                    }
                }
                c2729s80.l = de;
                return c2729s80;
            default:
                return new C2471pb0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C2549qK[i];
            case 1:
                return new KK[i];
            case 2:
                return new C1482fO[i];
            case 3:
                return new C2746sO[i];
            case 4:
                return new MediaBrowserCompat$MediaItem[i];
            case 5:
                return new MediaDescriptionCompat[i];
            case 6:
                return new MediaMetadataCompat[i];
            case 7:
                return new C3426zP[i];
            case 8:
                return new MediaSessionCompat$QueueItem[i];
            case 9:
                return new MediaSessionCompat$Token[i];
            case 10:
                return new CQ[i];
            case 11:
                return new JQ[i];
            case 12:
                return new WQ[i];
            case 13:
                return new C1095bR[i];
            case 14:
                return new C2944uS[i];
            case 15:
                return new HS[i];
            case 16:
                return new ET[i];
            case 17:
                return new C2559qU[i];
            case 18:
                return new HU[i];
            case 19:
                return new ParcelImpl[i];
            case 20:
                return new ParcelableVolumeInfo[i];
            case 21:
                return new OY[i];
            case 22:
                return new PlaybackStateCompat[i];
            case 23:
                return new K20[i];
            case 24:
                return new T20[i];
            case 25:
                return new C1943k30[i];
            case 26:
                return new C2041l30[i];
            case 27:
                return new RatingCompat[i];
            case 28:
                return new C2729s80[i];
            default:
                return new C2471pb0[i];
        }
    }
}
