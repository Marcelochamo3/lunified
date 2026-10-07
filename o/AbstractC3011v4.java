package o;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: o.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3011v4 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1410eh c2133m1;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c2133m1 = new C2133m1(clipData, 3);
            } else {
                C1508fh c1508fh = new C1508fh();
                c1508fh.m = clipData;
                c1508fh.n = 3;
                c2133m1 = c1508fh;
            }
            It0.l(textView, c2133m1.f());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1410eh c2133m1;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c2133m1 = new C2133m1(clipData, 3);
        } else {
            C1508fh c1508fh = new C1508fh();
            c1508fh.m = clipData;
            c1508fh.n = 3;
            c2133m1 = c1508fh;
        }
        It0.l(view, c2133m1.f());
        return true;
    }
}
