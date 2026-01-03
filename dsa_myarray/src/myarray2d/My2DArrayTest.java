package myarray2d;

import java.util.Arrays;

public class My2DArrayTest {

	public static void main(String[] args) {
		My2DArray obj = new My2DArray();
//		System.out.println(obj);
//		int arr11[][] = new int[3][3];
		obj.displayData();
		obj.acceptArray();
		obj.displayData();
		
		System.out.println("Trabspose of matrix----------->");
		int [][] trans = obj.transpose();
        for(int i=0;i<trans.length;i++)
        {
     	   for(int j=0;j<trans[i].length;j++)
     	   {
     		   System.out.print(trans[i][j]+"\t");
     	   }
     	   System.out.println();
        }
		
		int sumArrR[] = obj.findRowSum();
		System.out.println(Arrays.toString(sumArrR));
		
		int sumArrC[] = obj.findSumColumn();
		System.out.println(Arrays.toString(sumArrC));
		
		My2DArray obj1 = new My2DArray();
		obj1.acceptArray();
		
		obj1.addTwoArrays(obj);
		
		obj.displayData();
		System.out.println("Addition of arrays is:");
        obj1.displayData();
        
     obj1.subtractTwoArrays(obj);
		
		obj.displayData();
		System.out.println("Subtraction of arrays is:");
        obj1.displayData();
        
        //row Rotation 
        //up
		
        obj.rowRotation(true, 2);
        System.out.println("up row rotation:");
         obj.displayData();
         
         //row Rotation 
         //down
         obj.rowRotation(false, 1);
         System.out.println("down row rotation:");
          obj.displayData();
          
          System.out.println("Left column Rotation");
          obj.rotateColumn(true, 1);
          obj.displayData();
          
          System.out.println("Right column Rotation");
          obj.rotateColumn(false, 2);
          obj.displayData();
          
          
          My2DArray obj2 = new My2DArray();
          obj.acceptArray();
          
          if(obj.isIdentity())
          System.out.println("The given matrix is identity matrix");
          else
        	  System.out.println("It is not the identity matrix");
          
          if(obj.isSymetric())
              System.out.println("The given matrix is Symetric matrix");
              else
            	  System.out.println("It is not the Symetric matrix");
          
           
	}
	
	

}
