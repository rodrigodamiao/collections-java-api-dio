
1. Agenda de Contatos
   Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo 
2. "Contato" como atributo. Cada contato possui atributos como nome e número de telefone.
3. Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adiciona um contato à agenda.
exibirContatos(): Exibe todos os contatos da agenda.
pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com 
os contatos encontrados.
atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de 
um contato específico.

**************************************************************************************
2. Lista de Tarefas
   Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo 
3. "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo
4. booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes 
5. métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição,
se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo
com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com 
a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas.

***************************************************
Ordenação em Set
1. Cadastro de Produtos
   Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos
2. do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod,
3. preço e quantidade. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
2. Lista de Alunos
   Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
