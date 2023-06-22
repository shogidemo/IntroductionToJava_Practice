/**
 * 銀行クラス
 * @author 佐藤
 */
public class Bank {
    /** 名前 */
    String name;
    /** 住所 */
    String address;
    
    /**
     * 口座を追加するメソッド
     * @param owner 口座の持ち主
     * @param initZandaka　初期残高
     */
    public void addAccount(String owner, int initZandaka){}
    
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        if (newName.length() < 3){
            throw new IllegalArgumentException("名前が不正です");
        }
        this.name = newName;
    }
}
