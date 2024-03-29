package sample;

        import java.util.Arrays;
        import java.util.List;

public class DictionaryDeutsch {
    private String[][] dictionary = {
            {"backen", "bäckt", "buk", "hat gebacken", "печь"},
            {"befehlen", "befiehlt", "befahl", "hat befohlen", "приказывать"},
            {"beginnen", "beginnt", "begann", "hat begonnen", "начинать"},
            {"beißen", "beißt", "biß", "hat gebissen", "кусать"},
            {"bergen", "birgt", "barg", "hat geborgen", "спасать"},
            {"bersten", "birst", "barst", "ist geborsten", "лопнуть"},
            {"biegen", "biegt", "bog", "hat gebogen", "гнуть"},
            {"bieten", "bietet", "bot", "hat geboten", "предлогать"},
            {"binden", "bindet", "band", "hat gebunden", "связывать"},
            {"bitten", "bittet", "bat", "hat gebeten", "просить"},
            {"blasen", "bläst", "blies", "hat geblasen", "дуть"},
            {"bleiben", "bleibt", "blieb", "ist geblieben", "оставаться"},
            {"braten", "brät", "briet", "hat gebraten", "жарить"},
            {"brechen", "bricht", "brach", "hat/ist gebrochen", "ломать"},
            {"brennen", "brent", "brante", "hat gebrannt", "гореть"},
            {"bringen", "bringt", "brachte", "hat gebracht", "приносить"},
            {"denken", "denkt", "dachte", "hat gedacht", "думать"},
            {"dreschen", "drischt", "drosch", "hat gedroschen", "молотить"},
            {"dringen", "dringt", "drang", "hat/ist gedrungen", "проникать"},
            {"dürfen", "darf", "durfte", "hat gedurft", "мочь"},
            {"empfangen", "empfängt", "empfing", "hat empfangen", "принимать"},
            {"empfehlen", "empfiehlt", "empfahl", "hat empfohlen", "рекомендовать"},
            {"erlöschen", "erlischt", "erlosch", "ist erloschen", "потухать"},
            {"erschrecken", "erschrickt", "erschrak", "ist erschrocken", "пугаться"},
            {"essen", "isst", "aß", "hat gegessen", "есть"},
            {"fahren", "fährt", "fuhr", "hat/ist gefahren", "ехать"},
            {"fallen", "fällt", "fiel", "ist gefallen", "падать"},
            {"fangen", "fängt", "fing", "hat gefangen", "ловить"},
            {"fechten", "ficht", "focht", "hat gefochten", "фехтовать"},
            {"finden", "findet", "fand", "hat gefunden", "находить"},
            {"flechten", "flicht", "flocht", "hat geflochten", "плести"},
            {"fliegen", "fliegt", "flog", "hat/ist geflogen", "летать"},
            {"fliehen", "flieht", "floh", "ist geflohen", "убегать"},
            {"fließen", "fließt", "floss", "ist geflossen", "течь"},
            {"fressen", "frisst", "fraß", "hat gefressen", "жрать"},
            {"frieren", "friert", "fror", "hat gefroren", "замерзать"},
            {"gären", "gärt", "gor", "ist gegoren", "бродить"},
            {"gebären", "gebärt/gebiert", "gebar", "hat/ist geboren", "родить"},
            {"geben", "gibt", "gab", "hat gegeben", "давать"},
            {"gedeihen", "gedeiht", "gedieh", "ist gediehen", "расти, преуспевать"},
            {"gehen", "geht", "ging", "ist gegangen", "идти"},
            {"gelingen", "gelingt", "gelang", "ist gelungen", "удаваться"},
            {"gelten", "gilt", "galt", "hat gegolten", "стоить, цениться"},
            {"genesen", "genest", "genas", "ist genesen", "выздоравливать"},
            {"genießen", "genießt", "genoss", "hat genossen", "наслождаться"},
            {"geschehen", "geschieht", "geschah", "ist geschehen", "происходить"},
            {"gewinnen", "gewinnt", "gewann", "hat gewonnen", "выигрывать"},
            {"gießen", "gießt", "goss", "hat gegossen", "лить"},
            {"gleichen", "gleicht", "glich", "hat geglichen", "выравнивать"},
            {"gleiten", "gleitet", "glitt", "ist geglitten", "скользить"},
            {"graben", "gräbt", "grub", "hat gegraben", "копать"},
            {"greifen", "greift", "griff", "hat gegriffen", "браться (за что-либо)"},
            {"haben", "hat", "hatte", "hat gehabt", "иметь"},
            {"halten", "hält", "hielt", "hat gehalten", "держать"},
            {"hängen", "hängt", "hing", "hat gehangen", "висеть"},
            {"hauen", "haut", "haute/hieb", "hat/ist gehauen", "рубить"},
            {"heben", "hebt", "hob", "hat gehoben", "поднимать"},
            {"heißen", "heißt", "hieß", "hat geheißen", "называться"},
            {"helfen", "hilft", "half", "hat geholfen", "помогать"},
            {"kennen", "kennt", "kannte", "hat gekannt", "знать"},
            {"klingen", "klingt", "klang", "hat geklungen", "звенеть"},
            {"kneifen", "kneift", "kniff", "hat gekniffen", "щипать"},
            {"kommen", "kommt", "kam", "ist gekommen", "приходить"},
            {"können", "kann", "konnte", "hat gekonnt", "мочь"},
            {"kriechen", "kriecht", "kroch", "ist gekrochen", "ползать"},
            {"laden", "lädt", "lud", "hat geladen", "грузить"},
            {"lassen", "lässt", "ließ", "hat gelassen", "позволять"},
            {"laufen", "läuft", "lief", "ist gelaufen", "бегать"},
            {"leiden", "leidet", "litt", "hat gelitten", "страдать"},
            {"leihen", "leiht", "lieh", "hat geliehen", "одалживать"},
            {"lesen", "liest", "las", "hat gelesen", "читать"},
            {"liegen", "liegt", "lag", "hat gelegen", "лежать"},
            {"löschen", "löscht", "losch", "hat geloschen", "тушить, стирать"},
            {"lügen", "lügt", "log", "hat gelogen", "лгать"},
            {"mahlen", "mahlt", "mahlte", "hat gemahlen", "молоть"},
            {"meiden", "meidet", "mied", "hat gemieden", "избегать"},
            {"melken", "melkt", "melkte", "hat gemolken/gemelkt", "доить"},
            {"messen", "misst", "maß", "hat gemessen", "измерять"},
            {"mißlingen", "mißlingt", "mißlang", "ist mißlungen", "не удаваться"},
            {"mögen", "mag", "mochte", "hat gemocht", "нравиться"},
            {"müssen", "muss", "musste", "hat gemusst", "должен"},
            {"nehmen", "nimmt", "nahm", "hat genommen", "брать"},
            {"nehmen", "nimmt", "nahm", "hat genommen", "называть"},
            {"pfeifen", "pfeift", "pfiff", "hat gepfiffen", "свистеть"},
            {"preisen", "preist", "pries", "hat gepriesen", "хвалить"},
            {"quellen", "quillt", "quoll", "ist gequollen", "бить ключом"},
            {"raten", "rät", "riet", "hat geraten", "советовать"},
            {"reiben", "reibt", "rieb", "hat gerieben", "тереть"},
            {"reißen", "reißt", "riss", "hat/ist gerissen", "рвать"},
            {"reiten", "reitet", "ritt", "hat/ist geritten", "ездить верхом"},
            {"rennen", "rennt", "rannte", "ist gerannt", "бежать"},
            {"riechen", "riecht", "roch", "hat gerochen", "нюхать"},
            {"ringen", "ringt", "rang", "hat gerungen", "бороться"},
            {"rinnen", "rinnt", "rann", "ist geronnen", "течь"},
            {"rufen", "ruft", "rief", "hat gerufen", "кричать, звать"},
            {"salzen", "salzt", "salzte", "hat gesalzen/gesalz", "солить"},
            {"saufen", "säuft", "soff", "hat gesoffen", "пьянить"},
            {"saugen", "saugt", "sog/saugte", "hat gesogen/gesaugt", "сосать"},
            {"schaffen", "schafft", "schuf", "hat geschaffen", "создавать, создавать"},
            {"scheiden", "scheidet", "schied", "hat/ist geschieden", "разделять, разводится"},
            {"scheinen", "scheint", "schien", "hat geschienen", "светить, сиять"},
            {"schelten", "schilt", "schalt", "hat gescholten", "бранить"},
            {"scheren", "schiert", "schor", "hat geschoren", "стричь"},
            {"schieben", "schiebt", "schob", "hat geschoben", "двигать, толкать"},
            {"schießen", "schießt", "schoss", "hat geschossen", "стрелять"},
            {"schlafen", "schläft", "schlief", "hat geschlafen", "спать"},
            {"schlagen", "schlägt", "schlug", "hat geschlagen", "бить"},
            {"schleichen", "schleicht", "schlich", "ist geschlichen", "красться"},
            {"schleifen", "schleift", "schliff", "hat geschliffen", "точить"},
            {"schließen", "schließt", "schloss", "hat geschlossen", "закрывать"},
            {"schlingen", "schlingt", "schlang", "hat geschlungen", "обвивать"},
            {"schmeißen", "schmeißt", "schmiss", "hat geschmissen", "кидать, бросать"},
            {"schmelzen", "schmilzt", "schmolz", "hat/ist geschmolzen", "таять"},
            {"schneiden", "schneidet", "schnitt", "hat geschnitten", "резать"},
            {"schreiben", "schreibt", "schrieb", "hat geschrieben", "писать"},
            {"schreien", "schreit", "schrie", "hat geschrien", "кричать"},
            {"schreiten", "schreitet", "schritt", "ist geschritten", "шагать"},
            {"schweigen", "schweigt", "schwieg", "hat geschwiegen", "молчать"},
            {"schwellen", "schwillt", "schwoll", "ist geschwollen", "пухнуть"},
            {"schwimmen", "schwimmt", "schwamm", "ist geschwommen", "плавать"},
            {"schwinden", "schwindet", "schwand", "ist geschwunden", "убывать, исчезать"},
            {"schwingen", "schwingt", "schwang", "hat geschwungen", "махать, размахивать"},
            {"schwören", "schwört", "schwor/schwur", "hat geschworen", "клясться"},
            {"sehen", "sieht", "sah", "hat gesehen", "смотреть"},
            {"sein", "ist", "war", "ist gewesen", "быть"},
            {"senden", "sendet", "sandte", "hat gesand", "посылать, отправлять"},
            {"singen", "singt", "sang", "hat gesungen", "петь"},
            {"sinken", "sinkt", "sank", "ist gesunken", "опускаться, погружаться"},
            {"sinnen", "sinnt", "sann", "hat gesonnen", "думать, размышлять"},
            {"sitzen", "sitzt", "saß", "hat gesessen", "сидеть"},
            {"sollen", "soll", "sollte", "hat gesollt", "долженствовать"},
            {"speien", "speit", "spie", "hat gespien", "выплёвывать"},
            {"spinnen", "spinnt", "spann", "hat gesponnen", "прясть"},
            {"sprechen", "spricht", "sprach", "hat gesprochen", "говорить"},
            {"sprießen", "sprießt", "spross", "ist gesprossen", "пускать ростки, почки"},
            {"springen", "springt", "sprang", "ist gesprungen", "прыгать, скакать"},
            {"stechen", "sticht", "stach", "hat gestochen", "колоть"},
            {"stehen", "steht", "stand", "hat gestanden", "стоять, находиться"},
            {"stehlen", "stiehlt", "stahl", "hat gestohlen", "воровать"},
            {"steigen", "steigt", "stieg", "ist gestiegen", "подниматься"},
            {"sterben", "stirbt", "starb", "ist gestorben", "умирать"},
            {"stinken", "stinkt", "stank", "hat gestunken", "вонять"},
            {"stoßen", "stößt", "stieß", "hat/ist gestoßen", "толкать"},
            {"streichen", "streicht", "strich", "hat gestrichen", "гладить"},
            {"streiten", "streitet", "stritt", "hat gestritten", "спорить"},
            {"tragen", "trägt", "trug", "hat getragen", "носить"},
            {"treffen", "trifft", "traf", "hat getroffen", "встречать"},
            {"treiben", "treibt", "trieb", "hat/ist getrieben", "гнать"},
            {"treten", "tritt", "trat", "hat/ist getreten", "ступать"},
            {"trinken", "trinkt", "trank", "hat getrunken", "пить"},
            {"trügen", "trügt", "trog", "hat getrogen", "обманывать"},
            {"tun", "tut", "tat", "hat getan", "делать"},
            {"verderben", "verdirbt", "verdarb", "hat/ist verdorben", "портить"},
            {"verdrießen", "verdrießt", "verdross", "hat verdrossen", "сердить, досаждать"},
            {"vergessen", "vergisst", "vergaß", "hat vergessen", "забывать"},
            {"verlieren", "verliert", "verlor", "hat verloren", "терять"},
            {"verzeihen", "verzeiht", "verzieh", "hat verziehen", "прощать"},
            {"wachsen", "wächst", "wuchs", "ist gewachsen", "расти"},
            {"wägen", "wägt", "wog", "hat gewogen", "взвешивать"},
            {"waschen", "wäscht", "wusch", "hat gewaschen", "мыть"},
            {"weichen", "weicht", "wich", "ist gewichen", "уклоняться, уворачиваться"},
            {"weisen", "weist", "wies", "hat gewiesen", "указывать"},
            {"wenden", "wendet", "wandte/wendete", "hat gewandt/gewendet", "поворачивать"},
            {"werben", "wirbt", "warb", "hat geworben", "рекламировать"},
            {"werden", "wird", "wurde", "ist geworden", "становиться"},
            {"werfen", "wirft", "warf", "hat geworfen", "кидать"},
            {"wiegen", "wiegt", "wog", "hat gewogen", "качать, весить"},
            {"winden", "windet", "wand", "hat gewunden", "мотать"},
            {"wissen", "weiß", "wusste", "hat gewusst", "знать"},
            {"wollen", "will", "wollte", "hat gewollt", "хотеть"},
            {"ziehen", "zieht", "zog", "hat/ist gezogen", "тащить"},
            {"zwingen", "zwingt", "zwang", "hat gezwungen", "принуждать"}
    };


    public String[][] getDictionary() {
        return dictionary;
    }
}
