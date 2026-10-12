# Picerija
Programma paredzēta picērijas pasūtījumu saglabāšanai.
Izvēloties pasūtījuma izveidotšanu, lietotājam jāievada visi dati par pasūtījumu.

Programma pieņem ka visas uzkodas, dzērieni piedevas, uzkodas un mērces maksā vienādi (piem. 2 uzkodas maksā vienādi, bet uzkodām un dzērieniem var būt dažādas cenas).

Lai aprēķinātu picas cenu, picas piedevas un mērces tiek aprēķinātas un sareizinātas ar picas lielumu un picas lieluma/piedevuCenas koeficentu:
`picasCena = (katrasPiedevasCena*(double)piedevas.length + katrasMercesCena*(double)merces.length)*lielums*cenasLielumaKoef;`

Dati tiek saglabāti failā - `C:\\Users\\2PT\\Documents\\2PTFolder\\picaDati.txt`
