package o;

/* JADX INFO: renamed from: o.lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2099lj0 implements InterfaceC2727s70, InterfaceC2049l70 {
    public final InterfaceC2727s70 a;
    public final Object b;
    public volatile InterfaceC2049l70 c;
    public volatile InterfaceC2049l70 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public C2099lj0(Object obj, InterfaceC2727s70 interfaceC2727s70) {
        this.b = obj;
        this.a = interfaceC2727s70;
    }

    @Override // o.InterfaceC2727s70, o.InterfaceC2049l70
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final InterfaceC2727s70 b() {
        InterfaceC2727s70 interfaceC2727s70B;
        synchronized (this.b) {
            try {
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                interfaceC2727s70B = interfaceC2727s70 != null ? interfaceC2727s70.b() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2727s70B;
    }

    @Override // o.InterfaceC2727s70
    public final void c(InterfaceC2049l70 interfaceC2049l70) {
        synchronized (this.b) {
            try {
                if (!interfaceC2049l70.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                if (interfaceC2727s70 != null) {
                    interfaceC2727s70.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final boolean e(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                z = (interfaceC2727s70 == null || interfaceC2727s70.e(this)) && (interfaceC2049l70.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2049l70
    public final void f() {
        synchronized (this.b) {
            try {
                if (!AbstractC1674hK.h(this.f)) {
                    this.f = 2;
                    this.d.f();
                }
                if (!AbstractC1674hK.h(this.e)) {
                    this.e = 2;
                    this.c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean g(InterfaceC2049l70 interfaceC2049l70) {
        if (!(interfaceC2049l70 instanceof C2099lj0)) {
            return false;
        }
        C2099lj0 c2099lj0 = (C2099lj0) interfaceC2049l70;
        if (this.c == null) {
            if (c2099lj0.c != null) {
                return false;
            }
        } else if (!this.c.g(c2099lj0.c)) {
            return false;
        }
        if (this.d == null) {
            if (c2099lj0.d != null) {
                return false;
            }
        } else if (!this.d.g(c2099lj0.d)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC2727s70
    public final boolean h(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                z = (interfaceC2727s70 == null || interfaceC2727s70.h(this)) && interfaceC2049l70.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2049l70
    public final void i() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.i();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.i();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final void j(InterfaceC2049l70 interfaceC2049l70) {
        synchronized (this.b) {
            try {
                if (interfaceC2049l70.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                if (interfaceC2727s70 != null) {
                    interfaceC2727s70.j(this);
                }
                if (!AbstractC1674hK.h(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // o.InterfaceC2727s70
    public final boolean l(InterfaceC2049l70 interfaceC2049l70) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC2727s70 interfaceC2727s70 = this.a;
                z = (interfaceC2727s70 == null || interfaceC2727s70.l(this)) && interfaceC2049l70.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
