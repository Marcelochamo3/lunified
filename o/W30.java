package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W30 extends zy0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f587o;

    public W30(ArrayList arrayList) {
        this.f587o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W30) && AbstractC1474fG.b(this.f587o, ((W30) obj).f587o);
    }

    public final int hashCode() {
        return this.f587o.hashCode();
    }

    public final String toString() {
        return "Success(results=" + this.f587o + ")";
    }
}
