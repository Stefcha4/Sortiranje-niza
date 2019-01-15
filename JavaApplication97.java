package javaapplication97;

import java.util.Arrays;

public class JavaApplication97 {

    public static void main(String[] args) {
        
        int[] niz = {42,7,2,8,1,4,12,6,44,33,21,18,57};
        int[] niz1 = {42,7,2,8,1,4,12,6,44,33,21,18,57};
        int[] niz3 = {42,7,2,8,1,4,12,6,44,33,21,18,57};
        int[] niz4 = {40,17,22,89,11,8,1,4,9,6,44,33,27,18,5};
        
        //BUBBLE SORT
        boolean provera = false;
        int broj;
        while (provera==false){
        provera = true;
        for (int i=0; i<niz.length-1; i++) {
            if (niz[i] > niz[i+1]){
                broj = niz[i+1];
                niz[i+1] = niz[i];
                niz[i] = broj;
                provera = false;
            }
        } 
        }
        System.out.println(Arrays.toString(niz));
        
        
        
        //BUBBLE SORT
        for (int j=0; j<niz1.length; j++){
        for (int i=0; i<niz1.length-1; i++) {
            if (niz1[i] > niz1[i+1]){
                broj = niz1[i+1];
                niz1[i+1] = niz1[i];
                niz1[i] = broj;
                provera = false;
            }
        } 
        }
        System.out.println(Arrays.toString(niz1));
        
        
        
        
        //INSERTION SORT
        int j,key, brojac;
        for (int i=1; i<niz3.length; i++) {
            key = niz3[i];
            j = i-1;
            while(j>=0 && key<niz3[j]){
                brojac = niz3[j];
                niz3[j] = niz3[j+1];
                niz3[j+1] = brojac;
                j--;
            }
        }
        System.out.println(Arrays.toString(niz3));
        
        
        
        
        //SELECTION SORT
        int minIndex, minBroj, temp = 0;
        for (int i=0; i<niz4.length; i++) {
            minBroj = niz4[i];
            minIndex = i;
            for (int k=i; k<niz4.length; k++) {
                if (niz4[k] < minBroj){
                    minBroj = niz4[k];
                    minIndex = k;
                }
            }
            if (minBroj < niz4[i]){
                temp = niz4[i];
                niz4[i] = minBroj;
                niz4[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(niz4));
        
        for (int i=0; i<10; i++) {
            System.out.println(" I="+i);
            for (int k=i;k<5; k++) {
                System.out.print(" K="+k);
            }
        }
        
    }
    
}
