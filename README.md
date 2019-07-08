WI SuwiML project
=================


## Release process

### Tag and deploy
```bash
LAST_VERSION="$(git tag --list | tail -n 1)"
NEXT_VERSION="$(echo $LAST_VERSION | cut -d '.' -f 1-2).$(expr 1 + $(echo $LAST_VERSION | cut -d '.' -f 3))"
git tag -a -m "Create release $NEXT_VERSION" $NEXT_VERSION
./mvnw clean deploy -Psonatype-oss-release
git push origin --tags
```

### Publish artifacts
Find the staging repository in [Sonatype OSS](https://oss.sonatype.org/#stagingRepositories) and
close the repository when all artifacts from the deploy process are pushed to Sonatype. Release the
repository when all checks are passed. It can take a couple of hours before the artifacts become
available in [Maven Central](https://repo1.maven.org/maven2/io/codegen/wi/suwiml/) and can be found
using [MVNrepository](https://mvnrepository.com/artifact/io.codegen.wi.suwiml).
