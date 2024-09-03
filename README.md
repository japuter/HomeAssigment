Answer the Following Questions:

a. assertArrayEquals metodi varmistaa että kaksi taulukkoa ovat yhtä suuret. Vertaa taulukoiden elementtejä ja tarkistaa että ne on samat koon kuin sisällön suhteen. *Yksidimensionaaliset taulukot: Tarkistaa, että molemmilla taulukoilla on sama pituus ja että jokainen vastaava elementti taulukossa on sama. *Monidimensionaaliset taulukot: tarkistaa, että kaikki ulkotaulut ja niiden sisälllöt ovat rekursiivisesti.

b. assertArrayEquals epäonnistuu ja se heittää assertion virheen. Virhe ilmoitus kertoo tarkalleen missä kohtaaa taulukot eroavat.

c. assertArrayEquals tarkastaa ensin, että ulkotaulut ovat saman pituiset - sitten se vertaa rekursiivisesti jokaisen sisätaulukon kokoa ja sisältöä. -'Kaikkien ulkoisten ja sisäisten taulukkojen täytyy olla täysin samat, jotta taulukot katsotaan yht suuriksi.