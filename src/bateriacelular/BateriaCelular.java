package bateriacelular;

public class BateriaCelular {

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("Caso invalido!");
        }
    }

    public void carregar(int nivel) {
        //aumenta a bateria(max 100)
        int bateria = getNivel() + nivel;
        if (bateria <= 100) {
            setNivel(bateria);
            System.out.print("\nCarregando... ");
            System.out.print("\nA bateria foi carregada em "+getNivel()+"% !");
        } else {
            System.out.print("\nO limite de caregamento é só até 100% !");
        }

    }

    public void usar(int nivel2) {
        //diminui a bateria(min 0)
        int bateria = getNivel() - nivel2;

        if (bateria >= 0) {
            setNivel(bateria);
            System.out.print("\nUsando Celular!");
            System.out.print("\nBateria descarregando!");
            System.out.println("\nA bateria esta em: "+ getNivel()+"%");
        } else {
            System.out.print("\nO limite de uso é so até 0% !");
        }
    }

    public void status(int valor) {
        //mostrar o status da bateria
        
        valor = getNivel();
        
        if (valor < 20) {
            System.out.println("\nBateria fraca!");
        } else if (valor > 21 && valor < 70) {
            System.out.println("\nBateria media!");
        } else if (valor > 71 && valor < 100) {
            System.out.println("\nBateria Alta!");
        }

    }

}
