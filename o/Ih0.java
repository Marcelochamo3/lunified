package o;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Ih0 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Class[] f328o = {MenuItem.class};
    public final /* synthetic */ int l = 0;
    public Object m;
    public Object n;

    public /* synthetic */ Ih0() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.l) {
            case 0:
                Method method = (Method) this.n;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.m;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.m).onMenuItemClick(((MenuItemC1778iQ) this.n).f(menuItem));
        }
    }

    public Ih0(MenuItemC1778iQ menuItemC1778iQ, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.n = menuItemC1778iQ;
        this.m = onMenuItemClickListener;
    }
}
