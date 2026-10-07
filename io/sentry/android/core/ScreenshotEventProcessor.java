package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.C0001a;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0092u;
import io.sentry.K1;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotEventProcessor implements InterfaceC0092u {
    public final SentryAndroidOptions l;
    public final G m;
    public final io.sentry.android.core.internal.util.d n;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, G g) {
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.l = sentryAndroidOptions;
        this.m = g;
        this.n = new io.sentry.android.core.internal.util.d(3, 2000L);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.config.a.a(ScreenshotEventProcessor.class);
        }
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        return k1;
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x014e A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0158 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Type inference failed for: r11v3, types: [io.sentry.android.core.internal.util.i] */
    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        byte[] bArr;
        boolean z;
        if (!c0083q1.c()) {
            return c0083q1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.l;
        if (!sentryAndroidOptions.isAttachScreenshot()) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c0083q1;
        }
        WeakReference weakReference = (WeakReference) G.m.l;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity != null && !io.sentry.config.a.v(c0104y)) {
            boolean zB = this.n.b();
            sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
            if (zB) {
                return c0083q1;
            }
            io.sentry.util.thread.a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
            ILogger logger = sentryAndroidOptions.getLogger();
            G g = this.m;
            if (activity.isFinishing() || activity.isDestroyed()) {
                logger.h(EnumC0094u1.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            } else {
                Window window = activity.getWindow();
                if (window == null) {
                    logger.h(EnumC0094u1.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
                } else {
                    View viewPeekDecorView = window.peekDecorView();
                    if (viewPeekDecorView == null) {
                        logger.h(EnumC0094u1.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
                    } else {
                        View rootView = viewPeekDecorView.getRootView();
                        if (rootView == null) {
                            logger.h(EnumC0094u1.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
                        } else if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
                            logger.h(EnumC0094u1.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                        } else {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                                    g.getClass();
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                                        handlerThread.start();
                                        try {
                                            Handler handler = new Handler(handlerThread.getLooper());
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                            PixelCopy.request(window, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.i
                                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                                public final void onPixelCopyFinished(int i) {
                                                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                    CountDownLatch countDownLatch2 = countDownLatch;
                                                    atomicBoolean2.set(i == 0);
                                                    countDownLatch2.countDown();
                                                }
                                            }, handler);
                                            z = countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get();
                                            handlerThread.quit();
                                        } catch (Throwable th) {
                                            try {
                                                logger.v(EnumC0094u1.ERROR, "Taking screenshot using PixelCopy failed.", th);
                                                handlerThread.quit();
                                                z = false;
                                            } catch (Throwable th2) {
                                                handlerThread.quit();
                                                throw th2;
                                            }
                                        }
                                        if (z) {
                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                            if (byteArrayOutputStream.size() <= 0) {
                                                logger.h(EnumC0094u1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                            } else {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bArr = byteArray;
                                            }
                                            if (bArr == null) {
                                                return c0083q1;
                                            }
                                            c0104y.c = new C0001a(bArr, "screenshot.png", "image/png");
                                            c0104y.c(activity, "android:activity");
                                        }
                                    } else {
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        if (mainThreadChecker.a()) {
                                            rootView.draw(canvas);
                                            countDownLatch.countDown();
                                        } else {
                                            activity.runOnUiThread(new O(rootView, canvas, logger, countDownLatch, 2));
                                        }
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                            if (byteArrayOutputStream.size() <= 0) {
                                                logger.h(EnumC0094u1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                            } else {
                                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bArr = byteArray2;
                                            }
                                            if (bArr == null) {
                                                return c0083q1;
                                            }
                                            c0104y.c = new C0001a(bArr, "screenshot.png", "image/png");
                                            c0104y.c(activity, "android:activity");
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (Throwable th3) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                logger.v(EnumC0094u1.ERROR, "Taking screenshot failed.", th5);
                            }
                        }
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                return c0083q1;
            }
            c0104y.c = new C0001a(bArr, "screenshot.png", "image/png");
            c0104y.c(activity, "android:activity");
        }
        return c0083q1;
    }
}
