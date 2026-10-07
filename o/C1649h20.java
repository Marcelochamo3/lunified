package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.h20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1649h20 implements InterfaceC2159mI {
    public final /* synthetic */ int a;
    public final Object b;
    public final CJ c;

    public C1649h20(C2766se c2766se) {
        this.a = 0;
        this.b = c2766se;
        this.c = AP.m(IJ.m, new io.sentry.android.replay.f(16, this));
    }

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        switch (this.a) {
            case 0:
                AbstractC1474fG.j(c1909jm0, "encoder");
                c1909jm0.u().getClass();
                InterfaceC1476fI interfaceC1476fI = (InterfaceC1476fI) this.b;
                AbstractC1474fG.j(interfaceC1476fI, "baseClass");
                C2766se c2766se = (C2766se) interfaceC1476fI;
                if (c2766se.c(obj)) {
                    Jp0.y(1, null);
                }
                C2766se c2766seA = AbstractC2822t60.a(obj.getClass());
                String strB = c2766seA.b();
                if (strB == null) {
                    strB = String.valueOf(c2766seA);
                }
                String str = "in the polymorphic scope of '" + c2766se.b() + '\'';
                StringBuilder sb = new StringBuilder("Serializer for subclass '");
                sb.append(strB);
                sb.append("' is not found ");
                sb.append(str);
                sb.append(".\nCheck if class with serial name '");
                AbstractC1701hf0.r(sb, strB, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", strB, "' has to be '@Serializable', and the base class '");
                sb.append(c2766se.b());
                sb.append("' has to be sealed and '@Serializable'.");
                throw new C1401ec0(sb.toString());
            default:
                Enum r6 = (Enum) obj;
                AbstractC1474fG.j(c1909jm0, "encoder");
                Enum[] enumArr = (Enum[]) this.b;
                int iQ = X5.Q(enumArr, r6);
                if (iQ != -1) {
                    c1909jm0.j(b(), iQ);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r6);
                sb2.append(" is not a valid enum ");
                sb2.append(b().a());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC1474fG.i(string, "toString(...)");
                sb2.append(string);
                throw new C1401ec0(sb2.toString());
        }
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        switch (this.a) {
            case 0:
                return (Zb0) this.c.getValue();
            default:
                return (Zb0) ((Rh0) this.c).getValue();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + ((InterfaceC1476fI) this.b) + ')';
            default:
                return "kotlinx.serialization.internal.EnumSerializer<" + b().a() + '>';
        }
    }

    public C1649h20(String str, Enum[] enumArr) {
        this.a = 1;
        this.b = enumArr;
        this.c = new Rh0(new C0503Il(this, 1, str));
    }
}
