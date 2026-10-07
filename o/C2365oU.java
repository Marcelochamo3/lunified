package o;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: renamed from: o.oU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2365oU extends ZP {
    public final int A;
    public final Class z;

    public C2365oU(Context context, Class cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // o.ZP
    public final C1386eQ a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size <= i4) {
            w();
            C1386eQ c1386eQA = super.a(i, i2, i3, charSequence);
            c1386eQA.g(true);
            v();
            return c1386eQA;
        }
        String simpleName = this.z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC1701hf0.h(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // o.ZP, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
