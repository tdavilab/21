FROM iron/java:1.8

ADD target/21-container.jar \
    target/dependency/* \
    /test/lib/

ADD src/main/resources/* \
    /test/features/

ENTRYPOINT java -ea -cp "/test/lib/*" cucumber.api.cli.Main --glue StepDefinition /test/features/
