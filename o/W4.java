package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class W4 extends V4 {
    @Override // o.V4, o.X4
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // o.X4
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
