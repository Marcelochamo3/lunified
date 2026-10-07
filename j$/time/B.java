package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class B extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    private final String b;
    private final transient j$.time.zone.f c;

    B(String str, j$.time.zone.f fVar) {
        this.b = str;
        this.c = fVar;
    }

    static B a0(String str, boolean z) {
        j$.time.zone.f fVarB;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new C0111b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new C0111b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            fVarB = j$.time.zone.j.b(str, true);
        } catch (j$.time.zone.g e) {
            if (z) {
                throw e;
            }
            fVarB = null;
        }
        return new B(str, fVarB);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f V() {
        j$.time.zone.f fVar = this.c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.b, false);
    }

    @Override // j$.time.ZoneId
    final void Z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }

    final void b0(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override // j$.time.ZoneId
    public final String o() {
        return this.b;
    }
}
