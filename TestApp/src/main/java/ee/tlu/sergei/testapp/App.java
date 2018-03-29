package ee.tlu.sergei.testapp;

public class App {
       public static double KronKesk2(double[] b){
        int jag = 0;
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            jag++;
        }
        jag = jag - 1;
        sum = ArraySum(b) - b[0] - b[b.length-1];
        return (b[0]/2 + sum +b[b.length-1]/2)/jag;
     }
     
     
    public static double ArraySum(double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];   
        }
        return sum;
    }
    public static void main(String[] args) {
        double[] a = {1,2,3,4};
        System.out.println(KronKesk2(a));
    }
}
