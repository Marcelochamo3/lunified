package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AK implements InterfaceC3017v7 {
    public final AbstractC0985aF a;
    public final int b;

    public AK(int i, M60 m60) {
        this.b = i;
        this.a = m60;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AK b(int i, C2562qX c2562qX) {
        String str;
        String str2;
        InterfaceC3017v7 c3308y7;
        int i2 = 4;
        U9.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = c2562qX.c;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (c2562qX.a() > 8) {
            int i7 = c2562qX.i();
            int i8 = c2562qX.b + c2562qX.i();
            c2562qX.E(i8);
            if (i7 != 1414744396) {
                Ag0 ag0 = null;
                switch (i7) {
                    case 1718776947:
                        if (i5 == 2) {
                            c2562qX.G(i2);
                            int i9 = c2562qX.i();
                            int i10 = c2562qX.i();
                            c2562qX.G(i2);
                            switch (c2562qX.i()) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AP.z();
                            } else {
                                C0617Mw c0617Mw = new C0617Mw();
                                c0617Mw.p = i9;
                                c0617Mw.q = i10;
                                c0617Mw.k = str2;
                                ag0 = new Ag0(new C0643Nw(c0617Mw));
                            }
                        } else if (i5 == 1) {
                            int iN = c2562qX.n();
                            if (iN == 1) {
                                str = "audio/raw";
                            } else if (iN == 85) {
                                str = "audio/mpeg";
                            } else if (iN == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iN != 8192) {
                                str = iN != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str == null) {
                                AP.z();
                            } else {
                                int iN2 = c2562qX.n();
                                int i11 = c2562qX.i();
                                c2562qX.G(6);
                                int iX = Lr0.x(c2562qX.z());
                                int iN3 = c2562qX.n();
                                byte[] bArr = new byte[iN3];
                                c2562qX.e(bArr, i4, iN3);
                                C0617Mw c0617Mw2 = new C0617Mw();
                                c0617Mw2.k = str;
                                c0617Mw2.x = iN2;
                                c0617Mw2.y = i11;
                                if ("audio/raw".equals(str) && iX != 0) {
                                    c0617Mw2.z = iX;
                                }
                                if ("audio/mp4a-latm".equals(str) && iN3 > 0) {
                                    c0617Mw2.m = AbstractC0985aF.q(bArr);
                                }
                                ag0 = new Ag0(new C0643Nw(c0617Mw2));
                            }
                        } else {
                            Lr0.D(i5);
                            AP.z();
                        }
                        c3308y7 = ag0;
                        break;
                    case 1751742049:
                        int i12 = c2562qX.i();
                        c2562qX.G(8);
                        int i13 = c2562qX.i();
                        int i14 = c2562qX.i();
                        c2562qX.G(i2);
                        c2562qX.i();
                        c2562qX.G(12);
                        c3308y7 = new C3308y7(i12, i13, i14);
                        break;
                    case 1752331379:
                        int i15 = c2562qX.i();
                        c2562qX.G(12);
                        c2562qX.i();
                        int i16 = c2562qX.i();
                        int i17 = c2562qX.i();
                        c2562qX.G(i2);
                        int i18 = c2562qX.i();
                        int i19 = c2562qX.i();
                        c2562qX.G(8);
                        c3308y7 = new C3405z7(i15, i16, i17, i18, i19);
                        break;
                    case 1852994675:
                        c3308y7 = new Eg0(c2562qX.s(c2562qX.a(), AbstractC1402ed.c));
                        break;
                    default:
                        c3308y7 = ag0;
                        break;
                }
            } else {
                c3308y7 = b(c2562qX.i(), c2562qX);
            }
            if (c3308y7 != null) {
                if (c3308y7.getType() == 1752331379) {
                    int i20 = ((C3405z7) c3308y7).a;
                    if (i20 == 1935960438) {
                        i5 = 2;
                    } else if (i20 == 1935963489) {
                        i5 = 1;
                    } else if (i20 != 1937012852) {
                        Integer.toHexString(i20);
                        AP.z();
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i21 = i6 + 1;
                if (objArrCopyOf.length < i21) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, TE.e(objArrCopyOf.length, i21));
                }
                objArrCopyOf[i6] = c3308y7;
                i6 = i21;
            }
            c2562qX.F(i8);
            c2562qX.E(i3);
            i2 = 4;
            i4 = 0;
        }
        return new AK(i, AbstractC0985aF.j(i6, objArrCopyOf));
    }

    public final InterfaceC3017v7 a(Class cls) {
        XE xeListIterator = this.a.listIterator(0);
        while (xeListIterator.hasNext()) {
            InterfaceC3017v7 interfaceC3017v7 = (InterfaceC3017v7) xeListIterator.next();
            if (interfaceC3017v7.getClass() == cls) {
                return interfaceC3017v7;
            }
        }
        return null;
    }

    @Override // o.InterfaceC3017v7
    public final int getType() {
        return this.b;
    }
}
