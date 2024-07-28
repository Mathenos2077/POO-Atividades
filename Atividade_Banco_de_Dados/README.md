#  Relatório Atividade Banco de Dados

### Segue abaixo um relatório da atividade realizada para o laboratório de POO, referente ao assunto banco de dados.

Primeiramente, adaptei as classes Database, Student e StudentRepository, fornecidas pelo tutorial contido em https://github.com/marceloakira/tutorials.git, 
para meu projeto principal da disciplina. Abaixo está a classe Database:

![database](/ExercicioDB/prints/database.png)

Não foi necessária nenhuma alteração Nessa classe.

A seguir, está a classe Servico, que representa o modelo a ser utilizado no banco de dados. Contém os atributos referentes aos serviços a serem
administrados pelo programa do meu projeto principal, e também um "id", que será útil para o banco de dados. Além disso, implementei métodos construtores, getters e setters:

![servico1](/ExercicioDB/prints/servico1.png)

![servico2](/ExercicioDB/prints/servico2.png)

Em seguida, adaptei a classe StudentRepository para ServicoRepository. Ela conterá os métodos a serem utilizados para gerenciar os dados
guardados no banco de dados. Reaproveitei os métodos já criados na StudentRepository, e também fiz a implementação de 3 novos métodos:
* update(Servico servico) - Recebe uma parâmetro da classe Servico e atrubui os seus atributos a instância guardada no banco de dados que possui o mesmo ID que o parâmetro.
* delete(Servico servico) - Recebe uma parâmetro da classe Servico e deleta a instância guardada no banco de dados que possui o mesmo ID que o parâmetro.
* deleteById(int id) - Deleta a instância guardada no banco de dados que possui o mesmo id que o fornecido no argumento do método.

![servicoRepository1](/ExercicioDB/prints/servicoRepository1.png)
![servicoRepository2](/ExercicioDB/prints/servicoRepository2.png)
![servicoRepository3](/ExercicioDB/prints/servicoRepository3.png)

Para testar o funcionamento dos métodos descritos, criei um programa principal que conecta com o banco de dados, instancia alguns objetos da classe Servico, inicia o repositório e aplica alguns dos métodos do mesmo.

Primeiramente, conectei o banco de dados, instanciei alguns objetos e os guardei no banco de dados através do método "create" de servicoRepository. Reatribui os objetos guardados às instâncias iniciais, a fim de guardar o valor do ID que elas obtiveram ao serem inseridas no banco de dados.

![main1](/ExercicioDB/prints/main1.png)

Ao executar esse programa, tudo o que foi dito anteriormente é realizado. Para observar essa alteração diretamente no banco de dados, utilizei o DB Browser for SQLite, que exibiu a seguinte tabela com os dados anteriores já guardados:

![main1_result](/ExercicioDB/prints/main1_result.png)

Em seguida, adicionei um código que altera os atributos das instâncias do programa, e então as atualiza no banco de dados utilizando o método "update":

![main2](/ExercicioDB/prints/main2.png)

A alteração visível no banco de dados foi a seguinte:

![main2_result](/ExercicioDB/prints/main2_result.png)

Por fim, adicionei mais um código que deleta algumas das instâncias guardadas no banco de dados utilizando o método "delete" e também o método "deleteById":

![main3](/ExercicioDB/prints/main3.png)

O resultado final foi o seguinte:

![main3_result](/ExercicioDB/prints/main3_result.png)

Com isso, é possível desenvolver algoritmos capazes de criar, ler, atualizar e deletar dados armazenados em um banco de dados.
