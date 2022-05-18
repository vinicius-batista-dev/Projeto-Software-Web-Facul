# Projeto-Desenvolvimento-Software-Web

## O objetivo ##

<p> O objetivo deste trabalho consiste em salvar o pedido do cliente, nele podemos listar, consultar, e excluir </p>

## Para acessar o projeto ##

<p> Para acessar o projeto primeiramente voce tem que instalar o git, react, node e o npm na sua máquina, logo em seguida fazer o clone do projeto </p>

<p> Para acessar o projeto java spring-boot voce deve estar instalado Intellij na sua máquina (O projeto java na pasta backend) </p>

Obs.: Acredito que todos ja devem saber como clonar um projeto, então não há necessidade de eu colocar como clonar um projeto na sua máquina.

## PALAVRAS CHAVES 

*npm
*mvn
*java
*MySql

<!-- PROJETO CONTEUDO -->
## SERVICE - BACKEND ##

<p>Respeitando as camadas do projeto. </p>

  - controller
  - entidade
  - negocio
  - persistencia
  - util
  
 ### Features
 
- [x] Cadastro do cliente
- [x] Json do cadastro do cliente
- [ ] Cadastro do pedido

## Arquitetura do projeto
- [x] controller
- [x] entidade
- [x] negocio
- [x] persistencia
- [x] util7

## Exemplos de funções no controller

    @PostMapping(value = "/salvar-pedido")
    //O Request Body, onde geralmente enviamos dados que queremos gravar no servidor
    public Pedido salvar(@RequestBody Pedido pedido)
    {
        try{
            if(pedido.getId() == null){
                pedido = pedidoService.incluir(pedido);
            }else{
                pedidoService.alterar(pedido);
            }
            return pedido;
        }catch (PedidoBackendException ex){
            //status 404
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getReason());
        }
    }

## Exemplos de uma funcao da Camada de negoócio

      @Override
      //Ele é uma forma de garantir que você está sobrescrevendo um método
      public Pedido incluir(Pedido pedido) {
        try{
            repository.save(pedido);
            //Metodo de salvar

            return pedido;
        }catch (Exception err){
            throw new PedidoBackendException("Nao foi possivel incluir");
            //Vai retornar um error quando nao for incluido
        }
    }


  
