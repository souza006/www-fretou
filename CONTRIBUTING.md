# Como contribuir

Toda contribuição para este repositório deve antes ser discutida e aprovada atavés
de uma _issue_. A implementação deve seguir o fluxo definido neste documento, que
deve ser integralmente seguido neste projeto.

## Início de uma discussão

Uma _issue_ deve ser aberta na lista de _issues_ do projeto no __gitlab__ do IFRN, que hospeda
este projeto em https://gitlab.devops.ifrn.edu.br/tads.cnat/pdsweb/projetowebexemplo/issues.

*  Antes de abrir uma nova _issue_ verifique se sua sugestão já foi feita nas _issues_
abertas.
*  Observe as etiquetas (_label_) que ajudam a identificar sua proposta.

## Implementação da contribuições

Depois que a _issue_ foi discutida e aprovada você deve realizar um clone do projeto
(caso ainda não o tenha feito), de acordo com o descrito no arquivo (README.md)[README.md].
Configure corretamente o ambiente e realize testes locais.

Para efetuar o desenvolvimento você deve criar um ramo (_branch_) de desenvolvoimento
com o número e nome da _issue_ aprovada. A integração das suas modificações no ramo
principal (_branch master_) deve ser solicitado através de um _merge request_. A
aceitação da requisição deve ser feita por um membro do projeto diferente de
quem implementou as modificações.

### Exemplo:

Se o você criou uma _issue_ chamada **Implementar Pagamento Parcelado**,
cujo número é **21**, sua _branch_ deve se chamar `21-implementar-pagamento-parcelado`,
dessa forma, através do nome da _branch_ é possível identificar rapidamente as
referências necessárias no momento do _commit_.

## Solicitar _merge_ da sua contribuição

Você pode fazer o _push_ da sua _branch_ assim que começar a implementar as
contribuições. Para solicitar a incorporação das contribuições você deve realizar
um _merge request_ para a _branch_ `master`.

O _merge request_ pode ser feito antes de você finalizar o desenvolvimento. Nesse
caso você deve iniciar o nome do _merge request_ com a sigla `WIP`, indicando
que essa solicitação é um trabalho em desenvolvimento (_Work In Progress_),
assim o trabalho nessa _branch_ pode ser discutido no _merge request_, mas ainda
não pode ser incorporado. Uma vez terminada a
implementação da contribuição você deve retirar a sigla `WIP` do nome do _merge request_.
