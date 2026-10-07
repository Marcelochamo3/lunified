package o;

import android.view.View;
import android.widget.TextView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.en0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1423en0 extends AbstractC2144m60 {
    public final TextView u;

    public C1423en0(C1521fn0 c1521fn0, View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_group_name);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.u = (TextView) viewFindViewById;
        view.setOnClickListener(new ViewOnClickListenerC1010ac(this, 15, c1521fn0));
        view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0908Yb(this, 7, c1521fn0));
        view.setOnKeyListener(new ViewOnKeyListenerC3075vn(3, c1521fn0));
    }
}
