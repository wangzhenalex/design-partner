public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee king = new Employee();
        king.setName("King");
        Car car = new Car();
        car.setNumber("FBW 381");
        king.setCar(car);
        Employee cloneKing = (Employee) king.deepClone();
        System.out.println("King == CloneKing:" + (king == cloneKing));
        System.out.println("King.car == CloneKing.car:" + (king.getCar() == cloneKing.getCar()));

        System.out.println("=====================================");
        Employee clone = (Employee)king.clone();
        System.out.println("King == CloneKing:" + (king == clone));
        System.out.println("King.car == CloneKing.car:" + (king.getCar() == clone.getCar()));


    }
}
