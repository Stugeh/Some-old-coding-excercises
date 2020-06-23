#include <stdio.h>
#include <stdlib.h>

int jako_algoritmi ();
int jako_algoritmi2();

int main()
{
char syote;
   printf("a = 20e          b = 40e \nc = 50e          d = 60e \ne = 70e          f = 80e \ng = 90e          h = 100-1000e\n\n");
     scanf("%c",&syote);

      switch (syote){

        case 'a':
        printf("\n1 x 20e\n\n");
        break;

        case 'b':
        printf("\2 x 20e\n\n");
        break;

        case 'c':
        printf("\n1 x 50e\n\n");
        break;

        case 'd':
        printf("\3 x 20e\n\n");
        break;

        case 'e':
        printf("\n1 x 50e ja 1 x 20e\n\n");
        break;

        case 'f':
        printf("\4 x 20e\n\n");
        break;

        case 'g':
        printf("\n1 x 50e ja 2 x 20e\n\n");
        break;

        case 'h':
        jako_algoritmi();
        break;
        }
    return 0;
}

int jako_algoritmi (){
   int syot_summa;
   int tuloste50 = 0;
   int tuloste20 = 0;
   int jakjaan50;
   int jakjaan20;
   int jakjaan10;
   int muuttuja1;
   int muuttuja2;

   printf("\n\nSyota haluamasi summa 100 ja 1 000 euron valilta.\n\n      HUOM!! SUMMAN TAYTYY OLLA TASAKYMMENIA\n\n");
     scanf("%d",&syot_summa);

   if (syot_summa > 1000){
    printf("\nNostoraja on 1000 euroa.\n\n");
    return 0;
   }
   if (syot_summa < 100){
    printf("\nSumman taytyy olla suurempi kuin 100 euroa.\n\n");
    return 0;
   }

   muuttuja1 = syot_summa;
   jakjaan10 = muuttuja1 %= 10;

   if (jakjaan10 != 0){
    printf("\nSyotetty luku ei ole tasakymmen.\n");
    return 0;
   }

   muuttuja1 = syot_summa;
   jakjaan50 = muuttuja1 %= 50;

    if (jakjaan50 == 0){
        tuloste50 = syot_summa / 50;
        printf("\n%d x 50 e.\n",tuloste50);
        return 0;
    }


    muuttuja1 = jakjaan50;
    jakjaan20 = muuttuja1 %= 20;

    if (jakjaan20 == 0){
        muuttuja2 = syot_summa - jakjaan20;
        tuloste50 = muuttuja2 / 50;
        tuloste20 = jakjaan50 / 20;
        printf("\n%d x 50e\n%d x 20e.\n",tuloste50,tuloste20);
        return 0;
    }

    if (jakjaan20 != 0){
        muuttuja2 = syot_summa - jakjaan20;
        muuttuja2 = muuttuja2 - 50;
        jakjaan20 = jakjaan20 + 50;
        tuloste50 = muuttuja2 / 50;
        tuloste20 = jakjaan20 / 20;
        printf("\n%d x 50e\n%d x 20e.\n",tuloste50,tuloste20);
    }

   return 0;
}


