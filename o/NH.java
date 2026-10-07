package o;

/* JADX INFO: loaded from: classes.dex */
public final class NH implements InterfaceC3274xp0 {
    public final C1797ie0 l;

    public NH(C1797ie0 c1797ie0) {
        this.l = c1797ie0;
    }

    public static AbstractC3177wp0 a(C1797ie0 c1797ie0, BA ba, Kp0 kp0, MH mh) {
        AbstractC3177wp0 pm0;
        Object objM = c1797ie0.e(new Kp0(mh.value())).M();
        boolean zNullSafe = mh.nullSafe();
        if (objM instanceof AbstractC3177wp0) {
            pm0 = (AbstractC3177wp0) objM;
        } else if (objM instanceof InterfaceC3274xp0) {
            pm0 = ((InterfaceC3274xp0) objM).b(ba, kp0);
        } else {
            if (!(objM instanceof PH)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objM.getClass().getName() + " as a @JsonAdapter for " + UK.V(kp0.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            pm0 = new Pm0(objM instanceof PH ? (PH) objM : null, ba, kp0, null, zNullSafe);
            zNullSafe = false;
        }
        return (pm0 == null || !zNullSafe) ? pm0 : new Qf0(pm0, 3);
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        MH mh = (MH) kp0.a.getAnnotation(MH.class);
        if (mh == null) {
            return null;
        }
        return a(this.l, ba, kp0, mh);
    }
}
