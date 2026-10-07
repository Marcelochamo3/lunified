package o;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0636Np extends InputConnectionWrapper {
    public final TextView a;
    public final C0519Jb b;

    public C0636Np(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0519Jb c0519Jb = new C0519Jb(15);
        super(inputConnection, false);
        this.a = editText;
        this.b = c0519Jb;
        if (C0455Gp.k != null) {
            C0455Gp c0455GpA = C0455Gp.a();
            if (c0455GpA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0325Bp c0325Bp = c0455GpA.e;
            c0325Bp.getClass();
            Bundle bundle = editorInfo.extras;
            FQ fq = (FQ) c0325Bp.c.m;
            int iA = fq.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) fq.f969o).getInt(iA + fq.l) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0325Bp.a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0519Jb.F(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0519Jb.F(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
