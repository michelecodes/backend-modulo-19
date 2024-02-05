import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Obter a classe da Pessoa
        Class<?> classePessoa = Pessoa.class;

        // Verificar se a anotação Tabela está presente
        if (classePessoa.isAnnotationPresent(Tabela.class)) {
            // Obter a instância da anotação Tabela
            Tabela tabelaAnnotation = classePessoa.getAnnotation(Tabela.class);

            // Imprimir o nome da tabela
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Pessoa.");
        }
    }
}
