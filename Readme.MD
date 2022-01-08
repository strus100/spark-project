Konfiguracja lokalnego środowiska

Używaj javy w wersji 1.8 - NIE NOWSZEJ!
Przenieś zawartość folderów google do C:\

Koniecznie muszą się znaleźć w:
System.setProperty("hadoop.home.dir", "C:\\Hadoop")
System.setProperty("spark.home.dir", "C:\\Spark")

Uruchom polecenie mvn clean install

Gotowe możesz uruchomić projekt, sprawdź czy SprakSessionTest działa
