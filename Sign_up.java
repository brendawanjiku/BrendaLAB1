package brenda.example.com.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Sign_up extends AppCompatActivity {
    private Button mBtSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mBtSignup = (Button)
                findViewById(R.id.signup);
        mBtSignup.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View View){
            Signup();
        }
    });
    }
    private void Signup(){
        Intent intent=new Intent(this,home.class);
        startActivity(intent);
    }

}
