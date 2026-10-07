package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public G() {
    }

    G(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objT;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                int i = AbstractC0113a.c;
                objT = AbstractC0113a.t(objectInput.readUTF());
                break;
            case 2:
                objT = ((InterfaceC0114b) objectInput.readObject()).B((j$.time.m) objectInput.readObject());
                break;
            case 3:
                objT = ((InterfaceC0117e) objectInput.readObject()).q((ZoneOffset) objectInput.readObject()).l((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.i iVar = z.d;
                int i2 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                x.d.getClass();
                objT = new z(j$.time.i.i0(i2, b2, b3));
                break;
            case 5:
                A a = A.d;
                objT = A.s(objectInput.readByte());
                break;
            case 6:
                q qVar = (q) objectInput.readObject();
                int i3 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                qVar.getClass();
                objT = s.a0(qVar, i3, b4, b5);
                break;
            case 7:
                int i4 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C.d.getClass();
                objT = new E(j$.time.i.i0(i4 + 1911, b6, b7));
                break;
            case 8:
                int i5 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                I.d.getClass();
                objT = new K(j$.time.i.i0(i5 - 543, b8, b9));
                break;
            case 9:
                int i6 = C0120h.e;
                objT = new C0120h(AbstractC0113a.t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objT;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0113a) obj).o());
                return;
            case 2:
                ((C0119g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((m) obj).writeExternal(objectOutput);
                return;
            case 4:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(zVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(zVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(zVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((A) obj).D(objectOutput);
                return;
            case 6:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 7:
                E e = (E) obj;
                e.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(e, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(e, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(e, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                K k = (K) obj;
                k.getClass();
                objectOutput.writeInt(j$.time.temporal.l.a(k, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(k, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.l.a(k, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0120h) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
