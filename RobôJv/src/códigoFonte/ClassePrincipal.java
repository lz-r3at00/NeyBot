package códigoFonte;

import java.util.Scanner;
import javax.swing.JOptionPane;
import telas.FormPrincipal;

public class ClassePrincipal extends FormPrincipal{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String Pergunta = JOptionPane.showInputDialog(null, "Pode pergunta que eu deixo");
        if(Pergunta.contains("Oi")|Pergunta.contains("oi")|Pergunta.contains("Olá")|Pergunta.contains("Ola")|Pergunta.contains("olá")|Pergunta.contains("ola")|Pergunta.contains("E aí")|Pergunta.contains("E ai")){
            JOptionPane.showInputDialog(null, "oi");
        }else if (Pergunta.contains("sua idade")|Pergunta.contains("anos você")|Pergunta.contains("anos voce")|Pergunta.contains("anos vc")|Pergunta.contains("anos tu")){
             JOptionPane.showInputDialog(null, " eu tenho 31 anos");
        }else if (Pergunta.contains("seu nome")|Pergunta.contains("teu nome")){
             JOptionPane.showInputDialog(null,"Meu nome é Neymar");
        }else if (Pergunta.contains("seu nome completo")|Pergunta.contains("teu nome completo")){
             JOptionPane.showInputDialog(null,"Meu nome é Neymar da Silva Santos Júnior");
        }else if (Pergunta.contains("seu endereço")){
             JOptionPane.showInputDialog(null, "Quer saber demais em parça rsrsrsrs mas eu posso dizer que moro em paris");
        }else if(Pergunta.contains("sua cidade")){
            JOptionPane.showInputDialog(null, "Eu moro em paris na França");
        }else if(Pergunta.contains("estado civil")|Pergunta.contains("namorada")|Pergunta.contains("noiva")){
            JOptionPane.showInputDialog(null, "atualmente eu namoro com a Bruna Biancardi"); 
        }else if(Pergunta.contains("tem filhos")|Pergunta.contains("planeja ter filh")){
            JOptionPane.showInputDialog(null, "Atualmente não tenho filhos, mas minha namorada Bruna está gravida");
        }else if(Pergunta.contains("próxima copa")){
            JOptionPane.showInputDialog(null,"Não sei se irei participar mas tô torcendo pelo Brasil");
        }else if(Pergunta.contains("mais 2 centimetros pro lado")|Pergunta.contains("mais 2 cm pro lado")|Pergunta.contains("mais 2cm pro lado")|Pergunta.contains("momento mais dificil")|Pergunta.contains("pior lesão")|Pergunta.contains("momento mais difícil")){
            JOptionPane.showInputDialog(null, " foi quando eu me lesionei e se a pancada fosse mais 2 centimetros pro lado... infelizmente eu não poderia mais andar");
        }else if(Pergunta.contains("cai muito")|Pergunta.contains("lesiona muito")){
            JOptionPane.showInputDialog(null, " é porque os caras acabam quebrando quando não conseguem parar o melhor, e aí começam a me quebrar né!!");
        }else{
            JOptionPane.showInputDialog(null,"Não entendi a pergunta cara, faz outra aí moral");
        }
    }
}


