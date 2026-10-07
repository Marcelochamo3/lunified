package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import o.Yu0;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private byte a;
    private Object b;

    public a() {
    }

    a(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    static long a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    static ZoneOffset b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ZoneOffset.f0(dataInput.readInt()) : ZoneOffset.f0(b * 900);
    }

    static void c(long j, DataOutput dataOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
        }
    }

    static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int iC0 = zoneOffset.c0();
        int i = iC0 % 900 == 0 ? iC0 / 900 : Yu0.b.k0;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(iC0);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objL;
        byte b = objectInput.readByte();
        this.a = b;
        if (b == 1) {
            objL = f.l(objectInput);
        } else if (b == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            objL = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b == 3) {
            objL = e.b(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            objL = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = objL;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b == 1) {
            ((f) obj).m(objectOutput);
            return;
        }
        if (b == 2) {
            ((b) obj).U(objectOutput);
        } else if (b == 3) {
            ((e) obj).c(objectOutput);
        } else {
            if (b != 100) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((f) obj).n(objectOutput);
        }
    }
}
