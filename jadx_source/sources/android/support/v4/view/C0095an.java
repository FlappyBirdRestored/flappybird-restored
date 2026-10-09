package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: android.support.v4.view.an */
/* JADX INFO: loaded from: classes.dex */
class C0095an extends SingleLineTransformationMethod {

    /* JADX INFO: renamed from: a */
    private Locale f353a;

    public C0095an(Context context) {
        this.f353a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f353a);
        }
        return null;
    }
}
