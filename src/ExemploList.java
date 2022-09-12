import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
    //List<Double> notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<>(List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //notas.add(1d);
        //notas.remove(5d);
        //System.out.println(notas);
        //System.out.println("Crie uma lista e adicione as sete notas: ");

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) System.out.println(nota);
    }
}
