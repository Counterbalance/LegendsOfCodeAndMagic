# cg-brutaltester support for LegendsOfCodeAndMagic referee

## Building
`mvn package`
produces `target/legends-of-code-and-magic-1.0.jar`.

## Run 1 match
`java -jar -Dleague.level=4 legends-of-code-and-magic-1.0.jar -p1 "bot1.exe" -p2 "bot2.exe" -l ./logs/game1.json`

Add `-s` to start a webserver to watch the replay.

## Running with cg-brutaltester
```
java -jar path/to/cg-brutaltester-1.0.0-SNAPSHOT.jar \
  -r "java -jar -Dleague.level=4 -Dverbose.level=0 legends-of-code-and-magic-1.0.jar" \
  -p1 bot1.exe \
  -p2 bot2.exe \
  -t 1 \
  -n 4 \
  -v -l ./logs/
```

Note the `-Dverbose.level=0` argument for the referee: this is needed, otherwise brutaltester gets the wrong output from the referee.
