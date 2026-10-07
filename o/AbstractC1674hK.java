package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: o.hK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1674hK {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "Doctype";
            case 2:
                return "StartTag";
            case 3:
                return "EndTag";
            case 4:
                return "Comment";
            case 5:
                return "Character";
            case 6:
                return "EOF";
            default:
                return "null";
        }
    }

    public static Ut0 a(Yt0 yt0, Class cls, AbstractC2484pi abstractC2484pi) {
        AbstractC1474fG.j(cls, "modelClass");
        AbstractC1474fG.j(abstractC2484pi, "extras");
        return yt0.a(cls);
    }

    public static Ut0 b(Yt0 yt0, InterfaceC1476fI interfaceC1476fI, AbstractC2484pi abstractC2484pi) {
        AbstractC1474fG.j(interfaceC1476fI, "modelClass");
        AbstractC1474fG.j(abstractC2484pi, "extras");
        return yt0.b(AbstractC0397Ej.s(interfaceC1476fI), abstractC2484pi);
    }

    public static void c(InterfaceC1324dm0 interfaceC1324dm0, C2562qX c2562qX, int i) {
        interfaceC1324dm0.c(i, c2562qX);
    }

    public static final void d(int i, View view, ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        int iW = AbstractC1701hf0.w(i);
        if (iW == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iW == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iW == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iW != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    public static int e(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int f(int i) {
        return i & 384;
    }

    public static int g(int i) {
        return i & 64;
    }

    public static /* synthetic */ boolean h(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static int i(int i, String str, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static int j(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static View k(RecyclerView recyclerView, int i, RecyclerView recyclerView2, boolean z) {
        return LayoutInflater.from(recyclerView.getContext()).inflate(i, recyclerView2, z);
    }

    public static Object l(Bundle bundle, String str, String str2, String str3, String str4) {
        AbstractC1474fG.j(bundle, str);
        AbstractC1474fG.j(str2, str3);
        return bundle.get(str4);
    }

    public static String m(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String n(int i, String str) {
        return str + i;
    }

    public static String o(long j, String str) {
        return str + j;
    }

    public static String p(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String q(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder r(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void t(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static /* synthetic */ void u(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void v(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i == 3) {
            return "GONE";
        }
        if (i == 4) {
            return "INVISIBLE";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }
}
