package com.rohit.opencamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView mImageView;
    private Button mButtonOpenCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);


        mButtonOpenCamera = findViewById(R.id.button_camera);
        mButtonOpenCamera.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_camera){
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
