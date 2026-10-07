package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import o.InterfaceC1397ea0;
import o.Pg0;
import o.RunnableC3102w1;

/* JADX INFO: loaded from: classes.dex */
public class SearchEditText extends Pg0 {
    public InterfaceC1397ea0 s;

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.s != null) {
            post(new RunnableC3102w1(21, this));
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // o.Pg0, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setOnKeyboardDismissListener(InterfaceC1397ea0 interfaceC1397ea0) {
        this.s = interfaceC1397ea0;
    }
}
