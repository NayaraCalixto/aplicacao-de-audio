<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <header>
    <h1>🎧 Aplicação de Áudio em Java</h1>
  </header>
  <main>
    <div>
      <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white">
      <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white">
      <img src="https://img.shields.io/badge/Alura-13294B?style=for-the-badge&logo=data:image/svg+xml;base64,...">
    </div>
    </main>
</body>
</html>

<p>Este projeto foi desenvolvido como parte do curso <strong>Java One</strong>, uma parceria entre a <strong>Oracle</strong> e a <strong>Alura</strong>, com a orientação dos instrutores <strong>Jacqueline Oliveira</strong> e <strong>Paulo Silveira</strong>.</p>

<p>O desafio tem como objetivo colocar em prática os conhecimentos aprendidos no curso <strong>"Java - aplicando orientação a objetos"</strong>, utilizando os pilares da programação orientada a objetos: <strong>Herança</strong>, <strong>Polimorfismo</strong> e <strong>Encapsulamento</strong>.</p>

  <h3>📚 Tecnologias Utilizadas</h3>
    <ul>
      <li><strong>Java</strong>: Linguagem de programação utilizada no desenvolvimento da aplicação.</li>
      <li><strong>IDE</strong>: IntelliJ IDEA, Visual Studio Code (ou outra IDE de sua preferência).</li>
    </ul>

  <h3>🔧 Funcionalidades</h3>
    <ul>
      <li>🎵 Gerenciar áudios (título, duração, número de reproduções, curtidas e classificação);</li>
      <li>🎙️ Suporte a diferentes tipos de mídia, como <strong>músicas</strong> e <strong>podcasts</strong>;</li>
      <li>👍 Curtir áudios (incrementar curtidas);</li>
      <li>▶️ Reproduzir áudios (incrementar total de reproduções);</li>
      <li>📄 Obter informações completas sobre cada tipo de áudio.</li>
    </ul>

  <h3>📂 Estrutura do Projeto</h3>
    <ul>
      <li><strong>Classe Áudio</strong> (superclasse):
        <ul>
          <li>Atributos: <code>titulo</code>, <code>duracao</code>, <code>totalReproducoes</code>, <code>curtidas</code>, <code>classificacao</code>.</li>
          <li>Métodos: <code>curtir()</code>, <code>reproduzir()</code>, <code>getInformacoes()</code>.</li>
        </ul>
      </li>
      <li><strong>Subclasses:</strong>
        <ul>
          <li><code>Musica</code>: pode conter artista, álbum, gênero, etc.</li>
          <li><code>Podcast</code>: pode conter apresentador, descrição, episódios, etc.</li>
        </ul>
      </li>
      <li><strong>Classe Principal</strong>:
        <ul>
          <li>Instancia objetos das subclasses;</li>
          <li>Chama os métodos de reprodução, curtidas e exibição de dados;</li>
          <li>Simula o funcionamento da aplicação.</li>
        </ul>
      </li>
    </ul>

  <h3>📝 Reflexão</h3>
    <p>
      A implementação deste desafio reforçou a importância dos princípios de orientação a objetos. <strong>Encapsulamento</strong> permitiu proteger os dados e controlar o acesso aos atributos da classe <code>Áudio</code>, garantindo integridade no comportamento do sistema. Com a <strong>herança</strong>, conseguimos evitar duplicação de código ao criar as classes <code>Musica</code> e <code>Podcast</code>, que reaproveitam os comportamentos da superclasse. Já o <strong>polimorfismo</strong> possibilitou tratar músicas e podcasts de forma genérica, facilitando a expansão e manutenção do projeto. Esses pilares tornaram o código mais limpo, organizado e flexível para futuras melhorias.
    </p>

  <h3>👨‍🏫 Instrutores</h3>
    <ul>
      <li>Jacqueline Oliveira</li>
      <li>Paulo Silveira</li>
    </ul>

  <h3>🚀 Projeto do Curso Java One</h3>
    <p>Este projeto foi desenvolvido como parte prática do curso <strong>Java - aplicando orientação a objetos</strong>, dentro da trilha <strong>Java One</strong>, com o objetivo de consolidar os conceitos de orientação a objetos por meio de um sistema realista e funcional.</p>
  
