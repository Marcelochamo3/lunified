package o;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: o.rL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2646rL implements InterfaceC2550qL {
    public final LocaleList a;

    public C2646rL(Object obj) {
        this.a = AbstractC0712Qn.c(obj);
    }

    @Override // o.InterfaceC2550qL
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // o.InterfaceC2550qL
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((InterfaceC2550qL) obj).b());
    }

    @Override // o.InterfaceC2550qL
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // o.InterfaceC2550qL
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // o.InterfaceC2550qL
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
