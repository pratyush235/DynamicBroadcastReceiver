package com.example.iteradmin.a4thjuneproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class mybroadcastreciever :BroadcastReceiver(){
    override fun onReceive(context: Context?,intent: Intent?) {
        val s:String?=intent?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(context,"Charging In",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED ->{
                Toast.makeText(context,"Charging Out",Toast.LENGTH_LONG).show()
            }
            
        }
    }

}