package academico.ifs.edu.br.patterns.singleton;

public class Log {
    protected int log;

    private static Log instance;

    private Log(){
    }
    public static Log getInstance(){
        if(instance == null)
            instance = new Log();
        return instance;
    }
    public String saque() {
        ++log;
        return new String("SAQUE REALIZADO COM SUCESSO");
    }

    public String deposito(){
        ++log;
        return new String("DEPOSITO REALIZADO COM SUCESSO");
    }

    public String transferencia(){
        ++log;
        return new String("TRANSFERENCIA REALIZADA COM SUCESSO");
    }
    public String report(){
        return new String("Total de logs no sistema bancario: " + log);
    }

}

