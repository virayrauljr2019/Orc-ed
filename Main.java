import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        double max= 1.5;
        double min= 0.5;
        double Decval= rand.nextDouble()*(max-min)+min;
        //Scenario 1

        double Int= 23;
        double missledamage= 5;
        double damage=(Int*missledamage);
        int mod1=(int)(damage*Decval);
        int mod2=(int)(damage*Decval);
        int mod3=(int)(damage*Decval);
        int mod4=(int)(damage*Decval);
        int mod5=(int)(damage*Decval);
        int mod6=(int)(damage*Decval);
        int mod7=(int)(damage*Decval);
        int mod8=(int)(damage*Decval);
        int mod9=(int)(damage*Decval);
        int mod10=(int)(damage*Decval);
        double total= (mod1+mod2+mod3+mod4+mod5+mod6+mod7+mod8+mod9+mod10);
      System.out.println(total);

      //Scenario 2
        double Int2=10;
        double missledamage2=12;
        double damage2=(Int2*missledamage2);
        double mod1b=(int)(damage2*Decval);
        double mod2b=(int)(damage2*Decval);
        double mod3b=(int)(damage2*Decval);
        double mod4b=(int)(damage2*Decval);
        double mod5b=(int)(damage2*Decval);
        double mod6b=(int)(damage2*Decval);
        double mod7b=(int)(damage2*Decval);
        double mod8b=(int)(damage2*Decval);
        double mod9b=(int)(damage2*Decval);
        double mod10b=(int)(damage2*Decval);
        double total2= (mod1b+mod2b+mod3b+mod4b+mod5b+mod6b+mod7b+mod8b+mod9b+mod10b);
        System.out.println(total2);
    }
}
