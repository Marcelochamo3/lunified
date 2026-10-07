package o;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1997kh0 extends AbstractC3226xJ implements InterfaceC0775Sy {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f871o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1997kh0(int i, Object obj, boolean z) {
        super(2);
        this.m = i;
        this.f871o = obj;
        this.n = z;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[LOOP:0: B:28:0x0072->B:39:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[LOOP:2: B:44:0x00af->B:55:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2 A[SYNTHETIC] */
    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        Object next;
        String str;
        C1101bX c1101bX;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.m) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC1474fG.j(charSequence, "$this$$receiver");
                int iF0 = AbstractC1119bh0.f0(charSequence, (char[]) this.f871o, iIntValue, this.n);
                if (iF0 < 0) {
                    return null;
                }
                return new C1101bX(Integer.valueOf(iF0), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                AbstractC1474fG.j(charSequence2, "$this$$receiver");
                List list = (List) this.f871o;
                boolean z = this.n;
                if (z || list.size() != 1) {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    ZF zf = new ZF(iIntValue2, charSequence2.length(), 1);
                    boolean z2 = charSequence2 instanceof String;
                    int i = zf.n;
                    int i2 = zf.m;
                    if (z2) {
                        if ((i <= 0 || iIntValue2 > i2) && (i >= 0 || i2 > iIntValue2)) {
                            c1101bX = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c1101bX = new C1101bX(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i2) {
                                        iIntValue2 += i;
                                    } else {
                                        c1101bX = null;
                                    }
                                } while (!AbstractC1899jh0.P(0, iIntValue2, str4.length(), str4, (String) charSequence2, z));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c1101bX = new C1101bX(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i2) {
                                    iIntValue2 += i;
                                } else {
                                    c1101bX = null;
                                }
                            }
                        }
                    } else if ((i <= 0 || iIntValue2 > i2) && (i >= 0 || i2 > iIntValue2)) {
                        c1101bX = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c1101bX = new C1101bX(Integer.valueOf(iIntValue2), str);
                                } else if (iIntValue2 != i2) {
                                    iIntValue2 += i;
                                } else {
                                    c1101bX = null;
                                }
                            } while (!AbstractC1119bh0.k0(str2, 0, charSequence2, iIntValue2, str2.length(), z));
                            str = (String) next;
                            if (str != null) {
                                c1101bX = new C1101bX(Integer.valueOf(iIntValue2), str);
                            } else if (iIntValue2 != i2) {
                                iIntValue2 += i;
                            } else {
                                c1101bX = null;
                            }
                        }
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iE0 = AbstractC1119bh0.e0(charSequence2, str5, iIntValue2, false, 4);
                    if (iE0 < 0) {
                        c1101bX = null;
                    } else {
                        c1101bX = new C1101bX(Integer.valueOf(iE0), str5);
                    }
                }
                if (c1101bX == null) {
                    return null;
                }
                return new C1101bX(c1101bX.l, Integer.valueOf(((String) c1101bX.m).length()));
        }
    }
}
