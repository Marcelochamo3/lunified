package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2042l4 extends EditText implements InterfaceC2561qW, Tj0 {
    public final Y1 l;
    public final P4 m;
    public final C2720s4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Zi0 f887o;
    public final C2720s4 p;
    public C1944k4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2042l4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Qj0.a(context);
        AbstractC1220cj0.a(this, getContext());
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, R.attr.editTextStyle);
        P4 p4 = new P4(this);
        this.m = p4;
        p4.f(attributeSet, R.attr.editTextStyle);
        p4.b();
        C2720s4 c2720s4 = new C2720s4((char) 0, 6);
        c2720s4.m = this;
        this.n = c2720s4;
        this.f887o = new Zi0();
        C2720s4 c2720s5 = new C2720s4(this, 5);
        this.p = c2720s5;
        c2720s5.b0(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerZ = c2720s5.Z(keyListener);
            if (keyListenerZ == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerZ);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private C1944k4 getSuperCaller() {
        if (this.q == null) {
            this.q = new C1944k4(this);
        }
        return this.q;
    }

    @Override // o.InterfaceC2561qW
    public final C1704hh a(C1704hh c1704hh) {
        return this.f887o.a(this, c1704hh);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.a();
        }
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3045vW.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.m.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.m.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2720s4 c2720s4;
        if (Build.VERSION.SDK_INT >= 28 || (c2720s4 = this.n) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2720s4.n;
        return textClassifier == null ? J4.a((TextView) c2720s4.m) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[PHI: r1
  0x0058: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006b, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] strArrG;
        String[] stringArray;
        InputConnection nf;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.m.getClass();
        P4.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        AbstractC1923jt0.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrG = It0.g(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrG;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
            }
            C2278nc c2278nc = new C2278nc(17, this);
            if (i >= 25) {
                nf = new MF(inputConnectionOnCreateInputConnection, c2278nc);
            } else {
                String[] strArr = AbstractC3409z9.c;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    nf = new NF(inputConnectionOnCreateInputConnection, c2278nc);
                }
            }
            inputConnectionOnCreateInputConnection = nf;
        }
        return this.p.c0(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && It0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = AbstractC3011v4.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C1508fh c1508fh;
        InterfaceC1410eh interfaceC1410eh;
        int i2;
        C2133m1 c2133m1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || It0.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c2133m1 = new C2133m1(primaryClip, 1);
            } else {
                c1508fh = new C1508fh();
                c1508fh.m = primaryClip;
                c1508fh.n = 1;
            }
            if (i == 16908322) {
                interfaceC1410eh = c1508fh;
                interfaceC1410eh = c2133m1;
                i2 = 0;
            } else {
                interfaceC1410eh = c1508fh;
                interfaceC1410eh = c2133m1;
                i2 = 1;
            }
            interfaceC1410eh.P(i2);
            It0.l(this, interfaceC1410eh.f());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.p.l0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.p.Z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.u(mode);
        }
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        P4 p4 = this.m;
        p4.l(colorStateList);
        p4.b();
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        P4 p4 = this.m;
        p4.m(mode);
        p4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2720s4 c2720s4;
        if (Build.VERSION.SDK_INT >= 28 || (c2720s4 = this.n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2720s4.n = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
