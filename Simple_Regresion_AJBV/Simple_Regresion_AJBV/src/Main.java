//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        data_set dataSet = data_set.datos();
        Regresion_Lineal regresionLineal =  new Regresion_Lineal(dataSet);
        System.out.println("Data spliting: ");
        regresionLineal.formula2();
        regresionLineal.formula3();
        regresionLineal.formula4();
        System.out.println("Mejor Modelo de los splitting");
        regresionLineal.MVP();

    }
}