package o;

import java.nio.charset.StandardCharsets;
import lombok.Generated;

/* JADX INFO: renamed from: o.ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2213ms extends AbstractC2304np {
    public static final int A = 23;
    public static final int B = 24;
    private static final MQ C;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f923o = 11;
    public static final int p = 12;
    public static final int q = 13;
    public static final int r = 14;
    public static final int s = 15;
    public static final int t = 16;
    public static final int u = 17;
    public static final int v = 18;
    public static final int w = 19;
    public static final int x = 20;
    public static final int y = 21;
    public static final int z = 22;
    private int b;
    private String c;

    static {
        MQ mq = new MQ("EDNS Extended Error Codes", 1);
        C = mq;
        mq.m(AQ.w);
        mq.o("EDE");
        mq.b(0, "OTHER");
        mq.b(1, "UNSUPPORTED_DNSKEY_ALGORITHM");
        mq.b(2, "UNSUPPORTED_DS_DIGEST_TYPE");
        mq.b(3, "STALE_ANSWER");
        mq.b(4, "FORGED_ANSWER");
        mq.b(5, "DNSSEC_INDETERMINATE");
        mq.b(6, "DNSSEC_BOGUS");
        mq.b(7, "SIGNATURE_EXPIRED");
        mq.b(8, "SIGNATURE_NOT_YET_VALID");
        mq.b(9, "DNSKEY_MISSING");
        mq.b(10, "RRSIGS_MISSING");
        mq.b(11, "NO_ZONE_KEY_BIT_SET");
        mq.b(12, "NSEC_MISSING");
        mq.b(13, "CACHED_ERROR");
        mq.b(14, "NOT_READY");
        mq.b(15, "BLOCKED");
        mq.b(16, "CENSORED");
        mq.b(17, "FILTERED");
        mq.b(18, "PROHIBITED");
        mq.b(19, "STALE_NXDOMAIN_ANSWER");
        mq.b(20, "NOT_AUTHORITATIVE");
        mq.b(21, "NOT_SUPPORTED");
        mq.b(22, "NO_REACHABLE_AUTHORITY");
        mq.b(23, "NETWORK_ERROR");
        mq.b(24, "INVALID_DATA");
    }

    public C2213ms() {
        super(15);
    }

    public static int j(String str) {
        return C.g(str);
    }

    public static String m(int i2) {
        return C.f(i2);
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) {
        this.b = c0474Hi.h();
        if (c0474Hi.k() > 0) {
            byte[] bArrE = c0474Hi.e();
            int length = bArrE.length;
            if (bArrE[bArrE.length - 1] == 0) {
                length--;
            }
            this.c = new String(bArrE, 0, length, StandardCharsets.UTF_8);
        }
    }

    @Override // o.AbstractC2304np
    public String f() {
        if (this.c == null) {
            return C.f(this.b);
        }
        return C.f(this.b) + ": " + this.c;
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        c0578Li.l(this.b);
        String str = this.c;
        if (str == null || str.length() <= 0) {
            return;
        }
        c0578Li.i(this.c.getBytes(StandardCharsets.UTF_8));
    }

    @Generated
    public int k() {
        return this.b;
    }

    @Generated
    public String l() {
        return this.c;
    }

    public C2213ms(int i2, String str) {
        super(15);
        this.b = i2;
        this.c = str;
    }

    public C2213ms(int i2) {
        this(i2, null);
    }
}
