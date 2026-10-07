package o;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AR implements View.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ TextView m;

    public /* synthetic */ AR(TextView textView, int i) {
        this.l = i;
        this.m = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.l) {
            case 0:
                TextView textView = this.m;
                AbstractC1474fG.j(textView, "$this_apply");
                textView.setMaxLines(textView.getMaxLines() == 2 ? Integer.MAX_VALUE : 2);
                break;
            default:
                TextView textView2 = this.m;
                AbstractC1474fG.j(textView2, "$this_apply");
                textView2.setMaxLines(textView2.getMaxLines() == 2 ? Integer.MAX_VALUE : 2);
                break;
        }
    }
}
