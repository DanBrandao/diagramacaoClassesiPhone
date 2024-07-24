# Desafio DIO - Diagramação de Classes do iPhone
Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

## 💡 Sobre o Projeto
Utilizando o vídeo de lançamento do iPhone como base, foi produzido uma elaboração de algumas funcionalidades do iPhone utilizando ferramenta de UML para a diagramação das classes e interfaces propostas no desafio.

## ✅ Objetivo do Desafio
Representar as interfaces para:

* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Diagrama UML - Mermaid

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica("musica")
        +ligar("numero")
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina("url")
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

## 🔧 Tecnologias Utilizadas
![JAVA](https://img.shields.io/badge/Java-0A0A0A?style=for-the-badge&logo=openjdk&logoColor=white)
![Markdown](https://img.shields.io/badge/Markdown-0A0A0A?style=for-the-badge&logo=markdown&logoColor=white)
![UML](https://img.shields.io/badge/UML-0A0A0A?style=for-the-badge&logo=uml&logoColor=white)

## 📧 Contato
<a href = "mailto:dpereira770@gmail.com"><img src="https://img.shields.io/badge/Gmail-0A0A0A?style=for-the-badge&logo=gmail&logoColor=white"></a>
<a href="https://www.linkedin.com/in/daniel-brand%C3%A3o-0b024b20a/" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-0A0A0A?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
