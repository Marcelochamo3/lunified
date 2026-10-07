package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.skidush.clonex.R;
import java.util.Random;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class Pg0 extends EditText {
    public static final Pattern q = Pattern.compile("\\S+");
    public static final C3441zc r = new C3441zc(Integer.class, "streamPosition", 8);
    public final Random l;
    public Bitmap m;
    public Bitmap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f459o;
    public ObjectAnimator p;

    public Pg0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.TextAppearance_Leanback_SearchTextEdit);
        this.l = new Random();
    }

    public int getStreamPosition() {
        return this.f459o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_one);
        this.m = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) (bitmapDecodeResource.getWidth() * 1.3f), (int) (bitmapDecodeResource.getHeight() * 1.3f), false);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_two);
        this.n = Bitmap.createScaledBitmap(bitmapDecodeResource2, (int) (bitmapDecodeResource2.getWidth() * 1.3f), (int) (bitmapDecodeResource2.getHeight() * 1.3f), false);
        this.f459o = -1;
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("o.Pg0");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }

    public void setStreamPosition(int i) {
        this.f459o = i;
        invalidate();
    }
}
