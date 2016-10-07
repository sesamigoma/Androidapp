package com.fun.HNCamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.fun.HNCamera.MainActivity;
import com.fun.HNCamera.R;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setbutton();
    }

    private void setbutton(){
        Button button = (Button)findViewById(R.id.button_s);
        button.setOnClickListener(start_click);
    }

    private View.OnClickListener start_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(startActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}
