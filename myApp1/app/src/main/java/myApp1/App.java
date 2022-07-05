package myApp1;
import java.util.Scanner; //Necess�rio para utilizar o scanner

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //IDE
        /* 
        COME�A A DIGITAR E DA CTRL+SPACE PARA AUTOCOMPLETAR
        */
        
        //Coment�rio em Linha
        /* Coment�rio de bloco */
        /** Coment�rio de documenta��o */
        
        Scanner input = new Scanner(System.in); // inicia o scanner na variavel input
        
        //Variaveis
        
        int idade = 2114; //Variavel com n�mero inteiro
        float valorGasolina = 7.11f ; //Variavel com numero com casas decimais
        double valorEtanol = 4.99d; //Variavel com numero com casas decimais
        char genero = 'M'; // Variavel com 1 letra. Usa-se aspas simples
        byte idade2 = 33; // Variavel num�rica.
        boolean estaOnline = true; //Variavel booleana
        String frase = "Esta variavel utiliza aspas duplas";
        
        
        //Operadores 
        /* 
        + soma
        - subtra�aro
        / divisao
        * multiplicacao
        % resto da divisao
        */
        
        //Operadores Relacionais
        /* 
        > maior
        < menor
        >= maior ou igual
        <= menor ou igual
        == igual
        != diferente
        */
        
        //Operadores L�gicos
        /* 
        && E (and)
        || OU (or)
        ! NEGA��O (not)
        */
        
        //Entrada de dados
        int numeroCasa = input.nextInt(); //Recebe a variavel idade do usu�rio.
        float cotacaoBitcoin = input.nextFloat(); //L� um numero com ponto flutuante
        double cotacaoEuro = input.nextDouble();
        String name = input.nextLine(); // L� uma palavra.
        String codigoRua = input.next(); //L� v�rias palavras
        
        System.out.print("Ol� Mundo!"); //Exbibe o texto e deixa o cursor na msm linha
        System.out.println("Testando a parada"); // Exibe o texto e pula para a pr�xima linha
        
        //Estrutura condicional
        if(idade >= 18) {
            if(idade >= 60) {
                System.out.println("Idoso");
            }else {
                System.out.println("Maior de idade");
            }
        } else {
            System.out.println("Menor de idade");
        }
        
        int codigoProduto = 1;
        
        switch(codigoProduto){
            case 1:
                System.out.println("Coca-Cola 2lts");
                break;
            case 2:    
                System.out.println("Coca-Cola 1lts");
                break;
            default:
                System.out.println("Produto n�o cadastrado");
        }
        
    //Estruturas de Repeti��o
            
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
         
        int totalLoops = 10;
        int total = 0;
                
        while(totalLoops > 0){
            System.out.println("digite um numero: ");
            int num = input.nextInt();
               
            total = total + num;           
            totalLoops = totalLoops - 1;
            
            System.out.println("O total �: " + total);
            
        }
        
        String nomeProduto;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
        
        for(int i = 0; i < 40; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = input.nextLine();
            
            System.out.println("Digite o pre�o do produto:");
            precoCusto = input.nextFloat();
            
            System.out.println("Digite o valor de venda do produto: ");
            precoVenda = input.nextFloat();
            
            if(precoCusto == precoVenda){
                System.out.println("Venda sem margem de lucro ou perda");
            }else {
                if (precoCusto < precoVenda) {
                    System.out.println("Obteve lucro");
                }else {
                    System.out.println("Obteve prejuizo");
                    }
            }
        }
        //ORIENTA��O A OBJETO
            public static class Pessoa {

    public Pessoa() {
    String nome;
    int idade;
    float peso;
    float altura;
    
    public float calcIMC() {
        float IMC = peso / (altura * altura);
        return IMC;
    }
        }
    }

        
        
        Pessoa objetoPessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.peso = scan.nextFloat();
        
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.altura = scan.nextFloat();
        
        
        System.out.println("IMC � "+ objetoPessoa.calcularIMC());
    }


}
