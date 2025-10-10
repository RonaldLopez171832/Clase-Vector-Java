import java.util.ArrayList;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 class Vector {
    // atributos
    int longitud;
    ArrayList<Integer> v;

    // constructor: instanciar los atributos
    public Vector() {
        v = new ArrayList<Integer>();
        longitud = 0;
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
        String s="[ ";
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
        for(int i=a;i<=b;i++){
            s=s+v.get(i);
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
    
    void serieFibo(int ce){
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
    
    
    

    
    
}

class Main {
    public static void main(String[] args) {

        Vector v=new Vector();//instanciar = new Vector()
        v.cargar(10);
      //  v.serieFibo(16);
        System.out.println( v.descargar());
        System.out.println("Sumatoria total: " + v.sumatoriaTotal(3,6));
        //v.agregarFinal(11);
       // v.intercambiar(2,3);
     //v.agregarElePos(0,10);
       //((v.invertirPro();
     //  System.out.println( v.descargar());
       
    }
}








