import java.sql.SQLOutput;

interface Bicycle{
    int a=10;            // properties(attributes) in interfaces are by default final (final int a=10)
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornBullet();

}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Blowing Horn");
    }
    public void applyBrakes(int decrement){
        System.out.println("Applying BRAKES");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHornK3g(){
        System.out.println("K3g horn");
    };
    public void blowHornBullet(){
        System.out.println("Bullet horn");
    };
}

public class Interfaces {
    public static void main(String[] args){
        AvonCycle myCycle = new AvonCycle();
        myCycle.applyBrakes(1);
        System.out.println(myCycle.a);
        // NOTE: You cannot modify properties of Interfaces as they are FINAL
       //  myCycle.a = 20;            ERROR
        myCycle.blowHornK3g();
        myCycle.blowHornBullet();
    }
}
