package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1499fc0 implements Externalizable {
    private static final long serialVersionUID = 0;
    public Collection l;
    public final int m;

    public C1499fc0(int i, Collection collection) {
        AbstractC1474fG.j(collection, "collection");
        this.l = collection;
        this.m = i;
    }

    private final Object readResolve() {
        return this.l;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection collectionH;
        AbstractC1474fG.j(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        if (i == 0) {
            C3421zK c3421zK = new C3421zK(i2);
            while (i3 < i2) {
                c3421zK.add(objectInput.readObject());
                i3++;
            }
            collectionH = AbstractC2506pt.h(c3421zK);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            Fc0 fc0 = new Fc0(new C2552qN(i2));
            while (i3 < i2) {
                fc0.add(objectInput.readObject());
                i3++;
            }
            collectionH = AbstractC1370eA.c(fc0);
        }
        this.l = collectionH;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        AbstractC1474fG.j(objectOutput, "output");
        objectOutput.writeByte(this.m);
        objectOutput.writeInt(this.l.size());
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
