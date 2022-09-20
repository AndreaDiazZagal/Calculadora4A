package server;

public class Methods {
    public String suma (String firstNumber, String secondNumber) {
        double fN=Double.parseDouble(firstNumber);
        double sN=Double.parseDouble(secondNumber);
        double suma = (sN) + (fN);
        return "Hola el resultado de la suma del numero "+fN+" y el numero " +sN+" es:"+suma;
    }
    public String rest (String firstNumber, String secondNumber) {
        double fN=Double.parseDouble(firstNumber);
        double sN=Double.parseDouble(secondNumber);
        double rest = (sN) - (fN);
        return "Hola el resultado de la resta  del numero "+fN+" y el numero " +sN+" es:"+ rest;
    }
    public String multi (String firstNumber, String secondNumber) {
        double fN=Double.parseDouble(firstNumber);
        double sN=Double.parseDouble(secondNumber);
        double multi = (sN) * (fN);
        return "Hola el resultado de la multiplicacion  del numero "+fN+" y el numero " +sN+" es:"+ multi;
    }
    public String division (String firstNumber, String secondNumber) {
        double fN=Double.parseDouble(firstNumber);
        double sN=Double.parseDouble(secondNumber);
        double division = (fN)/ (sN);
        return "Hola el resultado de la division  del numero "+fN+" y el numero " +sN+" es:"+ division;
    }
    public String expo (String firstNumber, String secondNumber) {
        int fN=Integer.parseInt(firstNumber);
        int sN=Integer.parseInt(secondNumber);
        String expo = String.valueOf(Math.pow(fN,sN));
        return "Hola el resultado del exponente del numero "+fN+" y el numero " +sN+" es:"+ expo;
    }
    public String raiz (String firstNumber, String secondNumber) {
        int fN=Integer.parseInt(firstNumber);
        int sN=Integer.parseInt(secondNumber);
        String raiz = String.valueOf(Math.sqrt(fN));
        return "Hola el resultado de raiz del numero "+fN+" y el numero " +sN+" es:"+ raiz;
    }
}

