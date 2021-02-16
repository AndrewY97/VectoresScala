import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer

object Ejercicios_Vectores {

  def main(args: Array[String]): Unit = {
    println("Cantidad de datos del Vector:")
    val datos= new ArrayBuffer[Int]()
    val c= readInt()
    val cc=c-1

    llenar(cc,datos)

  }
  def llenar(c:Int,datos:ArrayBuffer[Int]):Unit={
    val datos= new ArrayBuffer[Int]()
    for(i <-0 to c){
      println("Ingrese los datos:")
      var dd=readInt()
      datos+=1
      datos(i)=dd
    }
    mostrar(datos)
    //println("<------------------>")
    ordenar(datos)
    //println("<------------------>")
  }

  def mostrar(datos:ArrayBuffer[Int]):Unit={
    for(i<-datos){
      println(i)
    }
    println("<---------------->")
  }

  def ordenar(datos:ArrayBuffer[Int]):Unit={
    val dos= datos.sortWith(_<_)
    mostrar(dos)
    media(dos)
    moda(dos)
    //mediana(dos)
  }

  def media(datos:ArrayBuffer[Int]):Unit={
    var valor=0.0
    for (i<-datos){
      valor+=i
    }
    val vv=valor/datos.length
    println("Media:"+valor/datos.length)
    varianza(datos,vv)
  }

  def moda(datos:ArrayBuffer[Int]):Unit={
    var maximorep=0
    var moda=0.0
    for(i<-datos){
      var numrep=0
      for(j<-datos){
        if(i==j){
          numrep+=1
        }
        if(numrep>maximorep){
          moda=i
          maximorep = numrep
        }
      }
    }
    println("Moda:"+moda)
  }
  
  def varianza(datos:ArrayBuffer[Int],valor:Double):Unit={
    var n= datos.length
    var varianza=0.0
    for(i<-datos){
      varianza+=math.pow((i-valor),2)
    }
    val varianzita= varianza/(n-1)
    println("Varianza:"+varianzita)
    desviacion(varianzita)

  }

  def desviacion(valor:Double):Unit={
    var vall = valor
    if(vall==0){
      vall=math.sqrt(vall)
    }else{
      println("DesviacionE:"+math.sqrt(vall))
    }
  }


}
