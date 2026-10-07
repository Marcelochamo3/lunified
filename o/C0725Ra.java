package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0725Ra implements Serializable {
    public static final C0725Ra l = new C0725Ra();

    private Object readResolve() {
        return l;
    }
}
