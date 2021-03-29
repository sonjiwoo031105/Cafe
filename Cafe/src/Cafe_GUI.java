
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.RepaintManager;

import java.awt.Color;

public class Cafe_GUI {
	
	private JFrame frame;
	private int price = 0;
	private int tprice = 500;
	
	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe_GUI window = new Cafe_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//new Cafe_gui();
	}
	
	public void Buy() {
		JFrame buy_1 = new JFrame();
		buy_1.setTitle("����"); // â ���� ����
		buy_1.setSize(400,200); // â ũ�� ����
		buy_1.setResizable(false); // â ũ�� ����
		buy_1.setLocationRelativeTo(null); // â �ߴ� ��ġ�� �����
		
		
		
		JPanel buy = new JPanel();
		buy.setLayout(null);
		JLabel finish = new JLabel();
		finish.setText("������ �Ϸ�Ǿ����ϴ�.");
		finish.setBounds(60, 40,300, 60);
        buy.add(finish);
        finish.setFont(new Font("HY����M", Font.PLAIN, 25));
        
        JButton yes = new JButton("Ȯ��");
        yes.setBounds(160, 100, 80, 30);
        buy.add(yes);
        yes.setBackground(Color.white);
        yes.setFont(new Font("HY����M", Font.PLAIN, 15));
        
        yes.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buy_1.setVisible(false);
			}
		});
        buy_1.getContentPane().add(buy);
        buy_1.setVisible(true);
		
	}
	
	/**
	 * Create the application.
	 */
	public Cafe_GUI() {
			initialize();		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 240, 245));
		frame.setBackground(new Color(255, 240, 245));
		frame.setVisible(true);					//������ ���̱�
		frame.setTitle("���� �ֹ��ϱ�");				//����
		frame.setBounds(100, 100, 902, 693);	//�г� ũ��
		frame.setLocationRelativeTo(null);		//ȭ���� ����� �� �� �ְ� �ϱ�
		//frame.setResizable(false);			//ȭ�� ũ�� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//â�� ������ ���α׷��� �����
		frame.getContentPane().setLayout(null);;
		
		Font f1 = new Font("HY����M",Font.PLAIN,24);
		JPanel OrderPage = new JPanel();	//Order�г� �����
		OrderPage.setBackground(new Color(255, 240, 245));
		OrderPage.setBounds(0, 0, 886, 654); 	//�г� ũ��
		frame.getContentPane().add(OrderPage);
		OrderPage.setLayout(null);
		 
		
			
		JButton Americano = new JButton("�Ƹ޸�ī��");
		Americano.setBounds(73, 166, 133, 108);
		Americano.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		Americano.setBackground(new Color(230, 230, 250));
		OrderPage.add(Americano);
			
		JButton cafelatte = new JButton("ī���");
		cafelatte.setBounds(273, 166, 133, 108);
		cafelatte.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		cafelatte.setBackground(new Color(230, 230, 250));
		OrderPage.add(cafelatte);
				
		JButton cappuccino = new JButton("īǪġ��");
		cappuccino.setBounds(473, 166, 133, 108);
		cappuccino.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		cappuccino.setBackground(new Color(230, 230, 250));
		OrderPage.add(cappuccino);
				
		JButton cafemocha = new JButton("ī���ī");
		cafemocha.setBounds(673, 166, 133, 108);
		cafemocha.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		cafemocha.setBackground(new Color(230, 230, 250));
		OrderPage.add(cafemocha);
				
		JButton choco = new JButton("���� ��ũƼ");
		choco.setBounds(73, 415, 133, 108);
		choco.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		choco.setBackground(new Color(230, 230, 250));
		OrderPage.add(choco);
				
		JButton taro = new JButton("Ÿ�� ��ũƼ");
		taro.setBounds(273, 415, 133, 108);
		taro.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		taro.setBackground(new Color(230, 230, 250));
		OrderPage.add(taro);
			
		JButton greentea = new JButton("���� ��ũƼ");
		greentea.setBounds(473, 415, 133, 108);
		greentea.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		greentea.setBackground(new Color(230, 230, 250));
		OrderPage.add(greentea);
				
		JButton brownsugar = new JButton("��� ��ũƼ");
		brownsugar.setBounds(673, 415, 133, 108);
		brownsugar.setFont(new Font("MD�̼�ü", Font.PLAIN, 18));
		brownsugar.setBackground(new Color(230, 230, 250));
		OrderPage.add(brownsugar);
				
		JLabel Americano_1 = new JLabel("3000��");
		Americano_1.setBounds(105, 295, 74, 25);
		Americano_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(Americano_1);
		
		JLabel cafelatte_1 = new JLabel("3500��");
		cafelatte_1.setBounds(305, 295, 74, 25);
		cafelatte_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(cafelatte_1);
			
		JLabel cappuccino_1 = new JLabel("4000��");
		cappuccino_1.setBounds(507, 295, 74, 25);
		cappuccino_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(cappuccino_1);
		
		JLabel cafemocha_1 = new JLabel("4000��");
		cafemocha_1.setBounds(707, 295, 74, 25);
		cafemocha_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(cafemocha_1);
		
		JLabel choco_1 = new JLabel("4000��");
		choco_1.setBounds(105, 545, 74, 25);
		choco_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(choco_1);
		
		JLabel taro_1 = new JLabel("4000��");
		taro_1.setBounds(305, 545, 74, 25);
		taro_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(taro_1);
			
		JLabel greentea_1 = new JLabel("4500��");
		greentea_1.setBounds(507, 545, 74, 25);
		greentea_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(greentea_1);
		
		JLabel brownsugar_1 = new JLabel("4500��");
		brownsugar_1.setBounds(707, 545, 74, 25);
		brownsugar_1.setFont(new Font("HY����L", Font.PLAIN, 21));
		OrderPage.add(brownsugar_1);
		
		//---------------------------------------------------------
		
		JLabel label = new JLabel("���ϴ� ���Ḧ �������ּ���");
		label.setBounds(240, 55, 393, 44);
		label.setFont(new Font("HY����M", Font.PLAIN, 30));
		OrderPage.add(label);
				
		
		JPanel SizeTempNum = new JPanel();
		SizeTempNum.setBackground(new Color(255, 240, 245));
		SizeTempNum.setBounds(0, 0, 886, 654);
		frame.getContentPane().add(SizeTempNum);
		SizeTempNum.setLayout(null);
		
				
		SizeTempNum.setVisible(false);
			
				
		JLabel Qsize = new JLabel("����� �������� �Ͻðڽ��ϱ�?");
		Qsize.setFont(new Font("���� ���� M", Font.PLAIN, 21));
		Qsize.setBounds(43, 89, 340, 40);
		
		JCheckBox checkBoxM = new JCheckBox("M");
		checkBoxM.setBackground(new Color(255, 240, 245));
		checkBoxM.setFont(new Font("HY����M", Font.PLAIN, 21));
		checkBoxM.setBounds(426, 93, 93, 30);
		JCheckBox checkBoxL = new JCheckBox("L");
		checkBoxL.setBackground(new Color(255, 240, 245));
		checkBoxL.setFont(new Font("HY����M", Font.PLAIN, 21));
		checkBoxL.setBounds(568, 93, 93, 30);
		JCheckBox checkBoxXL = new JCheckBox("XL");
		checkBoxXL.setBackground(new Color(255, 240, 245));
		checkBoxXL.setFont(new Font("HY����M", Font.PLAIN, 21));
		checkBoxXL.setBounds(706, 93, 93, 30);
			
		ButtonGroup Group1 = new ButtonGroup();
		Group1.add(checkBoxM);
		Group1.add(checkBoxL);
		Group1.add(checkBoxXL);
		
		SizeTempNum.add(Qsize);
		SizeTempNum.add(checkBoxM);
		SizeTempNum.add(checkBoxL);
		SizeTempNum.add(checkBoxXL);
				
				
		JLabel qHorI = new JLabel("�̰߰� �帱���? ������ �帱���?");
		qHorI.setFont(new Font("���� ���� M", Font.PLAIN, 21));
		SizeTempNum.add(qHorI);
		qHorI.setBounds(43, 198, 363, 40);
		qHorI.setLayout(null);
			
		JCheckBox hot = new JCheckBox("HOT");
		hot.setBackground(new Color(255, 240, 245));
		hot.setFont(new Font("HY����M", Font.PLAIN, 21));
		hot.setBounds(426, 202, 93, 30);
		JCheckBox ice = new JCheckBox("ICE");
		ice.setBackground(new Color(255, 240, 245));
		ice.setFont(new Font("HY����M", Font.PLAIN, 21));
		ice.setBounds(586, 202, 93, 30);
				
		ButtonGroup Group2 = new ButtonGroup();
		Group2.add(hot);
		Group2.add(ice);
		
		SizeTempNum.add(hot);
		SizeTempNum.add(ice);
		
				
		JLabel drinknum = new JLabel("������ ������ �Է����ּ���.");
		drinknum.setFont(new Font("���� ���� M", Font.PLAIN, 21));
		drinknum.setBounds(43, 302, 340, 40);
		SizeTempNum.add(drinknum);
		
				
		JTextField num = new JTextField();
		num.setBounds(426, 302, 93, 30);
		SizeTempNum.add(num);
		num.setColumns(10);
			
		JLabel where = new JLabel("��𿡼� ��ǰǰ���?");
		where.setFont(new Font("���� ���� M", Font.PLAIN, 21));
		where.setBounds(43, 417, 236, 40);
		SizeTempNum.add(where);
		
		JCheckBox in = new JCheckBox("����");
		in.setBackground(new Color(255, 240, 245));
		in.setFont(new Font("�����ٸ�����", Font.BOLD, 21));
		in.setBounds(426, 422, 93, 30);
		JCheckBox out = new JCheckBox("TAKE OUT");
		out.setBackground(new Color(255, 240, 245));
		out.setFont(new Font("HY����M", Font.PLAIN, 21));
		out.setBounds(581, 422, 133, 30);
		
		ButtonGroup Group3 = new ButtonGroup();
		Group3.add(in);
		Group3.add(out);
			
		SizeTempNum.add(in);
		SizeTempNum.add(out);
				
		JButton next1 = new JButton("����");
		next1.setBackground(new Color(230, 230, 250));
		next1.setBounds(728, 527, 97, 23);
		SizeTempNum.add(next1);
		JLabel drink = new JLabel("");
		JLabel hori = new JLabel("");
		JLabel mlxl = new JLabel("");
		JLabel inout = new JLabel("");
		JLabel dnum = new JLabel("");
		JLabel shotorsyrup = new JLabel("");
		JLabel allprice = new JLabel("");
		JLabel whatpearl = new JLabel("");
		
		JPanel AddTopping = new JPanel();	//Topping panel�����
		AddTopping.setBackground(new Color(255, 240, 245));
		AddTopping.setBounds(0, 0, 886, 654);	//�г� ũ��
		frame.getContentPane().add(AddTopping);	
		AddTopping.setVisible(false);			//ó���� Topping�г��� �Ⱥ��̰� �ϱ�
		
			
		JLabel topping = new JLabel("���ῡ ������ �߰��Ͻðڽ��ϱ�?");	//Topingȭ�鿡�� ���̴� ����
		topping.setFont(new Font("���� ���� M", Font.PLAIN, 30));	//���� ��Ʈ,ũ��
		topping.setBounds(190, 88, 489, 65);	//topping�г� ũ��
		JButton y = new JButton("YES");	//yes��ư ����
		y.setFont(new Font("HY����M", Font.PLAIN, 25));
		y.setBackground(new Color(230, 230, 250));
		y.setBounds(217,224 , 142, 65);	//yes��ư ũ��
		JButton n = new JButton("NO");	//no ��ư ����
		n.setFont(new Font("HY����M", Font.PLAIN, 25));
		n.setBackground(new Color(230, 230, 250));
		n.setBounds(510, 224, 142, 65);	//no ��ư ũ��
		JButton last2 = new JButton("����");	//�������� ���ư��� ��ư
		last2.setBackground(new Color(230, 230, 250));
		last2.setBounds(43, 527, 97, 23);	//���� ��ư ũ��
			
		AddTopping.add(topping);	//Topping�гο� �����߰�
		AddTopping.add(y);		//Topping�гο� yes��ư�߰�
		AddTopping.add(n);		//Topping�гο� no��ư�߰�
		AddTopping.add(last2);	//Topping�гο� �������� ���ư��� ��ư �߰�
		AddTopping.setLayout(null);	//��ġ�� �����Ӱ�
			
		last2.addActionListener(new ActionListener() {	//last��ư�� ������

			@Override
			public void actionPerformed(ActionEvent e) {
				SizeTempNum.setVisible(true);	//SizeTempNum�� ����
				AddTopping.setVisible(false);		//Topping ȭ���� ����
					
			}	
		});
		
				
		JPanel CoffeeTopping = new JPanel();
		CoffeeTopping.setBackground(new Color(255, 240, 245));
		
		CoffeeTopping.setBounds(0, 0, 886, 654);
		frame.getContentPane().add(CoffeeTopping);
		CoffeeTopping.setVisible(false);
		
			
		JLabel add2 = new JLabel("������ �߰��Ͻðڽ��ϱ�?");
		add2.setFont(new Font("���� ���� M", Font.PLAIN, 30));
		add2.setBounds(240, 88, 392, 62);
		
		JButton shot = new JButton("�� �߰�");
		shot.setFont(new Font("HY����M", Font.PLAIN, 25));
		shot.setBackground(new Color(230, 230, 250));
		shot.setBounds(217, 224, 142, 65);
		JButton syrup = new JButton("�÷� �߰�");
		syrup.setFont(new Font("HY����M", Font.PLAIN, 25));
		syrup.setBackground(new Color(230, 230, 250));
		syrup.setBounds(510, 224, 142, 65);
		JButton last3 = new JButton("����");
		last3.setBackground(new Color(230, 230, 250));
		last3.setBounds(43, 527, 97, 23);
		CoffeeTopping.setLayout(null);
			
		CoffeeTopping.add(add2);
		CoffeeTopping.add(shot);
		CoffeeTopping.add(syrup);
		CoffeeTopping.add(last3);
		JLabel corm = new JLabel("");	//card or money
		
		JPanel BubbleTopping = new JPanel();
		BubbleTopping.setBackground(new Color(255, 240, 245));
		BubbleTopping.setBounds(0, 0, 886, 654);
		frame.getContentPane().add(BubbleTopping);
		BubbleTopping.setFont(new Font("���� ���� M",Font.PLAIN,21));
		BubbleTopping.setVisible(false);
		
		JButton pearl = new JButton("Ÿ�ǿ�ī �� �߰�");
		pearl.setFont(new Font("HY����M", Font.PLAIN, 20));
		pearl.setBackground(new Color(230, 230, 250));
		pearl.setBounds(141, 235, 190, 80);
		JButton cheese = new JButton("ġ���� �߰�");
		cheese.setFont(new Font("HY����M", Font.PLAIN, 20));
		cheese.setBackground(new Color(230, 230, 250));
		cheese.setBounds(604, 235, 190, 80);
		JButton coconut = new JButton("���ڳ� ���� �߰�");
		coconut.setFont(new Font("HY����M", Font.PLAIN, 20));
		coconut.setBackground(new Color(230, 230, 250));
		coconut.setBounds(374, 235, 190, 80);
		JButton last4 = new JButton("����");
		last4.setBackground(new Color(230, 230, 250));
		last4.setBounds(43, 527, 97, 23);
		BubbleTopping.setLayout(null);
		
		JLabel add1 = new JLabel("������ �߰��Ͻðڽ��ϱ�?");
		add1.setFont(new Font("���� ���� M", Font.PLAIN, 30));
		add1.setBounds(240, 88, 400, 70);
		BubbleTopping.add(add1);
		BubbleTopping.add(pearl);
		BubbleTopping.add(cheese);
		BubbleTopping.add(coconut);
		BubbleTopping.add(last4);
		
		JPanel Pay = new JPanel();
		Pay.setBackground(new Color(255, 240, 245));
		Pay.setBounds(0, 0, 886, 367);
		frame.getContentPane().add(Pay);
		Pay.setLayout(null);
		Pay.setVisible(false);
		
		JLabel payment = new JLabel("������ ��� ���͵帱���?");
		payment.setFont(new Font("���� ���� M", Font.PLAIN, 30));
		payment.setLocation(220, 26);
		payment.setSize(441, 84);
		
		JButton card = new JButton("ī��");	
		card.setFont(new Font("HY����M", Font.PLAIN, 25));
		card.setBackground(new Color(230, 230, 250));
		card.setBounds(210,155,142,65);
		JButton money = new JButton("����");	
		money.setFont(new Font("HY����M", Font.PLAIN, 25));
		money.setBackground(new Color(230, 230, 250));
		money.setBounds(519,155,142,65);	
		JButton last5 = new JButton("����");	
		last5.setBackground(new Color(230, 230, 250));
		last5.setBounds(36,328,97,23);
		
		Pay.add(payment);	
		Pay.add(card);		
		Pay.add(money);		
		Pay.add(last5);
		
		
		
		JPanel Result = new JPanel();
		Result.setBackground(new Color(255, 240, 245));
		
		
		Result.setBounds(0, 364, 886, 289);
		frame.getContentPane().add(Result);
		Result.setLayout(null);
		
		JButton sell = new JButton("�����ϱ�");
		sell.setFont(new Font("HY��M", Font.PLAIN, 22));
		sell.setBackground(new Color(230, 230, 250));
		sell.setBounds(359, 222, 186, 43);
		Result.add(sell);
		Result.setVisible(false);
		
		sell.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Buy();
				
			}
			
		});
		
		Americano.addActionListener(new ActionListener() {//Americano ��ư�� ������
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage �����
				
				drink.setText("�Ƹ޸�ī��");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				price = 3000;
				
					y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

						@Override
						public void actionPerformed(ActionEvent e) {
							CoffeeTopping.setVisible(true);		//Ŀ������ȭ���� �߰�	
							AddTopping.setVisible(false);		//�����߰� ����â�� �������
							
							allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
							allprice.setBounds(140,90,350,50);
							allprice.setFont(f1);
							Result.add(allprice);
							
							shot.addActionListener(new ActionListener() {	//shot�߰� ��ư�� ������

								@Override
								public void actionPerformed(ActionEvent e) {
									Pay.setVisible(true);	//����â���� �Ѿ��
									CoffeeTopping.setVisible(false);	//�����߰� â�� �������.
									shotorsyrup.setText("���� : ���߰�");
									shotorsyrup.setBounds(110, 65, 300, 50);
									shotorsyrup.setFont(f1);
									Result.add(shotorsyrup);
								
								}
							
							});
							syrup.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									Pay.setVisible(true);
									CoffeeTopping.setVisible(false);
									shotorsyrup.setText("���� : �÷� �߰�");
									shotorsyrup.setBounds(110, 65, 300, 50);
									shotorsyrup.setFont(f1);
									Result.add(shotorsyrup);
									
								}
								
							});
						
							
						}
						
					});
					n.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							Pay.setVisible(true);
							AddTopping.setVisible(false);
							
							allprice.setText("�� ���� �ݾ� : " +price+ "��");
							allprice.setBounds(140,90,350,50);
							allprice.setFont(f1);
							Result.add(allprice);
							
							whatpearl.setText("���� : ����");
							whatpearl.setBounds(110, 65, 400, 50);
							whatpearl.setFont(f1);
							Result.add(whatpearl);
						}
						
					});
					last3.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							AddTopping.setVisible(true);
							CoffeeTopping.setVisible(false);
						}
						
					});
				
			}
			
		});
		
		cafelatte.addActionListener(new ActionListener() {//cafelatte ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("ī���");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				price = 3500;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						CoffeeTopping.setVisible(true);		//Ŀ������ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						shot.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								CoffeeTopping.setVisible(false);	//�����߰� â�� �������.
								shotorsyrup.setText("���� : ���߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
						syrup.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								CoffeeTopping.setVisible(false);
								shotorsyrup.setText("���� : �÷� �߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("���� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						CoffeeTopping.setVisible(false);
					}
					
				});
			}
		
		});
		
		cappuccino.addActionListener(new ActionListener() {	//cappuccino ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {	
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("īǪġ��");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4000;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						CoffeeTopping.setVisible(true);		//Ŀ������ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						shot.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								CoffeeTopping.setVisible(false);	//�����߰� â�� �������.
								shotorsyrup.setText("���� : ���߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
						syrup.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								CoffeeTopping.setVisible(false);
								shotorsyrup.setText("���� :�÷� �߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("���� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						CoffeeTopping.setVisible(false);
					}
					
				});
			}
			
		});
		
		cafemocha.addActionListener(new ActionListener() {	//cafemocha ��ư�� ������

		@Override
		public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����	
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("ī���ī");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4000;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						CoffeeTopping.setVisible(true);		//Ŀ������ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						shot.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								CoffeeTopping.setVisible(false);	//�����߰� â�� �������.
								shotorsyrup.setText("���� : ���߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
						syrup.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								CoffeeTopping.setVisible(false);
								shotorsyrup.setText("���� : �÷� �߰�");
								shotorsyrup.setBounds(110, 65, 300, 50);
								shotorsyrup.setFont(f1);
								Result.add(shotorsyrup);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("���� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						CoffeeTopping.setVisible(false);
					}
					
				});
			}
			
		});
		
		choco.addActionListener(new ActionListener() {		//choco ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("���� ��ũƼ");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4000;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						BubbleTopping.setVisible(true);		//��ũƼ����ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						pearl.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								BubbleTopping.setVisible(false);	//�����߰� â�� �������.
								whatpearl.setText("�� : Ÿ�ǿ�ī�� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						cheese.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ġ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						coconut.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ���ڳ� ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("�� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						BubbleTopping.setVisible(false);
						
					}
				});
			}	
		});
		
		taro.addActionListener(new ActionListener() {		//taro ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);		//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("Ÿ�� ��ũƼ");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4000;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						BubbleTopping.setVisible(true);		//��ũƼ����ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						pearl.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								BubbleTopping.setVisible(false);	//�����߰� â�� �������.
								whatpearl.setText("�� : Ÿ�ǿ�ī�� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						cheese.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ġ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						coconut.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ���ڳ� ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("�� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						BubbleTopping.setVisible(false);
						
					}
					
				});
			}
			
		});
		
		greentea.addActionListener(new ActionListener() {	//greentea ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);	//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �����
				
				drink.setText("���� ��ũƼ");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4500;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						BubbleTopping.setVisible(true);		//��ũƼ����ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						pearl.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								BubbleTopping.setVisible(false);	//�����߰� â�� �������.
								whatpearl.setText("�� : Ÿ�ǿ�ī�� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						cheese.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ġ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						coconut.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ���ڳ� ���� �߰�");
								whatpearl.setBounds(110, 65, 500, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("�� : ����");
						whatpearl.setBounds(110, 65, 500, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						BubbleTopping.setVisible(false);
					}
					
				});
			}
		});
		
		brownsugar.addActionListener(new ActionListener() {	//brownsugar ��ư�� ������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SizeTempNum.setVisible(true);	//SizeTempNum�� ����
				OrderPage.setVisible(false);	//OrderPage�� �Ⱥ���
				
				drink.setText("��� ��ũƼ");
				drink.setBounds(330, 40, 250, 50);
				drink.setFont(f1);
				Result.add(drink);
				
				price = 4500;
				
				y.addActionListener(new ActionListener() {//�����߰��� yes��ư�� ������

					@Override
					public void actionPerformed(ActionEvent e) {
						BubbleTopping.setVisible(true);		//��ũƼ����ȭ���� �߰�	
						AddTopping.setVisible(false);		//�����߰� ����â�� �������
						
						allprice.setText("�� ���� �ݾ� : " + (price+ tprice)+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						pearl.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								Pay.setVisible(true);	//����â���� �Ѿ��
								BubbleTopping.setVisible(false);	//�����߰� â�� �������.
								whatpearl.setText("�� : Ÿ�ǿ�ī�� �߰�");
								whatpearl.setBounds(110, 65, 300, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						cheese.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ġ���� �߰�");
								whatpearl.setBounds(110, 65, 300, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
						coconut.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								Pay.setVisible(true);
								BubbleTopping.setVisible(false);
								whatpearl.setText("�� : ���ڳ� ���� �߰�");
								whatpearl.setBounds(110, 65, 300, 50);
								whatpearl.setFont(f1);
								Result.add(whatpearl);
							}
							
						});
					}
										
				});
				n.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Pay.setVisible(true);
						AddTopping.setVisible(false);
						
						allprice.setText("�� ���� �ݾ� : " +price+ "��");
						allprice.setBounds(140,90,350,50);
						allprice.setFont(f1);
						Result.add(allprice);
						
						whatpearl.setText("�� : ����");
						whatpearl.setBounds(110, 65, 400, 50);
						whatpearl.setFont(f1);
						Result.add(whatpearl);
					}
					
				});
				last4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						AddTopping.setVisible(true);
						BubbleTopping.setVisible(false);			
					}
					
				});
			}
			
		});
			
			checkBoxM.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					mlxl.setText("�� ������ : M	");
					mlxl.setBounds(530,40,250,50);
					mlxl.setFont(f1);
					Result.add(mlxl);
					
				}
				
			});
			
			checkBoxL.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					mlxl.setText("�� ������ : L");
					mlxl.setBounds(530, 40, 250, 50);
					mlxl.setFont(f1);
					Result.add(mlxl);
				}
			});
			
			checkBoxXL.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					mlxl.setText("�� ������ : XL");
					mlxl.setBounds(530, 40, 250, 50);
					mlxl.setFont(f1);
					Result.add(mlxl);
				}
			});
		
			
			hot.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					hori.setText("���� : �߰ſ�");
					hori.setBounds(170, 40, 250, 50);
					hori.setFont(f1);
					Result.add(hori);
				}
			});
			
			ice.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					hori.setText("���� : ���̽�");
					hori.setBounds(170, 40, 250, 50);
					hori.setFont(f1);
					Result.add(hori);
				}
				
			});
			
			in.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					inout.setText("�� : ���� ��");
					inout.setBounds(600, 65, 250, 50);
					inout.setFont(f1);
					Result.add(inout);
				}	
			});
			
			out.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent arg0) {
					inout.setText("�� : ��ȸ�� ��");
					inout.setBounds(600, 65, 250, 50);
					inout.setFont(f1);
					Result.add(inout);
				}
				
			});
			
			next1.addActionListener(new ActionListener() {	//next1��ư�� ������

				@Override
				public void actionPerformed(ActionEvent arg0) {
					AddTopping.setVisible(true);		//Toppingȭ���� ����
					SizeTempNum.setVisible(false);	//SizeTempNum�� �Ⱥ���
					dnum.setText("���� �� : "+num.getText()+"��");
					dnum.setBounds(390, 65, 260,50);
					dnum.setFont(f1);
					Result.add(dnum);

					
				}
			});
			
			card.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Result.setVisible(true);
					corm.setText("���� ���� : ī�� ����");
					corm.setBounds(500, 90, 400, 50);
					corm.setFont(f1);
					Result.add(corm);
				}
			
			});
			
			money.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						Result.setVisible(true);
						corm.setText("���� ���� : ���� ����");
						corm.setBounds(500, 90, 400, 50);
						corm.setFont(f1);
						Result.add(corm);
					}
						
				});
			
			last5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					AddTopping.setVisible(true);
					Pay.setVisible(false);
					Result.setVisible(false);
				}
				
			});
			
	}
}