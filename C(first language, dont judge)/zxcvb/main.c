#include <stdio.h>
#include <string.h>
void kaanna( char * mjono1, char * mjono2 );

int main( void ){

    char mjono1[6] = {"kissa"};
    char kopio[6];

    kaanna( kopio, mjono1 );
    printf("kopio on %s\n", kopio);

    return 0;
}

void kaanna( char * mjono1, char * mjono2 ){

    int i=0;
    int pituus = strlen(mjono2);

    for(i=0; i < pituus-1; i++){
        mjono1[i] = mjono2[ pituus - i];

   }}


