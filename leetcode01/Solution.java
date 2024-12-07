package leetcode01;

import java.util.Arrays;

public class Solution {
        public int[] decrypt(int[] code, int k) {
            for(int i=0;i<code.length;i++){
                if(k>0){
                    if(i==code.length-1){
                        code[i]=code[i]+code[0];
                    }else{
                        code[i]=code[i]+code[i+1];
                    }
                }else if(k<0){
                    if(i==0){
                        code[i]=code[i]+code[code.length-1];
                    }else
                    {
                        code[i]=code[i]+code[i-1];
                    }
                }else{
                    code[i]=0;
                }
            }
            return code;

        }
        public static void main(String[] args) {
            int[] code= {5,6,8,10};
            int k = -1;
            Solution solution = new Solution();
            System.out.println(Arrays.toString(solution.decrypt(code, k)));
        }
    }
