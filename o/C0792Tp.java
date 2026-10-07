package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: o.Tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0792Tp extends UK {
    public final TextView i;
    public final C0688Pp j;
    public boolean k = true;

    public C0792Tp(TextView textView) {
        this.i = textView;
        this.j = new C0688Pp(textView);
    }

    @Override // o.UK
    public final boolean D() {
        return this.k;
    }

    @Override // o.UK
    public final void R(boolean z) {
        if (z) {
            TextView textView = this.i;
            textView.setTransformationMethod(X(textView.getTransformationMethod()));
        }
    }

    @Override // o.UK
    public final void S(boolean z) {
        this.k = z;
        TextView textView = this.i;
        textView.setTransformationMethod(X(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    @Override // o.UK
    public final TransformationMethod X(TransformationMethod transformationMethod) {
        if (this.k) {
            return ((transformationMethod instanceof C0896Xp) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0896Xp(transformationMethod);
        }
        return transformationMethod instanceof C0896Xp ? ((C0896Xp) transformationMethod).a : transformationMethod;
    }

    @Override // o.UK
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0688Pp) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0688Pp c0688Pp = this.j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0688Pp;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0688Pp) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
