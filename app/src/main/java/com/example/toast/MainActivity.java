package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater layoutInflater = getLayoutInflater();
        View myLayout=layoutInflater.inflate(R.layout.my_layout,(ViewGroup)findViewById(R.id.dialog_container) );
        ImageView cameraIamge=myLayout.findViewById(R.id.imageViewCamera);
        cameraIamge.setImageResource(R.drawable.ic_baseline_local_see_24);
        TextView myMessage=(TextView)myLayout.findViewById(R.id.textViewCameraInfo);
        myMessage.setText("My Custom Toast");
        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);
        myToast.show();



    }
}