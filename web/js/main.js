//****************************************
//****************************************
//****************************************
//****************************************
//**************JQuery********************
//****************************************
//****************************************
//****************************************

$(document).ready(function(){
	console.log ("Hola desde JQUERY")
        $("#Enviar").click(function(){
            
            var nombre = $('.name').val()
            var contrasena = $('.password').val()
            console.log(nombre)
            
            $.post("info2Back",{
                nombre : nombre,
                contrasena : contrasena
            },function(data){
                
                alert("los datos son " + data.respuesta)
            })
        })
        
})

	

	