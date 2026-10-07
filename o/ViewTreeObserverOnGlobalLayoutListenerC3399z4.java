package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3399z4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3399z4(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.l) {
            case 0:
                I4 i4 = (I4) this.m;
                if (!i4.getInternalPopup().b()) {
                    i4.q.n(i4.getTextDirection(), i4.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = i4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                F4 f4 = (F4) this.m;
                I4 i5 = f4.S;
                f4.getClass();
                if (i5.isAttachedToWindow() && i5.getGlobalVisibleRect(f4.Q)) {
                    f4.s();
                    f4.e();
                } else {
                    f4.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC0752Sb viewOnKeyListenerC0752Sb = (ViewOnKeyListenerC0752Sb) this.m;
                if (viewOnKeyListenerC0752Sb.b()) {
                    ArrayList arrayList = viewOnKeyListenerC0752Sb.t;
                    if (arrayList.size() > 0 && !((C0726Rb) arrayList.get(0)).a.J) {
                        View view = viewOnKeyListenerC0752Sb.A;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0726Rb) it.next()).a.e();
                            }
                        } else {
                            viewOnKeyListenerC0752Sb.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                ViewOnKeyListenerC1995kg0 viewOnKeyListenerC1995kg0 = (ViewOnKeyListenerC1995kg0) this.m;
                if (viewOnKeyListenerC1995kg0.b() && !viewOnKeyListenerC1995kg0.t.J) {
                    View view2 = viewOnKeyListenerC1995kg0.y;
                    if (view2 != null && view2.isShown()) {
                        viewOnKeyListenerC1995kg0.t.e();
                    } else {
                        viewOnKeyListenerC1995kg0.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
