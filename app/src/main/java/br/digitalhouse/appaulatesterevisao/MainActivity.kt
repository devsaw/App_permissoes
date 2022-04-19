package br.digitalhouse.appaulatesterevisao

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.digitalhouse.appaulatesterevisao.camera.Camera
import br.digitalhouse.appaulatesterevisao.compartilhar.Compartilhar
import br.digitalhouse.appaulatesterevisao.ligar.Ligar
import br.digitalhouse.appaulatesterevisao.wifi.Wifi


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botaoCamera()
        botaoLigar()
        botaoWifi()
        botaoShared()
    }

    fun botaoCamera() {
        var botaoCam = findViewById<Button>(R.id.button2)
        botaoCam.setOnClickListener {
            var intent1 = Intent(this, Camera::class.java)
            startActivity(intent1)
        }
    }

    fun botaoLigar() {
        var botaoLiga = findViewById<Button>(R.id.button)
        botaoLiga.setOnClickListener {
            var intent2 = Intent(this, Ligar::class.java)
            startActivity(intent2)
        }
    }

    fun botaoWifi() {
        var botaoWifi = findViewById<Button>(R.id.button3)
        botaoWifi.setOnClickListener {
            var intent3 = Intent(this, Wifi::class.java)
            startActivity(intent3)
        }
    }

    fun botaoShared() {
        var botaoComp = findViewById<Button>(R.id.button4)
        botaoComp.setOnClickListener {
            var intent4 = Intent(this, Compartilhar::class.java)
            startActivity(intent4)
        }
    }
}