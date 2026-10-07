package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import o.InterfaceC2195mj;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC2195mj {
    public final ParcelFileDescriptorRewinder$InternalRewinder l;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.l = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // o.InterfaceC2195mj
    public final void a() {
    }

    public final ParcelFileDescriptor b() {
        return this.l.rewind();
    }

    @Override // o.InterfaceC2195mj
    public final Object f() {
        return this.l.rewind();
    }
}
