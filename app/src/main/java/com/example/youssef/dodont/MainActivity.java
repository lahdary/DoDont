package com.example.youssef.dodont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ImageView imgClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClick = (ImageView)findViewById(R.id.imageView);

        imgClick.setOnClickListener(new View.OnClickListener() {
            int count=0;
            @Override
            public void onClick(View v) {
                count++;
                double random = Math.random();
                if(count%2 ==0){
                    imgClick.setImageResource(R.drawable.image_main);
                }else{
                    if(random>=0.5){
                        imgClick.setImageResource(R.drawable.image_do);
                    }else{
                        imgClick.setImageResource(R.drawable.image_dont);
                    }
                }
                if(count ==10){
                    count =0;
                }
            }
        });
    }

}
