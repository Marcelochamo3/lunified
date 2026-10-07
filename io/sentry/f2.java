package io.sentry;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends U1 {
    public static final io.sentry.protocol.C A = io.sentry.protocol.C.CUSTOM;
    public String v;
    public io.sentry.protocol.C w;
    public e2 x;
    public C0032c y;
    public Z z;

    public f2(String str, io.sentry.protocol.C c, String str2, e2 e2Var) {
        super(new io.sentry.protocol.t((UUID) null), new W1(), str2, null, null);
        this.z = Z.SENTRY;
        io.sentry.config.a.C(str, "name is required");
        this.v = str;
        this.w = c;
        this.f55o = e2Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    public static f2 a(L0 l0) {
        Double dValueOf;
        Boolean bool = (Boolean) l0.d;
        e2 e2Var = bool == null ? null : new e2(bool, null);
        C0032c c0032c = (C0032c) l0.e;
        if (c0032c != null) {
            c0032c.b = false;
            String strN = c0032c.n("sentry-sample_rate");
            if (strN != null) {
                try {
                    double d = Double.parseDouble(strN);
                    if (io.sentry.config.a.x(Double.valueOf(d), false)) {
                        dValueOf = Double.valueOf(d);
                    } else {
                        dValueOf = null;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                dValueOf = null;
            }
            Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            e2Var = dValueOf != null ? new e2(boolValueOf, dValueOf) : new e2(boolValueOf, null);
        }
        f2 f2Var = new f2((io.sentry.protocol.t) l0.a, (W1) l0.b, "default", (W1) l0.c, null);
        f2Var.z = Z.SENTRY;
        f2Var.v = "<unlabeled transaction>";
        f2Var.x = e2Var;
        f2Var.w = A;
        f2Var.y = c0032c;
        return f2Var;
    }
}
