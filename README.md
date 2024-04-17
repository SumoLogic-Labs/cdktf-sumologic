# cdktf-sumologic


## Releasing new version
1. Make sure you have credentials to https://oss.sonatype.org/index.html
2. Can import and verify the signing key:
```
gpg --import ~/Desktop/api.private.key
gpg-agent --daemon
touch a
gpg --use-agent --sign a
gpg -k
```
3. Have nexus and signing credentials in ~/.gradle/gradle.properties
```
nexus_username=sumoapi
nexus_password=${sumoapi_password_for_sonatype_nexus}
signing.gnupg.executable=gpg
signing.gnupg.keyName=${id_of_imported_sumoapi_key}
signing.gnupg.passphrase=${password_for_imported_sumoapi_key}
```
4. Update the version in `lib/build.gradle`, make sure the Terraform
provider version is the suffix.
5. `./gradlew build publish`
6. Go to https://oss.sonatype.org/index.html#stagingRepositories, search for com.sumologic, close and release your repo. NOTE: If you had to login, reload the URL. It doesn't take you to the right page post-login.
7. Commit and push all the changes.



