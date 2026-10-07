package o;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: o.Mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0611Mq implements View.OnLongClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ ConstraintLayout m;
    public final /* synthetic */ C0663Oq n;

    public /* synthetic */ ViewOnLongClickListenerC0611Mq(int i, ConstraintLayout constraintLayout, C0663Oq c0663Oq) {
        this.l = i;
        this.m = constraintLayout;
        this.n = c0663Oq;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.l) {
            case 0:
                ConstraintLayout constraintLayout = this.m;
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                C0663Oq c0663Oq = this.n;
                AbstractC1474fG.j(c0663Oq, "this$0");
                Context context = constraintLayout.getContext();
                AbstractC1474fG.i(context, "getContext(...)");
                C0456Gq c0456Gq = c0663Oq.w;
                if (c0456Gq != null) {
                    new DialogC2432p5(context, c0456Gq).show();
                    return true;
                }
                AbstractC1474fG.U("episode");
                throw null;
            case 1:
                ConstraintLayout constraintLayout2 = this.m;
                AbstractC1474fG.j(constraintLayout2, "$this_apply");
                C0663Oq c0663Oq2 = this.n;
                AbstractC1474fG.j(c0663Oq2, "this$0");
                Context context2 = constraintLayout2.getContext();
                AbstractC1474fG.i(context2, "getContext(...)");
                C0456Gq c0456Gq2 = c0663Oq2.w;
                if (c0456Gq2 != null) {
                    new Fd0(context2, c0456Gq2).show();
                    return true;
                }
                AbstractC1474fG.U("episode");
                throw null;
            case 2:
                C0663Oq c0663Oq3 = this.n;
                AbstractC1474fG.j(c0663Oq3, "this$0");
                ConstraintLayout constraintLayout3 = this.m;
                AbstractC1474fG.j(constraintLayout3, "$this_apply");
                c0663Oq3.w();
                Context context3 = constraintLayout3.getContext();
                AbstractC1474fG.i(context3, "getContext(...)");
                C0456Gq c0456Gq3 = c0663Oq3.w;
                if (c0456Gq3 != null) {
                    new DialogC2432p5(context3, c0456Gq3).show();
                    return true;
                }
                AbstractC1474fG.U("episode");
                throw null;
            default:
                ConstraintLayout constraintLayout4 = this.m;
                AbstractC1474fG.j(constraintLayout4, "$this_apply");
                C0663Oq c0663Oq4 = this.n;
                AbstractC1474fG.j(c0663Oq4, "this$0");
                Context context4 = constraintLayout4.getContext();
                AbstractC1474fG.i(context4, "getContext(...)");
                C0456Gq c0456Gq4 = c0663Oq4.w;
                if (c0456Gq4 != null) {
                    new Fd0(context4, c0456Gq4).show();
                    return true;
                }
                AbstractC1474fG.U("episode");
                throw null;
        }
    }

    public /* synthetic */ ViewOnLongClickListenerC0611Mq(ConstraintLayout constraintLayout, C0663Oq c0663Oq) {
        this.l = 2;
        this.n = c0663Oq;
        this.m = constraintLayout;
    }
}
