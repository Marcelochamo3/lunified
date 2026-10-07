package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0208l implements BiConsumer, Supplier, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0208l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((C0222n3) this.b).b((Consumer) this.c, obj);
                break;
            case 3:
                if (obj != null) {
                    ((ConcurrentHashMap) this.c).putIfAbsent(obj, Boolean.TRUE);
                } else {
                    ((AtomicBoolean) this.b).set(true);
                }
                break;
            default:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Collectors.a((Function) this.b, (Function) this.c, (Map) obj, obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 2:
                break;
            case 3:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C0238r0((EnumC0262w0) this.b, (Predicate) this.c);
    }
}
