package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1171c8 extends S20 {
    public ContextThemeWrapper t0;

    @Override // o.S20
    public final RecyclerView Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) layoutInflater.inflate(R.layout.leanback_preferences_list, viewGroup, false);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.setAccessibilityDelegateCompat(new Y20(verticalGridView));
        return verticalGridView;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final Context j() {
        if (this.t0 == null && h() != null) {
            TypedValue typedValue = new TypedValue();
            h().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i == 0) {
                i = R.style.PreferenceThemeOverlayLeanback;
            }
            this.t0 = new ContextThemeWrapper(super.j(), i);
        }
        return this.t0;
    }
}
