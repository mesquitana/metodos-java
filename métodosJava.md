# Entendendo métodos Java

### Conceituação de métodos

É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

### Criação do método

Tem como padrão:

<'visibilidade'><'tipo'><'modificador'>retorno nome(<'parâmetros'>)<'exceções'>corpo'{}'

Entre aspas simples são parâmetros opcionais. Os parênteses são obrigatórios também.

onde:

*V*:"public", "protected" ou "private"

<p>Tem a ver com orientação a objeto</p>

T: concreto ou abstrato

<p>Orientação a objeto</p>

M: "static" ou "final"

<p>Orientação a objeto</p>

*R*: tipo de dado ou "void"

<p>qualquer um dos tipos de dados conhecidos (short, long, ...) ou objeto. Void executa e não retorna nada</p>

*N*: nome que é fornecido ao método

*P*: parâmetros que pode receber

<p>se não tiver parâmetro, fica só o parênteses fechado</p>

E: exceções que pode lançar

*C*: código que possui ou vazio

<p>orientação a objeto. É o que fica dentro dos colchetes. Se não houver colchetes, por exemplo se for: 'public abstract void executar();', ele não retorna nada (por causa do void) e tem um corpo vazio</p>
<p>Em 'public int verificarDistancia(int coordenada1, int coordenada2){}', os parâmetros são do tipo primitivos. Em 'public void alterarFabricante(Fabricante fabricante){}', possui um parâmetro complexo, é uma entidade, um objeto.
**public static R N(p){}** será a forma mais utilizada

Os itens em *itálico* são os mais utilizados.

### Utilização

Pra executar um método é preciso CHAMAR o método a partir de uma classe ou um objeto. Ex:
`nome_da_classe.nome_do_método();` ou `nome_da_classe.nome_do_metodo(...);`
`nome_do_objeto.nome_do_método();` ou `nome_do_objeto.nome_do_metodo(...);`

Exemplo:

`Math.random();` ou `Math.sqrt(4);`: Classe do Java (Math) chama o método (random/sqrt)

`usuario.getEmail();` ou `usuario.alterarEndereço(endereço)`: Objeto(usuario) chama o método(getEmail/alterarEndereço)

O que difere classe de objeto?

<p>Por padrão, na linguagem Java, classe tem sempre a primeira letra maiúscula, enquanto os objetos tem a primeira letra minúscula </p>

### Particularidades

- Assinatura: forma de identificar unicamente o método. Ass = nome + parâmetros. Ex:

**Método**: `public double calcularTotalVenda(double precoItem1,double precoItem2, double precoItem3){...}`

**Assinatura**: `calcularTotalVenda(double precoItem1,double precoItem2, double precoItem3)`

- Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos. Construtor cria objetos e o destrutor é o método que auxilia na destruição de objetos

- Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou uma classe.

- Passagem de parâmetros:
<p>-Por valor (cópia). Exemplo:
`int i = 10;

public void fazerAlgo(int i){
	i = i+10;
	System.out.println("Valor de i dentro: " + i);
}
System.out.println("Valor de i fora: " + i);`</p>

<p>-Por referência (endereço) </p>

### Boas práticas

- Nomes devem ser descritivos mas curtos
- Notação camelo
- Deve possuir entre 80 e 120 linhas
- Evite lista de parâmetros longas
- Visibilidades adequadas

## Sobrecarga

### Conceituação

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome. O mesmo método vai se comportar de maneira diferente (mudando seu parâmetro), conforme necessidade, preservando seu nome.

### Criação

Alterar a assinatura do método.

converterParaInteiro(float f)

converterParaInteiro(double d)

converterParaInteiro(String s)

converterParaInteiro(float f, RoundType rd) --roundtype é arredondamento, se para baixo ou para cima

converterParaInteiro(String s, RoundType rd)

**converterParaInteiro(RoundType rd, String s)** --mudou a lista de parâmetros, tem sobrecarga

**converterParaInteiro()**

### Curiosidade

Sobrecarga x Sobrescrita

Sobrescrita tem relação com orientação a objeto. Os dois atuam sobre os métodos, mas trabalham de forma diferente.

## Retornos

É uma instrução de interrupção, atrelado ao método. Simbologia: return

### Funcionamento

O método executa seu retorno quando:

- Completa todas suas instruções explícitas
- Chega a uma declaração explícita de retorno
- Lança uma exceção

O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto

O tipo de dado do return deve ser compatível com o do método

Se o método for sem retorn(void), pode ou não ter um um "return" para encerrar sua exceção. Exemplo:

`public String getMensagem(){
return "Ola!"}` dá certo pois está retornando uma string

`public int getParcelas(){
return 1.36f}` dá errado pois está retornando um float, quando deveria retornar inteiro

`public void setIdade(){
return 10}` dá errado pois retorna um número quando deveria não retornar nada pois é void, deveria ser só return.,