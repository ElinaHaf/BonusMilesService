public class BonusMilesService {

    public int calculate(int cost) {     //стоимость билета
        int miles;                       //возвращает расчитанное количество миль

        if (cost > 20) {
            miles = cost / 20;

        } else {
            miles = 0;
        }
        return miles;
    }

}
