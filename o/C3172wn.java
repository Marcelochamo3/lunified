package o;

import android.view.View;
import android.widget.TextView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3172wn extends AbstractC2144m60 {
    public final TextView u;
    public final TextView v;
    public final View w;

    public C3172wn(C3269xn c3269xn, View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.dns_name);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.u = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.dns_description);
        AbstractC1474fG.i(viewFindViewById2, "findViewById(...)");
        this.v = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.selected_indicator);
        AbstractC1474fG.i(viewFindViewById3, "findViewById(...)");
        this.w = viewFindViewById3;
        view.setFocusable(true);
        view.setFocusableInTouchMode(false);
        view.setClickable(true);
        view.setOnClickListener(new ViewOnClickListenerC1010ac(this, 1, c3269xn));
        view.setOnKeyListener(new ViewOnKeyListenerC0934Zb(this, 1, c3269xn));
    }
}
