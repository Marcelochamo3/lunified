package j$.util;

import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
abstract class f0 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new e0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
