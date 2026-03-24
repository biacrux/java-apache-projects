package minha_colecao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class ArrayColl <E>{ // tipo generico (susporta todo o tipo de dados)
    private E[] colecao;
    private int nelem;
    
    public ArrayColl(int cap){
        colecao = (E[])new Object[cap];   
    }
    
    public void add(E el){ //ficou generico
        if (nelem == colecao.length){
            throw new IllegalStateException("Colecao esta cheia");
        }else
        colecao[nelem ++]= el ;
    }
    
    public E remLast(){
        if(nelem == 0 ){
            return null;
        }else {
            E temp = colecao[--nelem];
            colecao[nelem]= null;
            return temp;
        }
    }
    
    public int getNumElement() {
        return nelem;
    }
    
    public int getCapacity(){
        return colecao.length;
    }
    
    @Override
    public String toString(){
        String str= " ";
        for (int i =0; i<nelem; i++){
            str+= colecao[i];
        }
        return str;
    }
    
}




