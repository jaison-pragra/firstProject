package com.company;

public class breakUsedWithLabel{
    public static void main(String[] args) {
        boolean x = true;
        bl1:
        {
            bl2:
            {
                bl3:
                {
                    System.out.println("block3");
                    if (x)
                        break bl2;
                }
                System.out.println("block2");
            }
            System.out.println("block1");
        }

        System.out.println("out of all blocks");
    }

}




