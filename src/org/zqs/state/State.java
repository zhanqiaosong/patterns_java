package org.zqs.state;
/**
 * ����״̬ģʽ�ķ��ǹ�����
 * @author QiaosongZhan
 *
 */
public class State {
	private final int SOLD_OUT = 0;//����
	private final int NO_COIN = 1;//δͶ��
	private final int HAS_COIN = 2;//��Ͷ��
	private final int SOLD = 3;//����
	private int state = SOLD_OUT;//��ʼ״̬
	private int count = 0;//�ǹ����������췽����ʼ��
	public State(int count) {
		if (count>0) {
			this.count = count;
			state = NO_COIN;
		}
	}
	//Ͷ��
	public void insertCoin() {
		if (state==HAS_COIN) {
			System.out.println("�����ظ�Ͷ�ң�");
		}else if (state==NO_COIN) {
			System.out.println("����Ͷ�ң�");
			state = HAS_COIN;
		}else if (state==SOLD_OUT) {
			System.out.println("�Ѿ����꣬����Ͷ�ң�");
		}else if (state==SOLD) {
			System.out.println("��ȴ��ٴι���");
		}
	}
	//�˱�
	public void returnCoin() {
		if (state==HAS_COIN) {
			System.out.println("�˱ҳɹ���");
			state = NO_COIN;
		}else if (state==NO_COIN) {
			System.out.println("����δͶ�ң�");
		}else if (state==SOLD_OUT) {
			System.out.println("������״̬��");
		}else if (state==SOLD) {
			System.out.println("�ǹ����ۣ������˱ң�");
		}
	}
	//Ť������
	public void turnGrank() {
		if (state==HAS_COIN) {
			System.out.println("����ɹ���");
			state = SOLD;
			dispense();
		}else if (state==NO_COIN) {
			System.out.println("����δͶ�ң�");
		}else if (state==SOLD_OUT) {
			System.out.println("������״̬��");
		}else if (state==SOLD) {
			System.out.println("�ǹ����ۣ������ظ�ȥ���ǹ���");
		}
	}
	//�����ǹ�����
	private void dispense() { 
		if (state==SOLD) {
			System.out.println("�ǹ��ѳ���");
			count -= 1;
			if (count==0) {
				state = SOLD_OUT;
			}
		}
		
		//���²�Ӧ�÷�����Ӧ����
	    else if (state==HAS_COIN) {
			System.out.println("����ɹ���");
			state = SOLD;
			dispense();
		}
		else if (state==NO_COIN) {
			System.out.println("����δͶ�ң�");
		}else if (state==SOLD_OUT) {
			System.out.println("������״̬��");
		}
	}
	
	
	public static void main(String[] args) {
		State s = new State(5);
		s.returnCoin();
		s.turnGrank();
		s.insertCoin();
		s.turnGrank();
		/*s.insertCoin();
		s.returnCoin();*/
	}
}
