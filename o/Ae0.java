package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Ae0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ Ae0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, Be0.class.getClassLoader());
                return new Ce0(arrayList);
            case 1:
                return new Be0(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 2:
                return new Ee0(parcel);
            case 3:
                return new Ef0(parcel);
            case 4:
                return new Ff0();
            case 5:
                return new If0(parcel);
            case 6:
                C1409eg0 c1409eg0 = new C1409eg0();
                c1409eg0.l = parcel.readInt();
                c1409eg0.m = parcel.readInt();
                c1409eg0.f759o = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c1409eg0.n = iArr;
                    parcel.readIntArray(iArr);
                }
                return c1409eg0;
            case 7:
                C1507fg0 c1507fg0 = new C1507fg0();
                c1507fg0.l = parcel.readInt();
                c1507fg0.m = parcel.readInt();
                int i2 = parcel.readInt();
                c1507fg0.n = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c1507fg0.f778o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c1507fg0.p = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c1507fg0.q = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c1507fg0.s = parcel.readInt() == 1;
                c1507fg0.t = parcel.readInt() == 1;
                c1507fg0.u = parcel.readInt() == 1;
                c1507fg0.r = parcel.readArrayList(C1409eg0.class.getClassLoader());
                return c1507fg0;
            case 8:
                return new Cg0(parcel);
            case 9:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new Li0(string, string2, AbstractC0985aF.m(strArrCreateStringArray));
            case 10:
                return new Aj0(parcel.readLong(), parcel.readLong());
            case 11:
                return new C2596qp0(parcel);
            case 12:
                return new C3472zr0(parcel);
            case 13:
                AbstractC1474fG.j(parcel, "parcel");
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i4 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i4);
                    for (int i5 = 0; i5 != i4; i5++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(Es0.CREATOR.createFromParcel(parcel));
                }
                return new Js0(string3, linkedHashMap, string4, string5, string6, bArrCreateByteArray, string7, string8, string9, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                AbstractC1474fG.j(parcel, "parcel");
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i8 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i8);
                    for (int i9 = 0; i9 != i8; i9++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap2 = linkedHashMap3;
                }
                return new Ds0(string10, string11, string12, linkedHashMap2, parcel.readString(), parcel.readString());
            case 15:
                AbstractC1474fG.j(parcel, "parcel");
                return new Es0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 16:
                AbstractC1474fG.j(parcel, "parcel");
                return new Hs0(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), Gs0.CREATOR.createFromParcel(parcel), Fs0.CREATOR.createFromParcel(parcel));
            case 17:
                AbstractC1474fG.j(parcel, "parcel");
                return new Fs0(parcel.readInt(), parcel.readString());
            case 18:
                AbstractC1474fG.j(parcel, "parcel");
                return new Gs0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                AbstractC1474fG.j(parcel, "parcel");
                return new Is0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new Vu0(parcel);
            default:
                return new Wu0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Ce0[i];
            case 1:
                return new Be0[i];
            case 2:
                return new Ee0[i];
            case 3:
                return new Ef0[i];
            case 4:
                return new Ff0[i];
            case 5:
                return new If0[i];
            case 6:
                return new C1409eg0[i];
            case 7:
                return new C1507fg0[i];
            case 8:
                return new Cg0[i];
            case 9:
                return new Li0[i];
            case 10:
                return new Aj0[i];
            case 11:
                return new C2596qp0[i];
            case 12:
                return new C3472zr0[i];
            case 13:
                return new Js0[i];
            case 14:
                return new Ds0[i];
            case 15:
                return new Es0[i];
            case 16:
                return new Hs0[i];
            case 17:
                return new Fs0[i];
            case 18:
                return new Gs0[i];
            case 19:
                return new Is0[i];
            case 20:
                return new Vu0[i];
            default:
                return new Wu0[i];
        }
    }
}
