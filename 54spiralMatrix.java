LinkedList<Integer> linky = new LinkedList<>();

        int left = 0; 
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while(left < right && top < bottom){
            // gets all elements from your row
            for(int i = left; i < right; i++){
                linky.add(matrix[top][i]);
            }
            // shifts top down
            top++;
            for(int i = top; i < bottom; i++){
                linky.add(matrix[i][right -1]);
            }
            right--;
            // check base case before continuing
            if (!(left < right && top < bottom)) {
                break;
            }

            // shift bottom towards top 
            for(int i = right - 1; i >= left; i--){
                linky.add(matrix[bottom - 1][i]);
            }
            bottom--;

            // shift left to the right 
            for(int i = bottom - 1; i >= top; i--){
                linky.add(matrix[i][left]);
            }
            left++;
            
        }

        return linky;
