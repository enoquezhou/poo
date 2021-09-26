public class Empregado{
    String nome;
    int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public void setSalario (double salario){
        this.salario =salario;
    }

    public void setTipo (int tipo){
        this.tipo = tipo;
    }

    public void setBonus (double bonus){
        this.bonus = bonus;
    }

    public double calculaSalario(){
        if (tipo ==1){
            return salario;
        }
        else if (tipo ==2){
            return salario + salario * comissao;
        }
        else if (tipo ==3){
            return salario +bonus;
        }
        return 0;
    }

    //camal case
    public void setNome (String nome){
            this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setIdadE (int idade){
            this.idade = idade;
        }

    public int getIdade (){
        return this.idade;
    }
}
// untracked  git add -> staged
// unmodified
// modified
// Staged