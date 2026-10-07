package o;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.leanback.widget.SearchEditText;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.search.SearchMobileFragment;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: renamed from: o.fa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1495fa0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx b;

    public /* synthetic */ C1495fa0(int i, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.a = i;
        this.b = abstractComponentCallbacksC1247cx;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Q30 q30;
        Q30 q31;
        switch (this.a) {
            case 0:
                SearchMobileFragment searchMobileFragment = (SearchMobileFragment) this.b;
                AbstractC1474fG.j(searchMobileFragment, "this$0");
                boolean z = i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 0;
                boolean z2 = keyEvent != null && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (!z && !z2) {
                    return false;
                }
                C1750i4 c1750i4 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i4);
                Editable text = ((EditText) c1750i4.f824o).getText();
                Object obj = null;
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                String string2 = AbstractC1119bh0.E0(string).toString();
                AbstractC0397Ej.v(searchMobileFragment);
                C1750i4 c1750i5 = searchMobileFragment.l0;
                AbstractC1474fG.g(c1750i5);
                if (!((SwitchMaterial) c1750i5.r).isChecked()) {
                    searchMobileFragment.X().e(string2);
                    return true;
                }
                if (AbstractC1899jh0.O(string2)) {
                    Toast.makeText(searchMobileFragment.Q(), R.string.global_search_empty_query, 0).show();
                    return true;
                }
                La0 la0X = searchMobileFragment.X();
                String strB = Cr0.m.b();
                if (AbstractC1474fG.b(strB, "PPV.TO")) {
                    q30 = QW.b;
                } else {
                    Q30.a.getClass();
                    for (Object obj2 : P30.b) {
                        if (AbstractC1474fG.b(((Q30) obj2).getName(), strB)) {
                            obj = obj2;
                            q30 = (Q30) obj;
                            if (q30 == null) {
                                q30 = C1816io0.b;
                            }
                        }
                    }
                    q30 = (Q30) obj;
                    if (q30 == null) {
                        q30 = C1816io0.b;
                    }
                }
                String strM = q30.m();
                if (strM == null) {
                    strM = "es";
                }
                la0X.f(string2, strM);
                return true;
            default:
                SearchTvFragment searchTvFragment = (SearchTvFragment) this.b;
                AbstractC1474fG.j(searchTvFragment, "this$0");
                boolean z3 = i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 0;
                boolean z4 = keyEvent != null && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (!z3 && !z4) {
                    return false;
                }
                Tl0 tl0 = searchTvFragment.l0;
                AbstractC1474fG.g(tl0);
                Editable text2 = ((SearchEditText) tl0.n).getText();
                Object obj3 = null;
                String string3 = text2 != null ? text2.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = AbstractC1119bh0.E0(string3).toString();
                AbstractC0397Ej.v(searchTvFragment);
                if (!searchTvFragment.p0) {
                    searchTvFragment.X().e(string4);
                    return true;
                }
                if (AbstractC1899jh0.O(string4)) {
                    Toast.makeText(searchTvFragment.Q(), R.string.global_search_empty_query, 0).show();
                    return true;
                }
                La0 la0X2 = searchTvFragment.X();
                String strB2 = Cr0.m.b();
                if (AbstractC1474fG.b(strB2, "PPV.TO")) {
                    q31 = QW.b;
                } else {
                    Q30.a.getClass();
                    for (Object obj4 : P30.b) {
                        if (AbstractC1474fG.b(((Q30) obj4).getName(), strB2)) {
                            obj3 = obj4;
                            q31 = (Q30) obj3;
                            if (q31 == null) {
                                q31 = C1816io0.b;
                            }
                        }
                    }
                    q31 = (Q30) obj3;
                    if (q31 == null) {
                        q31 = C1816io0.b;
                    }
                }
                String strM2 = q31.m();
                if (strM2 == null) {
                    strM2 = "es";
                }
                la0X2.f(string4, strM2);
                return true;
        }
    }
}
