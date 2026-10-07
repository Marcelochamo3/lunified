package o;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.pQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2458pQ extends JK implements InterfaceC1289dQ {
    public static final Method P;
    public InterfaceC1289dQ O;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                P = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // o.JK
    public final C0687Po a(Context context, boolean z) {
        C2361oQ c2361oQ = new C2361oQ(context, z);
        c2361oQ.setHoverListener(this);
        return c2361oQ;
    }

    @Override // o.InterfaceC1289dQ
    public final void d(ZP zp, MenuItem menuItem) {
        InterfaceC1289dQ interfaceC1289dQ = this.O;
        if (interfaceC1289dQ != null) {
            interfaceC1289dQ.d(zp, menuItem);
        }
    }

    @Override // o.InterfaceC1289dQ
    public final void g(ZP zp, C1386eQ c1386eQ) {
        InterfaceC1289dQ interfaceC1289dQ = this.O;
        if (interfaceC1289dQ != null) {
            interfaceC1289dQ.g(zp, c1386eQ);
        }
    }
}
