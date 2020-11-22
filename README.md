# Bananas

<br/>
<h2>Descrição</h2>
Looking for Bananas in the Monkeys island Given a Jungle in the middle of an island of n*m dimensions. <br/>
Each field in this jungle contains a positive integer which is the amount of bananas that exist in that field. <br/>
Initially the monkey is at first column but can be at any row. <br/>
The monkey can move only (right->,right up /,right down\) from a given cell. <br/>
Find out the maximum amount of bananas they can collect.


<br/><br/><br/>
<h2>Solução pensada </h2>
A intenção do método principal é percorrer o array bidimensional de trás para frente, ou seja,<br/>
passando pelas linhas da última coluna até percorrer as linhas da primeira coluna.<br/>

Em cada iteração forma-se um novo array com os dados obtidos na iteração.<br/>
Logo, na primeira coluna surgirá o array de maior valor.<br/><br/>

font de estudo:<br/>
https://www.youtube.com/watch?v=6rqcqUyyXvM


<br/><br/>
<h2>Dados de entrada</h2>
Por ser uma aplicação simples, não foi criado classe de teste.<br/>
Na classe main adicionei 3 mocks e coloquei os resultados esperados em forma de comentário.

É possível alterar os valores de entrada.

<br/><br/>
<h2>Testar</h2>
Seguir os passos:<br/>
1. Realizar o clone do projeto <br/>
2. Abri na IDE favorita (foi utilizado Spring Tool Suite) <br/>
3. Navegar até a classe BananasApplication <br/>
4. Botão direito em cima da classe -> Run as -> Java application <br/>
