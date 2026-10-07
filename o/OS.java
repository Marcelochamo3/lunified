package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OS extends K {
    private static final long serialVersionUID = 0;
    public transient Gh0 q;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.q = (Gh0) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f629o = map;
        this.p = 0;
        for (Collection collection : map.values()) {
            if (!(!collection.isEmpty())) {
                throw new IllegalArgumentException();
            }
            this.p = collection.size() + this.p;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.q);
        objectOutputStream.writeObject(this.f629o);
    }
}
