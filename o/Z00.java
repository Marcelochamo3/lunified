package o;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ EditText m;
    public final /* synthetic */ InterfaceC0360Cy n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f648o;

    public /* synthetic */ Z00(EditText editText, InterfaceC0360Cy interfaceC0360Cy, Object obj, int i) {
        this.l = i;
        this.m = editText;
        this.n = interfaceC0360Cy;
        this.f648o = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f648o;
        InterfaceC0360Cy interfaceC0360Cy = this.n;
        EditText editText = this.m;
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(editText, "$pinInput");
                AbstractC1474fG.j(interfaceC0360Cy, "$onSuccess");
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) obj;
                AbstractC1474fG.j(playerTvFragment, "this$0");
                C2379oe c2379oe = C2379oe.b;
                String string = editText.getText().toString();
                AbstractC1474fG.j(string, "pin");
                if (!AbstractC1474fG.b(string, "6969")) {
                    Toast.makeText(playerTvFragment.Q(), "PIN incorrecto", 0).show();
                } else {
                    interfaceC0360Cy.c();
                }
                break;
            default:
                AbstractC1474fG.j(editText, "$pinInput");
                AbstractC1474fG.j(interfaceC0360Cy, "$onSuccess");
                C2107ln0 c2107ln0 = (C2107ln0) obj;
                AbstractC1474fG.j(c2107ln0, "this$0");
                C2379oe c2379oe2 = C2379oe.b;
                String string2 = editText.getText().toString();
                AbstractC1474fG.j(string2, "pin");
                if (!AbstractC1474fG.b(string2, "6969")) {
                    Toast.makeText(c2107ln0.v, "PIN incorrecto", 0).show();
                } else {
                    interfaceC0360Cy.c();
                }
                break;
        }
    }
}
