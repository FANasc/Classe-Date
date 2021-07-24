package one.innovation.digital;

/********************************************************************
 * - Objetivo: 1) Descobrir o Time in Millis da data de nascimento;
 *             2) Converter em um objeto Date e
 *             3) Essa data é anterior ou posterior a 15.05.2010
 * - Autor   : Fernando
 * - Data    : 23.07.2021
 ********************************************************************/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    private static Date data2;

    public static void main(String[] args) {

        // *** Data de nascimento ***

        // criando um objeto Calendar
        Calendar c1 = Calendar.getInstance();

        // informar o mês (Obs.: mês de 0 a 11 - onde 0 é janeiro)
        c1.set(Calendar.MONTH,5);

        // informar o dia
        c1.set(Calendar.DATE,30);

        // informar o ano
        c1.set(Calendar.YEAR,1969);

        // criando um objeto data com hora especificada.
        Date dataNascimento = c1.getTime();

        System.out.println("Data de Nascimento    : " + dataNascimento);
        System.out.println("Data em millissegundos: " + dataNascimento.getTime());

        // *** 15.05.2010 ***

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data2 = format.parse("15/05/2010");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Data2                  : " + data2);
        System.out.println("Data2 em millissegundos: " + data2.getTime());

        // Data de nascimento em relação a 15.05.2010

        int compara = dataNascimento.compareTo(data2);

        if (compara == -1){
            System.out.println("Data de Nascimento: " + dataNascimento + " é anterior a " + data2);
        }
        else {
                if (compara == 0) {
                    System.out.println("Data de Nascimento: " + dataNascimento + " é igual a " + data2);
                } else {
                    System.out.println("Data de Nascimento: " + dataNascimento + " é posterior a " + data2);
                }
        }
    }
}