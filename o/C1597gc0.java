package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: renamed from: o.gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597gc0 implements Externalizable {
    private static final long serialVersionUID = 0;
    public Map l;

    private final Object readResolve() {
        return this.l;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        AbstractC1474fG.j(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(AbstractC1674hK.n(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        C2552qN c2552qN = new C2552qN(i);
        for (int i2 = 0; i2 < i; i2++) {
            c2552qN.put(objectInput.readObject(), objectInput.readObject());
        }
        this.l = c2552qN.b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        AbstractC1474fG.j(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.l.size());
        for (Map.Entry entry : this.l.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
