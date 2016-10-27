
	function validarTexto(e) {
		
		
		var textoValor=document.getElementById(e).value;
		var textoObjeto=document.getElementById(e);

		
		if(textoValor=="")
			{
			
				textoObjeto.style.border="1px solid red";
				return false;
			}
		else
			{
			textoObjeto.style.border="1px solid green";
				return true;
			}
	}
	
