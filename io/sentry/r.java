package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final Object a;
    public final Object b;
    public final Object c;

    public r(I1 i1) {
        io.sentry.transport.d dVar = io.sentry.transport.d.l;
        this.c = new ConcurrentHashMap();
        this.a = dVar;
        this.b = i1;
    }

    public void a(EnumC0053j enumC0053j, Date date) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date2 = (Date) concurrentHashMap.get(enumC0053j);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC0053j, date);
        }
    }

    public boolean b(EnumC0053j enumC0053j) {
        Date date;
        Date date2 = new Date(((io.sentry.transport.f) this.a).b());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date3 = (Date) concurrentHashMap.get(EnumC0053j.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC0053j.Unknown.equals(enumC0053j) || (date = (Date) concurrentHashMap.get(enumC0053j)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public r(String str) {
        try {
            io.sentry.config.a.C(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] strArrSplit = userInfo.split(":", -1);
                String str2 = strArrSplit[0];
                this.b = str2;
                if (str2 != null && !str2.isEmpty()) {
                    this.a = strArrSplit.length > 1 ? strArrSplit[1] : null;
                    String path = uriNormalize.getPath();
                    path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                    int iLastIndexOf = path.lastIndexOf("/") + 1;
                    String strSubstring = path.substring(0, iLastIndexOf);
                    strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
                    String strSubstring2 = path.substring(iLastIndexOf);
                    if (!strSubstring2.isEmpty()) {
                        this.c = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    public r(io.sentry.android.core.A a) {
        this.a = a;
        this.b = null;
        this.c = null;
    }

    public r(io.sentry.android.core.A a, byte[] bArr) {
        this.a = a;
        this.b = bArr;
        this.c = null;
    }

    public r(io.sentry.android.core.A a, byte[] bArr, ArrayList arrayList) {
        this.a = a;
        this.b = bArr;
        this.c = arrayList;
    }
}
