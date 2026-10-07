package o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class K6 {
    private static final AbstractC1571gF a() {
        C1375eF c1375eF = new C1375eF();
        Integer[] numArr = {8, 7};
        AbstractC3045vW.i(2, numArr);
        c1375eF.f(c1375eF.b + 2);
        System.arraycopy(numArr, 0, c1375eF.a, c1375eF.b, 2);
        c1375eF.b += 2;
        int i = Lr0.a;
        if (i >= 31) {
            Integer[] numArr2 = {26, 27};
            AbstractC3045vW.i(2, numArr2);
            c1375eF.f(c1375eF.b + 2);
            System.arraycopy(numArr2, 0, c1375eF.a, c1375eF.b, 2);
            c1375eF.b += 2;
        }
        if (i >= 33) {
            c1375eF.a(30);
        }
        return c1375eF.h();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        AbstractC1571gF abstractC1571gFA = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC1571gFA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
