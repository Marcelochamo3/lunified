package o;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Nf0 extends AbstractC3177wp0 {
    public static final InterfaceC3274xp0 c = new Mf0();
    public static final InterfaceC3274xp0 d = new Of0();
    public static final InterfaceC3274xp0 e = new C3358yj();
    public final /* synthetic */ int a;
    public final Object b;

    public Nf0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (AbstractC3030vH.a >= 9) {
                    arrayList.add(AP.i(2, 2));
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    private final Object c(WH wh) throws IOException {
        Date date;
        if (wh.j0() == 9) {
            wh.f0();
            return null;
        }
        String strH0 = wh.h0();
        try {
            synchronized (this) {
                date = ((SimpleDateFormat) this.b).parse(strH0);
            }
            return new java.sql.Date(date.getTime());
        } catch (ParseException e2) {
            StringBuilder sbL = AbstractC1701hf0.l("Failed parsing '", strH0, "' as SQL Date; at path ");
            sbL.append(wh.R());
            throw new XH(sbL.toString(), e2);
        }
    }

    private final Object d(WH wh) throws IOException {
        Time time;
        if (wh.j0() == 9) {
            wh.f0();
            return null;
        }
        String strH0 = wh.h0();
        try {
            synchronized (this) {
                try {
                    time = new Time(((SimpleDateFormat) this.b).parse(strH0).getTime());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return time;
        } catch (ParseException e2) {
            StringBuilder sbL = AbstractC1701hf0.l("Failed parsing '", strH0, "' as SQL Time; at path ");
            sbL.append(wh.R());
            throw new XH(sbL.toString(), e2);
        }
    }

    private final void e(C1183cI c1183cI, Object obj) throws IOException {
        String str;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            c1183cI.Q();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.b).format((Date) date);
        }
        c1183cI.b0(str);
    }

    private final void f(C1183cI c1183cI, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c1183cI.Q();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.b).format((Date) time);
        }
        c1183cI.b0(str);
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        Date dateB;
        switch (this.a) {
            case 0:
                return c(wh);
            case 1:
                return d(wh);
            default:
                if (wh.j0() == 9) {
                    wh.f0();
                    return null;
                }
                String strH0 = wh.h0();
                synchronized (((ArrayList) this.b)) {
                    try {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (it.hasNext()) {
                            try {
                                dateB = ((DateFormat) it.next()).parse(strH0);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateB = FE.b(strH0, new ParsePosition(0));
                        } catch (ParseException e2) {
                            StringBuilder sbL = AbstractC1701hf0.l("Failed parsing '", strH0, "' as Date; at path ");
                            sbL.append(wh.R());
                            throw new XH(sbL.toString(), e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return dateB;
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                e(c1183cI, obj);
                return;
            case 1:
                f(c1183cI, obj);
                return;
            default:
                Date date = (Date) obj;
                if (date == null) {
                    c1183cI.Q();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str = dateFormat.format(date);
                    break;
                }
                c1183cI.b0(str);
                return;
        }
    }
}
