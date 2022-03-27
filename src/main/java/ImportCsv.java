
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class ImportCsv {
	 // CSVファイルを読み込み1行ずつ出力
	
	  ;
	  public static List<Card> importCsvData() {
	  List<Card> cardList = new ArrayList<Card>();
	  BufferedReader br = null;
	  String file_name = "C:\\Users\\PC_User\\Desktop\\pleiades-2021-03-java-win-64bit-jre_20210328\\pleiades\\workspace\\dominionApp\\src\\main\\webapp\\data\\カードデータ.csv"; // 入力ファイル
	  try {
	  File file = new File(file_name);
	  br = new BufferedReader(new FileReader(file));
	  // readLineで一行ずつ読み込む
	  String line; // 読み込み行
	  String[] data; // 分割後のデータを保持する配列
	  boolean firstFlg = true;
	  while ((line = br.readLine()) != null) {
	  // lineをカンマで分割し、配列dataに設定
	  data = line.split(",");

	  if(firstFlg) {
		  firstFlg = false;
		  continue;
	  }
	  cardList.add(new Card(data[1],data[2],data[3],data[4],data[5]));
	  }
	  } catch (Exception e) {
	  System.out.println(e.getMessage());
	  } finally {
	  try {
	  br.close();
	  } catch (Exception e) {
	  System.out.println(e.getMessage());
	  }
	  }
	  return cardList;
	  }
}
