public class App {

    public static void main(String[] args) {
        Leitura lerArquivo = new Leitura();
       
        char[] ct_10 =  lerArquivo.ler("casos-de-teste/ct_10.txt");
        char[] ct_100 = lerArquivo.ler("casos-de-teste/ct_100.txt");
        char[] ct_1000 = lerArquivo.ler("casos-de-teste/ct_1000.txt");
        char[] ct_10000 = lerArquivo.ler("casos-de-teste/ct_10000.txt");
        char[] ct_100000 = lerArquivo.ler("casos-de-teste/ct_100000.txt");
        char[] ct_1000000 = lerArquivo.ler("casos-de-teste/ct_1000000.txt");
        char[] ct_2000000 = lerArquivo.ler("casos-de-teste/ct_2000000.txt");
        char[] ct_teste = lerArquivo.ler("casos-de-teste/ct_teste.txt");

        DNA dna10 = new DNA(ct_10);
        DNA dna100 = new DNA(ct_100);
        DNA dna1000 = new DNA(ct_1000);
        DNA dna10000 = new DNA(ct_10000);
        DNA dna100000 = new DNA(ct_100000);
        DNA dna1000000 = new DNA(ct_1000000);
        DNA dna2000000 = new DNA(ct_2000000);
        DNA dnaTeste = new DNA(ct_teste);

        dna10.comprimir();
        dna100.comprimir();
        dna1000.comprimir();
        dna10000.comprimir();
        dna100000.comprimir();
        dna1000000.comprimir();
        dna2000000.comprimir();
        dnaTeste.comprimir();

        System.out.println("ct_10: " + dna10.toString());
        System.out.println("ct_100: " + dna100.toString());
        System.out.println("ct_1000: " + dna1000.toString());
        System.out.println("ct_10000: " + dna10000.toString());
        System.out.println("ct_100000: " + dna100000.toString());
        System.out.println("ct_1000000: " + dna1000000.toString());
        System.out.println("ct_2000000: " + dna2000000.toString());
        System.out.println("Teste: " + dnaTeste.toString());

    }

}
