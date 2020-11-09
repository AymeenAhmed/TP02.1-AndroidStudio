package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    private TextView textView ;
    private int number=0 ;
    private static final String TAG=MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.android.tp2.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView) ;
    }
    public void hello(View view){
        String num =textView.getText().toString();
        Intent intent =new Intent(this, result_activity.class);

        intent.putExtra("textA",num);
        startActivity(intent);
    }
    public void count(View view) {
        number++;
        if (textView != null)
            textView.setText(Integer.toString(number));
    }
    public void Answers(){
        Log.d(TAG,"Question 1") ;
        Log.d(TAG,"La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier \" AndroidManifest.xml est modifié pour déclarer une deuxième activité. ") ;

        Log.d(TAG,"Question 2") ;
        Log.d(TAG,"Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent."  ) ;

        Log.d(TAG,"Question 3") ;
        Log.d(TAG,"new Intent(Context context, Class<?> class)") ;

        Log.d(TAG,"Question 4") ;
        Log.d(TAG,"Comme extra d'intention (Intent)") ;

        Log.d(TAG,"Question 5") ;
        Log.d(TAG,"Tout ce qui précède") ;

    }
}