import javax.swing.JOptionPane;

public class  Main{

    public static void main(String[] args) {

        ChatBotEscolar bot = new ChatBotEscolar("Petrolino");

        JOptionPane.showMessageDialog(
                null,
                "Bem-vindo ao " + bot.getNome() + "!"
        );

        while (true) {

            String pergunta = JOptionPane.showInputDialog(
                    null,
                    "Digite sua pergunta:\n(Digite 'sair' para encerrar)"
            );

            if (pergunta == null || pergunta.equalsIgnoreCase("sair")) {
                break;
            }

            String resposta = bot.responder(pergunta);

            JOptionPane.showMessageDialog(
                    null,
                    resposta,
                    bot.getNome(),
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        JOptionPane.showMessageDialog(
                null,
                "Até logo!"
        );
    }
}