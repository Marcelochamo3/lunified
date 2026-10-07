package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.skidush.clonex.R;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2978un extends AbstractComponentCallbacksC1247cx {
    public RadioGroup l0;
    public TextView m0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_dns_config_mobile, viewGroup, false);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        View viewFindViewById = view.findViewById(R.id.dns_radio_group);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.l0 = (RadioGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.dns_description);
        AbstractC1474fG.i(viewFindViewById2, "findViewById(...)");
        this.m0 = (TextView) viewFindViewById2;
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        AbstractC0531Jn abstractC0531Jn = C0323Bn.d;
        for (AbstractC0531Jn abstractC0531Jn2 : C0323Bn.d()) {
            RadioButton radioButton = new RadioButton(Q());
            radioButton.setId(View.generateViewId());
            radioButton.setText(abstractC0531Jn2.b);
            radioButton.setTag(abstractC0531Jn2);
            radioButton.setChecked(AbstractC1474fG.b(abstractC0531Jn2.a, abstractC0531Jn.a));
            radioButton.setTextSize(16.0f);
            radioButton.setPadding(16, 16, 16, 16);
            RadioGroup radioGroup = this.l0;
            if (radioGroup == null) {
                AbstractC1474fG.U("radioGroup");
                throw null;
            }
            radioGroup.addView(radioButton);
            if (radioButton.isChecked()) {
                TextView textView = this.m0;
                if (textView == null) {
                    AbstractC1474fG.U("descriptionText");
                    throw null;
                }
                textView.setText(abstractC0531Jn2.c);
            }
        }
        RadioGroup radioGroup2 = this.l0;
        if (radioGroup2 == null) {
            AbstractC1474fG.U("radioGroup");
            throw null;
        }
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.tn
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                C2978un c2978un = this.a;
                AbstractC1474fG.j(c2978un, "this$0");
                RadioButton radioButton2 = (RadioButton) radioGroup3.findViewById(i);
                Object tag = radioButton2 != null ? radioButton2.getTag() : null;
                AbstractC0531Jn abstractC0531Jn3 = tag instanceof AbstractC0531Jn ? (AbstractC0531Jn) tag : null;
                if (abstractC0531Jn3 != null) {
                    TextView textView2 = c2978un.m0;
                    if (textView2 == null) {
                        AbstractC1474fG.U("descriptionText");
                        throw null;
                    }
                    textView2.setText(abstractC0531Jn3.c);
                    ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                    C0323Bn.j(abstractC0531Jn3);
                    Toast.makeText(c2978un.Q(), "DNS configurado: " + abstractC0531Jn3.b, 0).show();
                }
            }
        });
    }
}
