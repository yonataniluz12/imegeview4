package com.example.imegeview4;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);

    }
    public void go(View view) {
        num = (int) (101 * Math.random() + 1) % 3;
        if (num == 1){
            iv.setImageResource(R.drawable.one);
        }
        else if (num == 2){
            iv.setImageResource(R.drawable.two);
        }
        else{
            iv.setImageResource(R.drawable.three);
        }
        btn.setText(""+num);
    }
}

