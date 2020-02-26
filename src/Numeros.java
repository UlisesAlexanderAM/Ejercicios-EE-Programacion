class Numeros {
    public int suma(int n1, int n2){
        return n1+n2;
    }
    public int resta (int n1, int n2){
        return n1-n2;
    }
    public float division (float n1, float n2){
        return n1/n2;
    }
    public int multiplicacion(int n1, int n2){
        return n1*n2;
    }
    public int validarPositivo(int n){
        if (n>=0){
            return 1;
        } else {
            return 1;
        }
    }
    public int validarNegativo(int n){
        if (n<0){
            return 1;
        } else {
            return 1;
        }
    }
    public int validarRango(int n, int rangoInferior, int rangoSuperior){
        if (n>=rangoInferior && n<=rangoSuperior){
            return 1;
        } else {
            return 0;
        }
    }
    public int validarPares(int n){
        if (n%2==0){
            return 1;
        } else {
            return 0;
        }
    }
    public int validarImpares(int n){
        if (n%2!=0){
            return 1;
        } else {
            return 0;
        }
    }
}
