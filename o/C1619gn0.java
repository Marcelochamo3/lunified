package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1619gn0 extends AbstractC2144m60 {
    public final TextView u;
    public final ImageView v;

    public C1619gn0(C1717hn0 c1717hn0, View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_channel_name);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.u = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_channel_logo);
        AbstractC1474fG.i(viewFindViewById2, "findViewById(...)");
        this.v = (ImageView) viewFindViewById2;
        view.setOnClickListener(new ViewOnClickListenerC1010ac(this, 16, c1717hn0));
        view.setOnKeyListener(new ViewOnKeyListenerC0934Zb(this, 2, c1717hn0));
    }
}
