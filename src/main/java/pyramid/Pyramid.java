package pyramid;

public class Pyramid {
  public static int areaCheck(int k, int a, int n){
    return k * a * n / 2;
  }
  public static int volumeCheck(int k, int a, int n, int h){
    return k * a * n * h / 6;
  }
}