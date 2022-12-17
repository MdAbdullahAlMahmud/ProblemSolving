package com.company.gfg;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
       int  n1 = 6;int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5;int [] B = {6, 7, 20, 80, 100};
        int n3 = 8;int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        commonElements(A,B,C,n1,n2,n3);
        commonElements2(A,B,C,n1,n2,n3);
    }

    public  static  ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        HashMap<Integer,Integer> map3 = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            map1.putIfAbsent(A[i],A[i]);
        }
        for (int i = 0; i < n2; i++) {
            map2.putIfAbsent(B[i],B[i]);
        }
        for (int i = 0; i < n3; i++) {
            map3.putIfAbsent(C[i],C[i]);
        }
        HashMap<Integer ,Integer > maxMap;
        if (map1.size()<map2.size()){
            maxMap = map2;
        }else  maxMap = map1;

        if (map2.size()<map3.size()){
            maxMap = map3;
        }else  maxMap = map2;

        if (map1.size()<map3.size()){
            maxMap = map3;
        }else  maxMap = map1;


        for (Integer integer : maxMap.keySet()){

            if (map1.containsKey(integer) && map2.containsKey(integer) && map3.containsKey(integer)){
                list.add(integer);
            }
        }

        Collections.sort(list);
        //System.out.println("Max Map Size "+ list.toString());

        return list;

    }
    public static ArrayList<Integer> commonElements2(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        HashMap<Integer,Integer> hmap =new  HashMap<Integer,Integer>();
        for(int x:A)
        {
            hmap.put(x,1);
        }
        for(int x:B)
        {
            if(hmap.get(x)!=null)
                hmap.put(x,2);

        }
        for(int x:C)
        {
            if(hmap.get(x)!=null&&hmap.get(x)==2)
                hmap.put(x,3);

        }

        if(!hmap.isEmpty()){
            for(Map.Entry<Integer,Integer> m:hmap.entrySet())
            {
                if(m.getValue()!=null&&m.getValue()==3)
                    result.add(m.getKey());

            }
        }
        else
            result.add(-1);

        Collections.sort(result);
        System.out.println(result.toString());
        return result;
    }
}
