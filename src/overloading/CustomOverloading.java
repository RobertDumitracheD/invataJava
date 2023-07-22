package overloading;

public class CustomOverloading {


    public static void main(String[] args) {
        //Method overloading este procesul prin care definim mai multe metode cu acelasi nume dar cu nr de parametrii diferiti
        //poate fi schimbat si RETURN Type-ul
        System.out.println("Aria patratului este " +calculate(5));
        System.out.println("Aria dreptunghiului este " +calculate(5,6));
        System.out.println("Aria cercului este " + calculate(5,7,4));

        //variabila initializata cu valoarea returnata din metoda calculate(cu un singur parametru);
        int squareArea = calculate(5);
        System.out.println("Valoare variabile squareArea este " + squareArea);
    }


    public static int calculate(int l) {
        return l*l;
    }

    public static int calculate(int l, int L) {
        return L*l;
    }

    public static int calculate(int r, int h, int i) {
        return r*i*h;
    }

}
