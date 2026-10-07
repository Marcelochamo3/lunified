package o;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Et0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C1704hh b(View view, C1704hh c1704hh) {
        ContentInfo contentInfoY = c1704hh.a.y();
        Objects.requireNonNull(contentInfoY);
        ContentInfo contentInfoL = AbstractC1954k9.l(contentInfoY);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoL ? c1704hh : new C1704hh(new C2133m1(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC2464pW interfaceC2464pW) {
        if (interfaceC2464pW == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new Ft0(interfaceC2464pW));
        }
    }
}
