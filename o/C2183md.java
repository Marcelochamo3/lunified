package o;

import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.fragments.search.SearchMobileFragment;

/* JADX INFO: renamed from: o.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2183md implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2183md(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).t;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 1:
                int i = LoginActivity.Z;
                LoginActivity loginActivity = (LoginActivity) obj;
                AbstractC1474fG.j(loginActivity, "this$0");
                if (z) {
                    EditText editText = loginActivity.K;
                    if (editText == null) {
                        AbstractC1474fG.U("passwordEditText");
                        throw null;
                    }
                    editText.setInputType(145);
                } else {
                    EditText editText2 = loginActivity.K;
                    if (editText2 == null) {
                        AbstractC1474fG.U("passwordEditText");
                        throw null;
                    }
                    editText2.setInputType(Yu0.b.l0);
                }
                EditText editText3 = loginActivity.K;
                if (editText3 != null) {
                    editText3.setSelection(editText3.getText().length());
                    return;
                } else {
                    AbstractC1474fG.U("passwordEditText");
                    throw null;
                }
            default:
                SearchMobileFragment searchMobileFragment = (SearchMobileFragment) obj;
                AbstractC1474fG.j(searchMobileFragment, "this$0");
                searchMobileFragment.o0.l(null);
                return;
        }
    }
}
