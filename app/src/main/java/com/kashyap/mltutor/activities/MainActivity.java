package com.kashyap.mltutor.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.fragments.ContentFragment;

public class MainActivity extends AppCompatActivity {


    public static Intent getIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    public static Intent getIntentWithNewTask(Context context) {
        Intent intent = getIntent(context);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = ContentFragment.newInstance();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_main_frame_layout_fragments_holder,fragment,fragment.getClass().getSimpleName())
                .commit();
    }




    public void onStart() {
        super.onStart();
    }


    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }
}
