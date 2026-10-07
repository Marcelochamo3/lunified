package o;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class ES extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public ES(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        AbstractC1474fG.j((InterfaceC3318yE) iInterface, "callback");
        AbstractC1474fG.j(obj, "cookie");
        this.a.m.remove((Integer) obj);
    }
}
