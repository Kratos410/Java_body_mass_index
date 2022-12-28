public class BmiService {
    public double calculate(double growth, double weight) {
        double growth2 = growth * growth;      //Рост в квадрате
        double index = weight / growth2;     //Подсчет индкса массы тела
        return index;
    }
}