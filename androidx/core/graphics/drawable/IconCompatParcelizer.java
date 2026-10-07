package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o.AbstractC3280xs0;
import o.C3377ys0;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC3280xs0 abstractC3280xs0) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = abstractC3280xs0.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (abstractC3280xs0.e(2)) {
            Parcel parcel = ((C3377ys0) abstractC3280xs0).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = abstractC3280xs0.g(iconCompat.d, 3);
        iconCompat.e = abstractC3280xs0.f(iconCompat.e, 4);
        iconCompat.f = abstractC3280xs0.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) abstractC3280xs0.g(iconCompat.g, 6);
        String string = iconCompat.i;
        if (abstractC3280xs0.e(7)) {
            string = ((C3377ys0) abstractC3280xs0).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (abstractC3280xs0.e(8)) {
            string2 = ((C3377ys0) abstractC3280xs0).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            abstractC3280xs0.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC3280xs0.i(2);
            int length = bArr.length;
            Parcel parcel = ((C3377ys0) abstractC3280xs0).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC3280xs0.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC3280xs0.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            abstractC3280xs0.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC3280xs0.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC3280xs0.i(7);
            ((C3377ys0) abstractC3280xs0).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC3280xs0.i(8);
            ((C3377ys0) abstractC3280xs0).e.writeString(str2);
        }
    }
}
