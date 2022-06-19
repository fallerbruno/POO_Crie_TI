package modelos;

/**
 *
 * @author faller
 */
public class ContaBanco {

    private String titular;
    private String agencia;
    private String conta;
    private String pix;
    private double saldo;
    private double chequeEspecial;

    public ContaBanco(String titular, String agencia, String conta, double saldo, double chequeEspecial, String pix) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.pix = pix;
    }

//    public ContaBanco() {
//        
//    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void Saque(double saque) {
        if (this.saldo >= (saque - chequeEspecial)) {
            this.saldo -= saque;
            System.out.println("saque realizado com sucesso de " + saque + "\n"
                    + "Conta: " + this.conta + "\n"
                    + "Agencia: " + agencia + "\n"
                    + "Titular: " + titular + "\n"
                    + "Seu saldo atual é: " + this.saldo);
        } else {
            Mensagem.erro("Saldo insuficiente para saque de: " + saque);
            System.out.println("seu saldo atual é " + this.saldo + "\n"
                    + "Conta: " + this.conta + "\n"
                    + "Agencia: " + agencia + "\n"
                    + "Titular: " + titular);
        }
    }

    public void Pix(ContaBanco contaRecebimento[], String fazerPix) {
        int sucess = 0;
        for (int i = 0; i < contaRecebimento.length; i++) {
            if (fazerPix.equals(contaRecebimento[i].getPix()) && (!fazerPix.equals(pix))) {
                Transferir(contaRecebimento[i], Entrada.leiaDouble("Digite o valor que deseja fazer o PIX"));
                sucess++;
            }
        }
        if (sucess == 0) {
            System.out.println("Chave Pix Invalida");
        }
    }

    public void Deposito(double deposito) {
        this.saldo += deposito;
        System.out.println("Deposito realizado com sucesso do valor de: " + deposito + "\n"
                + "Conta: " + this.conta + "\n"
                + "Agencia: " + agencia + "\n"
                + "Titular: " + titular);
    }

    public void Transferir(ContaBanco contaRecebimento, double transferencia) {
        if (saldo >= (transferencia - chequeEspecial)) {
            saldo -= transferencia;
            contaRecebimento.setSaldo(contaRecebimento.getSaldo() + transferencia);
            System.out.println("Transferencia realizada com sucesso " + transferencia + " Entre " + conta + " e " + contaRecebimento.getConta());
            System.out.println("saldo conta 1 " + saldo + " saldo conta 2 " + contaRecebimento.getSaldo());

        } else {
            System.out.println("Saldo insuficente para tranferencia");
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("-------------------------------");
        retorno.append("\n");
        retorno.append("Seu saldo atual: ");
        retorno.append(saldo);
        retorno.append("\n");
        retorno.append("conta: ");
        retorno.append(conta);
        retorno.append("\n");
        retorno.append("Agencia: ");
        retorno.append(agencia);
        retorno.append("\n");
        retorno.append("titular: ");
        retorno.append(titular);
        retorno.append("\n");
        retorno.append("--------------------------------");
        return retorno.toString();

    }

}
