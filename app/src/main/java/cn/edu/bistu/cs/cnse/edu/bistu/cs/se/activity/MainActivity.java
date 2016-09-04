package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.activity;

import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.util.Log;
import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private static String TAG = "LIFTCYCLE";

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button=(Button)findViewById(R.id.Second);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=
                            new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("name","lihuixia");
                    intent.putExtra("number",2014011389);
                    startActivity(intent);
        }});}
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }}

        public void onStart() {
            super.onStart();
            Log.i(TAG, "(2) onStart()");
        }
        public void onResume() {
            super.onResume();
            Log.i(TAG, "(3) onStart()");
        }
        public void onRestart() {
            super.onRestart();
            Log.i(TAG, "(4) onRestart()");
        }
        public void onStop() {
            super.onStop();
            Log.i(TAG, "(5) onStop()");
        }


    }
