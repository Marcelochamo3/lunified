package o;

import java.util.HashSet;

/* JADX INFO: renamed from: o.hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1726hs {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }
}
