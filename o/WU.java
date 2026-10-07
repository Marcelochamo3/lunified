package o;

import j$.util.function.Consumer$CC;
import java.io.EOFException;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WU implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ WU(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        switch (this.a) {
            case 0:
                XU.a.d((XU.a) obj, (EOFException) this.b);
                break;
            case 1:
                ((C1761i90) this.b).d((H50) obj);
                break;
            case 2:
                ((C0578Li) this.b).o(((Integer) obj).intValue());
                break;
            case 3:
                AbstractC1099bV abstractC1099bV = (AbstractC1099bV) obj;
                boolean z = abstractC1099bV instanceof Qi0;
                StringBuilder sb = (StringBuilder) this.b;
                if (z) {
                    sb.append(((Qi0) abstractC1099bV).I());
                } else if (abstractC1099bV.u("br")) {
                    sb.append("\n");
                }
                break;
            case 4:
                ((C0388Ea) obj).c((AQ) this.b);
                break;
            case 5:
                ((C2260nM.b) this.b).f((C0388Ea) obj);
                break;
            default:
                ((C2678ri0) obj).n = (String) ((Map.Entry) this.b).getKey();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
