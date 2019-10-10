package _1.base;



import org.junit.Test;

import java.util.Scanner;

/**
 * for循环执行过程 for(express1, express2, express3)， 注意：初始化完就会判断，等同于 express1; while(express2){……express3}
 * 	express1 -> express2 == false ? break ： ……，express3 -> > express2 == false ? break: …………;
 *
 */
public class LoopDemo {

    @Test
    public void testFor() {
        for (int i=0; i<0; i++){
            System.out.println("打印我吗？");
        }
        //事实证明不打印哈
    }

    //随机加法运算器
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        //1)5+6=?
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100); //加数
            int b = (int) (Math.random() * 100); //加数
            int result = a + b; //记录答案
            System.out.println(i + ")" + a + "+" + b + "=?"); //出题
            System.out.println("算吧!");
            int answer = scan.nextInt(); //答题

            if (answer == -1) {  //输入-1时退出
                break;
            } else if (answer == result) { //对了
                score += 10; //答对一题加10分
                System.out.println("答对了");
            } else { //错了
                System.out.println("答错了");
            }

        }
        System.out.println("得分为:" + score);
    }

    @Test
    public void guessGame() {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1); //藏起来的那个数
        System.out.println(num); //作弊

        int guess;
        do{
            System.out.println("猜吧!");
            guess = scan.nextInt(); //1,3
            if(guess==0){
                break; //退出循环
            }else if(guess>num){
                System.out.println("太大了");
            }else if(guess<num){
                System.out.println("太小了");
            }
        }while(guess!=num); //2.

        if(guess==num){
            System.out.println("恭喜你，猜对了!");
        }else{
            System.out.println("下次再来吧!");
        }

		/*
		System.out.println("猜吧!");
		int guess = scan.nextInt();  //1.
		while(guess!=num){  //2.
			if(guess==0){
				break; //退出循环
			}else if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}
			System.out.println("猜吧!");
			guess = scan.nextInt();  //3.
		}

		if(guess==num){
			System.out.println("恭喜你，猜对了!");
		}else{
			System.out.println("下次再来吧!");
		}

		*/
    }
}
