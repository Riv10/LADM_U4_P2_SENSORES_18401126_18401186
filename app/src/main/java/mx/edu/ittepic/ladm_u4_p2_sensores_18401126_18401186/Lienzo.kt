package mx.edu.ittepic.ladm_u4_p2_sensores_18401126_18401186

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity) : View(p) {

    var puntero = p
    var dia = false
    var PosXLuna = 200f
    var PosYLuna = 200f
    var PosXSol = 200f
    var PosYSol = 200f

    var PosXNube1 = 550f
    var PosYNube1 = 250f

    var PosXNube2 = 700f
    var PosYNube2 = 250f

    var PosXNube3 = 625f
    var PosYNube3 = 150f

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        if (dia == true){
            p.color = Color.YELLOW
            c.drawCircle(PosXSol,PosYSol,150f,p)

            p.color = Color.CYAN
            c.drawCircle(PosXNube1,PosYNube1,100f,p)
            c.drawCircle(PosXNube2,PosYNube2,100f,p)
            c.drawCircle(PosXNube3,PosYNube3,100f,p)

            //Relleno montañas 3
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(0f, 1170f, 1080f, 1200f,p)
            c.drawRect(20f, 1140f, 1060f, 1170f,p)
            c.drawRect(40f, 1110f, 1040f, 1140f,p)
            c.drawRect(60f, 1080f, 1020f, 1110f,p)
            c.drawRect(80f, 1050f, 1000f, 1080f,p)
            c.drawRect(100f, 1020f, 980f, 1050f,p)
            c.drawRect(120f, 990f, 960f, 1020f,p)
            c.drawRect(140f, 960f, 940f, 990f,p)

            //Relleno montaña 1 - Cafe
            c.drawRect(150f, 930f, 390f, 960f,p)
            c.drawRect(165f, 900f, 370f, 930f,p)
            //Relleno montaña 1 - Blanco
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(180f, 870f, 360f, 900f,p)
            c.drawRect(195f, 840f, 340f, 870f,p)
            c.drawRect(210f, 810f, 320f, 840f,p)
            c.drawRect(235f, 780f, 300f, 810f,p)
            c.drawRect(255f, 750f, 282f, 780f,p)

            //Relleno montaña 3- Cafe
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(700f, 930f, 930f, 960f,p)
            c.drawRect(720f, 900f, 900f, 930f,p)
            //Relleno montaña 3 - Blanco
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(735f, 870f, 900f, 900f,p)
            c.drawRect(750f, 840f, 880f, 870f,p)
            c.drawRect(765f, 810f, 860f, 840f,p)
            c.drawRect(780f, 780f, 840f, 810f,p)
            c.drawRect(800f, 750f, 822f, 780f,p)

            //Relleno montaña 2 -Cafe
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(400f, 930f, 690f, 960f,p)
            c.drawRect(430f, 900f, 660f, 930f,p)

            //Relleno montaña 2 - Blanco
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(460f, 870f, 630f, 900f,p)
            c.drawRect(480f, 840f, 610f, 870f,p)
            c.drawRect(500f, 810f, 580f, 840f,p)
            c.drawRect(520f, 780f, 560f, 810f,p)
            c.drawRect(535f, 750f, 545f, 780f,p)

            //Montaña 1
            p.color = Color.WHITE
            c.drawLine(0f,1200f,270f,750f,p)
            c.drawLine(270f,750f,540f,1200f,p)

            //Montaña 2
            c.drawLine(400f,980f,540f,800f,p)
            c.drawLine(540f,800f,680f,980f,p)

            //Montaña 3
            c.drawLine(540f,1200f,810f,750f,p)
            c.drawLine(810f,750f,1080f,1200f,p)

            //Arboles
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(50f, 1780f, 110f, 1892f,p)
            c.drawRect(300f, 1500f, 350f, 1730f,p)
            c.drawRect(150f, 1600f, 250f, 1830f,p)
            c.drawRect(30f, 1450f, 100f, 1650f,p)

            p.color = Color.GREEN
            c.drawCircle(80f,1700f,100f,p)
            c.drawCircle(325f, 1400f, 100f, p)
            c.drawCircle(200f,1500f,100f,p)
            c.drawCircle(65f,1350f,100f,p)

            //Casa
            p.style = Paint.Style.FILL
            p.color = Color.rgb(75,54,33)
            c.drawRect(450f,1400f,780f,1730f,p)

            //Puerta y Ventana Casa
            p.style = Paint.Style.FILL
            p.color = Color.BLACK
            c.drawRect(500f,1480f,610f,1730f,p)
            p.color = Color.WHITE
            c.drawCircle(525f,1605f,10f,p)
            p.color = Color.WHITE
            c.drawRect(650f, 1480f, 720f, 1550f,p)

            //Relleno Techo
            p.color =Color.BLACK
            c.drawRect(450f, 1370f, 800f, 1400f,p)
            c.drawRect(480f, 1340f, 900f, 1370f,p)
            c.drawRect(510f, 1310f, 960f, 1340f,p)
            c.drawRect(540f, 1280f, 935f, 1310f,p)
            c.drawRect(570f, 1250f, 905f, 1280f,p)
            c.drawRect(650f, 1220f, 880f, 1250f,p)
            c.drawRect(780f, 1190f, 830f, 1220f,p)

            //Techo Casa
            p.color = Color.WHITE
            c.drawLine(450f,1400f,615f,1250f,p)
            c.drawLine(615f,1250f,780f,1400f,p)

            //Color fondo
            p.color = Color.rgb(75,54,33)
            c.drawRect(780f,1400f,950f,1640f,p)
            c.drawRect(780f,1640f,930f,1670f,p)
            c.drawRect(780f,1670f,900f,1700f,p)
            c.drawRect(780f,1700f,850f,1730f,p)
            c.drawRect(800f,1370f,950f,1400f,p)
            c.drawRect(850f,1340f,950f,1370f,p)
            c.drawRect(910f,1310f,950f,1340f,p)

            //Fondo Casa
            p.color = Color.WHITE
            c.drawLine(780f,1400f, 950f,1320f,p)
            c.drawLine(780f,1730f, 950f, 1640f,p)
            c.drawLine(950f,1320f,950f,1640f,p)
            c.drawLine(615f,1250f,820f, 1200f,p)
            c.drawLine(820f,1200f,950f,1320f,p)


        }else{
            c.drawRGB(38,96,169)
            p.color = Color.WHITE
            c.drawCircle(PosXLuna,PosYLuna,150f,p)

            p.color = Color.CYAN
            c.drawCircle(PosXNube1,PosYNube1,100f,p)
            c.drawCircle(PosXNube2,PosYNube2,100f,p)
            c.drawCircle(PosXNube3,PosYNube3,100f,p)

            //Relleno montañas 3
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(0f, 1170f, 1080f, 1200f,p)
            c.drawRect(20f, 1140f, 1060f, 1170f,p)
            c.drawRect(40f, 1110f, 1040f, 1140f,p)
            c.drawRect(60f, 1080f, 1020f, 1110f,p)
            c.drawRect(80f, 1050f, 1000f, 1080f,p)
            c.drawRect(100f, 1020f, 980f, 1050f,p)
            c.drawRect(120f, 990f, 960f, 1020f,p)
            c.drawRect(140f, 960f, 940f, 990f,p)

            //Relleno montaña 1 - Cafe
            c.drawRect(150f, 930f, 390f, 960f,p)
            c.drawRect(165f, 900f, 370f, 930f,p)
            //Relleno montaña 1 - Blanco
            p.color = Color.WHITE
            c.drawRect(180f, 870f, 360f, 900f,p)
            c.drawRect(195f, 840f, 340f, 870f,p)
            c.drawRect(210f, 810f, 320f, 840f,p)
            c.drawRect(235f, 780f, 300f, 810f,p)
            c.drawRect(255f, 750f, 282f, 780f,p)

            //Relleno montaña 3- Cafe
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(700f, 930f, 930f, 960f,p)
            c.drawRect(720f, 900f, 900f, 930f,p)
            //Relleno montaña 3 - Blanco
            p.color = Color.WHITE
            c.drawRect(735f, 870f, 900f, 900f,p)
            c.drawRect(750f, 840f, 880f, 870f,p)
            c.drawRect(765f, 810f, 860f, 840f,p)
            c.drawRect(780f, 780f, 840f, 810f,p)
            c.drawRect(800f, 750f, 822f, 780f,p)

            //Relleno montaña 2 -Cafe
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(400f, 930f, 690f, 960f,p)
            c.drawRect(430f, 900f, 660f, 930f,p)

            //Relleno montaña 2 - Blanco
            p.color = Color.WHITE
            c.drawRect(460f, 870f, 630f, 900f,p)
            c.drawRect(480f, 840f, 610f, 870f,p)
            c.drawRect(500f, 810f, 580f, 840f,p)
            c.drawRect(520f, 780f, 560f, 810f,p)
            c.drawRect(535f, 750f, 545f, 780f,p)

            //Montaña 1
            p.color = Color.WHITE
            c.drawLine(0f,1200f,270f,750f,p)
            c.drawLine(270f,750f,540f,1200f,p)

            //Montaña 2
            c.drawLine(400f,980f,540f,800f,p)
            c.drawLine(540f,800f,680f,980f,p)

            //Montaña 3
            c.drawLine(540f,1200f,810f,750f,p)
            c.drawLine(810f,750f,1080f,1200f,p)

            //Arboles
            p.color = Color.rgb(111f.toInt(),78f.toInt(),55f.toInt())
            c.drawRect(50f, 1780f, 110f, 1892f,p)
            c.drawRect(300f, 1500f, 350f, 1730f,p)
            c.drawRect(150f, 1600f, 250f, 1830f,p)
            c.drawRect(30f, 1450f, 100f, 1650f,p)

            p.color = Color.GREEN
            c.drawCircle(80f,1700f,100f,p)
            c.drawCircle(325f, 1400f, 100f, p)
            c.drawCircle(200f,1500f,100f,p)
            c.drawCircle(65f,1350f,100f,p)

            //Casa
            p.style = Paint.Style.FILL
            p.color = Color.rgb(75,54,33)
            c.drawRect(450f,1400f,780f,1730f,p)

            //Puerta y Ventana Casa
            p.style = Paint.Style.FILL
            p.color = Color.BLACK
            c.drawRect(500f,1480f,610f,1730f,p)
            p.color = Color.WHITE
            c.drawCircle(525f,1605f,10f,p)
            p.color = Color.WHITE
            c.drawRect(650f, 1480f, 720f, 1550f,p)

            //Relleno Techo
            p.color =Color.BLACK
            c.drawRect(450f, 1370f, 800f, 1400f,p)
            c.drawRect(480f, 1340f, 900f, 1370f,p)
            c.drawRect(510f, 1310f, 960f, 1340f,p)
            c.drawRect(540f, 1280f, 935f, 1310f,p)
            c.drawRect(570f, 1250f, 905f, 1280f,p)
            c.drawRect(650f, 1220f, 880f, 1250f,p)
            c.drawRect(780f, 1190f, 830f, 1220f,p)

            //Techo Casa
            p.color = Color.WHITE
            c.drawLine(450f,1400f,615f,1250f,p)
            c.drawLine(615f,1250f,780f,1400f,p)

            //Color fondo
            p.color = Color.rgb(75,54,33)
            c.drawRect(780f,1400f,950f,1640f,p)
            c.drawRect(780f,1640f,930f,1670f,p)
            c.drawRect(780f,1670f,900f,1700f,p)
            c.drawRect(780f,1700f,850f,1730f,p)
            c.drawRect(800f,1370f,950f,1400f,p)
            c.drawRect(850f,1340f,950f,1370f,p)
            c.drawRect(910f,1310f,950f,1340f,p)

            //Fondo Casa
            p.color = Color.WHITE
            c.drawLine(780f,1400f, 950f,1320f,p)
            c.drawLine(780f,1730f, 950f, 1640f,p)
            c.drawLine(950f,1320f,950f,1640f,p)
            c.drawLine(615f,1250f,820f, 1200f,p)
            c.drawLine(820f,1200f,950f,1320f,p)

        }//Fin else

        c.drawBitmap(BitmapFactory.decodeResource(resources,R.drawable.bruja180),200f,700f,p)

    }//Fin funcion onDraw
}