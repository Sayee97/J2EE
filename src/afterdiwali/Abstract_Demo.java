package afterdiwali;

abstract class Car {

    abstract int car_average();

    public void display() {
        System.out.println("The average is displayed");
    }
}

class audi extends Car {

    @Override
    int car_average() {
        return 25;
    }
}

class bmw extends Car {

    @Override
    int car_average() {
        return 18;
    }

}

class ferrari extends Car {

    @Override
    int car_average() {
        return 10;
    }
}

public class Abstract_Demo {

    public static void main(String[] args) {
        Car cd = new audi();
        System.out.println(cd.car_average());
        cd.display();
        cd = new bmw();
        System.out.println(cd.car_average());
        cd.display();
        cd = new ferrari();
        System.out.println(cd.car_average());
        cd.display();
        Car m = new Car() {
            @Override
            int car_average() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        m.display();

    }
}
