class Main {

    public static void main(String[] args) {
    
    	//La clase int es un tipo de dato primitivo y Integer es un tipo de dato de clase.
    	//Integer es un valor de tipo entero.
    	int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
    	
    	//Se crean objetos y el código se llama instancia de la clase
    	SumaDosNumeros obj = new SumaDosNumeros();
    	
    	System.out.println(obj.suma(a, b));
    }
}
