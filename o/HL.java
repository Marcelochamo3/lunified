package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HL implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ HL(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        GradientDrawable gradientDrawableB;
        Object obj = this.b;
        int i = 3;
        switch (this.a) {
            case 0:
                int i2 = LoginActivity.Z;
                DialogInterfaceC2619r2 dialogInterfaceC2619r2 = (DialogInterfaceC2619r2) obj;
                AbstractC1474fG.j(dialogInterfaceC2619r2, "$dialog");
                Button button = dialogInterfaceC2619r2.q.k;
                if (button != null) {
                    button.requestFocus();
                }
                break;
            default:
                C1111bd0 c1111bd0 = (C1111bd0) obj;
                AbstractC1474fG.j(c1111bd0, "this$0");
                Dialog dialog = c1111bd0.j;
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setDimAmount(0.68f);
                    window.addFlags(2);
                    Context context = c1111bd0.a;
                    int i3 = context.getResources().getDisplayMetrics().widthPixels;
                    int i4 = context.getResources().getDisplayMetrics().heightPixels;
                    int iA = (c1111bd0.a(70.0f) * c1111bd0.b.size()) + c1111bd0.a(190.0f);
                    float f = i4;
                    boolean z = c1111bd0.e;
                    int iMin = Math.min(iA, (int) (f * (z ? 0.84f : 0.78f)));
                    C1215ch c1215ch = c1111bd0.g;
                    LinearLayout linearLayout = (LinearLayout) c1215ch.v;
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.height = iMin;
                    linearLayout.setLayoutParams(layoutParams);
                    C1123bj0 c1123bj0 = c1111bd0.i;
                    if (z) {
                        gradientDrawableB = c1111bd0.b(c1123bj0.b, 24.0f);
                    } else {
                        GradientDrawable gradientDrawableB2 = c1111bd0.b(c1123bj0.b, 28.0f);
                        float fA = c1111bd0.a(28.0f);
                        gradientDrawableB2.setCornerRadii(new float[]{fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f});
                        gradientDrawableB = gradientDrawableB2;
                    }
                    ((LinearLayout) c1215ch.v).setBackground(gradientDrawableB);
                    if (z) {
                        window.setLayout((int) (i3 * 0.68f), iMin);
                    } else {
                        window.setNavigationBarColor(c1123bj0.b);
                        FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet);
                        if (frameLayout != null) {
                            frameLayout.setBackgroundColor(0);
                            BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout);
                            bottomSheetBehaviorA.H(3);
                            bottomSheetBehaviorA.J = true;
                        }
                    }
                    Integer num = (Integer) AbstractC0911Ye.l0(c1111bd0.h);
                    int iIntValue = num != null ? num.intValue() : 0;
                    RecyclerView recyclerView = (RecyclerView) c1215ch.u;
                    recyclerView.g0(iIntValue);
                    if (z) {
                        recyclerView.post(new R6(iIntValue, i, c1111bd0));
                    }
                    break;
                }
                break;
        }
    }
}
