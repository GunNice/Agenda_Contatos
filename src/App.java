import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner leia = new Scanner(System.in);
    int numeroContatos;
    
    System.out.println("Quantos contatos deseja Salvar ? ");
    numeroContatos = leia.nextInt();

    AgendaContatos [] lista = new AgendaContatos [numeroContatos];

    for (int cont = 0; cont < numeroContatos; cont++) {
          /* Limpa o terminal */
              System.out.print("\033[H\033[2J");
              System.out.flush();
          /* Limpa o terminal */
       
    AgendaContatos contato = new AgendaContatos();
    System.out.println("Informe o nome do contato:");
    contato.setNome(leia.next());

    System.out.println("Informe o sobrenome do contato:");
    contato.setSobreNome(leia.next());

    System.out.println("Informe Nº do contato:");
    contato.setTelefoneContato(leia.next());

    lista [cont] = contato;
    }
     /* Limpa o terminal */
     System.out.print("\033[H\033[2J");
     System.out.flush();
     /* Limpa o terminal */

    System.out.println("---------- Seus Contatos Salvos -----------");
    for (AgendaContatos agendaContatos : lista) {
    
        System.out.println( agendaContatos.getNome() + " " + agendaContatos.getSobreNome() + " " + agendaContatos.getTelefoneContato());
    }
 }
}
