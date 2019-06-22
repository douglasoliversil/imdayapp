# Intruções para build
  - Abrir o projeto na IDE Android Studio versão 3.4.1
  - Configura o Java Development Kit para a versão 1.8
  - Garantir conexão com a internet para download de dependências
  - Executar o aplicativo em dispositivo com versão de Android a partir da Nougat (API 24)
  - No caso do uso de emuladores, verificar a habilitação de aceleração de hardware na placa mãe do computador e
    a instalação do Intel Hardware Accelerator (HAXM) no caso de processadores Intel
  
# Instruções para execução de testes (Via Android Studio)
  - Na perspectiva 'Android' na aba lateral 'Project' do Android Studio, 
    localizar o diretório 'com.example.imdayapp (androidTest)'
  - Clicar com o botão direito do mouse e selecionar 'Run Tests' no menu de contexto
  - Será exibida uma janela para seleção do device no qual deverá se executar os testes
  
# Instruções para execução de testes (Via prompt de comando)
  - Garanta que exista algum device conectado ao computador no modo de depuração
  - No prompt, navegue até o diretório root do projeto
  - No prompt, execute o comando './gradlew connecteddebugAndroidTest --continue'
  - Os testes se iniciarão no device conectado e os logs de execução serão exibidos no prompt
