public class Main {
    public static void main(String[] args) {
        Log banco = Log.getInstance();
        System.out.println(banco.transferenciaPIX());
        System.out.println(banco.transferenciaPIX());
        System.out.println(banco.transferenciaPIX());
        System.out.println(banco.deposito());
        System.out.println(banco.saque());
        System.out.println(banco.report());
    }
}
