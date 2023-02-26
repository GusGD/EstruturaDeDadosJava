package one.fila;

public class Main {

  public static void main(String[] args) {
    Fila<String> minhaFila = new Fila<String>();

    minhaFila.enqueue("Primeiro");
    minhaFila.enqueue("Segundo");
    minhaFila.enqueue("Terceiro");
    minhaFila.enqueue("Quarto");
    System.out.println(minhaFila);

    System.out.println(minhaFila.dequeue());
    System.out.println(minhaFila);

    minhaFila.enqueue("ultimo");
    System.out.println(minhaFila);
    System.out.println(minhaFila.first());
  }
}
