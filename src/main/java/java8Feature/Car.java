package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public  class Car {
    //Supplier(供应者) 是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }



    public static void main(String[] args) {

        /**方法引用使用一对冒号 :: */
        //构造器引用：它的语法是Class::new，或者更一般的Class< T >
        final Car car = Car.create( Car::new );
        final List<Car> cars = Arrays.asList( car );

        //静态方法引用：它的语法是Class::static_method，实例如下：
        cars.forEach( Car::collide );

        //特定类的任意对象的方法引用：它的语法是Class::method实例如下：
        cars.forEach( Car::repair );

        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

        //lambda方法
        cars.forEach(p-> System.out.println(p));


    }
}
