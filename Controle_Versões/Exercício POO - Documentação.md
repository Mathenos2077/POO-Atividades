# Exercício POO - Versionamento de Código
>Faça a leitura do capítulo sobre Git. A partir da leitura do conteúdo, faça a entrega da seguinte atividade neste fórum:
>- Crie um repositório público 'POO' em seu namespace.
>- Crie um documento Markdown com capturas de tela, demonstrando que você domina os seguintes assuntos: criação e clonagem de repositórios, edição de >conteúdo, criação e alteração de um ramo (branch)

**Primeiramente, criei um repositório no GitHub, com um arquivo README.md que será utilizado para testes.**
![1](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/ffcedea3-91cd-431a-a530-b8409f7ae27d)

**No PowerShell, já com o git devidamente instalado, criei um novo repositório com o comando "git init". Porém eu quero alterar arquivos no repositório já existente que criei anteriormente, então usei sua URL para cloná-lo para a minha máquina.**
![2](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/a9e7f7d4-adfc-4afc-b7b4-8b6b9c4abe6d)

**Usando os comandos cd e ls, me localizei corretamente no diretório em que clonei o repositório. Após isso, utilizei o comando cat README.md para visualizar o arquivo**

![3](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/ebbbd59a-b10e-4ab0-83e9-6298914c88c7)

**Utilizando o comando nano README.md, abri o editor de texto nano e assim fui capaz de editar esse arquivo**
![4](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/b50b729a-a445-480b-87fa-a4511f91e739)

**Utilizei o comando git commit para deixar o arquivo pronto para ser enviado ao repositório principal. Então, com o comando git push, envivei a nova versão ao repositório principal.**

![6](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/11307afb-2902-4e33-bf16-27312d281935)

**No passo seguinte, criei uma "Branch", que é uma ramificação do arquivo original. Ambos são inicialmente idênticos, porém eu posso editar a branch sem me preucupar em corromper o arquivo original. Então, após realizar esse processo de remificação, editei a branch e a deixei pronta para ser enviada ao repositório main.**

![7](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/a0a1ba51-35a4-4357-a9b2-cb926e581025)

**No fim, tenho dois arquivos: o primeiro, o qual se manteve inalterado, e a branch, na qual fiz modificações. Então tentei enviar a branch para o repositório principal. Obtive um erro, que aparentemente ocorre devido a problemas de referenciação. O próprio terminal me retornou a maneira correta de escrever o comando. Consertei o problema e consegui fazer o push.**

![8](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/79d34675-40d1-48e8-87cf-58a0d33646a8)

**Ao acessar o repositório no Github, aceitei a solicitação de modificação que eu fiz anteriormente no Powershell, e mesclei os novos arquivos com os originais.**

![9](https://github.com/Mathenos2077/POO-LAB-23-04/assets/156183065/60e1305c-f192-44a6-9917-a41658764082)
