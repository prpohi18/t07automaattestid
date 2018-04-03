package kodune;
public class kolmaskylg{
  double side1;
  double side2;
  double radians;
  double side3;
  double kraadid;
  public kolmaskylg(double kylg1, double kylg2, double kraadid){
    side1=kylg1;
    side2=kylg2;
    this.kraadid=kraadid;
    radians=Math.toRadians(kraadid);
    side3=Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2)-(2*side1*side2*Math.cos(radians)));
  }
  @Override
  public String toString(){
    return side1+"&"+side2+"&"+ kraadid;
  }

  public double checkSide3(){
        return side3;
    }

  public double checkSide1(){
      return side1;
    }

  public double checkSide2(){
      return side2;
    }

  public double checkRadians(){
      return radians;
  }
}
