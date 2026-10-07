package io.sentry.config;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ScrollingView;
import io.sentry.AbstractC0037d1;
import io.sentry.C0038e;
import io.sentry.C0069o0;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.F0;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.L1;
import io.sentry.M1;
import io.sentry.android.core.M;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.x;
import io.sentry.protocol.C0077d;
import io.sentry.protocol.D;
import io.sentry.protocol.E;
import io.sentry.protocol.n;
import io.sentry.protocol.r;
import io.sentry.protocol.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.C1101bX;
import o.C3285xv;
import o.CJ;
import o.U9;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static byte[] A(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC1701hf0.u("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC1701hf0.u("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC1701hf0.u("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                fileInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public static String B(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void C(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void D(AbstractC0037d1 abstractC0037d1, F0 f0, ILogger iLogger) {
        if (abstractC0037d1.l != null) {
            io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
            cVar.f("event_id");
            cVar.j(iLogger, abstractC0037d1.l);
        }
        io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) f0;
        cVar2.f("contexts");
        cVar2.j(iLogger, abstractC0037d1.m);
        if (abstractC0037d1.n != null) {
            cVar2.f("sdk");
            cVar2.j(iLogger, abstractC0037d1.n);
        }
        if (abstractC0037d1.f108o != null) {
            cVar2.f("request");
            cVar2.j(iLogger, abstractC0037d1.f108o);
        }
        Map map = abstractC0037d1.p;
        if (map != null && !map.isEmpty()) {
            cVar2.f("tags");
            cVar2.j(iLogger, abstractC0037d1.p);
        }
        if (abstractC0037d1.q != null) {
            cVar2.f("release");
            cVar2.m(abstractC0037d1.q);
        }
        if (abstractC0037d1.r != null) {
            cVar2.f("environment");
            cVar2.m(abstractC0037d1.r);
        }
        if (abstractC0037d1.s != null) {
            cVar2.f("platform");
            cVar2.m(abstractC0037d1.s);
        }
        if (abstractC0037d1.t != null) {
            cVar2.f("user");
            cVar2.j(iLogger, abstractC0037d1.t);
        }
        if (abstractC0037d1.v != null) {
            cVar2.f("server_name");
            cVar2.m(abstractC0037d1.v);
        }
        if (abstractC0037d1.w != null) {
            cVar2.f("dist");
            cVar2.m(abstractC0037d1.w);
        }
        List list = abstractC0037d1.x;
        if (list != null && !list.isEmpty()) {
            cVar2.f("breadcrumbs");
            cVar2.j(iLogger, abstractC0037d1.x);
        }
        if (abstractC0037d1.y != null) {
            cVar2.f("debug_meta");
            cVar2.j(iLogger, abstractC0037d1.y);
        }
        Map map2 = abstractC0037d1.z;
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        cVar2.f("extra");
        cVar2.j(iLogger, abstractC0037d1.z);
    }

    public static boolean E(C0104y c0104y) {
        return !(io.sentry.hints.d.class.isInstance(q(c0104y)) || io.sentry.hints.b.class.isInstance(q(c0104y))) || M.class.isInstance(q(c0104y));
    }

    public static final void F(ScheduledExecutorService scheduledExecutorService, I1 i1, String str, Runnable runnable) {
        AbstractC1474fG.j(i1, "options");
        AbstractC1474fG.j(str, "taskName");
        try {
            scheduledExecutorService.submit(new io.sentry.android.replay.util.a(runnable, i1, str, 1));
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.ERROR, AbstractC1701hf0.u("Failed to submit task ", str, " to executor"), th);
        }
    }

    public static void a(Class cls) {
        String strReplace = cls.getSimpleName().replace("Sentry", "").replace("Integration", "").replace("Interceptor", "").replace("EventProcessor", "");
        C0088s1 c0088s1J = C0088s1.j();
        c0088s1J.getClass();
        C(strReplace, "integration is required.");
        ((CopyOnWriteArraySet) c0088s1J.l).add(strReplace);
    }

    public static C0104y b(Object obj) {
        C0104y c0104y = new C0104y();
        c0104y.c(obj, "sentry:typeCheckHint");
        return c0104y;
    }

    public static boolean c(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!c(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean d(AbstractC0037d1 abstractC0037d1, String str, C0069o0 c0069o0, ILogger iLogger) {
        byte b = -1;
        switch (str.hashCode()) {
            case -1840434063:
                if (str.equals("debug_meta")) {
                    b = 0;
                }
                break;
            case -758770169:
                if (str.equals("server_name")) {
                    b = 1;
                }
                break;
            case -567312220:
                if (str.equals("contexts")) {
                    b = 2;
                }
                break;
            case -85904877:
                if (str.equals("environment")) {
                    b = 3;
                }
                break;
            case -51457840:
                if (str.equals("breadcrumbs")) {
                    b = 4;
                }
                break;
            case 113722:
                if (str.equals("sdk")) {
                    b = 5;
                }
                break;
            case 3083686:
                if (str.equals("dist")) {
                    b = 6;
                }
                break;
            case 3552281:
                if (str.equals("tags")) {
                    b = 7;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    b = 8;
                }
                break;
            case 96965648:
                if (str.equals("extra")) {
                    b = 9;
                }
                break;
            case 278118624:
                if (str.equals("event_id")) {
                    b = 10;
                }
                break;
            case 1090594823:
                if (str.equals("release")) {
                    b = C3285xv.h;
                }
                break;
            case 1095692943:
                if (str.equals("request")) {
                    b = 12;
                }
                break;
            case 1874684019:
                if (str.equals("platform")) {
                    b = 13;
                }
                break;
        }
        switch (b) {
            case 0:
                abstractC0037d1.y = (C0077d) c0069o0.f0(iLogger, new io.sentry.clientreport.a(8));
                return true;
            case 1:
                abstractC0037d1.v = c0069o0.h0();
                return true;
            case 2:
                abstractC0037d1.m.putAll(io.sentry.clientreport.a.d(c0069o0, iLogger));
                return true;
            case 3:
                abstractC0037d1.r = c0069o0.h0();
                return true;
            case 4:
                abstractC0037d1.x = c0069o0.X(iLogger, new C0038e(0));
                return true;
            case 5:
                abstractC0037d1.n = (r) c0069o0.f0(iLogger, new io.sentry.clientreport.a(20));
                return true;
            case 6:
                abstractC0037d1.w = c0069o0.h0();
                return true;
            case 7:
                abstractC0037d1.p = z((Map) c0069o0.e0());
                return true;
            case 8:
                abstractC0037d1.t = (E) c0069o0.f0(iLogger, new D(0));
                return true;
            case 9:
                abstractC0037d1.z = z((Map) c0069o0.e0());
                return true;
            case 10:
                abstractC0037d1.l = (t) c0069o0.f0(iLogger, new io.sentry.clientreport.a(22));
                return true;
            case 11:
                abstractC0037d1.q = c0069o0.h0();
                return true;
            case 12:
                abstractC0037d1.f108o = (n) c0069o0.f0(iLogger, new io.sentry.clientreport.a(18));
                return true;
            case 13:
                abstractC0037d1.s = c0069o0.h0();
                return true;
            default:
                return false;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    public static io.sentry.internal.gestures.b f(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.a aVar) {
        io.sentry.internal.gestures.b bVar;
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar2 = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            C(view2, "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            for (io.sentry.android.core.internal.gestures.a aVar2 : sentryAndroidOptions.getGestureTargetLocators()) {
                aVar2.getClass();
                int[] iArr = aVar2.b;
                view2.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f < i2 || f > i2 + width || f2 < i3 || f2 > i3 + height) {
                    bVar = null;
                } else if (aVar == io.sentry.internal.gestures.a.CLICKABLE && view2.isClickable() && view2.getVisibility() == 0) {
                    try {
                        bVar = new io.sentry.internal.gestures.b(view2, i(view2), o(view2));
                    } catch (Resources.NotFoundException unused) {
                        bVar = null;
                    }
                } else if (aVar != io.sentry.internal.gestures.a.SCROLLABLE) {
                    bVar = null;
                } else if (((!aVar2.a ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0) {
                    bVar = new io.sentry.internal.gestures.b(view2, i(view2), o(view2));
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    if (aVar != io.sentry.internal.gestures.a.CLICKABLE) {
                        return bVar;
                    }
                    bVar2 = bVar;
                }
            }
        }
        return bVar2;
    }

    public static io.sentry.android.replay.r g(Context context, M1 m1) {
        Rect rect;
        AbstractC1474fG.j(context, "context");
        Object systemService = context.getSystemService("window");
        AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        AbstractC1474fG.i(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
        float fHeight = rect.height() / context.getResources().getDisplayMetrics().density;
        L1 l1 = m1.f;
        int iE = U9.E(fHeight * l1.sizeScale);
        int i = iE % 16;
        Integer numValueOf = Integer.valueOf(i <= 8 ? iE - i : iE + (16 - i));
        int iE2 = U9.E((rect.width() / context.getResources().getDisplayMetrics().density) * l1.sizeScale);
        int i2 = iE2 % 16;
        Integer numValueOf2 = Integer.valueOf(i2 <= 8 ? iE2 - i2 : iE2 + (16 - i2));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new io.sentry.android.replay.r(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), m1.g, l1.bitRate);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    public static io.sentry.android.replay.viewhierarchy.d h(View view, io.sentry.android.replay.viewhierarchy.d dVar, int i, I1 i1) {
        C1101bX c1101bX;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC1474fG.j(view, "view");
        AbstractC1474fG.j(i1, "options");
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (true) {
                if (!(parent instanceof View)) {
                    Rect rect = new Rect();
                    c1101bX = new C1101bX(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
                    break;
                }
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    c1101bX = new C1101bX(Boolean.FALSE, null);
                    break;
                }
                parent = view2.getParent();
                AbstractC1474fG.i(parent, "view.parent");
            }
        } else {
            c1101bX = new C1101bX(Boolean.FALSE, null);
        }
        boolean zBooleanValue = ((Boolean) c1101bX.l).booleanValue();
        Rect rect2 = (Rect) c1101bX.m;
        if ((view instanceof TextView) && i1.getExperimental().a.c) {
            TextView textView = (TextView) view;
            return new io.sentry.android.replay.viewhierarchy.c(textView.getLayout(), Integer.valueOf(textView.getCurrentTextColor() | (-16777216)), textView.getTotalPaddingLeft(), textView.getTotalPaddingTop(), textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), textView.getElevation() + (dVar != null ? dVar.c : 0.0f), i, dVar, zBooleanValue, zBooleanValue, rect2);
        }
        if (!(view instanceof ImageView) || !i1.getExperimental().a.d) {
            view.getX();
            view.getY();
            return new io.sentry.android.replay.viewhierarchy.a(view.getWidth(), view.getHeight(), (dVar != null ? dVar.c : 0.0f) + view.getElevation(), dVar, zBooleanValue && i1.getExperimental().a.e.contains(view.getClass().getCanonicalName()), rect2);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = (dVar != null ? dVar.c : 0.0f) + imageView.getElevation();
        if (zBooleanValue) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                z2 = false;
            } else {
                if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable)) {
                    if (drawable instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                        z3 = !bitmapDrawable.getBitmap().isRecycled() && bitmapDrawable.getBitmap().getHeight() > 10 && bitmapDrawable.getBitmap().getWidth() > 10;
                    }
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            z = z2;
        }
        return new io.sentry.android.replay.viewhierarchy.b(width, height, elevation, dVar, z, rect2);
    }

    public static String i(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }

    public static Date j() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    public static Date k(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date l(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(AbstractC1701hf0.t("timestamp is not ISO format ", str));
        }
    }

    public static Date m(String str) {
        try {
            return k(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC1701hf0.t("timestamp is not millis format ", str));
        }
    }

    public static final Window n(View view) throws IllegalAccessException {
        Field field;
        AbstractC1474fG.j(view, "<this>");
        CJ cj = x.a;
        View rootView = view.getRootView();
        AbstractC1474fG.i(rootView, "rootView");
        Class cls = (Class) x.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) x.b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }

    public static String o(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static Object q(C0104y c0104y) {
        Object obj;
        synchronized (c0104y) {
            obj = c0104y.a.get("sentry:typeCheckHint");
        }
        return obj;
    }

    public static String r(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = io.sentry.vendor.gson.internal.bind.util.a.a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs, 2);
            sb.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static final void s(ScheduledExecutorService scheduledExecutorService, I1 i1) {
        AbstractC1474fG.j(i1, "options");
        synchronized (scheduledExecutorService) {
            try {
                if (!scheduledExecutorService.isShutdown()) {
                    scheduledExecutorService.shutdown();
                }
                try {
                    if (!scheduledExecutorService.awaitTermination(i1.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                        scheduledExecutorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean t(Context context, String str) {
        C(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean u(C0104y c0104y, Class cls) {
        return cls.isInstance(q(c0104y));
    }

    public static boolean v(C0104y c0104y) {
        return Boolean.TRUE.equals(c0104y.b("sentry:isFromHybridSdk", Boolean.class));
    }

    public static boolean x(Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static void y(Class cls, Object obj, ILogger iLogger) {
        iLogger.h(EnumC0094u1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ConcurrentHashMap z(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public abstract int p();

    public abstract boolean w();
}
