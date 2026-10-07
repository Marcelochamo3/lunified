package o;

import j$.time.Duration;
import j$.util.Optional;
import j$.util.OptionalInt;

/* JADX INFO: loaded from: classes.dex */
public class Ci0 extends AbstractC2304np {
    private static final Duration c = Duration.ofMillis(6553600);
    private Integer b;

    public Ci0() {
        super(11);
        this.b = null;
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) throws Rw0 {
        int iK = c0474Hi.k();
        if (iK == 0) {
            this.b = null;
        } else {
            if (iK != 2) {
                throw new Rw0(AbstractC1674hK.p("invalid length (", iK, ") of the data in the edns_tcp_keepalive option"));
            }
            this.b = Integer.valueOf(c0474Hi.h());
        }
    }

    @Override // o.AbstractC2304np
    public String f() {
        Integer num = this.b;
        return num != null ? String.valueOf(num) : "-";
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        Integer num = this.b;
        if (num != null) {
            c0578Li.l(num.intValue());
        }
    }

    public OptionalInt j() {
        Integer num = this.b;
        return num == null ? OptionalInt.empty() : OptionalInt.of(num.intValue());
    }

    public Optional<Duration> k() {
        Integer num = this.b;
        return num != null ? Optional.of(Duration.ofMillis(((long) num.intValue()) * 100)) : Optional.empty();
    }

    public Ci0(int i) {
        super(11);
        if (i >= 0 && i <= 65535) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new IllegalArgumentException("timeout must be betwee 0 and 65535");
    }

    public Ci0(Duration duration) {
        super(11);
        if (!duration.isNegative() && duration.compareTo(c) < 0) {
            this.b = Integer.valueOf(((int) duration.toMillis()) / 100);
            return;
        }
        throw new IllegalArgumentException("timeout must be between 0 and 6553.6 seconds (exclusively)");
    }
}
