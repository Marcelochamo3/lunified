package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.xs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3280xs0 {
    public final S5 a;
    public final S5 b;
    public final S5 c;

    public AbstractC3280xs0(S5 s5, S5 s6, S5 s7) {
        this.a = s5;
        this.b = s6;
        this.c = s7;
    }

    public abstract C3377ys0 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        S5 s5 = this.c;
        Class cls2 = (Class) s5.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        s5.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        S5 s5 = this.a;
        Method method = (Method) s5.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3280xs0.class.getClassLoader()).getDeclaredMethod("read", AbstractC3280xs0.class);
        s5.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        S5 s5 = this.b;
        Method method = (Method) s5.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, AbstractC3280xs0.class);
        s5.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((C3377ys0) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C3377ys0) this).e.readParcelable(C3377ys0.class.getClassLoader());
    }

    public final InterfaceC3474zs0 h() {
        String string = ((C3377ys0) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC3474zs0) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((C3377ys0) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((C3377ys0) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(InterfaceC3474zs0 interfaceC3474zs0) {
        if (interfaceC3474zs0 == null) {
            ((C3377ys0) this).e.writeString(null);
            return;
        }
        try {
            ((C3377ys0) this).e.writeString(b(interfaceC3474zs0.getClass()).getName());
            C3377ys0 c3377ys0A = a();
            try {
                d(interfaceC3474zs0.getClass()).invoke(null, interfaceC3474zs0, c3377ys0A);
                int i = c3377ys0A.i;
                if (i >= 0) {
                    int i2 = c3377ys0A.d.get(i);
                    Parcel parcel = c3377ys0A.e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC3474zs0.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
