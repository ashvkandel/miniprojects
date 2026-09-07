import java.util.Scanner;

public class quiz {
    public void main(){
        // creation of questions using arrays //

        String[] qs ={"1.WHAT WAS THE FIRST SOCIAL MEDIA PLATFORM ?",
                "2.WHAT IS THE FULL FORM OF CSS ?",
                "3.WHEN WAS THE PYTHON LANGUAGE INTRODUCED ? ",
                "4.WHAT IS UX ?",
                "5.USA CONSISTS OF HOW MANY STATES ?"
        };

        // creation of multiple options using 2D arrays //

        String[][] options = {{"(a)Facebook", " (b)SixDegrees.com", "(c)Twitter", "(d)Hike"},
                {"(a) Cascading Style Sheet","(b)Central Styles Sheets","(c)Custom Style Script","(d)Clone Stroopers Standing"},
                {"(a) 1991","(b)1992","(c) 1999","(d)1981"},
                {"(a) Unidentified Xylophonist","(b) User Graphix","(c)User Experience","(d) Unidentified Graphix"},
                {"(a)35","(b)40","(c)28","(d)50"}
        };


        String answers[]={"b","a","a","c","d"};
        int score=0;


        for(int i=0;i<qs.length;i++){
            System.out.println(qs[i]);

            for(String newOptions:options[i]){         // enhanced for loop //
                System.out.print(newOptions+" ");

            }

            System.out.println();


            Scanner sc=new Scanner(System.in);
            System.out.print("option:");
            String ans=sc.nextLine();

            if(ans.equals(answers[i])){
                System.out.println();
                System.out.println("CORRECT !");
                System.out.println();
                score++;
            }

            else{
                System.out.println();
                System.out.println("INCORRECT !");
                System.out.println();
            }



        }

        System.out.println("Obtained score ~ "+score+" out of "+qs.length);


    }

}
