public class Store {
    public static void main(String[] args) {

        /*Usamos arrays de constantes pera almacenar los precios, las cantidades de los productos y los totales */
        final int precio[] = {15, 10, 5};
        final int amount[] = {2, 3, 4};
        final int total[] = new int[3];
        /*Creamos una constante para revisar si las ventas fueron suficientes*/
        final int salescheck = 50;

        int totalSales = 0;

        /*usamos un bucle  para calcular el total de las ventas usando los arrays que creamos */
        for (int i = 0; i < 3; i++){
            total[i] = precio[i] * amount[i];
            /*acumulamos el resultado de los totales en la variante totalSales */
            totalSales += total[i];
        }

        /*usamos condicionales y la constante salescheck para revisar si nuestras ventas fueron buenas o bajas */
        if (totalSales > salescheck) {
            System.out.println("Good sales performance: " + totalSales);
        } else {
            System.out.println("Low sales performance: " + totalSales);
        }
    }
}