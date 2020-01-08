package kr.co.ch04.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2020/01/08
 * �̸� : ��ö��
 * ���� : AOP �ǽ��ϱ�
 * 
 * ������ AOP 
 *  - �ٽɰ��ɰ� ��ü�� ����Ǵ� �������(Ⱦ�ܰ���)�� �и��ؼ� ���α׷����ϴ� ���
 *  
 * �ֿ���
 *  1) ��������Ʈ(JoinPoint)
 *   - �����ϴ� ��� �ٽɰ��� �޼���
 * 
 *  2) ����Ʈ��(PointCut)
 *   - ��������Ʈ ��� ����(AOP�� ����)�Ǵ� �ٽɰ��� �޼��� 
 *  
 *  3) �����̽�(Advice)
 *   - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼���
 *   
 *  4) �ֽ���Ʈ(Aspect)
 *   - ����Ʈ�ư� �����̽��� ���յ� �������
 *   
 *  5) ����(Weaving)
 *   - ����Ʈ��(�ٽɰ���)�� ����ɶ� �����̽��� ����Ʈ�ƿ� ���յǴ� ����
 *   
 * ����Ʈ�� ǥ����
 *  execution(����Ÿ�� ��Ű����.Ŭ������.�޼����(�Ű�����))
 *  
 *  1) ����Ÿ��
 *   - *     : ��� ����Ÿ�� ���
 *   - void  : ����Ÿ���� void�� �޼���
 *   - !void : ����Ÿ���� void�� �ƴ� �޼���
 *   
 *  2) ��Ű����
 *   - kr.co.ch04          : �ش� ��Ű�� ��� 
 *   - kr.co.ch04..        : kr.co.ch04�� �����ϴ� ��� ��Ű�� ���
 *   - kr.co.ch04..service : kr.co.ch04�� �����ؼ� ������ ��Ű������ service�� ������ ��Ű�� ���
 *  
 *  3) Ŭ������
 *   - BoardService : �ش� Ŭ���� ���
 *   - *Service     : Ŭ�������� Service�� ������ Ŭ���� ���
 *   
 *  4) �޼����
 *   - *(..)  : �Ű������� ������ ���� ��� �޼��� 
 *   - *(*)   : �Ű������� 1�� ���� ��� �޼���
 *   - *(*,*) : �Ű������� 2�� ���� ��� �޼���
 *   - get*() : �Ű������� ���� �޼��� �̸��� get���� �����ϴ� �޼���
 */
public class AOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		BoardService bs = (BoardService) ctx.getBean("bs1");
		
		bs.insert();
		bs.select();
		bs.update(1);
		bs.delete(1, "abcd");
	}
}
