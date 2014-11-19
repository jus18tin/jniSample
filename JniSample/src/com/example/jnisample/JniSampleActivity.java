package com.example.jnisample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JniSampleActivity extends Activity {
	static {
        System.loadLibrary("native_sample");
    }
	private native int testJni(int i);
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni_sample);
        
        int i=testJni(3);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("from jni:" + i);
    }
}
