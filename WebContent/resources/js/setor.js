var inicio = new Vue({
	el:"#setor",
    data: {
        lista: [], 
	
    },
    created: function(){
        let vm =  this;
        vm.listarSetores();
    },
    methods:{
	//Busca os itens para a lista da primeira página
        listarSetores: function(){
			const vm = this;
			axios.get("/funcionarios/rs/setores")
			.then(response => {vm.lista = response.data;
			}).catch(function (error) {
				vm.mostraAlertaErro("Erro interno", "Não foi listar natureza de serviços");
			}).finally(function() {
			});
		},
		
		DeleteSetor(id) {
			axios.delete('/funcionarios/rs/setores/' + id).then((response)=>{
			
			if(response.status == 200){
				alert("Sucesso", "Setor Excluído com Sucesso.");
				location.reload();
			}
			}).catch(function (error) {
				alert("Erro interno", "Não possível excluir");
			});
			
		}
    }
});