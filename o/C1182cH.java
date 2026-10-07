package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Base64;
import android.view.View;
import com.skidush.clonex.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.cH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1182cH extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public static final C1182cH n = new C1182cH(1, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1182cH f711o = new C1182cH(1, 1);
    public static final C1182cH p = new C1182cH(1, 2);
    public static final C1182cH q = new C1182cH(1, 3);
    public static final C1182cH r = new C1182cH(1, 4);
    public static final C1182cH s = new C1182cH(1, 5);
    public static final C1182cH t = new C1182cH(1, 6);
    public static final C1182cH u = new C1182cH(1, 7);
    public static final C1182cH v = new C1182cH(1, 8);
    public static final C1182cH w = new C1182cH(1, 9);
    public static final C1182cH x = new C1182cH(1, 10);
    public static final C1182cH y = new C1182cH(1, 11);
    public static final C1182cH z = new C1182cH(1, 12);
    public static final C1182cH A = new C1182cH(1, 13);
    public static final C1182cH B = new C1182cH(1, 14);
    public static final C1182cH C = new C1182cH(1, 15);
    public static final C1182cH D = new C1182cH(1, 16);
    public static final C1182cH E = new C1182cH(1, 17);
    public static final C1182cH F = new C1182cH(1, 18);
    public static final C1182cH G = new C1182cH(1, 19);
    public static final C1182cH H = new C1182cH(1, 20);
    public static final C1182cH I = new C1182cH(1, 21);
    public static final C1182cH J = new C1182cH(1, 22);
    public static final C1182cH K = new C1182cH(1, 23);
    public static final C1182cH L = new C1182cH(1, 24);
    public static final C1182cH M = new C1182cH(1, 25);
    public static final C1182cH N = new C1182cH(1, 26);
    public static final C1182cH O = new C1182cH(1, 27);
    public static final C1182cH P = new C1182cH(1, 28);
    public static final C1182cH Q = new C1182cH(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1182cH(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                C0628Nh c0628Nh = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh, "it");
                return Boolean.valueOf(c0628Nh.c <= System.currentTimeMillis());
            case 1:
                JN jn = (JN) obj;
                AbstractC1474fG.j(jn, "it");
                C2933uH c2933uH = C2933uH.b;
                return C2933uH.r(jn.c());
            case 2:
                String str = (String) obj;
                AbstractC1474fG.j(str, "it");
                byte[] bytes = str.getBytes(AbstractC1305dd.a);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                AbstractC1474fG.i(strEncodeToString, "encodeToString(...)");
                return strEncodeToString;
            case 3:
                EO eo = (EO) obj;
                AbstractC1474fG.j(eo, "it");
                String str2 = eo.a;
                AbstractC1474fG.i(str2, "name");
                return str2;
            case 4:
                C2420oz c2420oz = (C2420oz) obj;
                AbstractC1474fG.j(c2420oz, "it");
                return c2420oz.b;
            case 5:
                C2420oz c2420oz2 = (C2420oz) obj;
                AbstractC1474fG.j(c2420oz2, "it");
                return c2420oz2.b;
            case 6:
                Context context = (Context) obj;
                AbstractC1474fG.j(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 7:
                TT tt = (TT) obj;
                AbstractC1474fG.j(tt, "destination");
                WT wt = tt.m;
                if (wt == null || wt.x != tt.s) {
                    return null;
                }
                return wt;
            case 8:
                TT tt2 = (TT) obj;
                AbstractC1474fG.j(tt2, "destination");
                WT wt2 = tt2.m;
                if (wt2 == null || wt2.x != tt2.s) {
                    return null;
                }
                return wt2;
            case 9:
                TT tt3 = (TT) obj;
                AbstractC1474fG.j(tt3, "it");
                return Integer.valueOf(tt3.s);
            case 10:
                Context context2 = (Context) obj;
                AbstractC1474fG.j(context2, "it");
                ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 11:
                Context context3 = (Context) obj;
                AbstractC1474fG.j(context3, "it");
                if (context3 instanceof Activity) {
                    return (Activity) context3;
                }
                return null;
            case 12:
                TT tt4 = (TT) obj;
                AbstractC1474fG.j(tt4, "it");
                return tt4.m;
            case 13:
                TT tt5 = (TT) obj;
                AbstractC1474fG.j(tt5, "it");
                if (!(tt5 instanceof WT)) {
                    return null;
                }
                WT wt3 = (WT) tt5;
                return wt3.k(wt3.x, wt3, false);
            case 14:
                View view = (View) obj;
                AbstractC1474fG.j(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 15:
                View view2 = (View) obj;
                AbstractC1474fG.j(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (YT) ((WeakReference) tag).get();
                }
                if (tag instanceof YT) {
                    return (YT) tag;
                }
                return null;
            case 16:
                JN jn2 = (JN) obj;
                AbstractC1474fG.j(jn2, "it");
                return (String) jn2.a().get(1);
            case 17:
                Qi0 qi0 = (Qi0) obj;
                AbstractC1474fG.j(qi0, "it");
                String strM = qi0.M();
                AbstractC1474fG.i(strM, "text(...)");
                return strM;
            case 18:
                String strZ = ((C3176wp) obj).Z();
                AbstractC1474fG.i(strZ, "text(...)");
                return AbstractC1119bh0.E0(strZ).toString();
            case 19:
                return ((C3176wp) obj).Z();
            case 20:
                Throwable th = (Throwable) obj;
                AbstractC1474fG.j(th, "current");
                Throwable cause = th.getCause();
                if (cause == null || cause == th) {
                    return null;
                }
                return cause;
            case 21:
                Throwable th2 = (Throwable) obj;
                AbstractC1474fG.j(th2, "current");
                Throwable cause2 = th2.getCause();
                if (cause2 == null || cause2 == th2) {
                    return null;
                }
                return cause2;
            case 22:
                Throwable th3 = (Throwable) obj;
                AbstractC1474fG.j(th3, "it");
                return th3.getCause();
            case 23:
                Throwable th4 = (Throwable) obj;
                AbstractC1474fG.j(th4, "it");
                return th4.getMessage();
            case 24:
                Throwable th5 = (Throwable) obj;
                AbstractC1474fG.j(th5, "it");
                return th5.getCause();
            case 25:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                String className = stackTraceElement.getClassName();
                AbstractC1474fG.i(className, "getClassName(...)");
                return AbstractC1119bh0.y0(className, '.', className) + "#" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            case 26:
                Throwable th6 = (Throwable) obj;
                AbstractC1474fG.j(th6, "it");
                return th6.getCause();
            case 27:
                Throwable th7 = (Throwable) obj;
                AbstractC1474fG.j(th7, "it");
                return th7.getMessage();
            case 28:
                C3336yW c3336yW = (C3336yW) obj;
                AbstractC1474fG.j(c3336yW, "it");
                return c3336yW.q0();
            default:
                C3336yW c3336yW2 = (C3336yW) obj;
                AbstractC1474fG.j(c3336yW2, "it");
                return c3336yW2.P0();
        }
    }
}
