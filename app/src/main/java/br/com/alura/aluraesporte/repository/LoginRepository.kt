package br.com.alura.aluraesporte.repository

import android.content.SharedPreferences
import androidx.core.content.edit

class LoginRepository(private val preferences: SharedPreferences) {

    fun loga(){
       salva(true)
    }

    fun estaLogado(): Boolean =
        preferences.getBoolean("LOGADO", false)


    fun desloga() {
        salva(false)
    }

    private fun salva(estado: Boolean) {
        preferences.edit {
            putBoolean("LOGADO", estado)
        }
    }

}
