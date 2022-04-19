package br.digitalhouse.appaulatesterevisao.compartilhar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.digitalhouse.appaulatesterevisao.R

class Compartilhar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compartilhar)
        var button = findViewById<Button>(R.id.btncompartilhar)
        button.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "Compartilhar em outras mídias")
            startActivity(intent)
        }
    }
}