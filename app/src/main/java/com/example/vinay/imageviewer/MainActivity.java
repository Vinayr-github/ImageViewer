package com.example.vinay.imageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mImages;
    private Button mNextButton;
    private Button mPreviousButton;
    private int mIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImages = findViewById(R.id.images);
        mNextButton = findViewById(R.id.next_button);
        mPreviousButton = findViewById(R.id.previous_button);
        mIndex = 0;

         final int[] images = new int[]{
                    R.drawable.image1,
                    R.drawable.image2,
                    R.drawable.image3,
                    R.drawable.image4,
                    R.drawable.image5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image8,
                    R.drawable.image9,
                    R.drawable.image10
        };


         mImages.setImageResource(images[mIndex]);

         mNextButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ++mIndex;

                 if(mIndex > 9){
                     mIndex = 9;
                     mImages.setImageResource(images[mIndex]);
                     Toast.makeText(getApplicationContext(), "Last one", Toast.LENGTH_SHORT).show();
                 }else{
                     mImages.setImageResource(images[mIndex]);
                 }
             }
         });

         mPreviousButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 --mIndex;

                 if(mIndex < 0){
                     mIndex = 0;
                     mImages.setImageResource(images[mIndex]);
                     Toast.makeText(getApplicationContext(), "First One", Toast.LENGTH_SHORT).show();
                 }else{
                     mImages.setImageResource(images[mIndex]);
                 }
             }
         });

    }
}
