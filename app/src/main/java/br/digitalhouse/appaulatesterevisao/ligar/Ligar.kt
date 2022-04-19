package br.digitalhouse.appaulatesterevisao.ligar

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import br.digitalhouse.appaulatesterevisao.R

class Ligar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ligar)
        var editText = findViewById<EditText>(R.id.editText1)

        var btn = findViewById<Button>(R.id.button5)
        btn.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this, arrayOf(android.Manifest.permission.CALL_PHONE), 1
                )
            } else {
                var ligar = Intent(Intent.ACTION_CALL, Uri.parse("tel: " + "${editText.text}"))
                startActivity(ligar)
            }
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Permissão Garantida", Toast.LENGTH_LONG)
            }else{
                Toast.makeText(this, "Permissão Negada", Toast.LENGTH_LONG)
            }
        }
    }
}