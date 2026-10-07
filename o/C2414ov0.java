package o;

/* JADX INFO: renamed from: o.ov0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2414ov0 extends AbstractC1758i8 {
    public static final String[] d = (String[]) AbstractC0397Ej.j(AbstractC1758i8.c, new String[]{"watch_next_type", "last_engagement_time_utc_millis"});

    public final long c() {
        Long asLong = this.a.getAsLong("last_engagement_time_utc_millis");
        if (asLong == null) {
            return -1L;
        }
        return asLong.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2414ov0)) {
            return false;
        }
        return this.a.equals(((C2414ov0) obj).a);
    }

    public final String toString() {
        return "WatchNextProgram{" + this.a.toString() + "}";
    }
}
