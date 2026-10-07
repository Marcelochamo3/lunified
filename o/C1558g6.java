package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1558g6 implements QQ {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C1558g6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    if (((QQ) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        PQ pqB;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new PQ(new AV(uri2), ((C1460f6) this.c).b((AssetManager) this.b, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) fw.c(S70.b);
                return new PQ(new AV(num), new C0737Rm(theme, theme != null ? theme.getResources() : ((Context) this.b).getResources(), (C0711Qm) this.c, num.intValue()));
            case 2:
                List list = (List) this.b;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                InterfaceC2450pI interfaceC2450pI = null;
                for (int i3 = 0; i3 < size; i3++) {
                    QQ qq = (QQ) list.get(i3);
                    if (qq.a(obj) && (pqB = qq.b(obj, i, i2, fw)) != null) {
                        arrayList.add(pqB.c);
                        interfaceC2450pI = pqB.a;
                    }
                }
                if (arrayList.isEmpty() || interfaceC2450pI == null) {
                    return null;
                }
                return new PQ(interfaceC2450pI, new FS(arrayList, (InterfaceC1941k20) this.c));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException unused) {
                    Log.isLoggable("ResourceLoader", 5);
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((QQ) this.b).b(uri, i, i2, fw);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                QQ qq2 = (QQ) this.c;
                PQ pqB2 = null;
                if (size2 == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            pqB2 = qq2.b(Integer.valueOf(i4), i, i2, fw);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return pqB2;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return pqB2;
                        }
                        Objects.toString(uri3);
                        return pqB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.b;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return qq2.b(Integer.valueOf(identifier), i, i2, fw);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C1558g6(Resources resources, QQ qq) {
        this.a = 3;
        this.c = resources;
        this.b = qq;
    }

    public C1558g6(Context context, C0711Qm c0711Qm) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = c0711Qm;
    }

    public C1558g6(Context context, QQ qq) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = qq;
    }
}
