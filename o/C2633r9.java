package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2633r9 extends C3003v0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2633r9(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // o.C3003v0
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f43o);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // o.C3003v0
    public final void d(View view, N0 n0) {
        int iC = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = n0.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((DialogC2924u9) obj).u) {
                    n0.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = n0.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.p);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f43o);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, n0.a);
                int i = MaterialButtonToggleGroup.v;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                        if (materialButtonToggleGroup.getChildAt(i3) == view) {
                            iC = i2;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                i2++;
                            }
                        }
                    }
                }
                n0.k(M0.a(((MaterialButton) view).z, 0, 1, iC, 1));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, n0.a);
                C1287dO c1287dO = (C1287dO) obj;
                n0.l(c1287dO.w0.getVisibility() == 0 ? c1287dO.n(R.string.mtrl_picker_toggle_to_year_selection) : c1287dO.n(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = n0.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).I);
                break;
            default:
                Y20 y20 = (Y20) obj;
                y20.g.d(view, n0);
                RecyclerView recyclerView = y20.f;
                recyclerView.getClass();
                AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
                iC = abstractC2144m60L != null ? abstractC2144m60L.c() : -1;
                O50 adapter = recyclerView.getAdapter();
                if (adapter instanceof V20) {
                    ((V20) adapter).m(iC);
                    break;
                }
                break;
        }
    }

    @Override // o.C3003v0
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i == 1048576) {
                    DialogC2924u9 dialogC2924u9 = (DialogC2924u9) this.e;
                    if (dialogC2924u9.u) {
                        dialogC2924u9.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 5:
                return ((Y20) this.e).g.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}
