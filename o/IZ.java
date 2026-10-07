package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class IZ extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IZ(PlayerMobileFragment playerMobileFragment, int i) {
        super(0);
        this.m = i;
        this.n = playerMobileFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                this.n.b1.a(new String[]{"text/plain", "text/str", "application/octet-stream", "text/x-unknown", "text/vtt", "text/x-ssa", "application/ttml+xml", "application/x-mp4-vtt", "application/x-subrip"});
                return C2985uq0.a;
            default:
                return new C0744Rt(15, this.n);
        }
    }
}
