kotlin + spring boot で REST API
=================================

## Usage
- tomcatを立ち上げて`http://localhost:8080/`にアクセス出来るようにする

```
gradle bootRun
```

#### うまくいかない時
- 起動中のtomcatを見つける

```
ps aux | grep tomcat
```

- 起動中のtomcatのプロセスを強制終了する

```
kill (target_pid)
```

- 再起動する


## kotlin
- `http://localhost:8080/hello`にアクセス
  - `Hello kotlin`の出力（OK）

- `http://localhost:8080/hello/service`にアクセス
  - `Hello Service`の出力（OK）

- `http://localhost:8080/hello/repo/1`にアクセス
  - `Hello mysql`の出力（予定）

## gradle
- `Hello gradle`の出力（OK）

```
gradle hello
```
