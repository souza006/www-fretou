# Especificação de Caso de Uso Fretou

# UC: *Enviar proposta*

## 1. Resumo

Motorista envia uma proposta para o criador do anúncio.

## 2. Atores

Motorista

## 3. Precondições

###  3.1 Deve estar logado

O usuário deve estar logado no sistema para enviar uma proposta.

###  3.2 Deve ser Motorista

O usuário deve ser um Motorista para enviar uma proposta.

## 4. Pós-condições
### 4.1 A proposta deve ser persistida

Após o envio da proposta, o sistema deve persistir os dados.

### 4.2 O criador do anúncio é notificado

Após o sistema persistir, o usuário que criou o anúncio recebe uma notificação.

## 5. Pontos de Extensão

Não foram identificados.

## 6. Fluxos de Evento

### 6.1 Fluxo Básico

1. O motorista seleciona um anúncio na página principal
1. O sistema redireciona-o para página do anúncio
1. O motorista seleciona a opção "enviar proposta" na página de anúncio
1. O sistema redireciona-o para página de enviar proposta
1. O motorista informa as informações da sua proposta
1. O sistema persiste as informações
1. CDU finalizado.

### 6.2 (1A) O ator seleciona um anúncio que não existe.

1. O ator seleciona um anúncio que não existe
1. O sistema exibe uma mensagem de erro
1. O sistema redireciona para página principal

### 6.4 (5A) Ator não preenche o dado na proposta

1. O ator informa no formulário algum dado em branco
1. O sistema retorna uma mensagem de erro
1. O sistema exibe quais dados precisam ser preenchidos

## 7. Protótipos de Interface do Caso de Uso

`imagem do protótipo, é feita na disciplina de implementação e testes`

## 8. Diagrama de Atividades do Caso de Uso

`imagem do diagrama, feito na disciplina de análise e projeto`

## 9. Diagrama de Projeto do Caso de Uso

`imagem do diagrama de classes de projeto, feito na disciplina de análise e projeto`

## 10. Diagrama de Sequência do Caso de Uso

`imagem do diagrama, feito na disciplina de análise e projeto`
