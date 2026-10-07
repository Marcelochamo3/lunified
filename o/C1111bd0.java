package o;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o.bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1111bd0 {
    public final Context a;
    public final List b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final InterfaceC0412Ey f;
    public final C1215ch g;
    public final Set h;
    public final C1123bj0 i;
    public final Dialog j;
    public C1013ad0 k;

    public C1111bd0(Context context, String str, String str2, ArrayList arrayList, Set set, boolean z, int i, boolean z2, int i2, InterfaceC0412Ey interfaceC0412Ey) {
        this.a = context;
        this.b = arrayList;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = interfaceC0412Ey;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_settings_selection, (ViewGroup) null, false);
        int i3 = R.id.settings_dialog_apply;
        TextView textView = (TextView) Sr0.g(viewInflate, R.id.settings_dialog_apply);
        if (textView != null) {
            i3 = R.id.settings_dialog_cancel;
            TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.settings_dialog_cancel);
            if (textView2 != null) {
                i3 = R.id.settings_dialog_handle;
                View viewG = Sr0.g(viewInflate, R.id.settings_dialog_handle);
                if (viewG != null) {
                    i3 = R.id.settings_dialog_icon;
                    ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.settings_dialog_icon);
                    if (imageView != null) {
                        i3 = R.id.settings_dialog_icon_box;
                        FrameLayout frameLayout = (FrameLayout) Sr0.g(viewInflate, R.id.settings_dialog_icon_box);
                        if (frameLayout != null) {
                            i3 = R.id.settings_dialog_list;
                            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.settings_dialog_list);
                            if (recyclerView != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                i3 = R.id.settings_dialog_subtitle;
                                TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.settings_dialog_subtitle);
                                if (textView3 != null) {
                                    i3 = R.id.settings_dialog_title;
                                    TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.settings_dialog_title);
                                    if (textView4 != null) {
                                        this.g = new C1215ch(linearLayout, textView, textView2, viewG, imageView, frameLayout, recyclerView, linearLayout, textView3, textView4);
                                        this.h = AbstractC0911Ye.A0(set);
                                        String strB = Cr0.y.b();
                                        this.i = AbstractC1459f50.F(strB == null ? "default" : strB);
                                        this.j = z2 ? new Dialog(context) : new DialogC2924u9(context);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    public final int a(float f) {
        return (int) (f * this.a.getResources().getDisplayMetrics().density);
    }

    public final GradientDrawable b(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(a(f));
        return gradientDrawable;
    }
}
