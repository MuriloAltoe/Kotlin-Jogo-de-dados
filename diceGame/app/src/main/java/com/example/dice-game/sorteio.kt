package com.example.diceGame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class sorteio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorteio)

        changeDado()
    }

    fun changeDado(){
        var resultado = findViewById<ImageView>(R.id.imgResp)

        var numero = Random.nextInt(1,6);

        when(numero){
            1->
                resultado.setImageResource(R.drawable.um);
            2->
                resultado.setImageResource(R.drawable.dois);
            3->
                resultado.setImageResource(R.drawable.tres);
            4->
                resultado.setImageResource(R.drawable.quatro);
            5->
                resultado.setImageResource(R.drawable.cinco);
            6->
                resultado.setImageResource(R.drawable.seis);
        };
    }

    fun voltar(view: View) {
        finish();
    }
}