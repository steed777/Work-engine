/*������ ��������� ���� ������������ ������������ �� ���������� ��������� � ���������� ����������� ��������,
* ����� ���� ��� ������������ ������ ��������. � ������ ������������� ������������� ���������, �������� ����.
 * ���� ������������ ������ �������� ��������, �������� ��������������� ������, ��� ������ ������ �� ������,
 * ����� ��� �� ��������� ����������, �������� ���� � ����� ������������� �� ��� ���, ���� ������������ �� ������
 * ������ ��������.
 */
import java.util.Scanner;



public class Moto{
static String motor;
static boolean b = false;
static boolean c = false;
public void choice(){
	Scanner in = new Scanner(System.in);
	motor = in.nextLine();
	
	}
public void workEngine() throws EngineException{
	if (motor.equals("�������") || motor.equals("�� �������")) {
		 
	} else {
throw new EngineException();
	}
}
public void workEngine2() throws EngineWorkOrNoWorkException {
	if (motor.equals("�������")) {
		System.out.println("��� ������, ������� �������! :]");
	} else {
		
throw new EngineWorkOrNoWorkException();

	}
}
public void workEngine3() throws Engine2Exception {
	if ( motor.equals("�� ��������� ������") || motor.equals("������ ��������� ������") ||
			motor.equals("��� �� � �������") || motor.equals("��� �����") || motor.equals("�� ��������� ������ � ") ||
			motor.equals("�� ��������� ������") || motor.equals("�������")) {
		
	}else {
		throw new Engine2Exception();
	}
}

public static void main(String[] args) {
		Moto moto = new Moto();
		System.out.println("��� ������� ��������� ����������� �������� ����� ���������� ��������");
				System.out.println("��������� ����������� � ����");
				System.out.println("������� ������� ��� �� �������:");
		moto.choice();
try {
	moto.workEngine();
}catch(EngineException e) {
	System.err.println("�������� ��������������� ������ " + e +" ������� ������� ��� �� ��������: " );
	
	while (b == false) {
		moto.choice();
			if (motor.equals("�������") || motor.equals("�� �������")) {
			b = true;
			}else {
				System.err.println("�������� ������ " + e +" ������� ������� ��� �� ��������: " );
			}
	}
	
		}try {
			moto.workEngine2();
				} catch (EngineWorkOrNoWorkException e2) {
			System.out.println("��������� �� ������� " + e2 +" ���� ����������� ����� ������ ��������: " );
			
			System.out.println("1.��������� ���� �� ����� �� ������ ���������.");
			System.out.println("2.��������� ��������� �� ������.");
			System.out.println("3.��������� � ������� �� ��������� ��������� ��������� ������.");
			System.out.println("������� ����������� ����������� ��������: �� ��������� ������,");
			System.out.println("��� ����� �� ������ ���������, ������ ��������� ������:");
			moto.choice();
		
			}
		
			try {
				
				moto.workEngine3();
				
			} catch (Engine2Exception e3) {
			
				System.err.println("�������� ��������������� ������ " + e3 );
		
				System.out.println("������� ����������� ����������� ��������: �� ��������� ������,");
				System.out.println("��� ����� �� ������ ���������, ������ ��������� ������:");
				while (c == false) {
					moto.choice();
	if ( motor.equals("�� ��������� ������") || motor.equals("������ ��������� ������") ||
	motor.equals("��� �� � �������") || motor.equals("��� ����� �� ������ ���������") || motor.equals("�� ��������� ������ � ") ||
	motor.equals("�� ��������� ������")) {
						
						c = true;
						}else {
		System.err.println("�������� ��������������� ������ " + e3 );
		System.out.println("������� ����������� ����������� ��������: �� ��������� ������,");
		System.out.println("��� ����� �� ������ ���������, ������ ��������� ������:");
		
						}
					}
				}finally {
					if(motor.equals("�� ��������� ������")) {
						System.out.println("������������: ��������� ������� ������ �������");
					}if(motor.equals("������������: ��� ����� �� ������ ���������"))	{
						System.out.println("������������: ��������� ����� �������, ������� ��������� ��� �������� ����� ���������");
					}if(motor.equals("������ ��������� ������")) {
						System.out.println("������������: �������� ��������� ������");
					}
					
				}
			
		}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	


