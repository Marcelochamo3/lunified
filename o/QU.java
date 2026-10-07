package o;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QU {
    public static QU e;
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public QU(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.b = strArr;
        this.c = iArr;
        this.d = strArr2;
        this.a = i;
    }

    public static void a(QU qu, int i) {
        synchronized (qu.d) {
            try {
                if (qu.a == i) {
                    return;
                }
                qu.a = i;
                for (WeakReference weakReference : (CopyOnWriteArrayList) qu.c) {
                    C2002kk c2002kk = (C2002kk) weakReference.get();
                    if (c2002kk != null) {
                        c2002kk.a(i);
                    } else {
                        ((CopyOnWriteArrayList) qu.c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized QU c(Context context) {
        try {
            if (e == null) {
                e = new QU(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public String b(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = (String[]) this.b;
            int i3 = this.a;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            int i4 = ((int[]) this.c)[i2];
            if (i4 == 1) {
                sb.append(str);
            } else {
                String[] strArr2 = (String[]) this.d;
                if (i4 == 2) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, strArr2[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    public int d() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public QU(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C1066b4(2, this), intentFilter);
    }
}
