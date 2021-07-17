var inicio = new Vue({
	el:"#app",
    data: {
        lista: [], 

		form:{
			nome: '',
			idade: '',
			salario: '',
			email: '',
			setor: {
				id: '',
				nome:''
			}
		}
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
		
		submitFuncionario: function(e){
			
			console.warn(this.form);
			e.preventDefault(e);
		}
		
		
    }
});