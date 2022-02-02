package principal;

public class Punto {

    private double a=0;
    private double b=0;


    public Punto(){

    }


    public void igual(Punto punto1, Punto punto2){

       if(punto1.equals(punto2)){

           System.out.println("Ambos puntos son iguales");
       }


    }



    public double distancia(){

        return Math.sqrt(a*a + b*b);

    }

    public double distanciaConOtroPunto(Punto punto1){

        return Math.sqrt(Math.pow((punto1.a-a),2) + Math.pow(punto1.b-b, 2));


    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
