# Especificação de Caso de Uso Fretou

# UC: *Enviar mensagem*

## 1. Resumo

Troca de mensagens entre usuário e motorista, no contexto de uma proposta ativa..

## 2. Atores

Cliente, Motorista

## 3. Precondições

###  3.1 Deve estar logado

O usuário deve estar logado no sistema para cadastrar uma nova mensagem.

###  3.2 Deve possuir uma proposta ativa entre as das partes

O usuário tem de estar relacionado com o recipiente da mensagem por meio de uma proposta.

## 4. Pós-condições
### 4.1 Mensagem deve ser persistida

Após o envio da mensagem, ela deverá ser persistida.

## 5. Pontos de Extensão

Não foram identificados.

## 6. Fluxos de Evento

### 6.1 Fluxo Básico

1. O ator seleciona a opção "enviar mensagem" na página de acompanhamento da proposta.
1. O sistema exibe uma popup com o formulário de cadastro de mensagem.
1. O ator preenche o campo "mensagem" no formulário do popup.
1. O ator clica no botão "Enviar mensagem"
1. O sistema persiste as informações, exibe uma mensagem de sucesso e atualiza a página.


### 6.2 Fluxo Alternativo

1. A qualquer momento, o usuário pode clica no botão "Cancelar".
1. O sistema fecha o popup de cadastro de mensagem e não persiste a mensagem.

## 7. Protótipos de Interface do Caso de Uso

`imagem do protótipo, é feita na disciplina de implementação e testes`

## 8. Diagrama de Atividades do Caso de Uso

`imagem do diagrama, feito na disciplina de análise e projeto`

## 9. Diagrama de Projeto do Caso de Uso

`imagem do diagrama de classes de projeto, feito na disciplina de análise e projeto`

## 10. Diagrama de Sequência do Caso de Uso

`imagem do diagrama, feito na disciplina de análise e projeto`
