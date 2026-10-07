package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends AbstractC3045vW {
    public final /* synthetic */ int k;

    public /* synthetic */ K1(int i) {
        this.k = i;
    }

    @Override // o.AbstractC3045vW
    public final Intent n(AbstractActivityC1116bg abstractActivityC1116bg, Object obj) {
        Bundle bundleExtra;
        switch (this.k) {
            case 0:
                AbstractC1474fG.j(abstractActivityC1116bg, "context");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
                AbstractC1474fG.i(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 1:
                AbstractC1474fG.j(abstractActivityC1116bg, "context");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                AbstractC1474fG.i(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                Intent intent = (Intent) obj;
                AbstractC1474fG.j(abstractActivityC1116bg, "context");
                return intent;
            default:
                C1084bG c1084bG = (C1084bG) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c1084bG.m;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c1084bG.l;
                        AbstractC1474fG.j(intentSender, "intentSender");
                        c1084bG = new C1084bG(intentSender, null, c1084bG.n, c1084bG.f693o);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1084bG);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // o.AbstractC3045vW
    public L0 r(AbstractActivityC1116bg abstractActivityC1116bg, Object obj) {
        switch (this.k) {
            case 0:
                AbstractC1474fG.j(abstractActivityC1116bg, "context");
                return null;
            case 1:
                String[] strArr = (String[]) obj;
                AbstractC1474fG.j(abstractActivityC1116bg, "context");
                if (strArr.length == 0) {
                    return new L0(C1330dq.l);
                }
                for (String str : strArr) {
                    if (AbstractC1459f50.k(abstractActivityC1116bg, str) != 0) {
                        return null;
                    }
                }
                int iX = AbstractC3327yN.x(strArr.length);
                if (iX < 16) {
                    iX = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iX);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new L0(linkedHashMap);
            default:
                return super.r(abstractActivityC1116bg, obj);
        }
    }

    @Override // o.AbstractC3045vW
    public final Object x(Intent intent, int i) {
        switch (this.k) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                C1330dq c1330dq = C1330dq.l;
                if (i != -1 || intent == null) {
                    return c1330dq;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c1330dq;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayListP = X5.P(stringArrayExtra);
                Iterator it = arrayListP.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1016af.O(arrayListP, 10), AbstractC1016af.O(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C1101bX(it.next(), it2.next()));
                }
                return AbstractC3327yN.A(arrayList2);
            case 2:
                return new I1(intent, i);
            default:
                return new I1(intent, i);
        }
    }
}
