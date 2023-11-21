import java.util.*;
class T{
    char B[][];
    String n = "";
    String n1,n2="";
    public T()
    {
        B = new char[3][3];
        intB();
    }
        void name(String p1, String p2)
        {
            n1 = p1;
            n2 = p2;
        }
    
    void intB(){
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                B[i][j] = ' ';
            }
        }
    }
    void dispB()
    {
        System.out.println("-------------");
        for(int i=0;i<B.length;i++)
        {
            System.out.print("| ");
            for(int j=0;j<B[i].length;j++)
            {
                System.out.print(B[i][j] + " | ");
            }
            System.out.println("");
            System.out.println("-------------");
        }
    }
    void insert(int r, int c, char e)
    {
        if(r>=0 && r<=2 && c>=0 && c<=2)
        {
            B[r][c] = e;
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    void column()
    {
        for(int j=0;j<=2;j++)
        {
            if(B[0][j] !=' ' && B[0][j] == B[1][j] && B[1][j] == B[2][j])
            {
                if(B[0][j]=='X')
                {
                    n = n+n1;
                }
                else{
                    n = n+n2;
                }
                System.out.println(n + " won");
            }
        }
    }
    void row()
    {
        for(int j=0;j<=2;j++)
        {
            if(B[j][0] !=' ' && B[j][0] == B[j][1] && B[j][1] == B[j][2])
            {
                if(B[j][0]=='X')
                {
                    n = n+n1;
                }
                else{
                     n = n+n2;
                }
                System.out.println(n + " won");
            }
        }
    }
    void diagonal()
    {
        if(B[0][0]!=' ' && B[0][0]==B[1][1] && B[1][1]==B[2][2])
        {
            if(B[0][0]=='X')
            {
                 n = n+n1;
            }
            else{
                n = n+n2;
            }
            System.out.println(n + " won");
        }
        if(B[0][2] !=' ' && B[0][2]==B[1][1] && B[1][1]==B[2][0])
        {
            if(B[0][2]=='X')
            {
                n = n+n1;
            }
            else{
                 n = n+n2;
            }
            System.out.println(n + " won");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    T a = new T();
	    System.out.println("Player1: ");
	    String p1 = sc.next();
	    System.out.println("Player2: ");
	    String p2 = sc.next();
	    System.out.println("Let's start the game.");
		a.name(p1,p2);
		for(int i=0;i<9;i++)
		{
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    char f = sc.next().charAt(0);
		    a.insert(d,e,f);
		}
		a.dispB();
		a.column();
		a.row();
		a.diagonal();
	}
}
