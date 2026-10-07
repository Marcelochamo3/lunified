package o;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lv0 {
    public static final Nv0 a;

    static {
        Nv0 o9;
        try {
            o9 = new L80((WebViewProviderFactoryBoundaryInterface) AbstractC3409z9.d(WebViewProviderFactoryBoundaryInterface.class, AP.h()));
        } catch (ClassNotFoundException unused) {
            o9 = new O9(9);
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
        a = o9;
    }
}
