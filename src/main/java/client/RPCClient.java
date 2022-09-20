package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args)  throws MalformedURLException, XmlRpcException {
        String option  = "", firstNumber="", secondNumber = "";
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        do{
            System.out.println("******MENU*******");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Divison");
            System.out.println("5.Exponente");
            System.out.println("6.Raiz");
            System.out.println("7.Consultar historial");
            System.out.println("8.salir");
            System.out.println("Seleccionar una opcion");
            System.out.println("*****************");
            option = sc.next();
            if (isNumber(option)){
                switch (Integer.parseInt(option)){
                    case 1:
                        System.out.println("SUMA");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] data = {firstNumber,secondNumber};
                        String response = (String) client.execute("Methods.suma", data);
                        System.out.println(response);
                        break;

                    case 2:
                        System.out.println("RESTA");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] dat = {firstNumber,secondNumber};
                        String respons = (String) client.execute("Methods.resta", dat);
                        System.out.println(respons);
                        break;

                    case 3:
                        System.out.println("MULTIPLICACION");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] date = {firstNumber,secondNumber};
                        String respon = (String) client.execute("Methods.multi", date);
                        System.out.println(respon);
                        break;

                    case 4:
                        System.out.println("DIVISION");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] dates = {firstNumber,secondNumber};
                        String respo = (String) client.execute("Methods.division", dates);
                        System.out.println(respo);
                        break;

                    case 5:
                        System.out.println("EXPONENTE");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] data1 = {firstNumber,secondNumber};
                        String response1 = (String) client.execute("Methods.expo", data1);
                        System.out.println(response1);
                        break;

                    case 6:
                        System.out.println("RAIZ");
                        do{
                            System.out.println("Ingrese el primer numero: ");
                            firstNumber= sc.next();
                            if (!isDouble(firstNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(firstNumber));
                        do{
                            System.out.println("Ingrese el segundo numero: ");
                            secondNumber= sc.next();
                            if (!isDouble(secondNumber))
                                System.out.println("Ingrese un numero valido.");
                        } while (!isDouble(secondNumber));
                        Object [] data2 = {firstNumber,secondNumber};
                        String response2 = (String) client.execute("Methods.raiz", data2);
                        System.out.println(response2);
                        break;

                    case 7:
                        System.out.println("CONSULTAR HISTORIAL");

                        break;

                    case 8:
                        System.out.println("SALIENDO....");
                        break;

                    default:
                        System.out.println("No existe esa opcion.");
                }
            }else{
                System.out.println("La opcion es incorrecta, Intente nuevamente ");
            }
        }while(!option.equals("8"));
    }
    public static boolean isNumber (String number){
        try{
            Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isDouble (String number){
        try{
            Double.parseDouble(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}