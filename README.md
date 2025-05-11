# AntiVirusCTS
Trecute sunt vremurile în care pericolul suprem era să ți se fure parola de la yahoo... Astăzi,
atacurile vin din toate direcțiile: hackerii, malware, ransomware, rețelele Wi-Fi dubioase de la
mall și colegii care „accidental” îți instalează jocuri de pe site-uri shady. În acest haos digital,
apare pe scenă... familia Protopoparolescu, cunoscută pentru teoriile conspiraționiste și
pasiunea lor exagerată pentru securitate digitală.


![image](https://github.com/user-attachments/assets/87d336d5-63db-4182-886c-d4402ef071a4)




👓🔒🔑:

Acestia au reusit sa creeze o aplicatie care extrage cele mai importante date din pachetele
de retea si sa le stocheze cu ajutorul unei singure clase:

Au nevoie de ajutorul vostru pentru a crea o solutie firewall ce poate sa proceseze
secvential obiecte de tipul DataPackage si sa printeze in consola daca acesta este safe
sau unsafe.

Solutia trebuie sa proceseze fiecare field din DataPackage si in functie de criteriile stabilite,
sa afiseze mesajul de safe/unsafe

Procesarea se face in ordinea urmatoare:

se verifica prima data IP-ul sursa, apoi IP destinatie, protocolul, portul destinatie si
isPlainText

daca mesajul a fost identificat in orice moment ca fiind safe/unsafe acesta nu va fi
pasat mai departe



🤑💵💸

Reguli generale:

Code smells la care trebuie să fiți atenți:

daca in final acesta ramane in continuare ca fiind unknown, se va arunca o eroare
care sa descrie problema

Firewall-ul pare ca are succes! O multinationala doreste sa implementeze solutia voastra
in sistemul lor

Exista insa o mica problema, ei au deja o arhitectura facuta pentru un alt firewall (care este
cu mult mai slab decat al vostru bineinteles). Ar dori sa il inlocuiasca pe cel existent fara sa
creeze probleme in module...

Pentru a va ajuta, v-au trimis interfata cu care lucreaza firewall-ul actual
SOLID

Identificati corect solutiile/design pattern-urile care se pot aplica pentru a rezolva problema
clientului

Interfata CLI este optionala

Bloaters

Complicated ifs/switches

Unused fields

Divergent change / Shotgun surgery

Dispensable code

Feature envy

Inappropriate Intimacy

Message chain / Middle man
