package cs2c.tku.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int tsize=24;
    public void bigger(View view){
        TextView h;
        h=findViewById(R.id.textView);
        h.setTextSize(++tsize);
    }
}
