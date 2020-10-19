class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int aKey = A[0];
        int aC1 = 0;
        int aC2 = 0;
        int bKey = B[0];
        int bC1 = 0;
        int bC2 = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==aKey){
                aC1+=1;
                if(B[i]==aKey){
                    aC2+=1;
                    bKey = -1;
                }
            }
            else if(B[i]==aKey){
                aC2+=1;
            }
            else{
                aKey=-1;
                break;
            }
        }
        
        if(aKey!=-1){
            return aC1>=aC2? A.length - aC1 : A.length - aC2;
        }
        else if (bKey!=-1){
            for(int i=0;i<B.length;i++){
                if(A[i]==bKey){
                    bC1+=1;
                    if(B[i]==bKey){
                        bC2+=1;
                    }
                }
                else if(B[i]==bKey){
                    bC2+=1;
                }
                else{
                    bKey=-1;
                    break;
                }
            }
            if(bKey!=-1){
                return bC1>=bC2? A.length - bC1 : A.length - bC2;
            }
        }
        
        return -1;
    }
}
//https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/