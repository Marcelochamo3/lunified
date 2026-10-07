package io.sentry.android.ndk;

import io.sentry.C0088s1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.i;

/* JADX INFO: loaded from: classes.dex */
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void close() {
        shutdown();
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.getSdkVersion() != null) {
            C0088s1.j().f("maven:io.sentry:sentry-android-ndk");
        }
        initSentryNative(sentryAndroidOptions);
        if (sentryAndroidOptions.isEnableScopeSync()) {
            sentryAndroidOptions.addScopeObserver(new b(sentryAndroidOptions));
        }
        sentryAndroidOptions.setDebugImagesLoader(new i());
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    private static native void shutdown();
}
