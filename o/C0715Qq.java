package o;

/* JADX INFO: renamed from: o.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0715Qq implements InterfaceC2727s70, InterfaceC2049l70 {
    public final Object a;
    public final InterfaceC2727s70 b;
    public volatile InterfaceC2049l70 c;
    public volatile InterfaceC2049l70 d;
    public int e = 3;
    public int f = 3;

    public C0715Qq(Object obj, InterfaceC2727s70 interfaceC2727s70) {
        this.a = obj;
        this.b = interfaceC2727s70;
    }

    @Override // o.InterfaceC2727s70, o.InterfaceC2049l70
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final InterfaceC2727s70 b() {
        InterfaceC2727s70 interfaceC2727s70B;
        synchronized (this.a) {
            try {
                InterfaceC2727s70 interfaceC2727s70 = this.b;
                interfaceC2727s70B = interfaceC2727s70 != null ? interfaceC2727s70.b() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2727s70B;
    }

    @Override // o.InterfaceC2727s70
    public final void c(InterfaceC2049l70 interfaceC2049l70) {
        synchronized (this.a) {
            try {
                if (interfaceC2049l70.equals(this.d)) {
                    this.f = 5;
                    InterfaceC2727s70 interfaceC2727s70 = this.b;
                    if (interfaceC2727s70 != null) {
                        interfaceC2727s70.c(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final boolean e(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        synchronized (this.a) {
            InterfaceC2727s70 interfaceC2727s70 = this.b;
            z = interfaceC2727s70 == null || interfaceC2727s70.e(this);
        }
        return z;
    }

    @Override // o.InterfaceC2049l70
    public final void f() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.f();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean g(InterfaceC2049l70 interfaceC2049l70) {
        if (!(interfaceC2049l70 instanceof C0715Qq)) {
            return false;
        }
        C0715Qq c0715Qq = (C0715Qq) interfaceC2049l70;
        return this.c.g(c0715Qq.c) && this.d.g(c0715Qq.d);
    }

    @Override // o.InterfaceC2727s70
    public final boolean h(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        synchronized (this.a) {
            InterfaceC2727s70 interfaceC2727s70 = this.b;
            z = (interfaceC2727s70 == null || interfaceC2727s70.h(this)) && interfaceC2049l70.equals(this.c);
        }
        return z;
    }

    @Override // o.InterfaceC2049l70
    public final void i() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final void j(InterfaceC2049l70 interfaceC2049l70) {
        synchronized (this.a) {
            try {
                if (interfaceC2049l70.equals(this.c)) {
                    this.e = 4;
                } else if (interfaceC2049l70.equals(this.d)) {
                    this.f = 4;
                }
                InterfaceC2727s70 interfaceC2727s70 = this.b;
                if (interfaceC2727s70 != null) {
                    interfaceC2727s70.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final boolean l(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            InterfaceC2727s70 interfaceC2727s70 = this.b;
            z = false;
            if (interfaceC2727s70 == null || interfaceC2727s70.l(this)) {
                if (this.e != 5) {
                    zEquals = interfaceC2049l70.equals(this.c);
                } else {
                    zEquals = interfaceC2049l70.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }
}
