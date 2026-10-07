package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class u extends t {
    private static final ConcurrentHashMap i = new ConcurrentHashMap();
    private final G e;
    private final boolean f;
    private final HashMap g;
    private final HashMap h;

    u(G g, boolean z) {
        super(j$.time.temporal.l.k(), "ZoneText(" + g + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (G) Objects.requireNonNull(g, "textStyle");
        this.f = z;
    }

    @Override // j$.time.format.t
    protected final n a(w wVar) {
        n nVarF;
        G g = G.NARROW;
        G g2 = this.e;
        if (g2 == g) {
            return super.a(wVar);
        }
        Locale localeI = wVar.i();
        boolean zK = wVar.k();
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        HashMap map = zK ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(localeI);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (nVarF = (n) ((SoftReference) entry.getValue()).get()) == null) {
            nVarF = n.f(wVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(localeI).getZoneStrings();
            int length = zoneStrings.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i2];
                String str = strArr[0];
                if (setA.contains(str)) {
                    nVarF.a(str, str);
                    String strA = H.a(str, localeI);
                    for (int i3 = g2 != G.FULL ? 2 : 1; i3 < strArr.length; i3 += 2) {
                        nVarF.a(strArr[i3], strA);
                    }
                }
                i2++;
            }
            map.put(localeI, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVarF)));
        }
        return nVarF;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
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
    @Override // j$.time.format.t, j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        ?? H;
        String[] strArr;
        ZoneId zoneId = (ZoneId) yVar.f(j$.time.temporal.l.l());
        if (zoneId == null) {
            return false;
        }
        String strO = zoneId.o();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessorD = yVar.d();
            String str = null;
            Map concurrentHashMap = null;
            if (this.f) {
                H = 2;
            } else if (temporalAccessorD.g(j$.time.temporal.a.INSTANT_SECONDS)) {
                H = zoneId.V().h(Instant.from(temporalAccessorD));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessorD.g(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (temporalAccessorD.g(aVar2)) {
                        j$.time.k kVarD0 = j$.time.k.d0(j$.time.i.k0(temporalAccessorD.x(aVar)), j$.time.m.d0(temporalAccessorD.x(aVar2)));
                        if (zoneId.V().f(kVarD0) == null) {
                            j$.time.zone.f fVarV = zoneId.V();
                            j$.time.D dX = j$.time.D.X(kVarD0, zoneId, null);
                            H = fVarV.h(Instant.V(AbstractC0121i.o(dX), dX.b().Z()));
                        } else {
                            H = 2;
                        }
                    } else {
                        H = 2;
                    }
                } else {
                    H = 2;
                }
            }
            Locale localeC = yVar.c();
            G g = G.NARROW;
            G g2 = this.e;
            if (g2 != g) {
                ConcurrentHashMap concurrentHashMap2 = i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strO);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(localeC)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strO);
                    String[] strArr2 = {strO, timeZone.getDisplayName(false, 1, localeC), timeZone.getDisplayName(false, 0, localeC), timeZone.getDisplayName(true, 1, localeC), timeZone.getDisplayName(true, 0, localeC), strO, strO};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(localeC, strArr2);
                    concurrentHashMap2.put(strO, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                int iP = g2.p();
                if (H != 0) {
                    str = H != 1 ? strArr[iP + 5] : strArr[iP + 3];
                } else {
                    str = strArr[iP + 1];
                }
            }
            if (str != null) {
                strO = str;
            }
        }
        sb.append(strO);
        return true;
    }
}
