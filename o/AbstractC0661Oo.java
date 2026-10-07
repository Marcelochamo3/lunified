package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: o.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0661Oo {
    public static final Field a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        a = declaredField;
    }
}
