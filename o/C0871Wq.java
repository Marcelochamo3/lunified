package o;

/* JADX INFO: renamed from: o.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871Wq extends AbstractC0845Vq {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871Wq(int i, String str, String str2, boolean z) {
        super(str, str2, z);
        this.d = i;
    }

    @Override // o.AbstractC1332dr
    public final int a() {
        switch (this.d) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        switch (this.d) {
            case 0:
                String str = (String) this.b;
                if (c3176wp2.r(str)) {
                    if (((String) this.c).equalsIgnoreCase(c3176wp2.d(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = (String) this.b;
                return c3176wp2.r(str2) && AP.o(c3176wp2.d(str2)).contains((String) this.c);
            case 2:
                String str3 = (String) this.b;
                return c3176wp2.r(str3) && AP.o(c3176wp2.d(str3)).endsWith((String) this.c);
            case 3:
                return !((String) this.c).equalsIgnoreCase(c3176wp2.d((String) this.b));
            default:
                String str4 = (String) this.b;
                return c3176wp2.r(str4) && AP.o(c3176wp2.d(str4)).startsWith((String) this.c);
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                sb.append((String) this.b);
                sb.append("=");
                return AbstractC1701hf0.h(sb, (String) this.c, "]");
            case 1:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append((String) this.b);
                sb2.append("*=");
                return AbstractC1701hf0.h(sb2, (String) this.c, "]");
            case 2:
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append((String) this.b);
                sb3.append("$=");
                return AbstractC1701hf0.h(sb3, (String) this.c, "]");
            case 3:
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append((String) this.b);
                sb4.append("!=");
                return AbstractC1701hf0.h(sb4, (String) this.c, "]");
            default:
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append((String) this.b);
                sb5.append("^=");
                return AbstractC1701hf0.h(sb5, (String) this.c, "]");
        }
    }
}
