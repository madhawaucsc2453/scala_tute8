import scala.math._

object q1 extends App {

  val p1=Point(4,7);
  val p2=Point(2,1);

  println(p1+" + "+p2+"= "+ p1.add(p2));


  println(p1+" Move by (1,1) :"+ p1.mov(1,1));


  println("Distance between "+p1+" and "+p2+" = " + p1.dis(p2));


  println("Invert of "+p1+" = "+ p1.inv());

}

case class Point(a:Double,b:Double){
  def x:Double=a;
  def y:Double=b;


  def add(point:Point)=Point(this.x+point.x,this.y+point.y);

  def mov(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);


  def dis(p1:Point):Double={
    val y2:Double=pow(p1.y-this.y,2);
    val x2:Double=pow(p1.x-this.x,2);
    return sqrt(y2+x2);
  }


  def inv()=Point(this.y,this.x);

}