package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0834Vf {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ AbstractActivityC1116bg h;

    public C0834Vf(AbstractActivityC1540fx abstractActivityC1540fx) {
        this.h = abstractActivityC1540fx;
    }

    public final boolean a(int i, int i2, Intent intent) {
        J1 j1;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        O1 o1 = (O1) this.e.get(str);
        if (o1 == null || (j1 = o1.a) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new I1(intent, i2));
            return true;
        }
        j1.c(o1.b.x(intent, i2));
        this.d.remove(str);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i, AbstractC3045vW abstractC3045vW, Object obj) {
        Bundle bundle;
        AbstractActivityC1116bg abstractActivityC1116bg = this.h;
        L0 l0R = abstractC3045vW.r(abstractActivityC1116bg, obj);
        if (l0R != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3393z1(this, i, l0R, 3));
            return;
        }
        Intent intentN = abstractC3045vW.n(abstractActivityC1116bg, obj);
        if (intentN.getExtras() != null && intentN.getExtras().getClassLoader() == null) {
            intentN.setExtrasClassLoader(abstractActivityC1116bg.getClassLoader());
        }
        if (intentN.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentN.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentN.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentN.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentN.getAction())) {
                abstractActivityC1116bg.startActivityForResult(intentN, i, bundle);
                return;
            }
            C1084bG c1084bG = (C1084bG) intentN.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                abstractActivityC1116bg.startIntentSenderForResult(c1084bG.l, i, c1084bG.m, c1084bG.n, c1084bG.f693o, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3393z1(this, i, e, 4));
                return;
            }
        }
        String[] stringArrayExtra = intentN.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                throw new IllegalArgumentException(AbstractC1701hf0.h(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr[i3] = stringArrayExtra[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (abstractActivityC1116bg instanceof C1) {
                ((C1) abstractActivityC1116bg).getClass();
            }
            A1.b(abstractActivityC1116bg, stringArrayExtra, i);
        } else if (abstractActivityC1116bg instanceof B1) {
            new Handler(Looper.getMainLooper()).post(new RunnableC3393z1(strArr, abstractActivityC1116bg, i, 0));
        }
    }

    public final N1 c(String str, AbstractC3045vW abstractC3045vW, J1 j1) {
        d(str);
        this.e.put(str, new O1(j1, abstractC3045vW));
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            j1.c(obj);
        }
        Bundle bundle = this.g;
        I1 i1 = (I1) bundle.getParcelable(str);
        if (i1 != null) {
            bundle.remove(str);
            j1.c(abstractC3045vW.x(i1.m, i1.l));
        }
        return new N1(this, str, abstractC3045vW, 1);
    }

    public final void d(String str) {
        HashMap map = this.b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        AbstractC2045l50.l.getClass();
        int iE = AbstractC2045l50.m.e(2147418112);
        while (true) {
            int i = iE + 65536;
            HashMap map2 = this.a;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                AbstractC2045l50.l.getClass();
                iE = AbstractC2045l50.m.e(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Objects.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.c;
        P1 p1 = (P1) map2.get(str);
        if (p1 != null) {
            ArrayList arrayList = p1.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p1.a.f((ZJ) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
