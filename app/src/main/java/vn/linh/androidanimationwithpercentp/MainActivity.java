package vn.linh.androidanimationwithpercentp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    View viewAnimateWithPercent;
    View viewAnimateWithPercentP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewAnimateWithPercent = findViewById(R.id.image_1);
        viewAnimateWithPercentP = findViewById(R.id.image_2);

        findViewById(R.id.button_animate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation slide = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_in);
                Animation slideWithP =
                        AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_in_with_p);

                viewAnimateWithPercent.startAnimation(slide);
                viewAnimateWithPercentP.startAnimation(slideWithP);
            }
        });
    }
}
