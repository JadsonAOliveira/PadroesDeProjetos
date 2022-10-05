package academico.ifs.edu.br.patterns.prototype;

public class Main {
    public static void main(String[] args) {

        bookPrototype first = new bookPrototype();
        first.setNomeDedicatoria("Jorge Amado");

        bookPrototype clone1 = (bookPrototype)first.clone();
        bookPrototype clone2 = (bookPrototype)first.clone();
        bookPrototype clone3 = (bookPrototype)first.clone();

        clone1.setNomeDedicatoria("Jean");
        clone2.setNomeDedicatoria("Flaygner");
        clone3.setNomeDedicatoria("Alfredo");
        System.out.println(first.exibirImpressao());
        System.out.println(clone1.exibirImpressao());
        System.out.println(clone2.exibirImpressao());
        System.out.println(clone3.exibirImpressao());
    }
}

