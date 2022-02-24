package dio.com;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxasDuasParcelas(){
        return 0.3;
    }
    public static double getTaxasTresParcelas(){
        return 0.6;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){
            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println("Valor final do emprestimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3){
            double valorfinal = valor + (valor *getTaxasTresParcelas());
            System.out.println("Valor final do emprestimo para 3 parcelas: R$ "+ valorfinal);
        } else {
            System.out.println("Quantidades de parcelas não aceita.");
        }
    }
}
