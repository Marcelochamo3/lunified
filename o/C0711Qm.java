package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711Qm implements RQ {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ C0711Qm(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                return new C1558g6(this.b, this);
            case 1:
                return new C1558g6(this.b, this);
            case 2:
                return new C1558g6(this.b, this);
            case 3:
                return new SP(this.b, 0);
            case 4:
                return new SP(this.b, 1);
            case 5:
                return new SP(this.b, 2);
            case 6:
                return new C1558g6(this.b, c1583gR.k(Integer.class, AssetFileDescriptor.class));
            default:
                return new C1558g6(this.b, c1583gR.k(Integer.class, InputStream.class));
        }
    }

    public void b(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            case 1:
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    public Class c() {
        switch (this.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    public Object d(Resources resources, int i, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                return resources.openRawResourceFd(i);
            case 1:
                Context context = this.b;
                return AbstractC1459f50.x(context, context, i, theme);
            default:
                return resources.openRawResource(i);
        }
    }
}
