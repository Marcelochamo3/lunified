package o;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC1417ek0 {
    public static final C1027ak0 l;
    public static final C1125bk0 m;
    public static final /* synthetic */ EnumC1417ek0[] n;

    static {
        C1027ak0 c1027ak0 = new C1027ak0();
        l = c1027ak0;
        C1125bk0 c1125bk0 = new C1125bk0();
        m = c1125bk0;
        n = new EnumC1417ek0[]{c1027ak0, c1125bk0, new EnumC1417ek0() { // from class: o.ck0
            @Override // o.EnumC1417ek0
            public final Number a(WH wh) throws IOException {
                String strH0 = wh.h0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strH0));
                    } catch (NumberFormatException e) {
                        StringBuilder sbL = AbstractC1701hf0.l("Cannot parse ", strH0, "; at path ");
                        sbL.append(wh.R());
                        throw new UH(sbL.toString(), e);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strH0);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!wh.m) {
                            throw new C2164mN("JSON forbids NaN and infinities: " + dValueOf + "; at path " + wh.R());
                        }
                    }
                    return dValueOf;
                }
            }
        }, new EnumC1417ek0() { // from class: o.dk0
            @Override // o.EnumC1417ek0
            public final Number a(WH wh) throws IOException {
                String strH0 = wh.h0();
                try {
                    return new BigDecimal(strH0);
                } catch (NumberFormatException e) {
                    StringBuilder sbL = AbstractC1701hf0.l("Cannot parse ", strH0, "; at path ");
                    sbL.append(wh.R());
                    throw new UH(sbL.toString(), e);
                }
            }
        }};
    }

    public static EnumC1417ek0 valueOf(String str) {
        return (EnumC1417ek0) Enum.valueOf(EnumC1417ek0.class, str);
    }

    public static EnumC1417ek0[] values() {
        return (EnumC1417ek0[]) n.clone();
    }

    public abstract Number a(WH wh);
}
