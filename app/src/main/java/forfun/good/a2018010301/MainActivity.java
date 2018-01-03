package forfun.good.a2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
    }
    public void CL1(View v)
    {
        img.setImageResource(R.drawable.test);
    }

    public void CL2(View v)
    {
        Picasso.with(MainActivity.this).load("http://www.ttpaihang.com/image/vote/20120128105215796945.jpg").into(img);
    }
}
