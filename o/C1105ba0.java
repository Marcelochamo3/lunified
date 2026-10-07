package o;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SpeechOrbView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: o.ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1105ba0 implements RecognitionListener {
    public final /* synthetic */ SearchBar a;

    public C1105ba0(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        switch (i) {
            case 1:
                int i2 = SearchBar.I;
                break;
            case 2:
                int i3 = SearchBar.I;
                break;
            case 3:
                int i4 = SearchBar.I;
                break;
            case 4:
                int i5 = SearchBar.I;
                break;
            case 5:
                int i6 = SearchBar.I;
                break;
            case 6:
                int i7 = SearchBar.I;
                break;
            case 7:
                int i8 = SearchBar.I;
                break;
            case 8:
                int i9 = SearchBar.I;
                break;
            case 9:
                int i10 = SearchBar.I;
                break;
            default:
                int i11 = SearchBar.I;
                break;
        }
        SearchBar searchBar = this.a;
        searchBar.b();
        searchBar.s.post(new RunnableC0907Ya(R.raw.lb_voice_failure, 4, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return;
        }
        String str = stringArrayList.get(0);
        String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
        SearchEditText searchEditText = this.a.l;
        searchEditText.getClass();
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            Matcher matcher = Pg0.q.matcher(str2);
            while (matcher.find()) {
                int iStart = matcher.start() + length;
                spannableStringBuilder.setSpan(new Og0(searchEditText, str2.charAt(matcher.start()), iStart), iStart, matcher.end() + length, 33);
            }
        }
        searchEditText.f459o = Math.max(str.length(), searchEditText.f459o);
        searchEditText.setText(new SpannedString(spannableStringBuilder));
        searchEditText.bringPointIntoView(searchEditText.length());
        ObjectAnimator objectAnimator = searchEditText.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int streamPosition = searchEditText.getStreamPosition();
        int length2 = searchEditText.length();
        int i = length2 - streamPosition;
        if (i > 0) {
            if (searchEditText.p == null) {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                searchEditText.p = objectAnimator2;
                objectAnimator2.setTarget(searchEditText);
                searchEditText.p.setProperty(Pg0.r);
            }
            searchEditText.p.setIntValues(streamPosition, length2);
            searchEditText.p.setDuration(((long) i) * 50);
            searchEditText.p.start();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SearchBar searchBar = this.a;
        SpeechOrbView speechOrbView = searchBar.m;
        speechOrbView.setOrbColors(speechOrbView.E);
        speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable.lb_ic_search_mic));
        speechOrbView.a(true);
        speechOrbView.x = false;
        speechOrbView.b();
        View view = speechOrbView.n;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        speechOrbView.G = 0;
        speechOrbView.H = true;
        searchBar.s.post(new RunnableC0907Ya(R.raw.lb_voice_open, 4, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        SearchBar searchBar = this.a;
        if (stringArrayList != null) {
            String str = stringArrayList.get(0);
            searchBar.f24o = str;
            searchBar.l.setText(str);
            TextUtils.isEmpty(searchBar.f24o);
        }
        searchBar.b();
        searchBar.s.post(new RunnableC0907Ya(R.raw.lb_voice_success, 4, searchBar));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.a.m.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }
}
