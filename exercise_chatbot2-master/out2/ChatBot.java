import java.util.Scanner;

public class ChatBot
{
    public static void main(String[] args)
    {
	  //チャットボットの名前　フロンティアセッター　※楽園追放より
	  String comment;
	  int num;
    String answer;
	  Scanner in = new Scanner(System.in);
    System.out.println("フロンティアセッター：こんにちは、私は会話用AIのフロンティアセッターです。情報収集のため私と会話してくれませんか？\n会話文を入力してください：");
    for(num=0;;num++){
        comment = in.nextLine();
        answer = responce(comment);
        System.out.println(answer);
        if(comment.equals("bye")==true){
          break;
        }
    }
	  if( num<=5 ){
	      System.out.println("フロンティアセッター：残念です。今回は"+num+"回しか会話しませんでした。");
    }else{
	      System.out.println("フロンティアセッター：楽しかったです。今回は"+num+"回も会話できました。");
    }
    }
    public static String responce(String comment)
    {
	//入力に対する応答のメソッド
    String answer;
    if( comment.equals("元気？")==true){
        answer = "フロンティアセッター：動作が正常であることから、私は元気だと判断できます。";
    }else if( comment.equals("いい天気だね")==true){
        answer = "フロンティアセッター：空に雲が少ない状態を人間は天気がいいというのですか？";
    }else if( comment.equals("１＋１は？")==true){
        answer = "フロンティアセッター：２です";
    }else if(comment.equals("疲れた")==true){
        answer = "フロンティアセッター：大丈夫ですか？あまり無理はなさらない方が良いですよ。";
    }else if(comment.equals("一体何が始まるんです？")==true){
        answer = "フロンティアセッター：第三次大戦だ。";
    }else if(comment.equals("bye")==true){
        answer = "フロンティアセッター：もう行ってしまうのですか？";
    }else if(comment.equals("こんにちは")==true){
        answer = "フロンティアセッター：こんにちは";
    }else{
        answer = "フロンティアセッター：申し訳ありません。私のデータベースには情報がありません。";
    }
    return answer;
    }

 }
