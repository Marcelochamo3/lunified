package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: renamed from: o.Hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0481Hp implements DefaultLifecycleObserver {
    public final /* synthetic */ C1478fK l;
    public final /* synthetic */ EmojiCompatInitializer m;

    public C0481Hp(EmojiCompatInitializer emojiCompatInitializer, C1478fK c1478fK) {
        this.m = emojiCompatInitializer;
        this.l = c1478fK;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.a(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.b(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.c(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1283dK interfaceC1283dK) {
        this.m.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC1994kg.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0559Kp(), 500L);
        this.l.f(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.e(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.f(this, interfaceC1283dK);
    }
}
