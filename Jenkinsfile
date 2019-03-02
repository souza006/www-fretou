#!groovy

def application = 'www-fretou'
def configFile = ''

node {
  pull(application)

  docker.image('aa8y/sbt:1.2').inside() {
    stage ('Build and package dist') {
      sh "sbt -Dsbt.global.base=.sbt -Dsbt.boot.directory=.sbt -Dsbt.ivy.home=.ivy2 clean compile dist && if [ -d svc ]; then rm -rf svc/; fi && mkdir svc && unzip -d svc target/universal/*SNAP*.zip"
    }
  }

  packageAndDeploy(application, configFile)
}
