package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: o.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1066b4 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1066b4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((AbstractC1163c4) this.b).k();
                break;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    Q6.a((Q6) this.b, M6.c(context, intent));
                }
                break;
            case 2:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Lr0.a >= 29) {
                                            i = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Lr0.a >= 29) {
                                            i = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            } else {
                                i = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i2 = Lr0.a;
                QU qu = (QU) this.b;
                if (i2 < 31 || i != 5) {
                    QU.a(qu, i);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        PU pu = new PU(qu);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), pu);
                        telephonyManager.unregisterTelephonyCallback(pu);
                    } catch (RuntimeException unused2) {
                        QU.a(qu, 5);
                        return;
                    }
                }
                break;
            default:
                C1699he0 c1699he0 = (C1699he0) this.b;
                c1699he0.getClass();
                C1699he0.g.execute(new RunnableC1601ge0(c1699he0, 2));
                break;
        }
    }
}
