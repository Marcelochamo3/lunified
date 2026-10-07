package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Pq0 implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ InterfaceC0412Ey m;

    public /* synthetic */ Pq0(int i, InterfaceC0412Ey interfaceC0412Ey) {
        this.l = i;
        this.m = interfaceC0412Ey;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                InterfaceC0412Ey interfaceC0412Ey = this.m;
                AbstractC1474fG.j(interfaceC0412Ey, "$tmp0");
                interfaceC0412Ey.b(view);
                break;
            default:
                InterfaceC0412Ey interfaceC0412Ey2 = this.m;
                AbstractC1474fG.j(interfaceC0412Ey2, "$tmp0");
                interfaceC0412Ey2.b(view);
                break;
        }
    }
}
