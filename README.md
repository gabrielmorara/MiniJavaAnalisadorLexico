Analisador Lexico MiniJava 
========
#### Disciplina: Compiladores 

#####Alunos : 

 * Gabriel Morara Ribeiro
 * Elias Soares
 * Leonardo Maximino 
  
MiniJava é um subconjunto da linguagem Java, usado para ensino de projeto e implementação de compiladores. Como é um subconjunto, todo programa MiniJava é um programa Java válido que pode ser executado pela JVM, fornecendo um meio simples dos alunos testarem a saída dos seus compiladores sem ter um compilador MiniJava disponível.

O objetivo deste trabalho e realizar a geracao de Tokens com base em um 
input, e como saida em outpu.txt contento a tokenização

O analisador léxico foi criado usando somente a lingaugem JAVA sem nenhuma biblioteca, neste analisador e possivel identifica os seguintes tipos de Tokens :
 * Palavras-chave  class, public, extends, static, void, int, boolean, while, if, else, return, false, true, this, new
 * Operadores &&, ==, !=, <, <=, >, >=, +, -, *, /, %, !, =
 * Delimitadores ; . , ( ) { } [ ]
 * Identificadores - um identificador começa com uma letra ou underline e é seguido por qualquer quantidade de letras, underline e dígitos. Apenas letras entre A/a e Z/z são permitidos, há diferença entre maiúscula e minúscula. Palavras-chave não são identificadores
 * Literais Inteiros - uma sequência de dígitos iniciada com qualquer um dos dígitos entre 1 e 9 e seguida por qualquer número de dígitos entre 0 e 9. O dígito 0 também é um inteiro.
 
 Obs.: Comentários e whitespace não tem significado algum para o compilador entao sao descartados.

Gramática do Mini Java:
http://www.cambridge.org/resources/052182060X/MCIIJ2e/grammar.htm#prod9

### Pré-requisitos
O que você precisa para executar : 

* Instale a versão mais recente do [Java] (https://java.com)
* Instale a versão mais recente do [Maven] (https://maven.apache.org/download.html).
* Instale a versão mais recente do InteliJ IDEA.
* Pode ser necessário definir o seu JAVA_HOME.


###Executando
Para executar o projeto basta abrir o Intellij e selecionar o projeto, depois navegue ate o arquivo ..\src\main\java\Main.java,
no metodo main onde contem somente uma linha, para analisar um arquivo diferente basta colocar o caminho absoluto do arquivo no parametro do metodo readFileAndWriteOutput como String 
que esta na classe Main e depois executar, o output sera gerado no arquivo ../src/output/output.txt contento a tokenização.
 
###Controle de versão
Usamos Git para versionar.