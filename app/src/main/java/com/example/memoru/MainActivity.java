package com.example.memoru;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> lista_ob = new ArrayList<>();

    int kartyOdkryte=0;

    int pary = 8;

    int drawable1;
    int drawable2;

    public ImageView imageTemp2 = null;

    ArrayList<Integer> lista_rys = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);
        ImageView imageView8 = findViewById(R.id.imageView8);
        ImageView imageView9 = findViewById(R.id.imageView9);
        ImageView imageView10 = findViewById(R.id.imageView10);
        ImageView imageView11 = findViewById(R.id.imageView11);
        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView13 = findViewById(R.id.imageView13);
        ImageView imageView14 = findViewById(R.id.imageView14);
        ImageView imageView15 = findViewById(R.id.imageView15);
        ImageView imageView16 = findViewById(R.id.imageView16);

        lista_ob.add(imageView);
        lista_ob.add(imageView2);
        lista_ob.add(imageView3);
        lista_ob.add(imageView4);
        lista_ob.add(imageView5);
        lista_ob.add(imageView6);
        lista_ob.add(imageView7);
        lista_ob.add(imageView8);
        lista_ob.add(imageView9);
        lista_ob.add(imageView10);
        lista_ob.add(imageView11);
        lista_ob.add(imageView12);
        lista_ob.add(imageView13);
        lista_ob.add(imageView14);
        lista_ob.add(imageView15);
        lista_ob.add(imageView16);

        lista_rys.add(R.drawable.rys1);
        lista_rys.add(R.drawable.rys2);
        lista_rys.add(R.drawable.rys3);
        lista_rys.add(R.drawable.rys4);
        lista_rys.add(R.drawable.rys5);
        lista_rys.add(R.drawable.rys6);
        lista_rys.add(R.drawable.rys7);
        lista_rys.add(R.drawable.rys8);
        lista_rys.add(R.drawable.rys1);
        lista_rys.add(R.drawable.rys2);
        lista_rys.add(R.drawable.rys3);
        lista_rys.add(R.drawable.rys4);
        lista_rys.add(R.drawable.rys5);
        lista_rys.add(R.drawable.rys6);
        lista_rys.add(R.drawable.rys7);
        lista_rys.add(R.drawable.rys8);

        Collections.shuffle(lista_rys);

        for (int i=0; i < lista_ob.size(); ++i) {
            final ImageView imageTemp = lista_ob.get(i);

            int finalI = i;
            imageTemp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(kartyOdkryte==1){
                        imageTemp.setImageResource(lista_rys.get(finalI));
                        drawable2 = lista_rys.get(finalI);
                        if(drawable1==drawable2){
                            Toast.makeText(MainActivity.this, "te same", Toast.LENGTH_SHORT).show();
                            kartyOdkryte=0;
                            imageTemp.setEnabled(false);
                            imageTemp2.setEnabled(false);
                            imageTemp.setAlpha(125);
                            imageTemp2.setAlpha(125);
                            pary--;
                            if(pary==0){
                                Toast.makeText(MainActivity.this, "Wygrales", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            kartyOdkryte=0;
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                public void run() {
                                    imageTemp.setImageResource(R.drawable.gwiazdka);
                                    imageTemp2.setImageResource(R.drawable.gwiazdka);
                                }
                            }, 500);
                        }
                    }else {
                        imageTemp.setImageResource(lista_rys.get(finalI));
                        drawable1 = lista_rys.get(finalI);
                        imageTemp2=imageTemp;
                        kartyOdkryte=1;
                    }
                }
            });
        }


    }


}