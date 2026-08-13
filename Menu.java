import java.util.Scanner;

public class Menu{
    public static void main(String[] arg){
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("ingrsar la dimension de la matriz");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatrices [][] MO = new ObjMatrices[n][n];
        while (continuar){
            System.out.println("Que desea realizar: "  );
            System.out.println("1:llenar matriz de enteros");
            System.out.println("2. mostrar MAtriz de enteros"); 
            System.out.println("3 llenar matriz objetual");
            System.out.println("4 mostrar matriz objetual"); 
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    ME = m.LlenarMatrizEntera(ME);
                    break;
                case 2: 
                     m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.LlenarMatrizObjetual(MO);
                    break;
                case 4: 
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println(" esta la opcion que no existe ");
                    break;


                
            }
        }
        sc.close();
    }
    
}