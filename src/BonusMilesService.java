public class BonusMilesService {
    public int calculate(int price) {
        int freeMiles = 20;
        int bonus = price / freeMiles;
        return bonus;
    }
}
