package o;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.skidush.clonex.fragments.home.HomeMobileFragment;
import com.skidush.clonex.fragments.home.HomeTvFragment;

/* JADX INFO: renamed from: o.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2238n5 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Dialog f930o;

    public /* synthetic */ ViewOnClickListenerC2238n5(Object obj, Object obj2, Dialog dialog, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f930o = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2109lo0 c2109lo0;
        C2109lo0 c2109lo1;
        switch (this.l) {
            case 0:
                IF r5 = (IF) this.m;
                AbstractC1474fG.j(r5, "$selectedLayout");
                Context context = (Context) this.n;
                AbstractC1474fG.j(context, "$context");
                DialogC2432p5 dialogC2432p5 = (DialogC2432p5) this.f930o;
                AbstractC1474fG.j(dialogC2432p5, "this$0");
                Br0 br0 = (Br0) r5.m;
                if (br0 != null) {
                    zy0.g(context, br0);
                    dialogC2432p5.hide();
                    break;
                }
                break;
            case 1:
                IF r6 = (IF) this.m;
                AbstractC1474fG.j(r6, "$selectedLayout");
                Context context2 = (Context) this.n;
                AbstractC1474fG.j(context2, "$context");
                DialogC2432p5 dialogC2432p6 = (DialogC2432p5) this.f930o;
                AbstractC1474fG.j(dialogC2432p6, "this$0");
                Br0 br1 = (Br0) r6.m;
                if (br1 != null) {
                    zy0.g(context2, br1);
                    dialogC2432p6.hide();
                    break;
                }
                break;
            case 2:
                TextView textView = (TextView) this.m;
                AbstractC1474fG.j(textView, "$this_apply");
                C0456Gq c0456Gq = (C0456Gq) this.n;
                AbstractC1474fG.j(c0456Gq, "$episode");
                Fd0 fd0 = (Fd0) this.f930o;
                AbstractC1474fG.j(fd0, "this$0");
                Context context3 = textView.getContext();
                AbstractC1474fG.i(context3, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx = context3 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context3 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                if ((abstractComponentCallbacksC1247cxO instanceof HomeMobileFragment) && (c2109lo0 = c0456Gq.e) != null) {
                    YT ytJ = Pu0.j(abstractComponentCallbacksC1247cxO);
                    String str = c2109lo0.a;
                    AbstractC1474fG.j(str, "id");
                    AbstractC0397Ej.A(ytJ, new DC(str));
                }
                fd0.hide();
                break;
            default:
                TextView textView2 = (TextView) this.m;
                AbstractC1474fG.j(textView2, "$this_apply");
                C0456Gq c0456Gq2 = (C0456Gq) this.n;
                AbstractC1474fG.j(c0456Gq2, "$episode");
                DialogC2432p5 dialogC2432p7 = (DialogC2432p5) this.f930o;
                AbstractC1474fG.j(dialogC2432p7, "this$0");
                Context context4 = textView2.getContext();
                AbstractC1474fG.i(context4, "getContext(...)");
                AbstractActivityC1540fx abstractActivityC1540fx2 = context4 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context4 : null;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                if ((abstractComponentCallbacksC1247cxO2 instanceof HomeTvFragment) && (c2109lo1 = c0456Gq2.e) != null) {
                    YT ytJ2 = Pu0.j(abstractComponentCallbacksC1247cxO2);
                    String str2 = c2109lo1.a;
                    AbstractC1474fG.j(str2, "id");
                    AbstractC0397Ej.A(ytJ2, new IC(str2));
                }
                dialogC2432p7.hide();
                break;
        }
    }
}
