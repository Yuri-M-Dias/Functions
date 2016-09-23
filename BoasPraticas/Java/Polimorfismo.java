	public class Filme{

		String titulo;
		int preco;
//		String tipo;

		public Filme(String titulo, int preco){
			this.titulo = titulo;
			this.preco = preco;
		}

	// Substitua o switch por polimorfismo.

//		public int calculaPreco(int diasAlugados){
//			switch(tipo){
//			case "Classico":
//				return 2 * diasAlugados;
//			case "Lancamento":
//				return 10 * diasAlugados;			
//			case "Infantil":
//				return 1 * diasAlugados;			
//			
//			}	
//		}

		

	}


	public class Classico extends Filme{
	
		public Classico(String titulo, int preco){
			super(titulo, preco);	
		}

		@Override
		public int calculaPreco(){
			return 2*diasAlugados;	
		}
	}

	public class Lancamento extends Filme{
	
		public Lancamento(String titulo, int preco){
			super(titulo, preco);	
		}

		@Override
		public int calculaPreco(){
			return 10*diasAlugados;	
		}
	}

	public class Infantil extends Filme{
	
		public Infantil(String titulo, int preco){
			super(titulo, preco);	
		}

		@Override
		public int calculaPreco(){
			return 1*diasAlugados;	
		}
	}
