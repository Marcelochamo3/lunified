package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3261xj {
    public final Context a;
    public final String b;
    public final C0519Jb c;
    public final C2938uM d;
    public final List e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final Set k;
    public final List l;
    public final List m;

    public C3261xj(Context context, String str, C0519Jb c0519Jb, C2938uM c2938uM, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(c2938uM, "migrationContainer");
        AbstractC1701hf0.q(i, "journalMode");
        AbstractC1474fG.j(arrayList2, "typeConverters");
        AbstractC1474fG.j(arrayList3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = c0519Jb;
        this.d = c2938uM;
        this.e = arrayList;
        this.f = z;
        this.g = i;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = linkedHashSet;
        this.l = arrayList2;
        this.m = arrayList3;
    }

    public final boolean a(int i, int i2) {
        Set set;
        return this.j && ((set = this.k) == null || !set.contains(Integer.valueOf(i)));
    }
}
