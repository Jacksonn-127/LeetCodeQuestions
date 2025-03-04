// base case, if both are null then they are equal, if one is null but not the other then they are not the same tree
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false; 
        }

        // compare p and q value 
        if(p.val != q.val){
            return false;
        }

        // check for all left nodes first, then right 
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
