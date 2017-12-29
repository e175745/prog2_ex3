import java.util.Scanner;
import jp.ac.uryukyu.ie.e175745.*; //利用したいパッケージを指定。

public class Main {
    public static void main(String[] args){
        String[] dataset = {"greeting\tこんにちは、私は会話用AIのフロンティアセッターです。情報収集のため私と会話してくれませんか？",
                "元気？\t動作が正常であることから、私は元気だと判断できます。",
                "いい天気だね\t空に雲が少ない状態を人間は天気がいいというのですか？",
                "１＋１は？\t２です。",
                "疲れた\t大丈夫ですか？あまり無理はなさらない方が良いですよ。",
                "一体何が始まるんです？\t第三次大戦だ。",
                "こんにちは\tこんにちは",
                "other\t申し訳ありません。私のデータベースには情報がありません。",
                "bye.\tもう行ってしまうのですか？",};

        String input, reply; //botへの入力文、応答文を保存するための変数
        Scanner in = new Scanner(System.in);
        int count = 0;

        Chatbot bot = new Chatbot("フロンティアセッター", dataset); //インスタンス生成
        bot.greeting();
        while( true ){
            System.out.println("(会話文を入力してください。)");
            input = in.nextLine();
            count++;

            reply = bot.reply(input);
            System.out.println(reply);
            if( input.equals("bye.") ){
                break;
            }

        }
        if( count<=5 ){
    	      System.out.println("フロンティアセッター「残念です。今回は"+count+"回しか会話しませんでした。」");
        }else{
    	      System.out.println("フロンティアセッター「楽しかったです。今回は"+count+"回も会話できました。」");
        }
    }
}
