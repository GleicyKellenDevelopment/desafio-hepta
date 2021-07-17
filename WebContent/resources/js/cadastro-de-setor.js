var inicio = new Vue({
	el: "#form-setor",
	data: {
		setor: {
			nome: null
		}
	},

	methods: {
		submitSetor() {
			
			axios.post('/funcionarios/rs/setores', this.setor).then((response)=>{
			}).catch(function (error) {
				alert("Erro interno", "Não possível cadastrar Setor");
			});
			
		}
	},
});