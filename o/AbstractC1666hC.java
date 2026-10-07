package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1666hC implements InterfaceC1536fv {
    public final String a;
    public final List b;
    public final boolean c;

    public AbstractC1666hC(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
