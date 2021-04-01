               #language: pt
               #encoding: utf-8
               #Luiz Araujo
               #30/03/2021
               #BDD com utilização de esquema de cenários

Funcionalidade: Validacao usabilidade de site
               Validação de usabilidade de site com utilização de linguagem Gherkin

        Contexto:
            Dado que eu estou no "site" da Tricentis
        
        Cenario: Enter Vehicle Data
              E seleciono "Make": "Audi"
              E preencho "Engine Performance [kW]": "2000"
              E preencho "Date of Manufacture": "11/11/2001"
              E seleciono "Number of Seats": "5"
              E seleciono "Fuel Type": "Gas"
              E preencho "List Price": "100000"
              E preencho "License Plate Number": "NEW-YORK"
              E preencho "Annual Mileage": "99999"
             Entao devo clicar em Next para o formulario "enter insurant data"

        Esquema do Cenario: Acessar, preencher formulario e enviar email
            Dado que eu estou no formulario "Vehicle Data"
              E preencho "First Name": "<nome>"
              E preencho  "Last Name": <sobreNome>
              E preencho "Date of Birth": <aniversario>
              E seleciono Gender Male
              E preencho "Street Address": <endereco>
              E seleciono "Country": <pais>
              E preencho "Zip Code": <cep>
              E preencho "City": <cidade>
              E seleciono "Occupation": <emprego>
              E seleciono Hobbies Other
              E preencho "Website": <site>
              E anexo foto
             Entao devo clicar em Next para o formulario "enter product data"

        Exemplos:
                  | nome | sobreNome | aniversario | endereco           | pais   | cep   | cidade        | emprego  | site                         |
                  | Bug  | Hopper    | 12/12/2000  | Alzira Rosa Aguiar | Brasil | 88060 | Florianopolis | Employee | https://github.com/luialbeto |
                  | João | e Maria   | 12/12/2000  | Alzira Rosa Aguiar | Brasil | 88060 | Florianopolis | Employee | https://github.com/luialbeto |

        Cenario: Enter Product Data
            Dado que eu estou no formulario "Product Data"
              E informo "Start Date": "05/05/2021"
              E seleciono "Insurance Sum": "3500000000"
              E seleciono "Merit Rating": "Bonus 17"
              E seleciono "Damage Insurance": "Full Coverage"
              E seleciono Optional Products Euro Protection
              E seleciono "Courtesy Car": "Yes"
             Entao devo clicar em Next para o formulario "select price option"
             
        Cenario: Select Price Option
            Dado que eu estou no formulario "Price Option"
              E seleciono Select Option o plano Ultimate
             Entao devo clicar Next para o formulario "send quote"
             
        Cenario: Send Quote
            Dado que eu estou no site da Tricentis no formulario "Send Quote"
              E informo "E-Mail": "antonio@gmail.com"
              E informo "Phone": "11999999999"
              E informo "Username": "tonhodalua"
              E informo "Password": "Rutinha12"
              E informo "Confirm Password": "Rutinha12"
              E informo "Comments": "nihil"
              E clico Send
             Entao devo ver a mensagem "Sending e-mail success!"
