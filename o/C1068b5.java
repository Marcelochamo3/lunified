package o;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: o.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1068b5 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final Nd0 h = new Nd0();
    public final Object[] a = new Object[2];

    public F3 a(Context context, AttributeSet attributeSet) {
        return new F3(context, attributeSet);
    }

    public G3 b(Context context, AttributeSet attributeSet) {
        return new G3(context, attributeSet, com.skidush.clonex.R.attr.buttonStyle);
    }

    public I3 c(Context context, AttributeSet attributeSet) {
        return new I3(context, attributeSet, com.skidush.clonex.R.attr.checkboxStyle);
    }

    public C2817t4 d(Context context, AttributeSet attributeSet) {
        return new C2817t4(context, attributeSet);
    }

    public T4 e(Context context, AttributeSet attributeSet) {
        return new T4(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        Nd0 nd0 = h;
        Constructor constructor = (Constructor) nd0.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            nd0.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
