#include <stdio.h>
#include <stdlib.h>

#include <stdio.h>
#include <stdlib.h>


int n;
int i = 0;
int max = 0;
int paikka;

int main()
{
    printf("syota lukujen maara\n\n");
    scanf("%d", &n);
    int taulukko[n];

    while (i < n) {
        printf("\n\nsyota kokonaisluku #%d:\n",(i+1));
        scanf("%d",(&taulukko[i]));
        i++;
    }

    i = 0;

    while (i < n) {

        if (max < taulukko[i])
        max = taulukko[i];
        i++;}

    while (i > 0){
        if (taulukko[i] == max)
            paikka = i + 1;
            i--;
        }
  printf("\nsyotetyista luvuista suurin on: %d\n\n",max);
  printf("paikalla: %d\n\n", paikka);
return 0;
}

