# TDDBC for Java with JUnit5

これは、TDDBCのJava向けJUnitプロジェクトです。

## gradleを使う場合

### gradleのインストール(wrapperを使わない場合)

```bash
# Mac
$ brew install gradle
または、
$ sdk install gradle

# Unix
$ sdk install gradle
```
sdkについては、以下のURLを参考にしてインストールしてください

http://sdkman.io/

#### Windows
以下のURLを参考にしてインストールしてください。

http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備

gradleをインストールしない場合は、このプロジェクトをcloneしてから以下のコマンドを実行してください。

```bash
# Mac, Unix
$ chmod +x gradlew
$ ./gradlew -v

# Windows
$ gradlew.bat -v
```

wrapperを利用する際は、以下のgradleコマンドを **./gradlew** または **gradlew.bat** に置き換えて利用してください。

### プロジェクトの変換

```bash
# for. IntelliJ IDEA
$ gradle idea

# for. Eclipse
$ gradle eclipse
```

### テストの実行

```bash
$ gradle junitPlatformTest
```

### gradleによるJava Projectの作成(gradle 1.9以降)

gradleがインストールされている環境では、以下のコマンドを実行することで、Javaのプロジェクトを作成することが出来ます。

```bash
$ mkdir tddbc-java
$ cd tddbc-java
$ gradle init --type java-library
```

## mavenを使う場合
### インストール
```bash
# Mac
brew install maven
```
#### Windows, Unix
以下のURLを参考にしてインストールしてください。

http://maven.apache.org/download.cgi#Installation

### プロジェクトの変換
```bash
# for. IntelliJ IDEA
mvn idea:idea

# for. Eclipse
mvn eclipse:eclipse
mvn eclipse:configure-workspace -Declipse.workspace=/path/to/eclipse/workspace
```

### テストの実行
```bash
mvn test
```

## Gitpodを使う場合
[Gitpod](https://gitpod.io/)は無料で使えるブラウザ上で動作するエディタです（無料で使用できる時間には月毎に制限があるため、完全無料ではない）

Javaがインストール済み環境で、VSCodeライクなエディタが使用することができます。また、他のユーザーを招待して同時編集も可能なため、ペアプロ用途にも便利です。

以下のボタンからこのリポジトリの環境をGitpodで立ち上げて始めることが可能です。

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/tddbc/java_junit5)

Gitpod上でgitの操作も可能ですが、上記のボタンから開始した場合はTDDBCのリポジトリがremoteに設定された状態になります。自分のリポジトリとしてForkしてから始める場合は、`https://gitpod.io/#{自分のリポジトリのurl}`のurlからGitpodを立ち上げてください。

https://www.gitpod.io/docs/getting-started/

### テストの実行
1. `Ctrl + Shift + p`でコマンドパレットを呼び出す
2. `Task: Run Test Task...`を実行

`./gradlew junitPlatformTest`によるテストが実行されます

## その他

動作環境、IDE等については[Wiki](https://github.com/tddbc/java_junit/wiki)を参照してください。

## ライセンス
Apache License, Version 2.0です (詳しくはプロジェクト直下の LICENSE-2.0.txt をご覧ください)
