package org.example.Logic;

public class Logic {
    static int[][] arrayLogic;

    public Logic() {
        arrayLogic = new int[3][3];
    }

    int counter = 0;
    public String logic(int i, int k, int num){


        arrayLogic[i][k] = num;
        counter++;

        if(arrayLogic[0][0] == 1 && arrayLogic[0][1] == 1 && arrayLogic[0][2] == 1){//1st row X
            System.out.println("1");
            return "X Won!";
        }else if(arrayLogic[1][0] == 1 && arrayLogic[1][1] == 1 && arrayLogic[1][2] == 1){//2st row X
            System.out.println("2");
            return "X Won!";
        }else if(arrayLogic[2][0] == 1 && arrayLogic[2][1] == 1 && arrayLogic[2][2] == 1){//3rd row X
            System.out.println("3");
            return "X Won!";
        }else if(arrayLogic[0][0] == 1 && arrayLogic[1][1] == 1 && arrayLogic[2][2] == 1){//1st diagonal X
            System.out.println("4");
            return "X Won!";
        }else if(arrayLogic[0][2] == 1 && arrayLogic[1][1] == 1 && arrayLogic[2][0] == 1) {//2nd diagonal X
            System.out.println("5");
            return "X Won!";
        }else if(arrayLogic[0][0] == 1 && arrayLogic[1][0] == 1 && arrayLogic[2][0] == 1){//1st col X
            System.out.println("6");
            return "X Won!";
        }else if(arrayLogic[0][1] == 1 && arrayLogic[1][1] == 1 && arrayLogic[2][1] == 1){//2nd col X
            System.out.println("7");
            return "X Won!";
        }else if(arrayLogic[0][2] == 1 && arrayLogic[1][2] == 1 && arrayLogic[2][2] == 1){//3rd col X
            System.out.println("8");
            return "X Won!";
        }

        else if(arrayLogic[0][0] == -1 && arrayLogic[0][1] == -1 && arrayLogic[0][2] == -1){//1st row O
            System.out.println("11");
            return "O Won!";
        }else if(arrayLogic[1][0] == -1 && arrayLogic[1][1] == -1 && arrayLogic[1][2] == -1){//2nd row O
            System.out.println("22");
            return "O Won!";
        }else if(arrayLogic[2][0] == -1 && arrayLogic[2][1] == -1 && arrayLogic[2][2] == -1){//3rd row O
            System.out.println("33");
            return "O Won!";
        }else if(arrayLogic[0][0] == -1 && arrayLogic[1][1] == -1 && arrayLogic[2][2] == -1) {//1st diagonal O
            System.out.println("44");
            return "O Won!";
        }else if(arrayLogic[0][2] == -1 && arrayLogic[1][1] == -1 && arrayLogic[2][0] == -1) {//2nd diagonal O
            System.out.println("55");
            return "O Won!";
        }else if(arrayLogic[0][0] == -1 && arrayLogic[1][0] == -1 && arrayLogic[2][0] == -1){//1st col O
            System.out.println("66");
            return "O Won!";
        }else if(arrayLogic[0][1] == -1 && arrayLogic[1][1] == -1 && arrayLogic[2][1] == -1){//2nd col O
            System.out.println("77");
            return "O Won!";
        }else if(arrayLogic[0][2] == -1 && arrayLogic[1][2] == -1 && arrayLogic[2][2] == -1){//3rd col O
            System.out.println("88");
            return "O Won!";
        }

        System.out.println(counter);

        String str = "";
        if(counter == 9){
            for(int a = 0; a < 3 ; a++){
                for(int b = 0; b < 3; b++){
                    str = str + arrayLogic[a][b];
                }
                System.out.println(str);
                str = "";

            }
            return "Draw!";
        }


        return "";
    }
}
