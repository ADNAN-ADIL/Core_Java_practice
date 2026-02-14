public class Jagged_and_3DArray {
    public static void main(String[] args) {
//        int nums[][]=new int [3][]; //jagged
//		nums[0]=new int [3];
//		nums[1]=new int [4];
//		nums[2]=new int [2];
//
//        for(int i=0;i< nums.length;i++) {
//            for (int j = 0; j < nums[i].length; j++)
//                nums[i][j] = (int) (Math.random() * 10);
//        }
//
//        for(int n[] :nums){
//            for(int m: n)
//                System.out.print(m +" ");
//            System.out.println();
//        }

        int[][][] cube = {
                { {1, 2}, {3, 4}, {5, 6} },    // Layer 0 (a 3x2 grid)
                { {7, 8}, {9, 10}, {11, 12} }  // Layer 1 (a 3x2 grid)
        };

        // 2. Accessing a specific element
        // Get the value at Layer 1, Row 0, Column 1 (which is 8)
        int value = cube[1][0][1];
        System.out.println("Element at [1][0][1]: " + value);

        // 3. Printing the entire 3D array using nested loops
        System.out.println("\nFull 3D Array Content:");
        for (int i = 0; i < cube.length; i++) {             // Layers
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < cube[i].length; j++) {      // Rows
                for (int k = 0; k < cube[i][j].length; k++) { // Columns
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println(); // New line after each row
            }
        }
    }
}
