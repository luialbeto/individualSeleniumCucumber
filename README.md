# individualSeleniumCucumber
Aplicação para avaliação de certificação QA
Cenários de testes criados para validação de preenchimento de formulário no site http://sampleapp.tricentis.com/101/app.php. Executado em Selenium com Cucumber

## Linguagens, frameworks, patterns e bibliotecas
Java

Maven

Selenium

Cucumber

PageObject (pattern)


## Execução dos testes
Execução dos testes

Eclipse:
- clique no arquivo de teste com o botão direito e aplique "Run as JUnit"

VS Code:
- Unix: ./test.sh
- Windows: test.bat


## Documentação oficial
- Cucumber: cucumber.io
- Selenium: selenium.dev

## Arquitetura

├── driver
│   └── chromedriver
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── io
│   │           └── cucumber
│   │               └── IndividualSelenium
│   │                   └── IndividualSelenium.java
│   └── test
│       ├── java
│       │   └── io
│       │       └── cucumber
│       │           └── luiz
│       │               ├── pages
│       │               │   ├── CommonPage.java
│       │               │   └── SitePageElementsMap.java
│       │               ├── RunCucumberTest.java
│       │               └── steps
│       │                   ├── CommonSteps.java
│       │                   └── SiteSteps.java
│       └── resources
│           └── io
│               └── cucumber
│                   └── luiz
│                       └── testeA.feature
├── target
│   ├── classes
│   │   └── io
│   │       └── cucumber
│   │           └── IndividualSelenium
│   │               └── IndividualSelenium.class
│   ├── generated-sources
│   │   └── annotations
│   ├── generated-test-sources
│   │   └── test-annotations
│   ├── maven-status
│   │   └── maven-compiler-plugin
│   │       ├── compile
│   │       │   └── default-compile
│   │       │       ├── createdFiles.lst
│   │       │       └── inputFiles.lst
│   │       └── testCompile
│   │           └── default-testCompile
│   │               ├── createdFiles.lst
│   │               └── inputFiles.lst
│   ├── surefire-reports
│   │   ├── io.cucumber.luiz.RunCucumberTest.txt
│   │   └── TEST-io.cucumber.luiz.RunCucumberTest.xml
│   └── test-classes
│       └── io
│           └── cucumber
│               └── luiz
│                   ├── pages
│                   │   ├── CommonPage.class
│                   │   └── SitePageElementsMap.class
│                   ├── RunCucumberTest.class
│                   ├── steps
│                   │   ├── CommonSteps.class
│                   │   └── SiteSteps.class
│                   └── testeA.feature
├── test.bat
├── #test.sh#
└── test.sh
