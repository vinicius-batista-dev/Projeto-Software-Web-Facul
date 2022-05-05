const express = require('express')
//Inicializador express
const app = express();

//VARIAVEL GLOBAL 
const PORT = 3000;


app.get('/', function(req, res){
    res.send('Teste')
})




app.listen(PORT, console.log(`App started in port ${PORT}`))