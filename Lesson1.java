class Lesson1 {
        public static void main(String[] args) {
            printThreeWords();
		    checkSumSign();
		    printColor();
		    extracted();
        }
		private static void extracted() {
			compareNumbers();
		}
        public static void printThreeWords() {
		
		    System.out.println("метод printThreeWords()");
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
            System.out.println();
	
		}
		public static void checkSumSign() {
		
		    int a = 4, b = 20;
		    int c = a + b; 
			if (c >=0) System.out.println("Сумма положительная");
			else System.out.println("Сумма отрицательная");
			System.out.println();
			
		}
		public static void printColor() {
		
		    System.out.println ("метод printColor()");
			int value = 8;
			if (value<=0) System.out.println("Красный");
		    else if (value>0 || value<=100) System.out.println("Желтый");
			else System.out.println("Зеленый");
			System.out.println();
			
		}
		public static void compareNumbers() {
		
		    System.out.println ("метод compareNumbers()");
			int a = 1,b = 3;
			if (a >= b) System.out.println ("a >= b");
			else System.out.println ("a < b");
			System.out.println();
		}
}