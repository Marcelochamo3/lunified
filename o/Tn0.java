package o;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Tn0 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tn0(boolean z) {
        super(1);
        this.m = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        String lowerCase;
        String str;
        Ds0 ds0 = (Ds0) obj;
        AbstractC1474fG.j(ds0, "standby");
        Map map = ds0.f223o;
        if (map == null || (str = (String) map.get("extractor")) == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        }
        boolean z = false;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1214145621:
                    if (lowerCase.equals("hlwish")) {
                        z = true;
                    }
                    break;
                case -1193818974:
                    if (lowerCase.equals("streamtape")) {
                        z = true;
                    }
                    break;
                case -1193721817:
                    if (lowerCase.equals("streamwish")) {
                        z = true;
                    }
                    break;
                case -734784899:
                    if (lowerCase.equals("filemoon")) {
                        z = true;
                    }
                    break;
                case 116940:
                    if (lowerCase.equals("voe")) {
                        if (this.m) {
                            C1816io0 c1816io0 = C1816io0.b;
                            if (!C1816io0.D()) {
                                z = true;
                            }
                        } else {
                            z = true;
                        }
                    }
                    break;
                case 112383025:
                    if (lowerCase.equals("voesx")) {
                        if (this.m) {
                            z = true;
                        } else {
                            C1816io0 c1816io1 = C1816io0.b;
                            if (!C1816io0.D()) {
                                z = true;
                            }
                        }
                    }
                    break;
                case 452867283:
                    if (lowerCase.equals("vidhide")) {
                        z = true;
                    }
                    break;
                case 901987104:
                    if (lowerCase.equals("doodstream")) {
                        z = true;
                    }
                    break;
            }
        }
        return Boolean.valueOf(z);
    }
}
