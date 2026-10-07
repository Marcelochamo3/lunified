package o;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: o.Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0330Bu extends EnumC0512Iu {
    public C0330Bu() {
        super("IDENTITY", 0);
    }

    @Override // o.EnumC0512Iu
    public final String b(Field field) {
        return field.getName();
    }
}
