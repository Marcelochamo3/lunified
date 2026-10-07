package o;

import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class W5 extends AbstractC3177wp0 {
    public static final InterfaceC3274xp0 d = new V5();
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;

    public W5(AbstractC3263xk abstractC3263xk, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        Objects.requireNonNull(abstractC3263xk);
        this.b = abstractC3263xk;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (AbstractC3030vH.a >= 9) {
            arrayList.add(AP.i(i, i2));
        }
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        Date dateB;
        switch (this.a) {
            case 0:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                wh.a();
                while (wh.W()) {
                    arrayList.add(((AbstractC3177wp0) ((C3371yp0) this.c).c).a(wh));
                }
                wh.p();
                int size = arrayList.size();
                Class cls = (Class) this.b;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            case 1:
                Object objA = ((Ep0) this.c).m.a(wh);
                if (objA != null) {
                    Class cls2 = (Class) this.b;
                    if (!cls2.isInstance(objA)) {
                        throw new XH("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + wh.R());
                    }
                }
                return objA;
            case 2:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC3432zV) this.b).M();
                wh.a();
                while (wh.W()) {
                    collection.add(((AbstractC3177wp0) ((C3371yp0) this.c).c).a(wh));
                }
                wh.p();
                return collection;
            default:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH0 = wh.h0();
                synchronized (((ArrayList) this.c)) {
                    try {
                        Iterator it = ((ArrayList) this.c).iterator();
                        while (it.hasNext()) {
                            try {
                                dateB = ((DateFormat) it.next()).parse(strH0);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateB = FE.b(strH0, new ParsePosition(0));
                        } catch (ParseException e) {
                            StringBuilder sbL = AbstractC1701hf0.l("Failed parsing '", strH0, "' as Date; at path ");
                            sbL.append(wh.R());
                            throw new XH(sbL.toString(), e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ((AbstractC3263xk) this.b).b(dateB);
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    c1183cI.Q();
                    return;
                }
                c1183cI.f();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((C3371yp0) this.c).b(c1183cI, Array.get(obj, i));
                }
                c1183cI.p();
                return;
            case 1:
                ((Ep0) this.c).m.b(c1183cI, obj);
                return;
            case 2:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c1183cI.Q();
                    return;
                }
                c1183cI.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((C3371yp0) this.c).b(c1183cI, it.next());
                }
                c1183cI.p();
                return;
            default:
                Date date = (Date) obj;
                if (date == null) {
                    c1183cI.Q();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.c).get(0);
                synchronized (((ArrayList) this.c)) {
                    str = dateFormat.format(date);
                    break;
                }
                c1183cI.b0(str);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public W5(BA ba, Type type, AbstractC3177wp0 abstractC3177wp0, InterfaceC3432zV interfaceC3432zV) {
        this.c = new C3371yp0(ba, abstractC3177wp0, type);
        this.b = interfaceC3432zV;
    }

    public W5(BA ba, AbstractC3177wp0 abstractC3177wp0, Class cls) {
        this.c = new C3371yp0(ba, abstractC3177wp0, cls);
        this.b = cls;
    }

    public W5(Ep0 ep0, Class cls) {
        this.c = ep0;
        this.b = cls;
    }
}
