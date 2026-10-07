package o;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class SP implements QQ {
    public final /* synthetic */ int a;
    public final Context b;

    public SP(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractC1376eG.v((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC1376eG.v(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC1376eG.v(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        Long l;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new PQ(new AV(uri), new RP(this.b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                AV av = new AV(uri2);
                Context context = this.b;
                return new PQ(av, C3067vj.d(context, uri2, new C1806ij0(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) fw.c(Ns0.d)) == null || l.longValue() != -1) {
                    return null;
                }
                AV av2 = new AV(uri3);
                Context context2 = this.b;
                return new PQ(av2, C3067vj.d(context2, uri3, new C1806ij0(context2.getContentResolver(), 1)));
        }
    }
}
