package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.pe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2477pe0 implements InterfaceC3035vM {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final C2551qM a = new C2551qM(1);
    public final C2994uv b = new C2994uv(6);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(Kr0.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = Kr0.d(config) * i * i2;
        C2551qM c2551qM = this.a;
        InterfaceC1747i20 interfaceC1747i20R = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
        if (interfaceC1747i20R == null) {
            interfaceC1747i20R = c2551qM.r();
        }
        C2380oe0 c2380oe0 = (C2380oe0) interfaceC1747i20R;
        c2380oe0.b = iD;
        c2380oe0.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = AbstractC2283ne0.a[config.ordinal()];
            if (i3 == 1) {
                configArr = d;
            } else if (i3 == 2) {
                configArr = f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                c2551qM.h(c2380oe0);
                int iIntValue = num.intValue();
                InterfaceC1747i20 interfaceC1747i20R2 = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
                if (interfaceC1747i20R2 == null) {
                    interfaceC1747i20R2 = c2551qM.r();
                }
                c2380oe0 = (C2380oe0) interfaceC1747i20R2;
                c2380oe0.b = iIntValue;
                c2380oe0.c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.V(c2380oe0);
        if (bitmap != null) {
            a(Integer.valueOf(c2380oe0.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = Kr0.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C2551qM c2551qM = this.a;
        InterfaceC1747i20 interfaceC1747i20R = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
        if (interfaceC1747i20R == null) {
            interfaceC1747i20R = c2551qM.r();
        }
        C2380oe0 c2380oe0 = (C2380oe0) interfaceC1747i20R;
        c2380oe0.b = iC;
        c2380oe0.c = config;
        this.b.i0(c2380oe0, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(c2380oe0.b));
        navigableMapD.put(Integer.valueOf(c2380oe0.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbK = AbstractC1701hf0.k("SizeConfigStrategy{groupedMap=");
        sbK.append(this.b);
        sbK.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbK.append(entry.getKey());
            sbK.append('[');
            sbK.append(entry.getValue());
            sbK.append("], ");
        }
        if (!map.isEmpty()) {
            sbK.replace(sbK.length() - 2, sbK.length(), "");
        }
        sbK.append(")}");
        return sbK.toString();
    }
}
