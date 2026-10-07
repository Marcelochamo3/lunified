package o;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: o.hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1687hX extends Pu0 {
    public final /* synthetic */ int f;
    public final Method g;
    public final int h;
    public final boolean i;

    public /* synthetic */ C1687hX(Method method, int i, boolean z, int i2) {
        this.f = i2;
        this.g = method;
        this.h = i;
        this.i = z;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        switch (this.f) {
            case 0:
                Map map = (Map) obj;
                int i = this.h;
                Method method = this.g;
                if (map == null) {
                    throw UK.M(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw UK.M(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw UK.M(method, i, AbstractC1701hf0.u("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw UK.M(method, i, "Field map value '" + value + "' converted to null by " + O9.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c2534q70.a(str, string, this.i);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i2 = this.h;
                Method method2 = this.g;
                if (map2 == null) {
                    throw UK.M(method2, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw UK.M(method2, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw UK.M(method2, i2, AbstractC1701hf0.u("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c2534q70.b(str2, value2.toString(), this.i);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i3 = this.h;
                Method method3 = this.g;
                if (map3 == null) {
                    throw UK.M(method3, i3, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw UK.M(method3, i3, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw UK.M(method3, i3, AbstractC1701hf0.u("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw UK.M(method3, i3, "Query map value '" + value3 + "' converted to null by " + O9.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c2534q70.d(str3, string2, this.i);
                }
                return;
        }
    }
}
