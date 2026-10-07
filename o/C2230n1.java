package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: o.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2230n1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C2230n1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                C2327o1 c2327o1 = new C2327o1();
                c2327o1.l = parcel.readInt();
                return c2327o1;
            case 1:
                return new I1(parcel);
            case 2:
                return new C3009v3(parcel);
            case 3:
                G4 g4 = new G4(parcel);
                g4.l = parcel.readByte() != 0;
                return g4;
            case 4:
                String string = parcel.readString();
                string.getClass();
                return new C1752i5(parcel.readInt(), string);
            case 5:
                return new G7(parcel);
            case 6:
                return new H7(parcel);
            case 7:
                K7 k7 = new K7();
                k7.t = 255;
                k7.v = -2;
                k7.w = -2;
                k7.x = -2;
                k7.E = Boolean.TRUE;
                k7.l = parcel.readInt();
                k7.m = (Integer) parcel.readSerializable();
                k7.n = (Integer) parcel.readSerializable();
                k7.f356o = (Integer) parcel.readSerializable();
                k7.p = (Integer) parcel.readSerializable();
                k7.q = (Integer) parcel.readSerializable();
                k7.r = (Integer) parcel.readSerializable();
                k7.s = (Integer) parcel.readSerializable();
                k7.t = parcel.readInt();
                k7.u = parcel.readString();
                k7.v = parcel.readInt();
                k7.w = parcel.readInt();
                k7.x = parcel.readInt();
                k7.z = parcel.readString();
                k7.A = parcel.readString();
                k7.B = parcel.readInt();
                k7.D = (Integer) parcel.readSerializable();
                k7.F = (Integer) parcel.readSerializable();
                k7.G = (Integer) parcel.readSerializable();
                k7.H = (Integer) parcel.readSerializable();
                k7.I = (Integer) parcel.readSerializable();
                k7.J = (Integer) parcel.readSerializable();
                k7.K = (Integer) parcel.readSerializable();
                k7.N = (Integer) parcel.readSerializable();
                k7.L = (Integer) parcel.readSerializable();
                k7.M = (Integer) parcel.readSerializable();
                k7.E = (Boolean) parcel.readSerializable();
                k7.y = (Locale) parcel.readSerializable();
                k7.O = (Boolean) parcel.readSerializable();
                return k7;
            case 8:
                return new F8(parcel);
            case 9:
                return new C0570La((WQ) parcel.readParcelable(WQ.class.getClassLoader()), (WQ) parcel.readParcelable(WQ.class.getClassLoader()), (C3455zj) parcel.readParcelable(C3455zj.class.getClassLoader()), (WQ) parcel.readParcelable(WQ.class.getClassLoader()), parcel.readInt());
            case 10:
                return new C0831Vc(parcel);
            case 11:
                return new C0857Wc(parcel);
            case 12:
                return new C3156wf(parcel);
            case 13:
                return new C2581qi(parcel);
            case 14:
                return new C3455zj(parcel.readLong());
            case 15:
                return new C3271xo(parcel);
            case 16:
                return new C3174wo(parcel);
            case 17:
                return new C2788sp(parcel);
            case 18:
                return new C2016kr(parcel);
            case 19:
                C2804sx c2804sx = new C2804sx();
                c2804sx.l = parcel.readString();
                c2804sx.m = parcel.readInt();
                return c2804sx;
            case 20:
                C3386yx c3386yx = new C3386yx();
                c3386yx.p = null;
                c3386yx.q = new ArrayList();
                c3386yx.r = new ArrayList();
                c3386yx.l = parcel.createStringArrayList();
                c3386yx.m = parcel.createStringArrayList();
                c3386yx.n = (G7[]) parcel.createTypedArray(G7.CREATOR);
                c3386yx.f1141o = parcel.readInt();
                c3386yx.p = parcel.readString();
                c3386yx.q = parcel.createStringArrayList();
                c3386yx.r = parcel.createTypedArrayList(H7.CREATOR);
                c3386yx.s = parcel.createTypedArrayList(C2804sx.CREATOR);
                return c3386yx;
            case 21:
                return new C0644Nx(parcel);
            case 22:
                return new C0620Mz(parcel);
            case 23:
                C3120wA c3120wA = new C3120wA();
                c3120wA.m = Bundle.EMPTY;
                c3120wA.l = parcel.readInt();
                c3120wA.m = parcel.readBundle(C3217xA.class.getClassLoader());
                return c3120wA;
            case 24:
                return new C2831tC(parcel);
            case 25:
                return new C2734sC(parcel);
            case 26:
                return new JE(parcel);
            case 27:
                return new KE(parcel);
            case 28:
                AbstractC1474fG.j(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC1474fG.g(parcelable);
                return new C1084bG((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                return new C1279dG(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C2327o1[i];
            case 1:
                return new I1[i];
            case 2:
                return new C3009v3[i];
            case 3:
                return new G4[i];
            case 4:
                return new C1752i5[i];
            case 5:
                return new G7[i];
            case 6:
                return new H7[i];
            case 7:
                return new K7[i];
            case 8:
                return new F8[i];
            case 9:
                return new C0570La[i];
            case 10:
                return new C0831Vc[i];
            case 11:
                return new C0857Wc[i];
            case 12:
                return new C3156wf[i];
            case 13:
                return new C2581qi[i];
            case 14:
                return new C3455zj[i];
            case 15:
                return new C3271xo[i];
            case 16:
                return new C3174wo[i];
            case 17:
                return new C2788sp[i];
            case 18:
                return new C2016kr[i];
            case 19:
                return new C2804sx[i];
            case 20:
                return new C3386yx[i];
            case 21:
                return new C0644Nx[i];
            case 22:
                return new C0620Mz[i];
            case 23:
                return new C3120wA[i];
            case 24:
                return new C2831tC[i];
            case 25:
                return new C2734sC[i];
            case 26:
                return new JE[i];
            case 27:
                return new KE[i];
            case 28:
                return new C1084bG[i];
            default:
                return new C1279dG[i];
        }
    }
}
