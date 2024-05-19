import javax.swing.*;

/**
 *	词法编辑器主程序
 *	运行结果保存在output.txt
 *	符号表保存在sym.txt
 */
public class Mylex{
	public static void main(String[] args){
		LexFrame lexframe = new LexFrame();
		lexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lexframe.setResizable(false);
		lexframe.setVisible(true);

	}
	public Mylex() {

	}
}
