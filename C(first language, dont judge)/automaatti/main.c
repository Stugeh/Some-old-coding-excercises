#include <stdio.h>
#include <stdlib.h>



  void otto (){
     printf ("\n\n\n ollaan otto funktiossa\n\n\n");
  return;
  }



  void liittyma (){
     printf ("\n\n\n ollaan liittyman lataus funktiossa\n\n\n");
  return;
  }

  void saldo (){
     printf ("\n\n\n ollaan saldo funktiossa\n\n\n");
  return;
  }


  void tapahtumat ()
  {
     printf ("\n\n\n ollaan tapahtumat funktiossa\n\n\n");
  return;
  }




int main (void)
{
    char syote = 0;

    printf (" d=otto\n e=liittyman lataus\n f=saldo\n h=tapahtumat\n");
    scanf("%c",&syote);

       switch (syote){
       case 'd':
           otto();
       break;


       case 'e':
           liittyma();
       break;


       case 'f':
           saldo();
       break;


       case 'h':
           tapahtumat();
       break;



       }
    return 0;
       }



