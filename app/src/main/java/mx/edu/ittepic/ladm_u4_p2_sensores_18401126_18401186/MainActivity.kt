package mx.edu.ittepic.ladm_u4_p2_sensores_18401126_18401186

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var sensorManager: SensorManager
    var lienzo: Lienzo?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),SensorManager.SENSOR_DELAY_NORMAL)

        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),SensorManager.SENSOR_DELAY_NORMAL)

        lienzo = Lienzo(this)
        setContentView(lienzo)
    }

    override fun onSensorChanged(event: SensorEvent?) {

        var PosX = event!!.values[0]

        //Movimiento Luna-Sol y Nubes
        if(event!!.sensor.type == Sensor.TYPE_ACCELEROMETER){
            lienzo!!.PosXLuna+=-PosX
            lienzo!!.PosXSol+=-PosX
            lienzo!!.PosXNube1+=-PosX
            lienzo!!.PosXNube2+=-PosX
            lienzo!!.PosXNube3+=-PosX
        }

        if(event!!.sensor.type == Sensor.TYPE_PROXIMITY){
            lienzo!!.dia=(event.values[0]!=0f)
        }

        lienzo?.invalidate()

    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}