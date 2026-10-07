package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class Xg0 implements QQ {
    public final /* synthetic */ int a;
    public final QQ b;

    public /* synthetic */ Xg0(QQ qq, int i) {
        this.a = i;
        this.b = qq;
    }

    @Override // o.QQ
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        Uri uriFromFile;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                QQ qq = this.b;
                if (qq.a(uriFromFile)) {
                    return qq.b(uriFromFile, i, i2, fw);
                }
                return null;
            default:
                return this.b.b(new C2151mA((URL) obj), i, i2, fw);
        }
    }
}
