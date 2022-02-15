package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a rolling dice game. Each player scores randomly. If cumulative score of any player reaches to 10 or more, He/She wins the match. Please the instruction carefully. First insert total number of players. Secondly, Insert Name and Gender of each player. Finally its fun.");
        // write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Number of players (Integer value) either 2 or 3: ");
        int player_no= Integer.parseInt(in.nextLine());
        int a=player_no;

        if (a>3 || a<2){
            Scanner in5=new Scanner(System.in);
            System.out.println(" Please Enter players number (Integer) either 2 or 3: ");
            int player_no5= Integer.parseInt(in5.nextLine());
            int b=player_no5;
            a=b;
        }
        if (a==2 || a==3){
            String[] pl_name = new String[a];
            String[] pl_gender = new String[a];
            for (int i=0; i<a; i++){
                Scanner in2=new Scanner(System.in);
                System.out.println("Name of the player "+ (i+1)+" :");
                String name_input=in2.nextLine();
                pl_name[i]=name_input;

                Scanner in3=new Scanner(System.in);
                System.out.println("Gender of the player "+ (i+1)+" :");
                String gender_input=in3.nextLine();
                pl_gender[i]=gender_input;
            }

//            int player1_current_roll=0, player2_current_roll=0, player3_current_roll=0;
            int player1_total_roll=0, player2_total_roll=0, player3_total_roll=0;
            // player two
            if (a==2){
                Player player1=new Player(pl_name[0], pl_gender[0]);
                Player player2=new Player(pl_name[1], pl_gender[1]);

                while (player1_total_roll<10 && player2_total_roll<10){
                    int player1_current_roll=player1.roll();
                    System.out.println(pl_name[0]+" scored: "+ player1_current_roll);
                    int player2_current_roll=player2.roll();
                    System.out.println(pl_name[1]+" scored: "+ player2_current_roll);
                    player1_total_roll=player1_total_roll+player1_current_roll;
                    player2_total_roll=player2_total_roll+player2_current_roll;
                }
                if (player1_total_roll>=15){
                    System.out.println(pl_name[0]+ " ("+ pl_gender[0]+") "+"won the match. Congratulations!");
                }
                else{
                    System.out.println(pl_name[1]+" ("+ pl_gender[1]+") "+"won the match. Congratulations!");
                }
            }

// for player three
            if (a==3){
                Player player1=new Player(pl_name[0], pl_gender[0]);
                Player player2=new Player(pl_name[1], pl_gender[1]);
                Player player3=new Player(pl_name[2], pl_gender[2]);

                while (player1_total_roll<10 && player2_total_roll<10 && player3_total_roll<10){
                    int player1_current_roll=player1.roll();
                    System.out.println(pl_name[0]+" scored: "+ player1_current_roll);
                    int player2_current_roll=player2.roll();
                    System.out.println(pl_name[1]+" scored: "+ player2_current_roll);
                    int player3_current_roll=player3.roll();
                    System.out.println(pl_name[2]+" scored: "+ player3_current_roll);
                    player1_total_roll=player1_total_roll+player1_current_roll;
                    player2_total_roll=player2_total_roll+player2_current_roll;
                    player3_total_roll=player3_total_roll+player3_current_roll;
                }
                if (player1_total_roll>=10){
                    System.out.println(pl_name[0]+ " ("+ pl_gender[0]+") "+"won the match. Congratulations!");
                }
                else if (player2_total_roll>=10){
                    System.out.println(pl_name[1]+" ("+ pl_gender[1]+") "+"won the match. Congratulations!");
                }
                else{
                    System.out.println(pl_name[2]+" ("+ pl_gender[2]+") "+"won the match. Congratulations!");
                }
            }
        }
        else {
            System.out.println("You are disqualified due to entering invalid players number. Better luck next time. :D ");
        }
    }
}

