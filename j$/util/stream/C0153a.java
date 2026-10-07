package j$.util.stream;

import j$.util.C0140f;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0153a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0153a(int i) {
        this.a = i;
    }

    public /* synthetic */ C0153a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((InterfaceC0236q2) this.b).accept(obj);
                break;
            default:
                ((List) this.b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 1:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo4andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof G) {
            return F.w((G) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return E.w((DoubleStream) objApply);
        }
        C0140f.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC0229p0) {
            return C0224o0.w((InterfaceC0229p0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C0219n0.w((LongStream) objApply);
        }
        C0140f.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return C0162b3.w((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof G) {
            return F.w((G) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return E.w((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC0229p0) {
            return C0224o0.w((InterfaceC0229p0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C0219n0.w((LongStream) objApply);
        }
        C0140f.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC0158b) this.b).I();
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 2:
                C0232p3 c0232p3 = (C0232p3) this.b;
                return c0232p3.d.tryAdvance(c0232p3.e);
            case 3:
                C0241r3 c0241r3 = (C0241r3) this.b;
                return c0241r3.d.tryAdvance(c0241r3.e);
            case 4:
                C0251t3 c0251t3 = (C0251t3) this.b;
                return c0251t3.d.tryAdvance(c0251t3.e);
            default:
                I3 i3 = (I3) this.b;
                return i3.d.tryAdvance(i3.e);
        }
    }
}
