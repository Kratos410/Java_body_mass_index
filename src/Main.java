public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        double growth = 1.76; // Рост в метрах
        double weight = 58;  // Вес в киллограммах
        double indexMass = service.calculate(growth,weight);
        System.out.println("Ваш рост: " + growth + " м");
        System.out.println("Ваш вес: " + weight + "  кг");
        System.out.println("Ваш индекс массы тела: " + indexMass + " кг/м2");
        System.out.println("В соответствии с рекомендациями ВОЗ используется следующая интерпретация показателей ИМТ:");
        System.out.println(" 16 и менее    ►  Выраженный дефицит массы тела;\n" +
                " 16 – 18,5     ►  Недостаточная масса тела (дефицит);\n" +
                " 18,5 – 25     ►  Норма;\n" +
                " 25 – 30       ►  Избыточная масса тела (состояние, предшествующее ожирению);\n" +
                " 30 – 35       ►  Ожирение 1-й степени;\n" +
                " 35 – 40       ►  Ожирение 2-й степени;\n" +
                " 40 и более    ►  Ожирение 3-й степени. ");

        System.out.println("Опираясь на таблицу, у вас:");
        if(indexMass < 16){
            System.out.println("Выраженный дефицит массы тела");
        }
        if(indexMass > 16 && indexMass <=18.5 ){
            System.out.println("Недостаточная масса тела (дефицит)");
        }
        if(indexMass > 18.5 && indexMass <=25 ){
            System.out.println("Норма");
        }
        if(indexMass > 25 && indexMass <=30 ){
            System.out.println("Избыточная масса тела (состояние, предшествующее ожирению)");
        }
        if(indexMass > 30 && indexMass <=35 ){
            System.out.println("Ожирение 1-й степени");
        }
        if(indexMass > 35 && indexMass <=40 ){
            System.out.println("Ожирение 2-й степени");
        }
        if(indexMass > 40 ){
            System.out.println("Ожирение 3-й степени");
        }












    }

}