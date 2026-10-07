package o;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class IY extends AbstractC1880jW {
    public final /* synthetic */ LY a;

    public IY(LY ly) {
        this.a = ly;
    }

    @Override // o.AbstractC1880jW
    public final void a(AbstractC0976a8 abstractC0976a8, AbstractC2144m60 abstractC2144m60, int i) {
        LY ly = this.a;
        int iIndexOf = ly.m.indexOf((VerticalGridView) abstractC0976a8);
        ly.d(iIndexOf);
        if (abstractC2144m60 != null) {
            int i2 = ((MY) ly.n.get(iIndexOf)).b + i;
            DatePicker datePicker = (DatePicker) ly;
            datePicker.M.setTimeInMillis(datePicker.L.getTimeInMillis());
            ArrayList arrayList = datePicker.n;
            int i3 = (arrayList == null ? null : (MY) arrayList.get(iIndexOf)).a;
            if (iIndexOf == datePicker.F) {
                datePicker.M.add(5, i2 - i3);
            } else if (iIndexOf == datePicker.E) {
                datePicker.M.add(2, i2 - i3);
            } else {
                if (iIndexOf != datePicker.G) {
                    throw new IllegalArgumentException();
                }
                datePicker.M.add(1, i2 - i3);
            }
            datePicker.g(datePicker.M.get(1), datePicker.M.get(2), datePicker.M.get(5));
        }
    }
}
