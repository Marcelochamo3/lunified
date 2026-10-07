package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0130e implements InterfaceC0131f {
    private final InterfaceC0131f[] a;
    private final boolean b;

    C0130e(ArrayList arrayList, boolean z) {
        this((InterfaceC0131f[]) arrayList.toArray(new InterfaceC0131f[arrayList.size()]), z);
    }

    C0130e(InterfaceC0131f[] interfaceC0131fArr, boolean z) {
        this.a = interfaceC0131fArr;
        this.b = z;
    }

    public final C0130e a() {
        return !this.b ? this : new C0130e(this.a, false);
    }

    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            yVar.g();
        }
        try {
            for (InterfaceC0131f interfaceC0131f : this.a) {
                if (!interfaceC0131f.p(yVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                yVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC0131f[] interfaceC0131fArr = this.a;
        if (!z) {
            for (InterfaceC0131f interfaceC0131f : interfaceC0131fArr) {
                i = interfaceC0131f.r(wVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }
        wVar.r();
        int iR = i;
        for (InterfaceC0131f interfaceC0131f2 : interfaceC0131fArr) {
            iR = interfaceC0131f2.r(wVar, charSequence, iR);
            if (iR < 0) {
                wVar.f(false);
                return i;
            }
        }
        wVar.f(true);
        return iR;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0131f[] interfaceC0131fArr = this.a;
        if (interfaceC0131fArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC0131f interfaceC0131f : interfaceC0131fArr) {
                sb.append(interfaceC0131f);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
