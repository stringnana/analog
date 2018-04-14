/*

Kelompok 3 :

H1051161015 Adhetya Putra Perdana
H1051161055 Kristiana Ria Winarti
H1051171037 Krisna Madani
H1051171001 Neneng Suriati
H1051171055 Linda
H1051171013 Hendrawan
H1051171061 Melina Aulia Sari #Berhenti

*/

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] data = {43, 11, 38, 50, 25};
		int i, j, sisipan;
		for(i=0; i<data.length; i++){ 
			System.out.print(data[i]+" ");
		}
		for(i=1; i<data.length; i++)
		{
			sisipan = data[i];
			j = i;
			while((j>0) && (data[j-1] > sisipan))
			{
				data[j] = data[j-1]; 
				j--; 
			}
			data[j] = sisipan; 
		}
		for(i=0; i<data.length; i++){ 
			System.out.print(data[i]+" ");
		}
	}
}
