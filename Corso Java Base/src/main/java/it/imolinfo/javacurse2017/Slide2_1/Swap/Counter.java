package it.imolinfo.javacurse2017.Slide2_1.Swap;

	public class Counter {
		
		private int i = 0;
		
		Counter(int i){
			this.setValue(i);
		}
		
		public void setValue(int in){
			i = in;
		}
		
		public int getValue() {
			return i;
		}
			
	}