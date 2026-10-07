package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.Set;

/* JADX INFO: renamed from: o.ad0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1013ad0 extends O50 {
    public final /* synthetic */ C1111bd0 d;

    public C1013ad0(C1111bd0 c1111bd0) {
        this.d = c1111bd0;
    }

    @Override // o.O50
    public final int a() {
        return this.d.b.size();
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, final int i) {
        Zc0 zc0 = (Zc0) abstractC2144m60;
        C1111bd0 c1111bd0 = this.d;
        Pc0 pc0 = (Pc0) c1111bd0.b.get(i);
        boolean zContains = c1111bd0.h.contains(Integer.valueOf(i));
        AbstractC1474fG.j(pc0, "option");
        final C1111bd0 c1111bd1 = zc0.v.d;
        C1750i4 c1750i4 = zc0.u;
        ((TextView) c1750i4.r).setText(pc0.a);
        TextView textView = (TextView) c1750i4.p;
        String str = pc0.b;
        textView.setText(str);
        textView.setVisibility((str == null || AbstractC1899jh0.O(str)) ^ true ? 0 : 8);
        View view = (View) c1750i4.q;
        AbstractC1474fG.i(view, "settingsOptionSwatch");
        Integer num = pc0.c;
        view.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            view.setBackground(c1111bd1.b(num.intValue(), 8.0f));
        }
        FrameLayout frameLayout = (FrameLayout) c1750i4.n;
        AbstractC1474fG.i(frameLayout, "settingsOptionCheckBox");
        frameLayout.setVisibility(zContains ? 0 : 8);
        ((LinearLayout) c1750i4.f824o).setOnClickListener(new View.OnClickListener() { // from class: o.Yc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1111bd0 c1111bd2 = c1111bd1;
                AbstractC1474fG.j(c1111bd2, "this$0");
                boolean z = c1111bd2.c;
                int i2 = i;
                if (!z) {
                    c1111bd2.f.b(AbstractC1370eA.O(Integer.valueOf(i2)));
                    c1111bd2.j.dismiss();
                    return;
                }
                Integer numValueOf = Integer.valueOf(i2);
                Set set = c1111bd2.h;
                if (!set.contains(numValueOf)) {
                    set.add(Integer.valueOf(i2));
                } else {
                    if (set.size() <= c1111bd2.d) {
                        Toast.makeText(c1111bd2.a, R.string.settings_visible_providers_required, 0).show();
                        return;
                    }
                    set.remove(Integer.valueOf(i2));
                }
                C1013ad0 c1013ad0 = c1111bd2.k;
                if (c1013ad0 != null) {
                    c1013ad0.d(i2);
                } else {
                    AbstractC1474fG.U("adapter");
                    throw null;
                }
            }
        });
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        AbstractC1474fG.j(recyclerView, "parent");
        View viewK = AbstractC1674hK.k(recyclerView, R.layout.item_settings_dialog_option, recyclerView, false);
        int i2 = R.id.settings_option_check;
        if (((ImageView) Sr0.g(viewK, R.id.settings_option_check)) != null) {
            i2 = R.id.settings_option_check_box;
            FrameLayout frameLayout = (FrameLayout) Sr0.g(viewK, R.id.settings_option_check_box);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) viewK;
                i2 = R.id.settings_option_summary;
                TextView textView = (TextView) Sr0.g(viewK, R.id.settings_option_summary);
                if (textView != null) {
                    i2 = R.id.settings_option_swatch;
                    View viewG = Sr0.g(viewK, R.id.settings_option_swatch);
                    if (viewG != null) {
                        i2 = R.id.settings_option_title;
                        TextView textView2 = (TextView) Sr0.g(viewK, R.id.settings_option_title);
                        if (textView2 != null) {
                            return new Zc0(this, new C1750i4(linearLayout, frameLayout, linearLayout, textView, viewG, textView2, 3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewK.getResources().getResourceName(i2)));
    }
}
