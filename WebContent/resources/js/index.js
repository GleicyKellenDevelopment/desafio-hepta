var inicio = new Vue({
	el:"#inicio",
    data: {
        lista: []
    },
    created: function(){
        let vm =  this;
        vm.listarFuncionarios();
    },
    methods:{
	//Busca os itens para a lista da primeira página
        listarFuncionarios: function(){
			const vm = this;
			axios.get("/funcionarios/rs/funcionarios")
			.then(response => {vm.lista = response.data;
			}).catch(function (error) {
				vm.mostraAlertaErro("Erro interno", "Não foi listar natureza de serviços");
			}).finally(function() {
			});
		},
		
		DeleteFuncionario(id) {
			axios.delete('/funcionarios/rs/funcionarios/' + id).then((response)=>{
			console.log(response);
			
			if(response.status == 200){
				alert("Sucesso", "Funcionário Excluído com Sucesso.");
				location.reload();
			}
			}).catch(function (error) {
				alert("Erro interno", "Não possível excluir");
			});
			
		}
    }
});