# Java — Estudos e Exercícios

Repositório com meus estudos de **Java**, organizado por tópico e seguindo a ordem em que fui aprendendo cada assunto. Cada pasta corresponde a um tema e contém tanto os exemplos das aulas quanto exercícios que resolvi por conta própria para fixar o conteúdo.

Todo o código é escrito à mão, sem frameworks — o foco aqui é a base da linguagem: sintaxe, lógica de programação e orientação a objetos.

## Tecnologias

- Java 21 (JDK)
- Sem dependências externas — compila e roda com `javac` / `java`

## Como rodar

Cada pasta é um *package*. Para compilar e executar qualquer exercício:

```bash
# Compila o package escolhido para a pasta bin/
javac -encoding UTF-8 -d bin metodos/*.java

# Executa a classe desejada (nome completo: package.Classe)
java -cp bin metodos.Ex3BancoMetodos
```

Trocando `metodos` pelo package e `Ex3BancoMetodos` pela classe, o mesmo comando serve para qualquer exercício do repositório.

## Estrutura

Os tópicos estão listados na ordem de aprendizado — do básico ao mais avançado:

| Package | Tópico |
| --- | --- |
| [`numerosaleatorios/`](numerosaleatorios/) | Classe `Random` — sorteios, médias e simulador de dado |
| [`entradadados/`](entradadados/) | Classe `Scanner` — leitura de dados do teclado |
| [`constantes/`](constantes/) | `final` — constantes e valores imutáveis |
| [`operadoresatribuicao/`](operadoresatribuicao/) | Operadores de atribuição (`+=`, `-=`, `*=`, `/=`) |
| [`operadoresrelacionais/`](operadoresrelacionais/) | Operadores relacionais e comparações |
| [`incrementodecremento/`](incrementodecremento/) | Incremento e decremento, pré e pós-fixado |
| [`condicionalifelse/`](condicionalifelse/) | Estruturas condicionais `if` / `else if` / `else` |
| [`ternario/`](ternario/) | Operador ternário |
| [`loopwhile/`](loopwhile/) | Laço de repetição `while` |
| [`revisaogeral/`](revisaogeral/) | Revisão geral — exercícios combinando todos os tópicos acima |
| [`orientacaoobjetos/`](orientacaoobjetos/) | POO — classes, atributos e instanciação de objetos |
| [`metodos/`](metodos/) | POO — métodos, parâmetros e retorno |

## Convenções

- **Packages** em minúsculo, sem acentos (padrão Java).
- **Classes e arquivos** em `PascalCase`, com o nome do arquivo sempre igual ao da classe pública.
- Arquivos com prefixo `Ex1`, `Ex2`... são exercícios resolvidos; os demais são exemplos e classes de apoio das aulas.

## Outros repositórios

Estes estudos fazem parte da minha formação em programação — também tenho repositórios dedicados a **Python** e **HTML/CSS**.

---

Repositório em constante atualização, conforme avanço nos estudos.
