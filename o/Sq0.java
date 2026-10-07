package o;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class Sq0 extends Dialog {
    public final C2303no0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sq0(Context context, C1767iF c1767iF) {
        super(context);
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(c1767iF, "release");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_update_app_tv, (ViewGroup) null, false);
        int i = R.id.barrier1;
        if (((Barrier) Sr0.g(viewInflate, R.id.barrier1)) != null) {
            i = R.id.btn_update;
            Button button = (Button) Sr0.g(viewInflate, R.id.btn_update);
            if (button != null) {
                i = R.id.btn_update_cancel;
                Button button2 = (Button) Sr0.g(viewInflate, R.id.btn_update_cancel);
                if (button2 != null) {
                    i = R.id.btn_update_release_notes;
                    Button button3 = (Button) Sr0.g(viewInflate, R.id.btn_update_release_notes);
                    if (button3 != null) {
                        i = R.id.iv_update_arrow;
                        if (((ImageView) Sr0.g(viewInflate, R.id.iv_update_arrow)) != null) {
                            i = R.id.pb_update_is_loading;
                            ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_update_is_loading);
                            if (progressBar != null) {
                                i = R.id.tv_update_current_version;
                                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_update_current_version);
                                if (textView != null) {
                                    i = R.id.tv_update_current_version_label;
                                    if (((TextView) Sr0.g(viewInflate, R.id.tv_update_current_version_label)) != null) {
                                        i = R.id.tv_update_message;
                                        if (((TextView) Sr0.g(viewInflate, R.id.tv_update_message)) != null) {
                                            i = R.id.tv_update_new_version;
                                            TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.tv_update_new_version);
                                            if (textView2 != null) {
                                                i = R.id.tv_update_new_version_label;
                                                if (((TextView) Sr0.g(viewInflate, R.id.tv_update_new_version_label)) != null) {
                                                    i = R.id.tv_update_release_notes;
                                                    TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.tv_update_release_notes);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_update_title;
                                                        if (((TextView) Sr0.g(viewInflate, R.id.tv_update_title)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            this.l = new C2303no0(constraintLayout, button, button2, button3, progressBar, textView, textView2, textView3);
                                                            setContentView(constraintLayout);
                                                            textView.setText("5.6.5");
                                                            textView2.setText(c1767iF.b);
                                                            textView3.setText(c1767iF.e);
                                                            final int i2 = 0;
                                                            button3.setOnClickListener(new View.OnClickListener(this) { // from class: o.Rq0
                                                                public final /* synthetic */ Sq0 m;

                                                                {
                                                                    this.m = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i2) {
                                                                        case 0:
                                                                            Sq0 sq0 = this.m;
                                                                            AbstractC1474fG.j(sq0, "this$0");
                                                                            C2303no0 c2303no0 = sq0.l;
                                                                            TextView textView4 = (TextView) c2303no0.p;
                                                                            AbstractC1474fG.i(textView4, "tvUpdateReleaseNotes");
                                                                            TextView textView5 = (TextView) c2303no0.p;
                                                                            AbstractC1474fG.i(textView5, "tvUpdateReleaseNotes");
                                                                            textView4.setVisibility((textView5.getVisibility() == 0) ^ true ? 0 : 8);
                                                                            break;
                                                                        default:
                                                                            Sq0 sq1 = this.m;
                                                                            AbstractC1474fG.j(sq1, "this$0");
                                                                            sq1.hide();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            final int i3 = 1;
                                                            button2.setOnClickListener(new View.OnClickListener(this) { // from class: o.Rq0
                                                                public final /* synthetic */ Sq0 m;

                                                                {
                                                                    this.m = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i3) {
                                                                        case 0:
                                                                            Sq0 sq0 = this.m;
                                                                            AbstractC1474fG.j(sq0, "this$0");
                                                                            C2303no0 c2303no0 = sq0.l;
                                                                            TextView textView4 = (TextView) c2303no0.p;
                                                                            AbstractC1474fG.i(textView4, "tvUpdateReleaseNotes");
                                                                            TextView textView5 = (TextView) c2303no0.p;
                                                                            AbstractC1474fG.i(textView5, "tvUpdateReleaseNotes");
                                                                            textView4.setVisibility((textView5.getVisibility() == 0) ^ true ? 0 : 8);
                                                                            break;
                                                                        default:
                                                                            Sq0 sq1 = this.m;
                                                                            AbstractC1474fG.j(sq1, "this$0");
                                                                            sq1.hide();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            button.requestFocus();
                                                            Window window = getWindow();
                                                            if (window != null) {
                                                                window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.55d), -2);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
