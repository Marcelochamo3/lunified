package o;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: o.nv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2317nv0 extends AbstractC1074b8 {
    static {
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").setTimeZone(DesugarTimeZone.getTimeZone("GMT-0"));
    }
}
