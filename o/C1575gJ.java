package o;

/* JADX INFO: renamed from: o.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1575gJ {
    private final Integer current_page;
    private final Integer last_page;
    private final Integer total;

    public final Integer a() {
        return this.last_page;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1575gJ)) {
            return false;
        }
        C1575gJ c1575gJ = (C1575gJ) obj;
        return AbstractC1474fG.b(this.current_page, c1575gJ.current_page) && AbstractC1474fG.b(this.last_page, c1575gJ.last_page) && AbstractC1474fG.b(this.total, c1575gJ.total);
    }

    public final int hashCode() {
        Integer num = this.current_page;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.last_page;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "LaMoviePagination(current_page=" + this.current_page + ", last_page=" + this.last_page + ", total=" + this.total + ")";
    }
}
