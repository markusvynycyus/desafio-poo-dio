## README

### Desafio de Programação Orientada a Objetos (POO) em Java

Este projeto foi desenvolvido como parte de um desafio para praticar os conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando a linguagem Java. O objetivo principal foi aplicar os pilares da POO - Abstração, Encapsulamento, Herança e Polimorfismo - de maneira prática e eficiente.

### Estrutura do Projeto

O projeto consiste em várias classes que modelam entidades e conceitos relacionados a um bootcamp de desenvolvimento. A seguir, são apresentadas as principais classes desenvolvidas:

1. **Bootcamp**
   - Representa um bootcamp de desenvolvimento.
   - Contém atributos como nome, descrição, datas de início e fim, e coleções de desenvolvedores inscritos e conteúdos associados.
   - Implementa métodos para gerenciar inscrições de desenvolvedores e adicionar conteúdos ao bootcamp.

2. **Conteudo**
   - Classe abstrata que define a estrutura básica para diferentes tipos de conteúdos.
   - Define métodos abstratos para calcular a experiência (XP) associada a cada tipo de conteúdo.
   - Possui atributos como título e descrição, com métodos para acesso e modificação desses atributos.

3. **Curso**
   - Subclasse de `Conteudo` que representa um curso específico dentro do bootcamp.
   - Inclui um atributo adicional `cargaHoraria` que influencia no cálculo da experiência (XP) do curso.
   - Implementa o método `calcularXp()` para calcular a XP com base na carga horária do curso.

4. **Mentoria**
   - Subclasse de `Conteudo` que representa uma sessão de mentoria dentro do bootcamp.
   - Inclui um atributo `data` para armazenar a data da mentoria.
   - Implementa o método `calcularXp()` para retornar uma XP fixa associada à participação em uma mentoria.

5. **Dev**
   - Representa um desenvolvedor participante do bootcamp.
   - Mantém coleções de conteúdos nos quais o desenvolvedor está inscrito e conteúdos que foram concluídos.
   - Implementa métodos para inscrever o desenvolvedor em um bootcamp, progredir nos conteúdos inscritos e calcular a XP total obtida.

### Melhorias Implementadas

Durante o desenvolvimento, foram implementadas melhorias significativas nas classes existentes:

- **Encapsulamento:** Atributos foram protegidos adequadamente com modificadores de acesso privado e métodos públicos para acesso controlado.
  
- **Abstração:** Utilização de classes abstratas (`Conteudo`) para definir a estrutura base e métodos abstratos para comportamentos específicos que são implementados pelas subclasses (`Curso`, `Mentoria`).

- **Herança:** Utilização de herança para especializar classes (`Curso` e `Mentoria`) que compartilham características e comportamentos da classe base (`Conteudo`).

- **Polimorfismo:** Capacidade de tratar objetos de classes diferentes de maneira uniforme através de métodos polimórficos como `calcularXp()`.

### Exemplo de Uso (Main.java)

Para demonstrar o funcionamento das classes desenvolvidas, foi criada uma classe `Main` que exemplifica a utilização dos conceitos implementados:

```java
public class Main {
    public static void main(String[] args) {
        // Criação de cursos e mentoria
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        // Criação de um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        // Criação de desenvolvedores e interações
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
```

### Como Executar

Para executar o código fornecido, siga os passos abaixo:

1. Clone o repositório em sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento preferido (como IntelliJ IDEA, Eclipse, etc.).
3. Certifique-se de que o JDK (Java Development Kit) esteja configurado corretamente em seu ambiente.
4. Execute a classe `Main.java` para visualizar a saída no console.

### Conclusão

Este projeto não só demonstra a aplicação prática dos conceitos fundamentais da Programação Orientada a Objetos em Java, mas também ilustra a importância de um bom design orientado a objetos para a criação de sistemas flexíveis, escaláveis e fáceis de manter. As melhorias implementadas garantem um código mais coeso, modular e adaptável a futuras evoluções e requisitos do projeto.

---

Esse README resume as principais informações sobre o projeto desenvolvido, destacando as melhorias implementadas e fornecendo instruções básicas para execução e compreensão do código.
