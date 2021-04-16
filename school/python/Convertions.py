import os  # Libreria che permette di interfacciarsi con il sistema operativo
import time  # Libreria che permette di manipolare il tempo all'interno del progamma
import math  # Libreria che permette di utilizzare funzioni matematiche più avanzate


# --------------------------PADDING_4bit--------------------------------------------------------------------------------

def padding_4bit(binary):  # funzione di padding per arrivare a 4 bit
    while len(binary) < math.ceil(len(binary) / 4) * 4:
        binary.insert(0, 0)


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------PADDING_3bit--------------------------------------------------------------------------------

def padding_3bit(binary):  # funzione di padding per arrivare a 3 bit
    while len(binary) < math.ceil(len(binary) / 3) * 3:
        binary.insert(0, 0)


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------DEC2BIN (Dec > 0)---------------------------------------------------------------------------

def dec2bin(binary=[], decimal=0):
    while decimal != 0:  # Qui vengono registrati i valori dei resti, ottenuti dal metodo delle divisioni successive, in un'apposita lista, fintanto che decimal diverso da 0
        if decimal % 2 == 0:  # -Nel caso questo sia positivo, la sequenza di 0 e 1 è stampata in ordine di venuta
            binary.append(0)  # aggiunta del valore "0"
        else:
            binary.append(1)  # aggiunta del valore "1"
        decimal = decimal // 2  # Divisione procedurale per 2 del valore di decimal
    binary.reverse()  # Ribaltamento della lista
    return binary


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------DEC2BIN (Dec < 0)---------------------------------------------------------------------------

def dec2bin_negative(binary=[], decimal=0):
    while decimal != 0:  # Qui vengono registrati i valori dei resti, ottenuti dal metodo delle divisioni successive, in un'apposita lista, fintanto che decimal diverso da 0
        if decimal % 2 == 0:  # -Nel caso questo sia negativo, la sequenza di 0 e 1 è stampata in negativo
            binary.append(1)  # aggiunta del valore "1"
        else:
            binary.append(0)  # aggiunta del valore "0"
        decimal = decimal // 2  # Divisione procedurale per 2 del valore di decimal
    binary.reverse()  # Ribaltamento della lista
    n = 0  # N = Index di un valore all'interno della lista binary
    m = len(binary) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle potenze di 2)
    for i in binary:  # Qui viene convertito il numero da binario a decimale
        if binary[n] == 1:  # Controllo del valore in binary nella posizione n
            binary[n] = 2 ** m * 1
        else:
            binary[n] = 2 ** m * 0
        n += 1
        m -= 1
    decimal = sum(binary) + 1  # Somma dei valori di binary
    binary.clear()  # Svuotamento di binary
    binary = dec2bin(decimal=decimal)
    return binary


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------BIN2DEC-------------------------------------------------------------------------------------

def bin2dec():
    binary = str(input(
        "Inserisci un numero binario, io ti stampo su schermo il suo valore in decimale\n\n> "))  # Richiesta del valore di binary (stringhe = iterabili)
    binary = [int(i) for i in binary]  # Trasformazione di binary in una stringa di valori interi
    decimal = 0
    n = 0  # N = Index di un valore all'interno della lista binary
    m = len(binary) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle potenze di 2)
    for i in binary:  # Qui viene convertito il numero da binario a decimale
        if binary[n] == 1:  # Controllo del valore in binary nella posizione n
            binary[n] = 2 ** m * 1
        else:
            binary[n] = 2 ** m * 0
        n += 1
        m -= 1
        decimal = sum(binary)  # Somma dei valori di binary
    print("\n>", decimal, "\n")
    return binary


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------DEC2HEX-------------------------------------------------------------------------------------

def dec2hex():
    decimal = int(input("Inserisci un numero decimale, io ti stampo su schermo il suo valore in esadecimale\n\n> "))

    def dec2bin(binary=[], decimal=decimal):
        while decimal != 0:  # Qui vengono registrati i valori dei resti, ottenuti dal metodo delle divisioni successive, in un'apposita lista, fintanto che decimal diverso da 0
            if decimal % 2 == 0:  # -Nel caso questo sia positivo, la sequenza di 0 e 1 è stampata in ordine di venuta
                binary.append(0)  # aggiunta del valore "0"
            else:
                binary.append(1)  # aggiunta del valore "1"
            decimal = decimal // 2  # Divisione procedurale per 2 del valore di decimal
        binary.reverse()  # Ribaltamento della lista
        return binary

    binary = dec2bin()

    def bin2hex(binary):
        n = 0  # N = Index di un valore all'interno della lista binary
        m = len(binary) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle potenze di 2)
        for i in binary:  # Qui viene convertito il numero da binario a decimale
            if binary[n] == 1:  # Controllo del valore in binary nella posizione n
                binary[n] = 2 ** m * 1
            else:
                binary[n] = 2 ** m * 0
            n += 1
            m -= 1
        hexadec = sum(binary)  # Somma dei valori di binary
        x = ["A", "B", "C", "D", "E", "F"]
        y = list(range(10, hexadec + 1))
        if hexadec > 9:
            hexadec = x[len(y) - 1]
        print(hexadec, end="")

    print()
    print("> ", end="")
    k = 4
    j = 0
    x = 0
    while x < len(binary) / 4:
        if len(binary) % 4 != 0:
            padding_4bit(binary)
        x += 1
        bin2hex(binary[j:k])
        k += 4
        j += 4


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------BIN2HEX-------------------------------------------------------------------------------------

def bin2hex():
    binary = str(input(
        "Inserisci un numero binario, io ti stampo su schermo il suo valore in esadecimale\n\n> "))  # Richiesta del valore di binary (stringhe = iterabili)
    binary = [int(i) for i in binary]  # Trasformazione di binary in una stringa di valori interi

    def bin2hex_4bit(p):
        n = 0  # N = Index di un valore all'interno della lista binary
        m = len(p) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle potenze di 2)
        for i in p:  # Qui viene convertito il numero da binario a decimale
            if p[n] == 1:  # Controllo del valore in binary nella posizione n
                p[n] = 2 ** m * 1
            else:
                p[n] = 2 ** m * 0
            n += 1
            m -= 1
        hexadec = sum(p)  # Somma dei valori di binary
        x = ["A", "B", "C", "D", "E", "F"]
        y = list(range(10, hexadec + 1))
        if hexadec > 9:
            hexadec = x[len(y) - 1]
        print(hexadec, end="")

    k = 4
    j = 0
    x = 0
    print()
    print("> 0x", end="")
    while x < len(binary) / 4:
        if len(binary) % 4 != 0:
            padding_4bit(binary)
        x += 1
        bin2hex_4bit(binary[j:k])
        k += 4
        j += 4


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------DEC2OCT-------------------------------------------------------------------------------------
def dec2oct():
    decimal = int(input("Inserisci un numero decimale, io ti stampo su schermo il suo valore in ottale\n\n> "))

    def dec2bin(binary=[], decimal=decimal):
        while decimal != 0:  # Qui vengono registrati i valori dei resti, ottenuti dal 	metodo delle divisioni successive, in un'apposita lista, fintanto che decimal 	diverso da 0
            if decimal % 2 == 0:  # -Nel caso questo sia positivo, la sequenza di 0 e 1 è 	stampata in ordine di venuta
                binary.append(0)  # aggiunta del valore "0"
            else:
                binary.append(1)  # aggiunta del valore "1"
            decimal = decimal // 2  # Divisione procedurale per 2 del valore di decimal
        binary.reverse()  # Ribaltamento della lista
        return binary

    binary = dec2bin()

    def bin2oct_3bit(binary):
        n = 0  # N = Index di un valore all'interno della lista binary
        m = len(binary) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle 	potenze di 2)
        for i in binary:  # Qui viene convertito il numero da binario a decimale
            if binary[n] == 1:  # Controllo del valore in binary nella posizione n
                binary[n] = 2 ** m * 1
            else:
                binary[n] = 2 ** m * 0
            n += 1
            m -= 1
        hexadec = sum(binary)  # Somma dei valori di binary
        print(hexadec, end="")

    print()
    print("> ", end="")
    k = 3
    j = 0
    x = 0
    while x < len(binary) / 3:
        if len(binary) % 3 != 0:
            padding_3bit(binary)
        x += 1
        bin2oct_3bit(binary[j:k])
        k += 3
        j += 3


# ----------------------------END---------------------------------------------------------------------------------------

# --------------------------BIN2OCT-------------------------------------------------------------------------------------

def bin2oct():
    binary = str(input(
        "Inserisci un numero binario, io ti stampo su schermo il suo valore in ottale\n\n> "))  # Richiesta del valore di binary (stringhe = iterabili)
    binary = [int(i) for i in binary]  # Trasformazione di binary in una stringa di valori interi

    def bin2oct_3bit(binary):
        n = 0  # N = Index di un valore all'interno della lista binary
        m = len(binary) - 1  # M = Lunghezza_Lista - 1 (utile per il calcolo delle potenze di 2)
        for i in binary:  # Qui viene convertito il numero da binario a decimale
            if binary[n] == 1:  # Controllo del valore in binary nella posizione n
                binary[n] = 2 ** m * 1
            else:
                binary[n] = 2 ** m * 0
            n += 1
            m -= 1
        octal = sum(binary)  # Somma dei valori di binary
        print(octal, end="")

    print()
    print("> ", end="")
    k = 3
    j = 0
    x = 0
    while x < len(binary) / 3:
        if len(binary) % 3 != 0:
            padding_3bit(binary)
        x += 1
        bin2oct_3bit(binary[j:k])
        k += 3
        j += 3


# ----------------------------END---------------------------------------------------------------------------------------

clear = lambda: os.system("cls")  # Funzione lambda che permette di ripulire lo schermo

while True:
    try:
        x = int(input(
            "Scegliere la base del numero che vuoi andare a convertire (inserire il numero tra parentesi per selezionare):\n(1) Decimale\n(2) Binario\n(3) Esadecimale\n(4) Ottale\n\n> "))
    except ValueError:
        print("\nHai inserito un valore non accettato, prego, ritenta")
        time.sleep(2)
        clear()
        continue
    break

time.sleep(.5)
clear()

while True:
    try:
        y = int(input(
            "Scegliere la base che vuoi utilizzare per convertire il numero (inserire il numero tra parentesi per selezionare):\n(1) Decimale\n(2) Binario\n(3) Esadecimale\n(4) Ottale\n\n> "))
    except ValueError:
        print("\nHai inserito un valore non accettato, prego, ritenta")
        time.sleep(2)
        clear()
        continue
    break

time.sleep(.5)
clear()

if x == y:  # Controllo dei numeri convertiti nelle stesse basi di partenza
    print("Un numero convertito da base x a base x, rimarrà sempre invariato")

elif x == 1 and y == 2:  # Controllo della conversione dec2bin
    decimal = int(input("Inserisci un numero decimale, io ti stampo su schermo il suo valore in binario\n\n> "))
    if decimal < 0:
        decimal = decimal * -1
        binary = dec2bin_negative(decimal=decimal)
        binary = "".join(str(elem) for elem in binary)
        print("\n>", binary, "\n")
    else:
        binary = dec2bin(decimal=decimal)
        binary = ''.join([str(elem) for elem in binary])
        print("\n>", binary)
elif x == 1 and y == 3:
    dec2hex()

elif x == 1 and y == 4:
    dec2oct()

elif x == 2 and y == 1:
    bin2dec()

elif x == 2 and y == 3:  # Controlle delle conversioni ancora non fatte. Animazioni by Domenichini Filippo (il concetto di flush)
    bin2hex()

elif x == 2 and y == 4:
    bin2oct()

else:
    print("Working Progress", end="", flush=True)
    time.sleep(.5)
    print(".", end="", flush=True)
    time.sleep(.5)
    print(".", end="", flush=True)
    time.sleep(.5)
    print(".")

# DONE: (1,2) (DEC > 0 in case (1,3) (1,4)) (2,1) (2,3) (2,4) + (GUI)
# TODO: (3,1) (3,2) (3,4) (4,1) (4,2) (4,3) (DEC < 0 in case (1,3) (1,4))
