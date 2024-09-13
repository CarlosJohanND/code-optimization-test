import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        /*Creamos las contantes que seran los ratios de las taxes */
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final double TAX_THRESHOLD = 50;

        /*Creamos dos arrays que contendran el precio del prodeucto y las taxes */
        double productPrice[] = new double[2];
        double tax[] = new double[2]; 

        /*Creamos un for para circular los datos de los arrays */
        for (int i = 0; i < 2; i++){
            /*El usuario escribira el valor del producto y se guardara en al array */
            System.out.println("Escriba valor del producto: " + i);
            productPrice[i] = scanner.nextDouble();
            /*En este caso decidi que los tax rate sean dependients del precio, siendo tax hight si son menores a 100 y tax low si no */
            if(productPrice[i] <= 100){
                tax[i] = productPrice[i] * TAX_RATE_HIGH;
            }else{
                tax[i] = productPrice[i] * TAX_RATE_LOW;
            }
        }
        /*Sumamos los valores que conseguimos en el for */
        double totalTax = tax[0] + tax[1];
        
        /*Si el total de taxes es mayor a 50 nos avisara y nos mostrara el valor */
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
