
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MidPoint {
    public static void main(String[] args) throws FileNotFoundException {        
        
        
     File f = new File("text.txt");
        
         Scanner sc = new Scanner(f);
         
         int[] ais = new int[(int)f.length()]; 
         int[] mod = new int[(int)f.length()];                     
         int[] blo = new int[(int)f.length()];
         
         int count=1;  
         
       while(sc.hasNext()){
        String v1 = sc.next(); 
        int c1 = Integer.parseInt(v1); //aisle
        String v2 = sc.next();
        int c2 = Integer.parseInt(v2); 
                
        
        if(c2 >= 500){ //500lerdeyse
            blo[count]=1;
            if(c2%2==0){
              c2 = (c2%500)+2; 
            }
            else{
              c2 = c2%500;  //if odd
            }  
        }
        else if(c2>=1 &&c2<11){
            blo[count]=2;
            c2 = c2+14;
        }
        else if(c2<=20 && c2>10){
            blo[count]=3;
            c2 = c2+14;
        }
       
        
            ais[count]=c1; 
            mod[count]=c2;      
             
 
            
        System.out.println(count+")"+" "+" Aisle: "+c1+" Module: "+c2+" Block: "+blo[count]); 
        count++;

    }
       
                 
         System.out.println("This is the distance with midpoint: ");
         
         midPoint(ais, mod, blo);
        
        
        
        
        
    }
    
     public static void midPoint(int[] ais, int[] mod, int[] blo){
        double totalDistance = 0;
        
        double moduleLength = 2.4;
        double aisleLength = 1.2;  
        double crossAisle = 2.5;
        double distBetweenAisle = 1;
        
        //find an easy way
        int[] downArray1 = new int[35]; int[] upArray1 = new int[35];
        int[] downArray2 = new int[35]; int[] upArray2 = new int[35];
        int[] downArray3 = new int[35]; int[] upArray3 = new int[35];
        int[] downArray4 = new int[35]; int[] upArray4 = new int[35];
        int[] downArray5 = new int[35]; int[] upArray5 = new int[35];
        int[] downArray6 = new int[35]; int[] upArray6 = new int[35];
        int[] downArray7 = new int[35]; int[] upArray7 = new int[35];
        int[] downArray8 = new int[35]; int[] upArray8 = new int[35];
        int[] downArray9 = new int[35]; int[] upArray9 = new int[35];
        int[] downArray10 = new int[35]; int[] upArray10 = new int[35];
        int[] downArray11 = new int[35]; int[] upArray11 = new int[35];
        int[] downArray12 = new int[35]; int[] upArray12 = new int[35];
        int[] downArray13 = new int[35]; int[] upArray13 = new int[35];
        int[] downArray14 = new int[35]; int[] upArray14 = new int[35];
        int[] downArray15 = new int[35]; int[] upArray15 = new int[35];
        int[] downArray16 = new int[35]; int[] upArray16 = new int[35];
        int[] downArray17 = new int[35]; int[] upArray17 = new int[35];
        int[] downArray18 = new int[35]; int[] upArray18 = new int[35];
        int[] downArray19 = new int[35]; int[] upArray19 = new int[35];
        int[] downArray20 = new int[35]; int[] upArray20 = new int[35];
        int[] downArray21 = new int[35]; int[] upArray21 = new int[35];
        int[] downArray22 = new int[35]; int[] upArray22 = new int[35];
        int[] downArray23 = new int[35]; int[] upArray23 = new int[35];
        int[] downArray24 = new int[35]; int[] upArray24 = new int[35];
        
        
        int k1 = 1; int k2 = 1; int k3 = 1; int k4 = 1;
        int k5 = 1; int k6 = 1; int k7 = 1; int k8 = 1;
        int k9 = 1; int k10 = 1; int k11 = 1; int k12 = 1;
        int k13 = 1; int k14 = 1; int k15 = 1; int k16 = 1;
        int k17 = 1; int k18 = 1; int k19 = 1; int k20 = 1;
        int k21 = 1; int k22 = 1; int k23 = 1; int k24 = 1;
        int k25 = 1; int k26 = 1; int k27 = 1; int k28 = 1;
        int k29 = 1; int k30 = 1; int k31 = 1; int k32 = 1;
        int k33 = 1; int k34 = 1; int k35 = 1; int k36 = 1;
        int k37 = 1; int k38 = 1; int k39 = 1; int k40 = 1;
        int k41 = 1; int k42 = 1; int k43 = 1; int k44 = 1;
        int k45 = 1; int k46 = 1; int k47 = 1; int k48 = 1;
        
        int[] aisNo = new int[100];
        for(int h=2;h<ais.length-1;h++){
            aisNo[1]=ais[1];
            if(ais[h]!=ais[h+1]){
                aisNo[h]=ais[h+1];
            }
        }
        
        for(int a=1; a<ais.length; a++){//here we record the modules(to pick) to their aisles until the aisle length
                
                      if(mod[a]<=18){
                          downArray1[k1]=mod[a];
                          System.out.println("Array is: "+downArray1[k1]);
                          k1++;
                      }
                      else if(mod[a]>18){
                          upArray1[k2]=mod[a];
                          System.out.println("Array is: "+upArray1[k2]);
                          k2++;  
                      }    
           
            else if(ais[a]==2){
                
                      if(mod[a]<=18){
                          downArray2[k3]=mod[a];
                          System.out.println("Array is: "+downArray2[k3]);
                          k3++;
                      }
                      else if(mod[a]>18){
                          upArray2[k4]=mod[a];
                          System.out.println("Array is: "+upArray2[k4]);
                          k4++;  
                      }
            }
            else if(ais[a]==3){
               
                      if(mod[a]<=18){
                          downArray3[k5]=mod[a];
                          System.out.println("Array is: "+downArray3[k5]);
                          k5++;
                      }
                      else if(mod[a]>18){
                          upArray3[k6]=mod[a];
                          System.out.println("Array is: "+upArray3[k6]);
                          k6++;  
                      }
            }
            else if(ais[a]==4){
                
                      if(mod[a]<=18){
                          downArray4[k7]=mod[a];
                          System.out.println("Array is: "+downArray4[k7]);
                          k7++;                     
                      }
                      else if(mod[a]>18){
                          upArray4[k8]=mod[a];
                          System.out.println("Array is: "+upArray4[k8]);
                          k8++;                         
                      }               
            }
            else if(ais[a]==5){
                             
                      if(mod[a]<=18){
                          downArray5[k9]=mod[a];
                          System.out.println("Array is: "+downArray5[k9]);
                          k9++; 
                      }
                      else if(mod[a]>18){
                          upArray5[k10]=mod[a];
                          System.out.println("Array is: "+upArray5[k10]);
                          k10++;  
                          
                      }
                
            }
            else if(ais[a]==6){
                
                      if(mod[a]<=18){
                          downArray6[k11]=mod[a];
                          System.out.println("Array is: "+downArray6[k11]);
                          k11++;
                          
                      }
                      else if(mod[a]>18){
                          upArray6[k12]=mod[a];
                          System.out.println("Array is: "+upArray6[k12]);
                          k12++;  
                          
                      }
                
            }
            else if(ais[a]==7){
               
                      if(mod[a]<=18){
                          downArray7[k13]=mod[a];
                          System.out.println("Array is: "+downArray7[k13]);
                          k13++;
                          
                      }
                      else if(mod[a]>18){
                          upArray7[k14]=mod[a];
                          System.out.println("Array is: "+upArray7[k14]);
                          k14++;  
                          
                      }
                
            }
            else if(ais[a]==8){
                
                      if(mod[a]<=18){
                          downArray8[k15]=mod[a];
                          System.out.println("Array is: "+downArray8[k15]);
                          k15++;                        
                      }
                      else if(mod[a]>18){
                          upArray8[k16]=mod[a];
                          System.out.println("Array is: "+upArray8[k16]);
                          k16++;  
                      }
                
            }
            else if(ais[a]==9){
              
                      if(mod[a]<=18){
                          downArray9[k17]=mod[a];
                          System.out.println("Array is: "+downArray9[k17]);
                          k17++;
                          
                      }
                      else if(mod[a]>18){
                          upArray9[k18]=mod[a];
                          System.out.println("Array is: "+upArray9[k18]);
                          k18++;  
                          
                      }
                
            }
            else if(ais[a]==10){
                               
                      if(mod[a]<=18){
                          downArray10[k19]=mod[a];
                          System.out.println("Array is: "+downArray10[k19]);
                          k19++;
                          
                      }
                      else if(mod[a]>18){
                          upArray10[k20]=mod[a];
                          System.out.println("Array is: "+upArray10[k20]);
                          k20++;  
                          
                      }
                
            }
            else if(ais[a]==11){
                               
                      if(mod[a]<=18){
                          downArray11[k21]=mod[a];
                          System.out.println("Array is: "+downArray11[k21]);
                          k21++;
                          
                      }
                      else if(mod[a]>18){
                          upArray11[k22]=mod[a];
                          System.out.println("Array is: "+upArray11[k22]);
                          k22++;  
                          
                      }
                
            }
            else if(ais[a]==12){
                
                
                      if(mod[a]<=18){
                          downArray12[k23]=mod[a];
                          System.out.println("Array is: "+downArray12[k23]);
                          k23++;
                          
                      }
                      else if(mod[a]>18){
                          upArray12[k24]=mod[a];
                          System.out.println("Array is: "+upArray12[k24]);
                          k24++;  
                          
                      }
                
            }
            else if(ais[a]==13){
                               
                      if(mod[a]<=18){
                          downArray13[k25]=mod[a];
                          System.out.println("Array is: "+downArray13[k25]);
                          k25++;
                          
                      }
                      else if(mod[a]>18){
                          upArray13[k26]=mod[a];
                          System.out.println("Array is: "+upArray13[k26]);
                          k26++;  
                          
                      }
                
            }
            else if(ais[a]==14){
                                
                      if(mod[a]<=18){
                          downArray14[k27]=mod[a];
                          System.out.println("Array is: "+downArray14[k27]);
                          k27++;
                          
                      }
                      else if(mod[a]>18){
                          upArray14[k28]=mod[a];
                          System.out.println("Array is: "+upArray14[k28]);
                          k28++;  
                          
                      }
                
            }
            else if(ais[a]==15){
                                
                      if(mod[a]<=18){
                          downArray15[k29]=mod[a];
                          System.out.println("Array is: "+downArray15[k29]);
                          k29++;
                          
                      }
                      else if(mod[a]>18){
                          upArray15[k30]=mod[a];
                          System.out.println("Array is: "+upArray15[k30]);
                          k30++;  
                          
                      }
                
            }
            else if(ais[a]==16){
                                
                      if(mod[a]<=18){
                          downArray16[k31]=mod[a];
                          System.out.println("Array is: "+downArray16[k31]);
                          k31++;
                          
                      }
                      else if(mod[a]>18){
                          upArray16[k32]=mod[a];
                          System.out.println("Array is: "+upArray16[k32]);
                          k32++;  
                          
                      }
                
            }
            else if(ais[a]==17){
                                
                      if(mod[a]<=18){
                          downArray17[k33]=mod[a];
                          System.out.println("Array is: "+downArray17[k33]);
                          k33++;
                          
                      }
                      else if(mod[a]>18){
                          upArray17[k34]=mod[a];
                          System.out.println("Array is: "+upArray17[k34]);
                          k34++;  
                          
                      }
                
            }
            else if(ais[a]==18){
                
                      if(mod[a]<=18){
                          downArray18[k35]=mod[a];
                          System.out.println("Array is: "+downArray18[k35]);
                          k35++;
                          
                      }
                      else if(mod[a]>18){
                          upArray18[k36]=mod[a];
                          System.out.println("Array is: "+upArray18[k36]);
                          k36++;  
                          
                      }
                
            }
            else if(ais[a]==19){
                
                      if(mod[a]<=18){
                          downArray19[k37]=mod[a];
                          System.out.println("Array is: "+downArray19[k37]);
                          k37++;
                          
                      }
                      else if(mod[a]>18){
                          upArray19[k38]=mod[a];
                          System.out.println("Array is: "+upArray19[k38]);
                          k38++;  
                          
                      }
                
            }
            else if(ais[a]==20){
                
                      if(mod[a]<=18){
                          downArray20[k39]=mod[a];
                          System.out.println("Array is: "+downArray20[k39]);
                          k39++;
                          
                      }
                      else if(mod[a]>18){
                          upArray20[k40]=mod[a];
                          System.out.println("Array is: "+upArray20[k40]);
                          k40++;  
                          
                      }
                
            }
            else if(ais[a]==21){
                
                      if(mod[a]<=18){
                          downArray21[k41]=mod[a];
                          System.out.println("Array is: "+downArray21[k41]);
                          k41++;
                          
                      }
                      else if(mod[a]>18){
                          upArray21[k42]=mod[a];
                          System.out.println("Array is: "+upArray21[k42]);
                          k42++;  
                          
                      }
                
            }
            else if(ais[a]==22){
                         
                      if(mod[a]<=18){
                          downArray22[k43]=mod[a];
                          System.out.println("Array is: "+downArray22[k43]);
                          k43++;                          
                      }
                      else if(mod[a]>18){
                          upArray22[k44]=mod[a];
                          System.out.println("Array is: "+upArray22[k44]);
                          k44++;                          
                      }                
            }
            else if(ais[a]==23){
                             
                      if(mod[a]<=18){
                          downArray23[k45]=mod[a];
                          System.out.println("Array is: "+downArray23[k45]);
                          k45++;                   
                      }
                      else if(mod[a]>18){
                          upArray23[k46]=mod[a];
                          System.out.println("Array is: "+upArray23[k46]);
                          k46++;                          
                      }                
            }
            else if(ais[a]==24){
                             
                      if(mod[a]<=18){
                          downArray24[k47]=mod[a];
                          System.out.println("Array is: "+downArray24[k47]);
                          k47++;                          
                      }
                      else if(mod[a]>18){
                          upArray24[k48]=mod[a];
                          System.out.println("Array is: "+upArray24[k48]);
                          k48++;                           
                      }                
            }
        }    
     
        
        for(int n=1; n<aisNo.length; n++){
            
            if(aisNo[n]==1){      
                  int[] downEven1 = new int[17]; 
                  int[] downOdd1 = new int[17];
                  int[] upEven1 = new int[17];
                  int[] upOdd1 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray1.length;s++){ //to sort the downArray 
                   for(int t=s+1; t<downArray1.length;t++){
                       if(downArray1[s]>downArray1[t] && downArray1[t]!=0){
                           tempE = downArray1[s];
                           downArray1[s] = downArray1[t];
                           downArray1[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray1.length;s++){ //to sort the upArray 
                   for(int t=s+1; t<upArray1.length;t++){
                       if(upArray1[s]>upArray1[t] && upArray1[t]!=0){
                           tempE = upArray1[s];
                           upArray1[s] = upArray1[t];
                           upArray1[t] = tempE;        
                       }
                   }
                }
               System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray1.length; f++){
                    if(downArray1[f]%2==0 && downArray1[f]!=0){
                        downEven1[c1]=downArray1[f];
                        System.out.print(" | "+downEven1[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray1[f]%2!=0 && downArray1[f]!=0){
                        downOdd1[c2]=downArray1[f];
                        System.out.print(" | "+downOdd1[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray1.length; f++){
                    if(upArray1[f]%2==0 && upArray1[f]!=0){
                        upEven1[c3]=upArray1[f];
                        System.out.print(" | "+upEven1[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray1[f]%2!=0 && upArray1[f]!=0){
                        upOdd1[c4]=upArray1[f];
                        System.out.print(" | "+upOdd1[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven1[c1-1]>=15 && downEven1[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven1[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd1[c2-1]>=15 && downOdd1[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd1[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven1[c1-1]>=19 && upEven1[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven1[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd1[c2-1]>=19 && upOdd1[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd1[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                double downdistance = Math.abs(((Math.max(((downEven1[c1-1]-6)/2), ((downOdd1[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven1[c1-1]-(34))/2), ((upOdd1[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
              }
            else if(aisNo[n]==2){
               int[] downEven2 = new int[17]; 
                  int[] downOdd2 = new int[17];
                  int[] upEven2 = new int[17];
                  int[] upOdd2 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray2.length;s++){ //to sort the downArray 
                   for(int t=s+1; t<downArray2.length;t++){
                       if(downArray2[s]>downArray2[t] && downArray2[t]!=0){
                           tempE = downArray2[s];
                           downArray2[s] = downArray2[t];
                           downArray2[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray2.length;s++){ //to sort the upArray  
                   for(int t=s+1; t<upArray2.length;t++){
                       if(upArray2[s]>upArray2[t] && upArray2[t]!=0){
                           tempE = upArray2[s];
                           upArray2[s] = upArray2[t];
                           upArray2[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray2.length; f++){
                    if(downArray2[f]%2==0 && downArray2[f]!=0){//record the evens of sorted array to downEven
                        downEven2[c1]=downArray2[f];
                        System.out.print(" | "+downEven2[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray2[f]%2!=0 && downArray2[f]!=0){//record the odds of sorted array to downOdd
                        downOdd2[c2]=downArray2[f];
                        System.out.print(" | "+downOdd2[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray2.length; f++){
                    if(upArray2[f]%2==0 && upArray2[f]!=0){//record the evens of sorted array to upEven
                        upEven2[c3]=upArray2[f];
                        System.out.print(" | "+upEven2[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray2[f]%2!=0 && upArray2[f]!=0){//record the odds of sorted array to uppOdd
                        upOdd2[c4]=upArray2[f];
                        System.out.print(" | "+upOdd2[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven2[c1-1]>=15 && downEven2[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven2[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd2[c2-1]>=15 && downOdd2[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd2[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven2[c1-1]>=19 && upEven2[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven2[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd2[c2-1]>=19 && upOdd2[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd2[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
              
                double downdistance = Math.abs(((Math.max(((downEven2[c1-1]-6)/2), ((downOdd2[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven2[c1-1]-(34))/2), ((upOdd2[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance); 
            }
            else if(aisNo[n]==3){
                  int[] downEven3 = new int[17]; 
                  int[] downOdd3 = new int[17];
                  int[] upEven3 = new int[17];
                  int[] upOdd3 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray3.length;s++){ 
                   for(int t=s+1; t<downArray3.length;t++){
                       if(downArray3[s]>downArray3[t] && downArray3[t]!=0){
                           tempE = downArray3[s];
                           downArray3[s] = downArray3[t];
                           downArray3[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray3.length;s++){  
                   for(int t=s+1; t<upArray3.length;t++){
                       if(upArray3[s]>upArray3[t] && upArray3[t]!=0){
                           tempE = upArray3[s];
                           upArray3[s] = upArray3[t];
                           upArray3[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray3.length; f++){
                    if(downArray3[f]%2==0 && downArray3[f]!=0){
                        downEven3[c1]=downArray3[f];
                        System.out.print(" | "+downEven3[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray3[f]%2!=0 && downArray3[f]!=0){
                        downOdd3[c2]=downArray3[f];
                        System.out.print(" | "+downOdd3[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray3.length; f++){
                    if(upArray3[f]%2==0 && upArray3[f]!=0){
                        upEven3[c3]=upArray3[f];
                        System.out.print(" | "+upEven3[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray3[f]%2!=0 && upArray3[f]!=0){
                        upOdd3[c4]=upArray3[f];
                        System.out.print(" | "+upOdd3[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven3[c1-1]>=15 && downEven3[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven3[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd3[c2-1]>=15 && downOdd3[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd3[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven3[c1-1]>=19 && upEven3[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven3[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd3[c2-1]>=19 && upOdd3[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd3[c2-1]>=25){
                    countOddUpBlock = 0;
                }
      
                double downdistance = Math.abs(((Math.max(((downEven3[c1-1]-6)/2), ((downOdd3[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven3[c1-1]-(34))/2), ((upOdd3[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==4){
                int[] downEven4 = new int[17]; 
                  int[] downOdd4 = new int[17];
                  int[] upEven4 = new int[17];
                  int[] upOdd4 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray4.length;s++){  
                   for(int t=s+1; t<downArray4.length;t++){
                       if(downArray4[s]>downArray4[t] && downArray4[t]!=0){
                           tempE = downArray4[s];
                           downArray4[s] = downArray4[t];
                           downArray4[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray4.length;s++){ 
                   for(int t=s+1; t<upArray4.length;t++){
                       if(upArray4[s]>upArray4[t] && upArray4[t]!=0){
                           tempE = upArray4[s];
                           upArray4[s] = upArray4[t];
                           upArray4[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray4.length; f++){
                    if(downArray4[f]%2==0 && downArray4[f]!=0){
                        downEven4[c1]=downArray4[f];
                        System.out.print(" | "+downEven4[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray4[f]%2!=0 && downArray4[f]!=0){
                        downOdd4[c2]=downArray4[f];
                        System.out.print(" | "+downOdd4[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray4.length; f++){
                    if(upArray4[f]%2==0 && upArray4[f]!=0){
                        upEven4[c3]=upArray4[f];
                        System.out.print(" | "+upEven4[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray4[f]%2!=0 && upArray4[f]!=0){
                        upOdd4[c4]=upArray4[f];
                        System.out.print(" | "+upOdd4[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven4[c1-1]>=15 && downEven4[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven4[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd4[c2-1]>=15 && downOdd4[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd4[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven4[c1-1]>=19 && upEven4[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven4[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd4[c2-1]>=19 && upOdd4[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd4[c2-1]>=25){
                    countOddUpBlock = 0;
                }

              
                double downdistance = Math.abs(((Math.max(((downEven4[c1-1]-6)/2), ((downOdd4[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven4[c1-1]-(34))/2), ((upOdd4[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==5){
                int[] downEven5 = new int[17]; 
                  int[] downOdd5 = new int[17];
                  int[] upEven5 = new int[17];
                  int[] upOdd5 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray5.length;s++){  
                   for(int t=s+1; t<downArray5.length;t++){
                       if(downArray5[s]>downArray5[t] && downArray5[t]!=0){
                           tempE = downArray5[s];
                           downArray5[s] = downArray5[t];
                           downArray5[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray5.length;s++){ 
                   for(int t=s+1; t<upArray5.length;t++){
                       if(upArray5[s]>upArray5[t] && upArray5[t]!=0){
                           tempE = upArray5[s];
                           upArray5[s] = upArray5[t];
                           upArray5[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray5.length; f++){
                    if(downArray5[f]%2==0 && downArray5[f]!=0){
                        downEven5[c1]=downArray5[f];
                        System.out.print(" | "+downEven5[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray5[f]%2!=0 && downArray5[f]!=0){
                        downOdd5[c2]=downArray5[f];
                        System.out.print(" | "+downOdd5[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray5.length; f++){
                    if(upArray5[f]%2==0 && upArray5[f]!=0){
                        upEven5[c3]=upArray5[f];
                        System.out.print(" | "+upEven5[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray5[f]%2!=0 && upArray5[f]!=0){
                        upOdd5[c4]=upArray5[f];
                        System.out.print(" | "+upOdd5[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven5[c1-1]>=15 && downEven5[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven5[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd5[c2-1]>=15 && downOdd5[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd5[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven5[c1-1]>=19 && upEven5[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven5[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd5[c2-1]>=19 && upOdd5[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd5[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
              
                
                double downdistance = Math.abs(((Math.max(((downEven5[c1-1]-6)/2), ((downOdd5[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven5[c1-1]-(34))/2), ((upOdd5[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==6){
                int[] downEven6 = new int[17]; 
                  int[] downOdd6 = new int[17];
                  int[] upEven6 = new int[17];
                  int[] upOdd6 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray6.length;s++){ 
                   for(int t=s+1; t<downArray6.length;t++){
                       if(downArray6[s]>downArray6[t] && downArray6[t]!=0){
                           tempE = downArray6[s];
                           downArray6[s] = downArray6[t];
                           downArray6[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray6.length;s++){ 
                   for(int t=s+1; t<upArray6.length;t++){
                       if(upArray6[s]<upArray6[t] && upArray6[t]!=0){
                           tempE = upArray6[s];
                           upArray6[s] = upArray6[t];
                           upArray6[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray6.length; f++){
                    if(downArray6[f]%2==0 && downArray6[f]!=0){
                        downEven6[c1]=downArray6[f];
                        System.out.print(" | "+downEven6[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray6[f]%2!=0 && downArray6[f]!=0){
                        downOdd6[c2]=downArray6[f];
                        System.out.print(" | "+downOdd6[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray6.length; f++){
                    if(upArray6[f]%2==0 && upArray6[f]!=0){
                        upEven6[c3]=upArray6[f];
                        System.out.print(" | "+upEven6[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray6[f]%2!=0 && upArray6[f]!=0){
                        upOdd6[c4]=upArray6[f];
                        System.out.print(" | "+upOdd6[c4]+" | ");  
                        c4++;
                    }
                }
                 System.out.println("");
                  for(int x=1;x<downEven6.length;x++){/////////////////////////////////////77
                      if(downEven6[x]!=0){
                          System.out.print(" Down even: "+downEven6[x]);
                      }
                      
                  }
                   System.out.println("");
                  for(int x=1;x<downOdd6.length;x++){
                      if(downOdd6[x]!=0){
                        System.out.print(" Down odd: "+downOdd6[x]);  
                      }
                      
                  }
                   System.out.println(" ");
                  for(int x=1;x<upEven6.length;x++){
                      if(upEven6[x]!=0){
                         System.out.print(" Up even: "+upEven6[x]);
                      }
                      
                  }
                   System.out.println(" ");
                  for(int x=1;x<upOdd6.length;x++){
                      if(upOdd6[x]!=0){
                         System.out.print(" Up odd: "+upOdd6[x]);
                      }
                  }
                  System.out.print("");
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven6[c1-1]>=15 && downEven6[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven6[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd6[c2-1]>=15 && downOdd6[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd6[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven6[c1-1]>=19 && upEven6[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven6[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd6[c2-1]>=19 && upOdd6[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(upOdd6[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                double downdistance = Math.abs(((Math.max(((downEven6[c1-1]-2)/2), ((downOdd6[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.min(((34-upEven6[c3-1])/2), ((33-upOdd6[c4-1])/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
                
                
            }
            else if(aisNo[n]==7){
                int[] downEven7 = new int[17]; 
                  int[] downOdd7 = new int[17];
                  int[] upEven7 = new int[17];
                  int[] upOdd7 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray7.length;s++){ 
                   for(int t=s+1; t<downArray7.length;t++){
                       if(downArray7[s]>downArray7[t] && downArray7[t]!=0){
                           tempE = downArray7[s];
                           downArray7[s] = downArray7[t];
                           downArray7[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray7.length;s++){ 
                   for(int t=s+1; t<upArray7.length;t++){
                       if(upArray7[s]<upArray7[t] && upArray7[t]!=0){
                           tempE = upArray7[s];
                           upArray7[s] = upArray7[t];
                           upArray7[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray7.length; f++){
                    if(downArray7[f]%2==0 && downArray7[f]!=0){
                        downEven7[c1]=downArray7[f];
                        System.out.print(" | "+downEven7[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray7[f]%2!=0 && downArray7[f]!=0){
                        downOdd7[c2]=downArray7[f];
                        System.out.print(" | "+downOdd7[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray7.length; f++){
                    if(upArray7[f]%2==0 && upArray7[f]!=0){
                        upEven7[c3]=upArray7[f];
                        System.out.print(" | "+upEven7[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray7[f]%2!=0 && upArray7[f]!=0){
                        upOdd7[c4]=upArray7[f];
                        System.out.print(" | "+upOdd7[c4]+" | ");  
                        c4++;
                    }
                }
                  System.out.println("");
                  for(int x=1;x<downEven7.length;x++){/////////////////////////////////////77
                      if(downEven7[x]!=0){
                          System.out.print(" Down even: "+downEven7[x]);
                      }
                      
                  }
                   System.out.println("");
                  for(int x=1;x<downOdd7.length;x++){
                      if(downOdd7[x]!=0){
                        System.out.print(" Down odd: "+downOdd7[x]);  
                      }
                      
                  }
                   System.out.println(" ");
                  for(int x=1;x<upEven7.length;x++){
                      if(upEven7[x]!=0){
                         System.out.print(" Up even: "+upEven7[x]);
                      }
                      
                  }
                   System.out.println(" ");
                  for(int x=1;x<upOdd7.length;x++){
                      if(upOdd7[x]!=0){
                         System.out.print(" Up odd: "+upOdd7[x]);
                      }
                  }
                  System.out.print("");
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven7[c1-1]>=15 && downEven7[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven7[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd7[c2-1]>=15 && downOdd7[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd7[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven7[c1-1]>=19 && upEven7[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven7[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd7[c2-1]>=19 && upOdd7[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(upOdd7[c2-1]>=25){
                    countOddUpBlock = 0;
                }
        
              
                double downdistance = Math.abs(((Math.max(((downEven7[c1-1]-2)/2), ((downOdd7[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.min((((34-upEven7[c3-1]))/2), (((34-upOdd7[c4-1]))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==8){
                int[] downEven8 = new int[17]; 
                  int[] downOdd8 = new int[17];
                  int[] upEven8 = new int[17];
                  int[] upOdd8 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray8.length;s++){ //bu down array'i sortlamak iÃ§in 
                   for(int t=s+1; t<downArray8.length;t++){
                       if(downArray8[s]>downArray8[t] && downArray8[t]!=0){
                           tempE = downArray8[s];
                           downArray8[s] = downArray8[t];
                           downArray8[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray8.length;s++){ //bu up array'i sortlamak iÃ§in 
                   for(int t=s+1; t<upArray8.length;t++){
                       if(upArray8[s]>upArray8[t] && upArray8[t]!=0){
                           tempE = upArray8[s];
                           upArray8[s] = upArray8[t];
                           upArray8[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray8.length; f++){
                    if(downArray8[f]%2==0 && downArray8[f]!=0){//sortlanmÄ±ÅŸ arraydekileri down Ã§ift arrayine yazÄ±yoruz
                        downEven8[c1]=downArray8[f];
                        System.out.print(" | "+downEven8[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray8[f]%2!=0 && downArray8[f]!=0){//sortlanmÄ±ÅŸ arraydekileri down tek arrayine yazÄ±yoruz
                        downOdd8[c2]=downArray8[f];
                        System.out.print(" | "+downOdd8[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray8.length; f++){
                    if(upArray8[f]%2==0 && upArray8[f]!=0){//sortlanmÄ±ÅŸ arraydekileri up Ã§ift arrayine yazÄ±yoruz
                        upEven8[c3]=upArray8[f];
                        System.out.print(" | "+upEven8[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray8[f]%2!=0 && upArray8[f]!=0){//sortlanmÄ±ÅŸ arraydekileri up tek arrayine yazÄ±yoruz
                        upOdd8[c4]=upArray8[f];
                        System.out.print(" | "+upOdd8[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven8[c1-1]>=15 && downEven8[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven8[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd8[c2-1]>=15 && downOdd8[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd8[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven8[c1-1]>=19 && upEven8[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven8[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd8[c2-1]>=19 && upOdd8[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd8[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
              
                double downdistance = Math.abs(((Math.max(((downEven8[c1-1]-2)/2), ((downOdd8[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max((Math.abs(upEven8[c1-1]-(14))/2), (Math.abs(upOdd8[c2-1]-(13))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==9){
                int[] downEven9 = new int[17]; 
                  int[] downOdd9 = new int[17];
                  int[] upEven9 = new int[17];
                  int[] upOdd9 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray9.length;s++){ //bu down array'i sortlamak iÃ§in 
                   for(int t=s+1; t<downArray9.length;t++){
                       if(downArray9[s]>downArray9[t] && downArray9[t]!=0){
                           tempE = downArray9[s];
                           downArray9[s] = downArray9[t];
                           downArray9[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray9.length;s++){ //bu up array'i sortlamak iÃ§in 
                   for(int t=s+1; t<upArray9.length;t++){
                       if(upArray9[s]>upArray9[t] && upArray9[t]!=0){
                           tempE = upArray9[s];
                           upArray9[s] = upArray9[t];
                           upArray9[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray9.length; f++){
                    if(downArray9[f]%2==0 && downArray9[f]!=0){
                        downEven9[c1]=downArray9[f];
                        System.out.print(" | "+downEven9[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray9[f]%2!=0 && downArray9[f]!=0){
                        downOdd9[c2]=downArray9[f];
                        System.out.print(" | "+downOdd9[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray9.length; f++){
                    if(upArray9[f]%2==0 && upArray9[f]!=0){
                        upEven9[c3]=upArray9[f];
                        System.out.print(" | "+upEven9[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray9[f]%2!=0 && upArray9[f]!=0){
                        upOdd9[c4]=upArray9[f];
                        System.out.print(" | "+upOdd9[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven9[c1-1]>=15 && downEven9[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven9[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd9[c2-1]>=15 && downOdd9[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd9[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven9[c1-1]>=19 && upEven9[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven9[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd9[c2-1]>=19 && upOdd9[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd9[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
                double downdistance = Math.abs(((Math.max(((downEven9[c1-1]-2)/2), ((downOdd9[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max((Math.abs(upEven9[c1-1]-(14))/2), (Math.abs(upOdd9[c2-1]-(13))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
                
                
            }
            else if(aisNo[n]==10){
                int[] downEven10 = new int[17]; 
                  int[] downOdd10 = new int[17];
                  int[] upEven10 = new int[17];
                  int[] upOdd10 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray10.length;s++){ 
                   for(int t=s+1; t<downArray10.length;t++){
                       if(downArray10[s]>downArray10[t] && downArray10[t]!=0){
                           tempE = downArray10[s];
                           downArray10[s] = downArray10[t];
                           downArray10[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray10.length;s++){ 
                   for(int t=s+1; t<upArray10.length;t++){
                       if(upArray10[s]>upArray10[t] && upArray10[t]!=0){
                           tempE = upArray10[s];
                           upArray10[s] = upArray10[t];
                           upArray10[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray10.length; f++){
                    if(downArray10[f]%2==0 && downArray10[f]!=0){
                        downEven10[c1]=downArray10[f];
                        System.out.print(" | "+downEven10[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray10[f]%2!=0 && downArray10[f]!=0){
                        downOdd10[c2]=downArray10[f];
                        System.out.print(" | "+downOdd10[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray10.length; f++){
                    if(upArray10[f]%2==0 && upArray10[f]!=0){
                        upEven10[c3]=upArray10[f];
                        System.out.print(" | "+upEven10[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray10[f]%2!=0 && upArray10[f]!=0){
                        upOdd10[c4]=upArray10[f];
                        System.out.print(" | "+upOdd10[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven10[c1-1]>=15 && downEven10[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven10[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd10[c2-1]>=15 && downOdd10[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd10[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven10[c1-1]>=19 && upEven10[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven10[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd10[c2-1]>=19 && upOdd10[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd10[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
                double downdistance = Math.abs(((Math.max(((downEven10[c1-1]-2)/2), ((downOdd10[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max((Math.abs(upEven10[c1-1]-(14))/2), (Math.abs(upOdd10[c2-1]-(13))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==11){
                int[] downEven11 = new int[17]; 
                  int[] downOdd11 = new int[17];
                  int[] upEven11 = new int[17];
                  int[] upOdd11 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray11.length;s++){ 
                   for(int t=s+1; t<downArray11.length;t++){
                       if(downArray11[s]>downArray11[t] && downArray11[t]!=0){
                           tempE = downArray11[s];
                           downArray11[s] = downArray11[t];
                           downArray11[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray11.length;s++){ 
                   for(int t=s+1; t<upArray11.length;t++){
                       if(upArray11[s]>upArray11[t] && upArray11[t]!=0){
                           tempE = upArray11[s];
                           upArray11[s] = upArray11[t];
                           upArray11[t] = tempE;        
                       }
                   }
                }
               System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray11.length; f++){
                    if(downArray11[f]%2==0 && downArray11[f]!=0){
                        downEven11[c1]=downArray11[f];
                        System.out.print(" | "+downEven11[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray11[f]%2!=0 && downArray11[f]!=0){
                        downOdd11[c2]=downArray11[f];
                        System.out.print(" | "+downOdd11[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray11.length; f++){
                    if(upArray11[f]%2==0 && upArray11[f]!=0){
                        upEven11[c3]=upArray11[f];
                        System.out.print(" | "+upEven11[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray11[f]%2!=0 && upArray11[f]!=0){
                        upOdd11[c4]=upArray11[f];
                        System.out.print(" | "+upOdd11[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven11[c1-1]>=15 && downEven11[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven11[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd11[c2-1]>=15 && downOdd11[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd11[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven11[c1-1]>=19 && upEven11[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven11[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd11[c2-1]>=19 && upOdd11[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd11[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
                double downdistance = Math.abs(((Math.max(((downEven11[c1-1]-2)/2), ((downOdd11[c2-1]-1)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max((Math.abs(upEven11[c1-1]-(14))/2),(Math.abs(upOdd11[c2-1]-(13))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==12){
                int[] downEven12 = new int[17]; 
                  int[] downOdd12 = new int[17];
                  int[] upEven12 = new int[17];
                  int[] upOdd12 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray12.length;s++){ 
                   for(int t=s+1; t<downArray12.length;t++){
                       if(downArray12[s]>downArray12[t] && downArray12[t]!=0){
                           tempE = downArray12[s];
                           downArray12[s] = downArray12[t];
                           downArray12[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray12.length;s++){ 
                   for(int t=s+1; t<upArray12.length;t++){
                       if(upArray12[s]>upArray12[t] && upArray12[t]!=0){
                           tempE = upArray12[s];
                           upArray12[s] = upArray12[t];
                           upArray12[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray12.length; f++){
                    if(downArray12[f]%2==0 && downArray12[f]!=0){
                        downEven12[c1]=downArray12[f];
                        System.out.print(" | "+downEven12[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray12[f]%2!=0 && downArray12[f]!=0){
                        downOdd12[c2]=downArray12[f];
                        System.out.print(" | "+downOdd12[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray12.length; f++){
                    if(upArray12[f]%2==0 && upArray12[f]!=0){
                        upEven12[c3]=upArray1[f];
                        System.out.print(" | "+upEven12[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray12[f]%2!=0 && upArray12[f]!=0){
                        upOdd12[c4]=upArray12[f];
                        System.out.print(" | "+upOdd12[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven12[c1-1]>=15 && downEven12[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven12[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd12[c2-1]>=15 && downOdd12[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd12[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven12[c1-1]>=19 && upEven12[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven12[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd12[c2-1]>=19 && upOdd12[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd12[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
                double downdistance = Math.abs(((Math.max(((downEven12[c1-1]-6)/2), ((downOdd12[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven12[c1-1]-(34))/2), ((upOdd12[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==13){
                int[] downEven13 = new int[17]; 
                  int[] downOdd13 = new int[17];
                  int[] upEven13 = new int[17];
                  int[] upOdd13 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray13.length;s++){ 
                   for(int t=s+1; t<downArray13.length;t++){
                       if(downArray13[s]>downArray13[t] && downArray13[t]!=0){
                           tempE = downArray13[s];
                           downArray13[s] = downArray13[t];
                           downArray13[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray13.length;s++){ 
                   for(int t=s+1; t<upArray13.length;t++){
                       if(upArray13[s]>upArray13[t] && upArray13[t]!=0){
                           tempE = upArray13[s];
                           upArray13[s] = upArray13[t];
                           upArray13[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray13.length; f++){
                    if(downArray13[f]%2==0 && downArray13[f]!=0){
                        downEven13[c1]=downArray13[f];
                        System.out.print(" | "+downEven13[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray13[f]%2!=0 && downArray13[f]!=0){
                        downOdd13[c2]=downArray13[f];
                        System.out.print(" | "+downOdd13[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray13.length; f++){
                    if(upArray13[f]%2==0 && upArray13[f]!=0){
                        upEven13[c3]=upArray13[f];
                        System.out.print(" | "+upEven13[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray13[f]%2!=0 && upArray13[f]!=0){
                        upOdd13[c4]=upArray13[f];
                        System.out.print(" | "+upOdd13[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven13[c1-1]>=15 && downEven13[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven13[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd13[c2-1]>=15 && downOdd13[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd13[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven13[c1-1]>=19 && upEven13[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven13[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd13[c2-1]>=19 && upOdd13[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd13[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
              
                double downdistance = Math.abs(((Math.max(((downEven13[c1-1]-6)/2), ((downOdd13[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven13[c1-1]-(34))/2), ((upOdd13[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==14){
                int[] downEven14 = new int[17]; 
                  int[] downOdd14 = new int[17];
                  int[] upEven14 = new int[17];
                  int[] upOdd14 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray14.length;s++){ 
                   for(int t=s+1; t<downArray14.length;t++){
                       if(downArray14[s]>downArray14[t] && downArray14[t]!=0){
                           tempE = downArray14[s];
                           downArray14[s] = downArray14[t];
                           downArray14[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray14.length;s++){ 
                   for(int t=s+1; t<upArray14.length;t++){
                       if(upArray14[s]>upArray14[t] && upArray14[t]!=0){
                           tempE = upArray14[s];
                           upArray14[s] = upArray14[t];
                           upArray14[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray14.length; f++){
                    if(downArray14[f]%2==0 && downArray14[f]!=0){
                        downEven14[c1]=downArray14[f];
                        System.out.print(" | "+downEven14[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray14[f]%2!=0 && downArray14[f]!=0){
                        downOdd14[c2]=downArray14[f];
                        System.out.print(" | "+downOdd14[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray14.length; f++){
                    if(upArray14[f]%2==0 && upArray14[f]!=0){
                        upEven14[c3]=upArray14[f];
                        System.out.print(" | "+upEven14[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray14[f]%2!=0 && upArray14[f]!=0){
                        upOdd14[c4]=upArray14[f];
                        System.out.print(" | "+upOdd14[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven14[c1-1]>=15 && downEven14[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven14[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd14[c2-1]>=15 && downOdd14[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd14[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven14[c1-1]>=19 && upEven14[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven14[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd14[c2-1]>=19 && upOdd14[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd14[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
              
                double downdistance = Math.abs(((Math.max(((downEven14[c1-1]-6)/2), ((downOdd14[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven14[c1-1]-(34))/2), ((upOdd14[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==15){
                int[] downEven15 = new int[17]; 
                  int[] downOdd15 = new int[17];
                  int[] upEven15 = new int[17];
                  int[] upOdd15 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray15.length;s++){ 
                   for(int t=s+1; t<downArray15.length;t++){
                       if(downArray15[s]>downArray15[t] && downArray15[t]!=0){
                           tempE = downArray15[s];
                           downArray15[s] = downArray15[t];
                           downArray15[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray15.length;s++){ 
                   for(int t=s+1; t<upArray15.length;t++){
                       if(upArray15[s]>upArray15[t] && upArray15[t]!=0){
                           tempE = upArray15[s];
                           upArray15[s] = upArray15[t];
                           upArray15[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray15.length; f++){
                    if(downArray15[f]%2==0 && downArray15[f]!=0){
                        downEven15[c1]=downArray15[f];
                        System.out.print(" | "+downEven15[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray15[f]%2!=0 && downArray15[f]!=0){
                        downOdd15[c2]=downArray15[f];
                        System.out.print(" | "+downOdd15[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray15.length; f++){
                    if(upArray15[f]%2==0 && upArray15[f]!=0){
                        upEven15[c3]=upArray15[f];
                        System.out.print(" | "+upEven15[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray15[f]%2!=0 && upArray15[f]!=0){
                        upOdd15[c4]=upArray15[f];
                        System.out.print(" | "+upOdd15[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven15[c1-1]>=15 && downEven15[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven15[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd15[c2-1]>=15 && downOdd15[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd15[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven15[c1-1]>=19 && upEven15[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven15[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd15[c2-1]>=19 && upOdd15[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd15[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
                double downdistance = Math.abs(((Math.max(((downEven15[c1-1]-6)/2), ((downOdd15[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven15[c1-1]-(34))/2), ((upOdd15[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==16){
                int[] downEven16 = new int[17]; 
                  int[] downOdd16 = new int[17];
                  int[] upEven16 = new int[17];
                  int[] upOdd16 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray16.length;s++){ 
                   for(int t=s+1; t<downArray16.length;t++){
                       if(downArray16[s]>downArray16[t] && downArray16[t]!=0){
                           tempE = downArray16[s];
                           downArray16[s] = downArray16[t];
                           downArray16[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray16.length;s++){ 
                   for(int t=s+1; t<upArray16.length;t++){
                       if(upArray16[s]>upArray16[t] && upArray16[t]!=0){
                           tempE = upArray16[s];
                           upArray16[s] = upArray16[t];
                           upArray16[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray16.length; f++){
                    if(downArray16[f]%2==0 && downArray16[f]!=0){
                        downEven16[c1]=downArray16[f];
                        System.out.print(" | "+downEven16[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray16[f]%2!=0 && downArray16[f]!=0){
                        downOdd16[c2]=downArray16[f];
                        System.out.print(" | "+downOdd16[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray16.length; f++){
                    if(upArray16[f]%2==0 && upArray16[f]!=0){
                        upEven16[c3]=upArray16[f];
                        System.out.print(" | "+upEven16[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray16[f]%2!=0 && upArray16[f]!=0){
                        upOdd16[c4]=upArray16[f];
                        System.out.print(" | "+upOdd16[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven16[c1-1]>=15 && downEven16[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven16[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd16[c2-1]>=15 && downOdd16[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd16[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven16[c1-1]>=19 && upEven16[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven16[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd16[c2-1]>=19 && upOdd16[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd16[c2-1]>=25){
                    countOddUpBlock = 0;
                }

              
                double downdistance = Math.abs(((Math.max(((downEven16[c1-1]-6)/2), ((downOdd16[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven16[c1-1]-(34))/2), ((upOdd16[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==17){
                int[] downEven17 = new int[17]; 
                  int[] downOdd17 = new int[17];
                  int[] upEven17 = new int[17];
                  int[] upOdd17 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray17.length;s++){ 
                   for(int t=s+1; t<downArray17.length;t++){
                       if(downArray17[s]>downArray17[t] && downArray17[t]!=0){
                           tempE = downArray17[s];
                           downArray17[s] = downArray17[t];
                           downArray17[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray17.length;s++){ 
                   for(int t=s+1; t<upArray17.length;t++){
                       if(upArray17[s]>upArray17[t] && upArray17[t]!=0){
                           tempE = upArray17[s];
                           upArray17[s] = upArray17[t];
                           upArray17[t] = tempE;        
                       }
                   }
                }
              System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray17.length; f++){
                    if(downArray17[f]%2==0 && downArray17[f]!=0){
                        downEven17[c1]=downArray17[f];
                        System.out.print(" | "+downEven17[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray17[f]%2!=0 && downArray17[f]!=0){
                        downOdd17[c2]=downArray17[f];
                        System.out.print(" | "+downOdd17[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray17.length; f++){
                    if(upArray17[f]%2==0 && upArray17[f]!=0){
                        upEven17[c3]=upArray17[f];
                        System.out.print(" | "+upEven17[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray17[f]%2!=0 && upArray17[f]!=0){
                        upOdd17[c4]=upArray17[f];
                        System.out.print(" | "+upOdd17[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven17[c1-1]>=15 && downEven17[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven17[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd17[c2-1]>=15 && downOdd17[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd17[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven17[c1-1]>=19 && upEven17[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven17[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd17[c2-1]>=19 && upOdd17[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd17[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
              
                double downdistance = Math.abs(((Math.max(((downEven17[c1-1]-6)/2), ((downOdd17[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven17[c1-1]-(34))/2), ((upOdd17[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==18){//////////////////////////////////////////
                int[] downEven18 = new int[17]; 
                  int[] downOdd18 = new int[17];
                  int[] upEven18 = new int[17];
                  int[] upOdd18 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray18.length;s++){ 
                   for(int t=s+1; t<downArray18.length;t++){
                       if(downArray18[s]>downArray18[t] && downArray18[t]!=0){
                           tempE = downArray18[s];
                           downArray18[s] = downArray18[t];
                           downArray18[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray18.length;s++){
                   for(int t=s+1; t<upArray18.length;t++){
                       if(upArray18[s]>upArray18[t] && upArray18[t]!=0){
                           tempE = upArray18[s];
                           upArray18[s] = upArray18[t];
                           upArray18[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray18.length; f++){
                    if(downArray18[f]%2==0 && downArray18[f]!=0){
                        downEven18[c1]=downArray18[f];
                        System.out.print(" | "+downEven18[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray18[f]%2!=0 && downArray18[f]!=0){
                        downOdd18[c2]=downArray18[f];
                        System.out.print(" | "+downOdd18[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray18.length; f++){
                    if(upArray18[f]%2==0 && upArray18[f]!=0){
                        upEven18[c3]=upArray18[f];
                        System.out.print(" | "+upEven18[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray18[f]%2!=0 && upArray18[f]!=0){
                        upOdd18[c4]=upArray18[f];
                        System.out.print(" | "+upOdd18[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven18[c1-1]>=15 && downEven18[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven18[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd18[c2-1]>=15 && downOdd18[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd18[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven18[c1-1]>=19 && upEven18[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven18[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd18[c2-1]>=19 && upOdd18[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd18[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
              
                double downdistance = Math.abs(((Math.max(((downEven18[c1-1]-6)/2), ((downOdd18[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven18[c1-1]-(34))/2), ((upOdd18[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==19){
                  int[] downEven19 = new int[17]; 
                  int[] downOdd19 = new int[17];
                  int[] upEven19 = new int[17];
                  int[] upOdd19 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray19.length;s++){ 
                   for(int t=s+1; t<downArray19.length;t++){
                       if(downArray19[s]>downArray19[t] && downArray19[t]!=0){
                           tempE = downArray19[s];
                           downArray19[s] = downArray19[t];
                           downArray19[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray19.length;s++){ 
                   for(int t=s+1; t<upArray19.length;t++){
                       if(upArray19[s]>upArray19[t] && upArray19[t]!=0){
                           tempE = upArray19[s];
                           upArray19[s] = upArray19[t];
                           upArray19[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray19.length; f++){
                    if(downArray19[f]%2==0 && downArray19[f]!=0){
                        downEven19[c1]=downArray19[f];
                        System.out.print(" | "+downEven19[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray19[f]%2!=0 && downArray19[f]!=0){
                        downOdd19[c2]=downArray19[f];
                        System.out.print(" | "+downOdd19[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray19.length; f++){
                    if(upArray19[f]%2==0 && upArray19[f]!=0){
                        upEven19[c3]=upArray19[f];
                        System.out.print(" | "+upEven19[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray19[f]%2!=0 && upArray19[f]!=0){
                        upOdd19[c4]=upArray19[f];
                        System.out.print(" | "+upOdd19[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven19[c1-1]>=15 && downEven19[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven19[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd19[c2-1]>=15 && downOdd19[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd19[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven19[c1-1]>=19 && upEven19[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven19[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd19[c2-1]>=19 && upOdd19[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd19[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
             
              
                double downdistance = Math.abs(((Math.max(((downEven19[c1-1]-6)/2), ((downOdd19[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven19[c1-1]-(34))/2), ((upOdd19[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==20){
                int[] downEven20 = new int[17]; 
                  int[] downOdd20 = new int[17];
                  int[] upEven20 = new int[17];
                  int[] upOdd20 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray20.length;s++){ 
                   for(int t=s+1; t<downArray20.length;t++){
                       if(downArray20[s]>downArray20[t] && downArray20[t]!=0){
                           tempE = downArray20[s];
                           downArray20[s] = downArray20[t];
                           downArray20[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray20.length;s++){
                   for(int t=s+1; t<upArray20.length;t++){
                       if(upArray20[s]>upArray20[t] && upArray20[t]!=0){
                           tempE = upArray20[s];
                           upArray20[s] = upArray20[t];
                           upArray20[t] = tempE;        
                       }
                   }
                }
               System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray20.length; f++){
                    if(downArray20[f]%2==0 && downArray20[f]!=0){
                        downEven20[c1]=downArray20[f];
                        System.out.print(" | "+downEven20[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray20[f]%2!=0 && downArray20[f]!=0){
                        downOdd20[c2]=downArray20[f];
                        System.out.print(" | "+downOdd20[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray20.length; f++){
                    if(upArray20[f]%2==0 && upArray20[f]!=0){
                        upEven20[c3]=upArray20[f];
                        System.out.print(" | "+upEven20[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray20[f]%2!=0 && upArray20[f]!=0){
                        upOdd20[c4]=upArray20[f];
                        System.out.print(" | "+upOdd20[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven20[c1-1]>=15 && downEven20[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven20[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd20[c2-1]>=15 && downOdd20[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd20[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven20[c1-1]>=19 && upEven20[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven20[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd20[c2-1]>=19 && upOdd20[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd20[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
                double downdistance = Math.abs(((Math.max(((downEven20[c1-1]-6)/2), ((downOdd20[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven20[c1-1]-(34))/2), ((upOdd20[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==21){
                int[] downEven21 = new int[17]; 
                  int[] downOdd21 = new int[17];
                  int[] upEven21 = new int[17];
                  int[] upOdd21 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray21.length;s++){ 
                   for(int t=s+1; t<downArray21.length;t++){
                       if(downArray21[s]>downArray21[t] && downArray21[t]!=0){
                           tempE = downArray21[s];
                           downArray21[s] = downArray21[t];
                           downArray21[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray21.length;s++){
                   for(int t=s+1; t<upArray21.length;t++){
                       if(upArray21[s]>upArray21[t] && upArray21[t]!=0){
                           tempE = upArray21[s];
                           upArray21[s] = upArray21[t];
                           upArray21[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray21.length; f++){
                    if(downArray21[f]%2==0 && downArray21[f]!=0){
                        downEven21[c1]=downArray21[f];
                        System.out.print(" | "+downEven21[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray21[f]%2!=0 && downArray21[f]!=0){
                        downOdd21[c2]=downArray21[f];
                        System.out.print(" | "+downOdd21[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray21.length; f++){
                    if(upArray21[f]%2==0 && upArray21[f]!=0){
                        upEven21[c3]=upArray21[f];
                        System.out.print(" | "+upEven21[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray21[f]%2!=0 && upArray21[f]!=0){
                        upOdd21[c4]=upArray21[f];
                        System.out.print(" | "+upOdd21[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven21[c1-1]>=15 && downEven21[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven21[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd21[c2-1]>=15 && downOdd21[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd21[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven21[c1-1]>=19 && upEven21[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven21[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd21[c2-1]>=19 && upOdd21[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd21[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                double downdistance = Math.abs(((Math.max(((downEven21[c1-1]-6)/2), ((downOdd21[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven21[c1-1]-(34))/2), ((upOdd21[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==22){
                int[] downEven22 = new int[17]; 
                  int[] downOdd22 = new int[17];
                  int[] upEven22 = new int[17];
                  int[] upOdd22 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray22.length;s++){ 
                   for(int t=s+1; t<downArray22.length;t++){
                       if(downArray22[s]>downArray22[t] && downArray22[t]!=0){
                           tempE = downArray22[s];
                           downArray22[s] = downArray22[t];
                           downArray22[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray22.length;s++){
                   for(int t=s+1; t<upArray22.length;t++){
                       if(upArray22[s]>upArray22[t] && upArray22[t]!=0){
                           tempE = upArray22[s];
                           upArray22[s] = upArray22[t];
                           upArray22[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray22.length; f++){
                    if(downArray22[f]%2==0 && downArray22[f]!=0){
                        downEven22[c1]=downArray22[f];
                        System.out.print(" | "+downEven22[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray22[f]%2!=0 && downArray22[f]!=0){
                        downOdd22[c2]=downArray22[f];
                        System.out.print(" | "+downOdd22[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray22.length; f++){
                    if(upArray22[f]%2==0 && upArray22[f]!=0){
                        upEven22[c3]=upArray22[f];
                        System.out.print(" | "+upEven22[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray22[f]%2!=0 && upArray22[f]!=0){
                        upOdd22[c4]=upArray22[f];
                        System.out.print(" | "+upOdd22[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven22[c1-1]>=15 && downEven22[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven22[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd22[c2-1]>=15 && downOdd22[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd22[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven22[c1-1]>=19 && upEven22[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven22[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd22[c2-1]>=19 && upOdd22[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd22[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
                double downdistance = Math.abs(((Math.max(((downEven22[c1-1]-6)/2), ((downOdd22[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven22[c1-1]-(34))/2), ((upOdd22[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==23){
                int[] downEven23 = new int[17]; 
                  int[] downOdd23 = new int[17];
                  int[] upEven23 = new int[17];
                  int[] upOdd23 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray23.length;s++){  
                   for(int t=s+1; t<downArray23.length;t++){
                       if(downArray23[s]>downArray23[t] && downArray23[t]!=0){
                           tempE = downArray23[s];
                           downArray23[s] = downArray23[t];
                           downArray23[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray23.length;s++){ 
                   for(int t=s+1; t<upArray23.length;t++){
                       if(upArray23[s]>upArray23[t] && upArray23[t]!=0){
                           tempE = upArray23[s];
                           upArray23[s] = upArray23[t];
                           upArray23[t] = tempE;        
                       }
                   }
                }
                
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                  for(int f=1; f<downArray23.length; f++){
                    if(downArray23[f]%2==0 && downArray23[f]!=0){
                        downEven23[c1]=downArray23[f];
                        System.out.print(" | "+downEven23[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray23[f]%2!=0 && downArray23[f]!=0){
                        downOdd23[c2]=downArray23[f];
                        System.out.print(" | "+downOdd23[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray23.length; f++){
                    if(upArray23[f]%2==0 && upArray23[f]!=0){
                        upEven23[c3]=upArray23[f];
                        System.out.print(" | "+upEven23[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray23[f]%2!=0 && upArray23[f]!=0){
                        upOdd23[c4]=upArray23[f];
                        System.out.print(" | "+upOdd23[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven23[c1-1]>=15 && downEven23[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven23[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd23[c2-1]>=15 && downOdd23[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd23[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven23[c1-1]>=19 && upEven23[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven23[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd23[c2-1]>=19 && upOdd23[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd23[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
              
              
                double downdistance = Math.abs(((Math.max(((downEven23[c1-1]-6)/2), ((downOdd23[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven23[c1-1]-(34))/2), ((upOdd23[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
            else if(aisNo[n]==24){
                int[] downEven24 = new int[17]; 
                  int[] downOdd24 = new int[17];
                  int[] upEven24 = new int[17];
                  int[] upOdd24 = new int[17];
                  int tempE = 0;
                  for(int s=1; s<downArray24.length;s++){ 
                   for(int t=s+1; t<downArray24.length;t++){
                       if(downArray24[s]>downArray24[t] && downArray24[t]!=0){
                           tempE = downArray24[s];
                           downArray24[s] = downArray24[t];
                           downArray24[t] = tempE;        
                       }
                   }
                }
                  for(int s=1; s<upArray24.length;s++){ 
                   for(int t=s+1; t<upArray24.length;t++){
                       if(upArray24[s]>upArray24[t] && upArray24[t]!=0){
                           tempE = upArray24[s];
                           upArray24[s] = upArray24[t];
                           upArray24[t] = tempE;        
                       }
                   }
                }
                System.out.println("Product List of This Aisle: "+aisNo[n]);
                int c1 = 1;
                int c2 = 1;
                int c3 = 1;
                int c4 = 1;
                  for(int f=1; f<downArray24.length; f++){
                    if(downArray24[f]%2==0 && downArray24[f]!=0){
                        downEven24[c1]=downArray24[f];
                        System.out.print(" | "+downEven24[c1]+" | ");                       
                        c1++;
                    }
                    else if(downArray24[f]%2!=0 && downArray24[f]!=0){
                        downOdd24[c2]=downArray24[f];
                        System.out.print(" | "+downOdd24[c2]+" | ");  
                        c2++;
                    }
                }
                  for(int f=1; f<upArray24.length; f++){
                    if(upArray24[f]%2==0 && upArray24[f]!=0){
                        upEven24[c3]=upArray24[f];
                        System.out.print(" | "+upEven24[c3]+" | ");                       
                        c3++;
                    }
                    else if(upArray24[f]%2!=0 && upArray24[f]!=0){
                        upOdd24[c4]=upArray24[f];
                        System.out.print(" | "+upOdd24[c4]+" | ");  
                        c4++;
                    }
                }
       
                int countOddDownBlock = 0;
                int countEvenDownBlock = 0;
                int countOddUpBlock = 0;
                int countEvenUpBlock = 0;
                
                if(downEven24[c1-1]>=15 && downEven24[c1-1]<=18){  
                    countEvenDownBlock = 1;
                }
                else if(downEven24[c1-1]<=14){
                    countEvenDownBlock = 0;
                }
                if(downOdd24[c2-1]>=15 && downOdd24[c1-1]<=18 ){
                    countOddDownBlock = 1;
                }
                else if(downOdd24[c2-1]<=14){
                    countOddDownBlock = 0;
                }
                //////////////////////////////////////////////
                if(upEven24[c1-1]>=19 && upEven24[c1-1]<=24){   
                    countEvenUpBlock = 1;
                }
                else if(upEven24[c1-1]>=25){
                    countEvenUpBlock = 0;
                }
                if(upOdd24[c2-1]>=19 && upOdd24[c1-1]<=24 ){
                    countOddUpBlock = 1;
                }
                else if(downOdd24[c2-1]>=25){
                    countOddUpBlock = 0;
                }
                
                
                double downdistance = Math.abs(((Math.max(((downEven24[c1-1]-6)/2), ((downOdd24[c2-1]-6)/2)))*moduleLength*2))+(Math.max(countEvenDownBlock*2,countOddDownBlock*2)*crossAisle);
                double updistance = Math.abs(((Math.max(((upEven24[c1-1]-(34))/2), ((upOdd24[c2-1]-(33))/2)))*moduleLength*2))+(Math.max(countEvenUpBlock*2,countOddUpBlock*2)*crossAisle);
                double distance = downdistance+updistance+aisleLength+distBetweenAisle;
                totalDistance = totalDistance+distance;
                System.out.println("Down distance is: "+downdistance+" and up distance is: "+updistance);
                System.out.println("Distance is: "+distance+" and total distance: "+totalDistance);
            }
   
        }
             System.out.println("The total distance is: "+totalDistance); 


}
    
}
