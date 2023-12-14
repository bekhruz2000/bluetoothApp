package com.example.bluetoothapp

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.content.pm.PackageManager.*
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {

    private var bluetoothAdapter : BluetoothAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        bluetoothAdapter =bluetoothManager.adapter
     //   getPairedDevices()
      //  bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()


    }
    private fun getPairedDevices(){
        var sManager : SensorManager
        sManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sensor = sManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        val sListener = object : SensorEventListener{
            override fun onSensorChanged(p0: SensorEvent?) {
                TODO("Not yet implemented")
            }

            override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
                TODO("Not yet implemented")
            }

        }

    }

}