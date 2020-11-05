

##Run

Firstly

```
mvn gwt:codeserver -pl *-client -am
```

... and then

```
mvn jetty:run -pl *-server -am -Denv=dev
```

