package academico.ifs.edu.br.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Log banco = Log.getInstance();
        System.out.println(banco.transferencia());
        System.out.println(banco.transferencia());
        System.out.println(banco.transferencia());
        System.out.println(banco.deposito());
        System.out.println(banco.saque());
        System.out.println(banco.report());
    }
}
