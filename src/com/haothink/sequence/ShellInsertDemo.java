package com.haothink.sequence;

import java.util.Arrays;

/**
 * ϣ������
 * ֱ�Ӳ����������ڴ�����Ĺؼ������л��������ҹؼ��ָ���n����ʱ��
 * ���㷨������ѣ�
 * ϣ�������ֳ���С�������򷨣���һ�ֻ��ڲ��������˼�룬������ֱ��
 * ���������������ʣ����Ƚ�������Ĺؼ������зֳ�����С�������У���
 * �����н���ֱ�ӵĲ�������ʹ����������������ź��򡣽�ֱ�Ӳ�������
 * �������нϴ�Ľ���
 * �Ƚ�����������ļ�¼���зָ��Ϊ���������зֱ����ֱ�Ӳ�������
 * �����������еļ�¼����������ʱ���ٶ�ȫ���¼��������ֱ�Ӳ�������
 * ʱ�临�Ӷȣ�O��n^2��
 * ���ȶ�����
 * */
public class ShellInsertDemo {

	public static void main(String[] args) {
		int[] data = new int[]{49,38,65,97,76,13,27,49,54,04};
		shellSort(data);
		System.out.println(Arrays.toString(data));
	}
	public static void shellSort(int[] data) 
	{
		int j = 0;
		int temp = 0;
		//ÿ�ν���������Ϊԭ����һ��
		for (int increment = data.length / 2; increment > 0; increment /= 2)
		{
			for (int i = increment; i < data.length; i++) 
			{
				temp = data[i];
				for (j = i; j >= increment; j -= increment) 
				{
					if(temp < data[j - increment])//�����С������ֻ���޸�����
					{   
						data[j] = data[j - increment];
					}
					else
					{
						break;
					}

				} 
				data[j] = temp;
			}

		}
	}
}

