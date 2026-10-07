package o;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class WN implements Comparator {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ WN(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.z).compareTo(Boolean.valueOf(materialButton2.z));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.m;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                String str = ((Xq0) obj).b;
                Locale locale = (Locale) this.m;
                String lowerCase = str.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((Xq0) obj2).b.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                return AbstractC1376eG.j(lowerCase, lowerCase2);
            default:
                Map map = (Map) this.m;
                Integer num = (Integer) map.get((String) obj);
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) map.get((String) obj2);
                return AbstractC1376eG.j(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }
}
