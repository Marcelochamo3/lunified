package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Generated;

/* JADX INFO: renamed from: o.iM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1774iM {
    private final List<H50> a;
    private final List<C2848tT> b;

    public C1774iM(List<H50> list, List<C2848tT> list2) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list2));
    }

    @Generated
    public List<C2848tT> a() {
        return this.b;
    }

    @Generated
    public List<H50> b() {
        return this.a;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1774iM)) {
            return false;
        }
        C1774iM c1774iM = (C1774iM) obj;
        List<H50> listB = b();
        List<H50> listB2 = c1774iM.b();
        if (listB != null ? !listB.equals(listB2) : listB2 != null) {
            return false;
        }
        List<C2848tT> listA = a();
        List<C2848tT> listA2 = c1774iM.a();
        return listA != null ? listA.equals(listA2) : listA2 == null;
    }

    @Generated
    public int hashCode() {
        List<H50> listB = b();
        int iHashCode = listB == null ? 43 : listB.hashCode();
        List<C2848tT> listA = a();
        return ((iHashCode + 59) * 59) + (listA != null ? listA.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "LookupResult(records=" + b() + ", aliases=" + a() + ")";
    }
}
