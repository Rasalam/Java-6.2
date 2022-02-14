import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void CalculateForRegAndAmount_3_333() { //Пользователь зарегистрирован, платеж 3_333
        BonusService service = new BonusService();
        long amount = 3_333;
        boolean registered = true;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForRegAndAmount_3_334() {  //Пользователь зарегистрирован, платеж 3_334
        BonusService service = new BonusService();
        long amount = 3_334;
        boolean registered = true;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForRegAndAmount_1_666_666() {  //Пользователь зарегистрирован, платеж 1_666_666
        BonusService service = new BonusService();
        long amount = 1_666_666;
        boolean registered = true;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForRegAndAmount_1_666_667() {  //Пользователь зарегистрирован, платеж 1_666_667
        BonusService service = new BonusService();
        long amount = 1_666_667;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForRegAndAmount_1_670_001() {  //Пользователь зарегистрирован, платеж 1_670_001
        BonusService service = new BonusService();
        long amount = 1_670_001;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForUnRegAndAmount_9_999() { //Пользователь НЕ зарегистрирован, платеж 9_999
        BonusService service = new BonusService();
        long amount = 9_999;
        boolean registered = false;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForUnRegAndAmount_10_000() {  //Пользователь НЕ зарегистрирован, платеж 10_000
        BonusService service = new BonusService();
        long amount = 10_000;
        boolean registered = false;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForUnRegAndAmount_4_999_999() {  //Пользователь НЕ зарегистрирован, платеж 4_999_999
        BonusService service = new BonusService();
        long amount = 4_999_999;
        boolean registered = false;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForUnRegAndAmount_5_000_000() {  //Пользователь НЕ зарегистрирован, платеж 5_000_000
        BonusService service = new BonusService();
        long amount = 5_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateForUnRegAndAmount_5_010_000() {  //Пользователь НЕ зарегистрирован, платеж 5_010_000
        BonusService service = new BonusService();
        long amount = 5_010_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

}
