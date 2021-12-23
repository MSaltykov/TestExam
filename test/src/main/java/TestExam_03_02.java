/**
 * Это решение лежит в интернете, но на мой взгляд оно корявое.
 * Данное решение не умеет работать с данными получаемыми от пользователя,
 * оно умеет конвертировать только из градусов Цельсия в остальные варианты,
 * так же в этом решении нет проверки валидности введённых значений.
 */

public interface TestExam_03_02 {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements TestExam_03_02 {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements TestExam_03_02 {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements TestExam_03_02 {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }
}

