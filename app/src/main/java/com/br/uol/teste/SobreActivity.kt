package com.br.uol.teste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Build
import android.view.MenuItem
import android.content.Intent




class SobreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar()?.setHomeButtonEnabled((true));      //Ativar o botão
        getSupportActionBar()?.setTitle(("Tela Sobre o App "));     //Titulo para ser exibido na sua Action Bar em frente à seta
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { //Botão adicional na ToolBar
        when (item.itemId) {
            android.R.id.home  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
            -> {
                startActivity(
                    Intent(
                        this,
                        HomeActivity::class.java
                    )
                )  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity()  //Método para matar a activity e não deixa-lá indexada na pilhagem
            }
            else -> {
            }
        }
        return true
    }
}
