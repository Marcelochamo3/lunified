package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.models.Video$Type;

/* JADX INFO: loaded from: classes.dex */
public final class LZ extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f382o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LZ(PlayerMobileFragment playerMobileFragment, long j, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerMobileFragment;
        this.f382o = j;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((LZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new LZ(this.n, this.f382o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC2220mv0 interfaceC2220mv0F;
        long jA;
        C2123lv0 c2123lv0B;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            PlayerMobileFragment playerMobileFragment = this.n;
            Video$Type video$Type = playerMobileFragment.h0().d;
            AbstractC1474fG.h(video$Type, "null cannot be cast to non-null type com.skidush.clonex.models.Video.Type");
            boolean z = video$Type instanceof Is0;
            Rh0 rh0 = playerMobileFragment.w0;
            if (z) {
                interfaceC2220mv0F = ((AppDatabase) rh0.getValue()).p().u(((Is0) video$Type).l);
            } else {
                if (!(video$Type instanceof Hs0)) {
                    throw new C0730Rf();
                }
                interfaceC2220mv0F = ((AppDatabase) rh0.getValue()).o().f(((Hs0) video$Type).l);
            }
            if (interfaceC2220mv0F == null || (c2123lv0B = interfaceC2220mv0F.b()) == null) {
                jA = 0;
            } else {
                int i2 = AbstractC0947Zo.n;
                jA = c2123lv0B.b - AbstractC0947Zo.a(Nr0.G(10, EnumC1231cp.SECONDS));
            }
            long j = this.f382o;
            if (j > 0) {
                jA = j;
            }
            C3362yl c3362yl = AbstractC1910jn.a;
            EM em = FM.a;
            KZ kz = new KZ(playerMobileFragment, jA, null);
            this.m = 1;
            if (AbstractC1376eG.J(em, kz, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
