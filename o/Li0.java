package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Li0 extends NE {
    public static final Parcelable.Creator<Li0> CREATOR = new Ae0(9);
    public final String m;
    public final AbstractC0985aF n;

    public Li0(String str, String str2, M60 m60) {
        super(str);
        AbstractC0397Ej.c(!m60.isEmpty());
        this.m = str2;
        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(m60);
        this.n = abstractC0985aFL;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.NE, o.BQ
    public final void d(C2166mP c2166mP) {
        String str = this.l;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = C3285xv.h;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 21;
                }
                break;
        }
        AbstractC0985aF abstractC0985aF = this.n;
        try {
            switch (b) {
                case 0:
                case 10:
                    c2166mP.d((CharSequence) abstractC0985aF.get(0));
                    break;
                case 1:
                case 11:
                    c2166mP.f((CharSequence) abstractC0985aF.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = (String) abstractC0985aF.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    c2166mP.i(Integer.valueOf(i));
                    c2166mP.h(Integer.valueOf(i2));
                    break;
                case 3:
                case 17:
                    c2166mP.e((CharSequence) abstractC0985aF.get(0));
                    break;
                case 4:
                case 18:
                    c2166mP.c((CharSequence) abstractC0985aF.get(0));
                    break;
                case 5:
                case 19:
                    c2166mP.g((CharSequence) abstractC0985aF.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrU = Lr0.U((String) abstractC0985aF.get(0));
                    int i3 = Integer.parseInt(strArrU[0]);
                    Integer numValueOf = strArrU.length > 1 ? Integer.valueOf(Integer.parseInt(strArrU[1])) : null;
                    c2166mP.p(Integer.valueOf(i3));
                    c2166mP.o(numValueOf);
                    break;
                case 7:
                case 16:
                    c2166mP.n((CharSequence) abstractC0985aF.get(0));
                    break;
                case 8:
                case 15:
                    c2166mP.q((CharSequence) abstractC0985aF.get(0));
                    break;
                case 9:
                case 21:
                    c2166mP.j(Integer.valueOf(Integer.parseInt((String) abstractC0985aF.get(0))));
                    break;
                case 13:
                    ArrayList arrayListA = a((String) abstractC0985aF.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c2166mP.h((Integer) arrayListA.get(2));
                            }
                        }
                        c2166mP.i((Integer) arrayListA.get(1));
                    }
                    c2166mP.j((Integer) arrayListA.get(0));
                    break;
                case 14:
                    ArrayList arrayListA2 = a((String) abstractC0985aF.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c2166mP.k((Integer) arrayListA2.get(2));
                            }
                        }
                        c2166mP.l((Integer) arrayListA2.get(1));
                    }
                    c2166mP.m((Integer) arrayListA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Li0.class != obj.getClass()) {
            return false;
        }
        Li0 li0 = (Li0) obj;
        return Lr0.a(this.l, li0.l) && Lr0.a(this.m, li0.m) && this.n.equals(li0.n);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(527, this.l, 31);
        String str = this.m;
        return this.n.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": description=" + this.m + ": values=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeStringArray((String[]) this.n.toArray(new String[0]));
    }
}
