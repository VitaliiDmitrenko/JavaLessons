package homeWorks.Task1_8;

public class Kata {


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (fighter1.health > 0 && fighter2.health >0){
            fighter2.health -= fighter1.damagePerAttack;
            fighter1.health -= fighter2.damagePerAttack;}

            if (fighter1.health <=0 && fighter2.health <=0){
                return firstAttacker;
            }else if (fighter1.health <=0 && fighter2.health > 0){
                return fighter2.name;
            }else {
                return fighter1.name;
            }
        }

}
