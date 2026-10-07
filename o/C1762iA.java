package o;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.iA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1762iA extends Exception {
    public static final StackTraceElement[] q = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    public final List l;
    public InterfaceC2450pI m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Class f826o;
    public final String p;

    public C1762iA(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C1762iA)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C1762iA) th).l.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, C1664hA c1664hA) {
        try {
            c(list, c1664hA);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List list, C1664hA c1664hA) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c1664hA.append("Cause (");
            int i2 = i + 1;
            c1664hA.append(String.valueOf(i2));
            c1664hA.append(" of ");
            c1664hA.append(String.valueOf(size));
            c1664hA.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C1762iA) {
                C1762iA c1762iA = (C1762iA) th;
                c1762iA.getClass();
                d(c1762iA, c1664hA);
                b(c1762iA.l, new C1664hA(c1664hA));
            } else {
                d(th, c1664hA);
            }
            i = i2;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.p);
        sb.append(this.f826o != null ? ", " + this.f826o : "");
        int i = this.n;
        sb.append(i != 0 ? ", ".concat(AbstractC1701hf0.y(i)) : "");
        sb.append(this.m != null ? ", " + this.m : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
    }

    public C1762iA(String str, List list) {
        this.p = str;
        setStackTrace(q);
        this.l = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        d(this, printStream);
        b(this.l, new C1664hA(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        d(this, printWriter);
        b(this.l, new C1664hA(printWriter));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
