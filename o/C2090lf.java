package o;

/* JADX INFO: renamed from: o.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2090lf implements InterfaceC1734hw {
    public final /* synthetic */ InterfaceC0416Fc l;
    public final /* synthetic */ int m;

    public C2090lf(InterfaceC0416Fc interfaceC0416Fc, int i) {
        this.l = interfaceC0416Fc;
        this.m = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1992kf c1992kf;
        Object obj2;
        if (interfaceC0473Hh instanceof C1992kf) {
            c1992kf = (C1992kf) interfaceC0473Hh;
            int i = c1992kf.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1992kf.n = i - Integer.MIN_VALUE;
            } else {
                c1992kf = new C1992kf(this, interfaceC0473Hh);
            }
        } else {
            c1992kf = new C1992kf(this, interfaceC0473Hh);
        }
        Object obj3 = c1992kf.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1992kf.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i2 != 0) {
            if (i2 == 1) {
                Jp0.O(obj3);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj3);
            }
        }
        Jp0.O(obj3);
        C3416zF c3416zF = new C3416zF(this.m, obj);
        c1992kf.n = 1;
        if (this.l.e(c3416zF, c1992kf) == enumC1706hi) {
            return enumC1706hi;
        }
        c1992kf.n = 2;
        InterfaceC1022ai interfaceC1022aiG = c1992kf.g();
        AbstractC3409z9.l(interfaceC1022aiG);
        InterfaceC0473Hh interfaceC0473HhP = Ou0.p(c1992kf);
        C1520fn c1520fn = interfaceC0473HhP instanceof C1520fn ? (C1520fn) interfaceC0473HhP : null;
        if (c1520fn == null) {
            obj2 = c2985uq0;
        } else {
            AbstractC1217ci abstractC1217ci = c1520fn.f783o;
            if (abstractC1217ci.Y()) {
                c1520fn.q = c2985uq0;
                c1520fn.n = 1;
                abstractC1217ci.X(interfaceC1022aiG, c1520fn);
            } else {
                C1445ey0 c1445ey0 = new C1445ey0(C1445ey0.n);
                InterfaceC1022ai interfaceC1022aiQ = interfaceC1022aiG.Q(c1445ey0);
                c1520fn.q = c2985uq0;
                c1520fn.n = 1;
                abstractC1217ci.X(interfaceC1022aiQ, c1520fn);
                if (c1445ey0.m) {
                    AbstractC1918jr abstractC1918jrA = AbstractC1415ej0.a();
                    M5 m5 = abstractC1918jrA.p;
                    if (!(m5 != null ? m5.isEmpty() : true)) {
                        if (abstractC1918jrA.d0()) {
                            c1520fn.q = c2985uq0;
                            c1520fn.n = 1;
                            abstractC1918jrA.a0(c1520fn);
                        } else {
                            abstractC1918jrA.c0(true);
                            try {
                                c1520fn.run();
                                do {
                                } while (abstractC1918jrA.f0());
                            } catch (Throwable th) {
                                try {
                                    c1520fn.l(th, null);
                                } catch (Throwable th2) {
                                    abstractC1918jrA.Z(true);
                                    throw th2;
                                }
                            }
                            abstractC1918jrA.Z(true);
                        }
                    }
                    obj2 = c2985uq0;
                }
            }
            obj2 = enumC1706hi;
        }
        if (obj2 != enumC1706hi) {
            obj2 = c2985uq0;
        }
        return obj2 == enumC1706hi ? enumC1706hi : c2985uq0;
    }
}
