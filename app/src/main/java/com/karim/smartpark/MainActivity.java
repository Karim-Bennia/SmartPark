package com.karim.smartpark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this,LoginActivity.class));
    }

/*public void sigUp(View view) {
   String user = ((EditText) findViewById(R.id.User_text)).getText().toString();
    String pass = ((EditText) findViewById(R.id.User_pass)).getText().toString();
    if (user.isEmpty()) {
        Toast.makeText(MainActivity.this, "enter une @ email", Toast.LENGTH_SHORT).show();
        return;
    }
    if (pass.isEmpty()) {
        Toast.makeText(MainActivity.this, "enter un password", Toast.LENGTH_SHORT).show();
        return;
    }
    FirebaseAuth Auth = FirebaseAuth.getInstance();
    Auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(
            new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "compte cree avec succes," + "Login pour Continuer", Toast.LENGTH_SHORT).show();

                    } else
                        Toast.makeText(MainActivity.this, "Echec:"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                }
            });
}*/
}
