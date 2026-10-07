package o;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class Ni0 extends C3003v0 {
    public final TextInputLayout d;

    public Ni0(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // o.C3003v0
    public final void d(View view, N0 n0) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = n0.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z = !zIsEmpty;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !textInputLayout.F0;
        boolean z5 = !TextUtils.isEmpty(error);
        if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = false;
        }
        String string = z3 ? hint.toString() : "";
        C2190mg0 c2190mg0 = textInputLayout.m;
        T4 t4 = c2190mg0.m;
        if (t4.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(t4);
            accessibilityNodeInfo.setTraversalAfter(t4);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c2190mg0.f916o);
        }
        if (z) {
            n0.n(text);
        } else if (!TextUtils.isEmpty(string)) {
            n0.n(string);
            if (z4 && placeholderText != null) {
                n0.n(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            n0.n(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                n0.l(string);
            } else {
                if (z) {
                    string = ((Object) text) + ", " + string;
                }
                n0.n(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                n0.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        T4 t5 = textInputLayout.u.y;
        if (t5 != null) {
            accessibilityNodeInfo.setLabelFor(t5);
        }
        textInputLayout.n.b().n(n0);
    }

    @Override // o.C3003v0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.n.b().o(accessibilityEvent);
    }
}
