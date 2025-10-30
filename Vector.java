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
    
    boolean esBase(int base){
      int d=0; int na=n;
      while(na>0){
          d=na%10;
          na=na/10;
          if(d>=base){
              return false;
          }
      }
      return true;
    }
    
    
    
    boolean esPrimo(){
        int c=0;
        for(int i=1; i<=n;i++)if(n%i==0) c++;
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
                   //System.out.println(descargar()) ;
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
    
    boolean verifVectorOrdenadoAscRango(int a,int b){

        for(int i=a;i<b;i++){
            if(v.get(i)>v.get(i+1)){
                System.out.println("i= "+i);
               return false;
            }
        }
        return true;
    }
    
    void separPrimoNoPrimo(Vector vp,Vector vnp){
        Entero nro=new Entero();
        for(int i=0;i<longitud;i++){
            nro.cargar(v.get(i));
            if(nro.esPrimo())
                vp.agregarFinal(v.get(i));
             else
                vnp.agregarFinal(v.get(i));
        
        }
    }
    
    int mayorPosMul(int m){
        int i=0;
        int mayor=v.get(0);
        while(i<longitud){
            if(v.get(i)>mayor){
                mayor=v.get(i);
            }
            i+=m;
        }
        return mayor;
    }
    
        int promedioPosMultiplos(int m){
            int i=0;
            int s=0;
            int c=0;
            while(i<longitud){
                s+=v.get(i);
                c++;
                i=i+m;
            }
            return (s/c);
    }
    
    int cantEleDiferentes(){
        int i=0,ele=0,c=0;
        ordenarAsc();
        while(i<longitud){
            ele=v.get(i);
           while(i<longitud &&
                  ele==v.get(i)){
            i++;
           }
           c++;
        }
        return c;
    }
    
    //rangos => todas mis demas funciones o
    //procedimientos tambien tienen que 
    //trabajar en rangos!!!!!!
    int cantEleDiferentesRango(int a, int b){
        int i=a,ele=0,c=0;
        ordenarAscRango(a,b);
        while(i<=b){
            ele=v.get(i);
            while(i<=b &&
                  ele==v.get(i)){
            i++;
           }
           c++;
        }
        return c;
    }
    
    int frecuencia(int ele){
        int c=0;
        for(int i=0;i<longitud;i++) 
          if(ele==v.get(i)) 
            c++;
        return c;
    }
    
     int frecuencia(int ele,int a, int b){
        int c=0;
        for(int i=a;i<=b;i++) 
          if(ele==v.get(i)) 
            c++;
        return c;
    }
    
    //elemento menos repetido
    int eleMenosRepetido(){
        int ele=v.get(0);
        int cant=frecuencia(ele) ;
        int frec;
        for(int i=1; i<longitud;i++){
            frec=frecuencia(v.get(i));
            if(frec<cant){
                ele=v.get(i);
                cant=frec;
            }
        }
        return ele;
    }
    
    int eleMenosRepetidoRango(int a ,int b){
        int ele=v.get(a);
        int cant=frecuencia(ele,a,b) ;
        int frec;
        for(int i=a; i<=b;i++){
            frec=frecuencia(v.get(i),a,b);
            if(frec<cant){
                ele=v.get(i);
                cant=frec;
            }
        }
        return ele;
    }
    
    
    // frecuencia de distribucion
    void frecuenciaDeDistribucion(Vector ve,Vector vf){
        int i=0,ele=0,c=0;
        ordenarAsc();
        while(i<longitud){
           ele=v.get(i); c=0;
           while(i<longitud &&
                  ele==v.get(i)){
            i++;
            c++;
           }
           ve.agregarFinal(ele);
           vf.agregarFinal(c);
        }
    }
    
    
    // frecuencia de distribucion con rango
    void frecuenciaDeDistribucion(Vector vri,Vector vrf, Vector vf,int rango){
        int i=0,c=0;
        int ri=0,rf;
        ordenarAsc();
        while(i<longitud){
           c=0;
           ri=(v.get(i)/rango)*rango;
           rf=ri+rango-1;
           while(i<longitud &&
                  (v.get(i)>=ri)&&
                  (v.get(i)<=rf)){
            i++;
            c++;
           }
           vri.agregarFinal(ri);
           vrf.agregarFinal(rf);
           vf.agregarFinal(c);
        }
    }
    int longitudVector(){
        return longitud;
    }
    
    //v{0,1,2,3,4,5,6,7}. v2{10,20,30,40} p=2
    //1er paso
    //v{0,1,2,3,4,5,6,7,0,0,0,0}
    //2do paso
    //v{0,1,0,0,0,0,3,4,5,6,7}
    //3er paso
    //v{0,1,10,20,30,40,2,3,4,5,6,7}
     int get(int pos){
         return v.get(pos);
     }
    void insertarVectorEnPosicion(Vector v2, int p){
       //1er paso
        for(int i=0;i<v2.longitudVector();i++){
            v.add(0);
        }
        longitud = longitud+v2.longitudVector();
        int j=0;
        //2 paso
        for(int i=((longitud-v2.longitudVector())-1); i>=p;i--){
           //  System.out.println(v);
             System.out.println(i+"  "+(longitud-1-j));
            intercambiar(i,longitud-1-j);
            
            j++;
        }
        //3er paso
        for(int i=0;i<v2.longitudVector();i++){
            v.set(p,v2.get(i));
            p++;
        }

    }
    //V = {10,110,1011,1111,101}, b = 2 → TRUE
    
    // v= {1,2,4,5,6,7}
    //v={1,10,100,101,011,111}
    
    boolean ejercicio21(int base){
        Entero nro=new Entero();
        for(int i=0;i<longitud;i++){
            nro.cargar(v.get(i));
            //v.set(i,nro.decABinario(v.get(i)));
            if(!nro.esBase(base)){
               return false; 
            }
        }
        return true;
    }
    
    //Intercalar dos vectores en un tercero
    //V = {1,3,5,7,9}, V2 = {2,4,6,8,10,12,14,16} v3={}
     //Resultado → v3{1,2,3,4,5,6,7,8,9,10,12,14,16}
     void ejercicio18(Vector v2,Vector v3){
         int iv=0,iv2=0;
         while(iv<longitud || iv2<v2.longitudVector() ){
             if(iv<longitud){
                v3.agregarFinal(v.get(iv));
                iv++;
             }
             if(iv2<v2.longitudVector()){
                 v3.agregarFinal(v2.get(iv2));
                 iv2++;
             }
         }
    }
    
    
}

class Main {
    public static void main(String[] args) {
       //ejercicio 18
        Vector v=new Vector();//instanciar = new Vector()
         Vector v2=new Vector();
         Vector v3=new Vector();
        v.cargarManual(5);
        v2.cargarManual(3);
        System.out.println( v.descargar());
        System.out.println( v2.descargar());
         System.out.println( v3.descargar());
         v.ejercicio18(v2,v3);
         System.out.println( v3.descargar());
        
       
       
       
       //ejercicio 8
       /* Vector v=new Vector();//instanciar = new Vector()
        Vector v2=new Vector();
         v.cargarManual(7);
         v2.cargarManual(4);
         System.out.println( v.descargar());
         System.out.println( v2.descargar());
         v.insertarVectorEnPosicion(v2,2);
         System.out.println( v.descargar());*/
        
        
      /*  Vector v=new Vector();//instanciar = new Vector()
        v.cargarManual(4);
        System.out.println( v.descargar());
        System.out.println(v.ejercicio21(2));
        */
        
        
        
        
       /* Vector vp=new Vector();
        Vector vnp=new Vector();
        Vector ve=new Vector();
        Vector vf=new Vector();
        
         Vector vri=new Vector();
        Vector vrf=new Vector();
       // v.cargar(10);
        v.cargarManual(12);
        //v.serieF(16);
        System.out.println( v.descargar());
        v.frecuenciaDeDistribucion(vri,vrf,vf,10);
         System.out.println( v.descargar());
         System.out.println( vri.descargar());
          System.out.println( vrf.descargar());
           System.out.println( vf.descargar());*/
        //v.frecuenciaDeDistribucion(ve,vf);
       //  System.out.println( ve.descargar());
        //  System.out.println( vf.descargar());
       // System.out.println( "Ele menos repetido = "+v.eleMenosRepetido());
        //System.out.println( "Cantidad Ele Dif = "+v.cantEleDiferentes());
        // System.out.println( "Mayor = "+v.mayorPosMul(3));
         // System.out.println( "Promedio = "+v.promedioPosMultiplos(3));
       // v.separPrimoNoPrimo(vp,vnp);
         //System.out.println( vp.descargar());
         //System.out.println( vnp.descargar());
        //v.eliminarElemRango(2,6);
        //v.ordenarAsc();
        //v.ordenarAscRango(2,4);
        //System.out.println( v.verifVectorOrdenadoAscRango(3,5));
        // System.out.println( v.descargar());
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