package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0308Ay extends LinkedHashMap {
    public final /* synthetic */ int l = 4;

    public C0308Ay(int i) {
        super(i, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.l;
    }
}
