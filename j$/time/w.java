package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class w implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public w() {
    }

    w(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.C(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.V(objectInput.readLong(), objectInput.readInt());
            case 3:
                i iVar = i.d;
                return i.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return m.k0(objectInput);
            case 5:
                k kVar = k.c;
                i iVar2 = i.d;
                return k.d0(i.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), m.k0(objectInput));
            case 6:
                return D.Z(objectInput);
            case 7:
                int i = B.d;
                return ZoneId.W(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.h0(objectInput);
            case 9:
                return u.W(objectInput);
            case 10:
                return s.X(objectInput);
            case 11:
                int i2 = y.b;
                return y.U(objectInput.readInt());
            case 12:
                int i3 = A.c;
                return A.V(objectInput.readInt(), objectInput.readByte());
            case 13:
                return q.U(objectInput);
            case 14:
                return v.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).V(objectOutput);
                return;
            case 2:
                ((Instant) obj).Y(objectOutput);
                return;
            case 3:
                ((i) obj).w0(objectOutput);
                return;
            case 4:
                ((m) obj).p0(objectOutput);
                return;
            case 5:
                ((k) obj).n0(objectOutput);
                return;
            case 6:
                ((D) obj).d0(objectOutput);
                return;
            case 7:
                ((B) obj).b0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).i0(objectOutput);
                return;
            case 9:
                ((u) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((y) obj).Y(objectOutput);
                return;
            case 12:
                ((A) obj).b0(objectOutput);
                return;
            case 13:
                ((q) obj).V(objectOutput);
                return;
            case 14:
                ((v) obj).e(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
