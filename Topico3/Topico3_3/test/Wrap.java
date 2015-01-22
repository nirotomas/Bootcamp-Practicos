/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomas
 */
class Wrap {
    private  String word;
    private  int lenght;
    private String wrap="";
    
    public Wrap(String word,int lenght){
        //System.out.println("paso13");
        this.word=word;
        //System.out.println("paso14 "+word);
        this.lenght=lenght;
        //System.out.println("paso15 "+lenght);
    }

    public String getWrapString() {
        int i,j;
      //  System.out.println(""+word.length());
        //System.out.println("paso");
        for ( i = 0; i < word.length(); i++) {//recorre todo el arreglo de caracteres
        //System.out.println("paso1");    
        //     System.out.println(""+i);
            
             
            for ( j = 0; j < lenght; j++) {//recorre la cantidad de caracteres de un solo paquete 
          //      System.out.println("paso por el jota");
                //System.out.println("paso2");
                if((j+i)>=word.length()){
                //    System.out.println("paso18");
                    //System.out.println(""+wrap.charAt(wrap.length()-1));
                   // System.out.println(""+wrap);
                    return wrap;
                }
            //    System.out.println(""+word.charAt((j+i))+"   "+(j+i));
              //  System.out.println("paso3");
                wrap+=""+word.charAt((j+i));
            //    System.out.println("paso4");
              //  System.out.println("wrap: ("+wrap+")");
            }
          // System.out.println("paso5");
            if((i+lenght)>word.length()){
                //System.out.println("entro al if");
        //        System.out.println("paso6");
                for (int k=i; k <=word.length(); k++) {
                    //System.out.println(""+word.charAt(k));
      //              System.out.println("paso7");
                    wrap+=""+word.charAt(k);
    //                System.out.println("paso8");
                    //System.out.println("wrap del if :( "+wrap+")");
                }
  //              System.out.println("paso9");
                //System.out.println("asdasd");
                //System.out.println("wrap del if :( "+wrap+")");
                return wrap;
            }
            //System.out.println("Salio del if");
//System.out.println("paso10");
            i+=(lenght-1);
       //     System.out.println("paso11");
            wrap+=",";
     //       System.out.println("paso12");
        }
   //     System.out.println("paso13");
        //System.out.println("asd");
        //System.out.println("wrap del return null :( "+wrap+")");
        return null;
    }
}
