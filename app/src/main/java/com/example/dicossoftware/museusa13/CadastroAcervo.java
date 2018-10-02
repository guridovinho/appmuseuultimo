package com.example.dicossoftware.museusa13;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroAcervo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_cadastro_acervo);

        }

        public void adicionar(View v) {
            EditText et = (EditText) findViewById(R.id.etNomeAr);

           }


        public void apagarTudo(View v) {
                 }

        public void carregarTabela(View v) {



        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.acervo:
                intent = new Intent(this, AcervoActivity.class);
                startActivity(intent);
                break;

            case R.id.sobre:
                intent = new Intent(this, SobreActivity.class);
                startActivity(intent);
                break;

            case R.id.contato:
                intent = new Intent(this, ContatoActivity.class);
                startActivity(intent);
                break;

            case R.id.mAdm:
                intent = new Intent(this, activity_login.class);
                startActivity(intent);
                break;
            case R.id.mainmenu:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }

}