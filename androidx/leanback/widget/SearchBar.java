package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skidush.clonex.R;
import o.C1007aa0;
import o.C1105ba0;
import o.C2469pa0;
import o.InterfaceC1202ca0;
import o.InterfaceC1300da0;
import o.InterfaceC3351yf0;
import o.L80;
import o.X90;
import o.Y90;
import o.Z0;
import o.Z90;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends RelativeLayout {
    public static final /* synthetic */ int I = 0;
    public final int A;
    public final int B;
    public SpeechRecognizer C;
    public boolean D;
    public SoundPool E;
    public final SparseIntArray F;
    public boolean G;
    public final Context H;
    public SearchEditText l;
    public SpeechOrbView m;
    public ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f24o;
    public String p;
    public String q;
    public Drawable r;
    public final Handler s;
    public final InputMethodManager t;
    public boolean u;
    public Drawable v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = new Handler();
        this.u = false;
        this.F = new SparseIntArray();
        this.G = false;
        this.H = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f24o = "";
        this.t = (InputMethodManager) context.getSystemService("input_method");
        this.x = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.w = resources.getColor(R.color.lb_search_bar_text);
        this.B = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.A = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.z = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.y = resources.getColor(R.color.lb_search_bar_hint);
    }

    public final void a() {
        if (this.G) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.C == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
        }
        this.G = true;
        this.l.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.C.setRecognitionListener(new C1105ba0(this));
        this.D = true;
        this.C.startListening(intent);
    }

    public final void b() {
        if (this.G) {
            this.l.setText(this.f24o);
            this.l.setHint(this.p);
            this.G = false;
            if (this.C == null) {
                return;
            }
            this.m.c();
            if (this.D) {
                this.C.cancel();
                this.D = false;
            }
            this.C.setRecognitionListener(null);
        }
    }

    public final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.q)) {
            string = this.m.isFocused() ? getResources().getString(R.string.lb_search_bar_hint_with_title_speech, this.q) : getResources().getString(R.string.lb_search_bar_hint_with_title, this.q);
        } else if (this.m.isFocused()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.p = string;
        SearchEditText searchEditText = this.l;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.v.setAlpha(this.B);
            boolean zIsFocused = this.m.isFocused();
            int i = this.z;
            if (zIsFocused) {
                this.l.setTextColor(i);
                this.l.setHintTextColor(i);
            } else {
                this.l.setTextColor(this.x);
                this.l.setHintTextColor(i);
            }
        } else {
            this.v.setAlpha(this.A);
            this.l.setTextColor(this.w);
            this.l.setHintTextColor(this.y);
        }
        c();
    }

    public Drawable getBadgeDrawable() {
        return this.r;
    }

    public CharSequence getHint() {
        return this.p;
    }

    public String getTitle() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            this.F.put(i2, this.E.load(this.H, i2, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        this.E.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.v = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.l = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.n = imageView;
        Drawable drawable = this.r;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.l.setOnFocusChangeListener(new X90(this, 0));
        this.l.addTextChangedListener(new Z90(this, new Y90(this, 0)));
        this.l.setOnKeyboardDismissListener(new L80((Object) this));
        this.l.setOnEditorActionListener(new C1007aa0(this));
        this.l.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.m = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new Z0(6, this));
        this.m.setOnFocusChangeListener(new X90(this, 1));
        d(hasFocus());
        c();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.r = drawable;
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i) {
        this.m.setNextFocusDownId(i);
        this.l.setNextFocusDownId(i);
    }

    public void setSearchAffordanceColors(C2469pa0 c2469pa0) {
        SpeechOrbView speechOrbView = this.m;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(c2469pa0);
        }
    }

    public void setSearchAffordanceColorsInListening(C2469pa0 c2469pa0) {
        SpeechOrbView speechOrbView = this.m;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(c2469pa0);
        }
    }

    public void setSearchQuery(String str) {
        b();
        this.l.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f24o, str)) {
            return;
        }
        this.f24o = str;
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        b();
        SpeechRecognizer speechRecognizer2 = this.C;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.D) {
                this.C.cancel();
                this.D = false;
            }
        }
        this.C = speechRecognizer;
    }

    public void setTitle(String str) {
        this.q = str;
        c();
    }

    public void setPermissionListener(InterfaceC1300da0 interfaceC1300da0) {
    }

    public void setSearchBarListener(InterfaceC1202ca0 interfaceC1202ca0) {
    }

    @Deprecated
    public void setSpeechRecognitionCallback(InterfaceC3351yf0 interfaceC3351yf0) {
    }
}
