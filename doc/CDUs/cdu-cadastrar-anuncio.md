# Especificação de Caso de Uso Fretou

# UC: *Cadastrar anúncio*

## 1. Resumo

Usuário cadastra um novo anúncio no sistema

## 2. Atores

Cliente, Motorista

## 3. Precondições

###  3.1 Deve estar logado

O usuário deve estar logado no sistema para cadastrar um novo anúncio.

## 4. Pós-condições
### 4.1 Anúncio deve ser persistido

Após o cadastro do anúncio, ele deverá ser persistido.

## 5. Pontos de Extensão

Não foram identificados.

## 6. Fluxos de Evento

### 6.1 Fluxo Básico

1. O ator seleciona a opção "cadastrar anúncio" na página principal
1. O sistema redireciona-o para a página de cadastro de anuncio
1. O ator informa no formulário os dados de seu anúncio (Título, descrição, tipo de carga, localização da carga, localização de entrega, valor sugerido)
1. O sistema persiste as informações
1. O sistema exibe uma mensagem de sucesso e redireciona o usuário a página do anúncio criado
1. CDU finalizado.

### 6.2 (1A) Ator cadastra o anúncio pelo painel

1. O ator seleciona a opção de painel de controle na página principal
1. O ator seleciona anúncios na página de painel de controle
1. O ator seleciona a opção "cadastrar anúncio"

### 6.4 (3A) Ator não preenche algum dado no anúncio

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
