package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class EU {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(DU du) {
        String strT = AbstractC2506pt.t(du.getClass());
        if (strT.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.a;
        DU du2 = (DU) linkedHashMap.get(strT);
        if (AbstractC1474fG.b(du2, du)) {
            return;
        }
        boolean z = false;
        if (du2 != null && du2.b) {
            z = true;
        }
        if (!(!z)) {
            throw new IllegalStateException(("Navigator " + du + " is replacing an already attached " + du2).toString());
        }
        if (!du.b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + du + " is already attached to another NavController").toString());
    }

    public final DU b(String str) {
        AbstractC1474fG.j(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        DU du = (DU) this.a.get(str);
        if (du != null) {
            return du;
        }
        throw new IllegalStateException(AbstractC1701hf0.u("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
