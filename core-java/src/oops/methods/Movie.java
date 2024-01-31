package oops.methods;

public class Movie {
    static void staticMethod() {
        System.out.println("static methods");
    }

    void instanceMethod1() {
        System.out.println("instance method 1");

        //call static method
        Movie.staticMethod();
        staticMethod();

        //call instance method
        instanceMethod2();
        this.instanceMethod2();
    }

    void instanceMethod2() {
        System.out.println("instance method 2");
    }

    public static void main(String[] args) {
        //call instance method
        Movie movie = new Movie();
        movie.instanceMethod1();

        //call static method
        Movie.staticMethod();
        staticMethod();
    }


}
