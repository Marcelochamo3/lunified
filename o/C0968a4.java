package o;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: renamed from: o.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968a4 extends AbstractC1163c4 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ LayoutInflaterFactory2C1456f4 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0968a4(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, RN rn) {
        super(layoutInflaterFactory2C1456f4);
        this.d = layoutInflaterFactory2C1456f4;
        this.e = rn;
    }

    @Override // o.AbstractC1163c4
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // o.AbstractC1163c4
    public final int e() {
        Location lastKnownLocation;
        boolean z;
        long j;
        switch (this.c) {
            case 0:
                return V3.a((PowerManager) this.e) ? 2 : 1;
            default:
                RN rn = (RN) this.e;
                C2305np0 c2305np0 = (C2305np0) rn.f488o;
                if (c2305np0.b > System.currentTimeMillis()) {
                    z = c2305np0.a;
                } else {
                    Context context = (Context) rn.m;
                    int iF = UK.f(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) rn.n;
                    if (iF == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (UK.f(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (J8.e == null) {
                            J8.e = new J8();
                        }
                        J8 j8 = J8.e;
                        j8.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        j8.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z = j8.c == 1;
                        long j2 = j8.b;
                        long j3 = j8.a;
                        j8.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
                        long j4 = j8.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        c2305np0.a = z;
                        c2305np0.b = j;
                    } else {
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // o.AbstractC1163c4
    public final void k() {
        switch (this.c) {
            case 0:
                this.d.j(true, true);
                break;
            default:
                this.d.j(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0968a4(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, Context context) {
        super(layoutInflaterFactory2C1456f4);
        this.d = layoutInflaterFactory2C1456f4;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
