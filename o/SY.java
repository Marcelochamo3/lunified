package o;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class SY extends DialogInterfaceOnCancelListenerC0348Cm {
    public final InterfaceC0412Ey B0;
    public EditText C0;

    public SY(InterfaceC0412Ey interfaceC0412Ey) {
        this.B0 = interfaceC0412Ey;
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void I() {
        super.I();
        Dialog dialog = this.w0;
        AbstractC1474fG.h(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = (DialogInterfaceC2619r2) dialog;
        dialogInterfaceC2619r2.q.k.setEnabled(false);
        EditText editText = this.C0;
        if (editText != null) {
            editText.addTextChangedListener(new RY(dialogInterfaceC2619r2));
        } else {
            AbstractC1474fG.U("pinEditText");
            throw null;
        }
    }

    @Override // o.DialogInterfaceOnCancelListenerC0348Cm
    public final Dialog X() {
        C2523q2 c2523q2 = new C2523q2(Q());
        LayoutInflater layoutInflater = P().getLayoutInflater();
        AbstractC1474fG.i(layoutInflater, "getLayoutInflater(...)");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pin_input, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.pin_edit_text);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.C0 = (EditText) viewFindViewById;
        C2135m2 c2135m2 = c2523q2.setView(viewInflate).setTitle("Ingrese PIN").a;
        c2135m2.k = false;
        UM um = new UM(1, this);
        c2135m2.g = "Aceptar";
        c2135m2.h = um;
        QY qy = new QY();
        c2135m2.i = "Cancelar";
        c2135m2.j = qy;
        DialogInterfaceC2619r2 dialogInterfaceC2619r2Create = c2523q2.create();
        AbstractC1474fG.i(dialogInterfaceC2619r2Create, "create(...)");
        return dialogInterfaceC2619r2Create;
    }
}
