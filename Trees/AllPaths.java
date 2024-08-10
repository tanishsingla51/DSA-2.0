package Trees;

import java.util.*;

public class AllPaths {
    public static void Paths(TreeNode root, ArrayList<Integer> ans){
        if(root==null){
            // System.out.println(ans);  //negtive base case
            return;
        }
        if(root.left==null && root.right==null){ //positive base case
            ans.add(root.data);
            System.out.println(ans);
            ans.remove(ans.size()-1);
            return;
        }
        ans.add(root.data);
        Paths(root.left,ans);
        Paths(root.right,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        MyTree obj  = new MyTree();
        Paths(obj.root, ans);
    }
}