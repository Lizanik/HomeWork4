
package com.epam.task;
class tak2 {
    public static void main(String[] args) {
        final String s1 = "How are How";
        outer:for(int i = 0; i < s1.length(); i++)
        {
            for(int j = 0; j < s1.length(); j++)
            {
                if(s1.charAt(i) == s1.charAt(j) && i != j)
                {
                    continue outer;
                }
            }
            System.out.println(s1.charAt(i));
        }
    }
}