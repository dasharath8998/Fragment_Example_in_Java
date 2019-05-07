package com.gurukul.fragjava;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1,b2,b3;
        b1 = (Button) findViewById(R.id.btnOne);
        b2 = (Button) findViewById(R.id.btnTwo);
        b3 = (Button) findViewById(R.id.btnThree);

        Fragment fragment =(Fragment) getSupportFragmentManager().findFragmentById(R.id.frag1);
        final FragmentManager fManager = getSupportFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fManager.beginTransaction();
                ft.replace(R.id.frag1, new OneFragment());
                ft.addToBackStack("true");
                ft.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fManager.beginTransaction();
                ft.replace(R.id.frag1, new TwoFragment());
                ft.addToBackStack("true");
                ft.commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fManager.beginTransaction();
                ft.replace(R.id.frag1, new ThreeFragment());
                ft.addToBackStack("true");
                ft.commit();
            }
        });
    }
}
