package com.paulo.calcular;

public enum TipoSoma {

	SOMA {
		@Override
		public double calculo(double x, double y) {
			return x + y;
		}
	},SUBTRACAO {
		@Override
		public double calculo(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},DIVICAO {
		@Override
		public double calculo(double x, double y) {
			// TODO Auto-generated method stub
			if(y != 0 || x != 0 ) {
				return x / y;
			}
			else {
				return 1;
			}
		}
	},MUTIPLICACAO {
		@Override
		public double calculo(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	};
	
	public abstract double calculo(double x, double y);
}
