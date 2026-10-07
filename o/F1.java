package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@CU("activity")
public class F1 extends DU {
    public final Context c;
    public final Activity d;

    public F1(Context context) {
        AbstractC1474fG.j(context, "context");
        this.c = context;
        for (Object obj : Vb0.K(context, E1.n)) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
            }
        }
        obj = null;
        this.d = (Activity) obj;
    }

    @Override // o.DU
    public final TT a() {
        return new D1(this);
    }

    @Override // o.DU
    public final TT c(TT tt, Bundle bundle, C1098bU c1098bU) {
        Intent intent;
        int intExtra;
        D1 d1 = (D1) tt;
        if (d1.w == null) {
            throw new IllegalStateException(AbstractC1701hf0.g(new StringBuilder("Destination "), d1.s, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(d1.w);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = d1.x;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c1098bU != null && c1098bU.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", d1.s);
        Context context = this.c;
        Resources resources = context.getResources();
        if (c1098bU != null) {
            int i = c1098bU.h;
            int i2 = c1098bU.i;
            if ((i <= 0 || !AbstractC1474fG.b(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !AbstractC1474fG.b(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                resources.getResourceName(i);
                resources.getResourceName(i2);
                d1.toString();
            }
        }
        context.startActivity(intent2);
        if (c1098bU == null || activity == null) {
            return null;
        }
        int i3 = c1098bU.f;
        int i4 = c1098bU.g;
        if ((i3 > 0 && AbstractC1474fG.b(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && AbstractC1474fG.b(resources.getResourceTypeName(i4), "animator"))) {
            resources.getResourceName(i3);
            resources.getResourceName(i4);
            d1.toString();
            return null;
        }
        if (i3 < 0 && i4 < 0) {
            return null;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
        return null;
    }

    @Override // o.DU
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
