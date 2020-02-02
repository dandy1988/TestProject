package net.ukr.dandy1988.testproject;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    private final String TAG = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        if (savedInstanceState == null) {
            Log.d(TAG, "Activity2 -> onCreate(), savedInstanceState: ");
        } else {
            Log.d(TAG, "Activity2 -> onCreate(), savedInstanceState: " + savedInstanceState.toString());
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity2 -> onRestart() ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity2 -> onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity2 -> onResume() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity2 -> onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity2 -> onStop() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity2 -> onDestroy() ");
    }
}
