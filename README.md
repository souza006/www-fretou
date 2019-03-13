# www-fretou

`O Fretou é uma aplicação web que facilita e agiliza entre clientes e frentistas, de maneira intuitiva e clara.`

## Início

Estas instruções permitem que você obtenha uma cópia do projeto e configure
em seu computador para desenvolvimento e testes.


### Pré-requisitos

Para baixar, compilar e executar em seu computador, você deve ter:

- Sistema de controle de versões `git` ([https://www.git-scm.com/])
- Kit de desenvolvimento JAVA `jdk-8` ([https://java.com/pt_BR/])
- Simple build tool `sbt` ([https://www.scala-sbt.org/])

### Instalação

##### Ubuntu Linux

**Importante**: É aconselhável fazer um _update_ do `apt-get`:
```sh
sudo apt-get update
```

- git

```sh
sudo apt-get install git
```

- jdk-8

```sh
sudo apt-get install openjdk-8-jdk
```

- sbt (Necessário: `git`, `jdk`, `gnupg2`, `apt-transport-https`)

```sh
sudo apt-get install gnupg2
sudo apt-get install apt-transport-https
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```

### Clonar o repositório

Para realizar um clone do projeto, execute:

```sh
git clone https://gitlab.devops.ifrn.edu.br/tads.cnat/pdsweb/2019-1/www-fretou.git
cd www-fretou
```

O clone do git cria um diretório chamado `www-fretou` se não for informado um
nome de diretório.

### Executar em modo desenvolvimento

Para executar em modo de desenvolvimento,
no diretório do projeto, digite:

```sh
sbt run
```

## Documentação

Verifique o diretório [`doc`](./doc/) para a documentação do sistema

## Contribuindo

Veja o arquivo [CONTRIBUTING.md](CONTRIBUTING.md) para maiores detalhes.

## Equipe de desenvolvimento

* **Daniel Souza Affonso Ferreira - daniel.souza.af@gmail.com *

* **David Héricles de Lima Silva - david_hericles@hotmail.com *

* **Eduardo Riev da Silva Oliveira - eduardoriev12@gmail.com *

* **Elvis Silva de Souza - souzalelvis33@gmail.com *

* **Esther Aragão da Silva Santana - estheraragaos@gmail.com *

* **Herikle Mesquita Freire de Lima - herikle.mesquita@gmail.com *
## Licença

Este projeto é licenciado pela GNU [GPL 3](LICENSE.md).
