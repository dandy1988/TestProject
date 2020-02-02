package net.ukr.dandy1988.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Log.d(TAG, "MainActivity -> onCreate(), savedInstanceState: ");
        } else {
            Log.d(TAG, "MainActivity -> onCreate(), savedInstanceState: " + savedInstanceState.toString());
        }

        final EditText etName = findViewById(R.id.etName);
        final Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setEnabled(false);

        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = s.toString();
                btnAdd.setEnabled(!text.isEmpty());

            }
        });

    }

    public void buttonPressed(View view){
        // выводим сообщение
        Toast toast = Toast.makeText(getApplicationContext(), "Name have added", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    };


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity -> onRestart() ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity -> onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity -> onResume() ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity -> onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity -> onStop() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity -> onDestroy() ");
    }

    public void butonPressed(View view) {
    }
}
