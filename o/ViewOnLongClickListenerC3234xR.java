package o;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: o.xR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC3234xR implements View.OnLongClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ ConstraintLayout m;
    public final /* synthetic */ DR n;

    public /* synthetic */ ViewOnLongClickListenerC3234xR(ConstraintLayout constraintLayout, DR dr, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = dr;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.l) {
            case 0:
                ConstraintLayout constraintLayout = this.m;
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                DR dr = this.n;
                AbstractC1474fG.j(dr, "this$0");
                Context context = constraintLayout.getContext();
                AbstractC1474fG.i(context, "getContext(...)");
                C1387eR c1387eR = dr.w;
                if (c1387eR != null) {
                    new DialogC2432p5(context, c1387eR).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
            case 1:
                ConstraintLayout constraintLayout2 = this.m;
                AbstractC1474fG.j(constraintLayout2, "$this_apply");
                DR dr2 = this.n;
                AbstractC1474fG.j(dr2, "this$0");
                Context context2 = constraintLayout2.getContext();
                AbstractC1474fG.i(context2, "getContext(...)");
                C1387eR c1387eR2 = dr2.w;
                if (c1387eR2 != null) {
                    new Fd0(context2, c1387eR2).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
            case 2:
                DR dr3 = this.n;
                AbstractC1474fG.j(dr3, "this$0");
                ConstraintLayout constraintLayout3 = this.m;
                AbstractC1474fG.j(constraintLayout3, "$this_apply");
                dr3.z();
                Context context3 = constraintLayout3.getContext();
                AbstractC1474fG.i(context3, "getContext(...)");
                C1387eR c1387eR3 = dr3.w;
                if (c1387eR3 != null) {
                    new DialogC2432p5(context3, c1387eR3).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
            case 3:
                DR dr4 = this.n;
                AbstractC1474fG.j(dr4, "this$0");
                ConstraintLayout constraintLayout4 = this.m;
                AbstractC1474fG.j(constraintLayout4, "$this_apply");
                dr4.z();
                Context context4 = constraintLayout4.getContext();
                AbstractC1474fG.i(context4, "getContext(...)");
                C1387eR c1387eR4 = dr4.w;
                if (c1387eR4 != null) {
                    new Fd0(context4, c1387eR4).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
            case 4:
                ConstraintLayout constraintLayout5 = this.m;
                AbstractC1474fG.j(constraintLayout5, "$this_apply");
                DR dr5 = this.n;
                AbstractC1474fG.j(dr5, "this$0");
                Context context5 = constraintLayout5.getContext();
                AbstractC1474fG.i(context5, "getContext(...)");
                C1387eR c1387eR5 = dr5.w;
                if (c1387eR5 != null) {
                    new Fd0(context5, c1387eR5).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
            default:
                DR dr6 = this.n;
                AbstractC1474fG.j(dr6, "this$0");
                ConstraintLayout constraintLayout6 = this.m;
                AbstractC1474fG.j(constraintLayout6, "$this_apply");
                dr6.z();
                Context context6 = constraintLayout6.getContext();
                AbstractC1474fG.i(context6, "getContext(...)");
                C1387eR c1387eR6 = dr6.w;
                if (c1387eR6 != null) {
                    new DialogC2432p5(context6, c1387eR6).show();
                    return true;
                }
                AbstractC1474fG.U("movie");
                throw null;
        }
    }

    public /* synthetic */ ViewOnLongClickListenerC3234xR(DR dr, ConstraintLayout constraintLayout, int i) {
        this.l = i;
        this.n = dr;
        this.m = constraintLayout;
    }
}
