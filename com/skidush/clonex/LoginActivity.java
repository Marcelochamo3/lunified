package com.skidush.clonex;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.skidush.clonex.LoginActivity;
import com.skidush.clonex.R;
import io.sentry.android.replay.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o.AbstractC0531Jn;
import o.AbstractC1016af;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1674hK;
import o.AbstractC1899jh0;
import o.AbstractC1910jn;
import o.AbstractC2051l80;
import o.AbstractC3409z9;
import o.Br0;
import o.C0323Bn;
import o.C0560Kq;
import o.C0856Wb;
import o.C1101bX;
import o.C1263d5;
import o.C1703hg0;
import o.C1767iF;
import o.C1791ib0;
import o.C1855j80;
import o.C1951k70;
import o.C2135m2;
import o.C2183md;
import o.C2439p80;
import o.C2523q2;
import o.C2743sL;
import o.C2879tm;
import o.DialogInterfaceC2619r2;
import o.E3;
import o.EL;
import o.Ec0;
import o.EnumC1706hi;
import o.HL;
import o.InterfaceC0473Hh;
import o.JL;
import o.Jp0;
import o.KL;
import o.LL;
import o.Lc0;
import o.ML;
import o.NL;
import o.OL;
import o.OV;
import o.PL;
import o.Pq0;
import o.QL;
import o.Qq0;
import o.RL;
import o.Rh0;
import o.Sq0;
import o.TL;
import o.TP;
import o.UL;
import o.VL;
import o.XL;
import o.zy0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LoginActivity extends E3 {
    public static final /* synthetic */ int Z = 0;
    public EditText J;
    public EditText K;
    public Button L;
    public ProgressBar M;
    public TextView N;
    public CheckBox O;
    public Button P;
    public OV Q;
    public SharedPreferences R;
    public PL S = LL.a;
    public C1703hg0 T;
    public Dialog U;
    public DialogInterfaceC2619r2 V;
    public boolean W;
    public C1703hg0 X;
    public boolean Y;

    public static final void A(LoginActivity loginActivity, C1101bX c1101bX) {
        if (c1101bX != null) {
            EditText editText = loginActivity.J;
            if (editText == null) {
                AbstractC1474fG.U("usernameEditText");
                throw null;
            }
            editText.setText((CharSequence) c1101bX.l);
            EditText editText2 = loginActivity.K;
            if (editText2 != null) {
                editText2.setText((CharSequence) c1101bX.m);
                return;
            } else {
                AbstractC1474fG.U("passwordEditText");
                throw null;
            }
        }
        SharedPreferences sharedPreferences = loginActivity.R;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("sharedPreferences");
            throw null;
        }
        String string = sharedPreferences.getString("email", null);
        if (string != null && string.length() != 0) {
            EditText editText3 = loginActivity.J;
            if (editText3 == null) {
                AbstractC1474fG.U("usernameEditText");
                throw null;
            }
            editText3.setText(string);
        }
        EditText editText4 = loginActivity.K;
        if (editText4 == null) {
            AbstractC1474fG.U("passwordEditText");
            throw null;
        }
        Editable text = editText4.getText();
        if (text != null) {
            text.clear();
        }
    }

    public static final boolean B(LoginActivity loginActivity) {
        EditText editText = loginActivity.J;
        if (editText == null) {
            AbstractC1474fG.U("usernameEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            EditText editText2 = loginActivity.K;
            if (editText2 == null) {
                AbstractC1474fG.U("passwordEditText");
                throw null;
            }
            Editable text2 = editText2.getText();
            if (text2 != null && text2.length() != 0) {
                loginActivity.I();
                return true;
            }
        }
        return false;
    }

    public static final void C(LoginActivity loginActivity, C1767iF c1767iF) {
        if (loginActivity.S instanceof OL) {
            C1703hg0 c1703hg0 = loginActivity.T;
            if (c1703hg0 != null) {
                c1703hg0.f(null);
            }
            loginActivity.L(true);
            loginActivity.T = AbstractC1376eG.w(AbstractC1459f50.y(loginActivity), null, 0, new RL(loginActivity, c1767iF, null), 3);
        }
    }

    public static final JL D(LoginActivity loginActivity, OV ov, C1951k70 c1951k70) throws Exception {
        JL jl;
        Object objK;
        loginActivity.getClass();
        JSONObject jSONObject = null;
        jSONObject = null;
        try {
            C1855j80 c1855j80G = ov.c(c1951k70).g();
            try {
                if (c1855j80G.f("Set-Cookie", null) != null) {
                    Ec0 ec0 = Ec0.a;
                    Ec0.h(loginActivity).edit().remove("session_cookie").apply();
                }
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                jl = new JL(c1855j80G.f840o, abstractC2051l80 != null ? abstractC2051l80.q() : null, null);
                AbstractC3409z9.g(c1855j80G, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.getMessage();
            jl = new JL(-1, null, e);
        }
        Throwable th3 = jl.c;
        if (th3 != null) {
            Exception exc = th3 instanceof Exception ? (Exception) th3 : null;
            if (exc != null) {
                throw exc;
            }
            throw new IOException("Fallo de transporte durante el login", th3);
        }
        Set setT = Lc0.T(403, 407, 408, 451);
        int i = jl.b;
        if (setT.contains(Integer.valueOf(i)) || i >= 500) {
            throw new IOException(AbstractC1674hK.p("Transporte de login bloqueado (HTTP ", i, ")"));
        }
        String str = jl.a;
        if (str != null) {
            if (!(true ^ AbstractC1899jh0.O(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    objK = new JSONObject(str);
                } catch (Throwable th4) {
                    objK = Jp0.k(th4);
                }
                jSONObject = (JSONObject) (objK instanceof C2439p80 ? null : objK);
            }
        }
        if (jSONObject == null || !(i == 429 || jSONObject.has("success"))) {
            throw new IOException("El transporte no devolvió JSON de login válido");
        }
        return jl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object E(LoginActivity loginActivity, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        UL ul;
        loginActivity.getClass();
        if (interfaceC0473Hh instanceof UL) {
            ul = (UL) interfaceC0473Hh;
            int i = ul.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul.n = i - Integer.MIN_VALUE;
            } else {
                ul = new UL(loginActivity, interfaceC0473Hh);
            }
        } else {
            ul = new UL(loginActivity, interfaceC0473Hh);
        }
        Object objC = ul.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = ul.n;
        try {
            if (i2 == 0) {
                Jp0.O(objC);
                String str3 = C1263d5.a;
                C0856Wb c0856Wb = C0856Wb.a;
                VL vl = new VL(loginActivity, str3, str, str2, null, 0);
                VL vl2 = new VL(loginActivity, str3, str, str2, null, 1);
                ul.n = 1;
                objC = c0856Wb.c("login", true, vl, vl2, ul);
                if (objC == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objC);
            }
            return (JL) objC;
        } catch (Exception e) {
            return new JL(-1, null, e);
        }
    }

    public static final C1951k70 F(LoginActivity loginActivity, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("usuario", str2);
        jSONObject.put("contrasena", str3);
        jSONObject.put("check_only", true);
        Rh0 rh0 = C2879tm.a;
        for (Map.Entry entry : C2879tm.c().entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("device_label", AbstractC1474fG.q(loginActivity));
        jSONObject.put("install_id", AbstractC1474fG.D(loginActivity));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json")));
        return c0560Kq.c();
    }

    public static String G(KL kl, int i) {
        String str = kl.b;
        if (!AbstractC1899jh0.O(str)) {
            return str;
        }
        if (AbstractC1474fG.b(kl.e, Boolean.FALSE)) {
            return "Tu cuenta esta inactiva o vencida.";
        }
        if (kl.f) {
            return "La sesion fue rechazada por el servidor.";
        }
        String str2 = kl.d;
        if (AbstractC1474fG.b(str2, "DEVICE_LIMIT_REACHED")) {
            return "No hay mas perfiles disponibles para este usuario.";
        }
        return AbstractC1474fG.b(str2, "DEVICE_NOT_AUTHORIZED") ? "Dispositivo no autorizado para esta cuenta." : AbstractC1674hK.p("No se pudo iniciar sesion (HTTP ", i, ")");
    }

    public static KL J(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("success", false);
        String strOptString = jSONObject.optString("message");
        String str = strOptString == null ? "" : strOptString;
        String strOptString2 = jSONObject.optString("session_status");
        if (strOptString2 == null) {
            strOptString2 = "";
        }
        String lowerCase = strOptString2.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String strOptString3 = jSONObject.optString("reason_code");
        String str2 = strOptString3 == null ? "" : strOptString3;
        Object objOpt = jSONObject.opt("account_active");
        Boolean boolValueOf = null;
        if (objOpt != null) {
            if (objOpt instanceof Boolean) {
                boolValueOf = (Boolean) objOpt;
            } else {
                if (objOpt instanceof String) {
                    boolValueOf = Boolean.valueOf(AbstractC1899jh0.N((String) objOpt, "true", true));
                } else if (objOpt instanceof Number) {
                    boolValueOf = Boolean.valueOf(((Number) objOpt).intValue() != 0);
                }
            }
        }
        return new KL(zOptBoolean, str, lowerCase, str2, boolValueOf, jSONObject.optBoolean("force_logout", false));
    }

    public final void H() {
        C1703hg0 c1703hg0 = this.T;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        Dialog dialog = this.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.U = null;
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = this.V;
        if (dialogInterfaceC2619r2 != null) {
            dialogInterfaceC2619r2.dismiss();
        }
        this.V = null;
        this.W = false;
        this.S = LL.a;
        K(false);
        ProgressBar progressBar = this.M;
        if (progressBar == null) {
            AbstractC1474fG.U("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.N;
        if (textView == null) {
            AbstractC1474fG.U("loadingText");
            throw null;
        }
        textView.setText(R.string.login_checking_update);
        TextView textView2 = this.N;
        if (textView2 == null) {
            AbstractC1474fG.U("loadingText");
            throw null;
        }
        textView2.setVisibility(0);
        this.T = AbstractC1376eG.w(AbstractC1459f50.y(this), null, 0, new QL(this, true, null), 3);
    }

    public final void I() {
        PL pl = this.S;
        NL nl = NL.a;
        if (!AbstractC1474fG.b(pl, nl)) {
            if (AbstractC1474fG.b(pl, LL.a)) {
                return;
            }
            if (pl instanceof OL) {
                N(((OL) pl).a);
                return;
            } else if (pl instanceof ML) {
                Throwable th = ((ML) pl).a;
                O();
                return;
            }
        }
        EditText editText = this.J;
        if (editText == null) {
            AbstractC1474fG.U("usernameEditText");
            throw null;
        }
        String string = editText.getText().toString();
        EditText editText2 = this.K;
        if (editText2 == null) {
            AbstractC1474fG.U("passwordEditText");
            throw null;
        }
        String string2 = editText2.getText().toString();
        if (string.length() <= 0 || string2.length() <= 0) {
            Toast.makeText(getApplicationContext(), "Por favor, ingrese usuario y contraseña", 0).show();
            return;
        }
        if (AbstractC1474fG.b(this.S, nl)) {
            ProgressBar progressBar = this.M;
            if (progressBar == null) {
                AbstractC1474fG.U("progressBar");
                throw null;
            }
            progressBar.setVisibility(0);
            TextView textView = this.N;
            if (textView == null) {
                AbstractC1474fG.U("loadingText");
                throw null;
            }
            textView.setText(R.string.login_signing_in);
            TextView textView2 = this.N;
            if (textView2 == null) {
                AbstractC1474fG.U("loadingText");
                throw null;
            }
            textView2.setVisibility(0);
            AbstractC1376eG.w(zy0.c(AbstractC1910jn.b), null, 0, new TL(this, string, string2, null), 3);
        }
    }

    public final void K(boolean z) {
        EditText editText = this.J;
        if (editText == null) {
            AbstractC1474fG.U("usernameEditText");
            throw null;
        }
        editText.setEnabled(z);
        EditText editText2 = this.K;
        if (editText2 == null) {
            AbstractC1474fG.U("passwordEditText");
            throw null;
        }
        editText2.setEnabled(z);
        CheckBox checkBox = this.O;
        if (checkBox == null) {
            AbstractC1474fG.U("cbShowPassword");
            throw null;
        }
        checkBox.setEnabled(z);
        Button button = this.L;
        if (button == null) {
            AbstractC1474fG.U("loginButton");
            throw null;
        }
        button.setEnabled(z);
        Button button2 = this.P;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            AbstractC1474fG.U("dnsButton");
            throw null;
        }
    }

    public final void L(boolean z) {
        Button button;
        Dialog dialog = this.U;
        if (dialog instanceof Qq0) {
            ((ProgressBar) ((Qq0) dialog).l.f414o).setVisibility(z ? 0 : 8);
        } else if (dialog instanceof Sq0) {
            ((ProgressBar) ((Sq0) dialog).l.f941o).setVisibility(z ? 0 : 8);
        }
        Dialog dialog2 = this.U;
        if (dialog2 == null || (button = (Button) dialog2.findViewById(R.id.btn_update)) == null) {
            return;
        }
        button.setEnabled(!z);
        if (z) {
            return;
        }
        button.requestFocus();
    }

    public final void M() {
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        final List<AbstractC0531Jn> listD = C0323Bn.d();
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listD, 10));
        for (AbstractC0531Jn abstractC0531Jn : listD) {
            arrayList.add(abstractC0531Jn.b + " • " + abstractC0531Jn.c);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Iterator it = listD.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            String str = ((AbstractC0531Jn) it.next()).a;
            ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
            if (AbstractC1474fG.b(str, C0323Bn.d.a)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        C2523q2 c2523q2 = new C2523q2(this);
        C2135m2 c2135m2 = c2523q2.a;
        c2135m2.d = c2135m2.a.getText(R.string.login_dns_dialog_title);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: o.IL
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                List list = listD;
                LoginActivity loginActivity = this;
                int i3 = LoginActivity.Z;
                AbstractC1474fG.j(list, "$providers");
                AbstractC1474fG.j(loginActivity, "this$0");
                AbstractC0531Jn abstractC0531Jn2 = (AbstractC0531Jn) list.get(i2);
                ConcurrentHashMap concurrentHashMap3 = C0323Bn.a;
                C0323Bn.j(abstractC0531Jn2);
                C0856Wb.b = 0L;
                C1791ib0 c1791ib0 = C1791ib0.a;
                loginActivity.Q = C1791ib0.d(false);
                loginActivity.P();
                Toast.makeText(loginActivity, loginActivity.getString(R.string.login_dns_selected, abstractC0531Jn2.b), 0).show();
                if (loginActivity.Y) {
                    PL pl = loginActivity.S;
                    if ((pl instanceof ML) || (pl instanceof LL) || (pl instanceof OL)) {
                        loginActivity.H();
                    }
                }
                dialogInterface.dismiss();
            }
        };
        C2135m2 c2135m3 = c2523q2.a;
        c2135m3.m = strArr;
        c2135m3.f907o = onClickListener;
        c2135m3.t = iIntValue;
        c2135m3.s = true;
        c2523q2.setNegativeButton(android.R.string.cancel, null).create().show();
    }

    public final void N(C1767iF c1767iF) {
        Dialog dialog;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        Dialog dialog2 = this.U;
        if (dialog2 == null || !dialog2.isShowing()) {
            if (zy0.B(this) == Br0.TV) {
                Sq0 sq0 = new Sq0(this, c1767iF);
                ((Button) sq0.l.n).setOnClickListener(new Pq0(1, new p(sq0, this, c1767iF, 2)));
                dialog = sq0;
            } else {
                Qq0 qq0 = new Qq0(this, c1767iF);
                ((Button) qq0.l.n).setOnClickListener(new Pq0(0, new p(qq0, this, c1767iF, 3)));
                dialog = qq0;
            }
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            Button button = (Button) dialog.findViewById(R.id.btn_update_cancel);
            if (button != null) {
                button.setVisibility(0);
                button.setText(R.string.login_change_dns);
                button.setOnClickListener(new EL(this, 0));
            }
            TextView textView = (TextView) dialog.findViewById(R.id.tv_update_message);
            if (textView != null) {
                textView.setText(R.string.login_update_required_message);
            }
            TextView textView2 = (TextView) dialog.findViewById(R.id.tv_update_release_notes);
            if (textView2 != null) {
                textView2.setMaxLines(6);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.U = dialog;
            dialog.show();
            Button button2 = (Button) dialog.findViewById(R.id.btn_update);
            if (button2 != null) {
                button2.requestFocus();
            }
        }
    }

    public final void O() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = this.V;
        if (dialogInterfaceC2619r2 == null || !dialogInterfaceC2619r2.isShowing()) {
            C2523q2 c2523q2 = new C2523q2(this);
            C2135m2 c2135m2 = c2523q2.a;
            c2135m2.d = c2135m2.a.getText(R.string.login_update_check_error_title);
            c2135m2.f = c2135m2.a.getText(R.string.login_update_check_error_message);
            final int i = 0;
            C2523q2 positiveButton = c2523q2.setPositiveButton(R.string.loading_error_retry, new DialogInterface.OnClickListener(this) { // from class: o.GL
                public final /* synthetic */ LoginActivity m;

                {
                    this.m = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    LoginActivity loginActivity = this.m;
                    switch (i) {
                        case 0:
                            int i3 = LoginActivity.Z;
                            AbstractC1474fG.j(loginActivity, "this$0");
                            loginActivity.H();
                            break;
                        default:
                            int i4 = LoginActivity.Z;
                            AbstractC1474fG.j(loginActivity, "this$0");
                            loginActivity.M();
                            break;
                    }
                }
            });
            final int i2 = 1;
            C2523q2 negativeButton = positiveButton.setNegativeButton(R.string.login_change_dns, new DialogInterface.OnClickListener(this) { // from class: o.GL
                public final /* synthetic */ LoginActivity m;

                {
                    this.m = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    LoginActivity loginActivity = this.m;
                    switch (i2) {
                        case 0:
                            int i4 = LoginActivity.Z;
                            AbstractC1474fG.j(loginActivity, "this$0");
                            loginActivity.H();
                            break;
                        default:
                            int i5 = LoginActivity.Z;
                            AbstractC1474fG.j(loginActivity, "this$0");
                            loginActivity.M();
                            break;
                    }
                }
            });
            negativeButton.a.k = false;
            DialogInterfaceC2619r2 dialogInterfaceC2619r2Create = negativeButton.create();
            dialogInterfaceC2619r2Create.setCanceledOnTouchOutside(false);
            dialogInterfaceC2619r2Create.setOnShowListener(new HL(0, dialogInterfaceC2619r2Create));
            dialogInterfaceC2619r2Create.show();
            this.V = dialogInterfaceC2619r2Create;
        }
    }

    public final void P() {
        Button button = this.P;
        if (button == null) {
            AbstractC1474fG.U("dnsButton");
            throw null;
        }
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        button.setText("Problemas de conexion? DNS: " + C0323Bn.d.b);
    }

    @Override // o.AbstractActivityC1540fx, o.AbstractActivityC1116bg, o.AbstractActivityC1018ag, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        super.onCreate(bundle);
        setContentView(R.layout.activity_login);
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.e(this);
        getWindow().getDecorView().setSystemUiVisibility(3846);
        String str = C0323Bn.d.b;
        View viewFindViewById = findViewById(R.id.editTextUsername);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.J = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.editTextPassword);
        AbstractC1474fG.i(viewFindViewById2, "findViewById(...)");
        this.K = (EditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.btnLogin);
        AbstractC1474fG.i(viewFindViewById3, "findViewById(...)");
        this.L = (Button) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.progressBar);
        AbstractC1474fG.i(viewFindViewById4, "findViewById(...)");
        this.M = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.loadingText);
        AbstractC1474fG.i(viewFindViewById5, "findViewById(...)");
        this.N = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.cbShowPassword);
        AbstractC1474fG.i(viewFindViewById6, "findViewById(...)");
        this.O = (CheckBox) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.btnSelectDns);
        AbstractC1474fG.i(viewFindViewById7, "findViewById(...)");
        this.P = (Button) viewFindViewById7;
        ((TextView) findViewById(R.id.loginVersion)).setText(getString(R.string.login_installed_version, "5.6.5", 150));
        CheckBox checkBox = this.O;
        if (checkBox == null) {
            AbstractC1474fG.U("cbShowPassword");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new C2183md(i3, this));
        Ec0 ec0 = Ec0.a;
        this.R = Ec0.h(this);
        C1791ib0 c1791ib0 = C1791ib0.a;
        this.Q = C1791ib0.d(false);
        P();
        Button button = this.P;
        if (button == null) {
            AbstractC1474fG.U("dnsButton");
            throw null;
        }
        button.setOnClickListener(new EL(this, i));
        Button button2 = this.P;
        if (button2 == null) {
            AbstractC1474fG.U("dnsButton");
            throw null;
        }
        button2.setOnKeyListener(new View.OnKeyListener(this) { // from class: o.FL
            public final /* synthetic */ LoginActivity m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                LoginActivity loginActivity = this.m;
                switch (i3) {
                    case 0:
                        int i5 = LoginActivity.Z;
                        AbstractC1474fG.j(loginActivity, "this$0");
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        if (i4 != 23 && i4 != 66) {
                            return false;
                        }
                        loginActivity.I();
                        return true;
                    default:
                        int i6 = LoginActivity.Z;
                        AbstractC1474fG.j(loginActivity, "this$0");
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        if (i4 != 23 && i4 != 66) {
                            return false;
                        }
                        loginActivity.M();
                        return true;
                }
            }
        });
        Button button3 = this.L;
        if (button3 == null) {
            AbstractC1474fG.U("loginButton");
            throw null;
        }
        button3.setFocusable(true);
        Button button4 = this.L;
        if (button4 == null) {
            AbstractC1474fG.U("loginButton");
            throw null;
        }
        button4.setFocusableInTouchMode(true);
        Button button5 = this.L;
        if (button5 == null) {
            AbstractC1474fG.U("loginButton");
            throw null;
        }
        button5.setOnKeyListener(new View.OnKeyListener(this) { // from class: o.FL
            public final /* synthetic */ LoginActivity m;

            {
                this.m = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                LoginActivity loginActivity = this.m;
                switch (i2) {
                    case 0:
                        int i5 = LoginActivity.Z;
                        AbstractC1474fG.j(loginActivity, "this$0");
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        if (i4 != 23 && i4 != 66) {
                            return false;
                        }
                        loginActivity.I();
                        return true;
                    default:
                        int i6 = LoginActivity.Z;
                        AbstractC1474fG.j(loginActivity, "this$0");
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        if (i4 != 23 && i4 != 66) {
                            return false;
                        }
                        loginActivity.M();
                        return true;
                }
            }
        });
        Button button6 = this.L;
        if (button6 == null) {
            AbstractC1474fG.U("loginButton");
            throw null;
        }
        button6.setOnClickListener(new EL(this, i3));
        C1703hg0 c1703hg0 = this.X;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.Y = false;
        this.S = LL.a;
        K(false);
        ProgressBar progressBar = this.M;
        if (progressBar == null) {
            AbstractC1474fG.U("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.N;
        if (textView == null) {
            AbstractC1474fG.U("loadingText");
            throw null;
        }
        textView.setText(R.string.login_preparing_security);
        TextView textView2 = this.N;
        if (textView2 == null) {
            AbstractC1474fG.U("loadingText");
            throw null;
        }
        textView2.setVisibility(0);
        this.X = AbstractC1376eG.w(AbstractC1459f50.y(this), null, 0, new XL(this, null), 3);
    }

    @Override // o.E3, o.AbstractActivityC1540fx, android.app.Activity
    public final void onDestroy() {
        DialogInterfaceC2619r2 dialogInterfaceC2619r2 = this.V;
        if (dialogInterfaceC2619r2 != null) {
            dialogInterfaceC2619r2.dismiss();
        }
        this.V = null;
        Dialog dialog = this.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.U = null;
        super.onDestroy();
    }

    @Override // o.AbstractActivityC1540fx, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.W) {
            H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }
}
