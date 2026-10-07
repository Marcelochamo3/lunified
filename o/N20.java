package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class N20 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference l;

    public N20(Preference preference) {
        this.l = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.l;
        CharSequence charSequenceF = preference.f();
        if (!preference.N || TextUtils.isEmpty(charSequenceF)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceF);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.l;
        ClipboardManager clipboardManager = (ClipboardManager) preference.l.getSystemService("clipboard");
        CharSequence charSequenceF = preference.f();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceF));
        Context context = preference.l;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceF), 0).show();
        return true;
    }
}
