/*Данная программа дает рекомендации пользователю по устранения неполадок в двигателях внутреннего сгорания,
* после того как пользователь введет значение. В случае неисправности выбрасывается ислючение, созданое мной.
 * Если пользователь введет неверное значение, допустит орфаграфическую ошибку, или просто ничего не введет,
 * будет так же выбрашено исключение, созданое мной и будет выбрасываться до тех пор, пока пользователь не введет
 * верное значение.
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
	if (motor.equals("завелся") || motor.equals("не завелся")) {
		 
	} else {
throw new EngineException();
	}
}
public void workEngine2() throws EngineWorkOrNoWorkException {
	if (motor.equals("завелся")) {
		System.out.println("Все хорошо, удачной поездки! :]");
	} else {
		
throw new EngineWorkOrNoWorkException();

	}
}
public void workEngine3() throws Engine2Exception {
	if ( motor.equals("не поступает бензин") || motor.equals("плохой воздушный фильтр") ||
			motor.equals("все не в порядке") || motor.equals("нет искры") || motor.equals("не поступает бензин и ") ||
			motor.equals("не поступает бензин") || motor.equals("завелся")) {
		
	}else {
		throw new Engine2Exception();
	}
}

public static void main(String[] args) {
		Moto moto = new Moto();
		System.out.println("При запуске двигателя внутреннего сгорания могут возникнуть проблемы");
				System.out.println("Попробуем разобраться с ними");
				System.out.println("Введите завелся или не завелся:");
		moto.choice();
try {
	moto.workEngine();
}catch(EngineException e) {
	System.err.println("Допущена орфографическая ошибка " + e +" введите завелся или не заавелся: " );
	
	while (b == false) {
		moto.choice();
			if (motor.equals("завелся") || motor.equals("не завелся")) {
			b = true;
			}else {
				System.err.println("Допущена ошибка " + e +" введите завелся или не заавелся: " );
			}
	}
	
		}try {
			moto.workEngine2();
				} catch (EngineWorkOrNoWorkException e2) {
			System.out.println("Двигатель не завелся " + e2 +" надо предпринять какие нибудь действия: " );
			
			System.out.println("1.Проверить есть ли искра на свечах зажигания.");
			System.out.println("2.Проверить поступает ли бензин.");
			System.out.println("3.Проверить в рабочем ли соотоянии находится воздушный фильтр.");
			System.out.println("Введите проведенные проверочные действия: не поступает бензин,");
			System.out.println("нет искры на свечах зажигания, плохой воздушный фильтр:");
			moto.choice();
		
			}
		
			try {
				
				moto.workEngine3();
				
			} catch (Engine2Exception e3) {
			
				System.err.println("Допущена орфографическая ошибка " + e3 );
		
				System.out.println("Введите проведенные проверочные действия: не поступает бензин,");
				System.out.println("нет искры на свечах зажигания, плохой воздушный фильтр:");
				while (c == false) {
					moto.choice();
	if ( motor.equals("не поступает бензин") || motor.equals("плохой воздушный фильтр") ||
	motor.equals("все не в порядке") || motor.equals("нет искры на свечах зажигания") || motor.equals("не поступает бензин и ") ||
	motor.equals("не поступает бензин")) {
						
						c = true;
						}else {
		System.err.println("Допущена орфографическая ошибка " + e3 );
		System.out.println("Введите проведенные проверочные действия: не поступает бензин,");
		System.out.println("нет искры на свечах зажигания, плохой воздушный фильтр:");
		
						}
					}
				}finally {
					if(motor.equals("не поступает бензин")) {
						System.out.println("Рекомендации: проверить систему подачи топлива");
					}if(motor.equals("Рекомендации: нет искры на свечах зажигания"))	{
						System.out.println("Рекомендации: проверить броне провода, катушки зажигания или заменить свечи зажигания");
					}if(motor.equals("плохой воздушный фильтр")) {
						System.out.println("Рекомендации: заменить воздушный фильтр");
					}
					
				}
			
		}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	


