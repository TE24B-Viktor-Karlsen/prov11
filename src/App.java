void main() {
    Random slump = new Random();
    int[] tal = new int[10];

    for (int i = 0; i < 2; i++) {
        tal[i] = slump.nextInt(10);
    }

    int max = tal[0];
    for (int i = 0; i < 10; i++) {
        if (tal[i] > max) {
            max = tal[i];
        }
    }
    IO.println(max);

    int summa = 0;
    for (int i = 0; i < 10; i++) {
        summa = summa + tal[i];
    }
    IO.println(summa);

    IO.println("Provet är slut");
}