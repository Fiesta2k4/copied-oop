package master;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Menu extends JFrame implements ActionListener{

	private JButton startButton;
	private JButton instructionButton;
	private JButton exitButton;
	private JLabel label;	
	Main main;
	Process process;
	
	public Menu() {
		
	Container cp = getContentPane();	
	cp.setLayout (new GridLayout(5, 1, 3, 3));
	
	label = new JLabel("O an quan game");
	cp.add(label);
	
	startButton = new JButton("Start");
	instructionButton = new JButton("Intruction");
	exitButton = new JButton("Exit");
	cp.add(startButton);
	cp.add(instructionButton);
	cp.add(exitButton);
	
	startButton.addActionListener(this);
	instructionButton.addActionListener(this);
	exitButton.addActionListener(this);
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("LOL game LMAO");
	setSize(400, 200);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new Menu();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("Start")) {
			
			
		
		}
		else if (button.equals("Intruction")) {
			JFrame f = new JFrame();
	        f.setLocationRelativeTo(null);

	        JTextArea textArea = new JTextArea();
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true);
	        textArea.setText("Mục tiêu cần đạt được để giành chiến thắng: người thắng cuộc trong trò chơi này là người mà khi cuộc chơi kết thúc có tổng số dân quy đổi nhiều hơn. Tùy theo luật chơi từng địa phương hoặc thỏa thuận giữa hai người chơi nhưng phổ biến là 1 quan được quy đổi bằng 10 dân hoặc 5 dân (cờ).\r\n"
	        		+ "\r\n"
	        		+ "Di chuyển quân: từng người chơi khi đến lượt của mình sẽ di chuyển dân theo phương án để có thể ăn được càng nhiều dân và quan hơn đối phương càng tốt. Người thực hiện lượt đi đầu tiên thường được xác định bằng cách oẳn tù tì hay thỏa thuận. Khi đến lượt, người chơi sẽ dùng tất cả số quân trong một ô có quân bất kỳ do người đó chọn trong số 5 ô vuông thuộc quyền kiểm soát của mình để lần lượt rải vào các ô, mỗi ô 1 quân, bắt đầu từ ô gần nhất và có thể rải ngược chiều xuôi chiều kim đồng hồ tùy ý. Khi rải hết quân cuối cùng, tùy tình huống mà người chơi sẽ phải xử lý tiếp như sau:\r\n"
	        		+ "\r\n"
	        		+ "Nếu liền sau đó là một ô vuông có chứa quân thì tiếp tục dùng tất cả số quân đó để rải tiếp,theo chiều đã chọn.\r\n"
	        		+ "Nếu liền sau đó là một ô trống (không phân biệt ô quan hay ô dân) rồi đến một ô có chứa quân thì người chơi sẽ bị mất lượt số quân trong ô đó. Số quân bị ăn sẽ được loại ra khỏi bàn chơi để người chơi tính điểm khi kết thúc. Nếu liền sau ô có quân đã bị ăn lại là một ô trống rồi đến một ô có quân nữa thì người chơi có quyền ăn tiếp cả quân ở ô này... Do đó trong cuộc chơi có thể có phương án rải quân làm cho người chơi ăn hết toàn bộ số quân trên bàn chơi chỉ trong một lượt đi của mình. Một ô có nhiều dân thường được trẻ em gọi là ô nhà giàu, rất nhiều dân thì gọi là giàu sụ. Người chơi có thể bằng kinh nghiệm hoặc tính toán phương án nhằm nuôi ô nhà giàu rồi mới ăn để được nhiều điểm.\r\n"
	        		+ "Nếu liền sau đó là ô quan có chứa quân hoặc 2 ô trống trở lên hoặc sau khi vừa ăn thì người chơi bị mất lượt và quyền đi tiếp thuộc về đối phương.\r\n"
	        		+ "Trường hợp đến lượt đi nhưng cả năm ô vuông thuộc quyền kiểm soát của người chơi đều không có dân thì người đó sẽ phải dùng 5 dân đã ăn được của mình để đặt vào mỗi ô 1 dân để có thể thực hiện việc di chuyển quân. Nếu người chơi không đủ 5 dân thì phải vay của đối phương và trả lại khi tính điểm. Cuộc chơi sẽ kết thúc khi toàn bộ dân và quan ở hai ô quan đã bị ăn hết. Trường hợp hai ô quan đã bị ăn hết nhưng vẫn còn dân thì quân trong những hình vuông phía bên nào coi như thuộc về người chơi bên ấy; tình huống này được gọi là hết quan, tàn dân, thu quân, kéo về hay hết quan, tàn dân, thu quân, bán ruộng. Ô quan có ít dân (có số dân nhỏ hơn 5 phổ biến được coi là ít) gọi là quan non và để cuộc chơi không bị kết thúc sớm cho tăng phần thú vị, luật chơi có thể quy định không được ăn quan non, nếu rơi vào tình huống đó sẽ bị mất lượt.\r\n"
	        		+ "Ở một số địa phương còn có cách chơi: Khi liền sau đó là ô quan sẽ được bốc một viên dân trong ô quan để đi đến ô tiếp theo, trong trường hợp ô quan chỉ có một viên quan lớn người chơi sẽ không được dùng mà mất lượt, quyền đi tiếp thuộc về đối phương");

	        JScrollPane scrollPane = new JScrollPane(textArea);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 

	
	        JOptionPane.showMessageDialog(f, scrollPane);

	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else {
			JFrame f = new JFrame();
			int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
			if (a == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		
		
		
	}
}