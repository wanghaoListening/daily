package com.haothink.sequence;

import java.util.Arrays;

/**
 * ����ѡ������
 * �ڼ򵥵�ѡ�������У����ȴ�n����¼ѡ��ؼ�����С�ļ�¼��Ҫn-1
 * �αȽϣ���n-1����¼��ѡ����С����Ҫn-2�αȽϽ����ÿ�ζ�û��
 * �����ϴεıȽϽ�������ԱȽϲ�����ʱ�临�Ӷ�ΪO(n^2)��������
 * �Ƚϴ�������Ҫ�ѱȽϹ��̵Ĵ�С��ϵ����������
 * 
 * ����ѡ������Ҳ��Ϊ���������������˼���ǽ���Ҫ�Ƚϵ�n��Ԫ������
 * ���бȽ�ѡ���Ƚ�С��Ԫ�أ�Ȼ���ٶԱȽϺ��n/2��Ԫ�ؽ��������Ƚ�ѡ��
 * ��С��Ԫ�أ������˶���ֱ��ѡ����С��Ԫ�أ��˹��̿�����һ������������ʾ
 * ����ʱ�ùؼ���Ϊnull�Ľڵ㲹����ѡ������СԪ�ؾ���������ĸ��ڵ㣬Ȼ��
 * ����С�ؼ�������Ӧ��Ҷ�ӽڵ�Ĺؼ�����null�����棬Ȼ��Ӹ�Ҷ�ڵ㿪ʼ
 * �����ֵܽڵ���бȽϣ��޸ĸ�Ҷ�ӽڵ㵽���ڵ��·���ϸ��ڵ��ֵ������ڵ�
 * ��ֵ����Ϊ��Сֵ��
 * 
 * �㷨����
 * �������������������������Ϊh��������ѡ�������У�������С�ؼ��֣���ѡ����������С�Ĺؼ���
 * ������һ����Ҷ�ӽڵ㵽���ڵ�ıȽϵĹ��̣��Ҿ���Ƚ�h-1�ο���֤������n��Ҷ�ӽڵ����ȫ
 * �����������h=[log2n]+1,���������ѡ�������У�ÿѡ��һ����С�Ĺؼ�����Ҫ����[log2n]
 * �αȽϣ�������ʱ�临�Ӷ�ΪO(nlog2n)�ƶ������������Ƚϴ��������ܵ��㷨ʱ�临�Ӷ�ΪO(nlog2n)
 * ���������Ƚ����˱Ƚϴ�����������������������n-1������Ĵ洢�ռ����м�ıȽϽ����
 * 
 * ���ȶ�����
 * */
public class TreeSelectDemo {

	
	public static void main(String[] args) {
		Object[] obj = new Object[]{49,38,65,97,76,13,27,49,54,04};
		treeSelectSort(obj);
		System.out.println("�����Ϊ"+Arrays.toString(obj));
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void treeSelectSort(Object[] a){  
		int len = a.length;
		int treeSize = 2 * len - 1; //��ȫ�������Ľڵ���
		int low = 0;
		Object[] tree = new Object[treeSize];  //��ʱ�����洢�ռ�
		//�ɺ���ǰ��������������0��ʼ
		for(int i = len-1,j=0 ;i >= 0; --i,j++){  //���Ҷ�ӽڵ�
			tree[treeSize-1-j] = a[i];
		}

		for(int i = treeSize-1;i>0;i-=2){ //�����ն˽ڵ�
			tree[(i-1)/2] = ((Comparable)tree[i-1]).compareTo(tree[i]) < 0 ? tree[i-1]:tree[i];
		}

		//����������С�ڵ�
		int minIndex;
		while(low < len){
			Object min = tree[0];
			//��Сֵ
			a[low++] = min;
			minIndex = treeSize-1;

			//�ҵ���Сֵ������
			while(((Comparable)tree[minIndex]).compareTo(min)!=0){
				minIndex--;
			}
			tree[minIndex] = Integer.MAX_VALUE;
			//����һ�����ֵ��־
			//�ҵ����ֵܽڵ�
			while(minIndex > 0){
				//����仹�и��ڵ�
				if(minIndex % 2 == 0){
					//������ҽڵ�
					tree[(minIndex-1)/2] = ((Comparable)tree[minIndex-1]).compareTo(tree[minIndex])

							< 0 ? tree[minIndex-1]:tree[minIndex];
							minIndex = (minIndex-1)/2;
				}else{
					//�������ڵ�
					tree[minIndex/2] = ((Comparable)tree[minIndex]).compareTo(tree[minIndex+1])
							< 0 ? tree[minIndex]:tree[minIndex+1];
							minIndex = minIndex/2;
				}
			}

		}
	}


}

