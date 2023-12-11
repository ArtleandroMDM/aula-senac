package defandroide.arthur.trello_csd.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import defandroide.arthur.trello_csd.R;

public class splashActivity extends  AppCompatActivity {

        public static final int TIME_OUT_SPLASH = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            cumutartelaSplash();
        }

        private void cumutartelaSplash() {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent telaPrincipal = new Intent(splashActivity.this, MainActivity.class);
                    startActivity(telaPrincipal);
                    finish();
                }
            }, TIME_OUT_SPLASH);
        }
}
