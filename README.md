TDDBC for Java with JUnit
====================================

これは、TDDBCのJava向けJUnitプロジェクトです。

## gradleを使う場合

### インストール(wrapperを使わない場合)
#### Mac, Unix
```bash
brew install gradle
または、
gvm install gradle
```
gvmについては、以下のURLを参考にしてインストールしてください
http://gvmtool.net/

#### Windows
以下のURLを参考にしてインストールしてください。
http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備
#### Mac, Unix
```bash
chmod +x gradlew
./gradlew -v
```

#### Windows
```bash
gradlew.bat -v
```
wrapperを利用する際は、以下のgradleコマンドを**gradlew**に置き換えて利用してください。

### プロジェクトの変換
#### for. IntelliJ IDEA
```bash
gradle idea
```
#### for. Eclipse
```bash
gradle eclipse
```

### テストの実行
```bash
gradle test
```

## mavenを使う場合
### インストール
#### Mac
```bash
brew install maven
```
#### Windows, Unix
以下のURLを参考にしてインストールしてください。
http://maven.apache.org/download.cgi#Installation

### プロジェクトの変換
#### for. IntelliJ IDEA
```bash
mvn idea:idea
```
#### for. Eclipse
```bash
mvn eclipse:eclipse
```

### テストの実行
```bash
mvn test
```
