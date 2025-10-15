import java.util.ArrayList;
import java.util.Scanner;


class Entero {
    private int  n;
    
    public Entero(){
        n=0;
    }
    
    public void cargar(int nro){
        n=nro;
    }
    
    
    boolean esPrimo(){
        int c=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return (c==2);
       /* if(c==2){
            return true;
        }else{
            return false;
        }*/
    }
    
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 class Vector {
    // atributos
    private int longitud;
    private  ArrayList<Integer> v;

    // constructor: instanciar los atributos
    public Vector() {
        v = new ArrayList<Integer>(50);
        longitud = 0;
    }

    public void cargarManual(int lon) {
       Scanner sc = new Scanner(System.in);
       longitud=lon;
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento [" + i + "]: ");
            v.add(i,sc.nextInt()) ;   // leemos y guardamos en cada posición
        }
    }

    // métodos
    void cargar(int lon) {
        this.longitud = lon;
        for (int i = 0; i < longitud; i++) {
            // v.get(i);
            v.add(i);
        }
    }
    
    String descargar(){
        String s="v= [ ";
        for (int i = 0; i < longitud; i++) {
            if(i==(longitud-1)){
                s=s+v.get(i)+" ";
            }else{
                s=s+v.get(i)+" , ";
            }
            
        }
        return s+" ]";
    }
    
    int sumatoriaTotal(){
        int s=0;
        for(int i=0;i<longitud;i++){
            s=s+v.get(i);
        }
        return s;
    }
    
    int sumatoriaTotal(int a,int b){
         int s=0;
        if(a<longitud && b<longitud 
        && a>=0&& b>=0 && a<=b){
         for(int i=a;i<=b;i++){
            s=s+v.get(i);
            }   
        }
       
        
        return s;
    }
    
    int sumatoriaTotal(int x){
        int s=0;
        for(int i=0;i<longitud;i++){
            s=s+(v.get(i)*x);
        }
        return s;
    }
    
    int sumatoriaTotalPosicionesParesIntro(){
        int s=0;
        for(int i=0;i<longitud;i++){
            if(i%2==1){
                s=s+v.get(i);
            }
        }
        return s;
    }
    
    
    int sumatoriaTotalPosicionesParesIntermedio(){
        int s=0;int i=0;
        while(i<longitud){
            s=s+v.get(i); // s+=v.get(i);
            i=i+2; //i+=2
        }
        return s;
    }
    
    int sumatoriaTotalPosicionesParesPro(){
       int s=0;
        for(int i=0;i<((longitud/2)-1);i++){
            s=s+v.get(i*2);
        }
        return s;
    }
    
    void agregarFinal(int ele){
        longitud++;
        v.add(ele);
    }
    
    void intercambiar(int pos1, int pos2){
       int aux= v.get(pos1);
       v.set(pos1,v.get(pos2)); //v.set(posicion,elemento);
       v.set(pos2,aux);
    }
    
    void agregarElePos(int pos,int ele ){
        longitud++;
        v.add(0);
        for(int i=(longitud-1);i>pos;i--){
            v.set(i,v.get(i-1));
        }
        v.set(pos,ele);
    }
    
    void invertir(){
        int i=0;int d=longitud-1;
        while(i<d){
            intercambiar(i,d);
            i++;
            d--;
        }
    }
    
    void invertirPro(){
         for(int i=0;i<((longitud/2));i++){
            intercambiar(i,longitud-i-1);
        }
    }
    
     void serieF(int ce){
        serieFibo(ce);
    }
    
    private void serieFibo(int ce){
        longitud=ce;
        int a=-1;int b=1;
        int f=0;
        for(int i=0;i<longitud;i++){
            f=a+b;
            v.add(f);
            a=b;
            b=f;
        }
    }
    
    
    String descargarPosicionesImpares(){
        String s="v = [ ";
        int i=1;
        while (i<longitud){
            s=s+v.get(i)+" , ";
            i=i+2;
        }
        return s+" ]";
    }
    
    String descargarPosicionesPares(){
        String s="v = [ ";
        int i=0;
        while (i<longitud){
            s=s+v.get(i)+" , ";
            i=i+2;
        }
        return s+" ]";
    }
    
    String descargarRango(int a , int b){
        String s="v = [ ";
        int i=a;
        while (i<=b){
            s=s+v.get(i)+" , ";
            i++;
        }
        return s+" ]";
    }

    String descargarFinInicio(){
        String s="v= [ ";
        for (int i = (longitud-1); i >= 0; i--) {
                s=s+v.get(i)+" , ";
        }
        return s+" ]";
    }
    
    
    void invertirRango(int a,int b){
        int i=a;
        int d=b;
        while(i<d){
            intercambiar(i,d);
            i++;
            d--;
        }
    }
    
    boolean verificarElemIguales(){
        for(int i=0;i<longitud;i++){
            if(v.get(0)!=v.get(i)){
                return false;
            }
        }
        return true;
    }
    
     boolean verificarElemPares(){
        for(int i=0;i<longitud;i++){
            if(v.get(i)%2==1){
                return false;
            }
        }
        return true;
    }
    
    boolean verifPrimosRango(int a , int b){
        Entero nro=new Entero();
        for (int i=a;i<=b;i++){
            nro.cargar(v.get(i));
            if(!nro.esPrimo()){
                return false;
            }
        }
        return true;
    }
    void eliminarElemRango(int a , int b){
        int pos=a;
        for(int i=b+1;i<longitud;i++){
            v.set(pos,v.get(i));
            pos++;
        }
        longitud=longitud-(b-a+1);
        System.out.println( longitud);
    }
    
    void ordenarAsc(){
        for (int i=0;i<longitud;i++){
            for(int j=i+1;j<longitud;j++){
                if(v.get(i)>v.get(j)){ //cambiar signo
                    intercambiar(i,j);
                   System.out.println(descargar()) ;
                }
                
            }
        }
    }
    
      void ordenarAscRango(int a,int b){
        for (int i=a;i<=b;i++){
            for(int j=i+1;j<=b;j++){
                if(v.get(i)>v.get(j)){ //cambiar signo
                    intercambiar(i,j);
                   //System.out.println(descargar()) ;
                }
                
            }
        }
    }
    
}

class Main {
    public static void main(String[] args) {

        Vector v=new Vector();//instanciar = new Vector()
       // v.cargar(10);
        v.cargarManual(6);
        //v.serieF(16);
        System.out.println( v.descargar());
        //v.eliminarElemRango(2,6);
        //v.ordenarAsc();
        v.ordenarAscRango(2,4);
         System.out.println( v.descargar());
        //System.out.println( v.descargarPosicionesImpares());
        //System.out.println( v.descargarPosicionesPares());
         //System.out.println( v.descargarRango(2,6));
         //System.out.println( v.descargarFinInicio());
        // v.invertirRango(2,6);
       // System.out.println( v.verificarElemIguales());
        // System.out.println( v.verifPrimosRango(0,3));
         //System.out.println( v.descargar());
         
        //System.out.println("Sumatoria total: " + v.sumatoriaTotal(3,6));
        //v.agregarFinal(11);
       // v.intercambiar(2,3);
     //v.agregarElePos(0,10);
       //((v.invertirPro();
     //  System.out.println( v.descargar());
       
    }
}