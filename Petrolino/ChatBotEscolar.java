// Herança
class ChatBotEscolar extends Bot {

    public ChatBotEscolar(String nome) {
        super(nome);
    }

    // Polimorfismo
    @Override
    public String responder(String pergunta) {

        pergunta = pergunta.toLowerCase();

        if (pergunta.contains("horario")) {
            return "O horário das aulas é das 7h às 12h.";
        }

        if (pergunta.contains("prova")) {
            return "Consulte seu professor para informações sobre provas.";
        }

        if (pergunta.contains("laboratorio")) {
            return "O laboratório funciona durante os almoços de sexta-feira e aulas práticas.";
        }

        if (pergunta.contains("curso")) {
            return "Temos cursos técnicos em Informática, Guia de Turismo e Enfermagem.";
        }

        if (pergunta.contains("oi") || pergunta.contains("olá")) {
            return "Olá! Como posso ajudar?";
        }

        return "Desculpe, não entendi sua pergunta.";
    }
}